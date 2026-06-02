package projetolibre;


//ESSA CLASSE ABSTRATA REPRESENTA UM USUARIO NO SISTEMA, ONDE PODE SER UM ALUNO OU PROFESSOR
//POR MEIO DE HERANÇA. 

public abstract class Usuarios {
	private String nome;
	private String matricula;
	private String tipo;
	private String cpf;
	private String email;
	
	
	public Usuarios(String nome, String matricula, String tipo, String cpf, String email) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.tipo = tipo;
		this.cpf = cpf;
		this.email = email;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	//ISSO é o POLIMORFISMO.
	
	public String apresentar() {
	    return "Olá, sou " + getNome() + " e sou " + getTipo() + " desta instituição.";
	}
	
	//Override SIGNIFICA QUE ESTOU SOBREESCREVENDO O METODO DA CLASSE PAI.PARTE DE POLIMORFISMO.

	@Override
	public String toString() {
		 return "Nome: " + nome + " | Matrícula: " + matricula +
	               " | Tipo: " + tipo + " | CPF: " + cpf + " | Email: " + email;
	    }
	
	
	
	
}
