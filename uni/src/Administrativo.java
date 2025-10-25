public class Administrativo extends Pas {

    public Administrativo(String nome, String cc, int horasExtras) {
        super(nome, cc, horasExtras, 37, 750);
    }

    @Override
    public void mostrarInfo() {
        System.out.printf("Administrativo: %s (CC: %s) - Salario: %.2f%n",
                getNome(), getCc(), calcularSalario() / 100.0);
    }
}
