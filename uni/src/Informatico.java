public class Informatico extends Pas {

    public Informatico(String nome, String cc, int horasExtras) {
        super(nome, cc, horasExtras, 40, 600);
    }

    @Override
    public void mostrarInfo() {
        System.out.printf("Informatico: %s (CC: %s) - Salario: %.2f%n",
                getNome(), getCc(), calcularSalario() / 100.0);
    }
}
