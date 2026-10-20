package Part01_Java_Fundamentals;

/*
    Chapter 01. 자바 시작하기
 
    1.1 프로그래밍 언어와 자바
    - 프로그래밍 언어는 문제를 해결하는 명령을 코드로 표현하는 수단이다.
    - Java는 객체지향 언어이며 운영체제별 JVM을 통해 바이트코드를 실행하는 방식으로 이식성을 높인다.
 
    1.2 운영체제별 JDK 설치
    - JDK는 Java 프로그램 개발에 필요한 컴파일러(javac), 실행 도구(java), 표준 라이브러리 등을 제공한다.
    - JDK 버전은 개발·실행 환경에서 호환되는지 확인해야 한다.
 
    1.3 운영체제별 환경 변수 설정
    - PATH에 JDK의 bin 경로를 등록하면 javac와 java 명령을 편리하게 실행할 수 있다.
    - JAVA_HOME은 여러 개발 도구에서 JDK 설치 경로를 참조하기 위해 사용한다.
 
    1.4 바이트코드 파일과 JVM
    - javac는 .java 소스를 .class 바이트코드로 컴파일한다.
    - JVM은 클래스를 로드하고 바이트코드를 검증·해석·실행하며 필요에 따라 JIT 컴파일을 수행한다.
 
    1.5 소스 작성부터 실행까지
    - 클래스 선언과 main 메서드를 작성한 뒤 컴파일하고 실행한다.
    - public 최상위 클래스가 있다면 파일명과 클래스명이 같아야 하며 패키지가 있다면 실행 시 정규화된 클래스명을 사용한다.
 
    1.6 이클립스 설치
    - Eclipse는 Java 편집·빌드·실행·디버깅 기능을 제공하는 IDE다.
    - IDE는 편리한 개발 도구이며 Java 언어 자체나 JVM과는 구분한다.
 
    1.7 이클립스 프로젝트 생성
    - 프로젝트는 소스 폴더, 패키지, 빌드 경로, JRE/JDK 설정을 함께 관리한다.
    - 패키지는 클래스의 이름 공간을 조직하고 이름 충돌을 방지한다.
 
    1.8 이클립스 소스 작성부터 실행까지
    - 클래스와 main 메서드를 작성하고 실행하면 IDE가 컴파일 및 클래스 실행을 처리한다.
    - 콘솔은 표준 출력과 오류 메시지를 확인하는 창이다.
 
    1.9 코드 용어 이해
    - 클래스는 타입의 선언이고 메서드는 실행 가능한 동작을 정의한다.
    - 중괄호는 블록을 형성하고 main(String[] args)은 일반적인 독립 실행 프로그램의 진입점이다.
 
    1.10 코드 주석 달기
    - 한 줄 주석은 슬래시 두 개(//)로 시작한다.
    - 블록 주석은 슬래시-별표로 시작하며 API 문서화 주석은 Javadoc 형식을 사용한다.
    - 주석은 실행문으로 처리되지 않는다.
 
    1.11 실행문과 세미콜론
    - 변수 선언·대입·메서드 호출 같은 문장은 일반적으로 세미콜론(;)으로 마친다.
    - 조건문과 반복문 등 블록을 사용하는 구문은 문장 종류에 따라 규칙이 다르다.
 */

public class Chapter01GettingStarted {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Java!");
        System.out.print("Java ");
        System.out.println("21");
        
        // 컴파일: javac -encoding UTF-8 Chapter01GettingStarted.java
        // 실행:   java Chapter01GettingStarted
    }
}
