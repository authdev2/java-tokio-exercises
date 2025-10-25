public abstract class Sopro extends Instrumento {

    public Sopro(String nome) {
        super(nome);
    }

    public String soprar(String nota) {
        return "O/A " + getNome() + " soprou e tocou a (nota " + nota + ")";
    }

    @Override
    public String tocar(String nota) {
        return soprar(nota);
    }
}
