package Funcionario;

import Geral.Identificacao;

public class Funcionario extends Identificacao {
    private int numSegurancaSocial;
    private double salario;
    private String turno;

    public Funcionario(String nome, String apelido, int numeroIdentificacao, String morada, String telefone,
                       int numSegurancaSocial, double salario, String turno) {
        super(nome, apelido, numeroIdentificacao, morada, telefone);
        this.numSegurancaSocial = numSegurancaSocial;
        this.salario = salario;
        this.turno = turno;
    }

    public int getNumSegurancaSocial() {
        return numSegurancaSocial;
    }

    public void setNumSegurancaSocial(int numSegurancaSocial) {
        this.numSegurancaSocial = numSegurancaSocial;
    }

    public double getSalario() {
        if (turno != null && turno.equalsIgnoreCase("Noite")) {
            return salario + 150;
        }
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Número da Segurança Social: " + numSegurancaSocial + "\n" +
               "Salário: " + getSalario() + " euros\n" +
               "Turno: " + turno;
    }
}
