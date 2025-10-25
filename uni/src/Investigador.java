public class Investigador extends PDI {

    public Investigador(String nome, String cc) {
        super(nome, cc, 35, 700); 
    }

    @Override
    public void mostrarInfo() {
        System.out.printf("Investigador: %s (CC: %s) - Salario: %.2f%n",
                getNome(), getCc(), calcularSalario() / 100.0);
    }
}
