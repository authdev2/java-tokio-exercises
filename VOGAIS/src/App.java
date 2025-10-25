public class App {
    public static void main(String[] args) throws Exception {
        String frase = "Flavio Gomes";
        Vogais vogais = new Vogais();
        System.out.println("Total de vogais na frase: " + vogais.contarVogais(frase));
    }
}
