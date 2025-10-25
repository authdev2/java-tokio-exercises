public class Retangulo extends Figura implements Forma2D {
    private double largura;
    private double altura;

    public Retangulo(int x, int y, double largura, double altura) {
        super(x, y);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void area() {
        double area = largura * altura;
        System.out.println("Area do Retangulo: " + area);
    }

    @Override
    public void perimetro() {
        double perimetro = 2 * (largura + altura);
        System.out.println("Perimetro do Retangulo: " + perimetro);
    }
    
}
