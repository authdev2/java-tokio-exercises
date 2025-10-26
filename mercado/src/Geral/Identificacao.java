package Geral;

public class Identificacao {
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
    public String getApelido() {
        return apelido;
    }
    public int getNumeroIdentificacao() {
        return numeroIdentificacao;
    }
    public String getMorada() {
        return morada;
    }
    public String getTelefone() {
        return telefone;
    }
}
