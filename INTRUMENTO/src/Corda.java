public abstract class Corda extends Instrumento {

    public Corda(String nome) {
        super(nome);
    }

    public String vibrar(String nota) {
        return "O/A " + getNome() + " vibrou e tocou a (nota " + nota + ")";
    }

    @Override
    public String tocar(String nota) {
        return vibrar(nota);
    }
}
