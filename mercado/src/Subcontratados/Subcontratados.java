package Subcontratados;
import Funcionario.Funcionario;


public class Subcontratados extends Funcionario{

    private String especialidade;

    public Subcontratados(String nome, String apelido, int numeroIdentificacao, String morada, String telefone,
                          int numSegurancaSocial, double salario, String turno, String especialidade) {
        super(nome, apelido, numeroIdentificacao, morada, telefone, numSegurancaSocial, salario, turno);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Especialidade: " + especialidade;
    }
}
