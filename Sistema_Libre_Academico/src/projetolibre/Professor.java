package projetolibre;

//ESSA CLASSE CRIADA REPRESENTA UM PROFESSOR QUE TAMBEM É UM USUÁRIO. 
//ELE HERDA OS MÉTODOS E ATRIBUTOS DA CLASSE USUÁRIO.

public class Professor extends Usuarios {
	
//O USO DE MÉTODO CONSTRUTOR.

	public Professor(String nome, String matricula, String cpf, String email) {
		super(nome, matricula, "Professor", cpf, email);
	}
	
	// SOBREESCRITA- FAZ PARTE DO POLIMORFISMO.
	@Override
	public String apresentar() {
	    return "Olá, tudo bem, me chamo " + getNome() + ", matrícula " + getMatricula() + ".";
	}
}
