package projetolibre;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe principal do sistema de biblioteca academica.
 * Gerencia o menu de opcoes, cadastros, consultas, emprestimos e devolucoes.
 */
public class Main {

	/** Colecao de livros cadastrados no acervo. */
	static ArrayList<Livros> acervo = new ArrayList<>();

	/** Colecao de usuarios cadastrados no sistema. */
	static ArrayList<Usuarios> usuarios = new ArrayList<>();

	/** Colecao de registros de emprestimos ativos e finalizados. */
	static ArrayList<Emprestimos> emprestimos = new ArrayList<>();

	/** Leitor de entrada do usuario via terminal. */
	static Scanner sc = new Scanner(System.in);

	/**
	 * Ponto de entrada principal da aplicacao.
	 * 
	 * @param args Argumentos de linha de comando.
	 */
	public static void main(String[] args) {
		int opcao;

		do {
			System.out.println("\n======================================");
			System.out.println("||        BIBLIOTECA ACADEMICA       ||");
			System.out.println("======================================");
			System.out.println("|| [1] Cadastrar livro               ||");
			System.out.println("|| [2] Cadastrar usuario             ||");
			System.out.println("|| [3] Listar livros                 ||");
			System.out.println("|| [4] Consultar disponibilidade     ||");
			System.out.println("|| [5] Realizar emprestimo           ||");
			System.out.println("|| [6] Realizar devolucao            ||");
			System.out.println("|| [0] Sair                          ||");
			System.out.println("======================================");
			System.out.print("Escolha uma opcao: ");

			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				cadastrarLivro();
				break;
			case 2:
				cadastrarUsuario();
				break;
			case 3:
				listarLivros();
				break;
			case 4:
				consultarDisponibilidade();
				break;
			case 5:
				realizarEmprestimo();
				break;
			case 6:
				realizarDevolucao();
				break;
			case 0:
				System.out.println("Saindo do sistema...");
				break;
			default:
				System.out.println("Opcao invalida. Tente novamente.");
			}
		} while (opcao != 0);
	}

	/**
	 * Cadastra um novo livro no acervo da biblioteca.
	 */
	public static void cadastrarLivro() {
		System.out.println("\n--- CADASTRAR LIVRO ---");
		System.out.print("Titulo: ");
		String titulo = sc.nextLine();
		System.out.print("Autor: ");
		String autor = sc.nextLine();
		System.out.print("ISBN: ");
		String isbn = sc.nextLine();
		System.out.print("Ano: ");
		int ano = sc.nextInt();
		sc.nextLine();
		System.out.print("Editora: ");
		String editora = sc.nextLine();

		Livros novoLivro = new Livros(titulo, autor, isbn, ano, editora);
		acervo.add(novoLivro);
		System.out.println("Livro cadastrado com sucesso!");
	}

	/**
	 * Cadastra um novo usuario (Aluno ou Professor) no sistema.
	 */
	public static void cadastrarUsuario() {
		System.out.println("\n--- CADASTRAR USUARIO ---");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Matricula: ");
		String matricula = sc.nextLine();
		System.out.print("CPF: ");
		String cpf = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();

		System.out.println("Tipo de Usuario:");
		System.out.println("1 - Aluno");
		System.out.println("2 - Professor");
		System.out.print("Opcao: ");
		int tipo = sc.nextInt();
		sc.nextLine();

		if (tipo == 1) {
			System.out.print("Curso: ");
			String curso = sc.nextLine();
			Usuarios novoAluno = new Aluno(nome, matricula, cpf, email, curso);
			usuarios.add(novoAluno);
			System.out.println("Aluno cadastrado com sucesso!");
		} else if (tipo == 2) {
			Usuarios novoProf = new Professor(nome, matricula, cpf, email);
			usuarios.add(novoProf);
			System.out.println("Professor cadastrado com sucesso!");
		} else {
			System.out.println("Tipo invalido!");
		}
	}

	/**
	 * Lista todos os livros cadastrados no acervo.
	 */
	public static void listarLivros() {
		System.out.println("\n--- LISTA DE LIVROS ---");
		if (acervo.isEmpty()) {
			System.out.println("Nenhum livro cadastrado.");
			return;
		}
		for (Livros l : acervo) {
			String statusStr = l.isDisponivel() ? "Disponivel" : "Emprestado";
			System.out.println("- " + l.getTitulo() + " (" + l.getAutor() + ") - Status: " + statusStr);
		}
	}

	/**
	 * Consulta a disponibilidade de um livro especifico pelo titulo.
	 */
	public static void consultarDisponibilidade() {
		System.out.println("\n--- CONSULTAR DISPONIBILIDADE ---");
		System.out.print("Digite o titulo do livro: ");
		String busca = sc.nextLine();

		boolean encontrado = false;
		for (Livros l : acervo) {
			if (l.getTitulo().equalsIgnoreCase(busca)) {
				encontrado = true;
				if (l.isDisponivel()) {
					System.out.println("O livro \"" + l.getTitulo() + "\" esta DISPONIVEL.");
				} else {
					System.out.println("O livro \"" + l.getTitulo() + "\" esta EMPRESTADO.");
				}
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Livro nao encontrado no acervo.");
		}
	}

	/**
	 * Realiza o emprestimo de um livro disponivel para um usuario cadastrado.
	 */
	public static void realizarEmprestimo() {
		System.out.println("\n--- REALIZAR EMPRESTIMO ---");
		System.out.print("Matricula do usuario: ");
		String mat = sc.nextLine();

		Usuarios user = null;
		for (Usuarios u : usuarios) {
			if (u.getMatricula().equalsIgnoreCase(mat)) {
				user = u;
				break;
			}
		}

		if (user == null) {
			System.out.println("Usuario nao encontrado.");
			return;
		}

		System.out.print("Titulo do livro: ");
		String tit = sc.nextLine();

		Livros liv = null;
		for (Livros l : acervo) {
			if (l.getTitulo().equalsIgnoreCase(tit)) {
				liv = l;
				break;
			}
		}

		if (liv == null) {
			System.out.println("Livro nao encontrado.");
			return;
		}

		if (!liv.isDisponivel()) {
			System.out.println("Livro indisponivel para emprestimo no momento.");
			return;
		}

		System.out.print("Data do emprestimo (DD/MM/AAAA): ");
		String data = sc.nextLine();

		liv.setDisponivel(false);
		Emprestimos emp = new Emprestimos(user, liv, data);
		emprestimos.add(emp);

		System.out.println("Emprestimo realizado com sucesso! ID: " + emp.getIdemprestimo());
	}

	/**
	 * Realiza a devolucao de um livro emprestado.
	 */
	public static void realizarDevolucao() {
		System.out.println("\n--- REALIZAR DEVOLUCAO ---");
		System.out.print("ID do emprestimo: ");
		int id = sc.nextInt();
		sc.nextLine();

		Emprestimos empEncontrado = null;
		for (Emprestimos e : emprestimos) {
			if (e.getIdemprestimo() == id && e.getStatus().equals("Ativo")) {
				empEncontrado = e;
				break;
			}
		}

		if (empEncontrado == null) {
			System.out.println("Emprestimo ativo nao encontrado com este ID.");
			return;
		}

		System.out.print("Data da devolucao (DD/MM/AAAA): ");
		String dataDev = sc.nextLine();

		empEncontrado.setDataDevolucao(dataDev);
		empEncontrado.setStatus("Devolvido");
		empEncontrado.getLivro().setDisponivel(true);

		System.out.println("Devolucao concluida com sucesso!");
	}
}
