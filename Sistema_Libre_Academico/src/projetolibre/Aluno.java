package projetolibre;

//ESSA CLASSE CRIADA REPRESENTA UM ALUNO, QUE TAMBEM É UM USUÁRIO. 
//ELE HERDA OS MÉTODOS E ATRIBUTOS DA CLASSE USUÁRIO.

public class Aluno extends Usuarios {

	public Aluno(String nome, String matricula, String cpf, String email) {
		super(nome, matricula, "Aluno", cpf, email);
	}
	
	@Override
	public String apresentar() {
	    return "Olá, me chamo " + getNome() + ", matrícula " + getMatricula() + ".";
	}
}
