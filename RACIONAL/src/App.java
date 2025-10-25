public class App {
    public static void main(String[] args) throws Exception {
        Racional r1 = new Racional(1, 2);
        Racional r2 = new Racional(3, 4);

        r1.soma(r2);
        System.out.println("Soma: " + r1);
        r1.subtracao(r2);
        System.out.println("Subtracao: " + r1);

        r1.multiplicacao(r2);
        System.out.println("Multiplicacao: " + r1);

        r1.divisao(r2);
        System.out.println("Divisao: " + r1); 

    }
}
