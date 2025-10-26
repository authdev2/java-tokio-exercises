package Clientes;
import Geral.Identificacao;

public class Clientes extends Identificacao {

    private int codigoCliente;
    private int numCompras;

    public Clientes(String nome, String apelido, int numeroIdentificacao, String morada, String telefone, int codigoCliente, int numCompras) {
        super(nome, apelido, numeroIdentificacao, morada, telefone);
        this.codigoCliente = codigoCliente;
        this.numCompras = numCompras;
    }

    public void compra(){
        numCompras++;
        System.out.println("Compra realizada com sucesso!");
        if (numCompras % 100 == 0){
            System.out.println("Parabéns! Ganhou um desconto de 1%!");
        }
    }
    
}
