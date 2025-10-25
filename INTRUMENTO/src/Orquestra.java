import java.util.List;
import java.util.ArrayList;

public class Orquestra {

    private List<Instrumento> instrumentos;

    public Orquestra() {
        this.instrumentos = new ArrayList<>();
    }

    public void adicionarInstrumento(Instrumento instrumento) {
        instrumentos.add(instrumento);
    }

    public String tocar(String nota){
        StringBuilder resultado = new StringBuilder();
        for (Instrumento instrumento : instrumentos) {
            resultado.append(instrumento.tocar(nota)).append("\n");
        }
        return resultado.toString();
    }
}
