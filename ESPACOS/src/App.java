import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Digita a frase que queres: ");
        String frase = "Ola flavio tudo bem?";
        int espacosTotais = 0;
        for(int i = 0; i <= frase.length() - 1; i++){
            System.out.print(frase.charAt(i));

            if(frase.charAt(i) == ' '){
                espacosTotais++;
            }
        }

        System.out.println("\nA frase tem " + espacosTotais + " espacos.");
 
    }
}
