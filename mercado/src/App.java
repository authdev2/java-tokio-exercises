import Funcionario.Funcionario;
import Clientes.Clientes;
import Repositores.Repositores;
import Subcontratados.Subcontratados;
import Mercado.Mercado;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Clientes cliente1 = new Clientes("João", "Silva", 123456789, "Rua A, 123", "912345678", 1001, 250);
        System.out.println("=== CLIENTE ===");
        System.out.println(cliente1.toString());
        System.out.println();
        
        cliente1.compra();
        cliente1.compra();
        System.out.println("Número de compras após 2 compras: " + cliente1.getNumCompras());
        System.out.println("Desconto atual: " + cliente1.calcularDesconto() + "%");
        System.out.println();

        Funcionario funcionario1 = new Funcionario("Maria", "Santos", 987654321, "Rua B, 456", "923456789", 
                                                    111222333, 1000.0, "Manhã");
        Funcionario funcionario2 = new Funcionario("Pedro", "Costa", 555666777, "Rua C, 789", "934567890",
                                                    444555666, 1200.0, "Noite");
        
        System.out.println("=== FUNCIONÁRIO 1");
        System.out.println(funcionario1.toString());
        System.out.println();
        
        System.out.println("=== FUNCIONÁRIO 2");
        System.out.println(funcionario2.toString());
        System.out.println();

        Repositores repositor1 = new Repositores("Ana", "Oliveira", 111222333, "Rua D, 321", "945678901",
                                                  777888999, 1100.0, "Tarde");
        Repositores repositor2 = new Repositores("Carlos", "Martins", 444555666, "Rua E, 654", "956789012",
                                                  333444555, 1300.0, "Noite");
        
        System.out.println("=== REPOSITOR 1");
        System.out.println(repositor1.toString());
        System.out.println();
        
        System.out.println("=== REPOSITOR 2");
        System.out.println(repositor2.toString());
        System.out.println();

        Subcontratados subcontratado1 = new Subcontratados("Luísa", "Ferreira", 777888999, "Rua F, 987", "967890123",
                                                            222333444, 1050.0, "Manhã", "Talho");
        Subcontratados subcontratado2 = new Subcontratados("Ricardo", "Alves", 333444555, "Rua G, 147", "978901234",
                                                            666777888, 1150.0, "Noite", "Frutaria");
        
        System.out.println("=== SUBCONTRATADO 1");
        System.out.println(subcontratado1.toString());
        System.out.println();
        
        System.out.println("=== SUBCONTRATADO 2");
        System.out.println(subcontratado2.toString());
        System.out.println();

        Mercado mercado = new Mercado();
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(repositor1);
        funcionarios.add(repositor2);
        funcionarios.add(subcontratado1);
        funcionarios.add(subcontratado2);
        
        mercado.funcionariosMercado(funcionarios);
    }
}
