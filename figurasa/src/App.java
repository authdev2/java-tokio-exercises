public class App {
    public static void main(String[] args) throws Exception {        
        System.out.println("--- FIGURAS 2D ---");
        Forma2D retangulo = new Retangulo(0, 0, 5.0, 3.0);
        Forma2D circulo = new Circulo(2, 2, 4);
        
        System.out.println("--------RETANGULO--------");
        retangulo.area();
        retangulo.perimetro();
        
        System.out.println("--------CIRCULO--------");
        circulo.area();
        circulo.perimetro();
        
        System.out.println("\n--- FIGURAS 3D ---");
        Forma3D cubo = new Cubo(1, 1, 1, 3.0);
        Forma3D esfera = new Esfera(3, 3, 3, 5);
        
        System.out.println("--------CUBO--------");
        cubo.area();
        cubo.volume();
        
        System.out.println("--------ESFERA--------");
        esfera.area();
        esfera.volume();
        
    }
}
