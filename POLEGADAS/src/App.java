public class App {
    public static void main(String[] args) throws Exception {
        double polegadas = 39.37;
        int metro = 40;
        for (int i = 1; i <= metro; i++) {

            double conversao = i * polegadas;
            System.out.println(i + " metro(s) = " + conversao + " polegada(s)");

            if (i % 12 == 0) {
                System.out.println("--------------------------------------------------");
            }
        }
    }
}
