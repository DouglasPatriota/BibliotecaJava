package projetolibre;

import java.util.ArrayList;
import java.util.Scanner;

// classe principal
// o menu, as operações, tudo fica aqui

public class Main {

    // nessas 3  listas que guardam tudo enquanto o programa tá rodando
    static ArrayList<Livros> acervo = new ArrayList<>();       // lista de livros
    static ArrayList<Usuarios> usuarios = new ArrayList<>();   // lista de usuarios
    static ArrayList<Emprestimos> emprestimos = new ArrayList<>(); // lista de emprestimos

    static Scanner sc = new Scanner(System.in); // le o que a gente digita

    public static void main(String[] args) {
        int opcao;

        // fica repetindo o menu até o usuário digitar 0
        do {
            System.out.println("\n╔══════════════════════════════════════╗");
            System.out.println("║        BIBLIOTECA ACADEMICA          ║");
            System.out.println("╠══════════════════════════════════════╣");
            System.out.println("║  [1] Cadastrar livro                 ║");
            System.out.println("║  [2] Cadastrar usuario               ║");
            System.out.println("║  [3] Listar livros                   ║");
            System.out.println("║  [4] Consultar disponibilidade       ║");
            System.out.println("║  [5] Realizar emprestimo             ║");
            System.out.println("║  [6] Realizar devolucao              ║");
            System.out.println("║  [0] Sair                            ║");
            System.out.println("╚══════════════════════════════════════╝");
            System.out.print("  Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpa o "enter" que sobra após o nextInt

            // direciona para o método certo dependendo do que foi digitado
            switch (opcao) {
                case 1: cadastrarLivro(); break;
                case 2: cadastrarUsuario(); break;
                case 3: listarLivros(); break;
                case 4: consultarDisponibilidade(); break;
                case 5: realizarEmprestimo(); break;
                case 6: realizarDevolucao(); break;
                case 0: System.out.println("Encerrando..."); break;
                default: System.out.println("Opcao invalida!");
            }
        } while (opcao != 0);
    }

    // CADASTRO DE LIVRO
    // 
    // pede os dados do livro, cria o objeto e joga na lista
    static void cadastrarLivro() {
        System.out.println("\n--- Cadastrar Livro ---");
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

        // cria o livro e adiciona no acervo
        Livros livro = new Livros(titulo, autor, isbn, ano, editora);
        acervo.add(livro);
        System.out.println("Livro cadastrado com sucesso!");
    }

 
    // 2. CADASTRO DE USUARIO
    
    // pergunta se é aluno ou professor e cria o objeto certo
    // aqui entra o polimorfismo — apresentar() age diferente pra cada tipo
    static void cadastrarUsuario() {
        System.out.println("\n--- Cadastrar Usuario ---");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Matricula: ");
        String matricula = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Tipo (1 - Aluno / 2 - Professor): ");
        int tipo = sc.nextInt();
        sc.nextLine();

        if (tipo == 1) {
            usuarios.add(new Aluno(nome, matricula, cpf, email));
        } else if (tipo == 2) {
            usuarios.add(new Professor(nome, matricula, cpf, email));
        } else {
            System.out.println("Tipo invalido!");
            return;
        }

        // polimorfismo em ação — cada tipo responde diferente no apresentar
        Usuarios u = usuarios.get(usuarios.size() - 1);
        System.out.println(u.apresentar());
        System.out.println("Usuario cadastrado com sucesso!");
    }

    // LISTA DOS LIVROS
    // percorre a lista e imprime cada livro (usa o toString() da classe Livros)
    static void listarLivros() {
        System.out.println("\n--- Acervo de Livros ---");
        if (acervo.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
        for (Livros l : acervo) {
            System.out.println(l); // chama o toString() automaticamente
        }
    }

    // CONSULTA A LISTA SE DISPONIVEL
    // busca o livro pelo ISBN e mostra se tá disponível ou emprestado
    static void consultarDisponibilidade() {
        System.out.println("\n--- Consultar Disponibilidade ---");
        System.out.print("ISBN do livro: ");
        String isbn = sc.nextLine();

        for (Livros l : acervo) {
            if (l.getIsbn().equals(isbn)) {
                System.out.println(l.getTitulo() + " — " + (l.isDisponivel() ? "Disponivel" : "Emprestado"));
                return;
            }
        }
        System.out.println("Livro nao encontrado.");
    }

    //  REALIZA O EMPRESTIMO
    // busca o usuario e o livro, verifica se tá disponível e registra o emprestimo
    static void realizarEmprestimo() {
        System.out.println("\n--- Realizar Emprestimo ---");

        // procura o usuario pela matricula
        System.out.print("Matricula do usuario: ");
        String matricula = sc.nextLine();
        Usuarios usuarioEncontrado = null;
        for (Usuarios u : usuarios) {
            if (u.getMatricula().equals(matricula)) {
                usuarioEncontrado = u;
                break;
            }
        }
        if (usuarioEncontrado == null) {
            System.out.println("Usuario nao encontrado.");
            return;
        }

        // procura o livro pelo ISBN
        System.out.print("ISBN do livro: ");
        String isbn = sc.nextLine();
        Livros livroEncontrado = null;
        for (Livros l : acervo) {
            if (l.getIsbn().equals(isbn)) {
                livroEncontrado = l;
                break;
            }
        }
        if (livroEncontrado == null) {
            System.out.println("Livro nao encontrado.");
            return;
        }

        // verifica se o livro tá disponível antes de emprestar
        if (!livroEncontrado.isDisponivel()) {
            System.out.println("Livro indisponivel para emprestimo.");
            return;
        }

        System.out.print("Data do emprestimo (dd/mm/aaaa): ");
        String data = sc.nextLine();

        // marca o livro como indisponível e registra o emprestimo
        livroEncontrado.setDisponivel(false);
        Emprestimos emp = new Emprestimos(usuarioEncontrado, livroEncontrado, data);
        emprestimos.add(emp);
        System.out.println("Emprestimo #" + emp.getIdemprestimo() + " realizado com sucesso!");
    }

    // FAZ A DEVOLUCAO
    // busca o emprestimo pelo número, atualiza o status e libera o livro
    static void realizarDevolucao() {
        System.out.println("\n--- Realizar Devolucao ---");
        System.out.print("Numero do emprestimo: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Emprestimos e : emprestimos) {
            if (e.getIdemprestimo() == id) {

                // evita devolver algo que já foi devolvido
                if (e.getStatus().equals("Devolvido")) {
                    System.out.println("Este emprestimo ja foi devolvido.");
                    return;
                }

                System.out.print("Data de devolucao (dd/mm/aaaa): ");
                String dataDev = sc.nextLine();

                // atualiza o emprestimo e libera o livro no acervo
                e.setStatus("Devolvido");
                e.setDataDevolucao(dataDev);
                e.getLivro().setDisponivel(true);
                System.out.println("Devolucao registrada com sucesso!");
                return;
            }
        }
        System.out.println("Emprestimo nao encontrado.");
    }
}