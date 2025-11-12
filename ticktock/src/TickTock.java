public class TickTock {
    public static void main(String[] args) {
        Object lock = new Object();

        Thread tick = new Thread(() -> {
            try {
                while (true) {
                    synchronized (lock) {
                        System.out.println("Tick");
                        lock.notify();
                        lock.wait();
                    }
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread tock = new Thread(() -> {
            try {
                while (true) {
                    synchronized (lock) {
                        System.out.println("Tock");
                        lock.notify();
                        lock.wait();
                    }
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        tick.start();
        tock.start();
    }
}
