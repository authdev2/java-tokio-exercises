

public class Circulo extends Forma2D {
    private int raio;
    private final double PI = Math.PI;
    public Circulo(int x, int y, int raio) {
        super(x, y);
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public int EditRaio(int newRaio) {
        this.raio = newRaio;
        return raio;
    }

    public double area() {
        return PI * (raio * raio);
    }
}
