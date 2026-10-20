package Part03_Java_Libraries;

/*
    Chapter 13. 제네릭
 
    13.1 제네릭이란?
    - 제네릭은 클래스·인터페이스·메서드를 타입 매개변수로 일반화한다.
    - 컴파일 단계에서 타입 일관성을 확인하고 불필요한 형변환을 줄인다.
 
    13.2 제네릭 타입
    - class Box<T>처럼 타입 매개변수를 선언한다.
    - 사용할 때 Box<String>처럼 실제 타입 인자를 지정하며 원시 타입(raw type)은 타입 안정성을 떨어뜨린다.
 
    13.3 제네릭 메소드
    - 메서드 선언부의 <T>로 메서드 고유의 타입 매개변수를 정의한다.
    - 호출 인수나 대입 문맥을 보고 컴파일러가 타입을 추론할 수 있다.
 
    13.4 제한된 타입 파라미터
    - <T extends Number>는 T가 Number 또는 그 하위 타입이어야 함을 의미한다.
    - 클래스 하나와 여러 인터페이스 경계를 &로 지정할 수도 있다.
 
    13.5 와일드카드 타입 파라미터
    - <?>는 미지의 타입, <? extends T>는 상한 경계, <? super T>는 하한 경계로 사용한다.
    - 읽기·쓰기 허용 범위가 달라지는 점을 주의한다.
 */

public class Chapter13Generics {
    public static void main(String[] args) throws Exception {
        Box<String> box = new Box<>("Java");
        System.out.println(box.get());
    }

    private static class Box<T> {
        private final T value;
        Box(T value) { this.value = value; }
        T get() { return value; }
    }
}
