public class App {
    public static void main(String[] args) throws Exception {
        Retangulo r1 = new Retangulo(-4, -5);
        r1.quadrado();


        System.out.println("Area: " + r1.area());
        System.out.println("Perimetro: " + r1.perimetro());
        r1.girar();
    }
}
