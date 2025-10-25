public abstract class Percussao extends Instrumento {

    public Percussao(String nome) {
        super(nome);
    }

    @Override
    public String tocar(String nota) {
        return "O/A " + getNome() + " tocou a (nota " + nota + ")";
    }
}
