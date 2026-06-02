package projetolibre;

//CRIANDO A CLASSE EMPRESTIMOS, COM ATRIBUTOS PARA CONSULTAR DEPOIS. 
public class Emprestimos {
	private int idemprestimo;
	
	//ULTLIZADO OBJETO LIVROS E USUARIOS PARA ATRIBUTOS. 
	private Usuarios usuario;
	private Livros livro;
	
	
	private String dataEmprestimo;
	private String dataDevolucao;
	private String status;
	
	
	private static int contadorId = 1;
	
	//O USO DE MÉTODO CONSTRUTOR.
	
	public Emprestimos(Usuarios usuario, Livros livro, String dataEmprestimo) {
	    this.idemprestimo = contadorId++;
	    this.usuario = usuario;
	    this.livro = livro;
	    this.dataEmprestimo = dataEmprestimo;
	    this.dataDevolucao = null;
	    this.status = "Ativo";
	}

	//OS MÉTODOS GET E SET D
	
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

	public static int getContadorId() {
		return contadorId;
	}

	public static void setContadorId(int contadorId) {
		Emprestimos.contadorId = contadorId;
	}
	
// SOBREESCRITA- FAZ PARTE DO POLIMORFISMO.
	@Override
	    public String toString() {
	        return "Empréstimo #" + idemprestimo +
	               " | Usuário: " + usuario.getNome() +
	               " | Livro: " + livro.getTitulo() +
	               " | Data: " + dataEmprestimo +
	               " | Status: " + status;
	    }
	

}
