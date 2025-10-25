public abstract class PDI extends Pessoal {
    private int horasSemana;
    private int valorHora; 

    public PDI(String nome, String cc, int horasSemana, int valorHora) {
        super(nome, cc);
        this.horasSemana = horasSemana;
        this.valorHora = valorHora;
    }

    @Override
    public int calcularSalario() {
        return horasSemana * valorHora * 4;
    }
}
