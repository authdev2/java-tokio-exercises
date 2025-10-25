public abstract class Instrumento {

    private String nome;

    public Instrumento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract String tocar(String nota);
}


