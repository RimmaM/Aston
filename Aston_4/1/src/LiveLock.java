public class LiveLock {
    static final Object slot1 = new Object();
    static final Object slot2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (slot1) {
                System.out.println(Thread.currentThread().getName() + " захватил slot1");
                synchronized (slot2) {
                    System.out.println(Thread.currentThread().getName() + " захватил slot2");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (slot2) {
                System.out.println(Thread.currentThread().getName() + " захватил slot2");
                synchronized (slot1) {
                    System.out.println(Thread.currentThread().getName() + " захватил slot1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
