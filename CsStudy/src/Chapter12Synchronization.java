package src;

public class Chapter12Synchronization {
    private static int count = 0;

    private static synchronized void increment() {
        count++; // 읽기 → 더하기 → 쓰기를 하나의 임계 구역으로 보호
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 100_000; i++) increment();
        };

        Thread a = new Thread(task);
        Thread b = new Thread(task);
        a.start();
        b.start();
        a.join();
        b.join();

        System.out.println("최종 값: " + count); // 200000
    }
}
