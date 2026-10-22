package src;

public class Chapter13LockOrdering {
    private static final Object lockA = new Object();
    private static final Object lockB = new Object();

    private static void work(String name) {
        synchronized (lockA) { // 모든 스레드가 A → B 순서로 잠금
            synchronized (lockB) {
                System.out.println(name + " 작업 완료");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread first = new Thread(() -> work("첫 번째 스레드"));
        Thread second = new Thread(() -> work("두 번째 스레드"));
        first.start();
        second.start();
        first.join();
        second.join();
    }
}
