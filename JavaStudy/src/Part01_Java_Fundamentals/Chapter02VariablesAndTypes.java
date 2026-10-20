package Part01_Java_Fundamentals;

/*
    Chapter 02. 변수와 타입
 
    2.1 변수 선언
    - 변수는 타입에 맞는 값을 저장하기 위한 이름이다.
    - 지역 변수는 값을 대입한 뒤 읽을 수 있고 선언 위치에 따라 사용 가능한 범위가 달라진다.
 
    2.2 정수 타입
    - byte(8비트), short(16비트), int(32비트), long(64비트)은 부호 있는 정수형이다.
    - 정수 리터럴의 기본 타입은 int이며 필요한 큰 값에는 L 접미사를 붙인다.
 
    2.3 문자 타입
    - char는 UTF-16 코드 단위 하나를 저장하는 16비트 타입이다.
    - 일반 문자는 'A'처럼 작성하고, 모든 유니코드 문자가 char 하나로 표현되는 것은 아니다.
 
    2.4 실수 타입
    - float는 32비트, double은 64비트 IEEE 754 부동소수점 수를 표현한다.
    - 실수 리터럴은 기본적으로 double이며 float 리터럴은 F 접미사가 필요하다.
 
    2.5 논리 타입
    - boolean은 true 또는 false를 가진다.
    - 조건식의 결과와 프로그램 흐름을 나타내며 정수형과 서로 자동 변환되지 않는다.
 
    2.6 문자열 타입
    - String은 기본형이 아닌 참조형 타입이며 큰따옴표로 리터럴을 작성한다.
    - String 객체의 문자열 내용은 생성 후 변경되지 않는다.
 
    2.7 자동 타입 변환
    - 값을 표현할 수 있는 방향의 형변환은 일부 상황에서 자동으로 일어난다.
    - 예를 들어 int 값을 double 변수에 대입할 수 있지만 매우 큰 정수는 정밀도가 떨어질 수 있다.
 
    2.8 강제 타입 변환
    - 작은 범위의 타입으로 변환할 때 (타입) 캐스팅을 사용한다. 
    - 정수 변환은 상위 비트가 잘릴 수 있고 실수에서 정수로 바꾸면 소수 부분이 버려진다.
 
    2.9 연산식에서 자동 타입 변환
    - byte·short·char 피연산자는 대부분의 정수 산술식에서 int로 승격된다.
    - 서로 다른 수치 타입의 연산 결과는 이항 수치 승격 규칙을 따른다.
 
    2.10 문자열을 기본 타입으로 변환
    - Integer.parseInt, Double.parseDouble 등으로 문자열을 수치로 변환할 수 있다.
    - 형식이 맞지 않으면 NumberFormatException이 발생할 수 있다.
 
    2.11 변수 사용 범위
    - 변수는 선언된 블록의 범위 안에서만 접근할 수 있다.
    - 지역 변수는 기본값이 자동으로 설정되지 않지만 인스턴스 필드와 정적 필드에는 타입별 기본값이 있다.
 
    2.12 콘솔로 변수값 출력
    - System.out.print는 줄바꿈 없이, println은 줄바꿈하여 출력한다.
    - printf는 %d, %f, %s 등의 형식 지정자로 출력을 구성한다.
 
    2.13 키보드 입력 데이터를 변수에 저장
    - Scanner는 System.in에서 입력을 읽어 nextInt, next, nextLine 등으로 해석한다.
    - nextInt 이후 nextLine을 사용할 때 남은 개행 문자 처리에 주의한다.
 */

public class Chapter02VariablesAndTypes {
    public static void main(String[] args) throws Exception {
        int age = 20;
        long large = 8_000_000_000L;
        double widened = age;       // int -> double: 자동 형변환
        int narrowed = (int) 3.9;   // double -> int: 명시적 형변환
        System.out.println(age + ", " + large + ", " + widened + ", " + narrowed);
    }
}
