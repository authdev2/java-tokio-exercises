public class Circulo extends Figura implements Forma2D, FormaCircular {

    private int raio;
    public Circulo(int x, int y, int raio) {
        super(x, y);
        this.raio = raio;
    }
    
    @Override
    public int getRaio() {
        return raio;
    }

    @Override
    public void area() {
        double raio = getRaio();
        double area = Math.PI * raio * raio;
        System.out.println("Area do Circulo: " + area);
    }

    @Override
    public void perimetro() {
        double perimetro = 2 * Math.PI * getRaio();
        System.out.println("Perimetro do Circulo: " + perimetro);
    }
    
}
