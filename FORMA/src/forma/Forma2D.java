public class Forma2D {
    private int x;
    private int y;
    public Forma2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public int EditX(int newX) {
        this.x = newX;
        return x;
    }

    public int EditY(int newY) {
        this.y = newY;
        return y;
    }
}
