public class Retangulo {
    private int base;
    private int altura;

    public Retangulo(int base, int altura) {
        this.base = Math.abs(base);
        this.altura = Math.abs(altura);
    }

    public Retangulo() {
        this.base = 1;
        this.altura = 2;

    }

    public void quadrado() {
        if (base == altura) {
            System.out.println("E um quadrado");
        } else {
            System.out.println("Nao e um quadrado");
        }
    }

    public int area() {
        return base * altura;
    }

    public int perimetro() {
        return 2 * (base + 2 * altura);
    }

    public int girar() {
        int valorAntigo = base;
        base = altura;
        altura = valorAntigo;
        System.out.println("Base invertida: " + base + " Altura: " + altura);
        return base;
    }
}
