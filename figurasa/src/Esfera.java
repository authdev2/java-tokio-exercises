public class Esfera extends Figura3D implements Forma3D, FormaCircular {
    private int raio;

    public Esfera(int x, int y, int z, int raio) {
        super(x, y, z);
        this.raio = raio;
    }

    @Override
    public void area() {
        double area = 4 * Math.PI * raio * raio;
        System.out.println("Area da Esfera: " + area);
    }

    @Override
    public void volume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        System.out.println("Volume da Esfera: " + volume);
    }

    @Override
    public int getRaio() {
        return raio;
    }
    
}
