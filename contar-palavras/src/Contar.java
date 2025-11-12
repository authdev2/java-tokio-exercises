import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Contar {

    private String palavra;

    public Contar(String palavra) {
        this.palavra = palavra;
    }

    public void contarPalavra(){

        Map<String, Integer> letras = new LinkedHashMap<>();
        String[] partes = palavra.split(" ");

        for(String parte : partes) {
            parte = parte.toLowerCase();

            if(letras.containsKey(parte)) {
                letras.put(parte, letras.get(parte) + 1);
            } else {
                letras.put(parte, 1);
            }
        }   
        List<Map.Entry<String, Integer>> lista = new ArrayList<>(letras.entrySet());
        lista.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        System.out.println(lista);
    }
}