package Part02_Object_Oriented_Programming;

/*
    Chapter 09. 중첩 선언과 익명 객체
 
    9.1 중첩 클래스
    - 클래스 내부에 다른 클래스를 선언하여 밀접한 타입을 함께 관리한다.
    - 선언 위치에 따라 인스턴스 멤버 클래스, 정적 중첩 클래스, 로컬 클래스로 구분한다.
 
    9.2 인스턴스 멤버 클래스
    - 바깥 클래스의 인스턴스에 소속된다.
    - 바깥 객체가 있을 때 outer.new Inner()와 같이 생성하고 바깥 인스턴스 멤버에 접근할 수 있다.
 
    9.3 정적 멤버 클래스
    - static 중첩 클래스는 외부 객체 없이 Outer.Nested 형태로 생성한다.
    - 바깥 클래스의 인스턴스 멤버에 직접 접근하려면 별도 객체 참조가 필요하다.
 
    9.4 로컬 클래스
    - 메서드·생성자·블록 안에 선언한다.
    - 사용 범위는 선언 블록으로 제한되며 외부 지역 변수를 포획할 때 해당 변수는 final 또는 effectively final이어야 한다.
 
    9.5 바깥 멤버 접근
    - 중첩 클래스에서 바깥 클래스 멤버에 접근할 수 있는 범위는 중첩 클래스의 종류에 따라 달라진다.
    - 이름이 충돌할 때 Outer.this 등으로 대상을 명확히 한다.
 
    9.6 중첩 인터페이스
    - 인터페이스도 클래스 내부에 선언할 수 있다.
    - 특정 객체·구성 요소와 밀접한 이벤트 처리 규약 등을 묶을 때 사용한다.
 
    9.7 익명 객체
    - 이름이 없는 클래스를 선언과 동시에 인스턴스화할 수 있다.
    - 클래스 상속 또는 인터페이스 구현을 일회성으로 제공하며 람다식과는 용도·동작이 다를 수 있다.
 */

public class Chapter09NestedTypesAndAnonymousObjects {
    public static void main(String[] args) throws Exception {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show();
        Outer.Nested nested = new Outer.Nested();
        nested.show();
    }

    private static class Outer {
        class Inner { void show() { System.out.println("인스턴스 멤버 클래스"); } }
        static class Nested { void show() { System.out.println("정적 중첩 클래스"); } }
    }
}
