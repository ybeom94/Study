package Part02_Object_Oriented_Programming;

/*
    Chapter 10. 라이브러리와 모듈
 
    10.1 라이브러리
    - 재사용 가능한 클래스·인터페이스 등의 묶음이다.
    - Java에서는 JAR 파일로 배포하는 경우가 많으며 classpath로 라이브러리를 참조할 수 있다.
 
    10.2 모듈
    - 모듈은 패키지들을 묶고 외부에 공개할 API와 의존성을 선언한다.
    - 모듈 선언에는 별도의 module-info.java 파일을 사용한다.
 
    10.3 응용프로그램 모듈화
    - 애플리케이션을 모듈 단위로 나누면 의존성과 접근 경계를 명확하게 관리할 수 있다.
    - 모듈 사용 시 module-path와 모듈 이름을 고려해야 한다.
 
    10.4 모듈 배포용 JAR 파일
    - 모듈 JAR은 컴파일된 클래스와 모듈 정보를 함께 패키징한다.
    - 일반 JAR와 구분하여 이름 있는 모듈로 사용할 수 있다.
 
    10.5 패키지 은닉
    - exports로 공개하지 않은 패키지는 다른 모듈에서 일반적인 방법으로 사용할 수 없다.
    - public 클래스라도 모듈 경계에서 비공개일 수 있다.
 
    10.6 전이 의존
    - requires transitive는 자신을 사용하는 모듈에서도 지정한 의존 모듈을 읽을 수 있게 한다.
    - 공개 API에 노출되는 타입의 의존성을 설계할 때 중요하다.
 
    10.7 집합 모듈
    - 여러 모듈을 묶어 의존성을 편리하게 관리하는 집합(aggregate) 모듈을 구성할 수 있다.
    - 각 실제 모듈의 API 노출 규칙은 그대로 적용된다.
 
    10.8 리플렉션 허용
    - opens는 런타임의 심층 리플렉션 접근을 허용한다.
    - exports는 일반 컴파일·런타임 접근을 허용하므로 용도를 구분한다.
 
    10.9 자바 표준 모듈
    - java.base는 기본 모듈이며 java.sql, java.xml 등은 기능별 표준 모듈이다.
    - 모듈 구성을 실습하려면 이 파일 외에 별도의 module-info.java 및 프로젝트 구성이 필요하다.
 */

public class Chapter10LibrariesAndModules {
    public static void main(String[] args) throws Exception {
        System.out.println(String.class.getModule().getName()); // java.base
        // module-info.java 예시 (별도 파일에서 정의해야 함):
        // module example.app { requires java.sql; exports example.app.api; }
    }
}
