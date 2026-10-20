package Part03_Java_Libraries;

/*
    Chapter 12. java.base 모듈
 
    12.1 API 도큐먼트
    - Java API 문서는 클래스와 메서드의 용도, 매개변수, 반환값, 예외, 버전 정보를 제공한다.
    - 메서드를 사용할 때 동작 계약을 확인하는 기본 자료다.
 
    12.2 java.base 모듈
    - java.base는 java.lang, java.util, java.time 등 필수 패키지를 포함하는 기반 모듈이다.
    - 이름 있는 모듈은 이를 명시하지 않아도 읽을 수 있다.
 
    12.3 Object 클래스
    - 모든 클래스는 Object의 메서드를 상속한다.
    - equals와 hashCode는 논리적 동등성에 관한 계약이 있으므로 함께 적절히 재정의해야 한다.
 
    12.4 System 클래스
    - System.out/err/in은 표준 입출력 스트림이다.
    - currentTimeMillis, nanoTime, getProperty 등 시스템 관련 기능도 제공한다.
 
    12.5 문자열 클래스
    - String은 불변 문자열을 표현한다.
    - 반복 수정이나 조립에는 StringBuilder가 효율적일 수 있으며 각 문자열 메서드의 경계·인덱스를 확인한다.
 
    12.6 포장 클래스
    - Integer, Double 등은 기본형에 대응하는 객체 타입이다.
    - 오토박싱·언박싱을 지원하지만 null 언박싱은 예외를 일으킬 수 있다.
 
    12.7 수학 클래스
    - Math는 abs, max, min, sqrt 등 수학 함수를 제공한다.
    - 정수 오버플로우 검사는 Math.addExact처럼 별도 메서드가 필요한 경우가 있다.
 
    12.8 날짜와 시간 클래스
    - java.time의 LocalDate, LocalTime, LocalDateTime, ZonedDateTime 등은 목적에 따라 날짜·시간·시간대를 표현한다.
    - 대부분 불변 객체로 동작한다.
 
    12.9 형식 클래스
    - DecimalFormat, SimpleDateFormat 등은 숫자·날짜 표현 형식을 제어한다.
    - 새 코드에서는 날짜·시간에 DateTimeFormatter 사용을 우선 고려한다.
 
    12.10 정규 표현식 클래스
    - Pattern과 Matcher는 문자열의 규칙 검사와 검색에 사용한다.
    - Java 문자열 안에서 정규 표현식의 역슬래시는 이스케이프해야 할 수 있다.
 
    12.11 리플렉션
    - Class 객체로 타입의 필드·생성자·메서드 등의 정보를 실행 중 조회한다.
    - 접근 제한자와 모듈 경계에 따른 접근 제약이 있다.
 
    12.12 어노테이션
    - 어노테이션은 코드에 메타데이터를 부여한다.
    - 대상(ElementType)과 유지 정책(RetentionPolicy)에 따라 컴파일·실행 단계에서 활용된다.
 */

public class Chapter12JavaBaseModule {
    public static void main(String[] args) throws Exception {
        System.out.println("Java".substring(0, 2));   // Ja
        System.out.println(Integer.parseInt("42"));  // 42
        System.out.println(java.time.LocalDate.of(2026, 1, 1));
        System.out.println(Math.max(3, 5));
    }
}
