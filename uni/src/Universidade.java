import java.util.ArrayList;

public class Universidade {
    private ArrayList<Pessoal> pessoal;

    public Universidade() {
        pessoal = new ArrayList<>();
    }

    public void adicionarPessoal(Pessoal p) {
        pessoal.add(p);
    }

    public void listarPessoal() {
        for (Pessoal p : pessoal) {
            p.mostrarInfo();
        }
    }

    public void calcularTotalGasto() {
        int total = 0;
        for (Pessoal p : pessoal) {
            total += p.calcularSalario();
        }
        System.out.printf("%nTotal gasto em salarios: %.2f%n", total / 100.0);
    }

    public static void main(String[] args) {
        Universidade uni = new Universidade();

        uni.adicionarPessoal(new Administrativo("Maria Silva", "12345678", 5));
        uni.adicionarPessoal(new Informatico("Joao Costa", "87654321", 10));
        uni.adicionarPessoal(new Professor("Ana Lopes", "11112222", 3));
        uni.adicionarPessoal(new Investigador("Pedro Gomes", "33334444"));

        uni.listarPessoal();
        uni.calcularTotalGasto();
    }
}
