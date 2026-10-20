package Part03_Java_Libraries;

/*
    Chapter 14. 멀티 스레드
 
    14.1 멀티 스레드 개념
    - 스레드는 프로세스 안에서 실행 흐름을 나타낸다.
    - 여러 스레드는 힙의 객체를 공유할 수 있으므로 동시 접근 문제를 고려해야 한다.
 
    14.2 메인 스레드
    - main 메서드는 일반적으로 메인 스레드에서 시작한다.
    - 다른 스레드의 종료와 무관하게 메인 메서드가 끝날 수 있지만 JVM 종료 조건은 남은 사용자 스레드에 영향을 받는다.
 
    14.3 작업 스레드 생성과 실행
    - Thread 생성자에 Runnable을 전달하거나 Thread를 상속해 작업을 정의할 수 있다.
    - start()는 새 실행 흐름을 시작하고 run() 직접 호출은 일반 메서드 호출이다.
 
    14.4 스레드 이름
    - 스레드에 이름을 설정하고 getName 또는 Thread.currentThread로 확인할 수 있다.
    - 이름은 로깅과 디버깅에 도움이 된다.
 
    14.5 스레드 상태
    - 스레드는 NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED 등 상태를 가진다.
    - 상태는 스케줄링 상황에 따라 변한다.
 
    14.6 스레드 동기화
    - 공유 데이터를 여러 스레드가 갱신하면 경쟁 상태가 발생할 수 있다.
    - synchronized는 모니터 락을 사용하여 임계 영역의 동시 실행을 제한한다.
 
    14.7 스레드 안전 종료
    - Thread.stop은 안전하지 않으며 작업에 종료 신호를 전달하는 방식을 권장한다.
    - interrupt는 중단 요청을 나타내지만 즉시 스레드를 강제 종료하지 않는다.
 
    14.8 데몬 스레드
    - 데몬 스레드는 JVM이 사용자 스레드 종료 이후 프로그램을 끝내는 데 방해하지 않는다.
    - 반드시 마쳐야 하는 저장 작업을 데몬 스레드에만 맡기지 않는다.
 
    14.9 스레드풀
    - ExecutorService는 스레드 생성과 작업 제출을 분리한다.
    - submit의 Future로 완료 결과를 받을 수 있고 사용 후 shutdown 등으로 종료해야 한다.
 */

public class Chapter14Multithreading {
    public static void main(String[] args) throws Exception {
        Thread worker = new Thread(() -> System.out.println("작업 스레드"));
        worker.start(); // 새로운 스레드 시작
        worker.join();  // 현재 스레드에서 worker 종료를 기다림
    }
}
