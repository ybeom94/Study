package Part03_Java_Libraries;

/*
    Chapter 16. 람다식
 
    16.1 람다식이란?
    - 람다식은 함수형 인터페이스의 단일 추상 메서드를 구현하는 표현식이다.
    - `(매개변수) -> 표현식/블록` 문법을 사용하며 익명 클래스와 완전히 동일하지는 않다.
 
    16.2 매개변수가 없는 람다식
    - 매개변수가 없으면 () -> 실행내용 형태로 작성한다.
    - Runnable의 run 등 인자가 없는 함수형 메서드에 사용할 수 있다.
 
    16.3 매개변수가 있는 람다식
    - 인자가 있으면 (x, y) -> ... 형태로 작성한다.
    - 컴파일러가 타입을 추론할 수 있으며 매개변수가 하나면 괄호를 생략할 수 있다.
 
    16.4 리턴값이 있는 람다식
    - 표현식 본문은 계산한 값을 암묵적으로 반환할 수 있다.
    - 여러 실행문을 쓰면 중괄호와 필요한 return을 사용한다.
 
    16.5 메소드 참조
    - 객체::인스턴스메서드, 타입::정적메서드, 타입::인스턴스메서드 형태로 기존 메서드를 참조한다.
    - 함수형 인터페이스의 매개변수·반환형과 호환되어야 한다.
 
    16.6 생성자 참조
    - 타입::new는 생성자 호출을 함수형 인터페이스에 연결한다. 생성자의 매개변수에 맞춰 Function, Supplier 등이 사용될 수 있다.
 */

public class Chapter16LambdaExpressions {
    public static void main(String[] args) throws Exception {
        java.util.function.Function<Integer, Integer> square = n -> n * n;
        System.out.println(square.apply(4));
        java.util.function.Supplier<StringBuilder> builder = StringBuilder::new;
        System.out.println(builder.get().append("Java"));
    }
}
