public class Deadlock {
    static final Object slot1 = new Object();
    static final Object slot2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (slot1) {
                System.out.println("Процесс 1: захватил slot1");
                synchronized (slot2) {
                    System.out.println("Процесс 2: захватил slot2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (slot2) {
                System.out.println("Процесс 1: захватил slot2");
                synchronized (slot1) {
                    System.out.println("Процесс 2: захватил slot1");
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}
