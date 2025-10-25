public class App {
    public static void main(String[] args) throws Exception {
        bag myBag = new bag(10);
        myBag.put("Machado");
        myBag.put("Faca");
        myBag.put("Telemovel");
        myBag.put("Radio");
        myBag.put("Corda");
        myBag.put("Chave");
        myBag.put("Lanterna");

        String removed = myBag.take();
        System.out.println("Removido: " + removed);

    }
}
