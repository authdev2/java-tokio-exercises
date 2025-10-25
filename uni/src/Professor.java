public class Professor extends PDI {
    private int sexenios; 

    public Professor(String nome, String cc, int sexenios) {
        super(nome, cc, 37, 800);
        this.sexenios = Math.min(sexenios, 6); 
    }

    @Override
    public int calcularSalario() {
        int salarioBase = super.calcularSalario();
        int bonus = sexenios * 10000; 
        return salarioBase + bonus;
    }

    @Override
    public void mostrarInfo() {
        System.out.printf("Professor: %s (CC: %s) - Sexenios: %d - Salario: %.2f%n",
                getNome(), getCc(), sexenios, calcularSalario() / 100.0);
    }
}
