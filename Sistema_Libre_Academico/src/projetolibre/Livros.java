package projetolibre;

/**
 * Representa um livro no sistema academico de biblioteca.
 */
public class Livros {
	private String titulo;
	private String autor;
	private String isbn;
	private int ano;
	private String editora;
	private boolean disponivel;

	/**
	 * Construtor da classe Livros.
	 * 
	 * @param titulo  Titulo do livro.
	 * @param autor   Autor do livro.
	 * @param isbn    Codigo ISBN do livro.
	 * @param ano     Ano de publicacao.
	 * @param editora Editora do livro.
	 */
	public Livros(String titulo, String autor, String isbn, int ano, String editora) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.ano = ano;
		this.editora = editora;
		this.disponivel = true;
	}

	/**
	 * Retorna o titulo do livro.
	 * 
	 * @return Titulo do livro.
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Define o titulo do livro.
	 * 
	 * @param titulo Novo titulo do livro.
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Retorna o autor do livro.
	 * 
	 * @return Autor do livro.
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Define o autor do livro.
	 * 
	 * @param autor Novo autor do livro.
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Retorna o ISBN do livro.
	 * 
	 * @return ISBN do livro.
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * Define o ISBN do livro.
	 * 
	 * @param isbn Novo ISBN do livro.
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * Retorna o ano de publicacao.
	 * 
	 * @return Ano de publicacao.
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * Define o ano de publicacao.
	 * 
	 * @param ano Novo ano de publicacao.
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}

	/**
	 * Retorna a editora do livro.
	 * 
	 * @return Editora do livro.
	 */
	public String getEditora() {
		return editora;
	}

	/**
	 * Define a editora do livro.
	 * 
	 * @param editora Nova editora do livro.
	 */
	public void setEditora(String editora) {
		this.editora = editora;
	}

	/**
	 * Verifica se o livro esta disponivel para emprestimo.
	 * 
	 * @return true se disponivel, false caso contrario.
	 */
	public boolean isDisponivel() {
		return disponivel;
	}

	/**
	 * Define a disponibilidade do livro.
	 * 
	 * @param disponivel Status de disponibilidade.
	 */
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
}
