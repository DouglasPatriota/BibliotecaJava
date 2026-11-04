package projetolibre;

/**
 * Classe abstrata que representa um usuário no sistema (Aluno ou Professor por herança).
 */
public abstract class Usuarios {
    private String nome;
    private String matricula;
    private String tipo;
    private String cpf;
    private String email;

    /**
     * Construtor da classe Usuarios.
     */
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

    /**
     * Exibe as informações do usuário.
     */
    public void apresentar() {
        System.out.println("Nome: " + nome + ", Matrícula: " + matricula + ", Tipo: " + tipo + ", CPF: " + cpf + ", Email: " + email);
    }
}
