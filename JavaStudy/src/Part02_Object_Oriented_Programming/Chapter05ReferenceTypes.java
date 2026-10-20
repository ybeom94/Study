package Part02_Object_Oriented_Programming;

/*
    Chapter 05. 참조 타입
 
    5.1 데이터 타입 분류
    - 기본형 변수는 값을, 참조형 변수는 객체 또는 배열을 가리키는 참조를 가진다.
    - Java는 포인터 연산을 직접 제공하지 않는다.
 
    5.2 메모리 사용 영역
    - JVM은 실행 중 클래스 정보, 스레드별 호출 스택, 객체가 배치되는 힙 등을 사용한다.
    - 지역 변수와 객체가 실제로 배치되는 방식은 JVM 구현·최적화의 영향을 받을 수 있다.
 
    5.3 참조 타입 변수의 ==, != 연산
    - 참조 변수의 ==와 !=는 두 참조가 동일한 객체를 가리키는지 비교한다.
    - 객체 내용 비교는 적절히 구현된 equals 메서드 등을 사용한다.
 
    5.4 null과 NullPointerException
    - null은 참조가 어떤 객체도 가리키지 않는 상태다.
    - null을 대상으로 인스턴스 필드나 메서드에 접근하면 NullPointerException이 발생할 수 있다.
 
    5.5 문자열(String) 타입
    - 문자열 리터럴은 문자열 상수 풀을 활용할 수 있다.
    - String은 불변이며 문자열 내용의 일치 여부는 equals로 비교한다.
 
    5.6 배열(Array) 타입
    - 배열은 같은 타입의 여러 요소를 저장하고 길이가 고정된다.
    - 인덱스는 0부터 시작하며 유효 범위를 벗어나면 ArrayIndexOutOfBoundsException이 발생한다.
 
    5.7 다차원 배열
    - 2차원 배열은 배열의 각 요소가 또 다른 배열을 참조하는 구조다.
    - 각 행의 길이가 다른 가변 배열도 생성할 수 있다.
 
    5.8 객체를 참조하는 배열
    - 참조형 배열의 각 칸에는 객체 참조 또는 null이 저장된다.
    - 객체 배열을 생성했다고 각 요소의 객체가 자동으로 만들어지는 것은 아니다.
 
    5.9 배열 복사
    - System.arraycopy 또는 Arrays.copyOf로 요소를 복사할 수 있다.
    - 참조형 요소는 기본적으로 참조가 복사되므로 참조하는 객체까지 깊게 복제되는 것은 아니다.
 
    5.10 향상된 for 문
    - for(타입 변수 : 배열)는 요소를 순서대로 읽을 때 편리하다.
    - 인덱스를 직접 제공하지 않으며 순회 변수에 새 값을 대입해도 기존 배열 요소가 교체되지는 않는다.
 
    5.11 main 메소드의 String[] 매개변수
    - main(String[] args)의 args는 실행 시 전달한 명령행 인수를 문자열 배열로 받는다.
    - 인수가 없으면 빈 배열일 수 있다.
 
    5.12 열거(Enum) 타입
    - enum은 가능한 상수 집합이 정해진 타입이다.
    - 각 상수는 해당 열거형의 인스턴스이며 values(), valueOf() 등을 사용할 수 있다.
 */

public class Chapter05ReferenceTypes {
    public static void main(String[] args) throws Exception {
        String one = new String("Java");
        String two = new String("Java");
        System.out.println(one == two);      // 참조 동일성: false
        System.out.println(one.equals(two)); // 내용 동등성: true
        int[] scores = {90, 80, 70};
        System.out.println(scores.length);
    }
}
