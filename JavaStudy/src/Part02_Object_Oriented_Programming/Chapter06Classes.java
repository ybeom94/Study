package Part02_Object_Oriented_Programming;

/*
    Chapter 06. 클래스
 
    6.1 객체지향 프로그래밍
    - 프로그램을 객체의 상태와 동작, 객체 간 협력으로 모델링하는 방식이다.
    - 캡슐화·상속·다형성이 핵심 개념이다.
 
    6.2 객체와 클래스
    - 클래스는 객체의 상태와 기능을 정의하는 설계이고 객체는 해당 클래스로 생성된 인스턴스다.
    - 한 클래스로 여러 객체를 생성할 수 있다.
 
    6.3 클래스 선언
    - class 키워드로 이름과 본문을 정의한다.
    - 공개 최상위 클래스는 파일명과 일치하며 일반적으로 대문자로 시작하는 PascalCase를 쓴다.
 
    6.4 객체 생성과 클래스 변수
    - new는 일반적으로 객체를 생성하고 생성자를 호출한다.
    - 클래스 타입의 변수에는 그 객체의 참조가 저장된다.
 
    6.5 클래스의 구성 멤버
    - 필드는 객체나 클래스의 상태, 생성자는 초기화, 메서드는 기능을 담당한다.
    - 필요에 따라 인스턴스 초기화 블록이나 정적 초기화 블록도 사용할 수 있다.
 
    6.6 필드 선언과 사용
    - 인스턴스 필드는 각 객체마다 존재하고 정적 필드는 클래스 수준에서 공유된다.
    - 필드는 초기값을 지정하지 않아도 타입별 기본값으로 초기화된다.
 
    6.7 생성자 선언과 호출
    - 생성자는 반환 타입이 없으며 이름이 클래스와 같다.
    - this(...)는 같은 클래스의 다른 생성자를 호출하고 this는 현재 인스턴스를 가리킨다.
 
    6.8 메소드 선언과 호출
    - 메서드는 반환 타입, 이름, 매개변수, 본문으로 정의한다.
    - 반환형이 void가 아니면 알맞은 값을 반환해야 하며 오버로딩은 매개변수 목록이 달라야 한다.
 
    6.9 인스턴스 멤버
    - 인스턴스 메서드는 특정 객체의 필드·메서드를 사용한다.
    - 현재 객체는 this로 표현하며 정적 문맥에서는 this를 사용할 수 없다.
 
    6.10 정적 멤버
    - static 멤버는 개별 객체에 종속되지 않는다.
    - 클래스명.멤버 형태로 접근하는 것이 명확하다.
 
    6.11 final 필드와 상수
    - final 필드는 한 번 초기화된 뒤 다시 대입할 수 없다.
    - 공용 상수는 일반적으로 static final로 선언하고 대문자+언더스코어 이름을 쓴다.
 
    6.12 패키지
    - package는 클래스의 논리적 소속을 나타내며 보통 소문자 점 표기법을 쓴다.
    - 소스 폴더 구조를 패키지 경로와 일치시키면 관리가 쉽다.
 
    6.13 접근 제한자
    - public, protected, package-private(생략), private는 멤버의 접근 범위를 제한한다.
    - 필요한 기능만 노출하면 객체의 내부 구현을 보호할 수 있다.
 
    6.14 Getter와 Setter
    - private 필드의 조회와 변경을 메서드로 제어할 수 있다.
    - Setter는 변경 가능한 값에 검증 규칙을 적용하는 장소가 될 수 있다.
 
    6.15 싱글톤 패턴
    - 생성자를 외부에 공개하지 않고 인스턴스 접근 경로를 하나로 관리하는 설계다.
    - static final 인스턴스나 enum 등을 활용할 수 있으며 남용은 피한다.
 */

public class Chapter06Classes {
    public static void main(String[] args) throws Exception {
        Student student = new Student("Kim");
        System.out.println(student.getName());
        System.out.println(Student.SCHOOL);
    }

    private static class Student {
        static final String SCHOOL = "Java School";
        private final String name;
        Student(String name) { this.name = name; }
        String getName() { return name; }
    }
}
