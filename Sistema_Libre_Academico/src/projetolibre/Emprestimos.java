package projetolibre;

/**
 * Representa o registro de emprestimo de um livro para um usuario no sistema.
 */
public class Emprestimos {
	private int idemprestimo;

	/**
	 * Objetos Usuarios e Livros vinculados ao emprestimo.
	 */
	private Usuarios usuario;
	private Livros livro;

	private String dataEmprestimo;
	private String dataDevolucao;
	private String status;

	private static int contadorId = 1;

	/**
	 * Construtor da classe Emprestimos.
	 * 
	 * @param usuario        Usuario que esta realizando o emprestimo.
	 * @param livro          Livro a ser emprestado.
	 * @param dataEmprestimo Data em que o emprestimo foi realizado.
	 */
	public Emprestimos(Usuarios usuario, Livros livro, String dataEmprestimo) {
		this.idemprestimo = contadorId++;
		this.usuario = usuario;
		this.livro = livro;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = null;
		this.status = "Ativo";
	}

	/**
	 * Metodos getters e setters para acesso aos atributos do emprestimo.
	 */
	public int getIdemprestimo() {
		return idemprestimo;
	}

	public void setIdemprestimo(int idemprestimo) {
		this.idemprestimo = idemprestimo;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	public Livros getLivro() {
		return livro;
	}

	public void setLivro(Livros livro) {
		this.livro = livro;
	}

	public String getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(String dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
