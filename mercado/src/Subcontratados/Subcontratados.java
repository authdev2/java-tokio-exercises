package Subcontratados;
import Funcionario.Funcionario;


public class Subcontratados extends Funcionario{

    private String especialidade;
    public Subcontratados(int numSegurancaSocial, double salario, String turno, String especialidade) {
        super(numSegurancaSocial, salario, turno);
        this.especialidade = especialidade;
    }
}
