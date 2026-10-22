package src;

public class Chapter10ProcessAndThreads {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("현재 프로세스 PID: " + ProcessHandle.current().pid());

        Thread worker = new Thread(() -> {
            System.out.println("작업 스레드: " + Thread.currentThread().getName());
        }, "worker-1");

        worker.start(); // 새로운 실행 흐름 시작
        worker.join();  // 작업 스레드가 끝날 때까지 대기
        System.out.println("메인 스레드 종료");
    }
}
