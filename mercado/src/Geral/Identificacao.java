package Geral;

public abstract class Identificacao {
    private String nome;
    private String apelido;
    private int numeroIdentificacao;
    private String morada;
    private String telefone;

    public Identificacao(String nome, String apelido, int numeroIdentificacao, String morada, String telefone) {
        this.nome = nome;
        this.apelido = apelido;
        this.numeroIdentificacao = numeroIdentificacao;
        this.morada = morada;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(int numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
               "Apelido: " + apelido + "\n" +
               "Número de Identificação: " + numeroIdentificacao + "\n" +
               "Morada: " + morada + "\n" +
               "Telefone: " + telefone;
    }
}
