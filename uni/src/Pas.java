public abstract class Pas extends Pessoal {
    private int horasExtras; 
    private int horasSemana;
    private int valorHora; 

    public Pas(String nome, String cc, int horasExtras, int horasSemana, int valorHora) {
        super(nome, cc);
        this.horasExtras = horasExtras;
        this.horasSemana = horasSemana;
        this.valorHora = valorHora;
    }

    @Override
    public int calcularSalario() {
        int salarioBase = horasSemana * valorHora * 4;
        int extra = horasExtras * 600;
        return salarioBase + extra;
    }
}
