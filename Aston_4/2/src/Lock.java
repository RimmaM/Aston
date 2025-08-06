public class Lock {
    static final Object slot = new Object();
    static boolean locked = false;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                synchronized (slot) {
                    while (!locked) {
                        try {
                            slot.wait();
                        } catch (Exception _) {}
                    }
                    System.out.println(Thread.currentThread().getName() + ": 1");
                    locked = false;
                    slot.notifyAll();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                synchronized (slot) {
                    while (locked) {
                        try{
                            slot.wait();
                        } catch (Exception _) {}
                    }
                    System.out.println(Thread.currentThread().getName() + ": 2 \n");
                    locked = true;
                    slot.notifyAll();
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
