import java.util.Random;

public class bag {
    private String[] items;
    private int size;
    private Random random;

    public bag(int capacity) {
        this.items = new String[capacity];
        this.size = 0;
        this.random = new Random();
    }

    public boolean put(String item) {
        if (size >= items.length) return false;
        items[size++] = item;
        System.out.println("Adiconado: " + item);
        return true;
    }

    public String take() {
        if (size == 0) return "Valor nulo";
        int idx = random.nextInt(size);
        String removed = items[idx];
        items[idx] = items[size - 1];
        size--;
        return removed;
    }
}

