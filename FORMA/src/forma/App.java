public class App {
    public static void main(String[] args) throws Exception {
        Forma2D forma = new Forma2D(10, 20);
        Circulo circulo = new Circulo(15, 25, 5);
        System.out.println("X: " + forma.getX());
        System.out.println("Y: " + forma.getY());

        System.out.println("X do circulo: " + circulo.getX());
        System.out.println("Y do circulo: " + circulo.getY());
        System.out.println("Area do circulo: " + circulo.area());
    }
}
