package Part02_Object_Oriented_Programming;

/*
    Chapter 11. 예외 처리
 
    11.1 예외와 예외 클래스
    - 예외는 실행 도중 발생한 비정상 상황을 나타내는 Throwable 하위 객체다.
    - 검사 예외(checked)와 비검사 예외(RuntimeException 계열)를 구분한다.
 
    11.2 예외 처리 코드
    - try 블록의 예외를 catch에서 처리하고 finally에 정리 코드를 둘 수 있다.
    - catch를 지나치게 넓게 작성하면 오류 원인을 숨길 수 있다.
 
    11.3 예외 종류에 따른 처리
    - 서로 다른 예외에 각각 대응할 수 있고 다중 catch로 공통 처리를 할 수도 있다.
    - 상속 관계에서는 구체적인 예외를 상위 예외보다 먼저 처리한다.
 
    11.4 리소스 자동 닫기
    - try-with-resources는 AutoCloseable 자원을 try 선언부에 지정해 작업이 끝날 때 닫는다.
    - 예외가 발생해도 자원 반환을 시도하며 억제된 예외가 기록될 수 있다.
 
    11.5 예외 떠넘기기
    - throws는 메서드가 처리하지 않은 검사 예외 등을 호출자에게 알린다.
    - throw는 예외 객체를 직접 발생시킨다.
 
    11.6 사용자 정의 예외
    - 특정 상황을 표현하는 예외를 Exception 또는 RuntimeException 등을 상속해 정의할 수 있다.
    - 의미 있는 이름과 메시지로 원인을 명확히 전달한다.
 */

public class Chapter11ExceptionHandling {
    public static void main(String[] args) throws Exception {
        try {
            Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
        }
        // try-with-resources는 AutoCloseable 자원의 자동 반환에 사용한다.
    }
}
