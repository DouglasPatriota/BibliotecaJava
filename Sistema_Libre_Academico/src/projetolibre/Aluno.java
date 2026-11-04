package projetolibre;

/**
 * Classe que representa um Aluno, herdando atributos e métodos de Usuarios.
 */
public class Aluno extends Usuarios {

    /**
     * Construtor da classe Aluno.
     */
    public Aluno(String nome, String matricula, String cpf, String email) {
        super(nome, matricula, "Aluno", cpf, email);
    }

    /**
     * Retorna a apresentação das informações do Aluno.
     */
    @Override
    public String apresentar() {
        return "Olá, me chamo " + getNome() + ", matrícula " + getMatricula() + ".";
    }
}
