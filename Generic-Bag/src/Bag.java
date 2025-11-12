import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class Bag<T> {
    private List<T> items;
    private Random random;  
    
    public Bag() {
        this.items = new ArrayList<>();
        this.random = new Random();
    }

    public void add(T item) {
        this.items.add(item);
    }

    public void addAll(Collection<T> items) {
        this.items.addAll(items);
    }

    public void clear() {
        this.items.clear();
    }

    public boolean contains(T item) {
        return this.items.contains(item);
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    public int size() {
        return this.items.size();
    }

    public T take() {
        if (this.items.isEmpty()) {
            return null;
        }
        int index = this.random.nextInt(this.items.size());
        return this.items.remove(index);
    }
}
