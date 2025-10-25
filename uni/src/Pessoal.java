public abstract class Pessoal {
    private String nome;
    private String cc;

    public Pessoal(String nome, String cc) {
        this.nome = nome;
        this.cc = cc;
    }

    public String getNome() {
        return nome;
    }

    public String getCc() {
        return cc;
    }

    public abstract int calcularSalario(); 

    public abstract void mostrarInfo();

}
