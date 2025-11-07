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

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getNumCompras() {
        return numCompras;
    }

    public void setNumCompras(int numCompras) {
        this.numCompras = numCompras;
    }

    public void compra() {
        numCompras++;
        System.out.println("Compra realizada com sucesso!");
    }


    public double calcularDesconto() {
        return (numCompras / 100) * 1.0; 
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Código de Cliente: " + codigoCliente + "\n" +
               "Número de Compras: " + numCompras + "\n" +
               "Desconto: " + calcularDesconto() + "%";
    }
}
