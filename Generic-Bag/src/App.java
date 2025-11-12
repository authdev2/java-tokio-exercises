import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Bag<String> stringBag = new Bag<String>();
        stringBag.add("Olá");
        stringBag.add("Mundo");
        stringBag.add("Java");
        
        System.out.println("Tamanho da sacola: " + stringBag.size());
        System.out.println("Contém 'Java': " + stringBag.contains("Java"));
        System.out.println("Está vazia: " + stringBag.isEmpty());
        
        List<String> moreStrings = Arrays.asList("Flavio", "Gomes");
        stringBag.addAll(moreStrings);
        System.out.println("Tamanho após addAll: " + stringBag.size());
        
        System.out.println("Elemento removido: " + stringBag.take());
        System.out.println("Tamanho após removido: " + stringBag.size());        
    }
}
