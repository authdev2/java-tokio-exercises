package Mercado;

import java.util.List;
import Funcionario.Funcionario;

public class Mercado {
    
    public void funcionariosMercado(List<Funcionario> funcionarios) {
        if (funcionarios == null || funcionarios.isEmpty()) {
            System.out.println("Não há funcionários para exibir.");
            return;
        }

        System.out.println("=== FUNCIONÁRIOS DO MERCADO ===\n");
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println("--- Funcionário " + (i + 1) + " ---");
            System.out.println(funcionarios.get(i).toString());
            System.out.println();
        }
    }
}
