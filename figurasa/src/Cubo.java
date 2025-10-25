public class Cubo extends Figura3D implements Forma3D {
    private double lado;

    public Cubo(int x, int y, int z, double lado) {
        super(x, y, z);
        this.lado = lado;
    }

    @Override
    public void area() {
        double area = 6 * (Math.pow(lado, 2));
        System.out.println("Area do Cubo: " + area);
    }

    @Override
    public void volume() {
        double volume = Math.pow(lado, 3);
        System.out.println("Volume do Cubo: " + volume);
    }    
}
