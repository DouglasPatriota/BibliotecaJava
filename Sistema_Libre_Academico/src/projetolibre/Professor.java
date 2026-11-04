package projetolibre;

/**
 * Representa um professor no sistema academico, herdando atributos e metodos da classe Usuarios.
 */
public class Professor extends Usuarios {

	/**
	 * Construtor da classe Professor.
	 * 
	 * @param nome      Nome do professor.
	 * @param matricula Matricula do professor.
	 * @param cpf       CPF do professor.
	 * @param email     E-mail do professor.
	 */
	public Professor(String nome, String matricula, String cpf, String email) {
		super(nome, matricula, "Professor", cpf, email);
	}

	/**
	 * Sobreescrita do metodo de apresentacao do usuario (Polimorfismo).
	 * 
	 * @return Mensagem de apresentacao do professor.
	 */
	@Override
	public String apresentar() {
		return "Olá, tudo bem, me chamo " + getNome() + ", matricula " + getMatricula() + ".";
	}
}
