package Part02_Object_Oriented_Programming;

/*
    Chapter 07. 상속
 
    7.1 상속 개념
    - 상속은 기존 클래스의 공통 상태와 동작을 활용해 새로운 클래스를 정의하는 방식이다.
    - IS-A 관계가 적절한지 확인하고 단순 코드 재사용 목적의 남용을 피한다.
 
    7.2 클래스 상속
    - extends로 직접 부모 클래스를 하나 지정한다.
    - Java 클래스는 단일 클래스 상속을 사용하지만 인터페이스는 여러 개 구현할 수 있다.
 
    7.3 부모 생성자 호출
    - 자식 생성자의 시작 과정에서 부모 생성자가 먼저 수행된다.
    - super(...)로 부모 생성자를 명시적으로 호출할 수 있으며 부모의 필드는 생성 과정에서 초기화된다.
 
    7.4 메소드 재정의
    - 오버라이딩은 상속받은 인스턴스 메서드를 자식에서 다시 구현하는 것이다.
    - @Override를 사용하면 시그니처 오류를 컴파일 단계에서 확인하기 쉽다.
 
    7.5 final 클래스와 final 메소드
    - final 클래스는 상속할 수 없고 final 메서드는 자식 클래스에서 오버라이딩할 수 없다.
    - final 필드는 재대입 금지 의미로 구분한다.
 
    7.6 protected 접근 제한자
    - protected 멤버는 같은 패키지와 패키지 밖의 하위 클래스에서 조건에 따라 접근할 수 있다.
    - public보다 좁고 package-private보다 상속에 관해 넓다.
 
    7.7 타입 변환
    - 자식 객체를 부모 타입에 대입하는 업캐스팅은 자동이다.
    - 반대 방향의 다운캐스팅은 실제 객체가 해당 타입이어야 한다.
 
    7.8 다형성
    - 부모 타입 변수로 여러 자식 객체를 다루며 오버라이드된 메서드는 실제 객체의 구현이 실행된다.
    - 이는 결합도를 낮추고 확장성을 높인다.
 
    7.9 객체 타입 확인
    - instanceof는 객체가 특정 타입의 인스턴스인지 확인한다.
    - 패턴 변수를 쓰면 검사와 캐스팅을 결합할 수 있다.
 
    7.10 추상 클래스
    - abstract 클래스는 직접 인스턴스화할 수 없고 추상 메서드를 포함할 수 있다.
    - 하위 클래스에 공통 구현과 구현 의무를 함께 제공한다.
 
    7.11 봉인된 클래스
    - sealed 클래스는 permits로 직접 상속을 허용할 타입을 제한할 수 있다.
    - 직접 자식은 final, sealed, non-sealed 중 적절한 제어자를 선언해야 한다.
 */

public class Chapter07Inheritance {
    public static void main(String[] args) throws Exception {
        Animal animal = new Dog(); // 업캐스팅
        System.out.println(animal.sound()); // 오버라이딩된 Dog 구현 호출
    }

    private static class Animal { String sound() { return "..."; } }
    private static class Dog extends Animal {
        @Override String sound() { return "멍멍"; }
    }
}
