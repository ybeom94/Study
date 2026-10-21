package Part05_Modern_Java_Features;

/*
    Chapter 21. 자바 21에서 강화된 언어 및 라이브러리
 
    21.1 자바 21 버전에서 강화된 내용
    - 이 Chapter는 Java 21에서 사용할 수 있는 강화된 언어·라이브러리 기능을 다룬다.
    - 소개된 모든 기능이 21에서 처음 추가된 것은 아니므로 최초 도입 버전과 별개로 이해한다.
 
    21.2 로컬(지역) 변수 타입 추론
    - var는 초기화 식을 보고 지역 변수의 정적 타입을 추론한다.
    - var가 동적 타입을 뜻하지는 않으며 필드나 메서드 반환 타입 선언에 일반적으로 사용할 수 없다.
    - Java 10부터 제공한다.
 
    21.3 switch 문의 null 처리
    - 패턴 switch에서는 case null로 null 입력을 명시적으로 처리할 수 있다.
    - case null이 없으면 null 선택자 처리에서 예외가 발생할 수 있으므로 분기 완전성을 고려한다.
 
    21.4 switch 문의 패턴 매칭
    - case Integer n 등의 타입 패턴과 when 가드를 사용해 타입 검사와 분기를 결합한다.
    - 적용 순서와 패턴의 지배 관계, 빠짐없는 분기를 확인한다.
    - Java 21에서 정식 기능이다.
 
    21.5 레코드 패턴
    - 레코드 패턴은 record의 구성 요소를 타입 패턴으로 분해한다.
    - instanceof나 switch에서 활용할 수 있으며 Java 21에서 정식 기능이다.
 
    21.6 가상 스레드
    - 가상 스레드는 JVM이 관리하는 경량 스레드로 I/O 대기가 많은 동시 요청을 효율적으로 처리할 수 있다.
    - CPU 작업을 무조건 빠르게 만들지는 않으며 Java 21에서 정식 도입되었다.
 
    21.7 순차 컬렉션
    - SequencedCollection은 순서를 가진 컬렉션에서 getFirst/getLast/reversed 등 공통 연산을 제공한다.
    - SequencedSet/SequencedMap도 함께 도입되었으며 Java 21부터 제공한다.
 
    21.8 기본 문자셋 변경
    - Java 18부터 기본 문자셋이 UTF-8로 표준화되었다(일부 구현·환경의 예외 가능).
    - 파일·네트워크 입출력에서는 명시적 문자셋 지정이 가장 분명하다.
 */

public class Chapter21Java21Features {
    public static void main(String[] args) throws Exception {
        var language = "Java 21"; // 변수 타입은 String으로 추론됨
        Object value = 21;
        String result = switch (value) {
            case null -> "null";
            case Integer n when n > 0 -> "양의 정수 " + n;
            default -> "기타";
        };
        System.out.println(language + " / " + result);
        java.util.SequencedCollection<String> list = new java.util.ArrayList<>();
        list.add("A"); list.add("B");
        System.out.println(list.getFirst() + " / " + list.getLast());
    }
}
