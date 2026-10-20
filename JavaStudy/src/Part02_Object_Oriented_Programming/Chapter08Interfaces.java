package Part02_Object_Oriented_Programming;

/*
    Chapter 08. 인터페이스
 
    8.1 인터페이스의 역할
    - 인터페이스는 객체가 제공할 기능의 계약을 정의한다.
    - 구현체의 구체적 클래스를 몰라도 인터페이스 타입으로 기능을 사용할 수 있다.
 
    8.2 인터페이스와 구현 클래스 선언
    - interface로 계약을 만들고 implements로 구현한다.
    - 하나의 클래스가 여러 인터페이스를 구현할 수 있다.
 
    8.3 상수 필드
    - 인터페이스에 선언한 필드는 묵시적으로 public static final 상수다.
    - 인스턴스 상태를 저장하는 필드를 선언할 수 없다.
 
    8.4 추상 메소드
    - 인터페이스의 일반 추상 메서드는 public abstract다.
    - 구현 클래스에서 접근 수준을 좁힐 수 없으며 public으로 구현한다.
 
    8.5 디폴트 메소드
    - default 메서드는 구현을 가진 인스턴스 메서드다.
    - 여러 인터페이스에서 같은 기본 메서드를 상속할 때 충돌 해결이 필요할 수 있다.
 
    8.6 정적 메소드
    - 인터페이스의 static 메서드는 인터페이스명을 통해 직접 호출한다.
    - 구현 객체의 다형적 동작과는 구별된다.
 
    8.7 private 메소드
    - 인터페이스의 private 메서드는 인터페이스 내부의 default·static 구현에서 공통 로직을 재사용할 때 사용한다.
    - 외부에서 호출할 수 없다.
 
    8.8 다중 인터페이스 구현
    - 한 클래스는 여러 인터페이스의 규약을 함께 구현할 수 있다.
    - 동일한 시그니처의 기본 메서드 충돌은 구현 클래스에서 해결한다.
 
    8.9 인터페이스 상속
    - 인터페이스는 extends로 다른 인터페이스 하나 이상을 상속할 수 있다.
    - 하위 인터페이스는 상위 규약을 이어받는다.
 
    8.10 타입 변환
    - 구현 객체는 구현한 인터페이스 타입으로 자동 변환된다.
    - 원래 구현 타입으로의 강제 변환은 실제 객체 타입을 확인해야 한다.
 
    8.11 다형성
    - 매개변수·필드를 인터페이스 타입으로 선언하면 구현체를 교체해도 사용 코드의 변경을 줄일 수 있다.
    - 호출되는 구현은 실제 객체에 의해 결정된다.
 
    8.12 객체 타입 확인
    - instanceof로 구현 객체가 특정 인터페이스를 구현하는지 확인할 수 있다.
    - 변환이 안전한지 판단할 때 활용한다.
 
    8.13 봉인된 인터페이스
    - sealed interface는 permits로 직접 구현·상속할 수 있는 타입을 제한한다.
    - 허용된 직접 하위 타입은 sealed, non-sealed 또는 final 조건을 충족해야 한다.
 */

public class Chapter08Interfaces {
    public static void main(String[] args) throws Exception {
        Printer printer = new ConsolePrinter();
        printer.print("인터페이스 구현");
    }

    private interface Printer { void print(String text); }
    private static class ConsolePrinter implements Printer {
        @Override public void print(String text) { System.out.println(text); }
    }
}
