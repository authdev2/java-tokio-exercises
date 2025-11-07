package Repositores;

import Funcionario.Funcionario;

public class Repositores extends Funcionario {

    public Repositores(String nome, String apelido, int numeroIdentificacao, String morada, String telefone,
                       int numSegurancaSocial, double salario, String turno) {
        super(nome, apelido, numeroIdentificacao, morada, telefone, numSegurancaSocial, salario, turno);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

