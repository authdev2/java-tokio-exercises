public class NumeroComplexo {

    private final double a; 
    private final double b; 

    public NumeroComplexo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public static NumeroComplexo soma(NumeroComplexo n1, NumeroComplexo n2) {
        return new NumeroComplexo(n1.a + n2.a, n1.b + n2.b);
    }

    public static NumeroComplexo subtracao(NumeroComplexo n1, NumeroComplexo n2) {
        return new NumeroComplexo(n1.a - n2.a, n1.b - n2.b);
    }

    @Override
    public String toString() {
        if (b >= 0) {
            return a + " + " + b + "i";
        } else {
            return a + " - " + (-b) + "i";
        }
    }
}
