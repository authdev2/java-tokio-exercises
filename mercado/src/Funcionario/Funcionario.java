package Funcionario;

public class Funcionario {
    private int numSegurancaSocial;
    private double salario;
    private String turno;

    public Funcionario(int numSegurancaSocial, double salario, String turno) {
        this.numSegurancaSocial = numSegurancaSocial;
        this.salario = salario;
        this.turno = turno;
    }


    public int getNumSegurancaSocial() {
        return numSegurancaSocial;
    }

    public double getSalario() {
        return salario;
    }

    public String getTurno() {

        if (turno.equals("Noite")){
            salario += 150;
            return "Manhã";
        }
        return turno;
    }
}
