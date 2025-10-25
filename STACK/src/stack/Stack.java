public class Stack {
    private String[] items;
    private int size;
    public Stack() {
        this.items = new String[5];
        this.size = 0;
    }

    public void push(String item) {
        if (size >= items.length) {
            System.out.println("Pilha cheia");
            return;
        }
        items[size++] = item;
        System.out.println("Adicionado: " + item);
    }

    public void pop() {
        if (size == 0) {
            System.out.println("Pilha vazia");
            return;
        }
        String removed = items[size - 1];
        size--;
        System.out.println("\nRemovido: " + removed);
    }

    public void seePilha() {
        System.out.print("Pilha: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print("\n" + items[i]);
        }
    }
}
