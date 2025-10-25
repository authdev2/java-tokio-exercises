public class App {
    public static void main(String[] args) throws Exception {
        Stack pilha = new Stack();
        pilha.push("Prato fundo");
        pilha.push("Prato raso");
        pilha.push("Pires");

        pilha.seePilha();
        pilha.pop();
    }
}
