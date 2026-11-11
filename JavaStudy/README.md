## Java 기초 학습 목차

| 일차 | 주제 | 학습 키워드 |
|:---:|---|---|
| **Day 01** | Java 시작하기 | Java 특징, JVM, JDK/JRE, 컴파일, `main()`, 출력, 주석 |
| **Day 02** | 변수와 데이터 타입 | 변수 선언·초기화, 식별자, 기본형 8가지, 리터럴, 형변환 |
| **Day 03** | 연산자 | 산술, 증감, 비교, 논리, 대입, 삼항, 비트·시프트 연산자 |
| **Day 04** | 제어문 | `if`, `else if`, `switch`, `for`, `while`, `do-while`, `break`, `continue` |
| **Day 05** | 제어문 심화 및 응용 | 중첩 반복문, 흐름 제어, 종합 실습 |
| **Day 06** | 반복문 심화 및 활용 | `for`, `while`, `do-while`, 향상된 `for`, 중첩 반복문, `break`, `continue`, 배열 순회 |
| **Day 07** | 반복 제어문, String과 배열 | `break`, `continue`, 라벨, `String`, 문자열 메서드, 1차원 배열, `Arrays` |
| **Day 08** | String과 배열 심화 및 메서드 | `String`, `StringBuilder`, 메서드, 배열 참조, 얕은 복사·깊은 복사, `Arrays`, `ArrayList` |
| **Day 09** | 배열과 메서드 심화 | 메서드 선언·호출·반환, 배열 순회·탐색·정렬, String 메서드, 배열 참조, 얕은 복사·깊은 복사 |
| **Day 10** | Java 기초 총정리 및 알고리즘 | 기본형·참조 타입, Enum, 배열, 메서드, 중첩 반복문, 탐색·정렬 알고리즘, Stack·Queue |
| **Day 11** | Java 메서드 및 기초 문법 종합 | 메서드 선언·호출, 매개변수, 반환값, 오버로딩, static·인스턴스 메서드, 호출 스택, 웹 로직 |
| **Day 12** | 메서드 심화 및 사용자 정의 클래스 | 클래스·객체, 필드, 생성자, this, static, 접근 제한자, 캡슐화, 오버로딩·오버라이딩, DTO·VO, record |
| **Day 13** | Java 객체지향 프로그래밍 심화 | 객체지향 4대 원칙, 캡슐화, 상속, super, 오버라이딩, 다형성, 타입 변환, 추상 클래스, 인터페이스, 다중 구현 |
| **Day 14** | 클래스·객체·JVM 메모리 구조 | 클래스 구성, 생성자, 초기화 블록, 메서드 오버로딩, Stack·Heap·Method Area, 참조 변수, static, this, 캡슐화, 상속·구성 |
| **Day 15** | 상속·다형성 및 JVM 메모리 심화 | 객체지향 핵심 원칙, extends, super, 생성자 초기화 순서, 부모·자식 객체 메모리, 참조 타입, 필드 숨김, 오버라이딩·오버로딩, 동적 바인딩, GC |
| **Day 16** | Java 클래스 종류와 객체지향 설계 | package·import, 추상 클래스, 인터페이스, 템플릿 메서드 패턴, 내부 클래스 4종, Builder 패턴, 익명 클래스·람다식, 의존성 주입(DI), 예외 처리 |
| **Day 17** | Java 인터페이스 심화 및 예외 처리 | 인터페이스, 추상·default·static·private 메서드, 다중 구현·상속, 다형성, 결합도, 의존성 주입(DI), Mock 객체, 중첩 클래스, 예외 처리 |
| **Day 18** | Java 예외 처리 및 실무 활용 | Exception·Error, Checked·Unchecked, try-catch-finally, 다중 catch, 예외 정보·전파, throw·throws, try-with-resources, 사용자 정의 예외, Spring Boot 전역 예외 처리 |
| **Day 19** | Java 예외 처리 및 중첩 클래스 심화 | 예외 전파, throw·throws, 사용자 정의 예외, 전역 예외 처리, 중첩 클래스 4종, static, 변수 캡처, DTO·Builder, java.lang |
| **Day 20** | Java 1권 핵심 복습 및 표준 라이브러리 | JDK·JVM, 자료형·메모리, 객체지향 3대 특성, VO·DTO, java.lang, Object, String, StringBuilder·StringBuffer, Wrapper, Math·Character, System·Runtime, 컬렉션·Stream·I/O·JDBC 개요 |
| **Day 21** | Java 코어 라이브러리 및 제네릭 심화 | java.base, Object, String, Wrapper, System, java.time, Format, Regex, Reflection, Annotation, Generic 클래스·메서드, 와일드카드, PECS, Spring 연계 |
| **Day 22** | Java 코어 라이브러리 실전 활용 및 자동화 | Object·Clone, Wrapper, String, Math·System, java.time, Period·Duration, Format, Regex, Pattern·Matcher, Annotation, Reflection, 동적 메서드 실행, 자동화 스캐너, 미니 라우터 |
| **Day 23** | Java 리플렉션·어노테이션·제네릭 심화 | Reflection, Class·Field·Constructor·Method, Annotation, Target·Retention, 동적 메서드 실행, Regex 심화, Generic 클래스·메서드, 타입 제한, 와일드카드, PECS, Type Erasure, API·Repository 설계 |



## Day1. Java 시작하기
<details>

### 🎯 학습 목표
- Java 언어의 주요 특징을 이해한다.
- Java 소스 코드가 실행되는 과정을 설명할 수 있다.
- 기본적인 Java 프로그램 구조와 출력문, 주석을 익힌다.

### 1. Java의 특징
- 운영체제 독립성: Java 프로그램은 JVM(Java Virtual Machine)을 통해 다양한 운영체제에서 실행할 수 있다.
- 객체지향 언어: 클래스와 객체를 중심으로 프로그램을 구성한다.
- 자동 메모리 관리: 가비지 컬렉터(Garbage Collector)가 사용하지 않는 객체의 메모리를 관리한다.
- 다양한 활용: 여러 운영체제 및 애플리케이션 환경에서 사용할 수 있다.

### 2. Java 실행 과정
```md
Hello.java (소스 코드)
       ↓ javac 컴파일
Hello.class (바이트코드)
       ↓ JVM에서 실행
프로그램 실행 결과
```

| 용어 | 설명 |
|---|---|
| JDK | Java 프로그램 개발에 필요한 도구 모음 |
| JRE | Java 프로그램을 실행하는 데 필요한 환경 |
| JVM | 바이트코드를 실행하는 Java 가상 머신 |
| `javac` | `.java` 파일을 `.class` 바이트코드로 컴파일하는 명령 |
| `java` | 컴파일된 Java 프로그램을 실행하는 명령 |

### 3. 첫 Java 프로그램
```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

`class Hello` : 클래스 선언  
`main(String[] args)` : Java 프로그램 실행의 시작점  
`System.out.println()` : 내용을 출력하고 줄바꿈  
`;` : 명령문 끝을 나타내는 기호  

```bash
javac Hello.java
java Hello
```
터미널 명령어 실행  
실행 결과 : `Hello, Java!`

### 4. 주석
```java
// 한 줄 주석

/*
 여러 줄 주석
*/
```

### ✅ Day1 핵심 정리
- Java는 JVM을 통해 프로그램을 실행한다.
- 소스 코드(`.java`)는 컴파일 후 바이트코드(`.class`)가 된다.
- `main()`은 기본적인 Java 프로그램의 시작점이다.

</details>


## Day2. 변수와 데이터 타입
<details>

### 🎯 학습 목표
- 변수를 선언하고 값을 저장할 수 있다.
- 기본 데이터 타입 8가지를 구분할 수 있다.
- 리터럴, 변수의 사용 범위, 자동·강제 형변환을 이해한다.

### 1. 변수란?
- 변수는 하나의 값을 저장하는 메모리 공간을 의미한다.  
- 기본 형식 : `데이터타입 변수명 = 초기값;`
```java
int age;          // 변수 선언
age = 20;         // 값 대입
int score = 90;   // 선언과 동시에 초기화

System.out.println(age);   // 20
System.out.println(score); // 90
```

### 2. 변수명 작성 규칙
- 영문자, 숫자, `_`, `$`를 사용할 수 있다.
- 숫자로 시작할 수 없다.
- 대문자와 소문자를 구별한다.
- `class`, `int` 등 Java 예약어를 사용할 수 없다.
- 의미 있는 이름을 사용하고, 일반적으로 `camelCase`를 권장한다.
```java
int studentAge = 20;  // 올바른 이름
// int 1age = 20;     // 잘못된 이름 : 숫자로 시작
// int class = 1;     // 잘못된 이름 : 예약어
```

### 3. Java 기본 데이터 타입 8가지
| 분류 | 타입 | 크기 | 특징 |
|---|---|---:|---|
| 정수형 | `byte` | 1 byte | 작은 정수 |
| 정수형 | `short` | 2 bytes | 비교적 작은 정수 |
| 정수형 | `int`📌 | 4 bytes | 일반적인 정수 계산에 주로 사용 |
| 정수형 | `long` | 8 bytes | 큰 정수, 리터럴에 `L` 사용 |
| 실수형 | `float` | 4 bytes | 단정밀도 실수, 리터럴에 `F` 사용 |
| 실수형 | `double`📌 | 8 bytes | 일반적인 실수 계산에 주로 사용 |
| 문자형 | `char` | 2 bytes | 단일 문자, 작은따옴표 사용 |
| 논리형 | `boolean` | JVM 구현에 따라 다름 | `true` 또는 `false` |

***주의 : `String`은 문자열을 표현하는 참조형 타입이며, 기본 데이터 타입 8가지에 포함되지 않습니다.***
```java
byte small = 10;
short year = 2026;
int age = 20;
long population = 8000000000L;

float height = 175.5F;
double weight = 68.75;

char grade = 'A';
boolean isPass = true;

String name = "Java"; // String은 기본형이 아닌 참조형
```

### 4. 리터럴과 변수의 사용 범위
- 리터럴 : `10(int)`, `3.14(double)`, `'A'(char)`, `true(boolean)`, `"Java"(String)` 등 코드에 직접 작성한 값
- 지역 변수 : 메서드나 블록 내부에서 선언하며, 사용하기 전에 반드시 초기화해야 한다.
- 필드 : 클래스 안에서 선언되며, 명시적으로 초기화하지 않으면 타입에 따른 기본값이 부여된다.

### 5. 형변환
- 자동 형변환 : 표현 가능한 범위가 넓은 타입으로 변환될 때 주로 자동 처리된다.
```java
int num = 10;
double result = num;
System.out.println(result); // 10.0
```

- 강제 형변환 : 명시적으로 타입을 지정한다. 값이 잘리거나 손실될 수 있다.
```java
double pi = 3.14;
int number = (int) pi;
System.out.println(number); // 3
```

### ✅ Day2 핵심 정리
- 변수는 `타입 변수명 = 값;` 형태로 선언·초기화한다.
- 정수는 주로 `int`, 실수는 주로 `double`을 사용한다.
- `long`에는 `L`, `float`에는 `F` 접미사를 붙이는 경우가 많다.
- 지역 변수는 사용 전 초기화해야 한다.
- 강제 형변환 시 값 손실에 주의한다.

</details>

## Day3. 연산자
<details>

### 🎯 학습 목표
- 주요 연산자의 기능과 사용법을 익힌다.
- 비교 연산과 논리 연산의 결과를 이해한다.
- 전위·후위 증감 및 연산자 우선순위를 구분한다.

### 1. 산술 연산자
| 연산자 | 의미 | 예시 | 결과 |
|:---:|---|---|---|
| `+` | 덧셈 | `10 + 3` | `13` |
| `-` | 뺄셈 | `10 - 3` | `7` |
| `*` | 곱셈 | `10 * 3` | `30` |
| `/` | 나눗셈 | `10 / 3` | `3` |
| `%` | 나머지 | `10 % 3` | `1` |

```java
int a = 10;
int b = 3;

System.out.println(a / b);         // 3 (정수 나눗셈)
System.out.println(a % b);         // 1
System.out.println((double) a / b); // 3.333...
```

### 2. 증감 연산자
- ++는 1 증가, --는 1 감소를 의미한다.
```java
int a = 5;
System.out.println(a++); // 5: 현재 값을 사용한 후 증가
System.out.println(a);   // 6

int b = 5;
System.out.println(++b); // 6: 먼저 증가한 후 사용
```

### 3. 비교 연산자
| 연산자 | 의미 |
|:---:|---|
| `==` | 같다 |
| `!=` | 다르다 |
| `>` / `<` | 크다 / 작다 |
| `>=` / `<=` | 크거나 같다 / 작거나 같다 |

```java
int score = 85;
System.out.println(score >= 60); // true
System.out.println(score == 100); // false
```
***주의 : `=`는 대입, `==`는 값 비교입니다. 문자열의 내용 비교에는 일반적으로 `equals()`를 사용합니다.***

### 4. 논리 연산자
| 연산자 | 의미 |
|:---:|---|
| `&&` | (AND)조건이 모두 참일 때 참 |
| `∥` | (OR)조건 중 하나라도 참이면 참 |
| `!` | (NOT)참과 거짓을 반대로 바꿈 |

```java
int age = 25;
boolean hasTicket = true;

System.out.println(age >= 20 && hasTicket); // true
System.out.println(age < 20 || hasTicket);  // true
System.out.println(!hasTicket);              // false
```
`&&`, `||`는 결과가 이미 결정되면 뒤의 식을 평가하지 않는 **단축 평가(Short-circuit)**를 수행한다.

### 5. 대입 연산자
```java
int num = 10;
num += 5; // num = num + 5; → 15
num -= 3; // 12
num *= 2; // 24
num /= 4; // 6
num %= 4; // 2
```

### 6. 삼항 연산자
- 조건의 참·거짓에 따라 두 값 중 하나를 선택한다.
- 형식 : `조건식 ? 참일 때 값 : 거짓일 때 값`
```java
int score = 85;
String result = (score >= 60) ? "합격" : "불합격";
System.out.println(result); // 합격
```

### 7. 기타 연산자
| 종류 | 연산자 | 용도 |
|---|---|---|
| 부정 | `!` | 논리값 반전 |
| 형변환 | `(타입)` | 타입 변환 |
| 비트 | `&`, `│`, `^`, `~` | 정수 비트 단위 연산 |
| 비트 이동 | `<<`, `>>`, `>>>` | 비트를 왼쪽·오른쪽으로 이동 |
```java
System.out.println(5 & 3); // 1
System.out.println(5 | 3); // 7
System.out.println(8 << 1); // 16
```

### ✅ Day3 핵심 정리
- 정수끼리 나누면 소수 부분이 버려진다.
- `a++`는 후위 증가, `++a`는 전위 증가이다.
- 비교 연산은 `boolean` 결과를 반환한다.
- 여러 조건을 연결할 때 `&&`, `||`, `!`를 사용한다.
- 복합 대입, 삼항 연산자, 비트 연산자의 차이를 이해한다.

</details>


## Day4. 제어문
<details>

### 🎯 학습 목표
- 조건에 따라 실행 흐름을 분기할 수 있다.
- 반복문으로 코드를 여러 번 실행할 수 있다.
- `break`, `continue`로 반복 흐름을 제어할 수 있다.

### 1. 조건문 `if`
- 조건식이 `true`일 때만 블록을 실행한다.
```java
int score = 85;

if (score >= 60) {
    System.out.println("합격입니다.");
}
```

### 2. `if ~ else`
- 참과 거짓의 두 경우 중 하나를 실행한다.
```java
int score = 55;

if (score >= 60) {
    System.out.println("합격입니다.");
} else {
    System.out.println("불합격입니다.");
}
```

### 3. `if ~ else if ~ else`
- 여러 조건을 위에서부터 순서대로 검사한다.
```java
int score = 85;

if (score >= 90) {
    System.out.println("A학점");
} else if (score >= 80) {
    System.out.println("B학점");
} else if (score >= 70) {
    System.out.println("C학점");
} else {
    System.out.println("F학점");
}
// B학점
```

### 4. 중첩 `if`
- 조건문 안에 다른 조건문을 작성할 수 있다.
```java
int age = 25;
boolean hasTicket = true;

if (age >= 20) {
    if (hasTicket) {
        System.out.println("입장 가능합니다.");
    }
}
```

### 5. `switch`문
- 하나의 값을 여러 `case`와 비교해 실행할 코드를 선택한다.
```java
int menu = 2;

switch (menu) {
    case 1:
        System.out.println("커피");
        break;
    case 2:
        System.out.println("주스");
        break;
    case 3:
        System.out.println("물");
        break;
    default:
        System.out.println("잘못된 메뉴입니다.");
}
// 주스
```

- Java 14 이상에서는 화살표(`->`)를 사용하는 간결한 `switch` 문법도 사용할 수 있다.
```java
switch (menu) {
    case 1 -> System.out.println("커피");
    case 2 -> System.out.println("주스");
    default -> System.out.println("기타");
}
```

### 6. `for`문
- 반복 횟수가 정해져 있을 때 주로 사용한다.
- 형식 : `for (초기식; 조건식; 증감식) { 실행문; }`
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
// 1 2 3 4 5 (각 줄에 출력)
```

### 7. `while`문
- 조건이 참인 동안 반복한다. 실행 전에 조건을 검사한다.
```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

### 8. do ~ while문
- 블록을 먼저 실행하고 조건을 검사하므로 최소 한 번은 실행한다.
```java
int i = 1;

do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

### 9. 향상된 `for`문
- 배열이나 컬렉션의 요소를 순서대로 순회한다.
```java
int[] numbers = {10, 20, 30};

for (int number : numbers) {
    System.out.println(number);
}
```

### 10. `break`와 `continue`
```java
// break: 반복문을 즉시 종료
for (int i = 1; i <= 5; i++) {
    if (i == 3) break;
    System.out.println(i);
}
// 1 2

// continue: 이번 반복의 나머지를 건너뛰고 다음 반복 진행
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;
    System.out.println(i);
}
// 1 2 4 5
```

### ✅ Day4 핵심 정리
| 제어문 | 사용 상황 |
|---|---|
| `if` | 조건이 참일 때 실행 |
| `if ~ else` | 두 경우 중 하나 선택 |
| `else if` | 여러 조건 순차 검사 |
| `switch` | 특정 값과 일치하는 경우 선택 |
| `for` | 반복 횟수가 명확할 때 |
| `while` | 조건이 참인 동안 반복 |
| `do ~ while` | 최소 한 번 실행해야 할 때 |
| `break` | 반복문 또는 `switch`를 종료 |
| `continue` | 현재 반복의 나머지를 건너뜀 |

</details>


## Day5. 제어문 심화 및 응용
<details>

### 🎯 학습 목표
- 조건문과 반복문의 실행 흐름을 이해한다.
- 상황에 따라 적절한 반복문을 선택할 수 있다.
- 중첩 반복문을 활용하여 반복 작업을 처리할 수 있다.
- `break`, `continue`, `return`의 차이를 이해한다.
- 조건문과 반복문을 조합하여 실전 프로그램을 구현할 수 있다.

### 1. 제어문의 종류와 역할
- 제어문은 프로그램의 실행 순서를 변경하거나 반복하는 문법이다.
- 조건에 따라 코드를 실행하고, 특정 작업을 반복하거나 종료할 수 있다.

| 구분 | 종류 | 역할 |
|---|---|---|
| 조건문 | `if`, `else if`, `else` | 조건에 따라 실행할 코드 선택 |
| 선택문 | `switch` | 특정 값에 따라 실행할 코드 선택 |
| 반복문 | `for` | 정해진 횟수만큼 반복 |
| 반복문 | `while` | 조건이 참인 동안 반복 |
| 반복문 | `do-while` | 최소 한 번 실행 후 조건 검사 |
| 분기문 | `break` | 반복문 또는 switch 종료 |
| 분기문 | `continue` | 현재 반복을 건너뛰고 다음 반복 진행 |
| 분기문 | `return` | 메서드 실행 종료 |

### 2. 반복문의 종류와 선택 기준

| 반복문 | 특징 | 사용 상황 |
|---|---|---|
| `for` | 초기식, 조건식, 증감식 사용 | 반복 횟수가 명확할 때 |
| `while` | 실행 전에 조건 검사 | 특정 조건이 만족될 때까지 반복 |
| `do-while` | 실행 후 조건 검사 | 최소 한 번은 실행해야 할 때 |

```java
// for문 : 1부터 5까지 출력
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}

// while문 : MP가 0보다 클 때까지 반복
int mp = 30;

while (mp > 0) {
    System.out.println("파이어볼!");
    mp -= 10;
}

// do-while문 : 조건이 거짓이어도 최소 1회 실행
int num = 10;

do {
    System.out.println(num);
    num++;
} while (num < 5);
```

**주의 : 반복문 내부에서 조건에 영향을 주는 값이 변경되지 않으면 무한 루프가 발생할 수 있습니다.**

### 3. 중첩 반복문

- 반복문 내부에 다른 반복문을 작성하는 구조이다.
- 바깥쪽 반복문이 한 번 실행될 때 안쪽 반복문은 자신의 반복을 수행한다.
- 구구단, 좌표 출력, 2차원 데이터 처리 등에 활용한다.

```java
// 구구단 2단부터 9단까지 출력
for (int dan = 2; dan <= 9; dan++) {
    System.out.println("[" + dan + "단]");

    for (int i = 1; i <= 9; i++) {
        System.out.println(dan + " x " + i + " = " + (dan * i));
    }

    System.out.println();
}
```

- 바깥쪽 `dan`은 2부터 9까지 증가한다.
- 안쪽 `i`는 각 단마다 1부터 9까지 반복한다.
- 중첩 반복문에서는 바깥쪽과 안쪽 반복문의 실행 순서를 구분해야 한다.

### 4. break와 continue의 차이

| 구분 | `break` | `continue` |
|---|---|---|
| 역할 | 반복문 즉시 종료 | 현재 반복 건너뛰기 |
| 다음 반복 | 실행하지 않음 | 계속 진행 |
| 사용 상황 | 검색 완료, 반복 종료 | 특정 데이터 제외 |

```java
// break : i가 5가 되면 반복 종료
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break;
    }

    System.out.print(i + " ");
}
// 1 2 3 4

// continue : i가 3일 때만 건너뛰기
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;
    }

    System.out.print(i + " ");
}
// 1 2 4 5
```

- 일반적인 `break`는 가장 가까운 반복문 하나만 종료한다.
- `continue`는 반복문을 종료하지 않고 현재 회차의 나머지 코드만 건너뛴다.

### 5. 라벨을 이용한 반복문 제어

- 중첩 반복문에서는 라벨(Label)을 사용하여 바깥쪽 반복문을 제어할 수 있다.
- `break 라벨명;`은 지정한 반복문 전체를 종료한다.

```java
outer:
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if (j == 2) {
            break outer;
        }

        System.out.println(i + ", " + j);
    }
}
// 1, 1
```

**주의 : 일반 break와 달리 라벨이 있는 break는 지정된 바깥쪽 반복문까지 종료할 수 있습니다.**

### 6. 조건문과 반복문의 혼합

- 반복문과 조건문을 함께 사용하면 특정 조건에 맞는 데이터만 처리할 수 있다.
- 데이터 필터링, 검색, 입력값 검사 등에 활용한다.

```java
// 배열에서 짝수만 출력
int[] numbers = {1, 2, 3, 4, 5, 6};

for (int num : numbers) {
    if (num % 2 == 0) {
        System.out.println(num);
    }
}
// 2 4 6
```

- `for`문으로 배열의 요소를 순서대로 확인한다.
- `if`문으로 짝수인지 검사한다.
- `%` 연산자를 사용하여 나머지가 0인 값만 출력한다.

### 7. Scanner를 이용한 사용자 입력

- `Scanner`는 사용자로부터 데이터를 입력받는 클래스이다.
- 입력값을 변수에 저장하여 조건문이나 반복문에서 사용할 수 있다.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        int age = scan.nextInt();

        if (age >= 20) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }

        scan.close();
    }
}
```

| 메서드 | 설명 |
|---|---|
| `nextInt()` | 정수 입력 |
| `nextDouble()` | 실수 입력 |
| `next()` | 공백 전까지 문자열 입력 |
| `nextLine()` | 한 줄의 문자열 입력 |

### 8. Random을 이용한 난수 생성

- `Random` 클래스는 임의의 숫자를 생성할 때 사용한다.
- 난수 생성은 숫자 맞히기 게임, 무작위 선택 등에 활용한다.

```java
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int num = random.nextInt(100) + 1;

        System.out.println(num);
    }
}
```

- `nextInt(100)` : 0부터 99까지의 정수 생성
- `nextInt(100) + 1` : 1부터 100까지의 정수 생성

`Math.random()`을 사용하여 난수를 생성할 수도 있다.

```java
int num = (int)(Math.random() * 100) + 1;
```

- `Math.random()`은 0.0 이상 1.0 미만의 실수를 반환한다.
- `(int)`로 형변환하여 정수값을 얻는다.

### 9. 실습 - 메뉴 선택 프로그램

- `Scanner`, `switch`, `while`을 함께 사용한다.
- 사용자가 종료 메뉴를 선택하기 전까지 프로그램을 반복 실행한다.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("=== 메뉴 ===");
            System.out.println("1. 커피");
            System.out.println("2. 주스");
            System.out.println("3. 물");
            System.out.println("0. 종료");
            System.out.print("선택: ");

            int menu = scan.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("커피");
                    break;
                case 2:
                    System.out.println("주스");
                    break;
                case 3:
                    System.out.println("물");
                    break;
                case 0:
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("잘못된 메뉴입니다.");
            }

            if (menu == 0) {
                break;
            }
        }

        scan.close();
    }
}
```

- `while(true)` : 메뉴를 계속 출력한다.
- `Scanner` : 사용자가 선택한 메뉴 번호를 입력받는다.
- `switch` : 메뉴 번호에 따라 실행할 코드를 선택한다.
- `if (menu == 0)` : 종료 조건을 확인한다.
- `break` : 반복문을 종료한다.

**주의 : switch 내부의 break는 switch만 종료하며, while문까지 종료하지는 않습니다.**

### ✅ Day5 핵심 정리

| 구분 | 핵심 내용 |
|---|---|
| 제어문 | 프로그램의 실행 흐름을 제어 |
| `for` | 반복 횟수가 명확할 때 사용 |
| `while` | 조건이 참인 동안 반복 |
| `do-while` | 최소 한 번 실행 |
| 중첩 반복문 | 반복문 내부에 다른 반복문 작성 |
| `break` | 반복문 또는 switch 종료 |
| `continue` | 현재 반복 건너뛰기 |
| `return` | 메서드 실행 종료 |
| 라벨 | 중첩 반복문에서 특정 반복문 제어 |
| `Scanner` | 사용자 입력 처리 |
| `Random` | 임의의 숫자 생성 |
| 혼합 제어문 | 조건문과 반복문을 함께 활용 |

- 조건문과 반복문을 조합하면 다양한 프로그램을 구현할 수 있다.
- 반복 횟수가 명확하면 `for`, 조건 중심이면 `while`을 주로 사용한다.
- 최소 한 번 실행해야 한다면 `do-while`을 사용한다.
- `break`와 `continue`는 실행 흐름이 다르므로 구분해야 한다.
- 중첩 반복문에서는 각 반복문의 실행 순서를 정확히 이해해야 한다.
- 사용자 입력과 난수를 활용하면 동적인 프로그램을 작성할 수 있다.

</details>


## Day6. 반복문 심화 및 활용
<details>

### 🎯 학습 목표
- 반복문의 종류와 실행 순서를 정확하게 이해한다.
- `for`, `while`, `do-while`의 차이와 사용 상황을 구분한다.
- 향상된 `for`문으로 배열의 요소를 순회할 수 있다.
- `break`, `continue`를 활용하여 반복 흐름을 제어할 수 있다.
- 중첩 반복문과 라벨을 이용한 반복문 제어를 이해한다.
- 반복문을 활용하여 데이터의 합계, 검색 및 출력 작업을 수행할 수 있다.

### 1. 반복문의 기본 개념

- 반복문은 특정 조건에 따라 동일한 코드를 여러 번 실행하는 제어문이다.
- 반복되는 코드를 줄여 프로그램의 효율성과 유지보수성을 높인다.
- 기본적으로 초기값, 반복 조건, 상태 변화 등을 고려해야 한다.

| 반복문 | 조건 검사 시점 | 최소 실행 횟수 | 주요 용도 |
|---|---|:---:|---|
| `for` | 실행 전 | 0회 | 반복 횟수가 명확할 때 |
| `while` | 실행 전 | 0회 | 특정 조건이 참인 동안 반복 |
| `do-while` | 실행 후 | 1회 | 최소 한 번 실행해야 할 때 |
| 향상된 `for` | 요소 순회 | 0회 | 배열 및 컬렉션 데이터 처리 |

### 2. for문 실행 원리

- 반복 횟수나 범위가 정해져 있을 때 주로 사용한다.
- 초기식, 조건식, 증감식을 하나의 구문으로 작성한다.
- 초기식은 처음 한 번만 실행되며, 조건이 거짓이 되면 반복을 종료한다.

**기본 형식**

```java
for (초기식; 조건식; 증감식) {
    실행문;
}
```

**실행 예제**

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
// 1 2 3 4 5 (각 줄에 출력)
```

**실행 순서**

1. 초기식 실행 : `int i = 1`
2. 조건식 검사 : `i <= 5`
3. 조건이 참이면 실행문 수행
4. 증감식 실행 : `i++`
5. 조건식을 다시 검사하고 반복
6. 조건이 거짓이면 반복 종료

**다양한 증감식 활용**

```java
// 1부터 10까지 2씩 증가
for (int i = 1; i <= 10; i += 2) {
    System.out.print(i + " ");
}
// 1 3 5 7 9

// 10부터 1까지 감소
for (int i = 10; i >= 1; i--) {
    System.out.print(i + " ");
}
// 10 9 8 7 6 5 4 3 2 1
```

**주의 : 반복 횟수를 설정할 때 `<`와 `<=`의 차이를 정확하게 구분해야 합니다.**

### 3. while문 실행 원리

- 조건식이 `true`인 동안 실행문을 반복한다.
- 반복 횟수가 정해져 있지 않고 특정 조건을 만족할 때까지 실행할 경우 유용하다.
- 조건을 먼저 검사하므로 처음부터 거짓이면 실행되지 않는다.

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
// 1 2 3 4 5 (각 줄에 출력)
```

**실행 순서**

1. 조건식 검사
2. 조건이 참이면 실행문 실행
3. 반복문 내부에서 상태 변경
4. 다시 조건식 검사
5. 조건이 거짓이면 종료

**주의 : 조건을 변경하는 증감식이나 종료 조건이 없다면 무한 루프가 발생할 수 있습니다.**

### 4. do-while문 실행 원리

- 조건을 검사하기 전에 실행문을 먼저 수행한다.
- 조건이 처음부터 거짓이어도 최소 한 번은 실행된다.
- 사용자 입력이나 메뉴 출력처럼 최초 실행이 필요한 상황에 적합하다.

```java
int i = 10;

do {
    System.out.println(i);
    i++;
} while (i <= 5);

// 10
```

- `while` : 조건 검사 → 실행
- `do-while` : 실행 → 조건 검사

**주의 : do-while문은 마지막 `while(조건식)` 뒤에 반드시 세미콜론(`;`)을 작성해야 합니다.**

### 5. 향상된 for문 (Enhanced for)

- 배열이나 컬렉션에 저장된 요소를 순서대로 하나씩 처리한다.
- 별도의 인덱스 변수나 증감식 없이 데이터를 순회할 수 있다.
- 일반 `for`문보다 간결하게 작성할 수 있다.

**기본 형식**

```java
for (데이터타입 변수명 : 배열또는컬렉션) {
    실행문;
}
```

**실행 예제**

```java
int[] scores = {80, 90, 75, 100};

for (int score : scores) {
    System.out.println(score);
}
// 80 90 75 100 (각 줄에 출력)
```

**일반 for문과 향상된 for문 비교**

| 구분 | 일반 for문 | 향상된 for문 |
|---|---|---|
| 인덱스 사용 | 가능 | 직접 제공하지 않음 |
| 배열 요소 접근 | `array[i]` | 요소를 변수로 받음 |
| 반복 범위 | 직접 설정 가능 | 전체 요소 순회 |
| 주요 용도 | 인덱스 제어, 값 변경 | 데이터 조회 및 순회 |

**주의 : 기본형 배열의 요소를 향상된 for문의 반복 변수에 대입하여 변경해도 원본 배열의 값은 변경되지 않습니다.**

### 6. break와 continue

반복문 실행 도중 특정 조건에 따라 실행 흐름을 변경할 때 사용한다.

| 구분 | `break` | `continue` |
|---|---|---|
| 의미 | 반복문 종료 | 현재 반복 건너뛰기 |
| 실행 흐름 | 반복문 밖으로 이동 | 다음 반복 단계로 이동 |
| 주요 용도 | 검색 종료, 종료 조건 | 특정 데이터 제외 |

**break 예제**

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break;
    }

    System.out.print(i + " ");
}
// 1 2 3 4
```

- `i`가 5가 되면 반복문을 즉시 종료한다.
- 일반 `break`는 가장 가까운 반복문을 종료한다.

**continue 예제**

```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue;
    }

    System.out.print(i + " ");
}
// 1 3 5 7 9
```

- 짝수일 때 현재 반복의 나머지 코드를 건너뛴다.
- `for`문에서는 증감식으로 이동한 후 조건을 다시 검사한다.
- `while`문에서는 조건식으로 이동하므로 상태 변경 위치에 주의해야 한다.

### 7. 라벨을 이용한 반복문 제어

- 중첩 반복문에서 일반 `break`를 사용하면 가장 안쪽 반복문만 종료된다.
- 라벨을 사용하면 지정한 바깥쪽 반복문까지 종료할 수 있다.

```java
outer:
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if (i == 2 && j == 2) {
            break outer;
        }

        System.out.println(i + ", " + j);
    }
}
```

**실행 결과**

```text
1, 1
1, 2
1, 3
2, 1
```

- `outer:` : 바깥쪽 반복문에 이름 지정
- `break outer;` : 해당 라벨이 지정된 반복문 종료

**주의 : 라벨이 있는 break는 지정된 반복문 전체를 종료하지만, 일반 break는 가장 가까운 반복문 하나만 종료합니다.**

### 8. 중첩 반복문 (Nested Loop)

- 반복문 내부에 다른 반복문을 작성하는 구조이다.
- 바깥쪽 반복문이 한 번 실행될 때 안쪽 반복문이 자신의 반복을 수행한다.
- 구구단, 별 출력, 2차원 데이터 처리 등에 사용한다.

**별 삼각형 출력**

```java
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }

    System.out.println();
}
```

**실행 결과**

```text
*
**
***
****
*****
```

- 바깥쪽 `i` : 출력할 줄의 개수
- 안쪽 `j` : 한 줄에 출력할 별의 개수
- `println()` : 줄바꿈 처리

### 9. 반복문을 활용한 데이터 처리

반복문은 데이터를 순차적으로 확인하고 계산하거나 특정 조건에 해당하는 값만 처리하는 데 사용된다.

**1부터 100까지 합계 구하기**

```java
int sum = 0;

for (int i = 1; i <= 100; i++) {
    sum += i;
}

System.out.println(sum); // 5050
```

**짝수만 출력하기**

```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 != 0) {
        continue;
    }

    System.out.print(i + " ");
}
// 2 4 6 8 10
```

**배열에서 최댓값 찾기**

```java
int[] numbers = {10, 40, 20, 50};

int max = numbers[0];

for (int num : numbers) {
    if (num > max) {
        max = num;
    }
}

System.out.println(max); // 50
```

- 합계 계산 : 반복하면서 값을 누적
- 조건 필터링 : 조건에 해당하는 값만 처리
- 최대·최솟값 검색 : 현재 값을 기준값과 비교하면서 갱신
- 배열 역순 처리 : 인덱스를 마지막부터 감소시키며 접근
- 버블 정렬 : 중첩 반복문으로 인접 요소를 비교하고 교환

### 10. 반복문 작성 시 주의사항

| 주의사항 | 원인 및 해결 방법 |
|---|---|
| 무한 루프 | 조건이 계속 참이면 종료되지 않으므로 상태 변화 확인 |
| 반복 횟수 오류 | `<`, `<=`, `>`, `>=` 범위 확인 |
| 증감식 누락 | 반복 변수가 변경되는지 확인 |
| do-while 문법 오류 | 마지막 세미콜론(`;`) 확인 |
| 빈 반복문 | 조건식 뒤에 불필요한 세미콜론이 있는지 확인 |
| break 범위 오류 | 종료되는 반복문의 위치 확인 |
| continue 사용 오류 | 건너뛴 뒤 상태가 올바르게 변경되는지 확인 |

### ✅ Day6 핵심 정리

| 구분 | 핵심 내용 |
|---|---|
| `for` | 초기식 → 조건식 → 실행문 → 증감식 |
| `while` | 조건이 참인 동안 반복 |
| `do-while` | 실행 후 조건 검사, 최소 1회 실행 |
| 향상된 `for` | 배열과 컬렉션 요소를 순서대로 처리 |
| `break` | 가장 가까운 반복문 즉시 종료 |
| `continue` | 현재 반복을 건너뛰고 다음 반복 진행 |
| 라벨이 있는 `break` | 지정한 바깥쪽 반복문 종료 |
| 중첩 반복문 | 반복문 내부에 다른 반복문 작성 |
| 데이터 처리 | 합계, 필터링, 검색, 정렬 등에 활용 |

- 반복문은 초기값, 종료 조건, 상태 변화가 중요하다.
- `for`는 횟수 중심, `while`은 조건 중심으로 사용한다.
- `do-while`은 반드시 한 번 실행해야 하는 작업에 적합하다.
- 향상된 `for`문은 배열 및 컬렉션 순회에 유용하다.
- `break`와 `continue`는 반복의 종료 여부가 다르다.
- 중첩 반복문에서는 바깥쪽과 안쪽 반복문의 실행 순서를 이해해야 한다.
- 조건식과 증감식을 잘못 설정하면 무한 루프나 반복 횟수 오류가 발생할 수 있다.

</details>


## Day7. 반복 제어문, String과 배열
<details>

### 🎯 학습 목표
- `break`, `continue`, 라벨을 이용한 반복문 제어를 이해한다.
- `String` 클래스의 특징과 문자열 불변성을 이해한다.
- 문자열의 참조 비교와 내용 비교를 구분할 수 있다.
- 주요 문자열 메서드의 기능과 사용법을 익힌다.
- 1차원 배열의 선언, 생성, 초기화 방법을 이해한다.
- 반복문을 이용하여 배열의 요소를 처리할 수 있다.
- `Arrays` 클래스의 주요 메서드를 활용할 수 있다.

### 1. 반복문 흐름 제어

반복문의 실행 흐름을 변경하는 주요 명령어는 `break`, `continue`, 라벨이 있는 `break`이다.

| 구분 | 역할 | 실행 결과 |
|---|---|---|
| `break` | 가장 가까운 반복문 종료 | 반복문 밖으로 이동 |
| `continue` | 현재 반복의 나머지 실행문 생략 | 다음 반복 단계로 이동 |
| `break label` | 지정한 반복문 종료 | 해당 반복문 밖으로 이동 |
| `continue label` | 지정한 반복문의 현재 회차 종료 | 해당 반복문의 다음 회차 진행 |

**break 예제**

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        break;
    }

    System.out.println(i);
}
// 1 2
```

**continue 예제**

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;
    }

    System.out.println(i);
}
// 1 2 4 5
```

**주의 : while문에서 continue를 사용할 경우 반복 변수의 변경이 생략되면 무한 루프가 발생할 수 있습니다.**

### 2. 라벨을 이용한 중첩 반복문 제어

- 일반적인 `break`는 가장 안쪽 반복문만 종료한다.
- 라벨을 사용하면 특정 바깥쪽 반복문까지 종료할 수 있다.
- 중첩 반복문 전체를 종료해야 하는 상황에서 사용한다.

```java
outer:
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if (i == 2 && j == 2) {
            break outer;
        }

        System.out.println(i + ", " + j);
    }
}
```

실행 결과

```text
1, 1
1, 2
1, 3
2, 1
```

- `outer:` : 바깥쪽 반복문에 라벨 지정
- `break outer;` : 라벨이 지정된 반복문 종료
- `continue outer;` : 바깥쪽 반복문의 다음 회차로 이동

### 3. String 클래스의 특징

`String`은 문자열을 저장하고 처리하기 위한 Java의 참조 타입 클래스이다.

**주요 특징**

- 문자열은 큰따옴표(`" "`)로 표현한다.
- `String`은 기본 타입이 아닌 참조 타입이다.
- 문자열은 여러 문자로 구성되며 인덱스로 각 위치에 접근할 수 있다.
- `String` 객체는 불변(Immutable) 객체이다.

**문자열 생성 방법**

```java
String str1 = "Java";
String str2 = new String("Java");
```

| 생성 방법 | 특징 |
|---|---|
| 문자열 리터럴 | 문자열 풀(String Pool)의 객체를 참조 |
| `new String()` | 새로운 String 객체 생성 |

**문자열 불변성 (Immutability)**

- `String` 객체는 생성된 이후 내부 문자열 내용을 변경할 수 없다.
- 문자열을 변경하는 메서드는 기존 객체를 수정하지 않고 결과 문자열을 반환한다.

```java
String str = "Hello";

str.concat(" Java");
System.out.println(str); // Hello

str = str.concat(" Java");
System.out.println(str); // Hello Java
```

**주의 : 문자열 메서드의 결과를 사용하려면 반환값을 변수에 저장하거나 직접 활용해야 합니다.**

### 4. 문자열 비교

문자열 비교에서는 객체의 참조와 실제 문자열 내용을 구분해야 한다.

| 구분 | 비교 대상 |
|---|---|
| `==` | 동일한 객체를 참조하는지 비교 |
| **`equals()`** | 문자열 내용이 같은지 비교 |
| `equalsIgnoreCase()` | 대소문자를 무시하고 내용 비교 |
| **`compareTo()`** | 문자열의 사전식 순서 비교 |

```java
String str1 = "Java";
String str2 = new String("Java");

System.out.println(str1 == str2);      // false
System.out.println(str1.equals(str2)); // true

System.out.println(
    str1.equalsIgnoreCase("JAVA")
); // true
```

**compareTo() 예제**

```java
System.out.println("ABC".compareTo("ABC")); // 0
System.out.println("ABC".compareTo("ABD")); // 음수
System.out.println("ABD".compareTo("ABC")); // 양수
```

- 음수 : 비교 대상보다 사전식 순서가 앞선다.
- 0 : 두 문자열의 내용이 같다.
- 양수 : 비교 대상보다 사전식 순서가 뒤에 있다.

**주의 : 문자열의 내용을 비교할 때는 `==` 대신 `equals()`를 사용하는 것이 일반적입니다.**

### 5. 문자열 길이와 문자 추출

문자열은 0부터 시작하는 인덱스를 이용하여 특정 문자에 접근할 수 있다.

| 메서드 | 기능 | 반환 타입 |
|---|---|---|
| **`length()`** | 문자열 길이 반환 | int |
| **`charAt(index)`** | 특정 위치의 문자 반환 | char |
| `substring(begin)` | 시작 위치부터 끝까지 추출 | String |
| **`substring(begin, end)`** | 지정된 범위의 문자열 추출 | String |

```java
String str = "Java Programming";

System.out.println(str.length());       // 16
System.out.println(str.charAt(0));      // J
System.out.println(str.substring(5));   // Programming
System.out.println(str.substring(5, 8)); // Pro
```

- 문자열 인덱스는 0부터 시작한다.
- `substring(begin, end)`는 시작 인덱스를 포함한다.
- 종료 인덱스는 포함하지 않는다.

**주의 : 문자열의 인덱스가 유효한 범위를 벗어나면 StringIndexOutOfBoundsException이 발생합니다.**

또한 `length()`는 UTF-16 코드 단위의 개수를 반환하므로, 모든 유니코드 문자가 반드시 길이 1로 계산되는 것은 아니다.

### 6. 문자열 검색 및 포함 여부

| 메서드 | 기능 |
|---|---|
| **`contains(str)`** | 특정 문자열 포함 여부 확인 |
| **`indexOf(str)`** | 처음 발견된 위치 반환 |
| `lastIndexOf(str)` | 마지막으로 발견된 위치 반환 |
| `startsWith(str)` | 특정 문자열로 시작하는지 확인 |
| `endsWith(str)` | 특정 문자열로 끝나는지 확인 |
| `isEmpty()` | 문자열 길이가 0인지 확인 |
| `isBlank()` | 비어 있거나 공백 문자만 있는지 확인 |

```java
String str = "Java Programming";

System.out.println(str.contains("Pro")); // true
System.out.println(str.indexOf("a"));    // 1
System.out.println(str.lastIndexOf("a"));// 3

System.out.println(str.startsWith("Java")); // true
System.out.println(str.endsWith("ing"));    // true
```

- `contains()`는 포함 여부를 `boolean`으로 반환한다.
- `indexOf()`는 해당 문자열의 시작 위치를 반환한다.
- 검색에 실패하면 `indexOf()`와 `lastIndexOf()`는 `-1`을 반환한다.

### 7. 문자열 변환과 공백 처리

| 메서드 | 기능 |
|---|---|
| `toUpperCase()` | 대문자로 변환 |
| `toLowerCase()` | 소문자로 변환 |
| **`replace(old, new)`** | 문자열 또는 문자 치환 |
| `trim()` | 양 끝의 일부 공백 제거 |
| **`strip()`** | 양 끝의 유니코드 공백 제거 |
| `stripLeading()` | 앞쪽 공백 제거 |
| `stripTrailing()` | 뒤쪽 공백 제거 |
| `String.valueOf()` | 값을 문자열로 변환 |

```java
String str = "Java";

System.out.println(str.toUpperCase()); // JAVA
System.out.println(str.toLowerCase()); // java
System.out.println(str.replace("a", "o")); // Jovo
```

**공백 제거 예제**

```java
String text = "  Java  ";

System.out.println(text.trim());  // Java
System.out.println(text.strip()); // Java
```

- `trim()`은 전통적인 방식으로 제한된 범위의 공백을 제거한다.
- `strip()`은 `Character.isWhitespace()` 기준으로 공백을 제거한다.
- `strip()`은 Java 11부터 사용할 수 있다.

### 8. 문자열 분리와 결합

**split()**

- 지정한 구분자를 기준으로 문자열을 분리한다.
- 분리 결과는 `String[]` 배열로 반환한다.
- 구분자는 정규 표현식(Regular Expression)으로 해석된다.

```java
String fruits = "사과,바나나,포도";

String[] result = fruits.split(",");

for (String fruit : result) {
    System.out.println(fruit);
}
// 사과
// 바나나
// 포도
```

**join()**

- 여러 문자열을 지정한 구분자로 연결한다.

```java
String date = String.join("-", "2026", "10", "20");

System.out.println(date); // 2026-10-20
```

**주의 : split()에서 마침표(`.`), 파이프(`|`) 등 정규식 특수문자를 구분자로 사용할 경우 이스케이프 처리가 필요합니다.**

### 9. StringBuilder와 문자열 연결

- `String`은 불변 객체이므로 문자열을 반복적으로 결합할 때 중간 객체가 생성될 수 있다.
- `StringBuilder`는 변경 가능한 문자 시퀀스를 제공한다.
- 반복적인 문자열 수정 작업에서는 `StringBuilder`를 활용할 수 있다.

```java
StringBuilder sb = new StringBuilder();

sb.append("Java");
sb.append(" Programming");

String result = sb.toString();

System.out.println(result); // Java Programming
```

| 구분 | String | StringBuilder |
|---|---|---|
| 변경 가능 여부 | 불변 | 변경 가능 |
| 문자열 수정 | 새로운 문자열 결과 생성 | 내부 문자 시퀀스 수정 |
| 주요 용도 | 일반적인 문자열 처리 | 반복적인 문자열 결합 및 수정 |

### 10. 1차원 배열의 개념

배열(Array)은 동일한 타입의 여러 값을 하나의 변수명으로 관리하는 자료구조이다.

**주요 특징**

- 같은 타입의 데이터를 여러 개 저장한다.
- 배열의 각 요소는 인덱스로 접근한다.
- 인덱스는 0부터 시작한다.
- 생성된 배열의 길이는 변경할 수 없다.
- 배열은 참조 타입 객체이다.

**배열 선언과 생성**

```java
int[] scores;
scores = new int[5];
```

**선언과 생성 동시에 작성**

```java
int[] scores = new int[5];
```

**값을 직접 지정하여 초기화**

```java
int[] scores = {80, 90, 75, 85, 95};
```

- `int[]` : 정수 배열 타입
- `scores` : 배열 객체를 참조하는 변수
- `new int[5]` : 5개의 요소를 가지는 배열 생성

### 11. 배열의 메모리 구조와 초기값

- 배열 변수에는 배열 객체를 참조하는 값이 저장된다.
- 실제 배열 요소는 생성된 배열 객체 내부에 저장된다.
- 배열 객체는 힙(Heap) 영역에 생성된다.
- `new`로 생성한 배열의 요소는 타입별 기본값으로 초기화된다.

| 데이터 타입 | 기본값 |
|---|---|
| byte, short, int, long | 0 |
| float, double | 0.0 |
| char | '\u0000' |
| boolean | false |
| 참조 타입 | null |

```java
int[] numbers = new int[3];

System.out.println(numbers[0]); // 0
System.out.println(numbers[1]); // 0
System.out.println(numbers[2]); // 0
```

**주의 : 배열의 요소는 자동 초기화되지만, 지역 변수로 선언한 배열 참조 변수는 사용 전에 반드시 초기화해야 합니다.**

### 12. 배열 요소 접근과 길이

배열은 인덱스를 이용해 요소를 조회하거나 수정할 수 있다.

```java
int[] scores = {80, 90, 70, 85, 95};

// 요소 조회
System.out.println(scores[0]); // 80

// 요소 수정
scores[1] = 100;

// 배열 길이
System.out.println(scores.length); // 5
```

- `scores[0]` : 첫 번째 요소
- `scores.length` : 배열의 전체 요소 개수
- 마지막 인덱스 : `scores.length - 1`

**주의 사항**

- 배열 길이는 메서드가 아닌 필드 `length`로 확인한다.
- 문자열은 `length()` 메서드를 사용한다.
- 잘못된 인덱스로 접근하면 `ArrayIndexOutOfBoundsException`이 발생한다.

### 13. 배열과 반복문

배열의 요소를 순회하는 방법에는 일반 `for`문과 향상된 `for`문이 있다.

**일반 for문**

```java
int[] scores = {80, 90, 75};

for (int i = 0; i < scores.length; i++) {
    System.out.println(scores[i]);
}
```

**향상된 for문**

```java
int[] scores = {80, 90, 75};

for (int score : scores) {
    System.out.println(score);
}
```

| 구분 | 일반 for문 | 향상된 for문 |
|---|---|---|
| 인덱스 접근 | 가능 | 직접 제공하지 않음 |
| 특정 요소 수정 | 가능 | 반복 변수에 대입해도 원본 요소는 바뀌지 않음 |
| 역순 탐색 | 가능 | 기본적으로 순차 순회 |
| 주요 용도 | 인덱스 기반 제어 | 전체 요소 조회 |

**주의 : 기본형 배열의 향상된 for문에서 반복 변수 값을 변경해도 원본 배열은 수정되지 않습니다.**

### 14. 배열을 활용한 데이터 처리

**합계와 평균 계산**

```java
int[] scores = {80, 90, 70, 100};

int sum = 0;

for (int score : scores) {
    sum += score;
}

double avg = (double) sum / scores.length;

System.out.println(sum); // 340
System.out.println(avg); // 85.0
```

**최댓값과 최솟값**

```java
int[] numbers = {45, 12, 89, 34, 67};

int max = numbers[0];
int min = numbers[0];

for (int num : numbers) {
    if (num > max) {
        max = num;
    }

    if (num < min) {
        min = num;
    }
}

System.out.println(max); // 89
System.out.println(min); // 12
```

- 최댓값과 최솟값은 첫 번째 요소를 기준으로 초기화할 수 있다.
- 배열이 비어 있지 않은지 먼저 확인해야 한다.
- 평균 계산 시 실수형으로 변환하면 정수 나눗셈에 따른 소수점 손실을 방지할 수 있다.

### 15. Arrays 클래스

`java.util.Arrays`는 배열을 처리하기 위한 유틸리티 메서드를 제공한다.

| 메서드 | 기능 |
|---|---|
| `Arrays.toString()` | 배열 요소를 문자열 형태로 반환 |
| `Arrays.sort()` | 배열 요소 정렬 |
| `Arrays.copyOf()` | 배열 복사 |
| `Arrays.binarySearch()` | 정렬된 배열에서 값 검색 |
| `Arrays.equals()` | 두 배열의 요소 비교 |
| `Arrays.fill()` | 배열 요소를 지정한 값으로 채움 |

```java
import java.util.Arrays;

int[] numbers = {30, 10, 20};

// 배열 출력
System.out.println(Arrays.toString(numbers));
// [30, 10, 20]

// 배열 정렬
Arrays.sort(numbers);
System.out.println(Arrays.toString(numbers));
// [10, 20, 30]

// 배열 복사
int[] copied = Arrays.copyOf(numbers, numbers.length);

// 배열 내용 비교
System.out.println(Arrays.equals(numbers, copied));
// true
```

**주의 사항**

- `Arrays.sort()`는 전달된 배열 자체를 정렬한다.
- `Arrays.copyOf()`는 새로운 배열을 생성한다.
- `Arrays.binarySearch()`는 정렬 상태가 전제되어야 올바른 검색 결과를 기대할 수 있다.
- 일반적인 `==`는 배열의 내용이 아닌 참조 동일성을 비교한다.

### 16. 자주 발생하는 오류 및 주의사항

| 주의사항 | 원인 및 해결 방법 |
|---|---|
| 문자열을 `==`로 비교 | 내용 비교에는 `equals()` 사용 |
| null 문자열에 메서드 호출 | NullPointerException 발생 가능 |
| 문자열 불변성 간과 | 문자열 연산 결과를 다시 저장 |
| 문자열 인덱스 오류 | 인덱스 범위 확인 |
| 반복적인 문자열 결합 | 필요하면 StringBuilder 사용 |
| 배열 인덱스 오류 | 0부터 length - 1까지 접근 |
| 배열 길이 변경 시도 | 새로운 배열을 생성해야 함 |
| 향상된 for문으로 값 수정 | 원본 수정에는 인덱스 기반 접근 |
| 배열을 `==`로 비교 | 내용 비교에는 Arrays.equals() 사용 |
| 배열 미초기화 | 참조 변수의 초기화 여부 확인 |
| while문에서 continue | 증감식 실행 여부 확인 |

### ✅ Day7 핵심 정리

| 구분 | 핵심 내용 |
|---|---|
| `break` | 가장 가까운 반복문 종료 |
| `continue` | 현재 반복 건너뛰기 |
| 라벨 | 중첩 반복문의 실행 흐름 제어 |
| `String` | 문자열을 표현하는 불변 참조 타입 |
| 문자열 비교 | 내용 비교는 equals() 사용 |
| 문자열 추출 | charAt(), substring() |
| 문자열 검색 | contains(), indexOf() |
| 문자열 변환 | replace(), toUpperCase(), strip() |
| 문자열 분리 | split()으로 String 배열 반환 |
| 문자열 결합 | join(), StringBuilder |
| 1차원 배열 | 동일 타입의 여러 데이터를 저장 |
| 배열 길이 | length 필드 사용 |
| 배열 순회 | 일반 for문, 향상된 for문 |
| Arrays 클래스 | 출력, 정렬, 복사, 비교 등의 기능 제공 |

- `String`은 불변 객체이므로 문자열 연산은 기존 객체의 내용을 직접 변경하지 않는다.
- 문자열 내용 비교는 `equals()`를 사용하는 것이 일반적이다.
- 문자열과 배열은 모두 0부터 시작하는 인덱스를 사용한다.
- 문자열 길이는 `length()`, 배열 길이는 `length`로 확인한다.
- 배열은 생성 후 크기를 변경할 수 없으며 요소는 기본값으로 초기화된다.
- 배열 요소를 수정할 때는 일반 `for`문과 인덱스를 활용할 수 있다.
- `Arrays` 클래스는 배열 처리에 필요한 다양한 유틸리티 메서드를 제공한다.
- 참조 타입의 객체 비교와 실제 데이터 내용 비교를 구분해야 한다.

</details>



## Day8. String과 배열 심화 및 메서드
<details>

### 🎯 학습 목표
- 메서드의 역할과 선언 및 호출 구조를 이해한다.
- `String` 클래스의 불변성과 문자열 풀의 원리를 이해한다.
- 문자열을 검색, 추출, 변환하는 주요 메서드를 활용할 수 있다.
- `String`과 `StringBuilder`의 차이를 구분한다.
- 배열의 메모리 구조와 참조 변수의 특징을 이해한다.
- 배열의 얕은 복사와 깊은 복사의 차이를 이해한다.
- 배열 복사 및 `Arrays` 유틸리티를 사용할 수 있다.
- 배열과 `ArrayList`의 차이 및 사용 목적을 이해한다.

### 1. 메서드의 개념과 구조

메서드(Method)는 특정 기능을 수행하는 코드를 하나로 묶은 것으로, 필요할 때 호출하여 재사용할 수 있다.

- 반복되는 코드를 줄이고 기능별로 분리할 수 있다.
- 매개변수(Parameter)를 통해 외부 데이터를 전달받는다.
- `return`을 통해 실행 결과를 반환할 수 있다.
- 반환할 값이 없는 메서드는 `void`를 사용한다.

**기본 구조**

```java
static int add(int a, int b) {
    return a + b;
}
```

| 구성 요소 | 설명 |
|---|---|
| `static` | 객체 생성 없이 클래스 이름으로 호출 가능 |
| `int` | 반환 타입 |
| `add` | 메서드 이름 |
| `int a, int b` | 매개변수 |
| `return` | 결과값 반환 및 메서드 종료 |

**메서드 호출 예제**

```java
public class MethodExample {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(10, 20);

        System.out.println(result); // 30
    }
}
```

**실행 흐름**

1. `add(10, 20)` 메서드 호출
2. 매개변수 `a`, `b`에 값 전달
3. 메서드 내부에서 `a + b` 계산
4. `return`으로 결과 반환
5. 호출한 위치에서 반환값 사용

### 2. String 클래스와 불변성

`String`은 문자열을 표현하고 처리하는 참조 타입 클래스이다.

**주요 특징**

- 문자열은 큰따옴표(`" "`)로 표현한다.
- `String`은 기본 타입이 아닌 참조 타입이다.
- `String` 객체는 불변(Immutable) 객체이다.
- 문자열 처리 메서드는 기존 내용을 직접 수정하지 않는다.

**문자열 불변성**

```java
String str = "Java";

str.toUpperCase();
System.out.println(str); // Java

str = str.toUpperCase();
System.out.println(str); // JAVA
```

- `toUpperCase()`는 대문자로 변환된 문자열을 반환한다.
- 반환값을 사용하지 않으면 기존 변수의 값은 변경되지 않는다.

**주의 : String 객체는 생성 후 내용을 변경할 수 없으므로, 문자열 연산의 결과를 사용하려면 반환값을 저장해야 합니다.**

### 3. String Pool과 문자열 비교

Java는 문자열 리터럴을 문자열 풀(String Pool)에서 관리한다.

동일한 문자열 리터럴은 일반적으로 같은 `String` 객체를 공유한다.

```java
String s1 = "Java";
String s2 = "Java";
String s3 = new String("Java");

System.out.println(s1 == s2);      // true
System.out.println(s1 == s3);      // false
System.out.println(s1.equals(s3)); // true
```

| 구분 | 특징 |
|---|---|
| 문자열 리터럴 | String Pool의 객체 참조 |
| `new String()` | 새로운 String 객체 생성 |
| `==` | 두 참조가 같은 객체를 가리키는지 비교 |
| `equals()` | 문자열 내용이 같은지 비교 |

- `s1`과 `s2`는 같은 문자열 리터럴 객체를 참조한다.
- `s3`는 `new`로 생성한 별도의 객체를 참조한다.
- 객체가 달라도 문자열 내용은 같을 수 있다.

**주의 : 문자열의 실제 내용을 비교할 때는 일반적으로 `equals()`를 사용해야 합니다.**

### 4. 문자열 검색과 추출

`String` 클래스는 문자열의 길이, 특정 문자 및 문자열 위치를 확인하는 메서드를 제공한다.

| 메서드 | 기능 |
|---|---|
| `length()` | 문자열 길이 반환 |
| `charAt(index)` | 특정 인덱스의 문자 반환 |
| `indexOf(str)` | 처음 등장하는 문자열의 위치 반환 |
| `lastIndexOf(str)` | 마지막으로 등장하는 위치 반환 |
| `contains(str)` | 특정 문자열 포함 여부 확인 |
| `substring(begin)` | 지정 위치부터 끝까지 추출 |
| `substring(begin, end)` | 지정된 범위의 문자열 추출 |

**문자열 검색 예제**

```java
String str = "JavaSpring";

System.out.println(str.length());       // 10
System.out.println(str.charAt(0));      // J
System.out.println(str.indexOf("v"));   // 2
System.out.println(str.lastIndexOf("a"));// 3
System.out.println(str.contains("Spring")); // true
```

**문자열 추출 예제**

```java
String str = "JavaSpring";

System.out.println(str.substring(4));    // Spring
System.out.println(str.substring(0, 4)); // Java
```

- 문자열 인덱스는 0부터 시작한다.
- `substring(begin, end)`의 시작 인덱스는 포함한다.
- 종료 인덱스는 포함하지 않는다.
- 검색 실패 시 `indexOf()`는 `-1`을 반환한다.

**주의 : 유효한 인덱스 범위를 벗어나면 StringIndexOutOfBoundsException이 발생합니다.**

### 5. 문자열 변환과 정제

문자열의 대소문자를 변환하거나 공백을 제거하는 등의 작업을 수행할 수 있다.

| 메서드 | 기능 |
|---|---|
| `toUpperCase()` | 대문자로 변환 |
| `toLowerCase()` | 소문자로 변환 |
| `trim()` | 양 끝의 일부 공백 제거 |
| `strip()` | 양 끝의 유니코드 공백 제거 |
| `replace(old, new)` | 특정 문자열을 다른 문자열로 치환 |
| `isEmpty()` | 길이가 0인지 확인 |
| `isBlank()` | 비어 있거나 공백만 있는지 확인 |

```java
String str = "  Java  ";

System.out.println(str.trim());  // Java
System.out.println(str.strip()); // Java

System.out.println("java".toUpperCase()); // JAVA
System.out.println("JAVA".toLowerCase()); // java
System.out.println("Java".replace("a", "o")); // Jovo
```

**trim()과 strip() 비교**

- `trim()` : 전통적인 공백 제거 방식
- `strip()` : 유니코드 공백 판별 기준 사용
- `strip()`은 Java 11부터 지원한다.

### 6. 문자열 분리와 결합

**split()**

- 특정 구분자를 기준으로 문자열을 분리한다.
- 결과를 `String[]` 배열로 반환한다.

```java
String data = "apple,banana,orange";

String[] fruits = data.split(",");

for (String fruit : fruits) {
    System.out.println(fruit);
}
// apple
// banana
// orange
```

**join()**

- 여러 문자열을 지정된 구분자로 연결한다.

```java
String date = String.join("-", "2026", "10", "21");

System.out.println(date); // 2026-10-21
```

**주의 : split()의 구분자는 정규 표현식으로 처리되므로, 정규식 특수문자를 사용할 때 이스케이프 처리가 필요합니다.**

### 7. String과 StringBuilder

`String`은 불변 객체이지만 `StringBuilder`는 내부 문자 시퀀스를 수정할 수 있다.

| 구분 | String | StringBuilder |
|---|---|---|
| 객체 특성 | 불변 | 가변 |
| 문자열 수정 | 기존 객체의 내용 수정 불가 | 내부 문자 시퀀스 수정 가능 |
| 주요 사용 | 일반적인 문자열 처리 | 반복적인 문자열 수정 및 연결 |
| 대표 메서드 | `concat()` | `append()` |

**String 예제**

```java
String str = "Java";

str = str.concat(" Programming");

System.out.println(str); // Java Programming
```

**StringBuilder 예제**

```java
StringBuilder sb = new StringBuilder();

sb.append("Java");
sb.append(" Programming");

System.out.println(sb.toString());
// Java Programming
```

- `concat()`은 결합된 문자열을 반환한다.
- `append()`는 기존 `StringBuilder`의 내용을 변경한다.
- 반복적으로 많은 문자열을 연결할 때는 `StringBuilder`가 유리할 수 있다.

### 8. 배열의 구조와 메모리

배열(Array)은 동일한 타입의 여러 데이터를 하나의 배열 객체에 저장하는 자료구조이다.

**주요 특징**

- 배열은 참조 타입이다.
- 배열의 인덱스는 0부터 시작한다.
- 생성된 배열의 길이는 변경할 수 없다.
- 배열 요소는 선언한 타입의 값만 저장할 수 있다.
- 배열 객체는 힙(Heap) 영역에 생성된다.

**배열 선언 및 생성**

```java
int[] numbers = {10, 20, 30, 40, 50};
```

**메모리 구조의 개념**

```text
numbers (참조 변수)
    |
    v
int[] 배열 객체
+----+----+----+----+----+
| 10 | 20 | 30 | 40 | 50 |
+----+----+----+----+----+
   0    1    2    3    4
```

- 배열 변수는 배열 객체를 참조한다.
- 각 요소는 인덱스를 이용하여 접근한다.
- 배열의 전체 요소 개수는 `length` 필드로 확인한다.

### 9. 배열 생성과 초기화

배열은 여러 방법으로 생성하고 초기화할 수 있다.

**선언과 동시에 초기화**

```java
int[] scores = {90, 80, 70};
```

**배열 크기 지정**

```java
int[] scores = new int[3];

scores[0] = 90;
scores[1] = 80;
scores[2] = 70;
```

**new 연산자로 배열 초기화**

```java
int[] scores;
scores = new int[]{90, 80, 70};
```

**배열 요소의 기본값**

| 데이터 타입 | 기본값 |
|---|---|
| 정수 타입 | 0 |
| 실수 타입 | 0.0 |
| char | '\u0000' |
| boolean | false |
| 참조 타입 | null |

- `new`로 생성한 배열의 요소는 타입에 따른 기본값으로 초기화된다.
- 배열 참조 변수가 지역 변수라면 사용 전에 반드시 초기화해야 한다.

### 10. 배열의 참조 공유

배열은 참조 타입이므로 배열 변수를 다른 변수에 대입하면 같은 배열 객체를 공유한다.

```java
int[] a = {10, 20, 30};

int[] b = a;

b[0] = 999;

System.out.println(a[0]); // 999
System.out.println(b[0]); // 999
```

- `b = a`는 새로운 배열을 생성하지 않는다.
- 두 변수는 동일한 배열 객체를 참조한다.
- 한쪽에서 요소를 변경하면 다른 쪽에서도 변경된 값이 보인다.

**주의 : 참조 변수의 단순 대입은 배열 복사가 아니라 참조값의 복사입니다.**

### 11. 배열 복사 방법

배열을 독립적으로 사용하려면 새로운 배열 객체를 생성해야 한다.

| 복사 방법 | 특징 |
|---|---|
| `=` | 참조값만 복사, 같은 배열 공유 |
| `clone()` | 같은 길이의 새 배열 생성 |
| `Arrays.copyOf()` | 지정한 길이로 새 배열 생성 |
| `System.arraycopy()` | 기존 배열의 특정 구간 복사 |
| 일반 `for`문 | 요소를 직접 순회하며 복사 |

**clone()**

```java
int[] original = {10, 20, 30};

int[] copied = original.clone();

copied[0] = 999;

System.out.println(original[0]); // 10
System.out.println(copied[0]);   // 999
```

**Arrays.copyOf()**

```java
import java.util.Arrays;

int[] original = {10, 20, 30};

int[] copied = Arrays.copyOf(original, original.length);
```

**System.arraycopy()**

```java
int[] source = {10, 20, 30, 40};
int[] target = new int[3];

System.arraycopy(source, 1, target, 0, 3);

// target = {20, 30, 40}
```

`System.arraycopy()`의 인자 순서

```java
System.arraycopy(
    원본배열, 원본시작인덱스,
    대상배열, 대상시작인덱스,
    복사개수
);
```

### 12. 얕은 복사와 깊은 복사

**얕은 복사 (Shallow Copy)**

- 새로운 배열 객체는 생성하지만 내부 참조 요소는 공유할 수 있다.
- 객체 배열이나 다차원 배열에서 주의해야 한다.

**깊은 복사 (Deep Copy)**

- 내부의 변경 가능한 객체나 중첩 배열까지 독립적으로 복사하는 방식이다.
- 복사본을 수정해도 원본에 영향을 주지 않도록 구성한다.

**다차원 배열 예제**

```java
int[][] original = {{1, 2}, {3, 4}};

// 얕은 복사
int[][] shallow = original.clone();

shallow[0][0] = 99;

System.out.println(original[0][0]); // 99
```

**내부 배열까지 복사**

```java
int[][] original = {{1, 2}, {3, 4}};

int[][] deep = new int[original.length][];

for (int i = 0; i < original.length; i++) {
    deep[i] = original[i].clone();
}

deep[0][0] = 99;

System.out.println(original[0][0]); // 1
```

**주의 : 기본형 1차원 배열은 clone()으로 요소값을 독립적으로 복사할 수 있지만, 객체 배열과 다차원 배열에서는 내부 참조까지 복사해야 하는지 확인해야 합니다.**

### 13. 일반 for문과 향상된 for문

| 구분 | 일반 for문 | 향상된 for문 |
|---|---|---|
| 인덱스 사용 | 가능 | 직접 제공하지 않음 |
| 특정 요소 수정 | 가능 | 반복 변수 대입만으로는 원본 수정 불가 |
| 역순 순회 | 가능 | 기본적으로 순차 순회 |
| 주요 용도 | 인덱스 기반 처리 | 전체 요소 조회 |

**일반 for문**

```java
int[] numbers = {10, 20, 30};

for (int i = 0; i < numbers.length; i++) {
    numbers[i] += 10;
}
```

**향상된 for문**

```java
int[] numbers = {10, 20, 30};

for (int num : numbers) {
    System.out.println(num);
}
```

**주의 : 기본형 배열에서 향상된 for문의 반복 변수 값을 변경하더라도 원본 배열의 요소는 변경되지 않습니다.**

### 14. 배열을 이용한 데이터 처리

**합계와 평균**

```java
int[] scores = {90, 80, 70, 100};

int sum = 0;

for (int score : scores) {
    sum += score;
}

double avg = (double) sum / scores.length;

System.out.println(sum); // 340
System.out.println(avg); // 85.0
```

**최댓값과 최솟값**

```java
int[] numbers = {30, 10, 50, 20};

int max = numbers[0];
int min = numbers[0];

for (int num : numbers) {
    if (num > max) {
        max = num;
    }

    if (num < min) {
        min = num;
    }
}

System.out.println(max); // 50
System.out.println(min); // 10
```

**특정 값 검색**

```java
String[] names = {"김민수", "이영희", "박철수"};

String target = "이영희";

for (int i = 0; i < names.length; i++) {
    if (names[i].equals(target)) {
        System.out.println(i); // 1
        break;
    }
}
```

- 평균 계산 시 정수 나눗셈을 주의해야 한다.
- 최댓값과 최솟값은 배열의 첫 번째 요소로 초기화할 수 있다.
- 배열이 비어 있는 경우를 먼저 확인해야 한다.

### 15. Arrays 유틸리티 클래스

`java.util.Arrays`는 배열을 처리하기 위한 다양한 정적 메서드를 제공한다.

| 메서드 | 기능 |
|---|---|
| `Arrays.toString()` | 배열 요소를 문자열로 표현 |
| `Arrays.sort()` | 배열 요소 정렬 |
| `Arrays.fill()` | 배열 전체를 특정 값으로 채우기 |
| `Arrays.copyOf()` | 새로운 배열로 복사 |

```java
import java.util.Arrays;

int[] numbers = {30, 10, 50, 20};

// 배열 출력
System.out.println(Arrays.toString(numbers));
// [30, 10, 50, 20]

// 오름차순 정렬
Arrays.sort(numbers);

System.out.println(Arrays.toString(numbers));
// [10, 20, 30, 50]

// 특정 값으로 채우기
Arrays.fill(numbers, 7);

System.out.println(Arrays.toString(numbers));
// [7, 7, 7, 7]
```

**주의 : Arrays.sort()와 Arrays.fill()은 전달된 배열의 내용을 직접 변경합니다.**

### 16. 배열과 ArrayList의 차이

배열은 크기가 고정된 자료구조이며, `ArrayList`는 요소 개수에 따라 내부 저장 공간을 조정하는 컬렉션이다.

| 구분 | Array | ArrayList |
|---|---|---|
| 크기 | 생성 후 고정 | 필요에 따라 확장 |
| 요소 접근 | `arr[index]` | `list.get(index)` |
| 요소 개수 | `length` | `size()` |
| 데이터 추가 | 크기 변경 불가 | `add()` 사용 |
| 저장 타입 | 기본형, 참조형 | 참조형 |

**배열 예제**

```java
String[] names = new String[3];

names[0] = "Java";
names[1] = "Spring";
names[2] = "SQL";
```

**ArrayList 예제**

```java
import java.util.ArrayList;

ArrayList<String> names = new ArrayList<>();

names.add("Java");
names.add("Spring");
names.add("SQL");

System.out.println(names.size()); // 3
```

- 데이터 개수가 고정되어 있다면 배열을 사용할 수 있다.
- 데이터의 추가 및 삭제가 빈번하다면 `ArrayList`가 유용하다.
- 컬렉션의 자세한 구조는 이후 Java 컬렉션 학습에서 다룬다.

### 17. Java 웹 개발에서의 배열 활용

배열은 웹 애플리케이션에서도 여러 데이터를 한 번에 처리할 때 사용한다.

| 사용 사례 | 예시 |
|---|---|
| 검색 조건 | 여러 카테고리 및 관심 분야 |
| 데이터 처리 | 여러 ID 또는 점수 처리 |
| 통계 | 일별 방문자 수, 월별 매출 |
| API | JSON 배열 형태의 데이터 수신 |
| 설정값 | 고정된 수치나 코드 목록 |

- 웹 API에서는 배열 형태의 JSON 데이터를 수신할 수 있다.
- 고정된 개수의 데이터는 배열로 처리할 수 있다.
- 크기가 변하는 목록은 일반적으로 `List` 등을 활용한다.
- Spring Boot에서는 요청 데이터를 배열이나 컬렉션 형태로 전달받을 수 있다.

### 18. 자주 발생하는 오류 및 주의사항

| 주의사항 | 원인 및 해결 방법 |
|---|---|
| String 반환값 미사용 | 변환된 문자열을 변수에 저장 |
| 문자열 `==` 비교 | 내용 비교 시 `equals()` 사용 |
| 문자열 인덱스 오류 | `length()` 기준으로 범위 확인 |
| 배열 인덱스 오류 | `0`부터 `length - 1`까지 접근 |
| 배열 참조 공유 | 단순 대입은 객체를 복사하지 않음 |
| 얕은 복사 문제 | 내부 객체의 참조 공유 여부 확인 |
| 배열 크기 변경 | 새로운 배열 또는 ArrayList 사용 |
| 향상된 for문 수정 | 원본 요소 변경 시 인덱스 접근 활용 |
| 평균 계산 오류 | 정수 나눗셈과 빈 배열 주의 |
| 배열 출력 | 내용 확인 시 Arrays.toString() 사용 |

### ✅ Day8 핵심 정리

| 구분 | 핵심 내용 |
|---|---|
| 메서드 | 기능을 수행하는 재사용 가능한 코드 |
| 매개변수 | 메서드에 전달되는 입력값을 받는 변수 |
| return | 메서드 실행 결과 반환 |
| String | 문자열을 표현하는 불변 객체 |
| String Pool | 문자열 리터럴 객체 공유 |
| equals() | 문자열 내용 비교 |
| 문자열 메서드 | 검색, 추출, 변환, 분리 및 결합 |
| StringBuilder | 변경 가능한 문자열 처리 |
| 배열 | 같은 타입의 데이터를 여러 개 저장 |
| 배열 참조 | 변수에는 배열 객체의 참조값 저장 |
| 배열 복사 | clone(), copyOf(), arraycopy() 등 |
| 얕은 복사 | 내부 참조 객체를 공유할 수 있음 |
| 깊은 복사 | 내부 객체까지 독립적으로 복사 |
| 일반 for문 | 인덱스를 이용한 배열 처리 |
| 향상된 for문 | 배열 요소를 순서대로 조회 |
| Arrays | 배열 출력, 정렬, 복사, 초기화 |
| ArrayList | 크기를 동적으로 관리하는 컬렉션 |

- 메서드는 기능별로 코드를 분리하여 재사용할 수 있게 한다.
- `String`은 불변 객체이므로 기존 문자열 내용을 직접 수정할 수 없다.
- 문자열의 내용 비교에는 `equals()`를 사용한다.
- 반복적인 문자열 수정에는 `StringBuilder`가 유용하다.
- 배열은 참조 타입이며 생성 후 길이가 고정된다.
- 배열 변수의 단순 대입은 동일한 배열 객체를 공유한다.
- 기본형 배열과 객체 배열은 복사 시 내부 참조 공유 여부가 다를 수 있다.
- 배열을 처리할 때는 일반 for문과 향상된 for문의 특성을 구분해야 한다.
- `Arrays` 클래스는 배열 처리에 필요한 주요 유틸리티를 제공한다.
- 고정 크기 데이터에는 배열, 크기가 변하는 데이터에는 ArrayList를 활용할 수 있다.

</details>


## Day9. 배열과 메서드 심화
<details>

### 🎯 학습 목표
- 메서드의 선언, 호출, 매개변수, 반환값을 이해한다.
- `static` 메서드와 인스턴스 메서드의 차이를 구분한다.
- 배열의 생성 과정과 참조 타입의 메모리 구조를 이해한다.
- 반복문으로 배열의 데이터를 탐색, 계산, 정렬할 수 있다.
- `String` 클래스의 주요 메서드와 불변성을 이해한다.
- 배열의 참조 공유와 복사 방법을 구분한다.
- 기본형 배열과 객체 배열의 복사 차이를 이해한다.
- 얕은 복사와 깊은 복사, 방어적 복사의 필요성을 이해한다.

### 1. 메서드의 개념과 구조

메서드(Method)는 특정 작업을 수행하는 코드를 하나의 기능으로 묶은 것이다.

**메서드를 사용하는 이유**

- 코드 중복 감소
- 기능별 코드 분리
- 재사용성 및 유지보수성 향상
- 프로그램의 가독성 향상

**메서드의 기본 구조**

```java
public static int add(int a, int b) {
    int result = a + b;
    return result;
}
```

| 구성 요소 | 설명 |
|---|---|
| `public` | 접근 제한자 |
| `static` | 객체 생성 없이 호출 가능한 정적 메서드 |
| `int` | 반환 타입 |
| `add` | 메서드 이름 |
| `int a, int b` | 매개변수 |
| `return` | 결과값 반환 및 메서드 종료 |

**메서드 호출과 실행 과정**

```java
public class MethodExample {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(10, 20);

        System.out.println(result); // 30
    }
}
```

실행 순서

1. `main()`에서 `add(10, 20)` 호출
2. 매개변수 `a`, `b`에 인자 전달
3. 메서드 내부의 `a + b` 실행
4. `return`으로 결과 반환
5. 반환된 값을 `result`에 저장

**매개변수와 인자의 차이**

- 매개변수(Parameter) : 메서드 선언부에서 값을 받는 변수
- 인자(Argument) : 메서드를 호출할 때 전달하는 실제 값

### 2. 메서드의 반환 타입과 종류

메서드는 매개변수와 반환값의 유무에 따라 네 가지 형태로 구분할 수 있다.

| 매개변수 | 반환값 | 선언 예시 |
|---|---|---|
| 없음 | 없음 | `void hello()` |
| 있음 | 없음 | `void print(int n)` |
| 없음 | 있음 | `int getNumber()` |
| 있음 | 있음 | `int add(int a, int b)` |

**void 메서드**

```java
public static void hello() {
    System.out.println("Hello Java");
}
```

- 값을 반환하지 않는 메서드
- 출력, 상태 변경 등의 작업에 사용

**반환값이 있는 메서드**

```java
public static int multiply(int a, int b) {
    return a * b;
}
```

- 선언된 반환 타입에 맞는 결과값을 반환한다.
- `return`이 실행되면 메서드는 즉시 종료된다.
- 반환값이 있는 메서드는 필요한 모든 실행 경로에서 값을 반환해야 한다.

### 3. static 메서드와 인스턴스 메서드

| 구분 | static 메서드 | 인스턴스 메서드 |
|---|---|---|
| 소속 | 클래스 | 객체 |
| 호출 | 클래스 이름으로 호출 가능 | 객체 생성 후 호출 |
| 객체 생성 | 필요 없음 | 필요 |
| 주요 용도 | 공통 기능, 계산 등 | 객체의 상태와 관련된 기능 |

```java
public class Calculator {

    // 정적 메서드
    public static int add(int a, int b) {
        return a + b;
    }

    // 인스턴스 메서드
    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        // static 메서드 호출
        int sum = Calculator.add(10, 20);

        // 인스턴스 메서드 호출
        Calculator calc = new Calculator();
        int result = calc.subtract(20, 5);

        System.out.println(sum);    // 30
        System.out.println(result); // 15
    }
}
```

**주의 : static 메서드는 객체의 인스턴스 필드나 인스턴스 메서드에 직접 접근할 수 없습니다.**

### 4. 배열의 구조와 메모리

배열(Array)은 동일한 타입의 데이터를 여러 개 저장하는 참조 타입 객체이다.

**배열의 특징**

- 같은 타입의 데이터를 연속된 인덱스로 관리한다.
- 배열의 인덱스는 0부터 시작한다.
- 배열 생성 후 길이를 변경할 수 없다.
- 배열 변수는 실제 배열 객체에 대한 참조를 저장한다.

**배열 생성 과정**

```java
int[] numbers;           // 선언
numbers = new int[5];    // 생성
numbers[0] = 10;         // 요소 초기화
```

```text
배열 참조 변수
   numbers
      |
      v
┌──────────────────────────┐
│        배열 객체         │
├────┬────┬────┬────┬──────┤
│ 10 │  0 │  0 │  0 │   0  │
├────┼────┼────┼────┼──────┤
│  0 │  1 │  2 │  3 │   4  │
└────┴────┴────┴────┴──────┘
       배열의 인덱스
```

**메모리 구조**

- Stack : 메서드 호출 정보, 지역 변수 등 관리
- Heap : 배열 및 일반 객체가 생성되는 메모리 영역
- Method Area : 클래스 메타데이터와 관련된 JVM 논리적 메모리 영역

※ Stack과 Heap 구분은 JVM 메모리 구조를 설명하기 위한 기본 모델이다. 실제 JVM 구현은 더 복잡할 수 있다.

### 5. 배열의 인덱스와 순회

**일반 for문**

```java
int[] numbers = {10, 20, 30, 40, 50};

for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

- 인덱스를 사용해 특정 요소에 접근한다.
- 요소를 수정하거나 역순으로 탐색할 수 있다.

**향상된 for문**

```java
int[] numbers = {10, 20, 30};

for (int number : numbers) {
    System.out.println(number);
}
```

- 배열 요소를 순서대로 하나씩 조회한다.
- 인덱스를 직접 관리하지 않아도 된다.
- 기본형 배열에서 반복 변수에 값을 대입해도 원본 요소는 변경되지 않는다.

**2차원 배열의 순회**

```java
int[][] numbers = {
    {10, 20, 30},
    {40, 50, 60}
};

for (int i = 0; i < numbers.length; i++) {
    for (int j = 0; j < numbers[i].length; j++) {
        System.out.print(numbers[i][j] + " ");
    }
    System.out.println();
}
```

- 바깥쪽 반복문은 행을 순회한다.
- 안쪽 반복문은 각 행의 열을 순회한다.
- Java의 2차원 배열은 배열을 요소로 가지는 배열이므로 행마다 길이가 다를 수 있다.

### 6. 배열을 활용한 기본 알고리즘

**합계 및 평균**

```java
int[] scores = {85, 90, 75, 100, 80};

int sum = 0;

for (int score : scores) {
    sum += score;
}

double avg = (double) sum / scores.length;

System.out.println(sum); // 430
System.out.println(avg); // 86.0
```

- 합계는 반복문을 통해 값을 누적한다.
- 평균 계산 시 형변환을 통해 정수 나눗셈을 방지한다.
- 평균을 계산하기 전 배열이 비어 있지 않은지 확인해야 한다.

**최댓값 및 최솟값**

```java
int[] numbers = {35, 12, 88, 24, 7};

int max = numbers[0];
int min = numbers[0];

for (int number : numbers) {
    if (number > max) {
        max = number;
    }

    if (number < min) {
        min = number;
    }
}

System.out.println(max); // 88
System.out.println(min); // 7
```

- 첫 번째 요소를 기준값으로 초기화한다.
- 모든 요소를 비교하면서 현재 최댓값과 최솟값을 갱신한다.
- 시간 복잡도는 O(n)이다.

**선형 탐색(Linear Search)**

```java
int[] numbers = {10, 20, 30, 40, 50};
int target = 30;
int index = -1;

for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] == target) {
        index = i;
        break;
    }
}

System.out.println(index); // 2
```

- 배열을 앞에서부터 순서대로 탐색한다.
- 원하는 값을 발견하면 `break`로 종료한다.
- 최악의 시간 복잡도는 O(n)이다.

### 7. 배열 요소 교환과 버블 정렬

**Swap(값 교환)**

두 변수의 값을 교환할 때 임시 변수를 활용한다.

```java
int a = 10;
int b = 20;

int temp = a;
a = b;
b = temp;

System.out.println(a); // 20
System.out.println(b); // 10
```

**버블 정렬(Bubble Sort)**

인접한 두 요소를 비교하고 순서가 잘못되어 있으면 교환하는 정렬 알고리즘이다.

```java
int[] numbers = {5, 3, 8, 1, 2};

for (int i = 0; i < numbers.length - 1; i++) {
    for (int j = 0; j < numbers.length - 1 - i; j++) {
        if (numbers[j] > numbers[j + 1]) {
            int temp = numbers[j];
            numbers[j] = numbers[j + 1];
            numbers[j + 1] = temp;
        }
    }
}
```

- 인접한 값을 반복적으로 비교한다.
- 큰 값이 뒤쪽으로 이동하며 정렬된다.
- 일반적인 버블 정렬의 시간 복잡도는 O(n²)이다.
- 실제 프로그램에서는 주로 `Arrays.sort()` 등의 정렬 기능을 사용한다.

### 8. String 클래스와 주요 메서드

`String`은 문자열을 표현하는 참조 타입이며, 불변(Immutable) 객체이다.

**문자열 비교**

```java
String a = new String("Java");
String b = new String("Java");

System.out.println(a == b);      // false
System.out.println(a.equals(b)); // true
```

- `==` : 동일한 객체를 참조하는지 확인
- `equals()` : 실제 문자열 내용 비교

**주요 String 메서드**

| 메서드 | 기능 |
|---|---|
| `length()` | 문자열 길이 |
| `charAt()` | 특정 인덱스의 문자 |
| `equals()` | 문자열 내용 비교 |
| `contains()` | 문자열 포함 여부 |
| `indexOf()` | 문자열의 위치 검색 |
| `substring()` | 부분 문자열 추출 |
| `split()` | 구분자를 기준으로 분리 |
| `replace()` | 문자열 치환 |
| `toUpperCase()` | 대문자 변환 |
| `toLowerCase()` | 소문자 변환 |
| `strip()` | 양쪽 공백 제거 |

**문자열 불변성**

```java
String str = "hello";

str.toUpperCase();

System.out.println(str); // hello

str = str.toUpperCase();

System.out.println(str); // HELLO
```

- 문자열 메서드는 원본 `String` 객체를 수정하지 않는다.
- 변경된 결과를 사용하려면 반환값을 저장해야 한다.
- `substring(begin, end)`에서 끝 인덱스는 포함되지 않는다.
- `split()`은 정규 표현식을 기준으로 문자열을 분리한다.

### 9. 문자열 배열과 향상된 for문

`String[]`은 여러 문자열 참조를 저장하는 배열이다.

```java
String[] names = {"민수", "영희", "철수"};

for (String name : names) {
    System.out.println(name);
}
```

**문자열 배열 검색**

```java
String[] names = {"민수", "영희", "철수"};
String target = "영희";

for (int i = 0; i < names.length; i++) {
    if (names[i].equals(target)) {
        System.out.println(i); // 1
        break;
    }
}
```

- 문자열을 비교할 때는 `equals()`를 사용한다.
- 전체 요소를 조회할 때는 향상된 for문이 간결하다.
- 인덱스가 필요한 검색 및 수정에는 일반 for문이 적합하다.

### 10. 배열의 참조 공유

배열 변수는 실제 데이터가 아닌 배열 객체에 대한 참조값을 저장한다.

**참조 대입**

```java
int[] a = {10, 20, 30};

int[] b = a;

b[0] = 999;

System.out.println(a[0]); // 999
```

**메모리 구조**

```text
변수 a ─────┐
            │
            ▼
        ┌─────────────┐
        │ 999  20  30 │
        └─────────────┘
            ▲
            │
변수 b ─────┘
```

- `b = a`는 새로운 배열 객체를 생성하지 않는다.
- 두 변수가 동일한 배열 객체를 참조한다.
- `b`의 요소를 변경하면 `a`에서도 변경된 값이 확인된다.

**주의 : 대입 연산자(`=`)는 배열 객체 자체를 복사하지 않습니다.**

### 11. 배열 복사 방법

배열을 독립적으로 사용하려면 새로운 배열 객체를 생성해야 한다.

| 방법 | 특징 |
|---|---|
| `b = a` | 동일한 배열 객체 공유 |
| `clone()` | 새 배열 생성, 요소는 얕게 복사 |
| `Arrays.copyOf()` | 지정한 길이로 새 배열 생성 |
| `System.arraycopy()` | 기존 배열의 특정 구간 복사 |
| 반복문 복사 | 요소를 직접 대입하며 복사 |

**기본형 배열 복사**

```java
int[] a = {10, 20, 30};

int[] b = a.clone();

b[0] = 999;

System.out.println(a[0]); // 10
System.out.println(b[0]); // 999
```

- `clone()`은 새로운 배열 객체를 생성한다.
- 기본형 배열은 요소의 값이 복사된다.
- 복사한 배열의 요소를 변경해도 원본에 영향을 주지 않는다.

**Arrays.copyOf()**

```java
import java.util.Arrays;

int[] a = {10, 20, 30};

int[] b = Arrays.copyOf(a, a.length);
```

**System.arraycopy()**

```java
int[] source = {10, 20, 30, 40};
int[] target = new int[3];

System.arraycopy(source, 1, target, 0, 3);

// target = {20, 30, 40}
```

### 12. 객체 배열의 얕은 복사

객체 배열에서 `clone()`을 사용하면 새로운 배열이 생성되지만, 배열 내부에 저장된 객체의 참조값은 그대로 복사된다.

```java
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}
```

**얕은 복사 예제**

```java
Student[] a = {
    new Student("김민수")
};

Student[] b = a.clone();

b[0].name = "박철수";

System.out.println(a[0].name);
// 박철수
```

**메모리 구조**

```text
원본 배열 a             복사 배열 b
┌──────────┐           ┌──────────┐
│ 참조값 A │           │ 참조값 A │
└────┬─────┘           └────┬─────┘
     │                      │
     └──────────┬───────────┘
                ▼
         ┌─────────────┐
         │ Student 객체│
         │ name: 박철수 │
         └─────────────┘
```

- 배열 객체 자체는 서로 독립적이다.
- 하지만 배열 요소가 가리키는 `Student` 객체는 동일하다.
- 한쪽에서 객체 내부의 필드를 수정하면 다른 쪽에서도 변경된다.

**참조 자체를 교체하는 경우**

```java
b[0] = new Student("최영희");
```

- `b[0]`은 새로운 객체를 참조한다.
- `a[0]`은 기존 객체를 계속 참조한다.
- 내부 객체 수정과 배열 요소의 참조 교체는 서로 다른 동작이다.

### 13. 객체 배열의 깊은 복사

깊은 복사(Deep Copy)는 배열뿐 아니라 내부의 변경 가능한 객체까지 새롭게 생성하여 독립적으로 관리하는 방식이다.

```java
Student[] a = {
    new Student("김민수"),
    new Student("이영희")
};

Student[] b = new Student[a.length];

for (int i = 0; i < a.length; i++) {
    b[i] = new Student(a[i].name);
}

b[0].name = "박철수";

System.out.println(a[0].name); // 김민수
System.out.println(b[0].name); // 박철수
```

**깊은 복사 구조**

```text
원본 배열 a              복사 배열 b
┌──────────┐            ┌──────────┐
│ 참조값 A │            │ 참조값 B │
└────┬─────┘            └────┬─────┘
     │                       │
     ▼                       ▼
┌─────────────┐        ┌─────────────┐
│ Student A   │        │ Student B   │
│ name: 김민수 │        │ name: 박철수 │
└─────────────┘        └─────────────┘
```

| 구분 | 얕은 복사 | 깊은 복사 |
|---|---|---|
| 바깥 배열 | 새로 생성 | 새로 생성 |
| 내부 객체 | 기존 객체 참조 공유 | 새 객체 생성 |
| 내부 필드 수정 | 원본에 영향 가능 | 독립적으로 변경 가능 |
| 구현 | 비교적 간단 | 객체 구조에 따라 추가 구현 필요 |

**주의 : 객체 내부에 또 다른 변경 가능한 객체가 있다면, 해당 객체까지 복사해야 완전한 깊은 복사가 됩니다.**

### 14. 문자열 배열 복사의 특징

`String`은 불변 객체이므로 일반적인 가변 객체와 복사 시 주의점이 다르다.

```java
String[] a = {"김민수", "이영희"};

String[] b = a.clone();

b[0] = "최영희";

System.out.println(a[0]); // 김민수
System.out.println(b[0]); // 최영희
```

- 복사된 배열은 별도의 배열 객체이다.
- 내부의 문자열 객체를 공유하더라도 문자열 자체는 변경할 수 없다.
- 복사 배열의 요소에 다른 문자열을 대입해도 원본 배열의 요소는 변경되지 않는다.

### 15. 배열과 List의 차이

| 구분 | Array | List / ArrayList |
|---|---|---|
| 크기 | 생성 후 고정 | 요소 추가 및 삭제 가능 |
| 요소 접근 | `arr[index]` | `list.get(index)` |
| 요소 개수 | `arr.length` | `list.size()` |
| 주요 용도 | 고정된 크기의 데이터 | 크기가 변하는 데이터 |

- 배열은 고정된 길이의 데이터를 관리할 때 적합하다.
- `ArrayList`는 데이터의 추가 및 삭제가 필요한 경우 유용하다.
- `List`는 인터페이스이며 `ArrayList`는 이를 구현한 클래스이다.
- 향상된 for문으로 순회하는 동안 리스트의 구조를 직접 변경하면 `ConcurrentModificationException`이 발생할 수 있다.

### 16. 메서드와 방어적 복사

방어적 복사(Defensive Copy)는 원본 데이터가 외부 작업에 의해 변경되는 것을 방지하기 위해 복사본을 사용하는 방법이다.

**원본 배열을 변경하는 메서드**

```java
import java.util.Arrays;

public static void sortScores(int[] scores) {
    Arrays.sort(scores);
}
```

- 인자로 전달된 배열 객체가 직접 정렬된다.
- 호출한 쪽의 원본 배열도 변경된다.

**원본을 보호하는 메서드**

```java
import java.util.Arrays;

public static int[] getSortedScores(int[] scores) {
    int[] result = scores.clone();

    Arrays.sort(result);

    return result;
}
```

- 메서드가 새로운 배열을 생성한다.
- 복사본만 정렬하여 반환한다.
- 호출자가 전달한 원본 배열은 변경되지 않는다.

**핵심 : 배열을 메서드에 전달할 때 원본을 수정할 것인지, 복사본을 만들어 처리할 것인지 구분해야 합니다.**

### 17. 자주 발생하는 오류와 주의사항

| 주의사항 | 원인 및 해결 방법 |
|---|---|
| 메서드 반환값 누락 | 반환 타입에 맞는 return 작성 |
| static 접근 오류 | 정적/인스턴스 멤버 구분 |
| 배열 인덱스 초과 | `0 ~ length - 1` 범위 확인 |
| 향상된 for문에서 요소 수정 | 인덱스 기반 for문 사용 |
| String 반환값 미사용 | 결과 문자열을 변수에 저장 |
| 문자열 `==` 비교 | 실제 내용은 equals() 사용 |
| 배열 참조 공유 | 단순 대입과 실제 복사 구분 |
| 객체 배열의 얕은 복사 | 내부 객체 참조가 공유될 수 있음 |
| 깊은 복사 누락 | 변경 가능한 내부 객체까지 복사 |
| 원본 배열 정렬 문제 | 복사 후 정렬하여 원본 보호 |
| 평균 계산 오류 | 정수 나눗셈과 빈 배열 확인 |
| 배열과 List 혼동 | length와 size() 구분 |

### ✅ Day9 핵심 정리

| 구분 | 핵심 내용 |
|---|---|
| 메서드 | 기능을 수행하는 재사용 가능한 코드 |
| 매개변수 | 메서드가 전달받는 값을 저장하는 변수 |
| return | 값을 반환하고 메서드 종료 |
| static 메서드 | 객체 생성 없이 호출 가능한 클래스 멤버 |
| 인스턴스 메서드 | 객체를 통해 호출하는 메서드 |
| 배열 | 같은 타입의 데이터를 저장하는 참조 객체 |
| 배열 메모리 | 배열 객체는 Heap 영역에 생성 |
| 일반 for문 | 인덱스 기반 데이터 처리 |
| 향상된 for문 | 배열 요소 순차 조회 |
| 선형 탐색 | 순차적으로 값을 검색, O(n) |
| 버블 정렬 | 인접 요소 비교 및 교환, O(n²) |
| String | 문자열을 표현하는 불변 객체 |
| 참조 공유 | 여러 변수가 동일한 배열 객체 참조 |
| clone() | 새로운 배열 생성, 요소 얕은 복사 |
| Arrays.copyOf() | 지정된 길이로 배열 복사 |
| System.arraycopy() | 배열의 특정 구간 복사 |
| 얕은 복사 | 내부 참조 객체를 공유할 수 있음 |
| 깊은 복사 | 내부 객체까지 독립적으로 복사 |
| 방어적 복사 | 외부 변경으로부터 원본 데이터 보호 |

- 메서드는 기능별로 코드를 분리하여 재사용성과 가독성을 높인다.
- `static`과 인스턴스 메서드는 호출 방식과 접근 가능한 멤버가 다르다.
- 배열은 참조 타입이며 생성 후 길이가 고정된다.
- 배열의 데이터 처리에는 반복문과 조건문을 결합하여 사용한다.
- 문자열은 불변 객체이며 내용 비교에는 `equals()`를 사용한다.
- 배열의 단순 대입은 복사가 아니라 동일 객체를 참조하는 것이다.
- 기본형 배열과 객체 배열의 복사 방식 및 결과를 구분해야 한다.
- 얕은 복사는 내부 객체를 공유할 수 있지만, 깊은 복사는 내부 객체까지 독립적으로 생성한다.
- 메서드에서 원본 데이터를 보호하려면 방어적 복사를 고려해야 한다.

</details>


## Day10. Java 기초 총정리 및 알고리즘
<details>

### 🎯 학습 목표
- Java의 핵심 문법과 각 구성 요소의 역할을 이해한다.
- 기본형과 참조 타입의 저장 방식 및 동작 차이를 구분한다.
- 열거형(Enum)을 이용해 정해진 상수를 안전하게 관리한다.
- 문자열 배열과 반복문을 활용하여 데이터를 처리한다.
- 메서드의 호출 과정과 매개변수 전달 방식을 이해한다.
- 탐색 및 정렬 알고리즘의 동작 원리와 시간 복잡도를 이해한다.
- Stack과 Queue의 기본 구조를 이해한다.
- 객체지향 프로그래밍을 위한 기초 개념을 정리한다.

### 1. Java 핵심 문법 전체 구조

Java 프로그램은 데이터를 저장하고, 계산하고, 실행 흐름을 제어하며, 필요한 기능을 메서드로 분리하여 동작한다.

| 구성 요소 | 핵심 역할 | 대표 문법 |
|---|---|---|
| 변수와 데이터 타입 | 데이터 저장 | `int`, `double`, `String` |
| 연산자 | 계산과 조건 판단 | `+`, `-`, `==`, `&&` |
| 조건문 | 조건에 따른 실행 분기 | `if`, `switch` |
| 반복문 | 동일한 작업 반복 | `for`, `while` |
| 배열 | 여러 데이터 관리 | `int[]`, `String[]` |
| 문자열 | 문자 데이터 처리 | `String` |
| 메서드 | 기능 분리 및 재사용 | `return`, 매개변수 |
| 참조 타입 | 객체를 참조하여 사용 | 클래스, 배열, 인터페이스 |

**프로그램의 기본 처리 흐름**

```text
데이터 입력
    ↓
변수 및 배열에 저장
    ↓
연산자와 조건문으로 판단
    ↓
반복문으로 데이터 처리
    ↓
메서드를 통한 기능 수행
    ↓
결과 출력
```

### 2. 기본형과 참조 타입의 차이

Java의 데이터 타입은 기본형(Primitive Type)과 참조 타입(Reference Type)으로 구분된다.

**기본형**

- 변수에 실제 데이터 값을 저장한다.
- 정수, 실수, 문자, 논리값을 표현한다.
- 다른 변수에 대입하면 값 자체가 복사된다.

**참조 타입**

- 객체를 가리키는 참조값을 저장한다.
- 배열, 클래스, 인터페이스, String 등이 해당한다.
- 참조값을 다른 변수에 대입하면 동일한 객체를 공유할 수 있다.
- 참조 타입 변수에는 `null`을 저장할 수 있다.

| 구분 | 기본형 | 참조 타입 |
|---|---|---|
| 저장 내용 | 실제 데이터 값 | 객체에 대한 참조값 |
| 대표 타입 | int, double, boolean | String, 배열, 클래스 |
| 변수 대입 | 값 복사 | 참조값 복사 |
| null 저장 | 불가능 | 가능 |
| 비교 | 값 비교 | 참조 동일성 비교 가능 |

**기본형의 값 복사**

```java
int a = 10;
int b = a;

b = 20;

System.out.println(a); // 10
System.out.println(b); // 20
```

**참조 타입의 참조 공유**

```java
int[] a = {10, 20, 30};
int[] b = a;

b[0] = 100;

System.out.println(a[0]); // 100
System.out.println(b[0]); // 100
```

**주의 사항**

- Java의 매개변수 전달 방식은 항상 값에 의한 전달(Pass by Value)이다.
- 참조 타입의 경우 객체 자체가 아닌 참조값이 복사되어 전달된다.
- 참조값이 `null`인 상태에서 객체의 메서드나 필드에 접근하면 `NullPointerException`이 발생할 수 있다.

### 3. JVM의 Stack과 Heap 메모리

Java 프로그램에서 메서드 호출 정보와 객체 데이터는 JVM의 메모리 영역에서 관리된다.

**Stack**

- 메서드 호출마다 스택 프레임을 생성한다.
- 지역 변수, 매개변수, 중간 계산 정보 등을 관리한다.
- 메서드가 종료되면 해당 스택 프레임이 제거된다.

**Heap**

- 일반 객체와 배열이 생성되는 영역이다.
- 여러 변수가 같은 객체를 참조할 수 있다.
- 더 이상 접근할 수 없는 객체는 가비지 컬렉션(GC)의 회수 대상이 될 수 있다.

```text
           Stack
     ┌──────────────┐
     │ int age = 20 │
     │              │
     │ Student s ───┼──────────┐
     └──────────────┘          │
                               ▼
                           Heap
                    ┌─────────────────┐
                    │ Student 객체    │
                    │ name = "Java"   │
                    └─────────────────┘
```

- Stack은 메서드 실행과 관련된 데이터를 관리한다.
- Heap은 객체의 실제 데이터를 관리한다.
- 객체가 더 이상 사용되지 않더라도 즉시 메모리에서 제거되는 것은 아니다.

※ 위 그림은 JVM 메모리 구조를 이해하기 위한 개념적 모델이다.

### 4. 열거형(Enum)

Enum은 미리 정의된 상수들을 하나의 타입으로 묶어 관리하는 Java의 참조 타입이다.

**사용 목적**

- 정해진 값만 사용하도록 제한한다.
- 문자열 상수 사용으로 발생하는 오타를 방지한다.
- 조건문에서 상태를 명확하게 구분한다.
- 관련 상수와 데이터를 하나의 타입으로 관리한다.

**기본 열거형 선언**

```java
enum Status {
    PENDING,
    ACTIVE,
    INACTIVE
}
```

**열거형 사용**

```java
Status status = Status.ACTIVE;

if (status == Status.ACTIVE) {
    System.out.println("활성 상태");
}
```

**Enum과 switch**

```java
Status status = Status.PENDING;

switch (status) {
    case PENDING:
        System.out.println("대기");
        break;

    case ACTIVE:
        System.out.println("활성");
        break;

    case INACTIVE:
        System.out.println("비활성");
        break;
}
```

**Enum의 주요 메서드**

| 메서드 | 기능 |
|---|---|
| `values()` | 모든 열거 상수를 배열로 반환 |
| `valueOf()` | 이름으로 열거 상수를 검색 |
| `name()` | 열거 상수의 선언된 이름 반환 |
| `ordinal()` | 선언된 순서 반환(0부터 시작) |

```java
Status[] statuses = Status.values();

for (Status status : statuses) {
    System.out.println(status);
}

Status current = Status.valueOf("ACTIVE");

System.out.println(current); // ACTIVE
```

**필드와 생성자를 가진 Enum**

```java
enum Level {
    LOW(1, "낮음"),
    MEDIUM(2, "보통"),
    HIGH(3, "높음");

    private final int code;
    private final String description;

    Level(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
```

- Enum도 필드, 생성자, 메서드를 가질 수 있다.
- Enum 생성자는 외부에서 직접 호출할 수 없다.
- `ordinal()`은 선언 순서에 따라 값이 달라질 수 있으므로 데이터베이스에 저장할 고정 식별자로 사용하는 것은 피해야 한다.

### 5. 문자열 배열(String Array)

`String[]`은 여러 문자열을 하나의 배열로 관리하는 참조 타입이다.

**배열 선언 및 초기화**

```java
String[] names = {"민수", "영희", "철수"};
```

**크기를 지정한 생성**

```java
String[] names = new String[3];

names[0] = "민수";
names[1] = "영희";
names[2] = "철수";
```

**배열의 메모리 구조**

```text
String[] names
      │
      ▼
┌──────────┬──────────┬──────────┐
│  참조 0  │  참조 1  │  참조 2  │
└────┬─────┴────┬─────┴────┬─────┘
     │          │          │
     ▼          ▼          ▼
   "민수"     "영희"     "철수"
```

- 배열 객체에는 각 문자열에 대한 참조값이 저장된다.
- String 객체는 불변 객체이다.
- `new String[3]`으로 생성하면 요소의 초기값은 `null`이다.
- 배열의 길이는 `names.length`로 확인한다.

**문자열 배열 순회**

```java
String[] names = {"민수", "영희", "철수"};

for (String name : names) {
    System.out.println(name);
}
```

**주의 : 문자열 내용을 비교할 때는 `==`가 아닌 `equals()`를 사용해야 한다.**

### 6. 일반 for문과 향상된 for문

반복문은 데이터 처리 목적에 따라 선택한다.

| 구분 | 일반 for문 | 향상된 for문 |
|---|---|---|
| 인덱스 사용 | 가능 | 직접 제공하지 않음 |
| 값 조회 | 가능 | 가능 |
| 배열 요소 수정 | 가능 | 반복 변수 대입만으로는 불가 |
| 역순 순회 | 가능 | 기본적으로 불가능 |
| 주요 용도 | 위치 기반 처리 | 전체 요소 순회 |

**일반 for문**

```java
int[] numbers = {10, 20, 30};

for (int i = 0; i < numbers.length; i++) {
    numbers[i] += 10;
}
```

**향상된 for문**

```java
int[] numbers = {10, 20, 30};

for (int number : numbers) {
    System.out.println(number);
}
```

**향상된 for문 주의사항**

```java
int[] numbers = {10, 20, 30};

for (int number : numbers) {
    number = 100;
}

System.out.println(numbers[0]); // 10
```

- `number`에는 배열 요소의 값이 복사된다.
- 반복 변수에 다른 값을 대입해도 원본 배열 요소는 변경되지 않는다.
- 원본 배열을 직접 수정하려면 인덱스 기반 접근을 사용한다.

### 7. 중첩 반복문(Nested Loop)

중첩 반복문은 반복문 내부에 다른 반복문을 작성한 구조이다.

- 바깥쪽 반복문이 한 번 실행될 때 안쪽 반복문이 반복을 수행한다.
- 2차원 배열, 구구단, 정렬 알고리즘 등에 사용한다.

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 2; j++) {
        System.out.println("i=" + i + ", j=" + j);
    }
}
```

**실행 결과**

```text
i=1, j=1
i=1, j=2
i=2, j=1
i=2, j=2
i=3, j=1
i=3, j=2
```

**실행 흐름**

```text
i = 1 → j = 1, 2
i = 2 → j = 1, 2
i = 3 → j = 1, 2

총 실행 횟수 = 3 × 2 = 6회
```

- 안쪽 반복문은 바깥쪽 반복문의 각 회차마다 다시 시작한다.
- 반복 범위가 각각 n, m이라면 전체 반복 횟수는 n × m이다.
- 반복 횟수가 데이터 크기에 비례하여 증가하면 시간 복잡도가 커질 수 있다.

### 8. 메서드의 구조와 호출

메서드는 특정 기능을 수행하는 코드를 묶어 재사용할 수 있게 하는 구조이다.

**메서드의 주요 구성 요소**

| 구성 요소 | 설명 |
|---|---|
| 접근 제한자 | 메서드의 접근 범위 지정 |
| static | 클래스에 속하는 메서드 선언 |
| 반환 타입 | 반환할 결과값의 타입 |
| 메서드명 | 기능을 나타내는 이름 |
| 매개변수 | 외부에서 전달받는 데이터 |
| 구현부 | 실제 실행할 코드 |
| return | 결과 반환 및 메서드 종료 |

**메서드 선언과 호출**

```java
public class MethodExample {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(10, 20);

        System.out.println(result); // 30
    }
}
```

**메서드 실행 흐름**

```text
main()
  │
  ├── add(10, 20) 호출
  │       │
  │       ├── a = 10
  │       ├── b = 20
  │       └── return 30
  │
  └── result = 30
```

- 반환값이 없는 메서드는 `void`를 사용한다.
- 메서드는 필요한 기능별로 코드를 분리한다.
- `static` 메서드는 객체 생성 없이 클래스 이름으로 호출할 수 있다.

### 9. 알고리즘의 개념과 시간 복잡도

알고리즘(Algorithm)은 주어진 문제를 해결하기 위한 명확하고 유한한 처리 절차이다.

**기본 처리 과정**

```text
입력(Input)
    ↓
처리(Process)
    ↓
출력(Output)
```

**시간 복잡도(Time Complexity)**

입력 데이터 크기에 따라 알고리즘의 실행 작업량이 어떻게 증가하는지를 나타낸다.

| 시간 복잡도 | 특징 | 대표 예시 |
|---|---|---|
| O(1) | 입력 크기와 관계없이 일정 | 배열 인덱스 접근 |
| O(log n) | 탐색 범위를 반복해서 줄임 | 이진 탐색 |
| O(n) | 데이터 개수에 비례 | 선형 탐색 |
| O(n²) | 중첩 반복에 따른 증가 | 선택 정렬, 버블 정렬 |

- 시간 복잡도는 실제 실행 시간을 초 단위로 표현한 값이 아니다.
- 데이터 크기가 증가할 때 연산량이 증가하는 경향을 나타낸다.
- 같은 문제를 해결하더라도 알고리즘에 따라 처리 효율이 다를 수 있다.

### 10. 배열을 활용한 주요 알고리즘

#### 10-1. 최댓값과 최솟값

배열을 순회하면서 현재의 최댓값과 최솟값을 갱신한다.

```java
int[] numbers = {7, 3, 9, 2, 5};

int max = numbers[0];
int min = numbers[0];

for (int number : numbers) {
    if (number > max) {
        max = number;
    }

    if (number < min) {
        min = number;
    }
}

System.out.println(max); // 9
System.out.println(min); // 2
```

- 첫 번째 요소를 기준값으로 초기화한다.
- 배열이 비어 있으면 첫 번째 요소에 접근할 수 없으므로 사전에 확인해야 한다.
- 시간 복잡도 : O(n)

#### 10-2. 합계와 평균

```java
int[] scores = {80, 90, 70, 100, 60};

int sum = 0;

for (int score : scores) {
    sum += score;
}

double avg = (double) sum / scores.length;

System.out.println(sum); // 400
System.out.println(avg); // 80.0
```

- `sum += score`로 값을 누적한다.
- 평균을 계산할 때는 정수 나눗셈과 빈 배열을 주의해야 한다.
- 시간 복잡도 : O(n)

#### 10-3. 특정 값 검색(선형 탐색)

선형 탐색(Linear Search)은 배열의 요소를 처음부터 순차적으로 비교하는 방식이다.

```java
int[] numbers = {10, 25, 30, 45, 50};

int target = 30;
int index = -1;

for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] == target) {
        index = i;
        break;
    }
}

System.out.println(index); // 2
```

- 검색 값이 발견되면 해당 인덱스를 저장한다.
- 찾지 못한 경우 `-1`을 유지한다.
- 정렬되지 않은 배열에서도 사용할 수 있다.
- 시간 복잡도 : O(n)

#### 10-4. 빈도수(Frequency) 계산

배열에서 특정 값이 몇 번 등장하는지 계산하는 알고리즘이다.

```java
int[] numbers = {1, 2, 1, 3, 2, 1};

int target = 1;
int count = 0;

for (int number : numbers) {
    if (number == target) {
        count++;
    }
}

System.out.println(count); // 3
```

- 배열의 각 요소를 목표값과 비교한다.
- 일치하는 경우에만 카운터를 증가시킨다.
- 시간 복잡도 : O(n)

#### 10-5. 배열의 순서 뒤집기

배열의 앞과 뒤에서부터 요소를 교환하는 방식이다.

```java
int[] numbers = {10, 20, 30, 40, 50};

int left = 0;
int right = numbers.length - 1;

while (left < right) {
    int temp = numbers[left];

    numbers[left] = numbers[right];
    numbers[right] = temp;

    left++;
    right--;
}
```

**실행 결과**

```text
변경 전 : [10, 20, 30, 40, 50]
변경 후 : [50, 40, 30, 20, 10]
```

- 양 끝 요소를 서로 교환한다.
- 한 번 교환할 때마다 두 인덱스를 중앙으로 이동한다.
- 시간 복잡도 : O(n)
- 추가 공간 복잡도 : O(1)

#### 10-6. 중복된 값 찾기

중첩 반복문을 이용하여 각 요소를 나머지 요소와 비교한다.

```java
int[] numbers = {10, 20, 30, 20, 40, 10};

for (int i = 0; i < numbers.length; i++) {
    boolean duplicate = false;

    for (int j = 0; j < i; j++) {
        if (numbers[i] == numbers[j]) {
            duplicate = true;
            break;
        }
    }

    if (duplicate) {
        System.out.println(numbers[i]);
    }
}
```

**실행 결과**

```text
20
10
```

- 현재 요소를 이전 요소들과 비교한다.
- 이미 등장했던 값이면 중복으로 판단한다.
- 이 방식은 같은 값이 세 번 이상 등장하면 두 번째 등장부터 반복 출력할 수 있다.
- 시간 복잡도 : O(n²)

### 11. 선택 정렬(Selection Sort)

선택 정렬은 정렬되지 않은 구간에서 가장 작은 값을 찾아 앞쪽에 배치하는 알고리즘이다.

**동작 원리**

1. 현재 위치를 기준으로 최솟값을 찾는다.
2. 현재 위치의 값과 최솟값을 교환한다.
3. 정렬되지 않은 다음 위치로 이동한다.
4. 배열이 정렬될 때까지 반복한다.

**Java 코드**

```java
int[] numbers = {5, 3, 4, 1, 2};

for (int i = 0; i < numbers.length - 1; i++) {

    int minIndex = i;

    for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[j] < numbers[minIndex]) {
            minIndex = j;
        }
    }

    int temp = numbers[i];
    numbers[i] = numbers[minIndex];
    numbers[minIndex] = temp;
}
```

**동작 흐름**

```text
초기 : [5, 3, 4, 1, 2]

1회 : [1, 3, 4, 5, 2]
2회 : [1, 2, 4, 5, 3]
3회 : [1, 2, 3, 5, 4]
4회 : [1, 2, 3, 4, 5]
```

**특징**

- 최솟값의 인덱스를 기억하고 현재 위치와 교환한다.
- 정렬이 완료된 앞쪽 구간은 다시 탐색하지 않는다.
- 교환 횟수는 최대 n-1회이다.
- 시간 복잡도 : O(n²)
- 추가 공간 복잡도 : O(1)

### 12. 버블 정렬(Bubble Sort)

버블 정렬은 인접한 두 값을 비교하고 순서가 잘못된 경우 교환하는 알고리즘이다.

**동작 원리**

1. 인접한 두 요소를 비교한다.
2. 앞의 값이 더 크면 서로 교환한다.
3. 배열의 끝까지 비교를 반복한다.
4. 각 회차가 끝나면 큰 값이 뒤쪽의 올바른 위치에 배치된다.

**Java 코드**

```java
int[] numbers = {5, 3, 4, 1, 2};

for (int i = 0; i < numbers.length - 1; i++) {

    for (int j = 0; j < numbers.length - 1 - i; j++) {

        if (numbers[j] > numbers[j + 1]) {
            int temp = numbers[j];
            numbers[j] = numbers[j + 1];
            numbers[j + 1] = temp;
        }
    }
}
```

**동작 흐름**

```text
초기 : [5, 3, 4, 1, 2]

1회 : [3, 4, 1, 2, 5]
2회 : [3, 1, 2, 4, 5]
3회 : [1, 2, 3, 4, 5]
4회 : [1, 2, 3, 4, 5]
```

**특징**

- 인접한 값들을 반복적으로 비교한다.
- 정렬이 진행될수록 비교할 범위가 감소한다.
- 이 구현에서는 정렬이 완료되어도 남은 회차를 수행한다.
- 시간 복잡도 : O(n²)
- 추가 공간 복잡도 : O(1)

**선택 정렬과 버블 정렬 비교**

| 구분 | 선택 정렬 | 버블 정렬 |
|---|---|---|
| 비교 방식 | 최솟값 검색 | 인접한 두 값 비교 |
| 교환 방식 | 회차당 최대 1회 | 조건 만족 시 교환 |
| 정렬 진행 | 작은 값부터 앞쪽에 배치 | 큰 값부터 뒤쪽에 배치 |
| 시간 복잡도 | O(n²) | O(n²) |
| 공간 복잡도 | O(1) | O(1) |

### 13. 추가 탐색 및 정렬 알고리즘

**이진 탐색(Binary Search)**

- 정렬된 데이터에서 중간값을 기준으로 탐색 범위를 절반씩 줄이는 방식이다.
- 데이터가 정렬되어 있어야 한다.
- 시간 복잡도 : O(log n)

**삽입 정렬(Insertion Sort)**

- 앞쪽의 정렬된 구간에 현재 값을 올바른 위치로 삽입하는 방식이다.
- 정렬된 부분의 값을 이동시키면서 삽입 위치를 찾는다.
- 평균 및 최악 시간 복잡도 : O(n²)
- 이미 정렬된 데이터에서는 O(n)의 성능을 보일 수 있다.

| 알고리즘 | 정렬 필요 여부 | 주요 특징 |
|---|---|---|
| 선형 탐색 | 불필요 | 처음부터 순차 검색 |
| 이진 탐색 | 필요 | 탐색 범위를 절반씩 감소 |
| 선택 정렬 | 불필요 | 최솟값 선택 및 교환 |
| 버블 정렬 | 불필요 | 인접 요소 비교 및 교환 |
| 삽입 정렬 | 불필요 | 정렬된 구간에 값 삽입 |

### 14. Stack과 Queue 자료구조

Stack과 Queue는 데이터를 저장하고 꺼내는 순서가 서로 다른 자료구조이다.

**Stack (스택)**

- LIFO(Last In First Out) 구조
- 마지막에 들어간 데이터가 먼저 나온다.
- 함수 호출 관리, 실행 취소(Undo), DFS 등에 활용된다.

```text
       pop()
         ↑
    ┌────────┐
    │   30   │ ← 가장 나중에 삽입
    ├────────┤
    │   20   │
    ├────────┤
    │   10   │
    └────────┘
         ↓
       push()
```

**Queue (큐)**

- FIFO(First In First Out) 구조
- 먼저 들어간 데이터가 먼저 나온다.
- 작업 대기열, 메시지 처리, BFS 등에 활용된다.

```text
    poll()                   offer()
      ↑                        │
      │                        ▼
   ┌──────┬──────┬──────┐
   │  10  │  20  │  30  │
   └──────┴──────┴──────┘
    먼저                   나중에
    삽입                   삽입
```

**Java 구현 예시**

```java
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

// Stack
Deque<Integer> stack = new ArrayDeque<>();

stack.push(10);
stack.push(20);

System.out.println(stack.pop()); // 20

// Queue
Queue<Integer> queue = new ArrayDeque<>();

queue.offer(10);
queue.offer(20);

System.out.println(queue.poll()); // 10
```

※ 위 코드는 강의자료의 Stack·Queue 개념을 Java 컬렉션으로 나타낸 기본 예시이다.

### 15. 객체지향 프로그래밍의 기초

Java의 기본 문법을 학습한 이후에는 객체지향 프로그래밍(OOP)을 통해 프로그램을 구조화한다.

**주요 구성 요소**

| 개념 | 설명 |
|---|---|
| 클래스(Class) | 객체를 생성하기 위한 설계도 |
| 객체(Object) | 클래스를 기반으로 생성된 실체 |
| 필드(Field) | 객체가 저장하는 데이터 |
| 메서드(Method) | 객체가 수행하는 기능 |
| 캡슐화(Encapsulation) | 데이터와 기능을 묶고 접근을 제어 |
| 상속(Inheritance) | 기존 클래스의 기능을 물려받아 확장 |
| 다형성(Polymorphism) | 동일한 인터페이스를 통해 다양한 구현 사용 |

**클래스와 객체의 관계**

```text
        Class
   ┌───────────────┐
   │ Student       │
   │               │
   │ name          │
   │ age           │
   │ study()       │
   └───────┬───────┘
           │
       객체 생성
           │
           ▼
        Object
   ┌───────────────┐
   │ name = "Java" │
   │ age = 20      │
   └───────────────┘
```

- 클래스는 객체의 구조와 기능을 정의한다.
- 객체는 클래스에 정의된 필드와 메서드를 가진다.
- 객체지향은 데이터와 기능을 하나의 단위로 조직하는 프로그래밍 방식이다.

### 16. Java 기초 핵심 주의사항

| 구분 | 주의사항 |
|---|---|
| 기본형 | 변수 대입 시 값 자체가 복사됨 |
| 참조 타입 | 변수 대입 시 참조값이 복사됨 |
| null | 객체 접근 시 NullPointerException 가능 |
| 문자열 비교 | 내용 비교에는 equals() 사용 |
| 배열 | 인덱스는 0부터 length - 1까지 |
| 배열 복사 | 단순 대입은 동일 객체 공유 |
| 향상된 for문 | 반복 변수 대입만으로 원본 요소 수정 불가 |
| Enum | ordinal()을 고정 식별자로 사용하지 않기 |
| 메서드 | 반환 타입과 return 일치 |
| 중첩 반복문 | 안쪽 반복문의 실행 횟수 확인 |
| 평균 계산 | 정수 나눗셈 및 빈 배열 주의 |
| 이진 탐색 | 정렬된 데이터가 전제되어야 함 |
| 정렬 알고리즘 | 시간 복잡도와 교환 방식 구분 |

### ✅ Day10 핵심 정리

| 학습 내용 | 핵심 개념 |
|---|---|
| Java 기본 문법 | 변수, 연산자, 제어문, 배열, 문자열, 메서드 |
| 기본형 | 실제 데이터 값 저장 |
| 참조 타입 | 객체에 대한 참조값 저장 |
| Stack / Heap 메모리 | 메서드 실행 정보와 객체 데이터 관리 |
| Enum | 정해진 상수를 타입으로 관리 |
| String[] | 여러 문자열을 하나의 배열로 관리 |
| 일반 for문 | 인덱스를 이용한 데이터 처리 |
| 향상된 for문 | 배열 및 컬렉션 전체 순회 |
| 중첩 반복문 | 반복문 내부의 반복 실행 |
| 메서드 | 기능 분리, 호출, 매개변수, 반환값 |
| 알고리즘 | 문제 해결을 위한 명확한 처리 절차 |
| 시간 복잡도 | 입력 크기에 따른 연산량 증가 |
| 선형 탐색 | 순차적으로 데이터 검색 |
| 이진 탐색 | 정렬된 데이터의 탐색 범위 축소 |
| 선택 정렬 | 최솟값을 찾아 앞쪽에 배치 |
| 버블 정렬 | 인접한 두 값을 비교하여 교환 |
| 삽입 정렬 | 정렬된 구간에 값을 삽입 |
| Stack | LIFO, 후입선출 |
| Queue | FIFO, 선입선출 |
| 객체지향 | 클래스와 객체를 중심으로 프로그램 구성 |

**최종 학습 정리**

- Java의 기본 문법은 데이터를 저장하고 처리하며 실행 흐름을 제어하는 기반이다.
- 기본형과 참조 타입은 값의 저장 및 전달 방식이 다르다.
- Enum은 정해진 상수를 안전하고 명확하게 관리할 때 사용한다.
- 배열과 반복문은 여러 데이터를 효율적으로 처리하는 기본 수단이다.
- 메서드는 기능을 분리하여 코드의 재사용성과 유지보수성을 높인다.
- 탐색과 정렬 알고리즘은 데이터 처리의 기본 원리를 이해하는 데 중요하다.
- 알고리즘은 정답을 구하는 것뿐 아니라 시간 복잡도와 공간 복잡도를 고려해야 한다.
- Stack과 Queue는 데이터가 처리되는 순서에 따라 구분된다.
- 기본 문법과 참조 타입의 이해는 이후 객체지향 프로그래밍의 기반이 된다.

</details>


## Day11. Java 메서드 및 기초 문법 종합
<details>

### 🎯 학습 목표
- Java 기초 문법이 실제 프로그램에서 어떻게 연결되는지 이해한다.
- 메서드의 개념과 선언부, 구현부의 역할을 이해한다.
- 매개변수와 인자의 차이 및 값 전달 과정을 이해한다.
- 반환 타입과 `return`, `void`의 차이를 구분한다.
- 메서드의 네 가지 기본 형태를 이해한다.
- 메서드 호출 과정과 Stack 메모리의 동작 원리를 이해한다.
- 메서드 오버로딩(Overloading)의 개념과 성립 조건을 이해한다.
- 인스턴스 메서드와 `static` 메서드의 차이를 구분한다.
- Java 내장 메서드를 활용하고 기능별로 코드를 분리할 수 있다.

### 1. Java 기초 문법과 프로그램의 실행 흐름

Java 프로그램은 변수, 연산자, 제어문, 배열, 문자열, 메서드 등을 조합하여 동작한다.

| 구성 요소 | 역할 | 대표 문법 |
|---|---|---|
| 변수 | 데이터 저장 | `int`, `double`, `String` |
| 연산자 | 계산 및 조건 판단 | `+`, `-`, `==`, `&&` |
| 조건문 | 실행 흐름 분기 | `if`, `switch` |
| 반복문 | 반복적인 데이터 처리 | `for`, `while` |
| 배열 | 같은 타입의 데이터 관리 | `int[]`, `String[]` |
| 문자열 | 문자 데이터 처리 | `String` |
| 메서드 | 기능 분리 및 재사용 | 매개변수, `return` |

**기본적인 데이터 처리 흐름**

```text
데이터 저장
    ↓
변수 / 배열
    ↓
데이터 계산 및 가공
    ↓
연산자 / String 메서드
    ↓
조건에 따른 판단
    ↓
if / switch
    ↓
반복적인 작업 처리
    ↓
for / while
    ↓
메서드로 기능 분리
    ↓
결과 반환 및 활용
```

**핵심**

- 변수와 배열은 데이터를 저장한다.
- 연산자와 문자열 메서드는 데이터를 가공한다.
- 조건문과 반복문은 실행 흐름을 제어한다.
- 메서드는 이러한 작업을 기능 단위로 묶어 관리한다.

### 2. 메서드(Method)의 개념

메서드는 특정 기능을 수행하는 코드의 집합으로, 필요한 시점에 호출하여 실행할 수 있다.

**메서드를 사용하는 이유**

- **재사용성(Reusability)** : 동일한 기능을 여러 곳에서 사용
- **중복 제거** : 반복되는 코드를 하나의 메서드로 관리
- **가독성(Readability)** : 기능을 이름으로 표현하여 코드 이해 향상
- **유지보수성(Maintainability)** : 기능을 수정할 때 관련 코드를 한곳에서 관리
- **모듈화(Modularity)** : 복잡한 프로그램을 작은 기능 단위로 분리

**메서드 사용 전후 비교**

```text
[메서드로 분리하지 않은 경우]

main()
 ├── 데이터 입력
 ├── 금액 계산
 ├── 조건 검사
 ├── 결과 출력
 ├── 또 다른 금액 계산
 └── 또 다른 조건 검사


[메서드로 분리한 경우]

main()
 ├── calculateTotal()
 ├── checkDiscount()
 └── printResult()

각 메서드가 담당 기능을 수행
```

메서드는 코드의 양을 무조건 줄이기보다는 **기능과 책임을 명확하게 분리하는 데 목적**이 있다.

### 3. 메서드의 기본 구조

Java 메서드는 선언부와 구현부로 구성된다.

**기본 형식**

```java
접근제한자 static여부 반환타입 메서드명(매개변수) {
    // 실행할 코드
    return 반환값;
}
```

**선언 예제**

```java
public static int add(int a, int b) {
    int result = a + b;
    return result;
}
```

| 구성 요소 | 설명 |
|---|---|
| `public` | 메서드에 접근할 수 있는 범위 지정 |
| `static` | 객체 생성 없이 클래스에 속한 메서드로 사용 |
| `int` | 메서드가 반환하는 값의 타입 |
| `add` | 메서드를 식별하는 이름 |
| `int a, int b` | 외부에서 값을 전달받는 매개변수 |
| `{ }` | 실제 명령을 작성하는 구현부 |
| `return` | 결과 반환 및 메서드 종료 |

**선언부(Method Declaration)**

- 접근 제한자, 반환 타입, 메서드 이름, 매개변수 등을 정의한다.
- 메서드를 어떻게 호출할 수 있는지 나타낸다.

**구현부(Method Body)**

- 메서드 호출 시 실행되는 코드이다.
- 변수 선언, 연산, 조건문, 반복문 등을 작성한다.
- 필요한 경우 `return`으로 결과를 반환한다.

**주의**

- 메서드는 일반적으로 클래스 내부에 선언한다.
- Java에서는 메서드 내부에 다른 일반 메서드를 직접 선언할 수 없다.
- `return`의 결과는 선언된 반환 타입에 적합해야 한다.

### 4. 메서드의 호출과 실행 과정

메서드는 호출하는 순간 실행되며, 작업을 마치면 호출한 위치로 실행 흐름이 돌아온다.

```java
public class MethodExample {

    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        int sum = add(10, 20);

        System.out.println(sum); // 30
    }
}
```

**실행 흐름**

```text
main() 실행
     │
     ▼
add(10, 20) 호출
     │
     ▼
매개변수에 값 전달
a = 10, b = 20
     │
     ▼
result = a + b
     │
     ▼
return 30
     │
     ▼
호출한 main()으로 복귀
     │
     ▼
sum = 30
     │
     ▼
결과 출력
```

**핵심**

1. 호출한 메서드로 실행 흐름이 이동한다.
2. 전달된 인자로 매개변수가 초기화된다.
3. 구현부의 코드를 실행한다.
4. 반환값이 있다면 호출한 위치에 결과를 전달한다.
5. 호출한 위치의 다음 코드를 실행한다.

### 5. 매개변수(Parameter)와 인자(Argument)

매개변수는 메서드가 값을 전달받기 위해 선언하는 변수이며, 인자는 실제 호출 시 전달하는 값이다.

```java
public static void printInfo(String name, int age) {
    System.out.println(name + " : " + age);
}
```

**호출**

```java
printInfo("Java", 20);
```

| 구분 | 예시 | 설명 |
|---|---|---|
| 매개변수 | `String name`, `int age` | 메서드 선언부의 변수 |
| 인자 | `"Java"`, `20` | 호출 시 전달하는 값 |
| 전달 순서 | name → "Java" | 선언 순서에 맞게 값 전달 |

**매개변수의 특징**

- 매개변수는 0개 이상 선언할 수 있다.
- 전달되는 인자의 타입은 매개변수 타입과 호환되어야 한다.
- 인자의 개수와 순서는 메서드 선언에 맞아야 한다.
- 매개변수는 해당 메서드 내부에서 사용하는 지역 변수이다.

**값에 의한 전달(Pass by Value)**

Java는 기본형과 참조 타입 모두 값을 복사하여 전달한다.

```java
public static void change(int number) {
    number = 100;
}

public static void main(String[] args) {
    int value = 10;

    change(value);

    System.out.println(value); // 10
}
```

- `value`의 값 10이 매개변수 `number`에 복사된다.
- 메서드 내부에서 `number`를 수정해도 원본 변수는 변경되지 않는다.

참조 타입은 객체가 아니라 **객체를 가리키는 참조값이 복사**되므로, 동일한 객체의 내부 데이터를 수정할 수 있다.

### 6. 반환 타입(Return Type)과 return

반환 타입은 메서드가 실행을 마친 뒤 호출한 위치로 전달하는 결과값의 타입이다.

| 반환 타입 | 설명 |
|---|---|
| `void` | 값을 반환하지 않음 |
| `int` | 정수 반환 |
| `double` | 실수 반환 |
| `boolean` | 참 또는 거짓 반환 |
| `String` | 문자열 반환 |
| 클래스 타입 | 해당 타입의 객체 참조 반환 |

**반환값이 있는 메서드**

```java
public static int multiply(int a, int b) {
    return a * b;
}
```

```java
int result = multiply(5, 3);

System.out.println(result); // 15
```

**반환값이 없는 메서드**

```java
public static void printMessage() {
    System.out.println("Hello Java");
}
```

- `void`는 반환할 값이 없다는 의미이다.
- `return 값;`은 결과를 반환하고 메서드를 종료한다.
- `void` 메서드에서도 `return;`을 사용하여 즉시 종료할 수 있다.

**return을 통한 실행 종료**

```java
public static int getMax(int a, int b) {
    if (a > b) {
        return a;
    }

    return b;
}
```

- `return`이 실행되면 메서드가 종료된다.
- 반환값이 필요한 메서드는 모든 정상적인 실행 경로에서 값을 반환해야 한다.

### 7. 메서드의 네 가지 기본 형태

메서드는 매개변수와 반환값의 유무에 따라 네 가지 형태로 구분할 수 있다.

| 구분 | 매개변수 | 반환값 | 예시 |
|---|:---:|:---:|---|
| Type 1 | 없음 | 없음 | `void hello()` |
| Type 2 | 있음 | 없음 | `void print(int n)` |
| Type 3 | 없음 | 있음 | `int getNumber()` |
| Type 4 | 있음 | 있음 | `int add(int a, int b)` |

**Java 예제**

```java
public class MethodTypes {

    // 1. 매개변수 X, 반환값 X
    static void hello() {
        System.out.println("Hello");
    }

    // 2. 매개변수 O, 반환값 X
    static void print(int number) {
        System.out.println(number);
    }

    // 3. 매개변수 X, 반환값 O
    static int getNumber() {
        return 100;
    }

    // 4. 매개변수 O, 반환값 O
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        hello();
        print(10);

        int number = getNumber();
        int result = add(10, 20);

        System.out.println(number); // 100
        System.out.println(result); // 30
    }
}
```

**핵심**

- 데이터를 전달받아야 한다면 매개변수를 사용한다.
- 계산된 결과를 호출한 곳에서 활용해야 한다면 반환값을 사용한다.
- 단순 출력이나 상태 변경만 수행한다면 `void`를 사용할 수 있다.

### 8. 메서드 호출과 Stack 메모리

메서드가 실행되면 JVM은 해당 스레드의 Stack에 스택 프레임(Stack Frame)을 생성하여 실행 정보를 관리한다.

**스택 프레임에 포함되는 정보**

- 매개변수
- 지역 변수
- 중간 계산 결과
- 메서드 실행과 복귀에 필요한 정보

**호출 예제**

```java
public class StackExample {

    static void display() {
        int number = 10;
        System.out.println(number);
    }

    public static void main(String[] args) {
        display();
    }
}
```

**메서드 호출 시 메모리 변화**

```text
[1] main() 실행

        Stack
   ┌──────────────┐
   │ main()       │
   └──────────────┘


[2] display() 호출

        Stack
   ┌──────────────┐
   │ display()    │ ← 현재 실행
   │ number = 10  │
   ├──────────────┤
   │ main()       │
   └──────────────┘


[3] display() 종료

        Stack
   ┌──────────────┐
   │ main()       │ ← 실행 재개
   └──────────────┘
```

**스택의 특징**

- LIFO(Last In First Out) 구조로 동작한다.
- 메서드를 호출하면 새로운 스택 프레임이 쌓인다.
- 메서드가 정상적으로 종료되면 해당 프레임이 제거된다.
- 지역 변수는 해당 메서드의 실행 범위에 속한다.
- 일반적으로 각 스레드는 자신만의 JVM Stack을 가진다.

**주의**

- 메서드가 반환되어도 Heap에 생성된 객체가 즉시 제거되는 것은 아니다.
- 메서드를 과도하게 재귀 호출하면 `StackOverflowError`가 발생할 수 있다.

### 9. 메서드 오버로딩(Method Overloading)

오버로딩은 **같은 클래스에서 동일한 이름의 메서드를 매개변수 구성을 다르게 하여 여러 개 선언하는 것**이다.

**사용 목적**

- 관련 기능을 동일한 이름으로 제공한다.
- 전달되는 데이터 타입이나 개수에 따라 적절한 메서드를 선택할 수 있다.
- 기능별 메서드 이름을 불필요하게 늘리지 않을 수 있다.

**오버로딩 예제**

```java
public class Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20));       // 30
        System.out.println(add(10, 20, 30));   // 60
        System.out.println(add(1.5, 2.5));     // 4.0
    }
}
```

**오버로딩 성립 조건**

| 구분 | 오버로딩 가능 여부 |
|---|:---:|
| 매개변수 개수가 다름 | 가능 |
| 매개변수 타입이 다름 | 가능 |
| 매개변수 타입 순서가 다름 | 가능 |
| 반환 타입만 다름 | 불가능 |
| 매개변수 이름만 다름 | 불가능 |

**메서드 시그니처(Method Signature)**

Java에서 메서드 시그니처는 메서드 이름과 매개변수 타입들의 구성으로 결정된다.

```java
add(int a, int b)
add(double a, double b)
add(int a, int b, int c)
```

반환 타입은 메서드 시그니처에 포함되지 않는다.

따라서 아래처럼 반환 타입만 다른 메서드들은 함께 선언할 수 없다.

```java
// 잘못된 오버로딩 예시
int add(int a, int b) { return a + b; }
double add(int a, int b) { return a + b; }
```

**주의 : 오버로딩은 동일한 이름을 사용하지만, 매개변수 구성이 구별되어야 합니다.**

### 10. static 메서드와 인스턴스 메서드

Java 메서드는 클래스에 속하는 정적 메서드와 객체에 속하는 인스턴스 메서드로 구분할 수 있다.

| 구분 | static 메서드 | 인스턴스 메서드 |
|---|---|---|
| 소속 | 클래스 | 객체 |
| 호출 | `클래스명.메서드()` | `객체명.메서드()` |
| 객체 생성 | 필요 없음 | 필요 |
| 인스턴스 필드 직접 접근 | 불가능 | 가능 |
| 주요 용도 | 공통 계산 및 유틸리티 | 객체의 상태와 연관된 작업 |

**static 메서드**

```java
public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = Calculator.add(10, 20);

        System.out.println(result); // 30
    }
}
```

**인스턴스 메서드**

```java
public class Counter {

    private int count = 0;

    public void increase() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();

        counter.increase();
        counter.increase();

        System.out.println(counter.getCount()); // 2
    }
}
```

**차이점**

- `static` 메서드는 특정 객체의 생성 여부와 관계없이 호출할 수 있다.
- 인스턴스 메서드는 객체를 통해 호출하며 해당 객체의 상태를 다룰 수 있다.
- `static` 메서드는 객체의 인스턴스 필드와 메서드를 직접 사용할 수 없다.
- 정적 필드는 인스턴스마다 존재하는 것이 아니라 클래스 단위로 관리된다.

### 11. Java 표준 라이브러리의 주요 메서드

Java는 문자열 처리, 수학 계산, 타입 변환 등을 위한 다양한 메서드를 제공한다.

**String 클래스**

| 메서드 | 기능 |
|---|---|
| `length()` | 문자열 길이 반환 |
| `substring()` | 부분 문자열 추출 |
| `equals()` | 문자열 내용 비교 |
| `trim()` | 문자열 양쪽의 일부 공백 제거 |
| `contains()` | 특정 문자열 포함 여부 확인 |

```java
String text = "  Hello Java  ";

System.out.println(text.trim());           // Hello Java
System.out.println(text.contains("Java")); // true
System.out.println(text.substring(2, 7));  // Hello
```

**Math 클래스**

```java
int max = Math.max(10, 20);
double random = Math.random();

System.out.println(max); // 20
```

- `Math.max()`는 전달된 두 값 중 큰 값을 반환한다.
- `Math.random()`은 0.0 이상 1.0 미만의 난수를 반환한다.
- 두 메서드는 `static` 메서드이다.

**타입 변환 메서드**

```java
int number = Integer.parseInt("100");
String text = String.valueOf(100);

System.out.println(number); // 100
System.out.println(text);   // "100"
```

- `Integer.parseInt()` : 문자열을 정수로 변환
- `String.valueOf()` : 전달된 값을 문자열로 변환
- 변환할 수 없는 문자열을 `parseInt()`에 전달하면 `NumberFormatException`이 발생한다.

### 12. 웹 개발에서의 메서드 활용

웹 백엔드에서는 데이터를 저장하거나 조회하고, 조건에 따라 처리 결과를 반환하는 기능을 메서드로 분리할 수 있다.

**대표적인 기능별 메서드**

| 기능 | 메서드 예시 | 역할 |
|---|---|---|
| 로그인 판단 | `loginCheck()` | 로그인 관련 조건 확인 |
| 주문 금액 계산 | `calculateTotal()` | 상품 금액 합산 |
| 할인 대상 확인 | `checkDiscount()` | 할인 조건 확인 |
| 게시글 저장 | `insertBoard()` | 게시글 저장 작업 |
| 입력값 검증 | `validateInput()` | 입력 데이터 검사 |

**메서드를 이용한 기능 분리**

```text
사용자 요청
    ↓
데이터 전달
    ↓
calculateTotal()
    ↓
주문 금액 계산
    ↓
checkDiscount()
    ↓
할인 조건 확인
    ↓
결과 반환
```

**장바구니 금액 계산 예제**

```java
public class ShoppingCart {

    public static int calculateTotal(
            int[] prices,
            int[] quantities) {

        int total = 0;

        for (int i = 0; i < prices.length; i++) {
            total += prices[i] * quantities[i];
        }

        return total;
    }

    public static boolean checkDiscount(int total) {
        return total >= 100000;
    }

    public static void main(String[] args) {
        int[] prices = {30000, 15000, 200000};
        int[] quantities = {2, 1, 1};

        int total = calculateTotal(prices, quantities);
        boolean discount = checkDiscount(total);

        System.out.println("총 주문 금액: " + total + "원");
        System.out.println("할인 대상: " + discount);
    }
}
```

**실행 결과**

```text
총 주문 금액: 275000원
할인 대상: true
```

**코드의 역할 분리**

- `calculateTotal()` : 배열과 반복문을 사용하여 주문 금액 계산
- `checkDiscount()` : 비교 연산자를 이용해 할인 조건 판단
- `main()` : 메서드를 호출하고 결과 출력

※ 위 코드는 메서드를 통한 기능 분리를 보여주는 기초 예제이다. 실제 웹 서비스에서는 데이터 검증, 인증, 저장 처리 등을 별도로 구현해야 한다.

### 13. 메서드 설계 시 주의사항

| 주의사항 | 설명 |
|---|---|
| 반환 타입 불일치 | 선언된 반환 타입에 맞는 값 반환 |
| return 누락 | 값을 반환해야 하는 실행 경로 확인 |
| 매개변수 불일치 | 전달할 값의 타입, 개수, 순서 확인 |
| static 접근 오류 | 인스턴스 멤버의 직접 접근 여부 확인 |
| 오버로딩 오류 | 반환 타입만 변경해서는 오버로딩 불가 |
| 지역 변수 범위 | 선언된 블록 내에서만 사용 가능 |
| 참조값 전달 | 객체 내부 상태가 변경될 수 있음 |
| 메서드 중복 | 공통 기능은 재사용 가능한 메서드로 분리 |
| 메서드 책임 | 서로 다른 작업을 하나의 메서드에 과도하게 집중하지 않기 |
| 호출 스택 | 깊은 재귀 호출 시 StackOverflowError 주의 |

**좋은 메서드 설계의 기본 원칙**

- 메서드 이름만으로 수행하는 기능을 파악할 수 있어야 한다.
- 하나의 메서드가 담당하는 작업을 명확히 한다.
- 계산 결과가 필요하다면 적절한 반환 타입을 사용한다.
- 데이터가 필요한 경우 매개변수를 통해 전달받는다.
- 중복되는 로직은 별도 메서드로 분리하여 재사용한다.

### ✅ Day11 핵심 정리

| 구분 | 핵심 내용 |
|---|---|
| 메서드 | 특정 기능을 수행하는 코드의 집합 |
| 선언부 | 접근 제한자, 반환 타입, 이름, 매개변수 |
| 구현부 | 실제 수행할 코드 |
| 매개변수 | 메서드가 전달받는 값을 저장하는 변수 |
| 인자 | 메서드 호출 시 전달하는 실제 값 |
| Pass by Value | Java는 항상 값을 복사하여 전달 |
| 반환 타입 | 메서드가 반환하는 값의 타입 |
| return | 결과 반환 및 메서드 종료 |
| void | 반환값이 없는 메서드 |
| Stack Frame | 메서드 호출마다 생성되는 실행 정보 |
| Overloading | 매개변수 구성이 다른 동일 이름의 메서드 선언 |
| static 메서드 | 클래스에 속하는 메서드 |
| 인스턴스 메서드 | 객체에 속하는 메서드 |
| 표준 라이브러리 | Java에서 제공하는 공통 메서드 |
| 기능 분리 | 복잡한 작업을 독립적인 메서드로 나누어 관리 |

**최종 학습 정리**

- 메서드는 코드의 재사용성과 가독성을 높이는 기본적인 기능 단위이다.
- 메서드는 선언부와 구현부로 구성된다.
- 매개변수는 메서드가 데이터를 전달받기 위한 변수이다.
- `return`은 결과값을 반환하고 현재 메서드를 종료한다.
- `void` 메서드는 반환값 없이 작업을 수행한다.
- Java는 기본형과 참조 타입 모두 값에 의한 전달 방식을 사용한다.
- 메서드가 호출되면 해당 스레드의 Stack에 새로운 스택 프레임이 생성된다.
- 메서드 오버로딩은 매개변수 구성의 차이로 구분한다.
- `static` 메서드는 클래스에 속하고 인스턴스 메서드는 객체에 속한다.
- 복잡한 프로그램은 기능을 메서드로 나누어 관리하는 것이 좋다.
- 메서드의 이해는 이후 클래스와 객체지향 프로그래밍을 학습하기 위한 핵심 기초이다.

</details>


## Day12. 메서드 심화 및 사용자 정의 클래스
<details>

### 🎯 학습 목표
- 메서드의 선언, 호출, 매개변수, 반환값을 이해한다.
- 메서드 오버로딩과 오버라이딩의 차이를 구분한다.
- 사용자 정의 클래스와 객체의 관계를 이해한다.
- 필드, 생성자, 메서드의 역할을 구분한다.
- 지역 변수, 인스턴스 변수, 정적 변수의 차이를 이해한다.
- 생성자와 `this`를 이용하여 객체를 초기화할 수 있다.
- 접근 제한자와 캡슐화의 필요성을 이해한다.
- `static` 메서드와 인스턴스 메서드의 차이를 구분한다.
- DTO와 VO의 목적 및 설계 방식의 차이를 이해한다.
- `record`를 이용한 데이터 클래스의 특징을 이해한다.

### 1. 메서드(Method)의 핵심 개념

메서드는 특정 기능을 수행하는 코드를 하나의 단위로 묶어 재사용할 수 있게 하는 구조이다.

**메서드의 주요 역할**

- 코드 재사용 : 같은 기능을 여러 곳에서 호출
- 기능 분리 : 복잡한 프로그램을 작은 작업으로 구분
- 유지보수 : 기능 수정 시 관련 코드를 한곳에서 관리
- 데이터 처리 : 매개변수를 전달받아 작업을 수행하고 결과 반환

**메서드의 기본 구조**

```java
public static int add(int a, int b) {
    int result = a + b;
    return result;
}
```

| 구성 요소 | 설명 |
|---|---|
| `public` | 접근 가능한 범위 지정 |
| `static` | 클래스에 속하는 메서드 |
| `int` | 반환 타입 |
| `add` | 메서드 이름 |
| `int a, int b` | 매개변수 |
| `return` | 결과 반환 및 메서드 종료 |

**메서드 실행 과정**

```text
add(10, 20) 호출
       ↓
매개변수에 값 전달
a = 10, b = 20
       ↓
메서드 본문 실행
result = a + b
       ↓
return 30
       ↓
호출한 위치로 복귀
```

메서드의 반환 타입은 실제 반환하는 값의 타입과 호환되어야 한다.

### 2. 메서드의 반환값과 매개변수

메서드는 반환값과 매개변수의 유무에 따라 네 가지 형태로 구분할 수 있다.

| 매개변수 | 반환값 | 예시 |
|---|---|---|
| 없음 | 없음 | `void printMessage()` |
| 있음 | 없음 | `void printName(String name)` |
| 없음 | 있음 | `int getAge()` |
| 있음 | 있음 | `int add(int a, int b)` |

**반환 타입별 메서드**

```java
// 정수 반환
static int getAge() {
    return 20;
}

// 실수 반환
static double getAverage() {
    return 85.5;
}

// 문자열 반환
static String getName() {
    return "Java";
}

// 논리값 반환
static boolean isAdult(int age) {
    return age >= 19;
}

// 반환값 없음
static void printMessage() {
    System.out.println("Hello");
}
```

**핵심 차이**

- `void` : 값을 반환하지 않는 메서드
- `return 값;` : 값을 반환하면서 메서드 종료
- 매개변수 : 메서드에 필요한 외부 데이터를 전달받는 변수
- 인자 : 메서드를 호출할 때 실제로 전달하는 값

### 3. 메서드 오버로딩(Overloading)

오버로딩은 동일한 이름의 메서드를 매개변수 구성을 다르게 하여 여러 개 선언하는 것이다.

**오버로딩의 성립 조건**

- 메서드 이름이 동일해야 한다.
- 매개변수의 개수 또는 타입 구성이 달라야 한다.
- 매개변수의 타입 순서가 달라도 구분할 수 있다.
- 반환 타입만 다르게 선언하는 것은 오버로딩이 아니다.

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

**호출 예제**

```java
Calculator calc = new Calculator();

System.out.println(calc.add(10, 20));     // 30
System.out.println(calc.add(10, 20, 30)); // 60
System.out.println(calc.add(1.5, 2.5));   // 4.0
```

**주의 : 반환 타입이나 매개변수 이름만 변경해서는 오버로딩할 수 없다.**

### 4. 사용자 정의 클래스(Class)의 개념

클래스는 관련된 데이터와 기능을 하나의 구조로 묶어 객체를 생성하기 위한 설계도이다.

**클래스를 사용하는 이유**

- 여러 데이터를 하나의 타입으로 관리한다.
- 데이터와 관련된 기능을 함께 정의한다.
- 동일한 구조의 객체를 여러 개 생성할 수 있다.
- 프로그램을 역할별로 구분하여 유지보수성을 높인다.

**기본 타입과 사용자 정의 타입**

| 구분 | 설명 | 예시 |
|---|---|---|
| 기본 타입 | Java에서 제공하는 기본 자료형 | int, double, boolean |
| 사용자 정의 클래스 | 개발자가 직접 정의하는 참조 타입 | Student, Product, Member |

**클래스 선언**

```java
class Student {
    String name;
    int age;
    double score;
}
```

- `Student`는 개발자가 정의한 새로운 참조 타입이다.
- `name`, `age`, `score`는 객체가 가지는 데이터이다.
- 하나의 클래스에서 여러 객체를 생성할 수 있다.

**클래스와 객체의 관계**

```text
          Student 클래스
        ┌────────────────┐
        │ name           │
        │ age            │
        │ score          │
        └────────┬───────┘
                 │
           객체 생성
                 │
       ┌─────────┴─────────┐
       ▼                   ▼

   student1            student2
┌─────────────┐      ┌─────────────┐
│ name: 민수  │      │ name: 영희  │
│ age: 20     │      │ age: 21     │
│ score: 95.5 │      │ score: 88.0 │
└─────────────┘      └─────────────┘
```

- 클래스(Class) : 객체의 구조와 기능을 정의한 설계도
- 객체(Object) : 클래스를 기반으로 생성한 실체
- 인스턴스(Instance) : 특정 클래스로부터 생성된 객체

### 5. 클래스의 주요 구성 요소

클래스는 주로 필드, 생성자, 메서드로 구성된다.

| 구성 요소 | 역할 |
|---|---|
| 필드(Field) | 객체의 상태와 데이터 저장 |
| 생성자(Constructor) | 객체 생성 시 초기화 수행 |
| 메서드(Method) | 객체의 동작과 기능 정의 |
| 접근 제한자 | 필드와 메서드의 접근 범위 제어 |

**클래스 구조 예제**

```java
class Student {

    // 필드 : 객체의 상태
    private String name;
    private int age;

    // 생성자 : 객체 초기화
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메서드 : 객체의 기능
    public void introduce() {
        System.out.println(name + " : " + age);
    }

    public int getAge() {
        return age;
    }
}
```

**핵심**

- 필드는 객체가 가지는 상태를 표현한다.
- 생성자는 객체의 초기 상태를 설정한다.
- 메서드는 객체가 수행할 수 있는 기능을 표현한다.

### 6. 객체 생성과 참조 변수

Java에서 일반적인 클래스의 객체는 `new` 연산자를 통해 생성할 수 있다.

**객체 생성**

```java
Student student1 = new Student("민수", 20);
Student student2 = new Student("영희", 21);
```

**구문 분석**

```text
Student student1 = new Student("민수", 20);

Student       : 클래스 타입
student1      : 참조 변수
new           : 새 객체 생성
Student(...)  : 생성자 호출
```

**객체의 메서드 호출**

```java
student1.introduce();
student2.introduce();

System.out.println(student1.getAge()); // 20
```

**메모리 구조**

```text
참조 변수                     Heap

student1 ────────────→ Student 객체 A
                       name = "민수"
                       age  = 20

student2 ────────────→ Student 객체 B
                       name = "영희"
                       age  = 21
```

- 서로 다른 `new` 표현식으로 생성한 객체는 독립적인 객체이다.
- 참조 변수에는 객체에 접근하기 위한 참조값이 저장된다.
- 객체는 Heap 영역에 생성된다.
- 참조 변수의 단순 대입은 새로운 객체를 생성하지 않는다.

### 7. 변수의 세 가지 종류

Java의 변수는 선언 위치와 소속에 따라 지역 변수, 인스턴스 변수, 정적 변수로 구분한다.

| 구분 | 지역 변수 | 인스턴스 변수 | 정적 변수 |
|---|---|---|---|
| 선언 위치 | 메서드·생성자·블록 내부 | 클래스 내부 | 클래스 내부 |
| static | 해당 없음 | 사용하지 않음 | 사용 |
| 소속 | 실행 중인 블록 | 객체 | 클래스 |
| 초기화 | 사용 전 명시적 초기화 필요 | 기본값 자동 초기화 | 기본값 자동 초기화 |
| 주요 용도 | 임시 계산 값 | 객체별 상태 | 공유 데이터 |

**Java 예제**

```java
class Student {

    // 인스턴스 변수
    String name;
    int age;

    // 정적 변수
    static int count = 0;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    void printInfo() {
        // 지역 변수
        String message = name + " : " + age;
        System.out.println(message);
    }
}
```

**변수의 특징**

1. 지역 변수
   - 선언된 블록 안에서 사용한다.
   - 사용하기 전에 초기화해야 한다.
   - 해당 실행 범위를 벗어나면 접근할 수 없다.

2. 인스턴스 변수
   - 객체마다 별도로 존재한다.
   - 객체의 개별적인 상태를 저장한다.
   - 초기화하지 않으면 타입별 기본값이 설정된다.

3. 정적 변수
   - 클래스에 속한다.
   - 같은 클래스의 모든 객체가 공유한다.
   - `클래스명.변수명`으로 접근하는 것이 일반적이다.

### 8. 인스턴스 변수와 정적 변수의 차이

**인스턴스 변수**

```java
class Student {
    String name;
}
```

```java
Student s1 = new Student();
Student s2 = new Student();

s1.name = "민수";
s2.name = "영희";

System.out.println(s1.name); // 민수
System.out.println(s2.name); // 영희
```

각 객체는 서로 독립적인 `name` 필드를 가진다.

**정적 변수**

```java
class Counter {
    static int count = 0;

    Counter() {
        count++;
    }
}
```

```java
Counter a = new Counter();
Counter b = new Counter();

System.out.println(Counter.count); // 2
```

두 객체를 생성해도 `count`는 클래스 단위로 하나만 존재한다.

**메모리 공유 개념**

```text
      Counter 클래스
    ┌─────────────────┐
    │ static count = 2│
    └────────┬────────┘
             │
       공유하는 데이터
         ┌───┴───┐
         │       │
         ▼       ▼
      객체 A   객체 B
```

**핵심 차이**

- 인스턴스 변수 : 객체마다 서로 다른 값을 저장한다.
- 정적 변수 : 모든 객체가 공유하는 하나의 값을 저장한다.

### 9. 생성자(Constructor)

생성자는 객체가 생성될 때 호출되어 초기 상태를 설정하는 특별한 구성 요소이다.

**생성자의 특징**

- 생성자 이름은 클래스 이름과 동일하다.
- 반환 타입을 선언하지 않는다.
- `new`를 이용해 객체를 생성할 때 호출된다.
- 매개변수를 통해 초기값을 전달받을 수 있다.
- 생성자도 오버로딩할 수 있다.

**생성자 선언**

```java
class Product {

    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
```

**객체 생성**

```java
Product product = new Product("키보드", 30000);

System.out.println(product.name);  // 키보드
System.out.println(product.price); // 30000
```

**생성 과정**

```text
new Product("키보드", 30000)
            │
            ▼
      새 객체 생성
            │
            ▼
      생성자 실행
            │
            ▼
  name  = "키보드"
  price = 30000
            │
            ▼
      객체 참조 반환
```

**기본 생성자(Default Constructor)**

- 클래스에 생성자를 하나도 선언하지 않으면 컴파일러가 기본 생성자를 제공한다.
- 기본 생성자는 매개변수가 없는 생성자이다.
- 생성자를 직접 하나라도 선언하면 기본 생성자가 자동 제공되지 않는다.

### 10. 생성자 오버로딩과 this

생성자 오버로딩은 매개변수 구성이 다른 생성자를 여러 개 선언하는 것이다.

```java
class Product {

    String name;
    int price;

    Product() {
        this("이름 없음", 0);
    }

    Product(String name) {
        this(name, 0);
    }

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
```

**객체 생성**

```java
Product p1 = new Product();
Product p2 = new Product("마우스");
Product p3 = new Product("키보드", 30000);
```

**this의 역할**

| 표현 | 의미 |
|---|---|
| `this` | 현재 객체를 참조 |
| `this.name` | 현재 객체의 name 필드 |
| `this()` | 같은 클래스의 다른 생성자 호출 |

**예제**

```java
Product(String name, int price) {
    this.name = name;
    this.price = price;
}
```

- `this.name`은 객체의 인스턴스 필드이다.
- 오른쪽의 `name`은 생성자 매개변수이다.
- 이름이 같을 때 `this`로 구분할 수 있다.

**주의 : Java 21 기준으로 `this()` 생성자 호출은 생성자 본문의 첫 번째 문장에 작성해야 한다.**

### 11. 접근 제한자(Access Modifier)

접근 제한자는 클래스, 필드, 생성자, 메서드 등에 접근할 수 있는 범위를 제어한다.

| 접근 제한자 | 같은 클래스 | 같은 패키지 | 다른 패키지의 자식 클래스 | 그 외 |
|---|:---:|:---:|:---:|:---:|
| `public` | O | O | O | O |
| `protected` | O | O | 조건부 O | X |
| `default` | O | O | X | X |
| `private` | O | X | X | X |

※ `default`는 접근 제한자를 작성하지 않은 상태(package-private)를 의미한다. `protected`의 다른 패키지 접근에는 상속 관계 및 접근 방식에 따른 제약이 있다.

**접근 제한자 예제**

```java
class Student {

    public String name;
    protected int age;
    String school;
    private double score;
}
```

**주요 특징**

- `public` : 외부에서 접근 가능한 공개 멤버
- `protected` : 같은 패키지와 상속 관계에서 접근 허용
- `default` : 같은 패키지 내부 접근 허용
- `private` : 선언된 클래스 내부에서만 접근 허용

**주의 : 접근 제한자는 무조건 public으로 설정하기보다 필요한 범위만 공개하는 것이 좋다.**

### 12. 캡슐화(Encapsulation)

캡슐화는 객체의 데이터와 기능을 하나로 묶고, 외부에서 내부 상태에 접근하는 방식을 제어하는 객체지향 원칙이다.

**캡슐화의 주요 목적**

- 데이터 보호
- 잘못된 값의 저장 방지
- 객체 상태의 일관성 유지
- 내부 구현 변경의 영향 최소화

**직접 접근 방식**

```java
class Student {
    public int score;
}
```

```java
Student student = new Student();

student.score = -100;
```

필드를 외부에 그대로 공개하면 유효하지 않은 값이 저장될 수 있다.

**캡슐화 적용**

```java
class Student {

    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException(
                "점수는 0~100 사이여야 합니다."
            );
        }

        this.score = score;
    }
}
```

**사용 예제**

```java
Student student = new Student();

student.setScore(90);

System.out.println(student.getScore()); // 90
```

**Getter와 Setter**

| 구분 | 역할 |
|---|---|
| Getter | 객체 내부 데이터를 조회 |
| Setter | 객체 내부 데이터를 변경 |
| private 필드 | 외부의 직접 접근 제한 |

- Getter는 일반적으로 `get필드명()` 형태로 작성한다.
- Setter는 일반적으로 `set필드명()` 형태로 작성한다.
- 모든 필드에 Setter를 제공할 필요는 없다.
- 변경이 허용되지 않는 데이터는 Setter 없이 설계할 수 있다.

### 13. static 메서드와 인스턴스 메서드

메서드도 필드처럼 클래스에 속하는 정적 메서드와 객체에 속하는 인스턴스 메서드로 나뉜다.

| 구분 | static 메서드 | 인스턴스 메서드 |
|---|---|---|
| 소속 | 클래스 | 객체 |
| 선언 | static 사용 | static 사용하지 않음 |
| 호출 | 클래스 이름으로 호출 | 객체를 통해 호출 |
| 객체 생성 | 불필요 | 필요 |
| 객체 필드 직접 접근 | 불가능 | 가능 |
| 주요 용도 | 공통 계산, 유틸리티 | 객체 상태 조회·변경 |

**static 메서드**

```java
class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }
}
```

```java
int result = Calculator.add(10, 20);
System.out.println(result); // 30
```

**인스턴스 메서드**

```java
class Counter {

    private int count = 0;

    public void increase() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
```

```java
Counter counter = new Counter();

counter.increase();
counter.increase();

System.out.println(counter.getCount()); // 2
```

**주의 사항**

- `static` 메서드에서는 `this`를 사용할 수 없다.
- `static` 메서드는 인스턴스 필드를 직접 참조할 수 없다.
- 인스턴스 메서드는 자신의 객체 상태를 다룰 수 있다.

### 14. 메서드 오버라이딩(Overriding)

오버라이딩은 부모 클래스로부터 상속받은 인스턴스 메서드를 자식 클래스에서 재정의하는 것이다.

**오버라이딩의 목적**

- 부모 클래스의 기능을 자식 클래스에 맞게 변경
- 상속 관계에서 공통 기능을 재사용
- 다형성(Polymorphism)을 구현하기 위한 기반 제공

**Java 예제**

```java
class Animal {

    public void sound() {
        System.out.println("동물 소리");
    }
}

class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
```

**메서드 호출**

```java
Animal animal = new Animal();
Animal dog = new Dog();

animal.sound(); // 동물 소리
dog.sound();    // 멍멍
```

- `extends`는 클래스 상속에 사용한다.
- `@Override`는 메서드를 올바르게 재정의했는지 컴파일러가 확인하게 한다.
- 부모 타입으로 참조해도 실제 객체에서 재정의한 메서드가 실행될 수 있다.

**오버로딩 vs 오버라이딩**

| 구분 | 오버로딩 | 오버라이딩 |
|---|---|---|
| 개념 | 같은 이름의 메서드를 여러 형태로 선언 | 상속받은 메서드를 재정의 |
| 관계 | 같은 클래스에서도 가능 | 상속 관계 필요 |
| 메서드명 | 동일 | 동일 |
| 매개변수 | 구성이 달라야 함 | 동일해야 함 |
| 반환 타입 | 구분 기준 아님 | 같거나 허용되는 공변 반환 타입 |
| 주요 목적 | 다양한 인자 처리 | 상속된 동작 변경 |

**주의 : 오버라이딩할 때 접근 제한자를 부모 메서드보다 더 좁게 변경할 수 없다.**

### 15. Java의 값에 의한 전달(Pass by Value)

Java는 메서드 호출 시 기본형과 참조 타입 모두 값을 복사하여 전달한다.

**기본형 전달**

```java
static void change(int number) {
    number = 100;
}
```

```java
int value = 10;

change(value);

System.out.println(value); // 10
```

- 기본형은 실제 값이 복사된다.
- 매개변수를 변경해도 원본 변수는 변경되지 않는다.

**참조 타입 전달**

```java
class Box {
    int value;
}
```

```java
static void change(Box box) {
    box.value = 100;
}
```

```java
Box box = new Box();
box.value = 10;

change(box);

System.out.println(box.value); // 100
```

- 참조 타입은 객체를 참조하는 값이 복사된다.
- 호출자와 매개변수가 같은 객체를 참조할 수 있다.
- 매개변수를 통해 객체의 필드를 변경하면 원본 객체의 상태도 변경된다.

**핵심**

```text
기본형 전달
변수 값 복사 → 매개변수 수정 → 원본 유지

참조 타입 전달
참조값 복사 → 같은 객체 참조 → 객체 상태 변경 가능
```

Java에는 C++의 참조에 의한 전달과 같은 별도의 매개변수 전달 방식이 없다.

### 16. 사용자 정의 클래스와 데이터 구조화

여러 배열로 관련된 데이터를 관리하면 각 배열의 인덱스를 일치시켜야 하는 문제가 발생할 수 있다.

**배열을 따로 사용하는 경우**

```java
String[] names = {"민수", "영희"};
int[] ages = {20, 21};
double[] scores = {95.5, 88.0};
```

동일한 학생의 데이터가 여러 배열에 분산되어 있다.

**클래스로 구조화**

```java
class Student {

    String name;
    int age;
    double score;

    Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
}
```

**객체 배열 활용**

```java
Student[] students = {
    new Student("민수", 20, 95.5),
    new Student("영희", 21, 88.0)
};

for (Student student : students) {
    System.out.println(
        student.name + " : " + student.score
    );
}
```

**핵심**

- 클래스는 관련된 데이터를 하나의 객체로 묶는다.
- 객체는 자신의 상태를 가진다.
- 객체 배열을 이용하면 같은 형태의 여러 데이터를 관리할 수 있다.

### 17. DTO(Data Transfer Object)

DTO는 계층이나 시스템 사이에서 데이터를 전달하기 위한 객체이다.

**DTO의 주요 특징**

- 데이터를 묶어 전달하는 것이 주된 목적이다.
- 일반적으로 복잡한 비즈니스 로직을 포함하지 않는다.
- Controller, Service 등 계층 사이에서 사용한다.
- 사용 목적에 따라 변경 가능한 클래스 또는 불변 객체로 설계할 수 있다.

**DTO 클래스 예제**

```java
class MemberDTO {

    private String name;
    private String email;

    public MemberDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
```

**DTO의 데이터 전달 흐름**

```text
Controller
    │
    │ MemberDTO
    ▼
 Service
    │
    │ 데이터 처리
    ▼
Repository / Database
```

- DTO는 필요한 데이터를 하나의 객체로 묶는다.
- Getter를 통해 데이터를 조회할 수 있다.
- 변경 가능한 DTO라면 Setter를 제공할 수 있다.
- DTO가 반드시 Getter와 Setter를 모두 가져야 하는 것은 아니다.

### 18. VO(Value Object)

VO는 특정 값을 객체로 표현하는 자료형으로, 일반적으로 값 자체의 의미와 동등성을 중요하게 다룬다.

**VO의 주요 특징**

- 특정 값이나 개념을 하나의 객체로 표현한다.
- 일반적으로 불변(Immutable) 객체로 설계한다.
- 생성 시 데이터의 유효성을 검증할 수 있다.
- 동일한 값을 가진 객체는 동등한 값으로 취급한다.
- `equals()`와 `hashCode()`를 적절히 정의한다.

**예시 : Money**

```java
record Money(long amount) {

    public Money {
        if (amount < 0) {
            throw new IllegalArgumentException(
                "금액은 음수일 수 없습니다."
            );
        }
    }
}
```

**객체 생성 및 비교**

```java
Money m1 = new Money(10000);
Money m2 = new Money(10000);

System.out.println(m1 == m2);      // false
System.out.println(m1.equals(m2)); // true
```

- `m1`과 `m2`는 서로 다른 객체이다.
- 두 객체의 금액이 같으므로 값으로서 동등하다.
- `record`는 구성 요소에 기반한 `equals()`와 `hashCode()`를 자동 생성한다.

### 19. DTO와 VO의 차이

| 구분 | DTO | VO |
|---|---|---|
| 목적 | 데이터 전달 | 값 자체의 표현 |
| 핵심 | 데이터 이동 | 값의 의미와 동등성 |
| 변경 가능성 | 가변·불변 모두 가능 | 일반적으로 불변 |
| 데이터 검증 | 전달 목적에 따라 수행 | 값의 유효성 보장 중시 |
| 동등성 비교 | 목적에 따라 다름 | 값 기준 비교 |
| 예시 | MemberDTO, BoardDTO | Money, Point |

**쉽게 구분하기**

```text
DTO : 데이터를 전달하는 상자
VO  : 의미 있는 값 자체를 표현하는 객체
```

- DTO는 데이터를 어디로 전달할 것인지에 초점을 둔다.
- VO는 해당 데이터가 어떤 의미와 규칙을 가지는지에 초점을 둔다.
- 같은 `record` 문법을 사용하더라도 사용 목적에 따라 DTO 또는 VO가 될 수 있다.

### 20. record 클래스

`record`는 데이터 중심 클래스를 간결하게 선언할 수 있도록 Java에서 제공하는 기능이다.

Java 16부터 정식으로 지원하며 Java 21에서도 사용할 수 있다.

**일반 클래스**

```java
class MemberDTO {

    private final String name;
    private final int age;

    public MemberDTO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
```

**record 사용**

```java
record MemberDTO(String name, int age) {
}
```

**record 사용 예제**

```java
MemberDTO member = new MemberDTO("민수", 20);

System.out.println(member.name()); // 민수
System.out.println(member.age());  // 20
```

**record가 제공하는 기능**

- 구성 요소에 대응하는 private final 필드
- 생성자
- 구성 요소 접근 메서드
- `equals()`
- `hashCode()`
- `toString()`

**주의 사항**

- `record`는 일반적으로 데이터를 변경하지 않는 구조에 적합하다.
- 구성 요소를 다시 대입할 수는 없지만 내부에 변경 가능한 객체가 있으면 완전한 깊은 불변성이 보장되는 것은 아니다.
- 일반적인 Getter와 달리 `name()`처럼 구성 요소 이름으로 접근한다.

### 21. 객체지향 클래스와 웹 백엔드 구조

웹 백엔드에서는 클래스와 메서드를 이용해 요청 처리, 비즈니스 로직, 데이터 접근을 역할별로 구분한다.

**Spring Boot에서의 대표적인 구조**

```text
사용자 요청
    ↓
Controller
(HTTP 요청 처리)
    ↓
Service
(비즈니스 로직 처리)
    ↓
Repository
(데이터 접근)
    ↓
Database
(데이터 저장 및 조회)
```

**데이터 전달 흐름**

```text
Database
    ↓
Repository
    ↓
Service
    ↓
DTO 생성
    ↓
Controller
    ↓
JSON 응답
    ↓
클라이언트 화면
```

**클래스와 메서드의 역할**

| 구성 요소 | 역할 |
|---|---|
| Class | 관련 데이터와 기능을 하나의 구조로 관리 |
| Field | 객체가 가진 데이터와 상태 |
| Constructor | 객체 생성 시 초기화 |
| Method | 특정 작업과 기능 수행 |
| DTO | 계층 간 데이터 전달 |
| VO | 의미 있는 값과 규칙 표현 |

- Spring Boot에서 Service는 주로 비즈니스 로직을 담당한다.
- Controller는 요청을 받아 필요한 Service 메서드를 호출한다.
- Repository는 데이터 접근을 담당한다.
- DTO는 계층 사이에 필요한 데이터를 전달하는 데 사용할 수 있다.

### 22. 클래스와 메서드 작성 시 주의사항

| 주의사항 | 설명 |
|---|---|
| 생성자 반환 타입 | 생성자에는 void를 포함한 반환 타입을 작성하지 않음 |
| 생성자 이름 | 반드시 클래스 이름과 일치해야 함 |
| 기본 생성자 | 다른 생성자를 선언하면 자동으로 제공되지 않음 |
| this 사용 | static 문맥에서는 this 사용 불가 |
| 지역 변수 | 사용 전 초기화 필요 |
| static 변수 | 객체별 데이터가 아니라 클래스 공유 데이터 |
| private 필드 | 외부에서 직접 접근할 수 없음 |
| Getter / Setter | 필요한 접근 기능만 공개 |
| 오버로딩 | 매개변수 구성이 달라야 함 |
| 오버라이딩 | 상속 관계와 재정의 규칙 준수 |
| 참조 타입 전달 | 객체의 상태가 변경될 수 있음 |
| DTO | 데이터 전달 목적에 맞게 설계 |
| VO | 값의 의미, 유효성, 동등성 고려 |
| record | 내부 가변 객체까지 자동으로 보호하지는 않음 |

### ✅ Day12 핵심 정리

| 구분 | 핵심 내용 |
|---|---|
| Method | 특정 기능을 수행하는 코드의 집합 |
| Parameter | 메서드에서 전달받는 값을 저장하는 변수 |
| Return | 값을 반환하고 메서드 종료 |
| Overloading | 같은 이름, 다른 매개변수 구성 |
| Class | 데이터와 기능을 정의하는 설계도 |
| Object | 클래스로부터 생성된 객체 |
| Instance | 특정 클래스에 속하는 객체 |
| Field | 객체의 데이터 및 상태 |
| Constructor | 객체 생성 시 초기화 수행 |
| Local Variable | 블록 내부에서 사용하는 변수 |
| Instance Variable | 객체마다 별도로 존재하는 변수 |
| Static Variable | 클래스에 속하는 공유 변수 |
| this | 현재 객체를 가리키는 참조 |
| Access Modifier | 클래스 및 멤버의 접근 범위 제어 |
| Encapsulation | 데이터 보호와 접근 통제 |
| Getter / Setter | 객체 데이터 조회 및 변경 |
| Static Method | 객체 생성 없이 클래스 이름으로 호출 가능 |
| Instance Method | 객체를 통해 호출하는 메서드 |
| Overriding | 상속받은 인스턴스 메서드 재정의 |
| Pass by Value | 모든 인자를 값으로 복사하여 전달 |
| DTO | 계층 간 데이터 전달 객체 |
| VO | 값의 의미와 동등성을 표현하는 객체 |
| record | 데이터 중심 클래스를 간결하게 정의 |
| Spring Boot | 클래스와 메서드를 역할별로 구분한 백엔드 구조 |

**최종 학습 정리**

- 메서드는 기능을 분리하고 코드를 재사용하기 위한 기본 단위이다.
- 클래스는 관련 데이터와 기능을 하나의 구조로 묶는 사용자 정의 타입이다.
- 객체는 클래스를 기반으로 생성되며 각자의 상태를 가질 수 있다.
- 필드는 데이터, 생성자는 초기화, 메서드는 기능을 담당한다.
- 지역 변수는 블록 내부에서 사용하고, 인스턴스 변수는 객체별로 존재한다.
- 정적 변수는 클래스에 소속되어 여러 객체가 공유한다.
- `this`는 현재 객체를 참조하며 필드와 매개변수를 구분할 때 사용할 수 있다.
- 접근 제한자와 캡슐화는 객체의 데이터를 안전하게 관리하는 데 중요하다.
- 오버로딩은 매개변수 구성을 달리하는 것이고, 오버라이딩은 상속된 동작을 재정의하는 것이다.
- Java의 매개변수 전달 방식은 기본형과 참조 타입 모두 값에 의한 전달이다.
- DTO는 데이터 전달에, VO는 값 자체의 의미와 규칙을 표현하는 데 사용한다.
- `record`는 불변 데이터 중심의 클래스를 간결하게 작성할 수 있게 한다.
- 객체지향 프로그래밍에서는 각 클래스가 담당하는 역할과 책임을 명확히 구분하는 것이 중요하다.

</details>


## Day13. Java 객체지향 프로그래밍 심화
<details>

### 🎯 학습 목표
- 객체지향 프로그래밍(OOP)의 개념과 4대 핵심 원칙을 이해한다.
- 클래스와 객체, 생성자, 필드의 관계를 정리한다.
- 캡슐화와 접근 제한자를 이용한 데이터 보호 방법을 이해한다.
- 상속의 개념과 `extends`, `super`의 사용법을 익힌다.
- 메서드 오버로딩과 오버라이딩의 차이를 구분한다.
- 다형성과 자동 타입 변환, 강제 타입 변환을 이해한다.
- 추상 클래스와 추상 메서드의 특징을 이해한다.
- 인터페이스의 선언, 구현 및 다중 구현을 이해한다.
- 추상 클래스와 인터페이스의 차이를 구분할 수 있다.
- 객체지향 원칙을 활용한 프로그램 설계 구조를 이해한다.

### 1. 객체지향 프로그래밍(OOP)의 개념

객체지향 프로그래밍(Object-Oriented Programming)은 프로그램을 데이터와 기능을 가진 객체들의 상호작용으로 구성하는 프로그래밍 방식이다.

**객체지향 프로그래밍의 주요 목적**

- 관련된 데이터와 기능을 하나의 단위로 관리한다.
- 복잡한 프로그램을 여러 객체로 나누어 구성한다.
- 코드의 재사용성과 유지보수성을 높인다.
- 변경과 확장에 유연한 프로그램을 설계한다.

**클래스와 객체**

| 구분 | 설명 |
|---|---|
| 클래스(Class) | 객체의 상태와 동작을 정의하는 설계도 |
| 객체(Object) | 클래스를 기반으로 생성된 실체 |
| 필드(Field) | 객체의 상태와 데이터를 저장하는 변수 |
| 생성자(Constructor) | 객체 생성 과정에서 초기 상태 설정 |
| 메서드(Method) | 객체가 수행하는 기능과 동작 |

**클래스 선언과 객체 생성**

```java
class Car {
    String color;
    int speed;

    void drive() {
        System.out.println("자동차가 주행합니다.");
    }
}
```

```java
Car car1 = new Car();
Car car2 = new Car();

car1.color = "빨강";
car2.color = "파랑";

car1.drive();
```

**클래스와 객체의 관계**

```text
          Car 클래스
       ┌──────────────┐
       │ color        │
       │ speed        │
       │ drive()      │
       └──────┬───────┘
              │
         new Car()
              │
       ┌──────┴───────┐
       ▼              ▼
    car1 객체      car2 객체
  ┌──────────┐   ┌──────────┐
  │ 빨강     │   │ 파랑     │
  │ speed: 0 │   │ speed: 0 │
  └──────────┘   └──────────┘
```

- 하나의 클래스에서 여러 객체를 생성할 수 있다.
- 각각의 객체는 독립적인 인스턴스 필드를 가진다.
- 같은 클래스의 객체는 동일한 구조와 메서드 정의를 사용한다.

### 2. 생성자와 변수의 종류

**생성자(Constructor)**

생성자는 객체가 생성될 때 호출되어 필드의 초기값을 설정하는 특별한 구성 요소이다.

```java
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

```java
Student student = new Student("홍길동", 20);
```

**생성자의 특징**

- 클래스 이름과 생성자 이름은 동일하다.
- 반환 타입을 선언하지 않는다.
- 객체 생성 과정에서 호출된다.
- 매개변수 구성을 달리하여 오버로딩할 수 있다.
- `this`는 현재 객체를 참조한다.

**변수의 세 가지 종류**

| 구분 | 지역 변수 | 인스턴스 변수 | 정적 변수 |
|---|---|---|---|
| 선언 위치 | 메서드 또는 블록 내부 | 클래스 내부 | 클래스 내부 |
| 소속 | 실행 중인 블록 | 객체 | 클래스 |
| 초기화 | 사용 전 초기화 필요 | 기본값 자동 초기화 | 기본값 자동 초기화 |
| 데이터 공유 | 해당 실행 범위 | 객체별 독립 | 클래스 단위 공유 |

```java
class Student {
    String name;                // 인스턴스 변수
    static String school = "한국학교"; // 정적 변수

    void printInfo() {
        int age = 20;           // 지역 변수
        System.out.println(name + age);
    }
}
```

- 지역 변수는 선언된 블록 내부에서만 사용할 수 있다.
- 인스턴스 변수는 객체마다 별도로 존재한다.
- 정적 변수는 클래스에 속하며 객체들이 공유한다.
- `static` 멤버는 클래스 이름으로 접근하는 것이 일반적이다.

### 3. Java 메모리 구조와 객체의 참조

JVM은 프로그램 실행에 필요한 데이터를 여러 메모리 영역으로 나누어 관리한다.

| 영역 | 주요 역할 |
|---|---|
| Stack | 메서드 실행 정보, 지역 변수 등 |
| Heap | 객체 및 배열 저장 |
| Method Area | 클래스 메타데이터, 메서드 관련 정보 등 관리 |

**객체 생성 시 메모리 구조**

```text
         Stack                  Heap

   ┌──────────────┐      ┌────────────────┐
   │ Student s    │      │ Student 객체   │
   │   참조값 ────┼─────>│ name: 홍길동   │
   └──────────────┘      │ age: 20        │
                         └────────────────┘
```

**참조 변수의 대입**

```java
Student s1 = new Student("홍길동", 20);
Student s2 = s1;

s2.age = 30;

System.out.println(s1.age); // 30
```

- `s2 = s1`은 새로운 객체를 생성하지 않는다.
- 두 변수는 같은 객체를 참조한다.
- 한쪽에서 객체의 필드를 수정하면 다른 쪽에도 변경된 상태가 보인다.

**가비지 컬렉션(Garbage Collection)**

- JVM은 더 이상 도달할 수 없는 객체의 메모리를 자동으로 회수할 수 있다.
- 참조 변수에 `null`을 대입해도 객체가 즉시 삭제되는 것은 아니다.
- 객체의 실제 회수 시점은 가비지 컬렉터가 결정한다.

※ 위 메모리 구조는 개념을 설명하기 위한 단순화된 모델이다.

### 4. 객체지향의 4대 핵심 원칙

객체지향 프로그래밍의 핵심 원칙은 캡슐화, 상속, 다형성, 추상화이다.

| 원칙 | 핵심 개념 | 주요 목적 |
|---|---|---|
| 캡슐화(Encapsulation) | 데이터와 접근 방식 관리 | 상태 보호와 일관성 |
| 상속(Inheritance) | 기존 클래스의 기능 확장 | 코드 재사용 |
| 다형성(Polymorphism) | 동일한 호출, 다양한 동작 | 유연한 변경 및 확장 |
| 추상화(Abstraction) | 핵심 기능을 정의하고 구현 세부사항 숨김 | 복잡성 감소 |

**네 가지 원칙의 관계**

```text
       객체지향 프로그램
              │
     ┌────────┴────────┐
     │                 │
     ▼                 ▼
  캡슐화              상속
  데이터 보호         기능 재사용
     │                 │
     └────────┬────────┘
              │
     ┌────────┴────────┐
     │                 │
     ▼                 ▼
   다형성             추상화
  유연한 동작         공통 규칙
```

네 가지 원칙은 서로 독립적이면서도 함께 사용될 수 있다.

### 5. 캡슐화(Encapsulation)

캡슐화는 객체의 데이터와 기능을 묶고, 외부에서 내부 상태에 접근하거나 변경하는 방식을 제어하는 원칙이다.

**캡슐화가 필요한 이유**

- 외부에서 데이터를 임의로 변경하는 것을 방지한다.
- 객체의 유효하지 않은 상태를 예방한다.
- 상태 변경을 정해진 메서드를 통해 수행한다.
- 내부 구현을 수정하더라도 외부 코드의 영향을 줄일 수 있다.

**접근 제한자**

| 접근 제한자 | 접근 가능 범위 |
|---|---|
| `public` | 접근 가능한 모든 위치 |
| `protected` | 같은 패키지 및 다른 패키지의 상속 관계에서 조건부 접근 |
| `default` | 같은 패키지 내부 |
| `private` | 선언된 클래스 내부 |

※ `default`는 접근 제한자를 명시하지 않은 상태를 의미한다.

**캡슐화 예제**

```java
class BankAccount {

    private int balance = 0;

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "입금 금액은 양수여야 합니다."
            );
        }

        balance += amount;
    }

    public int getBalance() {
        return balance;
    }
}
```

**사용 예제**

```java
BankAccount account = new BankAccount();

account.deposit(10000);

System.out.println(account.getBalance()); // 10000
```

- `balance`는 `private`이므로 외부에서 직접 수정할 수 없다.
- `deposit()`은 입력값을 검증한 뒤 잔액을 변경한다.
- `getBalance()`는 잔액 조회 기능만 제공한다.

**주의**

- 캡슐화는 단순히 모든 필드를 `private`으로 선언하는 것만을 의미하지 않는다.
- 중요한 것은 객체의 상태를 올바른 규칙에 따라 관리하는 것이다.
- 모든 필드에 Setter를 제공할 필요는 없다.

### 6. 상속(Inheritance)

상속은 기존 클래스의 필드와 메서드를 자식 클래스가 물려받아 새로운 클래스를 구성하는 기능이다.

**상속을 사용하는 이유**

- 여러 클래스에서 사용하는 공통 기능을 재사용한다.
- 기존 기능을 확장하여 새로운 기능을 추가한다.
- 관련된 클래스를 계층적으로 구성한다.
- 다형성을 구현하기 위한 기반을 제공한다.

**상속 선언**

```java
class Person {
    String name;

    void introduce() {
        System.out.println("이름: " + name);
    }
}

class Student extends Person {
    int studentId;

    void study() {
        System.out.println("공부합니다.");
    }
}
```

**상속 구조**

```text
          Person
        ┌──────────────┐
        │ name         │
        │ introduce()  │
        └──────┬───────┘
               │
             extends
               │
               ▼
          Student
        ┌──────────────┐
        │ studentId    │
        │ study()      │
        └──────────────┘
```

**사용 예제**

```java
Student student = new Student();

student.name = "홍길동";
student.studentId = 1001;

student.introduce();
student.study();
```

**상속의 특징**

- 자식 클래스는 부모 클래스의 접근 가능한 기능을 사용할 수 있다.
- 자식 클래스는 새로운 필드와 메서드를 추가할 수 있다.
- 부모 클래스의 `private` 멤버는 자식 클래스에서도 직접 접근할 수 없다.
- Java 클래스는 하나의 직접적인 부모 클래스만 상속할 수 있다.

**주의 : 상속은 단순한 코드 재사용뿐 아니라 부모와 자식 사이에 적절한 IS-A 관계가 있을 때 사용하는 것이 좋다.**

### 7. super와 부모 생성자

`super`는 자식 클래스에서 부모 클래스의 구성 요소에 접근할 때 사용하는 키워드이다.

| 표현 | 역할 |
|---|---|
| `this` | 현재 객체 참조 |
| `this()` | 같은 클래스의 다른 생성자 호출 |
| `super` | 부모 클래스의 접근 가능한 멤버 참조 |
| `super()` | 부모 클래스의 생성자 호출 |

**부모 생성자 호출**

```java
class Person {

    protected String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {

    private int studentId;

    Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }
}
```

**생성자 실행 흐름**

```text
new Student("홍길동", 1001)
             │
             ▼
      Student 생성자 진입
             │
             ▼
        super(name)
             │
             ▼
      Person 생성자 실행
      name = "홍길동"
             │
             ▼
      Student 생성자 계속
      studentId = 1001
             │
             ▼
       객체 초기화 완료
```

**핵심**

- 자식 객체를 생성할 때 부모 클래스의 생성자도 실행된다.
- 부모 생성자는 자식 클래스 고유의 초기화보다 먼저 실행된다.
- 부모 클래스에 기본 생성자가 없다면 적절한 부모 생성자를 호출해야 한다.
- Java 21 기준으로 명시적인 `super()` 호출은 생성자의 첫 번째 문장에 작성해야 한다.

### 8. 오버로딩과 오버라이딩

메서드 오버로딩(Overloading)과 오버라이딩(Overriding)은 이름이 비슷하지만 서로 다른 개념이다.

**오버로딩(Overloading)**

같은 이름의 메서드를 매개변수 구성을 다르게 하여 여러 개 선언하는 것이다.

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

**오버라이딩(Overriding)**

부모 클래스의 인스턴스 메서드를 자식 클래스에서 재정의하는 것이다.

```java
class Animal {

    void sound() {
        System.out.println("동물 소리");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("멍멍");
    }
}
```

**비교**

| 구분 | 오버로딩 | 오버라이딩 |
|---|---|---|
| 목적 | 다양한 매개변수 처리 | 상속된 동작 재정의 |
| 상속 관계 | 필요 없음 | 필요 |
| 메서드 이름 | 동일 | 동일 |
| 매개변수 | 구성이 달라야 함 | 동일해야 함 |
| 반환 타입 | 구분 기준 아님 | 같거나 허용된 공변 반환 타입 |
| 주요 키워드 | 별도 키워드 없음 | `@Override` 권장 |

**오버라이딩 주의사항**

- 부모 메서드보다 접근 범위를 좁힐 수 없다.
- `final` 메서드는 오버라이딩할 수 없다.
- `private` 메서드는 자식 클래스에서 오버라이딩되지 않는다.
- `static` 메서드는 오버라이딩이 아닌 메서드 숨김(Hiding)의 대상이다.

### 9. 다형성(Polymorphism)

다형성은 하나의 공통 타입을 통해 여러 종류의 객체를 다룰 수 있고, 실제 객체에 따라 서로 다른 동작을 수행할 수 있는 특성이다.

**다형성의 핵심**

- 부모 타입으로 자식 객체를 참조할 수 있다.
- 같은 메서드를 호출해도 실제 객체에 따라 결과가 달라질 수 있다.
- 코드 변경 없이 새로운 구현을 추가하기 쉬워진다.

**Java 예제**

```java
class Animal {

    void sound() {
        System.out.println("동물 소리");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("야옹");
    }
}
```

**다형성 적용**

```java
Animal a1 = new Dog();
Animal a2 = new Cat();

a1.sound(); // 멍멍
a2.sound(); // 야옹
```

**실행 구조**

```text
           Animal 타입
          ┌────────────┐
          │  sound()   │
          └──────┬─────┘
                 │
          실제 객체 확인
           ┌─────┴─────┐
           │           │
           ▼           ▼
        Dog 객체     Cat 객체
           │           │
           ▼           ▼
         "멍멍"       "야옹"
```

**핵심**

- 참조 변수의 타입은 `Animal`이다.
- 실제 생성된 객체는 각각 `Dog`, `Cat`이다.
- 재정의된 인스턴스 메서드는 실제 객체를 기준으로 실행된다.

이러한 동작을 동적 메서드 디스패치(Dynamic Method Dispatch)라고 한다.

### 10. 자동 타입 변환과 강제 타입 변환

상속 관계에서는 부모와 자식 타입 사이에 참조 타입 변환이 발생할 수 있다.

**자동 타입 변환(Upcasting)**

```java
Dog dog = new Dog();

Animal animal = dog;
```

- 자식 타입의 객체를 부모 타입 변수에 대입할 수 있다.
- 별도의 형변환 연산자가 필요하지 않다.
- 부모 타입에서 선언된 멤버를 기준으로 접근할 수 있다.
- 실제 객체가 자식 객체라는 사실은 변하지 않는다.

**강제 타입 변환(Downcasting)**

부모 타입 참조를 자식 타입으로 변환하는 작업이다.

```java
Animal animal = new Dog();

Dog dog = (Dog) animal;

dog.sound();
```

**잘못된 타입 변환**

```java
Animal animal = new Cat();

// 실제 객체가 Cat이므로 실행 시 예외 발생
Dog dog = (Dog) animal;
```

실제 객체와 호환되지 않는 타입으로 변환하면 `ClassCastException`이 발생한다.

**instanceof를 이용한 확인**

```java
Animal animal = new Dog();

if (animal instanceof Dog) {
    Dog dog = (Dog) animal;
    dog.sound();
}
```

**핵심**

- Upcasting : 자식 객체를 부모 타입으로 참조
- Downcasting : 부모 타입 참조를 자식 타입으로 변환
- `instanceof` : 객체가 특정 타입과 호환되는지 검사
- 강제 타입 변환 전에는 실제 객체의 타입을 확인해야 한다.

### 11. 추상화(Abstraction)

추상화는 객체의 복잡한 내부 구현보다 외부에 필요한 공통 특성과 기능에 집중하는 설계 원칙이다.

**추상화의 주요 목적**

- 복잡한 내부 구현을 외부에 드러내지 않는다.
- 공통적으로 필요한 기능을 정의한다.
- 구현 세부사항과 사용하는 코드를 분리한다.
- 시스템을 이해하고 확장하기 쉽게 만든다.

**추상화 구조**

```text
         사용자 코드
              │
              ▼
       공통 기능 호출
              │
              ▼
     추상 클래스 / 인터페이스
              │
       ┌──────┴──────┐
       │             │
       ▼             ▼
     구현 A        구현 B
```

Java에서는 추상 클래스와 인터페이스 등을 통해 추상화를 구현할 수 있다.

### 12. 추상 클래스(Abstract Class)

추상 클래스는 객체를 직접 생성할 수 없으며, 상속을 통해 공통 상태나 기능을 제공하기 위한 클래스이다.

**추상 클래스의 특징**

- `abstract` 키워드로 선언한다.
- 일반 필드와 일반 메서드를 가질 수 있다.
- 추상 메서드를 선언할 수 있다.
- 생성자를 선언할 수 있다.
- 추상 클래스 자체는 `new`로 인스턴스화할 수 없다.

**추상 클래스 선언**

```java
abstract class Shape {

    abstract double area();

    void printInfo() {
        System.out.println("도형입니다.");
    }
}
```

**구현 클래스**

```java
class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
```

**사용 예제**

```java
Shape shape = new Circle(5);

shape.printInfo();
System.out.println(shape.area());
```

**추상 메서드(Abstract Method)**

- 선언부만 있고 구현부가 없는 메서드이다.
- 일반적으로 자식 클래스에서 구현해야 한다.
- 구체적인 구현은 상속받는 클래스가 결정한다.

```java
abstract double area();
```

**주의 : 추상 메서드를 구현하지 않는 자식 클래스는 자신도 추상 클래스로 선언해야 한다.**

### 13. 인터페이스(Interface)

인터페이스는 클래스가 제공해야 하는 기능의 규칙 또는 계약을 정의하는 참조 타입이다.

**인터페이스의 목적**

- 서로 다른 클래스에 공통 기능 규약 제공
- 구현 방식과 사용 코드를 분리
- 다양한 구현체를 동일한 방식으로 사용
- 유연한 변경과 확장이 가능한 구조 제공

**인터페이스 선언**

```java
interface RemoteControl {
    void turnOn();
    void turnOff();
}
```

**구현 클래스**

```java
class Television implements RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("TV 켜짐");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 꺼짐");
    }
}
```

**사용 예제**

```java
RemoteControl remote = new Television();

remote.turnOn();  // TV 켜짐
remote.turnOff(); // TV 꺼짐
```

**인터페이스의 주요 특징**

- 인터페이스는 `interface` 키워드로 선언한다.
- 클래스는 `implements`로 인터페이스를 구현한다.
- 인터페이스 타입으로 구현 객체를 참조할 수 있다.
- 구현 클래스는 필요한 추상 메서드를 구현해야 한다.
- 인터페이스의 추상 메서드는 기본적으로 `public abstract`이다.

**핵심**

인터페이스는 어떤 기능을 제공해야 하는지 정의하고, 실제 동작 방식은 구현 클래스가 결정한다.

### 14. 인터페이스의 구성 요소

Java 인터페이스에는 상수, 추상 메서드, 디폴트 메서드, 정적 메서드 등을 선언할 수 있다.

| 구성 요소 | 특징 |
|---|---|
| 상수 필드 | `public static final` |
| 추상 메서드 | `public abstract` |
| 디폴트 메서드 | `default`를 사용하고 구현부 포함 |
| 정적 메서드 | `static`을 사용하며 인터페이스 이름으로 호출 |
| private 메서드 | 인터페이스 내부 구현 재사용에 사용 가능 |

**상수와 추상 메서드**

```java
interface RemoteControl {

    int MAX_VOLUME = 100;

    void turnOn();
}
```

- `MAX_VOLUME`은 자동으로 `public static final`이다.
- `turnOn()`은 자동으로 `public abstract`이다.

**디폴트 메서드(Default Method)**

```java
interface Greeting {

    default void hello() {
        System.out.println("안녕하세요.");
    }
}
```

- 인터페이스 내부에 구현부를 가진 인스턴스 메서드이다.
- 구현 클래스가 그대로 상속받아 사용할 수 있다.
- 필요한 경우 구현 클래스에서 오버라이딩할 수 있다.

**정적 메서드(Static Method)**

```java
interface Greeting {

    static void info() {
        System.out.println("Greeting 인터페이스");
    }
}
```

**호출**

```java
Greeting.info();
```

- 인터페이스 이름으로 호출한다.
- 객체를 생성할 필요가 없다.
- 인터페이스의 정적 메서드는 구현 클래스에 상속되지 않는다.

### 15. 인터페이스 다중 구현

Java 클래스는 하나의 직접적인 부모 클래스만 상속할 수 있지만, 여러 인터페이스를 동시에 구현할 수 있다.

**다중 구현 예제**

```java
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}
```

```java
class Duck implements Flyable, Swimmable {

    @Override
    public void fly() {
        System.out.println("날아갑니다.");
    }

    @Override
    public void swim() {
        System.out.println("수영합니다.");
    }
}
```

**사용 예제**

```java
Duck duck = new Duck();

duck.fly();  // 날아갑니다.
duck.swim(); // 수영합니다.
```

**구조**

```text
       Flyable          Swimmable
      ┌────────┐        ┌────────┐
      │ fly()  │        │ swim() │
      └───┬────┘        └───┬────┘
          │                 │
          └────────┬────────┘
                   │
                implements
                   │
                   ▼
                  Duck
              ┌─────────┐
              │ fly()   │
              │ swim()  │
              └─────────┘
```

**주의 사항**

- 여러 인터페이스에서 동일한 시그니처의 추상 메서드를 선언할 수 있다.
- 서로 충돌하는 디폴트 메서드가 있다면 구현 클래스에서 명시적으로 해결해야 한다.
- Java는 클래스의 다중 상속을 지원하지 않지만 인터페이스의 다중 구현은 지원한다.

### 16. 추상 클래스와 인터페이스의 차이

추상 클래스와 인터페이스는 모두 추상화를 구현하는 데 사용되지만 목적과 구성 방식이 다르다.

| 구분 | 추상 클래스 | 인터페이스 |
|---|---|---|
| 선언 | `abstract class` | `interface` |
| 관계 | `extends` | `implements` |
| 인스턴스 필드 | 가능 | 불가능 |
| 생성자 | 가능 | 불가능 |
| 일반 메서드 | 가능 | default/static/private 등 가능 |
| 추상 메서드 | 가능 | 가능 |
| 클래스의 다중 사용 | 단일 클래스 상속 | 여러 인터페이스 구현 |
| 주요 목적 | 공통 상태와 기능 제공 | 기능 규칙과 계약 정의 |

**추상 클래스를 사용하는 경우**

- 여러 클래스가 공통 상태를 가진다.
- 기본적으로 공유할 구현이 존재한다.
- 부모와 자식 사이의 계층 관계를 표현한다.

**인터페이스를 사용하는 경우**

- 서로 다른 클래스가 같은 기능을 제공해야 한다.
- 구현 방식은 다르지만 공통된 호출 규칙이 필요하다.
- 구현체를 쉽게 교체하거나 확장해야 한다.

**핵심**

- 추상 클래스 : 공통 기반을 상속받는 구조
- 인터페이스 : 공통 기능의 규칙을 구현하는 구조

두 방식은 상호 배타적이지 않으며 함께 사용할 수 있다.

### 17. 상속과 인터페이스의 통합 활용

하나의 클래스는 다른 클래스를 상속하면서 동시에 인터페이스를 구현할 수 있다.

**Java 예제**

```java
abstract class Animal {

    protected String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + "이(가) 먹습니다.");
    }
}
```

```java
interface RunnableAnimal {
    void run();
}
```

```java
class Dog extends Animal implements RunnableAnimal {

    Dog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(name + "이(가) 달립니다.");
    }
}
```

**사용 예제**

```java
Dog dog = new Dog("초코");

dog.eat();
dog.run();

Animal animal = dog;
RunnableAnimal runner = dog;

animal.eat();
runner.run();
```

**클래스 관계**

```text
        Animal (추상 클래스)
               │
             extends
               │
               ▼
              Dog
               ▲
               │
           implements
               │
       RunnableAnimal
         (인터페이스)
```

**핵심**

- 상속은 부모 클래스의 상태와 기능을 물려받는다.
- 인터페이스 구현은 공통 기능의 규칙을 만족한다.
- 하나의 객체를 여러 타입으로 참조할 수 있다.
- 상속과 인터페이스는 함께 사용하여 유연한 구조를 만들 수 있다.

### 18. 중첩 클래스(Nested Class)

중첩 클래스는 클래스 또는 인터페이스 내부에 선언하는 클래스이다.

**주요 목적**

- 특정 클래스와 밀접한 관련이 있는 클래스를 묶는다.
- 외부에 불필요한 구현을 숨긴다.
- 관련된 기능을 논리적으로 정리한다.

**멤버 내부 클래스 예제**

```java
class Outer {

    private int value = 10;

    class Inner {

        void print() {
            System.out.println(value);
        }
    }
}
```

**사용 예제**

```java
Outer outer = new Outer();
Outer.Inner inner = outer.new Inner();

inner.print(); // 10
```

**대표적인 중첩 클래스**

| 종류 | 특징 |
|---|---|
| 인스턴스 멤버 클래스 | 외부 클래스의 객체와 연결 |
| 정적 멤버 클래스 | 외부 객체 없이 생성 가능 |
| 지역 클래스 | 메서드 또는 블록 내부에 선언 |
| 익명 클래스 | 이름 없이 선언하고 객체 생성 |

- 인스턴스 멤버 클래스는 외부 객체의 인스턴스 멤버에 접근할 수 있다.
- 정적 멤버 클래스는 외부 객체 없이 사용할 수 있다.
- 중첩 클래스는 관련 기능을 하나의 구조 안에 묶을 때 유용하다.

### 19. 다형성을 활용한 결제 시스템

결제 시스템은 인터페이스와 다형성을 이용해 구현체를 유연하게 교체할 수 있는 대표적인 예시이다.

**인터페이스 정의**

```java
interface Payment {
    void pay(int amount);
}
```

**카드 결제 구현**

```java
class CardPayment implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println("카드 결제: " + amount);
    }
}
```

**카카오페이 결제 구현**

```java
class KakaoPayment implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println("카카오페이 결제: " + amount);
    }
}
```

**결제 서비스**

```java
class PaymentService {

    public void process(Payment payment, int amount) {
        payment.pay(amount);
    }
}
```

**사용 예제**

```java
PaymentService service = new PaymentService();

service.process(new CardPayment(), 10000);
service.process(new KakaoPayment(), 20000);
```

**실행 구조**

```text
           PaymentService
                  │
           process(Payment)
                  │
                  ▼
          Payment 인터페이스
               pay()
                  │
          ┌───────┴───────┐
          │               │
          ▼               ▼
    CardPayment      KakaoPayment
          │               │
          ▼               ▼
       카드 결제       카카오페이 결제
```

**핵심**

- `PaymentService`는 구체적인 결제 클래스에 직접 의존하지 않는다.
- `Payment` 인터페이스를 통해 결제 기능을 호출한다.
- 새로운 결제 방식이 추가되어도 기존 서비스의 핵심 코드를 변경하지 않고 확장할 수 있다.

이러한 구조는 프로그램의 유연성을 높이고 구현체 간 결합도를 낮추는 데 도움이 된다.

### 20. 인터페이스를 활용한 알림 시스템

서로 다른 알림 방식을 동일한 규칙으로 처리할 수 있다.

**공통 인터페이스**

```java
interface Notification {
    void send(String message);
}
```

**이메일 알림**

```java
class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("이메일: " + message);
    }
}
```

**문자 알림**

```java
class SmsNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}
```

**공통 처리 메서드**

```java
static void notifyUser(
        Notification notification,
        String message) {

    notification.send(message);
}
```

**호출 예제**

```java
notifyUser(new EmailNotification(), "가입 완료");
notifyUser(new SmsNotification(), "인증번호 발송");
```

**핵심**

- 이메일과 SMS의 실제 처리 과정은 서로 다르다.
- 두 클래스 모두 `Notification` 인터페이스를 구현한다.
- 호출하는 코드는 `send()`라는 공통 규칙만 알면 된다.
- 인터페이스를 통해 기능 구현과 사용 코드를 분리할 수 있다.

※ 위 예제는 알림 출력만 표현한 구조 설명용 코드이다. 실제 이메일과 SMS 전송에는 외부 서비스 연동이 필요하다.

### 21. 객체지향 설계에서 각 원칙의 역할

객체지향의 네 가지 원칙은 실무 시스템에서 함께 사용될 수 있다.

**결제 시스템을 기준으로 한 구조**

```text
            결제 시스템
                 │
       ┌─────────┴─────────┐
       │                   │
       ▼                   ▼
    캡슐화                상속
  결제 정보 보호      공통 기능 재사용
       │                   │
       └─────────┬─────────┘
                 │
                 ▼
            추상화
       Payment 인터페이스
                 │
                 ▼
            다형성
      서로 다른 결제 방식 실행
                 │
        ┌────────┴────────┐
        │                 │
        ▼                 ▼
     카드 결제         간편 결제
```

**객체지향 원칙별 적용 목적**

| 원칙 | 실무 적용 예시 |
|---|---|
| 캡슐화 | 계좌 잔액, 주문 상태, 재고 수량 보호 |
| 상속 | 공통 특성을 가진 클래스 확장 |
| 다형성 | 여러 결제 방식, 알림 방식 처리 |
| 추상화 | 결제 및 알림 기능의 공통 규칙 정의 |

**설계 시 고려할 점**

- 모든 클래스에 상속을 적용할 필요는 없다.
- 공통 기능을 공유한다고 항상 상속이 적절한 것은 아니다.
- 단순한 클래스 구조에는 인터페이스가 불필요할 수 있다.
- 변경 가능성과 유지보수성을 고려해 적절한 원칙을 선택한다.

### 22. 자주 발생하는 오류 및 주의사항

| 주의사항 | 원인 및 해결 방법 |
|---|---|
| private 필드 직접 접근 | 공개 메서드를 통한 접근 사용 |
| 생성자 이름 오류 | 클래스 이름과 일치해야 함 |
| 부모 생성자 호출 누락 | 부모 생성자의 매개변수 확인 |
| 상속 관계 오용 | 클래스 간 IS-A 관계 검토 |
| 오버로딩과 오버라이딩 혼동 | 매개변수 변경과 메서드 재정의 구분 |
| 잘못된 @Override | 부모 메서드의 시그니처 확인 |
| 부모 타입의 멤버 접근 | 선언된 참조 타입에서 사용 가능한 멤버 확인 |
| 잘못된 다운캐스팅 | instanceof로 실제 타입 확인 |
| 추상 클래스 객체 생성 | 구체적인 자식 클래스 생성 |
| 추상 메서드 미구현 | 구현하거나 자식 클래스도 abstract로 선언 |
| 인터페이스 메서드 접근 제한 | 구현 시 public 접근 수준 유지 |
| 인터페이스 중복 default 메서드 | 구현 클래스에서 충돌 해결 |
| static 메서드 오버라이딩 | 정적 메서드는 오버라이딩되지 않음 |
| 불필요한 상속 | 역할 분리 및 인터페이스 사용 검토 |

### ✅ Day13 핵심 정리

| 구분 | 핵심 내용 |
|---|---|
| OOP | 객체를 중심으로 프로그램 구성 |
| Class | 객체의 상태와 동작을 정의하는 설계도 |
| Object | 클래스를 기반으로 생성된 실체 |
| Constructor | 객체 생성 시 초기 상태 설정 |
| Instance Variable | 객체마다 독립적인 데이터 |
| Static Variable | 클래스에 속하는 공유 데이터 |
| Stack / Heap | 메서드 실행 정보와 객체 관리 |
| Encapsulation | 객체의 상태 보호와 접근 제어 |
| Inheritance | 기존 클래스의 기능 상속 및 확장 |
| extends | 클래스 상속 키워드 |
| super | 부모 클래스의 멤버 참조 |
| super() | 부모 생성자 호출 |
| Overloading | 같은 이름, 다른 매개변수 구성 |
| Overriding | 상속받은 인스턴스 메서드 재정의 |
| Polymorphism | 동일한 호출, 실제 객체별 다른 동작 |
| Upcasting | 부모 타입으로 자식 객체 참조 |
| Downcasting | 자식 타입으로 참조 타입 변환 |
| instanceof | 객체의 타입 호환성 확인 |
| Abstraction | 공통 기능 정의 및 구현 세부사항 은닉 |
| Abstract Class | 상속을 위한 추상 클래스 |
| Abstract Method | 구현부가 없는 추상 메서드 |
| Interface | 클래스가 구현할 기능의 규칙 |
| implements | 인터페이스 구현 키워드 |
| Default Method | 인터페이스에 구현된 인스턴스 메서드 |
| Multiple Implementation | 여러 인터페이스 동시 구현 |
| Nested Class | 클래스 내부에 선언된 클래스 |
| 다형성 설계 | 인터페이스를 이용한 구현체 교체 및 확장 |

**최종 학습 정리**

- 객체지향 프로그래밍은 데이터와 기능을 가진 객체들의 관계로 프로그램을 구성한다.
- 클래스는 설계도이며 객체는 클래스를 기반으로 생성된 실체이다.
- 캡슐화는 객체의 상태를 보호하고 올바른 규칙을 통해 변경하도록 한다.
- 상속은 부모 클래스의 공통 기능을 물려받아 재사용하고 확장한다.
- `super()`는 부모 클래스의 생성자를 호출한다.
- 오버로딩은 같은 이름의 메서드를 다양한 매개변수로 선언하는 것이다.
- 오버라이딩은 부모 클래스의 메서드를 자식 클래스에서 재정의하는 것이다.
- 다형성은 같은 타입으로 여러 객체를 다루며 실제 객체에 따라 다른 동작을 수행하는 특성이다.
- 자동 타입 변환을 통해 부모 타입으로 자식 객체를 참조할 수 있다.
- 강제 타입 변환은 실제 객체의 타입과 호환되는지 확인해야 한다.
- 추상 클래스는 공통 상태와 기능을 제공하며 직접 객체를 생성할 수 없다.
- 인터페이스는 클래스가 제공할 기능의 규칙을 정의한다.
- Java는 클래스의 다중 상속은 지원하지 않지만 여러 인터페이스의 구현은 지원한다.
- 추상 클래스와 인터페이스는 목적에 따라 선택하거나 함께 사용할 수 있다.
- 객체지향의 핵심은 네 가지 원칙을 무조건 적용하는 것이 아니라 역할과 책임에 맞게 설계하는 것이다.

</details>


## Day14. 클래스·객체·JVM 메모리 구조
<details>

### 🎯 학습 목표
- 클래스와 객체, 인스턴스의 관계를 이해한다.
- 필드, 생성자, 메서드, 초기화 블록의 역할을 구분한다.
- 생성자의 특징과 오버로딩 조건을 이해한다.
- JVM의 `Stack`, `Heap`, `Method Area`의 역할을 이해한다.
- 객체 생성과 참조 변수의 메모리 동작을 설명할 수 있다.
- 지역 변수, 인스턴스 변수, `static` 변수의 차이를 구분한다.
- 메서드 호출 스택과 지역 변수의 생명주기를 이해한다.
- `this`와 `static`의 사용 방법 및 제약을 이해한다.
- 캡슐화로 객체의 상태를 안전하게 관리할 수 있다.
- 상속(Inheritance)과 구성(Composition)의 차이를 이해한다.
- 객체지향 원칙을 쇼핑몰 프로그램 설계에 적용할 수 있다.

### 1. 클래스와 객체의 관계

클래스(Class)는 객체의 상태와 동작을 정의하는 설계도이며, 객체(Object)는 클래스를 기반으로 생성된 실체이다.

| 구분 | 설명 |
|---|---|
| Class | 객체의 구조와 기능을 정의하는 설계도 |
| Object | 클래스를 기반으로 생성된 실체 |
| Instance | 특정 클래스로부터 생성된 객체 |
| Field | 객체의 상태를 저장하는 변수 |
| Method | 객체가 수행하는 기능 |
| Constructor | 객체 생성 시 초기 상태를 설정하는 구성 요소 |

**클래스 선언**

```java
class Car {
    String color;
    int speed;

    void drive() {
        System.out.println("자동차가 주행합니다.");
    }
}
```

**객체 생성**

```java
Car car1 = new Car();
Car car2 = new Car();

car1.color = "빨강";
car2.color = "파랑";
```

**클래스와 객체의 관계**

```text
             Car 클래스
        ┌────────────────┐
        │ color          │
        │ speed          │
        │ drive()        │
        └────────┬───────┘
                 │
              new Car()
                 │
          ┌──────┴──────┐
          ▼             ▼
       Car 객체 A    Car 객체 B
       color: 빨강    color: 파랑
       speed: 0       speed: 0
```

**핵심**

- 클래스는 객체를 생성하기 위한 타입을 정의한다.
- 객체는 클래스에 선언된 구조와 기능을 가진다.
- 인스턴스 필드는 객체마다 독립적으로 존재한다.
- 서로 다른 `new` 표현식으로 생성한 객체는 서로 다른 객체이다.

### 2. 클래스의 주요 구성 요소

Java 클래스는 필드, 생성자, 메서드, 초기화 블록 등으로 구성할 수 있다.

| 구성 요소 | 역할 |
|---|---|
| 필드(Field) | 객체 또는 클래스의 데이터 저장 |
| 생성자(Constructor) | 객체 생성 과정에서 초기 상태 설정 |
| 메서드(Method) | 특정 기능이나 동작 수행 |
| 인스턴스 초기화 블록 | 객체 생성 과정에서 공통 초기화 작업 수행 |
| 정적 초기화 블록 | 클래스 초기화 시 정적 데이터 초기화 |

**클래스 구조**

```java
class Student {

    // 인스턴스 필드
    String name;
    int age;

    // 정적 필드
    static int count = 0;

    // 인스턴스 초기화 블록
    {
        age = 20;
    }

    // 정적 초기화 블록
    static {
        count = 0;
    }

    // 생성자
    Student(String name) {
        this.name = name;
        count++;
    }

    // 메서드
    void study() {
        System.out.println(name + " 공부 중");
    }
}
```

- 필드는 상태를 저장한다.
- 생성자와 초기화 블록은 객체의 초기 상태를 구성한다.
- 메서드는 객체의 기능을 정의한다.
- `static` 멤버는 특정 객체가 아닌 클래스에 소속된다.

### 3. 생성자(Constructor)

생성자는 객체를 생성할 때 호출되어 초기화 작업을 수행하는 특별한 구성 요소이다.

**생성자의 핵심 규칙**

1. 생성자의 이름은 클래스 이름과 동일하다.
2. 반환 타입을 선언하지 않는다. `void`도 작성하지 않는다.
3. 객체 생성 과정에서 호출된다.
4. 주로 필드의 초기값을 설정한다.
5. 매개변수 구성을 다르게 하여 여러 생성자를 선언할 수 있다.

**생성자 선언**

```java
class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

**객체 생성**

```java
Student student = new Student("홍길동", 20);
```

**생성 과정**

```text
new Student("홍길동", 20)
           │
           ▼
     객체 메모리 확보
           │
           ▼
     필드 기본값 설정
           │
           ▼
     필드 초기화 및
     생성자 실행
           │
           ▼
     초기화된 객체 사용
```

**기본 생성자와 매개변수 생성자**

```java
class Student {

    String name;
    int age;

    // 매개변수가 없는 생성자
    Student() {
        this("이름 없음", 0);
    }

    // 매개변수가 있는 생성자
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

**주의사항**

- 생성자를 하나도 선언하지 않으면 컴파일러가 기본 생성자를 제공한다.
- 생성자를 직접 하나라도 선언하면 기본 생성자가 자동으로 제공되지 않는다.
- 생성자의 반환 타입을 작성하면 생성자가 아닌 메서드가 된다.

### 4. 초기화 블록(Initialization Block)

초기화 블록은 클래스 또는 객체의 초기화 작업을 수행하기 위해 사용하는 코드 블록이다.

**초기화 블록의 종류**

| 구분 | 인스턴스 초기화 블록 | 정적 초기화 블록 |
|---|---|---|
| 문법 | `{ }` | `static { }` |
| 실행 시점 | 객체 생성 과정 | 클래스 초기화 시 |
| 실행 횟수 | 객체를 생성할 때마다 | 클래스 초기화당 한 번 |
| 주요 용도 | 공통 인스턴스 초기화 | 정적 데이터 초기화 |

**Java 예제**

```java
class Example {

    static int count;
    int value;

    static {
        count = 100;
        System.out.println("정적 초기화");
    }

    {
        value = 10;
        System.out.println("인스턴스 초기화");
    }

    Example() {
        System.out.println("생성자 실행");
    }
}
```

**객체 생성**

```java
Example e1 = new Example();
Example e2 = new Example();
```

클래스가 이전에 초기화되지 않았다고 가정하면 다음 순서로 출력된다.

```text
정적 초기화
인스턴스 초기화
생성자 실행
인스턴스 초기화
생성자 실행
```

**초기화 실행 순서**

```text
클래스 최초 초기화
        │
        ▼
static 필드 초기화 및
static 블록 실행
        │
        ▼
new를 통한 객체 생성
        │
        ▼
인스턴스 필드 초기화 및
인스턴스 블록 실행
        │
        ▼
생성자 본문 실행
        │
        ▼
객체 초기화 완료
```

**주의사항**

- 정적 초기화는 클래스가 실제로 초기화될 때 수행한다.
- 정적 필드 초기화와 정적 블록은 선언된 순서에 따라 실행한다.
- 인스턴스 필드 초기화와 인스턴스 블록도 선언된 순서에 따라 실행한다.
- 상속 관계에서는 부모 객체 부분의 초기화가 자식 객체 부분보다 먼저 이루어진다.
- 생성자에서 공통적으로 수행할 초기화는 초기화 블록으로 분리할 수 있지만, 일반적으로 생성자나 필드 초기화 문법이 더 간결할 수 있다.

### 5. 메서드 오버로딩(Overloading)

오버로딩은 동일한 이름의 메서드를 매개변수 구성을 다르게 하여 여러 개 선언하는 것이다.

**오버로딩이 가능한 조건**

| 조건 | 가능 여부 |
|---|---|
| 매개변수 개수가 다름 | O |
| 매개변수 타입이 다름 | O |
| 매개변수 타입 순서가 다름 | O |
| 반환 타입만 다름 | X |
| 매개변수 이름만 다름 | X |

**Java 예제**

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

**메서드 호출**

```java
Calculator calc = new Calculator();

System.out.println(calc.add(10, 20));     // 30
System.out.println(calc.add(10, 20, 30)); // 60
System.out.println(calc.add(1.5, 2.5));   // 4.0
```

- 메서드 이름이 같아도 매개변수 구성이 다르면 구분할 수 있다.
- 컴파일러는 전달된 인자를 기준으로 호출할 메서드를 결정한다.
- 생성자도 매개변수 구성을 다르게 하여 오버로딩할 수 있다.

**주의 : 오버로딩과 오버라이딩은 다르다. 오버로딩은 매개변수 구성의 차이이며, 오버라이딩은 상속된 인스턴스 메서드의 재정의이다.**

### 6. JVM의 주요 메모리 영역

JVM(Java Virtual Machine)은 프로그램을 실행하기 위해 메모리를 여러 논리적 영역으로 나누어 관리한다.

**주요 영역**

| 메모리 영역 | 역할 |
|---|---|
| Method Area | 클래스 메타데이터, 메서드 정보, 런타임 상수 풀 등 |
| Heap | 객체와 배열이 생성되는 공간 |
| JVM Stack | 메서드 호출 시 스택 프레임 관리 |
| PC Register | 각 스레드의 현재 JVM 명령어 실행 위치 관리 |
| Native Method Stack | 네이티브 메서드 실행 지원 |

**기본 메모리 구조**

```text
              JVM 메모리
                   │
       ┌───────────┼───────────┐
       │           │           │
       ▼           ▼           ▼
  Method Area     Heap       Stack
 ┌────────────┐ ┌─────────┐ ┌────────────┐
 │ 클래스 정보 │ │ 객체 A  │ │ main()     │
 │ 메서드 정보 │ │ 객체 B  │ │ 지역 변수  │
 │ 상수 풀 등  │ │ 배열    │ │ 참조값     │
 └────────────┘ └─────────┘ └────────────┘
```

**Method Area**

- 클래스의 구조 및 메서드 관련 정보를 관리한다.
- 런타임 상수 풀 등 클래스 수준의 정보를 저장한다.
- 정적 멤버는 클래스와 연관되어 관리된다.

**Heap**

- 객체와 배열이 생성되는 대표적인 메모리 영역이다.
- 여러 참조 변수가 동일한 객체에 접근할 수 있다.
- 가비지 컬렉션의 주요 관리 대상이다.

**Stack**

- 메서드가 호출될 때 스택 프레임을 생성한다.
- 매개변수, 지역 변수, 중간 연산 결과 등을 관리한다.
- 메서드가 종료되면 해당 호출의 스택 프레임이 제거된다.

※ 위 구조는 JVM 메모리의 논리적 설명이다. 실제 저장 위치와 구현 방식은 JVM에 따라 달라질 수 있으며, 정적 필드가 반드시 특정 물리 영역에 저장된다고 단정할 수 없다.

### 7. 기본형 변수와 참조 변수

**기본형(Primitive Type)**

- 변수에 실제 값을 저장한다.
- 다른 변수에 대입하면 값 자체가 복사된다.

```java
int a = 10;
int b = a;

b = 50;

System.out.println(a); // 10
System.out.println(b); // 50
```

**참조 타입(Reference Type)**

- 객체에 접근하기 위한 참조값을 저장한다.
- 다른 변수에 대입하면 참조값이 복사된다.

```java
Student s1 = new Student("철수", 20);
Student s2 = s1;

s2.age = 30;

System.out.println(s1.age); // 30
```

**참조 변수의 메모리 구조**

```text
      지역 참조 변수             Heap
    ┌──────────────┐
    │ s1 ──────────┼─────┐
    │              │     │
    │ s2 ──────────┼──┐  │
    └──────────────┘  │  │
                      ▼  ▼
                ┌─────────────┐
                │ Student 객체│
                │ name: 철수  │
                │ age: 30     │
                └─────────────┘
```

**핵심 차이**

| 구분 | 기본형 | 참조 타입 |
|---|---|---|
| 저장 내용 | 실제 값 | 객체 참조값 |
| 대입 연산 | 값 복사 | 참조값 복사 |
| 동일 객체 공유 | 해당 없음 | 가능 |
| null 저장 | 불가능 | 가능 |

**주의사항**

- 참조값은 객체에 접근하기 위한 값이며 실제 메모리 주소와 반드시 동일한 것은 아니다.
- 참조 변수에 다른 참조값을 대입해도 기존 객체가 즉시 삭제되는 것은 아니다.
- 더 이상 도달할 수 없는 객체는 GC의 회수 대상이 될 수 있다.

### 8. 객체 생성과 메모리 구조

`new`로 객체를 생성하면 객체의 인스턴스 데이터가 Heap에 생성된다.

**객체 생성 예제**

```java
Student s1 = new Student("철수", 20);
Student s2 = new Student("영희", 25);
```

**메모리 구조**

```text
Stack                         Heap

┌─────────────┐       ┌─────────────────┐
│ s1 (참조값) ├──────>│ Student 객체 A  │
│             │       │ name: 철수      │
│             │       │ age: 20         │
├─────────────┤       └─────────────────┘
│ s2 (참조값) ├───┐
└─────────────┘   │    ┌─────────────────┐
                  └───>│ Student 객체 B  │
                       │ name: 영희      │
                       │ age: 25         │
                       └─────────────────┘
```

**객체 생성의 기본 흐름**

1. 필요한 클래스 정보를 확인한다.
2. Heap에 객체의 메모리 공간을 확보한다.
3. 인스턴스 필드에 기본값을 설정한다.
4. 부모 클래스부터 필요한 초기화 작업과 생성자를 실행한다.
5. 생성된 객체의 참조값을 이용하여 객체에 접근한다.

**주의 : `s1`과 `s2`가 서로 다른 객체를 참조하면 인스턴스 필드의 값은 독립적으로 관리된다.**

### 9. 메서드 호출 스택(Call Stack)

메서드를 호출하면 해당 스레드의 JVM Stack에 새로운 스택 프레임이 생성된다.

**메서드 호출 예제**

```java
public class StackExample {

    static void methodA() {
        methodB();
    }

    static void methodB() {
        int number = 10;
        System.out.println(number);
    }

    public static void main(String[] args) {
        methodA();
    }
}
```

**실행 흐름**

```text
main() 실행
    │
    ▼
methodA() 호출
    │
    ▼
methodB() 호출
    │
    ▼
System.out.println()
    │
    ▼
methodB() 종료
    │
    ▼
methodA() 종료
    │
    ▼
main() 종료
```

**호출 스택 구조**

```text
[methodB 실행 중]

┌────────────────┐
│ methodB()      │ ← 현재 실행 중
│ number = 10    │
├────────────────┤
│ methodA()      │
├────────────────┤
│ main()         │
└────────────────┘
```

**LIFO(Last In First Out)**

- 마지막에 호출한 메서드가 먼저 종료된다.
- 메서드가 종료되면 해당 스택 프레임이 제거된다.
- 지역 변수는 메서드의 실행 및 유효 범위에 따라 관리된다.
- 각 스레드는 독립적인 JVM Stack을 가진다.

**주의 : 객체를 참조하는 지역 변수가 스택 프레임에서 제거되더라도 객체가 즉시 삭제되는 것은 아니다.**

### 10. 변수의 종류와 생명주기

Java 변수는 선언 위치와 소속에 따라 지역 변수, 인스턴스 변수, 정적 변수로 구분한다.

| 구분 | 지역 변수 | 인스턴스 변수 | 정적 변수 |
|---|---|---|---|
| 선언 위치 | 메서드 또는 블록 내부 | 클래스 내부 | 클래스 내부 |
| 소속 | 실행 범위 | 객체 | 클래스 |
| 초기값 | 사용 전 초기화 필요 | 자동 기본값 설정 | 자동 기본값 설정 |
| 사용 시점 | 해당 블록 실행 중 | 객체를 통해 사용 | 클래스 초기화 이후 |
| 생명주기 | 선언된 범위 및 실행에 종속 | 객체의 생명주기와 연관 | 클래스의 생명주기와 연관 |

**Java 예제**

```java
class Student {

    // 인스턴스 변수
    String name;

    // 정적 변수
    static String school = "한국학교";

    void study() {

        // 지역 변수
        int studyTime = 60;

        System.out.println(name);
        System.out.println(studyTime);
    }
}
```

**변수의 역할**

- 지역 변수 : 메서드에서 임시로 사용하는 값
- 인스턴스 변수 : 객체별로 독립적인 상태
- 정적 변수 : 클래스 수준에서 공유하는 데이터

**주의사항**

- 지역 변수는 사용 전에 반드시 초기화해야 한다.
- 인스턴스 필드는 객체가 도달 가능하다고 반드시 계속 살아 있는 것은 아니며, 객체가 GC로 회수되면 함께 사라진다.
- 정적 필드는 클래스에 소속되며, 일반적으로 클래스가 사용되는 동안 유지된다.
- 블록을 벗어나면 지역 변수의 유효 범위가 종료되지만 실제 메모리 회수 과정은 JVM 구현에 따라 다르다.

### 11. 인스턴스 변수와 static 변수

**인스턴스 변수(Instance Variable)**

- 객체마다 별도로 존재한다.
- 각 객체의 고유한 상태를 저장한다.
- 객체를 생성한 후 해당 객체를 통해 접근한다.

**정적 변수(Static Variable)**

- 클래스 단위로 존재한다.
- 같은 클래스의 객체들이 공유한다.
- 객체를 생성하지 않고 클래스 이름으로 접근할 수 있다.

**Java 예제**

```java
class Product {

    // 객체별 데이터
    String name;
    int price;

    // 클래스 공통 데이터
    static String category = "전자제품";
}
```

```java
Product p1 = new Product();
Product p2 = new Product();

p1.name = "키보드";
p2.name = "마우스";

System.out.println(p1.name); // 키보드
System.out.println(p2.name); // 마우스

System.out.println(Product.category);
// 전자제품
```

**인스턴스 변수와 정적 변수의 관계**

```text
             Product 클래스
       ┌─────────────────────┐
       │ static category     │
       │      "전자제품"      │
       └──────────┬──────────┘
                  │
           클래스 공통 데이터
             ┌────┴────┐
             ▼         ▼

         Product A   Product B
        ┌─────────┐ ┌─────────┐
        │ 키보드   │ │ 마우스  │
        │ 30000   │ │ 20000   │
        └─────────┘ └─────────┘
```

**주의 : `static` 변수에 특정 사용자의 로그인 정보, 주문 내역, 장바구니 상태 등을 저장하면 데이터 공유 문제가 발생할 수 있다.**

특히 웹 애플리케이션에서는 여러 사용자나 스레드가 같은 정적 변수에 접근할 수 있으므로, 사용자별 데이터와 공통 설정값을 명확히 구분해야 한다.

### 12. static 메서드와 this

`static` 메서드는 클래스에 소속되며, `this`는 현재 인스턴스 객체를 참조한다.

**static 메서드**

```java
class Calculator {

    static int add(int a, int b) {
        return a + b;
    }
}
```

```java
int result = Calculator.add(10, 20);
System.out.println(result); // 30
```

**인스턴스 메서드와 this**

```java
class Student {

    private String name;

    Student(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println(this.name);
    }
}
```

**this의 주요 역할**

| 문법 | 역할 |
|---|---|
| `this` | 현재 객체 참조 |
| `this.name` | 현재 객체의 필드 접근 |
| `this()` | 동일 클래스의 다른 생성자 호출 |
| `super` | 부모 클래스의 접근 가능한 멤버 참조 |
| `super()` | 부모 클래스의 생성자 호출 |

**static에서 this를 사용할 수 없는 이유**

- `static` 메서드는 클래스에 속한다.
- 특정 객체를 기준으로 호출되는 메서드가 아니다.
- 따라서 현재 객체를 나타내는 `this` 참조가 존재하지 않는다.
- 인스턴스 멤버를 사용하려면 객체 참조가 필요하다.

**주의 : `static` 메서드에서 인스턴스 필드나 인스턴스 메서드를 직접 호출할 수는 없지만, 객체 참조를 이용한 접근은 가능하다.**

### 13. 캡슐화와 데이터 무결성

캡슐화(Encapsulation)는 객체 내부의 데이터와 기능을 묶고, 정해진 규칙을 통해 상태를 조회하거나 변경하도록 제어하는 원칙이다.

**잘못된 설계**

```java
class BankAccount {
    public int balance;
}
```

```java
BankAccount account = new BankAccount();

account.balance = -9999;
```

외부에서 필드를 직접 변경할 수 있으므로 유효하지 않은 상태가 발생할 수 있다.

**캡슐화 적용**

```java
class BankAccount {

    private int balance;

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "입금액은 양수여야 합니다."
            );
        }

        balance += amount;
    }

    public int getBalance() {
        return balance;
    }
}
```

**데이터 접근 구조**

```text
        외부 코드
            │
            │ 직접 수정
            ▼
       private balance
            X
       접근 불가능


        외부 코드
            │
            ▼
      public deposit()
            │
            ▼
        값 유효성 검사
            │
       ┌────┴────┐
       │         │
      정상      잘못된 값
       │         │
       ▼         ▼
     잔액 변경   예외 발생
```

**핵심**

- `private`으로 외부의 직접 접근을 제한한다.
- `public` 메서드를 통해 필요한 기능만 공개한다.
- 중요한 값은 변경하기 전에 검증한다.
- 캡슐화의 목적은 단순한 데이터 은닉이 아니라 객체의 상태와 데이터 무결성을 유지하는 것이다.

### 14. 상속(Inheritance)과 구성(Composition)

객체지향에서 코드의 재사용과 클래스 간 관계를 표현하는 대표적인 방식은 상속과 구성이다.

**상속(Inheritance)**

- 기존 클래스를 확장하여 새로운 클래스를 정의한다.
- `extends` 키워드를 사용한다.
- 부모와 자식이 IS-A 관계에 있을 때 적합하다.

**구성(Composition)**

- 클래스가 다른 클래스의 객체를 필드로 포함한다.
- HAS-A 관계를 표현할 때 적합하다.
- 다른 객체의 기능을 조합하여 새로운 기능을 구성한다.

**상속 예제**

```java
class Employee {

    String name;

    void work() {
        System.out.println("업무 수행");
    }
}

class Developer extends Employee {

    void develop() {
        System.out.println("개발 작업");
    }
}
```

- Developer는 Employee의 한 종류이다.
- 부모 클래스의 기능을 재사용하면서 기능을 확장한다.

**구성 예제**

```java
class Engine {

    void start() {
        System.out.println("엔진 작동");
    }
}

class Car {

    private final Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
        System.out.println("주행 시작");
    }
}
```

- Car는 Engine을 가지고 있다.
- Engine은 Car의 부모 클래스가 아니다.
- 객체의 기능을 상속이 아닌 조합으로 구성한다.

**상속과 구성 비교**

| 구분 | 상속 | 구성 |
|---|---|---|
| 관계 | IS-A | HAS-A |
| 구현 | extends | 객체를 필드로 포함 |
| 목적 | 공통 특성과 기능 확장 | 다른 객체의 기능 조합 |
| 결합도 | 부모 구현에 영향을 받을 수 있음 | 설계에 따라 의존성을 줄일 수 있음 |
| 예시 | Developer is an Employee | Car has an Engine |

**주의 : 단순히 코드를 재사용하기 위한 목적이라면 상속보다 구성을 먼저 검토하는 것이 좋다.**

### 15. 객체지향의 4대 핵심 원칙

| 원칙 | 개념 | 실무 적용 |
|---|---|---|
| 캡슐화 | 객체 내부 상태와 접근 규칙 관리 | 계좌 잔액, 재고 수량 보호 |
| 상속 | 기존 클래스의 기능 확장 | 공통 특성을 가진 클래스 재사용 |
| 다형성 | 동일한 호출에 서로 다른 동작 제공 | 결제 방식 및 알림 방식 교체 |
| 추상화 | 필요한 기능만 정의하고 세부 구현 숨김 | 인터페이스, 추상 클래스 |

**오버로딩과 오버라이딩 비교**

| 구분 | 오버로딩 | 오버라이딩 |
|---|---|---|
| 개념 | 같은 이름, 다른 매개변수 구성 | 상속받은 메서드 재정의 |
| 상속 | 필요 없음 | 필요 |
| 메서드 선택 | 컴파일 시점의 인자 타입 등 기준 | 실제 객체에 따른 동적 디스패치 |
| 목적 | 다양한 입력 형태 처리 | 동작 변경 및 다형성 구현 |

- 캡슐화는 데이터의 안전한 관리를 돕는다.
- 상속은 적절한 계층 구조에서 공통 기능을 재사용한다.
- 다형성은 실제 객체에 따라 다른 기능을 실행할 수 있게 한다.
- 추상화는 사용자가 알아야 할 기능과 세부 구현을 분리한다.

### 16. 쇼핑몰 프로그램에서의 객체지향 설계

쇼핑몰 프로그램에서는 상품, 주문, 결제, 사용자와 같은 개념을 각각의 객체로 분리할 수 있다.

**클래스별 역할**

| 클래스 | 주요 역할 |
|---|---|
| Product | 상품의 이름과 가격 관리 |
| Order | 주문 정보 및 주문 상태 관리 |
| ProductService | 상품 관련 비즈니스 로직 처리 |
| OrderService | 주문 금액 계산과 주문 처리 |
| Repository | 상품 및 주문 데이터 접근 |

**쇼핑몰 기본 구조**

```text
            사용자 요청
                 │
                 ▼
            Controller
                 │
                 ▼
           OrderService
                 │
       ┌─────────┴─────────┐
       │                   │
       ▼                   ▼
     Product             Order
   상품 정보 관리       주문 상태 관리
       │                   │
       └─────────┬─────────┘
                 ▼
             Repository
                 │
                 ▼
              Database
```

**상품 클래스**

```java
class Product {

    private final String name;
    private final int price;

    Product(String name, int price) {
        if (price < 0) {
            throw new IllegalArgumentException(
                "상품 가격은 음수일 수 없습니다."
            );
        }

        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
```

**주문 서비스**

```java
class OrderService {

    public int calculateTotal(
            Product product, int quantity) {

        if (quantity <= 0) {
            throw new IllegalArgumentException(
                "수량은 1 이상이어야 합니다."
            );
        }

        return Math.multiplyExact(
            product.getPrice(), quantity
        );
    }
}
```

**메서드 호출**

```java
Product product = new Product("키보드", 30000);

OrderService service = new OrderService();

int total = service.calculateTotal(product, 2);

System.out.println(total); // 60000
```

**적용된 객체지향 개념**

- 클래스 : 상품과 주문 서비스를 역할별로 분리
- 필드 : 상품 이름과 가격 저장
- 생성자 : 상품의 초기 상태 설정
- 캡슐화 : 가격을 직접 변경하지 못하도록 제한
- 메서드 : 주문 금액 계산 기능 분리
- 구성 : OrderService가 Product 객체를 이용하여 작업 수행

※ 위 코드는 클래스의 책임 분리를 이해하기 위한 기본 예제이며, 실제 쇼핑몰의 전체 주문·결제 기능을 구현한 것은 아니다.

### 17. Spring Boot에서의 클래스 설계

실제 Spring Boot 프로그램에서는 서비스가 필요로 하는 다른 객체를 생성자를 통해 전달받는 구조를 자주 사용한다.

**생성자 주입(Constructor Injection)**

```java
@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product findProduct(Long id) {
        return repository.findById(id)
            .orElseThrow(() ->
                new IllegalArgumentException("상품 없음")
            );
    }
}
```

**코드의 핵심 구조**

- `ProductService` : 상품 관련 비즈니스 로직 담당
- `ProductRepository` : 상품 데이터 접근 담당
- `private final` : 서비스가 사용하는 참조를 생성 후 재대입하지 못하도록 제한
- 생성자 : 필요한 의존 객체를 전달받아 초기화
- `findProduct()` : Repository를 이용하여 데이터 조회

**의존성 주입 구조**

```text
     Spring 컨테이너
            │
            │ 의존 객체 주입
            ▼
      ProductService
            │
            │ Repository 사용
            ▼
     ProductRepository
            │
            ▼
         Database
```

**핵심**

- 서비스가 Repository를 직접 `new`로 생성하지 않는다.
- 필요한 객체를 외부에서 전달받는다.
- 클래스마다 역할을 분리하고 객체 사이의 의존 관계를 명확하게 구성한다.
- Spring은 관리 대상 객체들의 생성과 의존 관계 구성을 지원한다.

※ 위 코드는 Spring Boot 환경과 Repository 구현이 필요한 구조 설명용 예제이다. 일반 Java 파일 하나만으로 실행되는 독립 프로그램은 아니다.

### 18. 클래스 설계 시 자주 발생하는 오류

| 주의사항 | 원인 및 해결 방법 |
|---|---|
| 생성자 반환 타입 선언 | 생성자는 반환 타입을 선언하지 않음 |
| 기본 생성자 오류 | 매개변수 생성자 선언 시 기본 생성자 자동 생성 안 됨 |
| 오버로딩 오류 | 반환 타입만 다른 메서드는 오버로딩 불가 |
| 지역 변수 미초기화 | 사용하기 전에 값을 반드시 설정 |
| 객체 참조 공유 | 단순 대입 시 동일 객체 참조 |
| static 필드 오용 | 사용자별 상태를 공유 변수로 저장하지 않기 |
| static에서 this 사용 | 정적 문맥에는 현재 객체 참조가 없음 |
| 객체 메모리 오해 | 참조값과 객체 자체를 구분 |
| 메서드 호출 스택 | 호출과 반환에 따른 프레임 변화 이해 |
| 캡슐화 부족 | private 및 검증 메서드 사용 |
| 무분별한 상속 | IS-A 관계가 적절한지 확인 |
| 구성과 상속 혼동 | HAS-A 관계는 구성을 검토 |
| GC 오해 | 참조를 제거해도 객체가 즉시 삭제되지는 않음 |

### ✅ Day14 핵심 정리

| 구분 | 핵심 내용 |
|---|---|
| Class | 객체를 생성하기 위한 설계도 |
| Object | 클래스를 기반으로 생성된 실체 |
| Instance | 특정 클래스에 속하는 객체 |
| Field | 객체나 클래스의 데이터 저장 |
| Constructor | 객체의 초기 상태 설정 |
| Initialization Block | 객체 또는 클래스 초기화 작업 |
| Overloading | 같은 이름, 다른 매개변수 구성 |
| Method Area | 클래스 수준의 메타데이터와 메서드 정보 관리 |
| Heap | 객체와 배열 생성 공간 |
| Stack | 메서드 실행과 스택 프레임 관리 |
| Reference Variable | 객체를 가리키는 참조값 저장 |
| Instance Variable | 객체마다 독립적인 데이터 |
| Static Variable | 클래스에 속하는 공유 데이터 |
| Local Variable | 메서드·블록 내부의 지역 데이터 |
| Call Stack | 메서드 호출과 반환 과정 관리 |
| this | 현재 객체 참조 |
| Encapsulation | 객체 상태 보호와 접근 제어 |
| Inheritance | IS-A 관계의 기능 상속 및 확장 |
| Composition | HAS-A 관계의 객체 조합 |
| Polymorphism | 같은 호출에 대한 다양한 동작 |
| Abstraction | 핵심 기능 정의와 구현 세부사항 은닉 |
| Constructor Injection | 생성자를 통해 의존 객체 전달 |

**최종 학습 정리**

- 클래스는 객체를 만들기 위한 설계도이며 객체는 실제 생성된 인스턴스이다.
- 생성자는 객체 생성 과정에서 초기 상태를 설정한다.
- 생성자와 메서드는 매개변수 구성을 달리하여 오버로딩할 수 있다.
- 초기화 블록은 정적 초기화와 인스턴스 초기화로 구분한다.
- JVM의 주요 메모리 영역에는 Method Area, Heap, Stack 등이 있다.
- 객체와 배열은 Heap에 생성되며 메서드 실행 정보는 Stack에서 관리한다.
- 참조 변수는 객체 자체가 아닌 참조값을 저장한다.
- 지역 변수는 실행 범위에서 사용하고 인스턴스 변수는 객체별로 존재한다.
- static 변수는 클래스 단위로 공유되므로 사용자별 상태 저장에 주의해야 한다.
- this는 현재 객체를 가리키며 static 메서드에서는 사용할 수 없다.
- 캡슐화는 단순히 필드를 숨기는 것이 아니라 유효한 상태를 유지하는 것이다.
- 상속은 IS-A 관계에, 구성은 HAS-A 관계에 적합하다.
- 객체지향 설계는 각 클래스의 역할과 책임을 명확히 분리하는 데 중점을 둔다.
- Spring Boot에서도 생성자, 메서드, 캡슐화, 구성 등의 Java 객체지향 원칙을 활용한다.

</details>


## Day15. 상속·다형성 및 JVM 메모리 심화
<details>

### 🎯 학습 목표
- 객체지향의 핵심 원칙과 각 원칙의 역할을 이해한다.
- 상속을 통한 클래스 확장과 IS-A 관계를 이해한다.
- 부모 클래스와 자식 클래스의 인스턴스 상태가 하나의 객체에 포함되는 원리를 이해한다.
- 상속 관계에서 생성자와 초기화 블록의 실행 순서를 이해한다.
- `this`, `super`, `this()`, `super()`의 차이를 구분한다.
- 참조 변수 타입과 실제 객체 타입의 차이를 이해한다.
- 필드 숨김(Field Hiding)과 메서드 오버라이딩의 동작 차이를 이해한다.
- 메서드 오버로딩과 오버라이딩의 결정 시점을 구분한다.
- 다형성과 동적 메서드 디스패치의 실행 원리를 이해한다.
- JVM의 Method Area, Stack, Heap의 역할을 이해한다.
- 객체의 참조 해제와 가비지 컬렉션(GC)의 관계를 이해한다.
- 생성자에서 오버라이딩 가능한 메서드를 호출할 때의 위험성을 이해한다.

### 1. 객체지향 프로그래밍의 핵심 원칙

객체지향 프로그래밍(OOP)은 프로그램을 상태와 동작을 가진 객체들의 상호작용으로 구성하는 방식이다.

**객체지향의 4대 핵심 원칙**

| 원칙 | 개념 | 목적 |
|---|---|---|
| 캡슐화(Encapsulation) | 데이터와 기능을 묶고 접근을 제어 | 상태 보호 |
| 상속(Inheritance) | 기존 클래스의 특성과 기능을 물려받음 | 재사용 및 확장 |
| 다형성(Polymorphism) | 공통 타입으로 여러 구현 객체 사용 | 유연한 설계 |
| 추상화(Abstraction) | 핵심 기능을 정의하고 구현 세부사항을 숨김 | 복잡성 감소 |

**핵심 관계**

```text
       객체지향 프로그래밍
               │
    ┌──────────┼──────────┐
    │          │          │
    ▼          ▼          ▼
  캡슐화      상속       추상화
 상태 보호   기능 확장   공통 규칙
               │          │
               └────┬─────┘
                    ▼
                  다형성
             동일한 호출 방식
             다양한 실제 동작
```

- 캡슐화는 객체의 내부 상태를 안전하게 관리한다.
- 상속은 공통 기능을 물려받아 새로운 클래스를 확장한다.
- 추상화는 사용자가 알아야 하는 기능과 구현을 분리한다.
- 다형성은 공통 타입을 통해 여러 종류의 객체를 처리한다.

**핵심 : 객체지향 설계에서는 클래스의 역할과 책임을 명확하게 구분하고, 변경에 유연한 구조를 만드는 것이 중요하다.**

### 2. 상속(Inheritance)의 개념과 구조

상속은 기존 클래스의 필드와 메서드를 자식 클래스가 물려받아 새로운 클래스를 정의하는 기능이다.

**상속을 사용하는 이유**

- 공통 기능을 부모 클래스에서 관리한다.
- 중복되는 코드 작성을 줄인다.
- 기존 기능에 새로운 기능을 추가한다.
- 부모 타입으로 여러 자식 객체를 처리할 수 있다.

**상속 선언**

```java
class Animal {

    String name;

    void eat() {
        System.out.println("먹이를 먹습니다.");
    }

    void sleep() {
        System.out.println("잠을 잡니다.");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("멍멍!");
    }
}
```

**상속 구조**

```text
          Animal
    ┌────────────────┐
    │ name           │
    │ eat()          │
    │ sleep()        │
    └────────┬───────┘
             │
           extends
             │
             ▼
            Dog
    ┌────────────────┐
    │ bark()         │
    └────────────────┘

Dog가 사용 가능한 기능
→ name, eat(), sleep(), bark()
```

**객체 사용**

```java
Dog dog = new Dog();

dog.name = "초코";

dog.eat();
dog.sleep();
dog.bark();
```

**상속의 특징**

- 자식 클래스는 부모 클래스의 접근 가능한 멤버를 사용할 수 있다.
- 자식 클래스는 새로운 필드와 메서드를 추가할 수 있다.
- 자식 클래스는 부모의 인스턴스 메서드를 오버라이딩할 수 있다.
- 부모 클래스의 `private` 멤버는 상속된 객체 상태에 포함되더라도 자식 클래스에서 직접 접근할 수 없다.
- Java 클래스는 하나의 직접적인 부모 클래스만 상속할 수 있다.

**IS-A 관계**

상속은 자식이 부모의 한 종류인 경우에 적합하다.

```text
Dog IS-A Animal   → 적절한 상속
Cat IS-A Animal   → 적절한 상속
Car IS-A Engine   → 부적절한 상속
```

자동차는 엔진의 한 종류가 아니라 엔진을 가지고 있으므로, 이러한 관계에는 구성(Composition)이 더 적합하다.

### 3. 상속과 객체의 메모리 구조

상속에서 가장 중요한 개념은 **자식 객체를 생성한다고 부모 객체가 별도로 하나 더 생성되는 것은 아니라는 점**이다.

자식 객체 하나에 부모로부터 상속받은 인스턴스 상태와 자식 고유의 인스턴스 상태가 함께 포함된다.

**예제**

```java
class Animal {
    String name;
    int age;
}

class Dog extends Animal {
    String breed;
}
```

```java
Dog dog = new Dog();

dog.name = "초코";
dog.age = 3;
dog.breed = "푸들";
```

**메모리 구조**

```text
          Stack
    ┌─────────────┐
    │ dog         │
    │ 참조값 ─────┼───────────────┐
    └─────────────┘               │
                                  ▼
                       Heap
             ┌──────────────────────┐
             │       Dog 객체       │
             │                      │
             │ ┌──────────────────┐ │
             │ │ Animal의 상태    │ │
             │ │ name = "초코"    │ │
             │ │ age = 3          │ │
             │ └──────────────────┘ │
             │                      │
             │ ┌──────────────────┐ │
             │ │ Dog의 상태       │ │
             │ │ breed = "푸들"   │ │
             │ └──────────────────┘ │
             └──────────────────────┘
```

**핵심 원리**

1. `new Dog()`는 하나의 Dog 객체를 생성한다.
2. 객체에는 부모 클래스에서 상속받은 인스턴스 필드도 포함된다.
3. 자식 클래스에서 선언한 인스턴스 필드도 함께 존재한다.
4. 부모와 자식의 인스턴스 상태는 하나의 객체 안에서 관리된다.

**주의사항**

- 부모 객체와 자식 객체가 각각 독립적으로 생성되는 것이 아니다.
- 부모 클래스의 생성자는 실행되지만 별도의 부모 객체를 생성하지 않는다.
- 인스턴스 메서드 코드가 객체마다 새로 복사되어 저장되는 것은 아니다.
- 그림의 부모/자식 영역은 개념적인 구분이며 실제 객체의 메모리 배치는 JVM 구현에 따라 달라질 수 있다.

### 4. 부모 생성자와 자식 생성자의 실행 순서

상속 관계에서 자식 객체를 생성하면 부모 클래스의 생성자가 자식 클래스의 생성자 본문보다 먼저 실행된다.

**Java 예제**

```java
class Animal {

    Animal() {
        System.out.println("1. Animal 생성자");
    }
}

class Dog extends Animal {

    Dog() {
        super();
        System.out.println("2. Dog 생성자");
    }
}

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
    }
}
```

**실행 결과**

```text
1. Animal 생성자
2. Dog 생성자
```

**객체 생성 흐름**

```text
        new Dog()
            │
            ▼
      메모리 공간 확보
            │
            ▼
      필드 기본값 설정
     (0, false, null 등)
            │
            ▼
       부모 생성자 호출
          super()
            │
            ▼
       Animal 초기화
            │
            ▼
        Dog 초기화
            │
            ▼
       Dog 생성자 본문
            │
            ▼
       객체 초기화 완료
```

**부모 생성자가 먼저 실행되는 이유**

- 자식 객체는 부모로부터 상속받은 인스턴스 상태를 포함한다.
- 자식의 고유한 초기화보다 부모의 초기화가 먼저 완료되어야 한다.
- 부모 클래스의 초기화 규칙을 보장하기 위한 구조이다.

**주의사항**

- 자식 생성자에 명시적 생성자 호출이 없다면 컴파일러가 필요한 `super()` 호출을 추가한다.
- 부모 클래스에 접근 가능한 매개변수 없는 생성자가 없다면 적절한 부모 생성자를 명시적으로 호출해야 한다.
- Java 21 기준으로 `super()`를 명시할 때는 생성자 본문의 첫 번째 문장에 작성해야 한다.

### 5. 상속 관계에서 필드와 초기화 블록의 실행 순서

객체의 필드는 먼저 기본값으로 초기화되며, 이후 필드 초기화식과 인스턴스 초기화 블록 및 생성자 본문이 순서에 따라 실행된다.

**Java 예제**

```java
class Parent {

    int parentValue = initializeParent();

    int initializeParent() {
        System.out.println("1. 부모 필드 초기화");
        return 10;
    }

    Parent() {
        System.out.println("2. 부모 생성자");
    }
}

class Child extends Parent {

    int childValue = initializeChild();

    int initializeChild() {
        System.out.println("3. 자식 필드 초기화");
        return 20;
    }

    Child() {
        System.out.println("4. 자식 생성자");
    }
}

public class Main {

    public static void main(String[] args) {
        new Child();
    }
}
```

**실행 결과**

```text
1. 부모 필드 초기화
2. 부모 생성자
3. 자식 필드 초기화
4. 자식 생성자
```

**전체 초기화 순서**

```text
객체 메모리 확보
       │
       ▼
모든 인스턴스 필드 기본값 초기화
       │
       ▼
부모 필드 초기화식 및 초기화 블록
       │
       ▼
부모 생성자 본문
       │
       ▼
자식 필드 초기화식 및 초기화 블록
       │
       ▼
자식 생성자 본문
       │
       ▼
객체 초기화 완료
```

※ 클래스의 정적 초기화는 인스턴스 초기화와 별개이며, 클래스가 초기화되는 시점에 수행된다. 위 설명은 일반적인 부모·자식 인스턴스 초기화 흐름을 나타낸다.

### 6. this와 super의 차이

`this`와 `super`는 인스턴스 문맥에서 현재 객체와 상속 관계의 멤버에 접근할 때 사용한다.

| 키워드 | 의미 | 주요 용도 |
|---|---|---|
| `this` | 현재 객체 참조 | 현재 객체의 필드와 메서드 접근 |
| `this()` | 같은 클래스의 다른 생성자 호출 | 생성자 간 코드 재사용 |
| `super` | 부모 클래스의 멤버 접근 | 부모 필드나 메서드 사용 |
| `super()` | 부모 클래스의 생성자 호출 | 부모 부분 초기화 |

**Java 예제**

```java
class Parent {

    protected String name;

    Parent(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("이름: " + name);
    }
}

class Child extends Parent {

    private int age;

    Child(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    void introduce() {
        super.introduce();
        System.out.println("나이: " + this.age);
    }
}
```

**사용 예제**

```java
Child child = new Child("홍길동", 20);

child.introduce();
```

**실행 결과**

```text
이름: 홍길동
나이: 20
```

**핵심**

- `this.age`는 현재 객체의 인스턴스 필드를 나타낸다.
- `super(name)`은 부모 클래스 생성자를 호출한다.
- `super.introduce()`는 부모 클래스에 정의된 메서드 구현을 호출한다.
- `this`와 `super`는 정적 문맥에서 사용할 수 없다.

### 7. 다형성(Polymorphism)의 핵심 원리

다형성은 하나의 공통 타입으로 여러 종류의 객체를 참조하고, 동일한 메서드 호출을 통해 실제 객체에 맞는 동작을 수행하는 특성이다.

**Java 예제**

```java
class Animal {

    void sound() {
        System.out.println("동물 소리");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("야옹");
    }
}
```

**다형성 사용**

```java
Animal a1 = new Dog();
Animal a2 = new Cat();

a1.sound(); // 멍멍
a2.sound(); // 야옹
```

**동작 구조**

```text
        Animal 타입
        sound() 호출
              │
       실제 객체 확인
              │
       ┌──────┴──────┐
       │             │
       ▼             ▼
   Dog 객체       Cat 객체
       │             │
       ▼             ▼
   Dog.sound()   Cat.sound()
       │             │
       ▼             ▼
     "멍멍"         "야옹"
```

**핵심**

- 참조 변수의 선언 타입은 `Animal`이다.
- 실제 객체의 타입은 각각 `Dog`, `Cat`이다.
- 오버라이딩된 인스턴스 메서드는 실제 객체의 타입에 따라 실행된다.
- 이러한 실행 방식은 동적 메서드 디스패치(Dynamic Method Dispatch)와 관련된다.

### 8. 참조 변수 타입과 실제 객체 타입

다형성을 정확하게 이해하려면 **참조 변수의 타입과 실제 객체의 타입을 구분**해야 한다.

**Java 예제**

```java
Animal animal = new Dog();
```

| 구분 | 타입 | 의미 |
|---|---|---|
| 참조 변수 타입 | Animal | 접근 가능한 멤버를 결정하는 기준 |
| 실제 객체 타입 | Dog | 오버라이딩된 인스턴스 메서드의 실행 구현 결정 |

**추가 메서드가 있는 경우**

```java
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("멍멍");
    }

    void bark() {
        System.out.println("짖기");
    }
}
```

```java
Animal animal = new Dog();

animal.sound(); // 가능

// animal.bark(); // 컴파일 오류
```

**bark()를 바로 호출할 수 없는 이유**

- 실제 객체는 `Dog`이지만 변수 선언 타입은 `Animal`이다.
- 컴파일러는 `Animal` 타입에서 사용 가능한 멤버를 기준으로 검사한다.
- `Animal`에는 `bark()`가 정의되어 있지 않다.

**타입 확인과 다운캐스팅**

```java
if (animal instanceof Dog dog) {
    dog.bark();
}
```

- `instanceof`는 객체가 특정 타입과 호환되는지 확인한다.
- Java 16부터 패턴 변수를 이용해 타입 검사와 변환을 함께 처리할 수 있다.
- 호환되지 않는 객체를 강제로 다운캐스팅하면 `ClassCastException`이 발생한다.

**핵심 : 참조 변수 타입은 접근 가능한 멤버를 제한하고, 실제 객체 타입은 오버라이딩된 인스턴스 메서드의 동작을 결정한다.**

### 9. 필드 숨김과 메서드 오버라이딩의 차이

상속에서 매우 중요한 부분은 **필드와 인스턴스 메서드가 서로 다른 규칙으로 처리된다는 점**이다.

- 필드 : 참조 변수의 선언 타입을 기준으로 접근
- 오버라이딩된 인스턴스 메서드 : 실제 객체의 타입을 기준으로 실행

**Java 예제**

```java
class Parent {

    int value = 10;

    void sound() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    int value = 20;

    @Override
    void sound() {
        System.out.println("Child");
    }
}
```

**호출**

```java
Parent p = new Child();

System.out.println(p.value); // 10
p.sound();                   // Child
```

**동작 원리**

```text
Parent p = new Child();
           │
           ▼
       Child 객체
┌──────────────────────┐
│ Parent 부분          │
│ value = 10           │
│                      │
│ Child 부분           │
│ value = 20           │
│                      │
│ sound() → Child 구현 │
└──────────────────────┘
```

**필드 접근**

```java
System.out.println(p.value); // 10
```

- `p`의 선언 타입은 `Parent`이다.
- 따라서 `Parent`에 선언된 `value` 필드에 접근한다.
- 자식 클래스에 같은 이름의 필드가 있더라도 필드 접근은 동적 디스패치되지 않는다.

**메서드 호출**

```java
p.sound(); // Child
```

- `sound()`는 오버라이딩된 인스턴스 메서드이다.
- 실제 객체가 `Child`이므로 `Child.sound()`가 실행된다.

**자식 타입으로 변환한 경우**

```java
Child c = (Child) p;

System.out.println(c.value); // 20
c.sound();                   // Child
```

| 구분 | 필드 | 오버라이딩된 인스턴스 메서드 |
|---|---|---|
| 결정 기준 | 참조 변수의 선언 타입 | 실제 객체 타입 |
| 결정 시점 | 컴파일 시점 | 실행 시점 |
| 적용 개념 | 필드 숨김(Field Hiding) | 동적 메서드 디스패치 |
| 다형성 | 동적 동작 대상 아님 | 다형성의 핵심 |

**주의 : 필드는 오버라이딩되지 않는다. 같은 이름의 필드를 자식 클래스에 다시 선언하면 필드 숨김이 발생한다.**

### 10. 메서드 오버라이딩(Overriding)

오버라이딩은 부모 클래스의 인스턴스 메서드를 자식 클래스에서 재정의하는 기능이다.

**오버라이딩의 핵심 규칙**

1. 상속 또는 인터페이스 구현 관계가 있어야 한다.
2. 부모 메서드와 이름 및 매개변수 구성이 동일해야 한다.
3. 반환 타입은 같거나 허용되는 공변 반환 타입이어야 한다.
4. 접근 제한자를 부모 메서드보다 좁게 변경할 수 없다.
5. `final` 메서드는 오버라이딩할 수 없다.

**Java 예제**

```java
class Animal {

    void sound() {
        System.out.println("동물 소리");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("멍멍!");
    }
}
```

**호출**

```java
Animal animal = new Dog();

animal.sound(); // 멍멍!
```

**@Override의 역할**

- 해당 메서드가 부모 메서드를 올바르게 재정의했는지 컴파일러가 검사한다.
- 메서드 이름이나 매개변수 구성이 잘못된 경우 오류를 발견할 수 있다.
- 반드시 작성해야 하는 것은 아니지만 사용하는 것이 권장된다.

**주의사항**

- `private` 메서드는 오버라이딩되지 않는다.
- `static` 메서드는 오버라이딩이 아니라 메서드 숨김(Method Hiding)의 대상이다.
- 생성자는 상속되지 않으므로 오버라이딩할 수 없다.

### 11. 메서드 오버로딩(Overloading)

오버로딩은 동일한 이름의 메서드를 매개변수 구성을 다르게 하여 여러 개 선언하는 것이다.

**Java 예제**

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

**사용 예제**

```java
Calculator calc = new Calculator();

System.out.println(calc.add(10, 20));     // 30
System.out.println(calc.add(10, 20, 30)); // 60
System.out.println(calc.add(1.5, 2.5));   // 4.0
```

**오버로딩이 성립하는 조건**

| 조건 | 가능 여부 |
|---|---|
| 매개변수 개수가 다름 | 가능 |
| 매개변수 타입이 다름 | 가능 |
| 매개변수 타입 순서가 다름 | 가능 |
| 반환 타입만 다름 | 불가능 |
| 매개변수 이름만 다름 | 불가능 |

**오버로딩의 특징**

- 상속 관계가 없어도 사용할 수 있다.
- 컴파일러가 인자의 정적 타입과 매개변수 구성을 바탕으로 호출할 메서드를 선택한다.
- 같은 기능을 다양한 형태의 입력으로 제공할 때 활용한다.

### 12. 오버로딩과 오버라이딩의 결정 시점

오버로딩과 오버라이딩의 가장 중요한 차이는 **어떤 메서드를 실행할지 결정하는 방식**이다.

| 구분 | 오버로딩 | 오버라이딩 |
|---|---|---|
| 목적 | 다양한 입력 처리 | 상속된 동작 변경 |
| 상속 관계 | 필수 아님 | 필요 |
| 매개변수 | 구성이 다름 | 동일 |
| 결정 시점 | 컴파일 시점 | 실행 시점 |
| 결정 기준 | 인자의 정적 타입 등 | 실제 객체 타입 |
| 주요 개념 | 정적 바인딩 | 동적 디스패치 |

**오버로딩의 결정 시점**

```java
class Animal {}
class Dog extends Animal {}

public class Main {

    static void print(Animal a) {
        System.out.println("Animal");
    }

    static void print(Dog d) {
        System.out.println("Dog");
    }

    public static void main(String[] args) {
        Animal animal = new Dog();

        print(animal); // Animal
    }
}
```

**Animal이 출력되는 이유**

- 실제 생성된 객체는 `Dog`이다.
- 하지만 전달한 변수의 선언 타입은 `Animal`이다.
- 오버로딩은 컴파일 시점의 타입을 기준으로 적절한 메서드를 선택한다.

반면 오버라이딩된 인스턴스 메서드는 실제 객체의 구현이 실행된다.

**핵심 : 오버로딩은 호출할 메서드의 시그니처를 선택하는 과정이고, 오버라이딩은 선택된 인스턴스 메서드 호출에 대해 실제 구현을 결정하는 과정이다.**

### 13. JVM 메모리 구조와 상속의 관계

JVM은 클래스 정보, 메서드 실행 상태, 객체 데이터를 서로 다른 논리적 메모리 영역에서 관리한다.

| 영역 | 주요 역할 |
|---|---|
| Method Area | 클래스 메타데이터, 런타임 상수 풀 등 |
| JVM Stack | 메서드 호출 프레임과 지역 변수 관리 |
| Heap | 객체 및 배열 저장 |

**상속 관계의 메모리 구조**

```text
           Method Area
    ┌────────────────────┐
    │ Animal 클래스 정보  │
    │ Dog 클래스 정보     │
    │ 메서드 관련 정보    │
    └────────────────────┘


               Stack
    ┌────────────────────┐
    │ main() Frame       │
    │                    │
    │ Animal animal ─────┼───────┐
    └────────────────────┘       │
                                 ▼
                         Heap
                  ┌─────────────────┐
                  │   Dog 객체      │
                  │                 │
                  │ Animal 필드     │
                  │ Dog 필드        │
                  └─────────────────┘
```

**핵심 원리**

- 클래스의 메타데이터는 객체마다 복제되지 않는다.
- 새로운 객체를 생성하면 객체의 인스턴스 상태가 별도로 존재한다.
- 메서드를 호출하면 해당 스레드의 Stack에 실행 프레임이 생성된다.
- 객체에 대한 참조값을 이용해 Heap의 객체에 접근한다.

※ Method Area, Stack, Heap은 JVM의 논리적 구조이다. 메서드 코드의 실제 저장 방식이나 정적 필드의 물리적 위치는 JVM 구현에 따라 달라질 수 있다.

### 14. 객체의 참조와 가비지 컬렉션(GC)

가비지 컬렉션(Garbage Collection)은 더 이상 도달할 수 없는 객체의 메모리를 자동으로 회수하는 기능이다.

**객체 참조**

```java
Dog dog = new Dog();
```

```text
     참조 변수 dog
           │
           ▼
       Dog 객체
        (Heap)
```

**참조 해제**

```java
dog = null;
```

```text
     참조 변수 dog
           │
           X
      연결 해제


       Dog 객체
        (Heap)
```

**핵심**

- `dog = null`은 참조 변수의 값을 변경한다.
- 객체 자체를 즉시 삭제하는 명령이 아니다.
- 다른 참조를 통해 접근할 수 있다면 객체는 계속 사용될 수 있다.
- GC는 도달할 수 없는 객체를 메모리 회수 대상으로 판단한다.

**여러 참조 변수가 같은 객체를 사용하는 경우**

```java
Dog dog1 = new Dog();
Dog dog2 = dog1;

dog1 = null;

// dog2는 여전히 객체를 참조한다.
dog2.sound();
```

```text
dog1 ──X

dog2 ────────────→ Dog 객체
                      │
                      ▼
                  계속 사용 가능
```

**GC의 주요 특징**

- 객체의 도달 가능성을 기준으로 회수 대상을 판단한다.
- 프로그래머가 객체를 직접 해제할 필요가 없다.
- 참조가 끊어졌다고 반드시 즉시 회수되는 것은 아니다.
- `System.gc()`도 즉시 회수를 보장하지 않는다.

**주의 : GC는 메모리 관리를 지원하지만 파일, 네트워크 연결 등 외부 자원까지 자동으로 적절한 시점에 종료해 주는 것은 아니다. 이런 자원은 별도로 닫거나 try-with-resources 등을 사용해야 한다.**

### 15. 주의해야 할 생성자 내부의 오버라이딩 메서드 호출

상속에서 특히 중요한 주의사항은 **부모 생성자에서 자식이 오버라이딩할 수 있는 메서드를 호출하는 것**이다.

부모 생성자가 실행되는 시점에는 자식 클래스의 필드 초기화가 아직 완료되지 않았을 수 있기 때문이다.

**문제가 발생하는 Java 코드**

```java
class Parent {

    Parent() {
        print();
    }

    void print() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    int number = 100;

    @Override
    void print() {
        System.out.println(number);
    }
}

public class Main {

    public static void main(String[] args) {
        Child child = new Child();

        child.print();
    }
}
```

**실행 결과**

```text
0
100
```

**왜 0이 먼저 출력될까?**

```text
        new Child()
             │
             ▼
     객체 메모리 확보
             │
             ▼
     number 기본값 = 0
             │
             ▼
     Parent 생성자 실행
             │
             ▼
        print() 호출
             │
             ▼
     Child.print() 실행
             │
             ▼
     number 출력 → 0
             │
             ▼
     Child 필드 초기화
       number = 100
             │
             ▼
     Child 생성 완료
             │
             ▼
     child.print() 실행
             │
             ▼
     number 출력 → 100
```

**핵심 원인**

1. 부모 생성자는 자식 필드 초기화보다 먼저 실행된다.
2. 부모 생성자에서 `print()`를 호출한다.
3. 메서드는 오버라이딩되어 있으므로 실제 객체인 `Child`의 `print()`가 실행된다.
4. 하지만 자식의 `number = 100` 초기화는 아직 실행되지 않았다.
5. 따라서 기본값인 `0`이 출력된다.

**안전한 설계 원칙**

- 생성자에서는 초기화가 완료되지 않은 객체의 상태를 이용하는 오버라이딩 가능 메서드 호출을 피한다.
- 생성 과정에서 필요한 기능은 외부에서 재정의할 수 없는 메서드나 명확한 초기화 로직으로 구성한다.
- 객체 생성이 완료된 후 별도 메서드를 호출하는 방식을 고려한다.

**주의 : 이는 컴파일 오류가 아니라 잘못된 초기화 상태에서 메서드가 실행될 수 있는 논리적 문제이다.**

### 16. 다형성을 활용한 결제 시스템 설계

강의자료에서는 다형성의 실무 활용 사례로 공통 타입을 이용해 여러 결제 방식을 교체하는 구조를 설명한다.

**인터페이스 정의**

```java
interface Payment {
    void pay(int amount);
}
```

**카드 결제 구현**

```java
class CardPayment implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println("카드 결제: " + amount);
    }
}
```

**계좌이체 구현**

```java
class BankPayment implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println("계좌이체: " + amount);
    }
}
```

**결제 서비스**

```java
class OrderService {

    void checkout(Payment payment, int amount) {
        payment.pay(amount);
    }
}
```

**사용 예제**

```java
OrderService service = new OrderService();

Payment payment = new CardPayment();

service.checkout(payment, 10000);

payment = new BankPayment();

service.checkout(payment, 20000);
```

**실행 결과**

```text
카드 결제: 10000
계좌이체: 20000
```

**다형성 구조**

```text
             OrderService
                  │
                  ▼
           Payment 인터페이스
               pay()
                  │
          ┌───────┴───────┐
          │               │
          ▼               ▼
     CardPayment      BankPayment
          │               │
          ▼               ▼
        카드 결제       계좌이체
```

**다형성을 적용한 이유**

- `OrderService`는 구체적인 결제 구현을 직접 알 필요가 없다.
- `Payment`라는 공통 타입을 통해 결제 기능을 호출한다.
- 새로운 결제 방식이 추가되어도 서비스의 공통 처리 코드를 재사용할 수 있다.
- 결제 구현과 사용하는 코드를 분리하여 결합도를 낮출 수 있다.

이러한 구조는 Spring의 의존성 주입과 인터페이스 기반 설계를 이해하는 데 중요한 기초가 된다.

※ 위 예제는 다형성의 원리를 보여주는 코드이며, 실제 결제 서비스 연동 기능은 포함하지 않는다.

### 17. 자주 발생하는 오류 및 주의사항

| 주의사항 | 원인 및 해결 방법 |
|---|---|
| 부모·자식 객체를 별도로 생성한다고 오해 | 자식 객체 하나에 상속된 인스턴스 상태 포함 |
| 부모 생성자 호출 누락 | 적절한 super() 호출 여부 확인 |
| 초기화 순서 오해 | 부모 초기화 후 자식 초기화 |
| 참조 변수 타입 혼동 | 선언 타입과 실제 객체 타입 구분 |
| 자식 전용 메서드 호출 오류 | 부모 타입에서 접근 가능 여부 확인 |
| 잘못된 다운캐스팅 | instanceof로 호환성 확인 |
| 필드와 메서드 동작 혼동 | 필드 숨김과 오버라이딩 구분 |
| 메서드 오버로딩 오류 | 매개변수 구성이 달라야 함 |
| 오버라이딩 오류 | 시그니처와 접근 제한 규칙 확인 |
| static 메서드 오버라이딩 오해 | 정적 메서드는 오버라이딩되지 않음 |
| 생성자에서 오버라이딩 메서드 호출 | 자식의 초기화가 완료되지 않았을 수 있음 |
| 객체 참조 공유 | 참조값 복사와 객체 복사 구분 |
| null과 객체 삭제 혼동 | null 대입은 참조 해제이지 객체 삭제가 아님 |
| GC 실행 시점 오해 | 메모리 회수 시점은 보장되지 않음 |
| 무분별한 상속 | 적절한 IS-A 관계인지 검토 |

### ✅ Day15 핵심 정리

| 구분 | 핵심 개념 |
|---|---|
| OOP | 객체 중심의 프로그램 설계 |
| Encapsulation | 데이터 보호 및 접근 제어 |
| Inheritance | 부모 클래스의 기능 상속과 확장 |
| IS-A | 자식이 부모의 한 종류인 관계 |
| extends | 클래스 상속 키워드 |
| super | 부모 클래스의 멤버 접근 |
| super() | 부모 클래스 생성자 호출 |
| Constructor Chain | 부모부터 자식으로 이어지는 생성자 실행 |
| Object Memory | 자식 객체 하나에 상속된 상태와 자식 상태 포함 |
| Polymorphism | 공통 타입으로 여러 객체 처리 |
| Upcasting | 자식 객체를 부모 타입으로 참조 |
| Downcasting | 호환되는 자식 타입으로 참조 변환 |
| Reference Type | 접근 가능한 멤버를 결정하는 기준 |
| Runtime Type | 오버라이딩된 인스턴스 메서드 구현 결정 |
| Field Hiding | 같은 이름의 필드가 참조 타입 기준으로 구분 |
| Overriding | 상속된 인스턴스 메서드 재정의 |
| Overloading | 같은 이름, 다른 매개변수 구성 |
| Static Binding | 컴파일 시점에 호출 대상 결정 |
| Dynamic Dispatch | 실제 객체를 기준으로 메서드 실행 |
| Method Area | 클래스 메타데이터 등 관리 |
| Stack | 메서드 호출 프레임과 지역 변수 관리 |
| Heap | 객체 및 배열 저장 |
| Garbage Collection | 도달할 수 없는 객체의 메모리 회수 |
| Initialization Hazard | 생성자에서 재정의 가능 메서드 호출 시 발생할 수 있는 문제 |
| Interface | 공통 기능 규약을 정의하는 타입 |

**최종 학습 정리**

- 객체지향은 캡슐화, 상속, 다형성, 추상화를 통해 프로그램을 구조화한다.
- 상속은 부모의 기능을 재사용하고 자식의 기능을 확장하는 구조이다.
- `new Dog()`는 부모와 자식 객체를 각각 생성하는 것이 아니라 하나의 Dog 객체를 생성한다.
- 자식 객체에는 부모의 인스턴스 상태와 자식 고유의 상태가 함께 포함된다.
- 부모 클래스의 초기화와 생성자 본문은 자식 클래스의 초기화보다 먼저 실행된다.
- `super()`는 부모 생성자를 호출하며 `super`는 부모 클래스의 멤버에 접근할 때 사용한다.
- 부모 타입의 참조 변수로 자식 객체를 참조할 수 있다.
- 참조 변수의 선언 타입은 접근 가능한 멤버를 결정한다.
- 오버라이딩된 인스턴스 메서드는 실제 객체의 타입을 기준으로 실행된다.
- 필드는 오버라이딩되지 않으며 같은 이름의 필드가 있으면 숨김이 발생한다.
- 오버로딩은 컴파일 시점에 선택되고, 오버라이딩은 실제 객체의 구현이 실행 시점에 결정된다.
- JVM의 Method Area, Stack, Heap은 클래스 정보, 실행 정보, 객체 데이터를 각각 관리한다.
- 참조 변수에 null을 대입하더라도 객체가 즉시 삭제되는 것은 아니다.
- 가비지 컬렉션은 더 이상 도달할 수 없는 객체의 메모리를 회수한다.
- 부모 생성자에서 오버라이딩 가능한 메서드를 호출하면 초기화되지 않은 자식 필드에 접근할 위험이 있다.
- 다형성은 구현체에 직접 의존하지 않는 유연한 프로그램 설계의 기반이 된다.

</details>


## Day16. Java 클래스 종류와 객체지향 설계
<details>

### 🎯 학습 목표
- Java 프로그램의 기본 구조와 `package`, `import`의 역할을 이해한다.
- 패키지를 이용해 클래스를 체계적으로 관리할 수 있다.
- 추상 클래스와 추상 메서드의 특징 및 사용 목적을 이해한다.
- 인터페이스의 선언, 구현, 다형성 및 다중 구현을 이해한다.
- 추상 클래스와 인터페이스의 차이를 구분한다.
- 템플릿 메서드 패턴(Template Method Pattern)의 동작 원리를 이해한다.
- 중첩 클래스와 내부 클래스의 종류 및 특징을 구분한다.
- 인스턴스·정적·지역·익명 클래스의 차이를 이해한다.
- Builder 패턴을 통한 객체 생성 방식과 장점을 이해한다.
- 익명 클래스와 람다식(Lambda Expression)의 관계를 이해한다.
- 인터페이스를 활용한 의존성 주입(DI)의 기본 원리를 이해한다.
- 예외의 종류와 기본적인 예외 처리 방법을 이해한다.

### 1. Java 프로그램의 기본 구조

Java 프로그램은 패키지, import 선언, 클래스, 메서드 등을 조합하여 구성한다.

**기본 구조**

```java
package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello Java");
    }
}
```

| 구성 요소 | 역할 |
|---|---|
| `package` | 클래스가 소속되는 패키지 지정 |
| `import` | 다른 패키지의 타입을 간단한 이름으로 사용 |
| `class` | 객체를 생성하기 위한 타입 선언 |
| `main()` | 일반적인 Java 애플리케이션의 시작 메서드 |
| `public` | 외부 접근 허용 |
| `static` | 객체 생성 없이 클래스에 속한 메서드 사용 |
| `void` | 반환값이 없음 |
| `String[] args` | 프로그램 실행 시 전달받는 문자열 인자 |

**Java 소스 파일의 일반적인 작성 순서**

```text
package 선언
     ↓
import 선언
     ↓
클래스 선언
     ↓
필드 / 생성자 / 메서드
     ↓
main() 또는 다른 메서드 실행
```

**main 메서드**

```java
public static void main(String[] args) {
    System.out.println("프로그램 시작");
}
```

- `public` : JVM에서 시작 메서드에 접근할 수 있도록 공개
- `static` : 객체를 생성하지 않고 호출 가능
- `void` : 반환값 없음
- `main` : 프로그램 시작 메서드의 이름
- `String[] args` : 실행 시 전달받는 문자열 인자 배열

### 2. Package의 개념과 역할

패키지(Package)는 관련된 클래스와 인터페이스 등을 논리적으로 묶어 관리하는 이름 공간이다.

**패키지를 사용하는 이유**

- 기능별로 클래스를 분류한다.
- 서로 다른 패키지에 같은 이름의 클래스를 선언할 수 있다.
- 접근 범위를 제어하는 기준으로 활용한다.
- 대규모 프로젝트의 유지보수성을 높인다.

**패키지 선언**

```java
package com.example.member;

public class Member {

    private String name;

    public Member(String name) {
        this.name = name;
    }
}
```

**패키지와 폴더 구조**

```text
src/
└── com/
    └── example/
        ├── member/
        │   └── Member.java
        ├── product/
        │   └── Product.java
        └── order/
            └── Order.java
```

패키지 이름은 일반적으로 소문자로 작성한다.

**주의사항**

- `package` 선언은 파일의 최상단에 작성한다. 주석은 앞에 올 수 있다.
- 하나의 Java 소스 파일에는 하나의 패키지만 선언할 수 있다.
- 일반적으로 패키지 이름과 디렉터리 구조를 일치시킨다.
- 패키지를 선언하지 않으면 이름 없는 패키지(Unnamed Package)에 속한다.
- 패키지는 논리적 이름 공간이므로 하위 패키지가 상위 패키지의 접근 권한을 자동으로 상속하지 않는다.

### 3. Import의 개념과 종류

`import`는 다른 패키지에 선언된 타입을 정규화된 이름(Fully Qualified Name) 대신 간단한 이름으로 사용하기 위한 선언이다.

**import 없이 사용**

```java
java.util.Scanner scanner =
    new java.util.Scanner(System.in);
```

**import 사용**

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
```

**import의 종류**

| 종류 | 문법 | 역할 |
|---|---|---|
| 단일 타입 import | `import java.util.Scanner;` | 특정 타입 사용 |
| 와일드카드 import | `import java.util.*;` | 해당 패키지의 접근 가능한 타입 사용 |
| static import | `import static java.lang.Math.PI;` | 정적 멤버를 간단한 이름으로 사용 |

**static import 예제**

```java
import static java.lang.Math.PI;
import static java.lang.Math.max;

public class Main {

    public static void main(String[] args) {
        System.out.println(PI);
        System.out.println(max(10, 20));
    }
}
```

**주의사항**

- `java.lang` 패키지의 타입은 자동으로 사용할 수 있다.
- `import java.util.*;`은 하위 패키지의 타입까지 가져오는 것이 아니다.
- `import`는 클래스를 복사하거나 객체를 생성하는 명령이 아니다.
- 다른 패키지의 타입을 사용하려면 접근 제한자에 따른 접근 권한이 있어야 한다.
- `static import`는 정적 필드나 정적 메서드를 간단한 이름으로 사용하는 데 활용한다.

### 4. Java 클래스의 종류와 역할

객체지향 설계에서는 클래스 간의 공통 기능, 규약, 관련성을 표현하기 위해 다양한 구조를 사용한다.

이번 학습의 핵심은 다음 세 가지이다.

| 구분 | 핵심 목적 | 대표 키워드 |
|---|---|---|
| 추상 클래스(Abstract Class) | 공통 상태와 기능 제공 | `abstract`, `extends` |
| 인터페이스(Interface) | 기능의 계약과 규약 정의 | `interface`, `implements` |
| 중첩·내부 클래스(Nested/Inner Class) | 밀접한 관련이 있는 클래스를 함께 관리 | 클래스 내부의 `class` 선언 |

**구조별 역할**

```text
         객체지향 설계
              │
    ┌─────────┼─────────┐
    │         │         │
    ▼         ▼         ▼
 추상 클래스  인터페이스  중첩 클래스
    │         │         │
 공통 기반  기능 규약  관련 코드 그룹화
    │         │         │
    ▼         ▼         ▼
  상속      다형성      캡슐화
```

**핵심**

- 추상 클래스는 공통 기능을 물려주기 위한 기반이다.
- 인터페이스는 구현 클래스들이 지켜야 할 기능의 규칙을 정의한다.
- 중첩 클래스는 특정 클래스와 관련된 코드를 논리적으로 묶는다.

### 5. 추상 클래스(Abstract Class)

추상 클래스는 직접 객체를 생성할 수 없으며, 자식 클래스들이 상속받아 사용할 공통 상태와 기능을 정의하는 클래스이다.

**추상 클래스의 특징**

- `abstract` 키워드를 사용한다.
- 직접 인스턴스를 생성할 수 없다.
- 일반 필드와 일반 메서드를 선언할 수 있다.
- 추상 메서드를 선언할 수 있다.
- 생성자를 선언할 수 있다.
- 자식 클래스에서 공통 기능을 재사용할 수 있다.

**추상 클래스 선언**

```java
abstract class Animal {

    protected String name;

    Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + "이(가) 먹습니다.");
    }

    public abstract void sound();
}
```

**구현 클래스**

```java
class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("멍멍!");
    }
}
```

**객체 생성 및 호출**

```java
Animal animal = new Dog("초코");

animal.eat();
animal.sound();
```

**실행 결과**

```text
초코이(가) 먹습니다.
멍멍!
```

**추상 클래스의 핵심 구조**

```text
       Animal (abstract)
    ┌─────────────────────┐
    │ name                │
    │ eat()               │ ← 일반 메서드
    │ sound()             │ ← 추상 메서드
    └──────────┬──────────┘
               │
             extends
               │
               ▼
              Dog
    ┌─────────────────────┐
    │ sound() 구현        │
    └─────────────────────┘
```

**핵심**

- 공통된 상태와 기능은 부모 추상 클래스에 정의한다.
- 클래스마다 다르게 동작할 기능은 추상 메서드로 선언한다.
- 자식 클래스는 필요한 추상 메서드를 구현한다.

### 6. 추상 메서드(Abstract Method)

추상 메서드는 구현부 없이 선언부만 가지는 메서드이다.

**기본 구조**

```java
public abstract void sound();
```

**일반 메서드와 비교**

| 구분 | 일반 메서드 | 추상 메서드 |
|---|---|---|
| 구현부 | 있음 | 없음 |
| abstract | 필요 없음 | 필요 |
| 역할 | 실제 기능 실행 | 구현해야 할 기능 정의 |
| 자식 클래스 | 필요 시 재정의 | 구체 클래스라면 구현 필요 |

**추상 메서드의 규칙**

- 추상 메서드는 추상 클래스 또는 인터페이스 등의 허용된 문맥에 선언한다.
- 추상 메서드는 구현부를 작성하지 않는다.
- 일반적인 구체 자식 클래스는 상속받은 추상 메서드를 구현해야 한다.
- 추상 메서드를 구현하지 않는 자식 클래스는 자신도 추상 클래스로 선언해야 한다.

**주의사항**

```java
// 추상 클래스의 직접 객체 생성 불가
// Animal animal = new Animal("초코");
```

추상 클래스는 추상 메서드가 없어도 선언할 수 있다.

```java
abstract class Base {

    public void print() {
        System.out.println("공통 기능");
    }
}
```

따라서 추상 클래스는 반드시 추상 메서드를 가져야 하는 것은 아니다.

### 7. 추상 클래스의 생성자와 공통 상태

추상 클래스는 직접 인스턴스를 생성할 수 없지만 생성자를 가질 수 있다.

생성자는 자식 객체가 생성되는 과정에서 부모의 상태를 초기화하는 역할을 한다.

**Java 예제**

```java
abstract class Employee {

    protected String name;

    Employee(String name) {
        this.name = name;
        System.out.println("부모 생성자 실행");
    }

    abstract void work();
}

class Developer extends Employee {

    Developer(String name) {
        super(name);
        System.out.println("자식 생성자 실행");
    }

    @Override
    void work() {
        System.out.println(name + " 개발 작업");
    }
}
```

**실행**

```java
Employee employee = new Developer("홍길동");

employee.work();
```

**실행 결과**

```text
부모 생성자 실행
자식 생성자 실행
홍길동 개발 작업
```

**핵심**

- 추상 클래스에도 필드와 생성자를 선언할 수 있다.
- 자식 객체의 생성 과정에서 부모 생성자가 먼저 실행된다.
- `super()`를 통해 부모 생성자에 초기값을 전달할 수 있다.
- 추상 클래스는 공통된 객체 상태를 관리하는 데 적합하다.

### 8. 템플릿 메서드 패턴(Template Method Pattern)

템플릿 메서드 패턴은 **전체 작업의 실행 순서를 부모 클래스에서 정의하고, 일부 세부 단계만 자식 클래스에서 구현하도록 하는 설계 패턴**이다.

**사용 목적**

- 여러 클래스에서 동일한 작업 순서를 공유한다.
- 중복되는 공통 로직을 부모 클래스에서 관리한다.
- 세부적인 처리 방식만 자식 클래스에서 변경한다.
- 작업 순서를 일관되게 유지한다.

**결제 처리 구조**

```text
    AbstractPayment
           │
           ▼
      pay(amount)
           │
           ▼
       validate()
      결제 금액 검증
           │
           ▼
       process()
      실제 결제 처리
      (자식이 구현)
           │
           ▼
         log()
      처리 결과 기록
```

**추상 클래스**

```java
abstract class AbstractPayment {

    public final void pay(int amount) {
        validate(amount);
        process(amount);
        log();
    }

    private void validate(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "결제 금액은 0보다 커야 합니다."
            );
        }
    }

    protected abstract void process(int amount);

    private void log() {
        System.out.println("결제 처리 완료");
    }
}
```

**카드 결제 클래스**

```java
class CardPayment extends AbstractPayment {

    @Override
    protected void process(int amount) {
        System.out.println("카드 결제: " + amount);
    }
}
```

**계좌이체 결제 클래스**

```java
class BankPayment extends AbstractPayment {

    @Override
    protected void process(int amount) {
        System.out.println("계좌이체: " + amount);
    }
}
```

**사용 예제**

```java
AbstractPayment payment = new CardPayment();

payment.pay(10000);
```

**실행 결과**

```text
카드 결제: 10000
결제 처리 완료
```

**코드의 핵심 구조**

| 메서드 | 역할 |
|---|---|
| `pay()` | 전체 작업 순서 제어 |
| `validate()` | 공통 검증 처리 |
| `process()` | 자식별 실제 작업 |
| `log()` | 공통 결과 기록 |

**final 키워드를 사용하는 이유**

```java
public final void pay(int amount)
```

- `final` 메서드는 자식 클래스에서 오버라이딩할 수 없다.
- 따라서 자식 클래스가 전체 처리 순서를 임의로 변경하지 못하도록 제한할 수 있다.
- 반드시 고정되어야 하는 작업 순서를 보장할 때 유용하다.

※ 위 코드는 강의자료의 템플릿 메서드 패턴을 설명하기 위한 간단한 예제이다. 실제 결제 성공 여부 및 오류 처리는 추가 구현이 필요하다.

### 9. 인터페이스(Interface)의 개념

인터페이스는 클래스가 제공해야 하는 기능의 규칙과 계약을 정의하는 참조 타입이다.

**인터페이스를 사용하는 이유**

- 서로 다른 클래스에 동일한 기능 규칙을 적용한다.
- 실제 구현과 사용하는 코드를 분리한다.
- 구현 객체를 쉽게 교체할 수 있다.
- 다형성을 이용하여 유지보수성과 확장성을 높인다.
- 여러 인터페이스를 하나의 클래스에서 구현할 수 있다.

**인터페이스 선언**

```java
interface Payment {

    void pay(int amount);
}
```

**인터페이스 구현**

```java
class CardPayment implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println("카드 결제: " + amount);
    }
}
```

**사용 예제**

```java
Payment payment = new CardPayment();

payment.pay(10000);
```

**핵심**

- `interface`는 기능의 규칙을 선언한다.
- `implements`는 인터페이스 구현을 의미한다.
- 구현 클래스는 필요한 추상 메서드를 구현해야 한다.
- 인터페이스 타입으로 실제 구현 객체를 참조할 수 있다.

### 10. 인터페이스의 구성 요소

Java 인터페이스에는 추상 메서드뿐 아니라 상수, 디폴트 메서드, 정적 메서드 등을 선언할 수 있다.

| 구성 요소 | 특징 |
|---|---|
| 상수 필드 | 자동으로 `public static final` |
| 추상 메서드 | 기본적으로 `public abstract` |
| default 메서드 | 구현부를 가지는 기본 인스턴스 메서드 |
| static 메서드 | 인터페이스 이름으로 호출 |
| private 메서드 | 인터페이스 내부 구현 재사용 |

**인터페이스 예제**

```java
interface RemoteControl {

    int MAX_VOLUME = 100;

    void turnOn();

    default void reset() {
        System.out.println("초기화");
    }

    static void info() {
        System.out.println("리모컨 인터페이스");
    }
}
```

**구현 클래스**

```java
class Television implements RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("TV 켜짐");
    }
}
```

**호출**

```java
RemoteControl remote = new Television();

remote.turnOn();
remote.reset();

RemoteControl.info();
```

**주의사항**

- 인터페이스 추상 메서드를 구현할 때는 `public` 접근 수준을 유지해야 한다.
- 인터페이스의 필드는 인스턴스 변수가 아니라 상수이다.
- `default` 메서드와 `static` 메서드는 Java 8부터 지원한다.
- `private` 메서드는 Java 9부터 지원한다.
- 인터페이스의 정적 메서드는 구현 클래스에 상속되지 않는다.

### 11. 인터페이스의 다중 구현

Java 클래스는 하나의 직접적인 부모 클래스만 상속할 수 있지만 여러 인터페이스를 동시에 구현할 수 있다.

**Java 예제**

```java
interface Flyable {

    void fly();
}

interface Swimmable {

    void swim();
}
```

```java
class Duck implements Flyable, Swimmable {

    @Override
    public void fly() {
        System.out.println("날아갑니다.");
    }

    @Override
    public void swim() {
        System.out.println("수영합니다.");
    }
}
```

**사용 예제**

```java
Duck duck = new Duck();

duck.fly();
duck.swim();
```

**다중 구현 구조**

```text
       Flyable       Swimmable
          │              │
          │ implements   │
          └──────┬───────┘
                 │
                 ▼
                Duck
          ┌────────────┐
          │ fly()      │
          │ swim()     │
          └────────────┘
```

**핵심**

- 클래스의 다중 상속은 지원하지 않는다.
- 인터페이스의 다중 구현은 지원한다.
- 서로 다른 기능의 규약을 하나의 클래스에서 구현할 수 있다.
- 여러 인터페이스의 디폴트 메서드가 충돌하면 구현 클래스에서 충돌을 해결해야 한다.

### 12. 추상 클래스와 인터페이스의 차이

추상 클래스와 인터페이스는 모두 추상화와 다형성을 지원하지만 목적과 구성 방식에 차이가 있다.

| 구분 | 추상 클래스 | 인터페이스 |
|---|---|---|
| 선언 | `abstract class` | `interface` |
| 목적 | 공통 상태와 기능 제공 | 공통 기능의 계약 정의 |
| 관계 | `extends` | `implements` |
| 인스턴스 필드 | 가능 | 불가능 |
| 생성자 | 가능 | 불가능 |
| 일반 메서드 | 가능 | default/static/private 등 가능 |
| 추상 메서드 | 가능 | 가능 |
| 다중 관계 | 하나의 직접 부모 클래스 상속 | 여러 인터페이스 구현 |
| 주요 활용 | 공통 처리 기반 | 구현체 교체 및 역할 정의 |

**추상 클래스가 적합한 경우**

- 여러 클래스가 공통 필드와 상태를 가진다.
- 공통 로직을 부모 클래스에서 구현해야 한다.
- 클래스 사이에 명확한 IS-A 관계가 있다.
- 자식 클래스마다 일부 기능만 다르게 구현한다.

**인터페이스가 적합한 경우**

- 구현 클래스가 서로 다른 구조를 가진다.
- 동일한 기능 규약이 필요하다.
- 여러 구현체를 유연하게 교체해야 한다.
- 사용하는 코드가 구체적인 구현 클래스에 의존하지 않도록 설계한다.

**핵심 차이**

```text
추상 클래스
    │
    └── 무엇을 공유할 것인가?
        → 공통 상태 / 공통 구현


인터페이스
    │
    └── 어떤 기능을 제공할 것인가?
        → 기능 계약 / 구현 규칙
```

**주의**

- 추상 클래스와 인터페이스는 서로 대체 관계가 아니다.
- 필요한 경우 하나의 프로그램에서 함께 사용할 수 있다.
- 인터페이스 구현 관계는 주로 CAN-DO 성격의 기능 규약을 표현하며, HAS-A 관계는 일반적으로 객체를 포함하는 구성(Composition)을 의미한다.

### 13. 추상 클래스와 인터페이스의 동시 사용

추상 클래스는 인터페이스를 구현하면서 일부 기능만 제공하고, 나머지 기능을 자식 클래스에 위임할 수 있다.

**설계 구조**

```text
        Payment 인터페이스
           pay()
              │
           implements
              │
              ▼
     AbstractPayment 추상 클래스
       ├── validate()
       ├── log()
       └── process() 추상 메서드
              │
            extends
              │
              ▼
        CardPayment 클래스
          process() 구현
```

**설계상 장점**

- 인터페이스는 외부에 제공할 기능을 정의한다.
- 추상 클래스는 여러 구현체의 공통 로직을 재사용한다.
- 구체적인 클래스는 자신에게 필요한 세부 동작만 구현한다.
- 기능을 사용하는 코드는 인터페이스 타입에 의존할 수 있다.

이 구조는 복잡한 비즈니스 로직에서 공통 처리 절차와 구현체 교체가 모두 필요할 때 유용하다.

### 14. 중첩 클래스와 내부 클래스의 개념

중첩 클래스(Nested Class)는 클래스 내부에 선언하는 클래스이다.

**중첩 클래스를 사용하는 목적**

- 서로 관련된 클래스를 논리적으로 묶는다.
- 외부에 불필요한 구현을 숨긴다.
- 특정 클래스 전용 보조 기능을 정의한다.
- 클래스 간 관련성을 명확하게 표현한다.

**중첩 클래스의 종류**

| 종류 | 특징 | 대표 용도 |
|---|---|---|
| 인스턴스 멤버 클래스 | 외부 객체와 연결 | 객체 상태에 접근하는 보조 기능 |
| 정적 중첩 클래스 | 외부 객체 없이 생성 가능 | Builder 패턴 |
| 지역 클래스 | 블록 내부에 선언 | 특정 메서드 전용 처리 |
| 익명 클래스 | 이름 없이 선언·생성 | 일회성 구현, 이벤트 처리 |

**구조**

```text
            Outer 클래스
                  │
       ┌──────────┴──────────┐
       │                     │
       ▼                     ▼
 인스턴스 멤버 클래스     정적 중첩 클래스
 (Inner Class)          (Static Nested)
       │                     │
 외부 객체와 연결        독립적으로 생성
```

※ 엄밀한 Java 용어에서 `static` 중첩 클래스는 중첩 클래스이지만 내부 클래스(Inner Class)에는 포함되지 않는다. 내부 클래스에는 인스턴스 멤버 클래스, 지역 클래스, 익명 클래스가 포함된다.

### 15. 인스턴스 내부 클래스(Instance Inner Class)

인스턴스 내부 클래스는 외부 클래스의 객체와 연결되어 동작하는 중첩 클래스이다.

**주요 특징**

- 외부 클래스의 인스턴스와 연결된다.
- 외부 클래스의 인스턴스 멤버에 접근할 수 있다.
- 외부 클래스의 `private` 멤버에도 접근할 수 있다.
- 일반적으로 외부 객체가 있어야 생성할 수 있다.

**Java 예제**

```java
class Outer {

    private int value = 100;

    class Inner {

        void print() {
            System.out.println(value);
        }
    }
}
```

**객체 생성**

```java
Outer outer = new Outer();

Outer.Inner inner = outer.new Inner();

inner.print(); // 100
```

**객체 관계**

```text
        Outer 객체
    ┌─────────────────┐
    │ value = 100     │
    │                 │
    │ Inner 객체와    │
    │ 연결됨          │
    └────────┬────────┘
             │
             ▼
         Inner 객체
         print()
             │
             ▼
      Outer.value 접근
```

**사용 목적**

- 특정 객체에 종속적인 기능이 필요할 때 사용한다.
- 외부 클래스의 상태를 활용해야 하는 보조 클래스를 구현할 수 있다.
- 관련 구현을 외부로 공개하지 않고 내부에 배치할 수 있다.

### 16. 정적 중첩 클래스(Static Nested Class)

정적 중첩 클래스는 클래스 내부에 `static` 키워드로 선언하는 중첩 클래스이다.

**주요 특징**

- 외부 객체 없이 독립적으로 생성할 수 있다.
- 외부 클래스의 인스턴스와 자동으로 연결되지 않는다.
- 외부 클래스의 정적 멤버에 직접 접근할 수 있다.
- 외부 클래스의 인스턴스 멤버를 사용하려면 별도의 객체 참조가 필요하다.

**Java 예제**

```java
class Outer {

    private static int count = 10;

    static class Nested {

        void print() {
            System.out.println(count);
        }
    }
}
```

**객체 생성**

```java
Outer.Nested nested = new Outer.Nested();

nested.print(); // 10
```

**인스턴스 내부 클래스와 비교**

| 구분 | 인스턴스 내부 클래스 | 정적 중첩 클래스 |
|---|---|---|
| static 선언 | 없음 | 있음 |
| 외부 객체 | 일반적으로 필요 | 불필요 |
| 외부 인스턴스 연결 | 있음 | 없음 |
| 외부 인스턴스 필드 직접 접근 | 가능 | 불가능 |
| 주요 용도 | 외부 객체 상태와 연관된 기능 | 독립적인 보조 기능, Builder |

**핵심**

정적 중첩 클래스는 외부 객체의 인스턴스 상태에 의존하지 않는 관련 기능을 클래스 내부에 배치할 때 적합하다.

### 17. 지역 클래스(Local Class)

지역 클래스는 메서드나 생성자 등의 블록 내부에 선언하는 클래스이다.

**주요 특징**

- 선언된 블록 내부에서만 사용할 수 있다.
- 특정 메서드 실행에 필요한 보조 타입으로 활용한다.
- 외부 클래스의 접근 가능한 멤버를 사용할 수 있다.
- 지역 변수를 참조할 때 해당 변수는 `final` 또는 사실상 final이어야 한다.

**Java 예제**

```java
class Outer {

    void execute() {

        int number = 10;

        class Local {

            void print() {
                System.out.println(number);
            }
        }

        Local local = new Local();
        local.print();
    }
}
```

**사실상 final(Effectively Final)**

변수에 `final` 키워드를 명시하지 않았더라도 초기화 이후 값을 다시 대입하지 않으면 사실상 final로 취급할 수 있다.

```java
int number = 10;

// number = 20; // 지역 클래스가 number를
// 참조하는 경우 재대입하면 컴파일 오류
```

**핵심**

- 지역 클래스는 특정 블록 내부에서만 사용하는 클래스이다.
- 지역 변수를 캡처할 수 있다.
- 캡처한 지역 변수는 `final` 또는 사실상 final이어야 한다.

### 18. 익명 클래스(Anonymous Class)

익명 클래스는 별도의 클래스 이름을 선언하지 않고, 클래스 상속이나 인터페이스 구현과 동시에 객체를 생성하는 방식이다.

**익명 클래스를 사용하는 경우**

- 일회성 기능 구현
- 간단한 이벤트 처리
- 특정 인터페이스의 임시 구현
- 별도 클래스 파일이 불필요한 경우

**인터페이스 선언**

```java
interface Greeting {

    void hello();
}
```

**익명 클래스 사용**

```java
Greeting greeting = new Greeting() {

    @Override
    public void hello() {
        System.out.println("안녕하세요.");
    }
};

greeting.hello();
```

**일반 클래스와의 차이**

```text
일반 클래스
    │
    ├── 클래스 선언
    ├── 메서드 구현
    └── 객체 생성


익명 클래스
    │
    └── 선언과 객체 생성을
        하나의 표현식으로 처리
```

**주의사항**

- 익명 클래스는 이름이 없는 클래스이다.
- 클래스 상속 또는 인터페이스 구현에 사용할 수 있다.
- 일반적인 생성자를 직접 선언할 수 없다.
- 여러 곳에서 반복 사용하는 구현은 별도 클래스로 분리하는 편이 적합할 수 있다.

### 19. 익명 클래스와 람다식(Lambda Expression)

람다식은 함수형 인터페이스의 구현을 간결하게 표현하기 위한 문법이다.

**함수형 인터페이스(Functional Interface)**

- 추상 메서드가 정확히 하나인 인터페이스이다.
- `@FunctionalInterface`를 이용하여 컴파일러 검사를 받을 수 있다.
- 디폴트 메서드와 정적 메서드가 존재할 수 있다.
- 람다식과 메서드 참조를 이용하여 구현할 수 있다.

**익명 클래스 방식**

```java
Runnable task = new Runnable() {

    @Override
    public void run() {
        System.out.println("작업 실행");
    }
};
```

**람다식 방식**

```java
Runnable task =
    () -> System.out.println("작업 실행");
```

**실행**

```java
Thread thread = new Thread(task);

thread.start();
```

**비교**

| 구분 | 익명 클래스 | 람다식 |
|---|---|---|
| 문법 | 클래스 본문 작성 | 함수형 인터페이스의 동작 표현 |
| 코드 길이 | 상대적으로 김 | 상대적으로 간결 |
| 대상 | 클래스 및 인터페이스 | 함수형 인터페이스 |
| this | 익명 클래스 객체 참조 | 바깥쪽 문맥의 this |
| 주요 용도 | 일회성 객체 구현 | 간결한 동작 전달 |

**핵심**

- 람다식은 Java 8부터 지원한다.
- 함수형 인터페이스를 구현할 때 람다식을 사용할 수 있다.
- 모든 인터페이스를 람다식으로 표현할 수 있는 것은 아니다.
- 익명 클래스와 람다식은 비슷한 상황에서 활용되지만 동일한 문법이나 동일한 객체 모델은 아니다.

### 20. Builder 패턴(Builder Pattern)

Builder 패턴은 복잡한 객체를 단계적으로 생성할 수 있도록 구성하는 객체 생성 패턴이다.

**Builder 패턴을 사용하는 이유**

- 생성자 매개변수가 많을 때 가독성이 높아진다.
- 각 값의 의미를 메서드 이름으로 표현한다.
- 선택적인 데이터를 설정하기 편리하다.
- 생성 시점에 입력 데이터를 검증할 수 있다.
- 불변 객체 설계와 함께 사용하기 좋다.

**일반 생성자 방식**

```java
Member member = new Member(
    "홍길동",
    "test@example.com",
    25
);
```

매개변수가 많아지면 값의 순서와 의미를 파악하기 어려울 수 있다.

**Builder 패턴을 적용한 클래스**

```java
class Member {

    private final String name;
    private final String email;
    private final int age;

    private Member(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
    }

    public static class Builder {

        private String name;
        private String email;
        private int age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Member build() {
            if (name == null || name.isBlank()) {
                throw new IllegalStateException(
                    "이름은 필수입니다."
                );
            }

            return new Member(this);
        }
    }
}
```

**객체 생성**

```java
Member member = new Member.Builder()
    .name("홍길동")
    .email("test@example.com")
    .age(25)
    .build();
```

**Builder 패턴의 실행 구조**

```text
        Member.Builder
              │
              ▼
         name() 설정
              │
              ▼
         email() 설정
              │
              ▼
          age() 설정
              │
              ▼
           build()
              │
              ▼
         입력값 검증
              │
              ▼
        Member 객체 생성
```

**정적 중첩 클래스를 사용하는 이유**

- Member 객체를 만들기 전에도 Builder를 생성할 수 있다.
- 외부 Member 객체에 종속되지 않는다.
- Member 클래스와 관련된 생성 로직을 내부에 묶어 관리한다.

**주의**

- `Member.Builder()`만으로는 객체가 생성되지 않는다.
- 위 예제에서는 `new Member.Builder()`로 Builder를 생성한다.
- Lombok의 `@Builder`는 Builder 구현을 생성해 주는 별도 라이브러리 기능이며 Java 기본 문법은 아니다.

### 21. 내부 클래스 4종 비교

| 종류 | 선언 위치 | 외부 객체 의존 | 주요 활용 |
|---|---|---|---|
| 인스턴스 멤버 클래스 | 클래스 내부 | 있음 | 외부 객체 상태 활용 |
| 정적 중첩 클래스 | 클래스 내부 | 없음 | Builder, 보조 타입 |
| 지역 클래스 | 메서드·블록 내부 | 문맥에 따라 다름 | 특정 작업 전용 |
| 익명 클래스 | 객체 생성 표현식 | 문맥에 따라 다름 | 일회성 구현 |

**생성 방법 비교**

```java
// 인스턴스 멤버 클래스
Outer outer = new Outer();
Outer.Inner inner = outer.new Inner();

// 정적 중첩 클래스
Outer.Nested nested = new Outer.Nested();
```

※ 위 두 표현식은 각각 `Outer`에 `Inner`, `Nested`가 선언되어 있다는 가정하에 작성한 생성 문법이다.

**핵심**

- 외부 객체의 상태가 필요하면 인스턴스 멤버 클래스를 고려한다.
- 외부 객체와 독립적인 보조 기능이면 정적 중첩 클래스를 고려한다.
- 특정 메서드에서만 필요한 타입이면 지역 클래스를 고려한다.
- 한 번만 사용할 간단한 구현이면 익명 클래스를 고려한다.

### 22. 인터페이스와 의존성 주입(DI)

의존성 주입(Dependency Injection)은 객체가 필요로 하는 의존 객체를 직접 생성하지 않고 외부에서 전달받도록 구성하는 방식이다.

**인터페이스를 이용한 의존성 분리**

```text
      NotificationService
               │
               ▼
     NotificationSender
          인터페이스
               │
       ┌───────┼───────┐
       │       │       │
       ▼       ▼       ▼
     Email    SMS     Push
     Sender  Sender   Sender
```

**인터페이스 선언**

```java
interface NotificationSender {

    void send(String message);
}
```

**이메일 구현**

```java
class EmailSender implements NotificationSender {

    @Override
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}
```

**문자 구현**

```java
class SmsSender implements NotificationSender {

    @Override
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}
```

**서비스 클래스**

```java
class NotificationService {

    private final NotificationSender sender;

    public NotificationService(NotificationSender sender) {
        this.sender = sender;
    }

    public void notifyUser(String message) {
        sender.send(message);
    }
}
```

**구현체 주입**

```java
NotificationService service =
    new NotificationService(new EmailSender());

service.notifyUser("회원가입 완료");
```

**구현체 교체**

```java
NotificationService service =
    new NotificationService(new SmsSender());

service.notifyUser("인증번호 발송");
```

**핵심**

- 서비스는 특정 구현 클래스가 아니라 인터페이스에 의존한다.
- 실제 구현 객체는 생성자 등을 통해 외부에서 전달받는다.
- 서비스 내부 코드를 변경하지 않고 구현체를 교체할 수 있다.
- Spring Boot에서는 Spring 컨테이너가 객체의 생성과 의존 관계 구성을 지원한다.

※ 위 코드는 Spring 없이 일반 Java에서 의존성 주입의 원리를 표현한 예제이다.

### 23. JVM 메모리 구조와 다형성

다형성에서는 참조 변수의 선언 타입과 실제 객체의 타입을 구분해야 한다.

**Java 예제**

```java
Animal animal = new Dog("초코");

animal.sound();
```

**메모리 구조**

```text
         JVM Stack
    ┌────────────────┐
    │ animal         │
    │ Animal 타입    │
    │ 참조값 ────────┼────────┐
    └────────────────┘        │
                              ▼
                         JVM Heap
                   ┌─────────────────┐
                   │    Dog 객체     │
                   │                 │
                   │ Animal 상태     │
                   │ Dog 상태        │
                   └─────────────────┘
```

**핵심**

- 참조 변수의 타입은 접근 가능한 멤버를 결정하는 기준이다.
- 실제 객체의 타입은 오버라이딩된 인스턴스 메서드의 실행 구현을 결정한다.
- 자식 객체에는 부모로부터 상속받은 인스턴스 상태가 포함된다.
- 객체마다 메서드 코드가 독립적으로 복사되는 것은 아니다.

### 24. 예외(Exception)의 개념과 종류

예외는 프로그램 실행 과정에서 발생할 수 있는 비정상적인 상황을 객체로 표현한 것이다.

Java는 `Throwable`을 중심으로 예외와 오류를 구분한다.

**예외 계층 구조**

```text
           Throwable
               │
       ┌───────┴───────┐
       │               │
       ▼               ▼
     Error          Exception
                       │
               ┌───────┴────────┐
               │                │
               ▼                ▼
       Checked Exception  RuntimeException
                                  │
                                  ▼
                         Unchecked Exception
```

**대표적인 종류**

| 구분 | 예시 | 설명 |
|---|---|---|
| Error | `OutOfMemoryError` | 일반적인 애플리케이션에서 복구하기 어려운 오류 |
| Checked Exception | `IOException`, `SQLException` | 컴파일러가 처리 또는 전파 선언을 요구 |
| Unchecked Exception | `NullPointerException`, `ArithmeticException` | 컴파일러가 처리 강제하지 않음 |

**핵심**

- Checked Exception은 처리하거나 `throws`로 전파해야 한다.
- Unchecked Exception은 컴파일러가 처리를 강제하지 않는다.
- Error는 일반적인 예외 복구 대상으로 다루지 않는 것이 보통이다.
- 예외 처리는 오류를 무조건 숨기는 것이 아니라 상황에 적절히 대응하기 위한 기능이다.

### 25. try-catch-finally와 throw, throws

**try-catch**

```java
try {
    int result = 10 / 0;
    System.out.println(result);
} catch (ArithmeticException e) {
    System.out.println("0으로 나눌 수 없습니다.");
}
```

- `try` : 예외가 발생할 수 있는 코드
- `catch` : 발생한 예외 처리

**finally**

```java
try {
    System.out.println("작업 시작");
} catch (Exception e) {
    System.out.println("예외 처리");
} finally {
    System.out.println("정리 작업");
}
```

- `finally`는 일반적으로 예외 발생 여부와 관계없이 실행한다.
- 다만 JVM이 강제 종료되는 등의 상황에서는 실행이 보장되지 않는다.

**throw와 throws**

| 구분 | 역할 |
|---|---|
| `throw` | 예외 객체를 발생시킴 |
| `throws` | 메서드가 전달할 수 있는 예외를 선언 |

**throw 예제**

```java
if (age < 0) {
    throw new IllegalArgumentException(
        "나이는 음수일 수 없습니다."
    );
}
```

**throws 예제**

```java
public static void readFile()
        throws java.io.IOException {

    java.io.FileReader reader =
        new java.io.FileReader("test.txt");

    reader.close();
}
```

**try-with-resources**

```java
try (java.io.FileReader reader =
         new java.io.FileReader("test.txt")) {

    System.out.println(reader.read());

} catch (java.io.IOException e) {
    System.out.println("파일 처리 실패");
}
```

- `AutoCloseable`을 구현한 자원을 자동으로 닫을 수 있다.
- 파일과 네트워크 등의 자원 관리에 유용하다.
- 외부 자원은 예외 발생 여부와 관계없이 적절하게 정리해야 한다.

**사용자 정의 예외**

```java
class MemberNotFoundException
        extends RuntimeException {

    public MemberNotFoundException(String message) {
        super(message);
    }
}
```

사용자 정의 예외를 이용하면 프로그램의 업무 상황에 맞는 오류를 명확하게 표현할 수 있다.

### 26. Spring Boot에서의 객체지향 설계

강의자료에서는 추상 클래스, 인터페이스, 내부 클래스가 Spring Boot 아키텍처에서 활용되는 구조를 설명한다.

**대표적인 패키지 구조**

```text
com.example.shop/
│
├── controller/
│   └── MemberController.java
│
├── service/
│   ├── MemberService.java
│   └── impl/
│       └── MemberServiceImpl.java
│
├── repository/
│   └── MemberRepository.java
│
├── domain/
│   └── AbstractEntity.java
│
└── dto/
    └── MemberDto.java
```

**클래스별 역할**

| 클래스 | 역할 | 관련 개념 |
|---|---|---|
| MemberController | HTTP 요청 처리 | 클래스와 메서드 |
| MemberService | 서비스 기능 규약 | 인터페이스 |
| MemberServiceImpl | 비즈니스 로직 구현 | 인터페이스 구현 |
| MemberRepository | 데이터 접근 규약 | 인터페이스 |
| AbstractEntity | 공통 엔티티 속성 | 추상 클래스·상속 |
| MemberDto | 계층 간 데이터 전달 | 데이터 클래스·Builder |

**아키텍처 구조**

```text
          Client
             │
             ▼
    MemberController
             │
             ▼
    MemberService
       (Interface)
             │
             ▼
   MemberServiceImpl
             │
             ▼
   MemberRepository
             │
             ▼
          Database
```

**핵심**

- Controller는 요청을 처리한다.
- Service는 비즈니스 로직을 담당한다.
- Repository는 데이터 접근을 담당한다.
- 인터페이스는 구현체 간 결합도를 낮추는 데 도움이 된다.
- 추상 클래스는 공통 상태와 처리 로직을 재사용할 수 있게 한다.
- 정적 중첩 클래스는 Builder와 같은 보조 기능을 구현하는 데 활용할 수 있다.

※ 이는 강의자료에서 소개한 대표적인 설계 예시이다. 모든 Spring Boot 프로젝트가 반드시 동일한 패키지 구조나 인터페이스 구성을 사용해야 하는 것은 아니다.

### 27. 객체지향 설계 도구 선택 기준

| 상황 | 우선 고려할 구조 |
|---|---|
| 여러 클래스가 공통 상태와 구현을 공유 | 추상 클래스 |
| 여러 구현체가 동일한 기능 규약을 제공 | 인터페이스 |
| 전체 처리 순서가 같고 일부 단계만 다름 | 템플릿 메서드 패턴 |
| 특정 객체의 상태에 연결된 보조 타입 필요 | 인스턴스 내부 클래스 |
| 외부 객체 없이 사용하는 관련 보조 타입 필요 | 정적 중첩 클래스 |
| 특정 메서드 안에서만 필요한 타입 | 지역 클래스 |
| 일회성 클래스 구현 | 익명 클래스 |
| 함수형 인터페이스의 간단한 동작 표현 | 람다식 |
| 객체 생성 시 설정값이 많음 | Builder 패턴 |
| 구현체를 유연하게 교체해야 함 | 인터페이스와 의존성 주입 |

**설계 판단 흐름**

```text
          설계 시작
              │
              ▼
   공통 상태와 구현이 필요한가?
         │          │
        Yes         No
         │          │
         ▼          ▼
     추상 클래스   공통 기능 규약이
                  필요한가?
                   │       │
                  Yes      No
                   │       │
                   ▼       ▼
               인터페이스  내부 전용
                          보조 타입인가?
                            │
                            ▼
                        중첩 클래스
```

이 흐름은 기본적인 선택 기준이다. 실제 프로그램에서는 여러 방식을 조합하거나 일반 클래스를 사용하는 것이 더 적절할 수도 있다.

### 28. 자주 발생하는 오류 및 주의사항

| 주의사항 | 원인 및 해결 방법 |
|---|---|
| package 선언 위치 | import 및 클래스 선언보다 앞에 작성 |
| 패키지 이름과 폴더 구조 불일치 | 일반적으로 패키지 경로에 맞게 디렉터리 구성 |
| 하위 패키지 자동 import 오해 | 패키지마다 필요한 타입을 별도로 import |
| 추상 클래스 직접 객체 생성 | 구체 자식 클래스를 생성 |
| 추상 메서드 미구현 | 구현하거나 자식 클래스도 abstract로 선언 |
| 추상 클래스 생성자 오해 | 추상 클래스도 생성자를 가질 수 있음 |
| 인터페이스 생성자 선언 | 인터페이스에는 생성자 선언 불가 |
| 인터페이스 메서드 접근 제한 | public 추상 메서드는 public으로 구현 |
| 클래스 다중 상속 | Java는 클래스의 다중 상속 불가 |
| 인터페이스 다중 구현 | 여러 인터페이스 구현 가능 |
| 정적 중첩 클래스 생성 | 외부 객체 없이 Outer.Nested 형태로 생성 |
| 인스턴스 내부 클래스 생성 | 일반적으로 외부 객체 필요 |
| 지역 클래스의 변수 캡처 | final 또는 사실상 final 필요 |
| 익명 클래스와 람다식 혼동 | 람다는 함수형 인터페이스에 적용 |
| Builder 생성 문법 오류 | new Builder() 또는 제공된 팩토리 메서드 사용 |
| DI와 인터페이스 혼동 | 인터페이스는 계약, DI는 의존 객체 전달 방식 |
| 예외 처리 누락 | Checked Exception 처리 또는 전파 |
| 예외 무조건 무시 | 적절한 처리, 기록 또는 전파 필요 |
| finally에 대한 오해 | 모든 상황에서 실행이 보장되지는 않음 |
| 자원 해제 누락 | try-with-resources 등으로 자원 정리 |

### ✅ Day16 핵심 정리

| 구분 | 핵심 내용 |
|---|---|
| Package | 클래스의 소속과 이름 공간 관리 |
| Import | 외부 패키지 타입을 간단한 이름으로 사용 |
| Static Import | 정적 멤버의 이름 간소화 |
| Abstract Class | 공통 상태와 구현을 제공하는 추상 클래스 |
| Abstract Method | 구현부 없이 선언된 메서드 |
| extends | 클래스 상속 |
| Interface | 공통 기능의 계약 및 규약 |
| implements | 인터페이스 구현 |
| Default Method | 인터페이스의 기본 구현 메서드 |
| Multiple Implementation | 여러 인터페이스 동시 구현 |
| Template Method Pattern | 공통 실행 순서와 세부 구현 분리 |
| Nested Class | 클래스 내부에 선언된 클래스 |
| Instance Inner Class | 외부 객체와 연결된 내부 클래스 |
| Static Nested Class | 외부 객체 없이 사용하는 정적 중첩 클래스 |
| Local Class | 블록 내부에 선언하는 클래스 |
| Anonymous Class | 이름 없이 선언하여 사용하는 클래스 |
| Effectively Final | 재대입하지 않아 final처럼 취급되는 지역 변수 |
| Lambda Expression | 함수형 인터페이스 구현 표현식 |
| Functional Interface | 추상 메서드가 하나인 인터페이스 |
| Builder Pattern | 단계적으로 객체를 생성하는 패턴 |
| Dependency Injection | 의존 객체를 외부에서 전달받는 구조 |
| Polymorphism | 공통 타입으로 다양한 구현 객체 사용 |
| Checked Exception | 컴파일러가 처리 또는 전파를 요구하는 예외 |
| Unchecked Exception | 컴파일러가 처리를 강제하지 않는 예외 |
| try-catch-finally | 예외 처리 및 정리 작업 |
| throw | 예외 객체 발생 |
| throws | 예외 전파 가능성 선언 |
| try-with-resources | AutoCloseable 자원 자동 정리 |

**최종 학습 정리**

- `package`는 클래스의 소속을 지정하고 `import`는 다른 패키지의 타입을 간편하게 사용하도록 한다.
- 추상 클래스는 공통 상태와 기능을 제공하는 상속 기반 클래스이다.
- 추상 클래스는 직접 객체를 생성할 수 없지만 생성자와 일반 메서드를 가질 수 있다.
- 추상 메서드는 구현부 없이 선언하며 구체 자식 클래스에서 구현해야 한다.
- 템플릿 메서드 패턴은 전체 실행 순서를 공통으로 정의하고 일부 단계만 자식에서 구현한다.
- 인터페이스는 여러 구현 클래스가 지켜야 하는 기능의 규칙을 정의한다.
- Java는 클래스의 다중 상속은 지원하지 않지만 여러 인터페이스를 구현할 수 있다.
- 추상 클래스는 공통 상태와 구현을 공유할 때, 인터페이스는 기능 계약을 정의할 때 주로 사용한다.
- 중첩 클래스는 관련된 클래스를 내부에 묶어 관리하는 구조이다.
- 인스턴스 내부 클래스는 외부 객체와 연결되며 정적 중첩 클래스는 외부 객체 없이 생성할 수 있다.
- 지역 클래스는 특정 블록에서만 사용하며 캡처한 지역 변수는 final 또는 사실상 final이어야 한다.
- 익명 클래스는 이름 없이 일회성 구현을 생성하는 데 활용한다.
- 람다식은 함수형 인터페이스를 간결하게 구현하는 표현식이다.
- Builder 패턴은 생성자 매개변수가 많은 객체를 명확하게 생성하도록 돕는다.
- 의존성 주입은 객체가 사용하는 의존 객체를 외부에서 전달받는 방식이다.
- 예외 처리는 발생한 문제를 적절하게 처리하거나 전파하여 프로그램의 안정성을 높인다.
- 객체지향 설계에서 중요한 것은 클래스의 종류를 외우는 것이 아니라 각 구조의 목적과 책임에 따라 적절하게 선택하는 것이다.

</details>


## Day17. Java 인터페이스 심화 및 예외 처리
<details>

### 🎯 학습 목표
- 인터페이스의 개념과 기능 규약으로서의 역할을 이해한다.
- 인터페이스의 선언과 `implements`를 이용한 구현 방법을 익힌다.
- 인터페이스의 상수 필드와 추상 메서드의 특징을 이해한다.
- `default`, `static`, `private` 메서드의 차이를 구분한다.
- 인터페이스의 다중 구현과 다중 상속 구조를 이해한다.
- 인터페이스를 이용한 자동 타입 변환과 다형성을 이해한다.
- 추상 클래스와 인터페이스의 차이 및 선택 기준을 이해한다.
- 강한 결합과 느슨한 결합의 차이를 구분한다.
- 인터페이스와 의존성 주입(DI)의 관계를 이해한다.
- Mock 객체를 활용한 테스트 구조를 이해한다.
- 중첩 클래스와 익명 객체의 주요 특징을 복습한다.
- Checked Exception과 Unchecked Exception을 구분한다.
- `try-catch-finally`, `throw`, `throws`의 사용법을 이해한다.
- `try-with-resources`를 이용한 자원 관리 방법을 이해한다.
- 사용자 정의 예외를 이용하여 의미 있는 오류를 표현할 수 있다.

### 1. 인터페이스(Interface)의 개념

인터페이스는 클래스가 제공해야 할 기능의 규칙과 계약을 정의하는 참조 타입이다.

**인터페이스의 핵심 개념**

- 어떤 기능을 제공해야 하는지 정의한다.
- 해당 기능을 어떻게 구현할지는 구현 클래스가 결정한다.
- 서로 다른 클래스가 동일한 기능 규약을 따를 수 있다.
- 공통 타입으로 다양한 구현 객체를 처리할 수 있다.
- 구현 세부사항을 사용하는 코드로부터 분리할 수 있다.

**인터페이스의 역할**

```text
        인터페이스
     (기능의 설계 규약)
             │
             ▼
       Payment
       ┌──────────┐
       │ pay()    │
       └────┬─────┘
            │
     ┌──────┴──────┐
     │             │
     ▼             ▼
 CardPayment   KakaoPayment
     │             │
     ▼             ▼
  카드 결제      간편 결제
```

- `Payment` : 결제 기능의 규약 정의
- `CardPayment` : 카드 결제 방식 구현
- `KakaoPayment` : 간편 결제 방식 구현

**핵심 : 인터페이스는 구현 방법보다 외부에 제공하는 기능의 규약을 정의하는 데 목적이 있다.**

### 2. 인터페이스의 기본 선언과 구현

Java는 `interface` 키워드를 사용하여 인터페이스를 선언한다.

**인터페이스 선언**

```java
interface Animal {
    void sound();
}
```

**인터페이스 구현**

```java
class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("멍멍!");
    }
}
```

**객체 생성과 사용**

```java
Animal animal = new Dog();

animal.sound(); // 멍멍!
```

**주요 키워드**

| 키워드 | 역할 |
|---|---|
| `interface` | 인터페이스 선언 |
| `implements` | 클래스의 인터페이스 구현 |
| `extends` | 인터페이스 간 상속 |
| `@Override` | 상속된 메서드의 올바른 재정의 여부 검사 |

**실행 구조**

```text
interface Animal
       │
       │ sound() 선언
       ▼
class Dog implements Animal
       │
       │ sound() 구현
       ▼
new Dog()
       │
       ▼
animal.sound()
       │
       ▼
Dog.sound() 실행
```

**주의사항**

- 인터페이스 자체는 직접 객체를 생성할 수 없다.
- 구체 클래스는 필요한 추상 메서드를 구현해야 한다.
- 인터페이스의 public 추상 메서드를 구현할 때는 반드시 `public`으로 선언해야 한다.
- `@Override`는 필수 문법은 아니지만 사용하는 것이 권장된다.

### 3. 인터페이스와 객체의 메모리 구조

인터페이스는 직접 객체를 생성할 수 없지만 구현 객체를 참조하는 타입으로 사용할 수 있다.

**잘못된 객체 생성**

```java
// 컴파일 오류
// Animal animal = new Animal();
```

**올바른 객체 생성**

```java
Animal animal = new Dog();
```

**메모리 구조**

```text
       JVM Stack
  ┌─────────────────┐
  │ animal          │
  │ 선언 타입 Animal│
  │ 참조값 ─────────┼──────────┐
  └─────────────────┘          │
                               ▼
                          JVM Heap
                     ┌─────────────────┐
                     │    Dog 객체     │
                     │                 │
                     │ sound() 구현    │
                     └─────────────────┘
```

**핵심 원리**

1. `new Dog()`는 Dog 객체를 생성한다.
2. `animal` 변수의 선언 타입은 `Animal`이다.
3. 참조 변수는 생성된 Dog 객체를 참조한다.
4. `sound()`를 호출하면 실제 Dog 객체의 구현이 실행된다.

**참조 타입과 실제 객체 타입**

| 구분 | 타입 | 역할 |
|---|---|---|
| 참조 변수 타입 | Animal | 접근 가능한 멤버를 결정 |
| 실제 객체 타입 | Dog | 오버라이딩된 인스턴스 메서드의 구현 결정 |

※ 메모리 그림은 JVM의 논리적 동작을 단순화한 구조이며, 실제 객체 내부에 메서드 코드가 개별적으로 복사된다는 의미는 아니다.

### 4. 인터페이스의 상수 필드

인터페이스 내부에 선언하는 모든 필드는 자동으로 `public static final` 속성을 가진다.

**인터페이스 상수 선언**

```java
interface Config {

    int MAX = 100;
}
```

위 코드는 다음과 같은 의미이다.

```java
interface Config {

    public static final int MAX = 100;
}
```

**상수 사용**

```java
System.out.println(Config.MAX); // 100
```

**상수의 특징**

- `public` : 외부에서 접근 가능
- `static` : 객체가 아닌 타입에 소속
- `final` : 초기화된 필드에 다른 값을 재대입할 수 없음

**잘못된 상수 변경**

```java
// 컴파일 오류
// Config.MAX = 200;
```

| 구분 | 일반 클래스 필드 | 인터페이스 필드 |
|---|---|---|
| 인스턴스 필드 | 선언 가능 | 선언 불가 |
| static 필드 | 선언 가능 | 상수 필드만 가능 |
| final | 선택적으로 사용 | 자동 적용 |
| 초기화 | 기본값 또는 명시적 초기화 | 명시적 초기화 필요 |

**주의 : 인터페이스의 모든 필드는 상수이며, 객체별로 서로 다른 인스턴스 필드를 선언할 수 없다.**

### 5. 인터페이스의 추상 메서드(Abstract Method)

인터페이스의 일반적인 메서드 선언은 기본적으로 `public abstract` 속성을 가진다.

**추상 메서드 선언**

```java
interface RemoteControl {

    void powerOn();

    void powerOff();
}
```

다음과 같은 의미이다.

```java
interface RemoteControl {

    public abstract void powerOn();

    public abstract void powerOff();
}
```

**구현 클래스**

```java
class Television implements RemoteControl {

    @Override
    public void powerOn() {
        System.out.println("TV 켜짐");
    }

    @Override
    public void powerOff() {
        System.out.println("TV 꺼짐");
    }
}
```

**메서드의 특징**

- 인터페이스 추상 메서드는 구현부가 없다.
- 반환 타입, 메서드 이름, 매개변수 등을 정의한다.
- 구현 클래스는 메서드의 실제 동작을 작성한다.
- 구현 클래스가 필요한 추상 메서드를 구현하지 않으면 해당 클래스도 추상 클래스로 선언해야 한다.

**주의 : 인터페이스에서 선언한 public 추상 메서드를 구현할 때 접근 제한자를 생략하면 package-private이 되므로 컴파일 오류가 발생한다.**

### 6. 인터페이스 메서드의 종류

Java 인터페이스에는 여러 종류의 메서드를 선언할 수 있다.

| 종류 | 도입 버전 | 주요 특징 |
|---|---|---|
| 추상 메서드 | 기본 지원 | 구현 클래스가 구현할 기능 |
| default 메서드 | Java 8 | 인터페이스의 기본 구현 |
| static 메서드 | Java 8 | 인터페이스 소속 정적 기능 |
| private 메서드 | Java 9 | 인터페이스 내부의 공통 처리 |

**메서드 구조**

```java
interface Example {

    // 추상 메서드
    void execute();

    // default 메서드
    default void print() {
        System.out.println("기본 기능");
    }

    // static 메서드
    static void info() {
        System.out.println("정적 기능");
    }

    // private 메서드
    private void helper() {
        System.out.println("내부 기능");
    }
}
```

- 추상 메서드 : 구현 클래스가 제공할 기능의 규약
- default 메서드 : 구현 클래스에서 재사용할 수 있는 기본 동작
- static 메서드 : 인터페이스와 관련된 공통 유틸리티
- private 메서드 : 인터페이스 내부의 구현 코드 재사용

### 7. default 메서드

`default` 메서드는 인터페이스에 기본 구현을 제공하는 인스턴스 메서드이다.

**사용 목적**

- 여러 구현 클래스에서 공통 기능을 재사용한다.
- 기존 인터페이스에 새로운 기능을 추가할 때 활용한다.
- 구현 클래스가 필요한 경우 기본 동작을 재정의할 수 있다.

**인터페이스 선언**

```java
interface RemoteControl {

    void powerOn();

    default void reset() {
        System.out.println("기본 설정으로 초기화");
    }
}
```

**구현 클래스**

```java
class Television implements RemoteControl {

    @Override
    public void powerOn() {
        System.out.println("TV 켜짐");
    }
}
```

**사용 예제**

```java
RemoteControl remote = new Television();

remote.powerOn();
remote.reset();
```

**실행 결과**

```text
TV 켜짐
기본 설정으로 초기화
```

**default 메서드 재정의**

```java
@Override
public void reset() {
    System.out.println("TV 전용 초기화");
}
```

**주의사항**

- `default` 메서드는 구현부가 있어야 한다.
- 구현 클래스에서 반드시 재정의할 필요는 없다.
- 필요한 경우 오버라이딩할 수 있다.
- 서로 다른 인터페이스의 default 메서드가 충돌하면 명시적으로 해결해야 한다.

### 8. static 메서드와 private 메서드

**static 메서드**

인터페이스 이름을 통해 직접 호출할 수 있는 정적 메서드이다.

```java
interface Calculator {

    static int add(int a, int b) {
        return a + b;
    }
}
```

**호출**

```java
int result = Calculator.add(10, 20);

System.out.println(result); // 30
```

**특징**

- 객체 생성이 필요 없다.
- 인터페이스 이름으로 호출한다.
- 구현 클래스에 정적 메서드가 상속되지 않는다.
- 공통 계산이나 유틸리티 기능에 활용할 수 있다.

**private 메서드**

인터페이스 내부에서 공통적으로 사용하는 구현 코드를 분리할 때 사용한다.

```java
interface Logger {

    default void info(String message) {
        print("INFO", message);
    }

    default void error(String message) {
        print("ERROR", message);
    }

    private void print(String level, String message) {
        System.out.println(
            "[" + level + "] " + message
        );
    }
}
```

**특징**

- 외부에서 직접 호출할 수 없다.
- 구현 클래스에서도 직접 접근할 수 없다.
- 인터페이스 내부의 메서드에서 재사용할 수 있다.
- `private static` 메서드도 선언할 수 있다.

**핵심 : default는 기본 동작 제공, static은 타입 소속 기능, private은 내부 구현 재사용에 사용한다.**

### 9. 인터페이스의 다중 구현(Multiple Implementation)

Java 클래스는 하나의 직접적인 부모 클래스만 상속할 수 있지만 여러 인터페이스를 동시에 구현할 수 있다.

**다중 구현의 기본 구조**

```java
class 클래스명 implements 인터페이스A, 인터페이스B {
    // 필요한 메서드 구현
}
```

**인터페이스 선언**

```java
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

interface Faxable {
    void fax();
}
```

**다중 구현 클래스**

```java
class MultiFunctionPrinter
        implements Printable, Scannable, Faxable {

    @Override
    public void print() {
        System.out.println("인쇄");
    }

    @Override
    public void scan() {
        System.out.println("스캔");
    }

    @Override
    public void fax() {
        System.out.println("팩스 전송");
    }
}
```

**사용 예제**

```java
MultiFunctionPrinter printer =
    new MultiFunctionPrinter();

printer.print();
printer.scan();
printer.fax();
```

**다중 구현 구조**

```text
   Printable      Scannable      Faxable
       │              │             │
       └──────────────┼─────────────┘
                      │
                  implements
                      │
                      ▼
           MultiFunctionPrinter
           ┌───────────────────┐
           │ print()           │
           │ scan()            │
           │ fax()             │
           └───────────────────┘
```

**핵심**

- 하나의 클래스가 여러 인터페이스의 규약을 구현한다.
- 구현하는 각 인터페이스의 필요한 추상 메서드를 모두 구현해야 한다.
- 같은 객체를 여러 인터페이스 타입으로 참조할 수 있다.
- 클래스의 다중 상속과 인터페이스의 다중 구현은 서로 다른 개념이다.

### 10. 인터페이스의 상속(extends)

인터페이스는 다른 인터페이스를 상속하여 기능 규약을 확장할 수 있다.

**인터페이스 상속**

```java
interface Animal {
    void eat();
}

interface Flyable extends Animal {
    void fly();
}
```

**구현 클래스**

```java
class Bird implements Flyable {

    @Override
    public void eat() {
        System.out.println("먹이를 먹습니다.");
    }

    @Override
    public void fly() {
        System.out.println("날아갑니다.");
    }
}
```

**구조**

```text
       Animal
       eat()
         │
       extends
         │
         ▼
       Flyable
       fly()
         │
      implements
         │
         ▼
        Bird
     ┌────────┐
     │ eat()  │
     │ fly()  │
     └────────┘
```

**여러 인터페이스 상속**

```java
interface A {
    void methodA();
}

interface B {
    void methodB();
}

interface C extends A, B {
    void methodC();
}
```

- 인터페이스는 여러 인터페이스를 동시에 상속할 수 있다.
- 상속받은 추상 메서드도 구현 클래스에서 구현해야 한다.
- 인터페이스 사이의 상속에는 `extends`를 사용한다.
- 클래스가 인터페이스를 구현할 때는 `implements`를 사용한다.

### 11. 인터페이스와 다형성(Polymorphism)

다형성은 하나의 공통 타입으로 다양한 구현 객체를 참조하고 사용할 수 있는 특성이다.

**공통 인터페이스**

```java
interface Payment {
    void pay(int amount);
}
```

**카드 결제**

```java
class CardPayment implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println("카드 결제: " + amount);
    }
}
```

**간편 결제**

```java
class KakaoPayment implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println("카카오페이 결제: " + amount);
    }
}
```

**다형성 사용**

```java
Payment payment = new CardPayment();

payment.pay(10000);

payment = new KakaoPayment();

payment.pay(20000);
```

**실행 결과**

```text
카드 결제: 10000
카카오페이 결제: 20000
```

**다형성의 동작 구조**

```text
         Payment 타입
              │
              │ pay() 호출
              ▼
        실제 객체 확인
              │
       ┌──────┴──────┐
       │             │
       ▼             ▼
  CardPayment   KakaoPayment
       │             │
       ▼             ▼
    카드 결제      간편 결제
```

**핵심 원리**

- `Payment`는 공통 인터페이스 타입이다.
- 실제 객체는 `CardPayment` 또는 `KakaoPayment`이다.
- 동일한 `pay()` 호출이 서로 다른 구현을 실행한다.
- 인터페이스를 이용하면 구현체가 달라도 공통된 방식으로 처리할 수 있다.

### 12. 자동 타입 변환과 강제 타입 변환

인터페이스 구현 객체는 자신이 구현한 인터페이스 타입으로 자동 변환될 수 있다.

**자동 타입 변환(Upcasting)**

```java
CardPayment card = new CardPayment();

Payment payment = card;
```

- 구현 객체를 인터페이스 타입으로 참조할 수 있다.
- 별도의 형변환 연산자가 필요하지 않다.
- 인터페이스에서 사용 가능한 멤버를 기준으로 접근한다.

**강제 타입 변환(Downcasting)**

```java
Payment payment = new CardPayment();

CardPayment card = (CardPayment) payment;
```

**instanceof를 이용한 확인**

```java
if (payment instanceof CardPayment card) {
    card.pay(10000);
}
```

**주의사항**

- 인터페이스 타입에는 구현 클래스의 모든 고유 메서드가 노출되는 것이 아니다.
- 실제 객체와 호환되지 않는 타입으로 강제 변환하면 `ClassCastException`이 발생한다.
- `instanceof`를 사용하여 타입 호환성을 확인할 수 있다.

### 13. 강한 결합과 느슨한 결합

결합도(Coupling)는 클래스나 모듈이 다른 클래스나 모듈에 얼마나 의존하는지를 나타낸다.

**강한 결합(Tight Coupling)**

특정 구현 클래스에 직접 의존하는 구조이다.

```java
class OrderService {

    private final CardPayment payment =
        new CardPayment();

    public void checkout(int amount) {
        payment.pay(amount);
    }
}
```

**문제점**

- `OrderService`가 `CardPayment` 구현에 직접 의존한다.
- 다른 결제 방식으로 변경할 때 서비스 코드를 수정해야 할 수 있다.
- 테스트에서 실제 구현을 대체하기 어려울 수 있다.

**느슨한 결합(Loose Coupling)**

구체적인 구현이 아닌 공통 인터페이스에 의존하는 구조이다.

```java
class OrderService {

    private final Payment payment;

    public OrderService(Payment payment) {
        this.payment = payment;
    }

    public void checkout(int amount) {
        payment.pay(amount);
    }
}
```

**구조 비교**

```text
[강한 결합]

OrderService
      │
      │ 직접 의존
      ▼
CardPayment


[느슨한 결합]

OrderService
      │
      ▼
 Payment 인터페이스
      │
  ┌───┴──────────┐
  │              │
  ▼              ▼
CardPayment   KakaoPayment
```

**비교**

| 구분 | 강한 결합 | 느슨한 결합 |
|---|---|---|
| 의존 대상 | 구체적인 구현 클래스 | 공통 인터페이스 |
| 구현체 교체 | 기존 코드 수정 가능성 높음 | 비교적 용이 |
| 확장성 | 구현에 강하게 영향받음 | 새로운 구현 추가에 유리 |
| 테스트 | 실제 구현과 분리하기 어려울 수 있음 | Mock 구현으로 대체 가능 |
| 유지보수 | 변경 영향이 커질 수 있음 | 변경 영향을 줄이기 쉬움 |

**핵심 : 인터페이스를 활용하면 구체적인 구현에 대한 의존성을 줄이고 변경에 유연한 구조를 설계할 수 있다.**

### 14. 의존성 주입(Dependency Injection)

의존성 주입(DI)은 클래스가 필요한 객체를 직접 생성하지 않고 외부에서 전달받도록 구성하는 방식이다.

**의존성 주입의 주요 목적**

- 클래스 간 직접적인 결합도 감소
- 객체 생성과 사용의 책임 분리
- 구현체 교체 용이
- 테스트 코드 작성 용이

**생성자 주입(Constructor Injection)**

```java
class OrderService {

    private final Payment payment;

    public OrderService(Payment payment) {
        this.payment = payment;
    }

    public void checkout(int amount) {
        payment.pay(amount);
    }
}
```

**실제 구현 객체 주입**

```java
Payment cardPayment = new CardPayment();

OrderService orderService =
    new OrderService(cardPayment);

orderService.checkout(10000);
```

**다른 구현체 주입**

```java
OrderService orderService =
    new OrderService(new KakaoPayment());

orderService.checkout(20000);
```

**의존성 주입 구조**

```text
         외부 조립 코드
               │
       구현 객체 선택 및 생성
               │
               ▼
       CardPayment 객체
               │
               │ 생성자로 전달
               ▼
         OrderService
               │
               ▼
        Payment 인터페이스
               │
               ▼
           pay() 호출
```

**핵심**

- `OrderService`는 `Payment` 인터페이스에 의존한다.
- 실제 구현 객체는 외부에서 전달받는다.
- 구현체를 교체해도 `OrderService`의 핵심 로직을 변경하지 않아도 된다.
- Spring에서는 컨테이너가 객체 생성과 의존성 주입을 지원한다.

**주의 : 인터페이스를 사용한다고 자동으로 의존성 주입이 적용되는 것은 아니다. 의존 객체를 외부에서 전달하도록 설계해야 한다.**

### 15. 인터페이스와 테스트(Mock Object)

Mock 객체는 테스트에서 실제 의존 객체를 대신하도록 만든 테스트용 객체이다.

**Mock 객체를 사용하는 이유**

- 실제 결제나 외부 API 호출 없이 테스트할 수 있다.
- 데이터베이스나 네트워크 연결 없이 특정 로직을 검증할 수 있다.
- 테스트에서 원하는 결과를 제어하기 쉽다.
- 외부 환경에 따른 테스트 결과의 변동을 줄일 수 있다.

**테스트용 구현 클래스**

```java
class MockPayment implements Payment {

    private boolean called = false;

    @Override
    public void pay(int amount) {
        called = true;
        System.out.println("테스트 결제: " + amount);
    }

    public boolean isCalled() {
        return called;
    }
}
```

**테스트 예제**

```java
MockPayment mock = new MockPayment();

OrderService service = new OrderService(mock);

service.checkout(10000);

System.out.println(mock.isCalled()); // true
```

**실제 구현과 테스트 구현**

```text
          OrderService
                │
                ▼
         Payment 인터페이스
                │
         ┌──────┴───────┐
         │              │
         ▼              ▼
   RealPayment      MockPayment
         │              │
         ▼              ▼
   실제 결제 처리    테스트 동작 기록
```

**핵심**

- 테스트용 구현체도 동일한 인터페이스를 구현한다.
- 서비스는 실제 구현과 테스트 구현을 구분할 필요가 없다.
- 인터페이스와 DI를 함께 사용하면 테스트 대상을 독립적으로 검증하기 쉬워진다.

※ 예제의 `MockPayment`는 직접 작성한 테스트 대역이며, Mockito 등의 라이브러리에서 제공하는 Mock 객체와는 구현 방식이 다를 수 있다.

### 16. 추상 클래스와 인터페이스 비교

추상 클래스와 인터페이스는 모두 추상화와 다형성을 지원하지만 설계 목적이 다르다.

| 구분 | 추상 클래스 | 인터페이스 |
|---|---|---|
| 선언 | `abstract class` | `interface` |
| 주요 목적 | 공통 상태와 구현 공유 | 기능의 규칙과 계약 정의 |
| 클래스 관계 | `extends` | `implements` |
| 인스턴스 필드 | 선언 가능 | 선언 불가 |
| 생성자 | 선언 가능 | 선언 불가 |
| 일반 메서드 | 선언 가능 | default/static/private 등 |
| 추상 메서드 | 선언 가능 | 선언 가능 |
| 다중 관계 | 단일 클래스 상속 | 여러 인터페이스 구현 |
| 직접 객체 생성 | 불가능 | 불가능 |

**추상 클래스가 적합한 경우**

- 여러 클래스가 공통 상태를 공유해야 한다.
- 공통 구현을 부모 클래스에서 제공해야 한다.
- 명확한 IS-A 관계가 존재한다.
- 공통 작업 과정 중 일부 단계만 자식 클래스에서 구현한다.

**인터페이스가 적합한 경우**

- 기능의 공통 규약이 필요하다.
- 서로 다른 구현체를 동일한 방식으로 사용해야 한다.
- 구현체를 유연하게 교체하고 싶다.
- 다중 구현을 통해 여러 역할을 조합해야 한다.

**선택 기준**

```text
       새로운 타입 설계
              │
              ▼
     공통 상태와 구현을
       공유해야 하는가?
          │        │
         Yes       No
          │        │
          ▼        ▼
       추상 클래스  기능의 공통 규약이
                   필요한가?
                       │
                       ▼
                   인터페이스
```

**주의 : 인터페이스와 추상 클래스는 서로 배타적인 구조가 아니므로 하나의 설계에서 함께 사용할 수 있다.**

### 17. 인터페이스를 활용한 Spring Boot 구조

Spring Boot에서 인터페이스는 비즈니스 로직과 데이터 접근의 역할을 분리하는 데 활용할 수 있다.

**대표적인 프로그램 구조**

```text
          HTTP Request
                │
                ▼
          Controller
                │
                ▼
       Service 인터페이스
                │
                ▼
          ServiceImpl
        (비즈니스 로직)
                │
                ▼
      Repository 인터페이스
                │
                ▼
       데이터 접근 구현
                │
                ▼
            Database
```

**서비스 인터페이스**

```java
public interface MemberService {

    String findMember(Long id);
}
```

**서비스 구현 클래스**

```java
@Service
public class MemberServiceImpl implements MemberService {

    @Override
    public String findMember(Long id) {
        return "Member ID: " + id;
    }
}
```

**Controller에서 사용**

```java
@RestController
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/{id}")
    public String findMember(@PathVariable Long id) {
        return memberService.findMember(id);
    }
}
```

**구조의 특징**

- `MemberService` : 비즈니스 기능의 규약 정의
- `MemberServiceImpl` : 비즈니스 기능 구현
- `MemberController` : HTTP 요청 처리
- 생성자 주입 : 필요한 서비스 객체를 외부에서 전달받음

**핵심**

- Controller는 구현 클래스보다 Service 인터페이스에 의존할 수 있다.
- 구현을 교체해도 Controller의 변경을 줄일 수 있다.
- Spring 컨테이너가 Bean을 생성하고 필요한 의존 객체를 주입할 수 있다.
- 인터페이스를 통해 역할과 구현을 분리하면 테스트와 유지보수에 도움이 된다.

※ 위 코드는 Spring Boot 의존성과 import가 필요한 구조 설명용 예제이다. 모든 서비스에 반드시 별도의 인터페이스와 구현 클래스를 만들어야 하는 것은 아니다.

### 18. 중첩 클래스와 익명 객체 복습

강의자료에서는 인터페이스와 함께 중첩 클래스 및 익명 객체의 특징도 복습한다.

**중첩 클래스(Nested Class)**

| 종류 | 특징 |
|---|---|
| 인스턴스 멤버 클래스 | 외부 객체와 연결 |
| 정적 중첩 클래스 | 외부 객체 없이 사용 가능 |
| 지역 클래스 | 메서드 또는 블록 내부 선언 |
| 익명 클래스 | 이름 없는 클래스를 선언하며 객체 생성 |

**인스턴스 멤버 클래스**

```java
class Outer {

    private int number = 10;

    class Inner {

        void print() {
            System.out.println(number);
        }
    }
}
```

**객체 생성**

```java
Outer outer = new Outer();

Outer.Inner inner = outer.new Inner();

inner.print(); // 10
```

**정적 중첩 클래스**

```java
class Outer {

    static class Nested {

        void print() {
            System.out.println("정적 중첩 클래스");
        }
    }
}
```

**객체 생성**

```java
Outer.Nested nested = new Outer.Nested();

nested.print();
```

**인터페이스의 익명 구현 객체**

```java
Animal animal = new Animal() {

    @Override
    public void sound() {
        System.out.println("익명 객체의 동작");
    }
};

animal.sound();
```

**주의사항**

- 인터페이스 자체는 인스턴스화할 수 없지만, 익명 구현 클래스를 정의하면서 객체를 생성하는 것은 가능하다.
- 정적 중첩 클래스는 외부 객체 없이 생성할 수 있다.
- 지역 클래스에서 캡처하는 지역 변수는 `final` 또는 사실상 final이어야 한다.

### 19. 예외(Exception)와 오류(Error)

예외는 프로그램 실행 과정에서 발생하는 비정상적인 상황을 객체로 표현한 것이다.

**Java 예외 계층 구조**

```text
             Throwable
                 │
        ┌────────┴────────┐
        │                 │
        ▼                 ▼
      Error           Exception
                          │
                  ┌───────┴────────┐
                  │                │
                  ▼                ▼
          Checked Exception  RuntimeException
                                   │
                                   ▼
                           Unchecked Exception
```

**Exception과 Error 비교**

| 구분 | Exception | Error |
|---|---|---|
| 의미 | 프로그램 실행 중 발생하는 예외 상황 | 심각한 시스템·JVM 수준 문제 등 |
| 처리 | 상황에 따라 적절하게 처리·복구 | 일반적으로 애플리케이션에서 복구하기 어려움 |
| 예시 | IOException, SQLException | OutOfMemoryError, StackOverflowError |

**대표적인 예외**

| 예외 | 발생 상황 |
|---|---|
| `ArithmeticException` | 0으로 정수 나눗셈 |
| `NullPointerException` | null 참조의 부적절한 사용 |
| `NumberFormatException` | 잘못된 문자열 숫자 변환 |
| `ArrayIndexOutOfBoundsException` | 배열 인덱스 범위 초과 |
| `IOException` | 입출력 처리 중 오류 |
| `SQLException` | 데이터베이스 관련 오류 |

**주의 : Exception과 Error는 모두 Throwable의 하위 타입이지만 일반적인 프로그램에서는 Error를 직접 처리하기보다 발생 원인을 해결하는 것이 중요하다.**

### 20. Checked Exception과 Unchecked Exception

Java 예외는 컴파일러가 예외 처리를 요구하는지에 따라 구분할 수 있다.

| 구분 | Checked Exception | Unchecked Exception |
|---|---|---|
| 컴파일러의 처리 요구 | 있음 | 없음 |
| 대표 계층 | RuntimeException을 제외한 Exception 하위 타입 | RuntimeException 및 Error 하위 타입 |
| 대표 예시 | IOException, SQLException | NullPointerException, ArithmeticException |
| 처리 방식 | catch 또는 throws 필요 | 선택적으로 처리 |

**Checked Exception 예제**

```java
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try (FileReader reader =
                 new FileReader("test.txt")) {

            System.out.println(reader.read());

        } catch (IOException e) {
            System.out.println("파일 처리 실패");
        }
    }
}
```

**Unchecked Exception 예제**

```java
int number = Integer.parseInt("abc");
```

위 코드는 실행 시 `NumberFormatException`이 발생한다.

- Checked Exception은 컴파일러가 처리 또는 전파 선언을 요구한다.
- Unchecked Exception은 컴파일러가 처리를 강제하지 않는다.
- 예외가 발생하지 않도록 입력값과 프로그램 상태를 검증하는 것도 중요하다.

### 21. try-catch-finally 예외 처리

`try-catch-finally`는 예외 발생 가능성이 있는 코드를 실행하고, 예외 처리 및 정리 작업을 수행하는 구문이다.

**기본 구조**

```java
try {
    // 예외가 발생할 수 있는 코드
} catch (Exception e) {
    // 예외 처리
} finally {
    // 정리 작업
}
```

**각 블록의 역할**

| 블록 | 역할 |
|---|---|
| try | 예외가 발생할 수 있는 코드 실행 |
| catch | 일치하는 예외를 처리 |
| finally | 일반적으로 예외 발생 여부와 관계없이 실행되는 정리 작업 |

**Java 예제**

```java
try {
    int result = 10 / 0;

    System.out.println(result);

} catch (ArithmeticException e) {
    System.out.println("0으로 나눌 수 없습니다.");

} finally {
    System.out.println("작업 종료");
}
```

**실행 결과**

```text
0으로 나눌 수 없습니다.
작업 종료
```

**실행 흐름**

```text
          try 실행
             │
             ▼
       예외 발생 여부
          │      │
         정상    예외 발생
          │      │
          │      ▼
          │   catch 검사
          │      │
          │      ▼
          │   일치하는 예외 처리
          │      │
          └──┬───┘
             │
             ▼
       finally 실행
             │
             ▼
       이후 코드 진행
```

**주의사항**

- 예외가 발생하면 해당 지점 이후의 try 블록 코드는 실행되지 않는다.
- 일치하는 catch가 없으면 예외가 상위 호출자에게 전파될 수 있다.
- finally는 일반적으로 실행되지만 JVM이 강제 종료되는 등의 상황에서는 보장되지 않는다.
- 예외를 무조건 무시하는 빈 catch 블록은 피하는 것이 좋다.

### 22. 다중 catch와 멀티 catch

하나의 `try` 블록에서 여러 종류의 예외가 발생할 수 있다.

**다중 catch**

```java
try {
    int number = Integer.parseInt("abc");

    int result = 100 / number;

    System.out.println(result);

} catch (NumberFormatException e) {
    System.out.println("숫자 변환 오류");

} catch (ArithmeticException e) {
    System.out.println("산술 연산 오류");
}
```

**멀티 catch**

```java
try {
    int number = Integer.parseInt("abc");

    System.out.println(100 / number);

} catch (NumberFormatException | ArithmeticException e) {
    System.out.println("숫자 처리 오류");
}
```

**다중 catch와 멀티 catch 비교**

| 구분 | 특징 |
|---|---|
| 다중 catch | 예외 종류별로 다른 처리 가능 |
| 멀티 catch | 여러 예외를 하나의 catch에서 공통 처리 |
| catch 순서 | 구체적인 예외를 상위 예외보다 먼저 작성 |

**잘못된 catch 순서**

```java
// 컴파일 오류 예시

// try {
//     ...
// } catch (Exception e) {
//     ...
// } catch (NumberFormatException e) {
//     ...
// }
```

- `Exception`을 먼저 처리하면 뒤의 `NumberFormatException` catch에 도달할 수 없다.
- 자식 예외를 먼저 처리하고 부모 예외를 나중에 처리해야 한다.
- 멀티 catch에서는 서로 상속 관계에 있는 예외 타입을 함께 선언할 수 없다.

### 23. throw와 throws

`throw`와 `throws`는 모두 예외와 관련된 문법이지만 역할이 다르다.

| 구분 | throw | throws |
|---|---|---|
| 역할 | 예외를 직접 발생시킴 | 메서드에서 전파할 예외 선언 |
| 위치 | 메서드 구현부 등 | 메서드 선언부 |
| 사용 형태 | `throw new Exception()` | `throws Exception` |

**throw 예제**

```java
public static void validateAge(int age) {

    if (age < 0) {
        throw new IllegalArgumentException(
            "나이는 음수일 수 없습니다."
        );
    }
}
```

**throws 예제**

```java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public static String readFile(String path)
        throws IOException {

    return Files.readString(Path.of(path));
}
```

**호출 측 처리**

```java
try {
    String text = readFile("test.txt");

    System.out.println(text);

} catch (IOException e) {
    System.out.println("파일 읽기 실패");
}
```

**예외 전파 구조**

```text
          main()
             │
             ▼
         readFile()
             │
             ▼
       IOException 발생
             │
             ▼
       호출한 곳으로 전파
             │
             ▼
        main()의 catch
             │
             ▼
          예외 처리
```

**핵심**

- `throw`는 예외 객체를 발생시킨다.
- `throws`는 메서드가 예외를 호출자에게 전파할 수 있음을 선언한다.
- Checked Exception은 적절한 처리나 전파 선언이 필요하다.
- Unchecked Exception에도 `throws`를 작성할 수 있지만 필수는 아니다.

### 24. try-with-resources와 자원 관리

`try-with-resources`는 작업이 종료될 때 자원을 자동으로 닫기 위한 구문이다.

**사용 목적**

- 파일 및 데이터베이스 자원 관리
- 예외 발생 시에도 자원 정리
- 자원 해제 코드 중복 감소
- 자원 누수(Resource Leak) 방지

**Java 예제**

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader reader =
                 new BufferedReader(
                     new FileReader("test.txt"))) {

            System.out.println(reader.readLine());

        } catch (IOException e) {
            System.out.println("파일 읽기 실패");
        }
    }
}
```

**동작 과정**

```text
       자원 생성
           │
           ▼
        try 실행
           │
           ▼
      파일 읽기 작업
           │
           ▼
    정상 종료 또는 예외
           │
           ▼
       close() 호출
           │
           ▼
       자원 정리
```

**주요 특징**

- `AutoCloseable`을 구현한 객체를 사용할 수 있다.
- try 블록을 벗어날 때 자원을 닫도록 처리한다.
- 여러 자원을 선언한 경우 생성한 역순으로 닫는다.
- 자원 종료 과정에서도 예외가 발생할 수 있다.

**주의 : GC가 메모리를 회수한다고 파일이나 네트워크 연결 같은 외부 자원이 적절한 시점에 자동 정리되는 것은 아니므로, 명시적인 자원 관리가 필요하다.**

### 25. 사용자 정의 예외(Custom Exception)

사용자 정의 예외는 프로그램의 특정 업무 상황을 명확하게 표현하기 위해 직접 작성하는 예외 클래스이다.

**사용자 정의 예외를 사용하는 이유**

- 오류의 의미를 명확하게 표현한다.
- 상황에 맞는 예외를 구분할 수 있다.
- 공통적인 예외 처리 정책을 구성할 수 있다.
- 호출한 곳에서 오류 종류에 따라 다르게 대응할 수 있다.

**사용자 정의 예외 클래스**

```java
class StockException extends RuntimeException {

    public StockException(String message) {
        super(message);
    }
}
```

**예외 발생**

```java
class Product {

    private int stock = 10;

    public void purchase(int quantity) {

        if (quantity <= 0) {
            throw new IllegalArgumentException(
                "구매 수량은 1 이상이어야 합니다."
            );
        }

        if (quantity > stock) {
            throw new StockException(
                "재고가 부족합니다."
            );
        }

        stock -= quantity;
    }
}
```

**예외 처리**

```java
Product product = new Product();

try {
    product.purchase(20);

} catch (StockException e) {
    System.out.println(e.getMessage());
}
```

**실행 결과**

```text
재고가 부족합니다.
```

**핵심**

- `RuntimeException`을 상속하면 Unchecked Exception이 된다.
- `Exception`을 직접 상속하면 일반적으로 Checked Exception이 된다.
- 예외 클래스 이름은 발생한 상황을 표현하도록 작성하는 것이 좋다.
- 단순한 조건문으로 충분한 상황에 불필요하게 예외 클래스를 만드는 것은 피한다.

### 26. 인터페이스의 실무 활용 분야

인터페이스는 다양한 구현체를 하나의 공통 규약으로 처리해야 하는 시스템에서 활용된다.

| 활용 분야 | 공통 인터페이스 | 구현체 예시 |
|---|---|---|
| 결제 | Payment | Card, Kakao, Bank |
| 로그인 | Authentication | Google, Kakao, Apple |
| 데이터베이스 | Repository | DB별 데이터 접근 구현 |
| 파일 저장 | Storage | Local, AWS S3, Azure |
| 알림 | Notification | Email, SMS, Push |
| 외부 API | AIClient | OpenAI, Claude, Gemini |

**공통 구조**

```text
           비즈니스 로직
                 │
                 ▼
          공통 인터페이스
                 │
       ┌─────────┼─────────┐
       │         │         │
       ▼         ▼         ▼
     구현 A    구현 B    구현 C
```

**실무에서 얻는 장점**

- 인터페이스를 기준으로 역할을 명확하게 정의한다.
- 새로운 구현체를 추가할 때 변경 범위를 줄일 수 있다.
- 실제 외부 서비스 대신 테스트용 구현체를 주입할 수 있다.
- 여러 개발자가 공통 규약을 바탕으로 기능을 나누어 개발할 수 있다.

※ 모든 외부 서비스가 반드시 동일한 규약을 제공하는 것은 아니므로, 필요한 차이를 추상화하고 적절하게 구현해야 한다.

### 27. 인터페이스 설계 시 주의사항

**1. 추상 메서드 구현 누락**

- 구체 클래스는 필요한 추상 메서드를 모두 구현해야 한다.
- 구현하지 않으면 컴파일 오류가 발생한다.
- 추상 클래스로 선언하는 경우에는 구현을 하위 클래스에 위임할 수 있다.

**2. 접근 제한자 축소**

```java
interface Animal {
    void sound();
}
```

```java
// 잘못된 구현

// class Dog implements Animal {
//     void sound() { }
// }
```

- 인터페이스 추상 메서드는 기본적으로 public이다.
- 구현 시 접근 범위를 좁힐 수 없다.

**3. default 메서드 충돌**

두 인터페이스가 같은 시그니처의 default 메서드를 제공하면 구현 클래스에서 충돌을 해결해야 한다.

```java
interface A {

    default void hello() {
        System.out.println("A");
    }
}

interface B {

    default void hello() {
        System.out.println("B");
    }
}
```

**충돌 해결**

```java
class C implements A, B {

    @Override
    public void hello() {
        A.super.hello();
    }
}
```

**4. 인터페이스 다중 상속과 클래스 다중 상속의 혼동**

- 클래스는 하나의 직접적인 부모 클래스만 상속할 수 있다.
- 인터페이스는 여러 인터페이스를 동시에 상속할 수 있다.
- 클래스는 여러 인터페이스를 동시에 구현할 수 있다.

**5. 인터페이스를 불필요하게 생성하는 문제**

- 모든 클래스에 별도 인터페이스가 필요한 것은 아니다.
- 실제로 역할 분리나 구현체 교체가 필요한지 검토해야 한다.
- 추상화가 지나치면 구조를 이해하고 유지보수하기 어려워질 수 있다.

### 28. 자주 발생하는 오류 및 주의사항

| 주의사항 | 원인 및 해결 방법 |
|---|---|
| 인터페이스 직접 객체 생성 | 구현 객체를 생성해야 함 |
| 추상 메서드 미구현 | 구체 클래스에서 구현하거나 abstract 사용 |
| public 누락 | 인터페이스 추상 메서드는 public으로 구현 |
| 인터페이스 필드 수정 | public static final 상수이므로 재대입 불가 |
| default 메서드 충돌 | 구현 클래스에서 명시적으로 재정의 |
| static 메서드 호출 | 인터페이스 이름으로 호출 |
| private 메서드 접근 | 인터페이스 내부에서만 사용 가능 |
| 클래스 다중 상속 | 여러 클래스를 동시에 상속할 수 없음 |
| 인터페이스 다중 구현 | implements로 여러 인터페이스 구현 가능 |
| 잘못된 강제 타입 변환 | instanceof로 호환성 확인 |
| 인터페이스와 DI 혼동 | 기능 계약과 객체 주입 방식은 다른 개념 |
| 강한 결합 | 구현체가 아닌 인터페이스에 의존하는 설계 검토 |
| Mock 객체 사용 | 실제 구현 없이 테스트할 수 있도록 구성 |
| Checked Exception 누락 | catch 또는 throws로 처리 |
| catch 순서 오류 | 자식 예외를 부모 예외보다 먼저 처리 |
| throw와 throws 혼동 | 예외 발생과 전파 선언 구분 |
| 예외 무시 | 적절한 처리, 기록 또는 전파 필요 |
| 자원 해제 누락 | try-with-resources 활용 |
| 사용자 정의 예외 남용 | 명확한 업무 오류가 필요한지 검토 |

### ✅ Day17 핵심 정리

| 구분 | 핵심 내용 |
|---|---|
| Interface | 기능의 규약과 계약 정의 |
| implements | 클래스에서 인터페이스 구현 |
| extends | 인터페이스 간 상속 |
| Abstract Method | 구현 클래스에서 제공할 기능 선언 |
| Interface Field | public static final 상수 |
| default Method | 기본 구현을 제공하는 인스턴스 메서드 |
| static Method | 인터페이스 이름으로 호출하는 정적 메서드 |
| private Method | 인터페이스 내부 공통 구현 |
| Multiple Implementation | 여러 인터페이스 동시 구현 |
| Multiple Inheritance | 인터페이스 간 다중 상속 |
| Polymorphism | 공통 타입으로 여러 구현 객체 사용 |
| Upcasting | 인터페이스 타입으로 구현 객체 참조 |
| Downcasting | 실제 구현 타입으로 참조 변환 |
| instanceof | 실제 객체의 타입 호환성 검사 |
| Abstract Class | 공통 상태와 구현을 제공하는 추상 클래스 |
| Tight Coupling | 구체적인 구현에 강하게 의존 |
| Loose Coupling | 추상화에 의존하여 변경 영향 감소 |
| Dependency Injection | 의존 객체를 외부에서 전달받는 구조 |
| Mock Object | 테스트에 사용하는 대체 구현 객체 |
| Nested Class | 클래스 내부에 선언된 클래스 |
| Anonymous Class | 이름 없는 클래스를 통한 객체 생성 |
| Throwable | Java 예외 및 오류의 최상위 타입 |
| Exception | 프로그램에서 발생하는 예외 |
| Error | 일반적으로 복구하기 어려운 심각한 오류 |
| Checked Exception | 컴파일러가 처리 또는 전파를 요구 |
| Unchecked Exception | 컴파일러가 처리를 강제하지 않음 |
| try-catch | 예외 감시 및 처리 |
| finally | 일반적인 정리 작업 |
| Multi-catch | 여러 예외의 공통 처리 |
| throw | 예외 객체 발생 |
| throws | 예외 전파 선언 |
| try-with-resources | AutoCloseable 자원 자동 정리 |
| Custom Exception | 프로그램의 업무 규칙을 표현하는 예외 |

**최종 학습 정리**

- 인터페이스는 클래스가 제공해야 하는 기능의 규약과 계약을 정의한다.
- 구현 클래스는 `implements`를 사용하여 인터페이스를 구현한다.
- 인터페이스는 직접 객체를 생성할 수 없지만 구현 객체를 참조하는 타입으로 사용할 수 있다.
- 인터페이스의 필드는 자동으로 `public static final` 상수이다.
- 인터페이스의 추상 메서드는 기본적으로 `public abstract`이다.
- `default` 메서드는 기본 동작을 제공하고 `static` 메서드는 인터페이스 이름으로 호출한다.
- `private` 메서드는 인터페이스 내부에서 구현 코드를 재사용하기 위해 사용한다.
- Java는 클래스의 다중 상속을 지원하지 않지만 인터페이스의 다중 구현과 다중 상속을 지원한다.
- 다형성을 이용하면 하나의 인터페이스 타입으로 서로 다른 구현 객체를 처리할 수 있다.
- 참조 변수의 선언 타입은 접근 가능한 멤버를 결정하고 실제 객체 타입은 재정의된 인스턴스 메서드의 실행 구현을 결정한다.
- 추상 클래스는 공통 상태와 구현을 공유하고, 인터페이스는 기능의 규칙을 정의하는 데 적합하다.
- 인터페이스에 의존하면 구체적인 구현체에 대한 결합도를 줄일 수 있다.
- 의존성 주입은 필요한 구현 객체를 외부에서 전달받아 사용하는 방식이다.
- Mock 객체를 이용하면 외부 서비스에 실제로 접근하지 않고도 프로그램을 테스트할 수 있다.
- 예외는 프로그램 실행 중 발생하는 비정상적인 상황을 표현하며 Checked와 Unchecked로 구분할 수 있다.
- `try-catch-finally`는 예외 처리와 정리 작업에 사용한다.
- `throw`는 예외 발생, `throws`는 예외 전파 가능성을 선언한다.
- `try-with-resources`는 파일과 같은 외부 자원을 안전하게 관리하는 데 사용한다.
- 사용자 정의 예외를 이용하면 프로그램의 업무 상황에 맞는 오류를 명확하게 표현할 수 있다.
- 인터페이스 설계의 핵심은 무조건 인터페이스를 많이 만드는 것이 아니라 역할을 명확하게 분리하고 변경에 유연한 구조를 구성하는 것이다.

</details>


## Day18. Java 예외 처리 및 실무 활용
<details>

### 🎯 학습 목표
- 예외 처리(Exception Handling)의 목적과 필요성을 이해한다.
- `Exception`과 `Error`의 차이 및 예외 클래스 계층을 이해한다.
- Checked Exception과 Unchecked Exception의 차이를 구분한다.
- `try-catch-finally`의 구조와 실행 흐름을 이해한다.
- 예외 객체에서 메시지와 Stack Trace를 확인하는 방법을 익힌다.
- 다중 catch와 멀티 catch의 차이 및 작성 규칙을 이해한다.
- 메서드 호출 과정에서 예외가 전파되는 원리를 이해한다.
- `throw`와 `throws`의 역할을 구분한다.
- `try-with-resources`와 `AutoCloseable`을 이용한 자원 관리를 이해한다.
- 사용자 정의 예외(Custom Exception)를 직접 작성할 수 있다.
- 예외를 이용해 비즈니스 규칙 위반을 표현할 수 있다.
- 예외 처리 과정에서 피해야 할 안티 패턴을 이해한다.
- Spring Boot의 전역 예외 처리 구조를 이해한다.
- Java 기본 문법과 객체지향 개념이 예외 처리 및 웹 개발에 연결되는 구조를 정리한다.

### 1. 예외 처리(Exception Handling)의 개념

예외 처리란 프로그램 실행 중 발생한 비정상적인 상황을 감지하고 적절하게 대응하여 프로그램의 실행 흐름을 관리하는 기능이다.

**예외 처리가 필요한 이유**

- 예상하지 못한 문제로 인한 프로그램의 비정상 종료 방지
- 발생한 오류의 원인 파악
- 사용자에게 적절한 오류 정보 전달
- 정상적인 프로그램 흐름의 유지 또는 안전한 종료
- 파일, 데이터베이스 등 외부 자원의 안전한 관리

**예외 처리를 하지 않은 경우**

```java
public class Main {

    public static void main(String[] args) {

        int result = 10 / 0;

        System.out.println(result);
        System.out.println("프로그램 종료");
    }
}
```

**실행 결과**

```text
Exception in thread "main"
java.lang.ArithmeticException: / by zero
```

- 정수를 0으로 나누면 `ArithmeticException`이 발생한다.
- 발생한 예외를 처리하지 않으면 호출 스택을 따라 전파된다.
- 최종적으로 처리되지 않은 예외는 해당 스레드의 비정상 종료로 이어질 수 있다.
- 예외 발생 이후의 일반적인 실행 흐름은 계속되지 않는다.

**예외 처리 후**

```java
try {
    int result = 10 / 0;

    System.out.println(result);

} catch (ArithmeticException e) {
    System.out.println("0으로 나눌 수 없습니다.");
}

System.out.println("프로그램 종료");
```

**실행 결과**

```text
0으로 나눌 수 없습니다.
프로그램 종료
```

**핵심**

예외 처리는 모든 오류를 없애는 것이 아니라, 오류가 발생했을 때 적절하게 처리하거나 상위 호출자에게 전달하여 실행 흐름을 관리하는 것이다.

### 2. Java 예외 클래스의 계층 구조

Java의 예외와 오류는 `Throwable` 클래스를 최상위 타입으로 하는 계층 구조를 가진다.

**예외 클래스 구조**

```text
                   Object
                      │
                      ▼
                  Throwable
                      │
           ┌──────────┴──────────┐
           │                     │
           ▼                     ▼
         Error                Exception
           │                     │
           │             ┌───────┴────────┐
           │             │                │
           ▼             ▼                ▼
  OutOfMemoryError   IOException    RuntimeException
  StackOverflowError SQLException         │
                                          ├── NullPointerException
                                          ├── ArithmeticException
                                          ├── NumberFormatException
                                          └── IllegalArgumentException
```

**Throwable**

- Java에서 발생시키고 처리할 수 있는 예외 및 오류 객체의 최상위 클래스이다.
- 오류 메시지와 Stack Trace 등의 정보를 제공한다.
- `Exception`과 `Error`가 상속받는 공통 부모 클래스이다.

**Exception과 Error의 차이**

| 구분 | Exception | Error |
|---|---|---|
| 의미 | 프로그램 실행 중 발생하는 예외 상황 | JVM 또는 시스템 수준의 심각한 문제 등 |
| 대응 | 적절한 처리·복구·전파 가능 | 일반적으로 애플리케이션에서 복구하기 어려움 |
| 대표 클래스 | IOException, SQLException | OutOfMemoryError, StackOverflowError |
| 주요 목적 | 예상 가능한 실패 상황 관리 | 심각한 오류 상태 표현 |

**주의사항**

- `Error`도 `Throwable`의 하위 클래스이므로 문법적으로 처리할 수는 있다.
- 하지만 일반적인 프로그램에서는 `Error`를 이용한 복구에 의존하지 않는 것이 좋다.
- `Exception`이 발생한다고 모든 경우에 프로그램을 계속 실행해야 하는 것은 아니다.
- 복구할 수 없는 상황에서는 오류 정보를 남기고 적절하게 종료하거나 호출자에게 전파해야 한다.

### 3. Checked Exception과 Unchecked Exception

Java의 예외는 컴파일러가 예외 처리 여부를 검사하는지에 따라 구분한다.

**Checked Exception**

컴파일러가 예외의 처리 또는 전파 선언을 요구하는 예외이다.

**Unchecked Exception**

컴파일러가 예외의 처리 또는 전파 선언을 강제하지 않는 예외이다.

| 구분 | Checked Exception | Unchecked Exception |
|---|---|---|
| 컴파일러 검사 | 처리 또는 전파 선언 요구 | 강제하지 않음 |
| 대표 계층 | RuntimeException을 제외한 Exception 하위 타입 | RuntimeException 및 하위 타입 |
| 대표 예외 | IOException, SQLException | NullPointerException, ArithmeticException |
| 발생 상황 예시 | 파일 입출력, DB 작업 | 잘못된 인덱스, null 참조 |
| 처리 | catch 또는 throws 필요 | 필요에 따라 처리 |

※ `Error` 및 그 하위 타입 역시 컴파일러가 처리를 강제하지 않지만, 일반적인 예외 분류에서는 `RuntimeException` 계층을 Unchecked Exception의 대표 유형으로 설명한다.

**Checked Exception 예제**

```java
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try (FileReader reader =
                new FileReader("test.txt")) {

            System.out.println(reader.read());

        } catch (IOException e) {
            System.out.println("파일 처리 오류");
        }
    }
}
```

- 파일을 찾지 못하거나 읽는 과정에서 문제가 발생할 수 있다.
- `IOException`은 Checked Exception이다.
- 따라서 예외를 처리하거나 `throws`로 전파해야 한다.

**Unchecked Exception 예제**

```java
public class Main {

    public static void main(String[] args) {

        int number = Integer.parseInt("abc");
    }
}
```

**실행 결과**

```text
java.lang.NumberFormatException
```

- `"abc"`는 정수로 변환할 수 없는 문자열이다.
- `NumberFormatException`은 `RuntimeException`의 하위 클래스이다.
- 컴파일러는 예외 처리 코드를 강제하지 않는다.

**핵심**

- Checked Exception : 컴파일러가 예외 처리 또는 전파를 요구한다.
- Unchecked Exception : 컴파일러가 예외 처리를 강제하지 않는다.
- 실제 예외 처리 전략은 해당 문제를 복구할 수 있는지에 따라 결정해야 한다.

### 4. Java에서 자주 발생하는 예외

| 예외 클래스 | 발생 원인 |
|---|---|
| `NullPointerException` | null 참조를 잘못 사용 |
| `ArithmeticException` | 0으로 정수 나눗셈 등 |
| `NumberFormatException` | 숫자로 변환할 수 없는 문자열 |
| `ArrayIndexOutOfBoundsException` | 배열의 인덱스 범위를 초과 |
| `ClassCastException` | 호환되지 않는 참조 타입으로 강제 변환 |
| `IllegalArgumentException` | 메서드에 부적절한 인자 전달 |
| `IllegalStateException` | 현재 객체 상태에서 허용되지 않는 작업 |
| `IOException` | 파일이나 스트림 입출력 오류 |
| `SQLException` | 데이터베이스 관련 처리 오류 |

**NullPointerException**

```java
String text = null;

// 실행 시 NullPointerException
System.out.println(text.length());
```

**ArithmeticException**

```java
int result = 10 / 0;
```

**NumberFormatException**

```java
int number = Integer.parseInt("Java");
```

**ArrayIndexOutOfBoundsException**

```java
int[] numbers = {10, 20, 30};

// 인덱스 범위는 0~2
System.out.println(numbers[3]);
```

**핵심**

예외가 발생한 뒤 처리하는 것도 중요하지만, 입력값 검증과 올바른 프로그램 설계를 통해 불필요한 예외가 발생하지 않도록 예방하는 것이 더 중요할 수 있다.

### 5. try-catch의 기본 구조

`try-catch`는 예외가 발생할 가능성이 있는 코드를 실행하고, 발생한 예외를 적절하게 처리하는 구문이다.

**기본 문법**

```java
try {
    // 예외 발생 가능 코드

} catch (ExceptionType e) {
    // 예외 처리 코드
}
```

**Java 예제**

```java
public class Main {

    public static void main(String[] args) {

        try {
            int result = 10 / 0;

            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("산술 연산 오류");
        }

        System.out.println("다음 작업 실행");
    }
}
```

**실행 결과**

```text
산술 연산 오류
다음 작업 실행
```

**실행 흐름**

```text
          try 시작
              │
              ▼
       코드 실행 중 예외
              │
              ▼
         예외 객체 발생
              │
              ▼
       일치하는 catch 검색
              │
              ▼
         catch 블록 실행
              │
              ▼
       try-catch 이후 실행
```

**중요한 특징**

- 예외가 발생하면 해당 지점 이후의 `try` 블록 코드는 실행되지 않는다.
- 발생한 예외와 호환되는 `catch` 블록이 실행된다.
- 일치하는 `catch`가 없으면 예외가 상위 호출자로 전파된다.
- 예외가 발생하지 않으면 `catch` 블록은 실행되지 않는다.

**주의 : 예외를 처리했다고 해서 예외가 발생했던 명령으로 돌아가 다시 실행되는 것은 아니다.**

### 6. finally 블록과 실행 흐름

`finally`는 예외 처리 여부와 관계없이 일반적으로 실행되는 정리 작업용 블록이다.

**기본 구조**

```java
try {
    // 작업 수행

} catch (Exception e) {
    // 예외 처리

} finally {
    // 정리 작업
}
```

**Java 예제**

```java
public class Main {

    public static void main(String[] args) {

        try {
            System.out.println("1. 작업 시작");

            int result = 10 / 0;

        } catch (ArithmeticException e) {
            System.out.println("2. 예외 처리");

        } finally {
            System.out.println("3. 정리 작업");
        }

        System.out.println("4. 다음 작업");
    }
}
```

**실행 결과**

```text
1. 작업 시작
2. 예외 처리
3. 정리 작업
4. 다음 작업
```

**정상 실행과 예외 발생 비교**

| 상황 | try | catch | finally |
|---|---|---|---|
| 예외 없음 | 실행 | 실행 안 함 | 실행 |
| 일치하는 예외 발생 | 예외 지점까지 실행 | 실행 | 실행 |
| 처리되지 않은 예외 발생 | 예외 지점까지 실행 | 일치하는 catch 없음 | 일반적으로 실행 후 예외 전파 |
| try에서 return 실행 | 실행 | 상황에 따라 다름 | 반환 전에 일반적으로 실행 |

**주의사항**

- `finally`는 JVM 강제 종료 등 일부 상황에서는 실행이 보장되지 않는다.
- `finally` 내부에서 `return`을 사용하면 기존 반환값이나 예외가 가려질 수 있다.
- 파일이나 DB 연결과 같은 자원 정리에는 가능하면 `try-with-resources`를 사용한다.

### 7. 예외 객체의 주요 메서드

Java의 예외 객체는 발생한 문제의 메시지와 호출 경로를 확인할 수 있는 메서드를 제공한다.

| 메서드 | 기능 |
|---|---|
| `getMessage()` | 예외의 상세 메시지 반환 |
| `toString()` | 예외 타입과 메시지를 문자열로 표현 |
| `printStackTrace()` | 예외 발생 위치와 호출 경로 출력 |
| `getCause()` | 예외의 원인 객체 반환 |
| `getStackTrace()` | Stack Trace 요소 배열 반환 |

**Java 예제**

```java
public class Main {

    public static void main(String[] args) {

        try {
            int number = Integer.parseInt("abc");

        } catch (NumberFormatException e) {

            System.out.println(e.getMessage());
            System.out.println(e.toString());

            e.printStackTrace();
        }
    }
}
```

**메서드별 특징**

**getMessage()**

- 예외 생성 시 설정되었거나 예외 구현이 제공하는 상세 메시지를 반환한다.

**toString()**

- 예외 클래스 이름과 메시지를 확인할 수 있다.

**printStackTrace()**

- 예외가 발생한 위치와 메서드 호출 경로를 출력한다.
- 디버깅 시 문제의 원인을 추적하는 데 활용한다.
- 기본적으로 표준 오류 출력 스트림을 사용한다.

**핵심 : 예외가 발생하면 단순히 오류가 발생했다는 사실뿐 아니라 어디에서 어떤 원인으로 발생했는지 추적하는 것이 중요하다.**

### 8. 다중 catch(Multiple Catch)

하나의 `try` 블록에서 여러 종류의 예외가 발생할 수 있다.

다중 catch는 예외 종류에 따라 서로 다른 방식으로 처리할 때 사용한다.

**Java 예제**

```java
public class Main {

    public static void main(String[] args) {

        try {
            String input = "abc";

            int number = Integer.parseInt(input);
            int result = 100 / number;

            System.out.println(result);

        } catch (NumberFormatException e) {
            System.out.println("숫자 형식 오류");

        } catch (ArithmeticException e) {
            System.out.println("산술 연산 오류");

        } catch (Exception e) {
            System.out.println("기타 예외 발생");
        }
    }
}
```

**catch 검색 순서**

```text
       예외 발생
           │
           ▼
  NumberFormatException
           │
       일치 여부
           │
           ▼
   ArithmeticException
           │
       일치 여부
           │
           ▼
       Exception
           │
           ▼
       예외 처리
```

**주의사항**

- 여러 catch 중 발생한 예외와 일치하는 첫 번째 catch가 실행된다.
- 구체적인 자식 예외를 먼저 작성해야 한다.
- 더 포괄적인 부모 예외를 뒤쪽에 작성해야 한다.
- 앞의 catch 때문에 도달할 수 없는 catch가 있으면 컴파일 오류가 발생한다.

### 9. catch 블록의 작성 순서

Java의 예외는 상속 관계를 가지므로 catch 블록의 작성 순서가 중요하다.

**잘못된 예제**

```java
// 컴파일 오류

try {
    int number = Integer.parseInt("abc");

} catch (Exception e) {
    System.out.println("전체 예외");

} catch (NumberFormatException e) {
    System.out.println("숫자 오류");
}
```

**오류 원인**

- `NumberFormatException`은 `Exception`의 하위 타입이다.
- 첫 번째 `catch (Exception e)`에서 이미 해당 예외를 처리할 수 있다.
- 따라서 두 번째 catch 블록에는 도달할 수 없다.

**올바른 예제**

```java
try {
    int number = Integer.parseInt("abc");

} catch (NumberFormatException e) {
    System.out.println("숫자 오류");

} catch (Exception e) {
    System.out.println("기타 예외");
}
```

**핵심 규칙**

```text
구체적인 자식 예외
        ↓
보다 일반적인 부모 예외
        ↓
최상위 포괄 예외
```

**주의 : 모든 예외를 무조건 `catch (Exception e)` 하나로 처리하면 예외마다 필요한 대응 방법을 구분하기 어려워질 수 있다.**

### 10. 멀티 catch(Multi-catch)

멀티 catch는 여러 예외를 하나의 catch 블록에서 공통으로 처리하는 문법이다.

**기본 구조**

```java
catch (ExceptionA | ExceptionB e) {
    // 공통 예외 처리
}
```

**Java 예제**

```java
try {
    int number = Integer.parseInt("abc");

    System.out.println(100 / number);

} catch (NumberFormatException | ArithmeticException e) {
    System.out.println("숫자 처리 오류");
}
```

**다중 catch와 멀티 catch 비교**

| 구분 | 다중 catch | 멀티 catch |
|---|---|---|
| 문법 | catch 블록 여러 개 | `\|`를 이용한 하나의 catch |
| 처리 방식 | 예외별 개별 처리 | 여러 예외의 공통 처리 |
| 장점 | 오류별 세부 대응 | 중복 코드 감소 |
| 사용 상황 | 오류마다 대응이 다름 | 처리 방식이 동일함 |

**주의사항**

- 멀티 catch에서는 서로 상속 관계에 있는 예외 타입을 함께 나열할 수 없다.
- 멀티 catch의 예외 매개변수는 암묵적으로 final이다.
- 예외별로 처리 방법이 다르다면 개별 catch를 사용하는 것이 적합하다.

### 11. 예외 전파(Exception Propagation)

예외 전파는 메서드 내부에서 처리되지 않은 예외가 해당 메서드를 호출한 상위 메서드로 전달되는 과정이다.

**Java 예제**

```java
public class Main {

    static void methodA() {
        methodB();
    }

    static void methodB() {
        int result = 10 / 0;
    }

    public static void main(String[] args) {

        try {
            methodA();

        } catch (ArithmeticException e) {
            System.out.println("main에서 예외 처리");
        }
    }
}
```

**실행 결과**

```text
main에서 예외 처리
```

**예외 전파 과정**

```text
           main()
              │
              ▼
          methodA()
              │
              ▼
          methodB()
              │
              ▼
     ArithmeticException
              │
              │ 예외 처리 없음
              ▼
         methodA()로 전파
              │
              │ 예외 처리 없음
              ▼
          main()으로 전파
              │
              ▼
         catch 실행
              │
              ▼
          예외 처리 완료
```

**핵심**

- 예외가 발생한 메서드에서 반드시 처리해야 하는 것은 아니다.
- 적절한 복구 방법을 알고 있는 상위 호출자에게 전달할 수 있다.
- 예외가 전파되는 동안 해당 호출의 정상적인 실행 흐름은 중단된다.
- 최종적으로 처리되지 않은 예외는 해당 스레드의 비정상 종료로 이어질 수 있다.

### 12. throw와 throws의 차이

`throw`와 `throws`는 이름이 비슷하지만 서로 다른 역할을 수행한다.

| 구분 | throw | throws |
|---|---|---|
| 역할 | 예외 객체를 발생시킴 | 예외 전파 가능성을 선언 |
| 위치 | 메서드 내부 등의 실행 코드 | 메서드 선언부 |
| 목적 | 문제 상황을 예외로 표현 | 호출자에게 처리 책임 전달 |
| 대표 문법 | `throw new Exception()` | `throws IOException` |

**throw 예제**

```java
public static void validateAge(int age) {

    if (age < 0) {
        throw new IllegalArgumentException(
            "나이는 음수일 수 없습니다."
        );
    }
}
```

- `throw`는 예외 객체를 실제로 발생시킨다.
- 실행되면 현재의 정상적인 실행 흐름이 중단된다.
- 해당 예외는 일치하는 catch를 찾거나 상위 호출자로 전파된다.

**throws 예제**

```java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public static String readFile(String path)
        throws IOException {

    return Files.readString(Path.of(path));
}
```

- `throws`는 메서드가 발생시킬 수 있는 예외를 선언한다.
- `throws` 자체가 예외를 발생시키는 것은 아니다.
- Checked Exception을 호출자에게 전파하려면 적절한 throws 선언이 필요하다.

**핵심**

```text
throw  → 예외를 발생시키는 실행문
throws → 예외를 전파할 수 있음을 선언
```

### 13. throws와 메서드 호출 계층

메서드 내부에서 발생한 Checked Exception을 직접 처리하지 않고 상위 호출자에게 전파할 수 있다.

**Java 예제**

```java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    static String readFile() throws IOException {
        return Files.readString(Path.of("test.txt"));
    }

    static void process() throws IOException {
        String content = readFile();

        System.out.println(content);
    }

    public static void main(String[] args) {

        try {
            process();

        } catch (IOException e) {
            System.out.println("파일 읽기 실패");
        }
    }
}
```

**호출 구조**

```text
           main()
              │
              ▼
         process()
        throws IOException
              │
              ▼
         readFile()
        throws IOException
              │
              ▼
       IOException 발생
              │
              ▼
        process()로 전파
              │
              ▼
         main()으로 전파
              │
              ▼
        catch에서 처리
```

**주의사항**

- `throws`를 선언했다고 예외가 자동으로 처리되는 것은 아니다.
- 예외를 호출자에게 전달할 수 있음을 선언하는 것이다.
- 호출자는 Checked Exception을 처리하거나 다시 전파해야 한다.
- 실제 복구를 수행할 수 있는 계층에서 예외를 처리하는 것이 좋다.

### 14. 자원 누수(Resource Leak)

자원 누수는 파일, 데이터베이스 연결, 네트워크 연결 등의 외부 자원을 사용한 후 적절하게 정리하지 않아 발생하는 문제이다.

**대표적인 외부 자원**

- 파일 스트림
- 데이터베이스 Connection
- 네트워크 Socket
- 입출력 Stream
- 기타 명시적인 종료가 필요한 자원

**문제가 발생할 수 있는 코드**

```java
import java.io.FileReader;
import java.io.IOException;

public static void readFile() throws IOException {

    FileReader reader = new FileReader("test.txt");

    int data = reader.read();

    // close()가 호출되지 않음
}
```

**문제점**

- 파일 자원이 적절하게 닫히지 않을 수 있다.
- 예외가 발생하면 정리 작업이 누락되기 쉽다.
- 불필요하게 열린 자원이 누적되면 프로그램 성능과 안정성에 영향을 줄 수 있다.

**기존 finally 방식**

```java
FileReader reader = null;

try {
    reader = new FileReader("test.txt");

    System.out.println(reader.read());

} catch (IOException e) {
    System.out.println("파일 처리 실패");

} finally {

    if (reader != null) {
        try {
            reader.close();

        } catch (IOException e) {
            System.out.println("파일 종료 실패");
        }
    }
}
```

**한계**

- 코드가 복잡해진다.
- 자원이 여러 개라면 정리 코드가 길어진다.
- 자원을 닫는 과정에서도 예외가 발생할 수 있다.

이러한 문제를 간결하게 해결하는 문법이 `try-with-resources`이다.

### 15. try-with-resources

`try-with-resources`는 사용한 자원을 자동으로 닫도록 하는 Java 문법이다.

Java 7부터 지원하며 `AutoCloseable` 인터페이스를 구현한 객체에 사용할 수 있다.

**기본 문법**

```java
try (자원_선언) {
    // 자원 사용
}
```

**Java 예제**

```java
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try (FileReader reader =
                new FileReader("test.txt")) {

            int data = reader.read();

            System.out.println(data);

        } catch (IOException e) {
            System.out.println("파일 처리 실패");
        }
    }
}
```

**실행 과정**

```text
          자원 생성
              │
              ▼
      try-with-resources
              │
              ▼
          작업 실행
              │
              ▼
      정상 종료 또는 예외
              │
              ▼
       자동 close() 호출
              │
              ▼
         자원 정리 완료
```

**주요 특징**

- 자원을 자동으로 닫는 코드를 제공한다.
- 정상 종료와 예외 발생 상황 모두에서 자원 정리를 수행한다.
- 명시적으로 finally에서 close를 호출하는 코드를 줄일 수 있다.
- 여러 자원을 선언할 수 있다.
- 선언된 자원은 역순으로 닫힌다.

**여러 자원 선언**

```java
try (
    FileReader reader = new FileReader("input.txt");
    java.io.FileWriter writer =
        new java.io.FileWriter("output.txt")
) {
    int data = reader.read();

    writer.write(data);

} catch (IOException e) {
    System.out.println("파일 처리 오류");
}
```

**닫히는 순서**

```text
FileReader 생성
       ↓
FileWriter 생성
       ↓
작업 수행
       ↓
FileWriter 종료
       ↓
FileReader 종료
```

**주의**

- `AutoCloseable`을 구현한 자원에 사용할 수 있다.
- 자원 생성이나 close 과정에서 예외가 발생할 수 있다.
- Java 9부터는 이미 선언된 final 또는 사실상 final 자원 변수도 try 괄호에서 사용할 수 있다.

### 16. AutoCloseable과 Suppressed Exception

`AutoCloseable`은 자원 종료를 위한 `close()` 메서드를 정의하는 인터페이스이다.

**기본 구조**

```java
public interface AutoCloseable {

    void close() throws Exception;
}
```

**사용자 정의 자원 예제**

```java
class MyResource implements AutoCloseable {

    public void execute() {
        System.out.println("작업 수행");
    }

    @Override
    public void close() {
        System.out.println("자원 종료");
    }
}
```

**사용**

```java
try (MyResource resource = new MyResource()) {

    resource.execute();
}
```

**실행 결과**

```text
작업 수행
자원 종료
```

**Suppressed Exception**

try 블록의 작업 도중 예외가 발생하고, 자원을 닫는 과정에서도 예외가 발생할 수 있다.

이때 `try-with-resources`는 일반적으로 작업 중 발생한 예외를 주요 예외로 유지하고, 닫는 과정에서 발생한 예외를 Suppressed Exception으로 보관한다.

```java
Throwable[] suppressed = e.getSuppressed();
```

**핵심**

- `close()`는 자원 종료 동작을 정의한다.
- `try-with-resources`는 자원 종료를 자동으로 수행한다.
- 자원을 닫는 과정에서 발생한 예외도 확인할 수 있다.
- 파일과 DB 연결처럼 사용 후 반드시 정리해야 하는 자원에 특히 중요하다.

### 17. 사용자 정의 예외(Custom Exception)

사용자 정의 예외는 Java가 기본적으로 제공하는 예외만으로 표현하기 어려운 업무 상황을 명확하게 나타내기 위해 작성하는 예외 클래스이다.

**대표적인 활용 상황**

| 상황 | 사용자 정의 예외 예시 |
|---|---|
| 계좌 잔액 부족 | InsufficientBalanceException |
| 상품 재고 부족 | StockException |
| 중복 회원가입 | DuplicateMemberException |
| 회원 조회 실패 | MemberNotFoundException |
| 권한 부족 | PermissionDeniedException |

**사용자 정의 예외의 목적**

- 업무 규칙 위반을 명확한 타입으로 표현
- 예외 종류에 따른 처리 방식 구분
- 잘못된 상태에서 후속 작업 진행 방지
- 코드의 의미와 유지보수성 향상

**Checked Exception 정의**

```java
class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
```

**Unchecked Exception 정의**

```java
class StockException extends RuntimeException {

    public StockException(String message) {
        super(message);
    }
}
```

**비교**

| 구분 | extends Exception | extends RuntimeException |
|---|---|---|
| 분류 | Checked Exception | Unchecked Exception |
| 호출자의 처리 의무 | 있음 | 컴파일러가 강제하지 않음 |
| 사용 예 | 명시적인 복구 절차가 필요한 상황 | 업무 규칙 위반, 잘못된 상태 등 |
| 예외 전파 | 적절한 throws 선언 필요 | throws 선언 선택 |

**주의**

- Checked와 Unchecked의 선택 기준은 단순히 외부 오류인지 내부 오류인지로만 구분하지 않는다.
- 호출자가 해당 상황을 복구하도록 요구할 것인지 등 API의 계약을 고려해야 한다.
- 모든 비즈니스 오류를 반드시 사용자 정의 예외로 만들 필요는 없다.

### 18. 사용자 정의 예외를 활용한 재고 관리

상품 주문 과정에서는 유효하지 않은 수량이나 재고 부족 상황을 예외로 표현할 수 있다.

**재고 관리 흐름**

```text
         주문 요청
             │
             ▼
        주문 수량 검사
             │
      ┌──────┴──────┐
      │             │
   수량 정상      수량 오류
      │             │
      ▼             ▼
    재고 검사   IllegalArgumentException
      │
  ┌───┴────────┐
  │            │
재고 충분     재고 부족
  │            │
  ▼            ▼
재고 차감   StockException
  │
  ▼
주문 처리 완료
```

**사용자 정의 예외**

```java
class StockException extends RuntimeException {

    public StockException(String message) {
        super(message);
    }
}
```

**Product 클래스**

```java
class Product {

    private int stock;

    public Product(int stock) {

        if (stock < 0) {
            throw new IllegalArgumentException(
                "초기 재고는 음수일 수 없습니다."
            );
        }

        this.stock = stock;
    }

    public void order(int quantity) {

        if (quantity <= 0) {
            throw new IllegalArgumentException(
                "주문 수량은 1 이상이어야 합니다."
            );
        }

        if (quantity > stock) {
            throw new StockException(
                "재고가 부족합니다."
            );
        }

        stock -= quantity;
    }

    public int getStock() {
        return stock;
    }
}
```

**사용 예제**

```java
Product product = new Product(3);

try {
    product.order(5);

} catch (StockException e) {
    System.out.println(e.getMessage());
}
```

**실행 결과**

```text
재고가 부족합니다.
```

**핵심**

- 잘못된 주문 수량은 `IllegalArgumentException`으로 처리한다.
- 재고 부족은 `StockException`으로 표현한다.
- 문제가 발생하면 재고 차감 작업을 수행하지 않는다.
- 예외 종류에 따라 서로 다른 대응을 할 수 있다.

※ 위 코드는 예외 처리 원리를 설명하기 위한 단일 객체 예제이다. 실제 다중 사용자 주문 시스템에서는 트랜잭션과 동시성 제어가 추가로 필요하다.

### 19. 예외 처리의 세 가지 주요 전략

예외가 발생했을 때는 복구, 전파, 의도적인 예외 발생 등을 선택할 수 있다.

| 전략 | 대표 문법 | 설명 |
|---|---|---|
| 복구(Recovery) | try-catch | 상황에 맞게 문제를 처리하고 후속 작업 수행 |
| 전파(Propagation) | throws | 적절한 호출자에게 처리 책임 전달 |
| 의도적 예외 발생 | throw | 잘못된 입력이나 상태를 명시적으로 표현 |

**복구**

```java
try {
    int number = Integer.parseInt(input);

} catch (NumberFormatException e) {
    System.out.println("올바른 숫자를 입력하세요.");
}
```

**전파**

```java
public static String loadFile(String path)
        throws IOException {

    return Files.readString(Path.of(path));
}
```

**의도적 예외 발생**

```java
if (quantity <= 0) {
    throw new IllegalArgumentException(
        "수량은 1 이상이어야 합니다."
    );
}
```

**핵심**

예외를 무조건 처리하는 것보다 현재 계층에서 복구가 가능한지 판단하고, 적절한 위치에서 처리하거나 전파하는 것이 중요하다.

### 20. 실무에서 피해야 할 예외 처리 안티 패턴

**1. 빈 catch 블록**

```java
try {
    process();

} catch (Exception e) {
    // 아무 작업도 하지 않음
}
```

**문제점**

- 예외 발생 사실이 숨겨진다.
- 오류의 원인을 추적하기 어려워진다.
- 잘못된 상태로 후속 작업이 진행될 수 있다.

**2. 모든 예외를 하나로 처리**

```java
catch (Exception e) {
    System.out.println("오류 발생");
}
```

- 서로 다른 예외의 원인과 처리 방법을 구분하기 어렵다.
- 복구 가능한 예외와 복구 불가능한 예외를 혼동할 수 있다.

**3. 원인 예외를 잃어버리는 재전파**

```java
catch (IOException e) {
    throw new RuntimeException("파일 오류");
}
```

위 코드는 원본 예외를 새 예외의 원인으로 연결하지 않는다.

**개선 예제**

```java
catch (IOException e) {
    throw new RuntimeException("파일 처리 실패", e);
}
```

- 원래 예외를 원인(Cause)으로 보존한다.
- 호출자가 전체 예외 발생 경로를 확인할 수 있다.
- 예외의 원인을 추적하기 쉬워진다.

**4. 불필요한 예외 처리**

- 복구할 방법이 없는데 무조건 catch로 예외를 삼키지 않는다.
- 단순한 조건 검사를 위해 예외를 일반적인 분기 수단으로 남용하지 않는다.
- 정리해야 하는 자원을 방치하지 않는다.

**5. 부적절한 오류 정보 노출**

- 서버의 내부 Stack Trace나 데이터베이스 연결 정보 등을 사용자에게 그대로 전달하지 않는다.
- 사용자에게는 필요한 오류 메시지만 제공한다.
- 내부 원인 분석에 필요한 상세 정보는 로그로 관리한다.

### 21. Spring Boot에서의 예외 처리 흐름

Spring Boot 기반 웹 애플리케이션에서는 비즈니스 로직에서 발생한 예외를 HTTP 응답으로 변환하여 클라이언트에 전달한다.

**기본 구조**

```text
          Client
             │
             ▼
         Controller
             │
             ▼
          Service
             │
             ▼
        Repository
             │
             ▼
          Database


[예외 발생 시]

          Service
             │
             ▼
    MemberNotFoundException
             │
             ▼
       예외 전파
             │
             ▼
    GlobalExceptionHandler
             │
             ▼
      HTTP 오류 응답 생성
             │
             ▼
           Client
```

**일반적인 역할**

| 계층 | 주요 역할 |
|---|---|
| Controller | HTTP 요청 수신 및 처리 연결 |
| Service | 비즈니스 로직과 업무 규칙 검사 |
| Repository | 데이터 접근 |
| Exception Handler | 예외를 적절한 HTTP 응답으로 변환 |
| Client | HTTP 상태 코드와 오류 메시지 수신 |

**핵심**

- 서비스 계층에서 업무 오류를 예외로 표현한다.
- 필요한 경우 예외를 상위 계층으로 전파한다.
- 전역 예외 처리기를 통해 공통적인 오류 응답을 구성할 수 있다.
- 컨트롤러마다 동일한 try-catch를 반복하지 않도록 설계할 수 있다.

### 22. @RestControllerAdvice를 이용한 전역 예외 처리

Spring Boot에서는 `@RestControllerAdvice`와 `@ExceptionHandler`를 이용하여 컨트롤러 예외를 공통으로 처리할 수 있다.

**사용자 정의 예외**

```java
public class MemberNotFoundException
        extends RuntimeException {

    public MemberNotFoundException(String message) {
        super(message);
    }
}
```

**오류 응답 DTO**

```java
public record ErrorResponse(
    int status,
    String code,
    String message
) {}
```

**전역 예외 처리 클래스**

```java
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MemberNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleMemberNotFound(
            MemberNotFoundException e) {

        ErrorResponse response = new ErrorResponse(
            404,
            "MEMBER_NOT_FOUND",
            e.getMessage()
        );

        return ResponseEntity
            .status(HttpStatus.NOT_FOUND)
            .body(response);
    }
}
```

※ 위 코드는 Spring Boot 환경에서 사용하는 구조 설명용 예제로, 필요한 Spring 클래스들의 import는 생략했다.

**관련 어노테이션**

| 어노테이션 | 역할 |
|---|---|
| `@RestControllerAdvice` | 컨트롤러의 예외 등을 공통 처리하는 Advice 선언 |
| `@ExceptionHandler` | 지정된 예외 타입을 처리하는 메서드 정의 |
| `ResponseEntity` | HTTP 상태, 헤더, 응답 본문 구성 |

**실행 흐름**

```text
MemberService
      │
      ▼
MemberNotFoundException
      │
      ▼
GlobalExceptionHandler
      │
      ▼
@ExceptionHandler
      │
      ▼
ErrorResponse 생성
      │
      ▼
ResponseEntity 반환
      │
      ▼
HTTP 404 응답
```

**핵심**

- 공통 예외 응답 처리를 한곳에서 관리할 수 있다.
- 비즈니스 로직과 HTTP 오류 응답 처리를 분리할 수 있다.
- 동일한 유형의 오류를 일관된 형태로 전달할 수 있다.
- 실제 서비스에서는 예외의 의미에 맞는 HTTP 상태 코드를 선택해야 한다.

### 23. HTTP 상태 코드와 JSON 오류 응답

웹 애플리케이션에서는 예외의 의미에 따라 적절한 HTTP 상태 코드와 오류 메시지를 제공한다.

**대표적인 HTTP 오류 상태**

| 상태 코드 | 의미 | 예시 |
|---|---|---|
| 400 Bad Request | 잘못된 요청 | 잘못된 입력 형식 |
| 401 Unauthorized | 인증 필요 또는 실패 | 유효하지 않은 인증 정보 |
| 403 Forbidden | 접근 권한 없음 | 권한 부족 |
| 404 Not Found | 요청한 리소스 없음 | 회원 조회 실패 |
| 409 Conflict | 현재 상태와 충돌 | 중복 회원가입 |
| 500 Internal Server Error | 서버 내부 오류 | 예상하지 못한 서버 오류 |
| 503 Service Unavailable | 서비스 일시적 이용 불가 | 일시적 서버 장애 등 |

**JSON 오류 응답 예시**

```json
{
  "status": 404,
  "code": "MEMBER_NOT_FOUND",
  "message": "해당 회원을 찾을 수 없습니다."
}
```

**각 필드의 의미**

| 필드 | 역할 |
|---|---|
| status | HTTP 오류 상태 |
| code | 애플리케이션에서 정의한 오류 코드 |
| message | 사용자 또는 클라이언트에 전달할 오류 설명 |

**JSON 오류 응답의 장점**

- 클라이언트가 오류 종류를 쉽게 구분할 수 있다.
- 일관된 오류 응답 구조를 제공한다.
- 오류 코드에 따라 클라이언트가 다른 작업을 수행할 수 있다.
- 프론트엔드와 백엔드 사이의 오류 처리 규약을 명확하게 정의할 수 있다.

**주의 : 내부 구현 정보나 민감한 데이터가 오류 응답에 포함되지 않도록 주의해야 한다.**

### 24. 예외 처리와 로그 관리

실제 서비스에서는 사용자에게 제공하는 오류 응답과 개발자가 확인하는 오류 로그의 목적이 다르다.

**사용자 오류 응답**

- 간결하고 이해할 수 있는 메시지 제공
- 필요한 HTTP 상태 코드 사용
- 내부 시스템 정보 노출 최소화

**서버 오류 로그**

- 발생한 예외의 타입 확인
- 예외 메시지와 원인 기록
- Stack Trace 분석
- 요청 처리 과정에서 발생한 오류의 추적

**예외 기록 예제**

```java
try {
    process();

} catch (Exception e) {
    logger.error("작업 처리 중 오류 발생", e);
    throw e;
}
```

※ 위 예제의 `logger`와 `process()`는 이미 정의되어 있다고 가정한다. 실제 로깅에는 SLF4J 등의 로깅 API를 사용할 수 있다.

**핵심**

- 로그는 예외 원인을 분석하는 데 사용한다.
- 사용자 응답에는 불필요한 내부 정보를 전달하지 않는다.
- 상위 계층에서 이미 충분히 기록하는 경우 중복 로그를 남기지 않도록 고려한다.
- 재시도 가능한 일시적 장애와 영구적인 업무 오류는 구분한다.

### 25. Java 핵심 문법과 웹 개발의 관계

강의자료 후반부에서는 Java 기본 문법부터 객체지향, 예외 처리까지 웹 개발에서 어떤 역할을 수행하는지 정리한다.

| 학습 영역 | 핵심 개념 | 웹 개발에서의 역할 |
|---|---|---|
| 변수와 자료형 | int, String, boolean | 사용자 데이터 저장 |
| 연산자 | 산술·비교·논리 연산 | 계산 및 조건 검사 |
| 제어문 | if, switch, for, while | 실행 흐름과 반복 처리 |
| 참조 타입 | 배열, String, 객체 | 데이터 관리 |
| 클래스와 객체 | 필드, 생성자, 메서드 | 기능과 상태의 구조화 |
| 상속과 다형성 | extends, Override | 기능 재사용과 확장 |
| 인터페이스 | implements | 공통 규약과 의존성 분리 |
| 예외 처리 | try-catch, throw, throws | 오류 대응과 전파 |
| 사용자 정의 예외 | Exception 상속 | 업무 규칙 위반 표현 |

**Java에서 Spring Boot로 연결되는 구조**

```text
Java 기본 문법
     │
     ▼
변수 / 연산자 / 제어문
     │
     ▼
클래스 / 객체 / 메서드
     │
     ▼
상속 / 다형성 / 인터페이스
     │
     ▼
예외 처리 / 데이터 관리
     │
     ▼
Spring Boot
     │
     ├── Controller
     ├── Service
     ├── Repository
     ├── DTO / Entity
     └── Exception Handler
```

**핵심**

Java에서 학습한 객체지향과 예외 처리 개념은 Spring Boot에서도 그대로 활용된다.

특히 클래스 간 책임 분리와 인터페이스를 통한 추상화, 사용자 정의 예외를 통한 오류 관리 방식이 중요하다.

### 26. 앞으로 학습할 Java 주요 문법

강의자료에서는 Spring Boot 학습 전 추가로 익히면 좋은 Java 문법을 소개한다.

| 학습 항목 | 주요 내용 | 활용 목적 |
|---|---|---|
| List / ArrayList | 가변 크기 데이터 목록 | 여러 데이터 저장 및 조회 |
| Map / HashMap | Key-Value 데이터 관리 | 키를 이용한 데이터 조회 |
| Generic | 타입 매개변수 | 타입 안정성과 재사용성 |
| Lambda | 함수형 인터페이스 구현 | 간결한 동작 표현 |
| Stream API | 데이터 필터링 및 변환 | 컬렉션 데이터 가공 |
| Optional | 값의 존재 여부 표현 | null 관련 오류 예방에 도움 |

**기본적인 활용 구조**

```text
      여러 데이터
           │
           ▼
     List / Map
           │
           ▼
      Generic<T>
           │
           ▼
   Lambda / Stream API
           │
           ▼
     데이터 가공
           │
           ▼
      서비스 로직
           │
           ▼
      API 응답
```

**주의**

- `Optional`은 모든 null을 자동으로 제거하는 기능이 아니다.
- Stream API도 모든 반복문을 대체해야 하는 것은 아니다.
- 컬렉션과 제네릭의 특성을 이해한 후 필요한 상황에 적절하게 사용하는 것이 중요하다.

### 27. 예외 처리 시 자주 발생하는 오류 및 주의사항

| 주의사항 | 원인 및 해결 방법 |
|---|---|
| Exception과 Error 혼동 | 일반적인 예외와 심각한 오류 구분 |
| Checked Exception 처리 누락 | catch 또는 throws 필요 |
| Unchecked Exception 오해 | 컴파일러가 처리를 강제하지 않을 뿐 예외는 발생 가능 |
| try 내부 실행 흐름 혼동 | 예외 발생 이후의 try 코드 실행 중단 |
| catch 작성 순서 오류 | 자식 예외를 부모 예외보다 먼저 작성 |
| 멀티 catch 타입 충돌 | 상속 관계의 예외를 함께 나열하지 않음 |
| finally 실행 보장 오해 | JVM 강제 종료 등에서는 실행되지 않을 수 있음 |
| finally 내부 return | 기존 반환값 또는 예외가 가려질 수 있음 |
| throw와 throws 혼동 | 예외 발생과 전파 선언 구분 |
| throws의 역할 오해 | 예외를 직접 처리하는 기능이 아님 |
| 빈 catch 블록 | 예외를 무시하지 않고 적절히 대응 |
| Exception 전체 처리 남용 | 구체적인 예외별 처리 방법 검토 |
| 예외 원인 누락 | 예외를 감쌀 때 원본 cause 보존 |
| 파일 자원 해제 누락 | try-with-resources 사용 |
| GC와 자원 해제 혼동 | 외부 자원은 명시적인 종료 필요 |
| 사용자 정의 예외 남용 | 의미 있는 업무 오류에 적절히 활용 |
| 내부 오류 정보 노출 | 클라이언트에는 안전한 오류 메시지 제공 |
| 일률적인 HTTP 상태 코드 | 예외 종류에 맞는 상태 코드 선택 |
| 불필요한 재시도 | 복구 가능성과 중복 실행 위험 검토 |
| 중복 로그 | 오류 추적에 필요한 위치에서 적절하게 기록 |

### ✅ Day18 핵심 정리

| 구분 | 핵심 내용 |
|---|---|
| Exception Handling | 비정상 상황에 대한 적절한 대응과 실행 흐름 관리 |
| Throwable | 예외 및 오류의 최상위 클래스 |
| Exception | 애플리케이션에서 처리할 수 있는 예외 상황 |
| Error | 일반적으로 복구하기 어려운 심각한 오류 |
| Checked Exception | 컴파일러가 처리 또는 전파 선언 요구 |
| Unchecked Exception | 컴파일러가 처리 강제하지 않음 |
| try | 예외 발생 가능 코드 실행 |
| catch | 발생한 예외를 받아 처리 |
| finally | 일반적인 정리 작업 수행 |
| Multiple Catch | 예외 종류별로 다른 처리 |
| Multi-catch | 여러 예외를 하나의 catch로 처리 |
| getMessage() | 예외 메시지 반환 |
| toString() | 예외 타입과 메시지 확인 |
| printStackTrace() | 예외 발생 위치와 호출 경로 출력 |
| Exception Propagation | 예외를 상위 호출자로 전달 |
| throw | 예외 객체를 직접 발생 |
| throws | 예외 전파 가능성을 선언 |
| Resource Leak | 자원을 적절히 종료하지 않아 발생하는 누수 |
| try-with-resources | AutoCloseable 자원의 자동 종료 |
| AutoCloseable | 자원 종료를 위한 close() 규약 |
| Suppressed Exception | 자원 종료 중 발생한 추가 예외 보관 |
| Custom Exception | 업무 규칙을 표현하기 위한 사용자 정의 예외 |
| RuntimeException | 대표적인 Unchecked Exception의 상위 클래스 |
| Exception Cause | 예외 발생 원인을 연결하고 보존 |
| GlobalExceptionHandler | 웹 애플리케이션의 공통 예외 처리 |
| @RestControllerAdvice | Spring의 전역 Controller Advice |
| @ExceptionHandler | 특정 예외를 처리할 메서드 지정 |
| ResponseEntity | HTTP 상태 코드와 응답 구성 |
| ErrorResponse | 클라이언트에 전달할 공통 오류 정보 |
| Logging | 서버 오류 발생 원인 및 경로 기록 |

**최종 학습 정리**

- 예외 처리는 오류를 무조건 없애는 것이 아니라 발생한 문제에 적절히 대응하여 프로그램의 흐름을 관리하는 기능이다.
- Java의 예외와 오류는 Throwable을 최상위 클래스로 하는 계층 구조를 가진다.
- Exception은 일반적인 예외 상황을 표현하고 Error는 심각한 시스템 문제 등을 표현한다.
- Checked Exception은 컴파일러가 처리 또는 전파 선언을 요구한다.
- Unchecked Exception은 컴파일러가 처리를 강제하지 않는다.
- try 블록에서 예외가 발생하면 해당 지점 이후의 정상 실행 흐름이 중단된다.
- catch는 발생한 예외를 처리하며 자식 예외부터 부모 예외 순서로 작성해야 한다.
- 멀티 catch를 사용하면 여러 예외를 하나의 블록에서 공통으로 처리할 수 있다.
- finally는 일반적으로 예외 발생 여부에 관계없이 실행되지만 모든 상황에서 실행을 보장하지는 않는다.
- getMessage(), toString(), printStackTrace()를 이용하여 예외 정보를 확인할 수 있다.
- 메서드 내부에서 처리되지 않은 예외는 호출 스택을 따라 상위 호출자로 전파될 수 있다.
- throw는 예외를 직접 발생시키고 throws는 예외를 전파할 수 있음을 선언한다.
- 파일과 DB 연결 등의 외부 자원은 사용 후 적절하게 종료해야 한다.
- try-with-resources를 사용하면 AutoCloseable 자원의 종료를 자동화할 수 있다.
- 사용자 정의 예외는 프로그램의 업무 규칙 위반을 의미 있는 타입으로 표현한다.
- 예외를 감싸서 다시 발생시킬 때는 원본 예외를 Cause로 보존하는 것이 좋다.
- 빈 catch 블록이나 모든 예외를 무조건 무시하는 처리는 피해야 한다.
- Spring Boot에서는 @RestControllerAdvice와 @ExceptionHandler를 이용해 공통 예외 처리 구조를 만들 수 있다.
- 서버에서 발생한 예외는 적절한 HTTP 상태 코드와 JSON 오류 응답으로 변환할 수 있다.
- 서버의 내부 오류 정보는 로그로 관리하고 클라이언트에는 필요한 정보만 전달해야 한다.
- 안정적인 프로그램 설계에서는 정상적인 기능 구현뿐 아니라 실패 상황을 어떻게 처리할 것인지도 중요하다.

</details>


## Day19. Java 예외 처리 및 중첩 클래스 심화
<details>

### 🎯 학습 목표
- Java 예외 처리의 구조와 실행 흐름을 이해한다.
- Checked Exception과 Unchecked Exception의 차이를 구분한다.
- `try-catch-finally`, `throw`, `throws`의 역할을 이해한다.
- 예외가 메서드 호출 스택을 따라 전파되는 원리를 이해한다.
- 사용자 정의 예외를 이용하여 비즈니스 오류를 표현한다.
- Spring Boot의 전역 예외 처리 구조를 이해한다.
- 중첩 클래스의 개념과 사용 목적을 이해한다.
- 인스턴스 멤버 클래스와 정적 중첩 클래스의 차이를 구분한다.
- 지역 클래스와 익명 클래스의 특징을 이해한다.
- 중첩 클래스의 접근 규칙과 변수 캡처 조건을 이해한다.
- 정적 중첩 클래스를 활용한 DTO 및 Builder 구조를 이해한다.
- `java.lang` 패키지의 주요 클래스와 사용법을 익힌다.
- 객체지향 설계에서 적절한 클래스 구조를 선택할 수 있다.

### 1. Java 예외 처리(Exception Handling)

예외 처리는 프로그램 실행 중 발생하는 비정상적인 상황을 적절하게 처리하거나 전파하여 실행 흐름을 제어하는 기능이다.

**예외 처리를 사용하는 목적**

- 프로그램의 비정상적인 실행 상황에 대응한다.
- 오류가 발생한 원인을 추적한다.
- 복구 가능한 작업을 적절하게 처리한다.
- 외부 자원을 안전하게 정리한다.
- 비즈니스 규칙을 위반한 상황을 명확하게 표현한다.

**예외 처리의 기본 구조**

```text
        프로그램 실행
              │
              ▼
          정상 처리
              │
         예외 발생?
          │      │
         No     Yes
          │      │
          │      ▼
          │   예외 처리
          │      │
          └──┬───┘
             │
             ▼
       이후 실행 흐름
```

**핵심**

- 예외 처리는 오류를 무조건 없애는 기능이 아니다.
- 예외가 발생했을 때 적절한 처리 방법을 결정한다.
- 현재 메서드에서 처리할 수 없다면 상위 호출자로 전파할 수 있다.

### 2. Error와 Exception의 차이

Java의 예외 및 오류는 `Throwable` 클래스를 중심으로 계층 구조를 가진다.

**예외 클래스 계층**

```text
                 Throwable
                     │
           ┌─────────┴─────────┐
           │                   │
           ▼                   ▼
         Error              Exception
           │                   │
      ┌────┴────┐       ┌──────┴────────┐
      │         │       │               │
      ▼         ▼       ▼               ▼
   OutOfMemory  Stack  IOException  RuntimeException
     Error     Overflow                │
                Error                  ├─ NullPointerException
                                       ├─ ArithmeticException
                                       └─ IllegalArgumentException
```

| 구분 | Error | Exception |
|---|---|---|
| 의미 | 시스템·JVM 수준의 심각한 문제 등 | 프로그램의 예외적 상황 |
| 복구 | 일반적으로 복구 어려움 | 상황에 따라 처리 및 복구 가능 |
| 대표 예시 | OutOfMemoryError | IOException |
| 주요 대응 | 원인 분석 및 시스템 문제 해결 | 적절한 처리 또는 전파 |

**주의사항**

- `Error`도 문법적으로 `catch`할 수 있지만 일반적인 복구 대상으로 취급하지 않는다.
- `Exception`이라고 해서 항상 복구할 수 있는 것은 아니다.
- 예외를 처리할 수 없는 경우 상위 계층에 전달하는 것이 적합할 수 있다.

### 3. Checked Exception과 Unchecked Exception

예외는 컴파일러가 처리 또는 전파 선언을 요구하는지에 따라 구분된다.

| 구분 | Checked Exception | Unchecked Exception |
|---|---|---|
| 대표 부모 타입 | Exception(RuntimeException 제외) | RuntimeException |
| 컴파일러 검사 | 처리 또는 전파 선언 필요 | 강제하지 않음 |
| 대표 예시 | IOException, SQLException | NullPointerException, ArithmeticException |
| 주요 특징 | 호출자에게 예외 대응 요구 | 상황에 따라 선택적으로 처리 |

**Checked Exception**

```java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public static String readFile(String path)
        throws IOException {

    return Files.readString(Path.of(path));
}
```

**Unchecked Exception**

```java
int number = Integer.parseInt("abc");
// NumberFormatException 발생
```

**핵심**

- Checked Exception은 `catch` 또는 `throws`가 필요하다.
- Unchecked Exception은 컴파일러가 처리를 강제하지 않는다.
- Unchecked Exception도 실행 중 발생하면 프로그램의 흐름을 중단시킬 수 있다.

### 4. try-catch-finally와 다중 catch

`try-catch-finally`는 예외 발생 가능성이 있는 코드를 실행하고, 예외 처리와 정리 작업을 수행하는 구문이다.

**기본 구조**

```java
try {
    // 예외 발생 가능 코드

} catch (Exception e) {
    // 예외 처리

} finally {
    // 정리 작업
}
```

**실행 예제**

```java
try {
    int result = 10 / 0;

    System.out.println(result);

} catch (ArithmeticException e) {
    System.out.println("산술 연산 오류");

} finally {
    System.out.println("작업 종료");
}
```

**실행 결과**

```text
산술 연산 오류
작업 종료
```

**다중 catch**

```java
try {
    // 작업 수행

} catch (ArithmeticException e) {
    System.out.println("산술 연산 오류");

} catch (NumberFormatException e) {
    System.out.println("숫자 변환 오류");

} catch (Exception e) {
    System.out.println("기타 오류");
}
```

**멀티 catch**

```java
try {
    int number = Integer.parseInt("abc");

    System.out.println(10 / number);

} catch (ArithmeticException | NumberFormatException e) {
    System.out.println("숫자 처리 오류");
}
```

**주의사항**

- `catch`는 위에서부터 순서대로 검사한다.
- 자식 예외를 부모 예외보다 먼저 선언해야 한다.
- 멀티 catch에는 서로 상속 관계인 예외 타입을 함께 선언할 수 없다.
- `finally`는 일반적으로 실행되지만 JVM 강제 종료 등의 경우 실행이 보장되지 않는다.

### 5. throw와 throws의 차이

`throw`와 `throws`는 모두 예외와 관련된 문법이지만 역할이 다르다.

| 구분 | throw | throws |
|---|---|---|
| 역할 | 예외 객체 발생 | 예외 전파 가능성 선언 |
| 위치 | 실행 코드 내부 | 메서드 선언부 |
| 주요 목적 | 잘못된 상태를 예외로 표현 | 호출자에게 예외 처리 책임 전달 |

**throw**

```java
public static void validateAge(int age) {

    if (age < 0) {
        throw new IllegalArgumentException(
            "나이는 음수일 수 없습니다."
        );
    }
}
```

- 조건이 만족되면 예외 객체를 생성하여 발생시킨다.
- 예외가 발생한 지점의 정상적인 실행 흐름이 중단된다.

**throws**

```java
public static void readFile()
        throws java.io.IOException {

    java.nio.file.Files.readString(
        java.nio.file.Path.of("test.txt")
    );
}
```

- 메서드 선언부에서 전파할 수 있는 예외를 명시한다.
- `throws` 자체가 예외를 발생시키지는 않는다.
- Checked Exception은 처리하지 않을 경우 전파 선언이 필요하다.

**핵심**

```text
throw
  └── 예외를 직접 발생시킴

throws
  └── 발생 가능한 예외를 선언하고 호출자에게 전파 허용
```

### 6. 예외 전파(Exception Propagation)

예외 전파는 메서드 내부에서 처리하지 않은 예외가 호출한 메서드로 전달되는 과정이다.

**Java 예제**

```java
public class Main {

    static void methodA() throws java.io.IOException {
        methodB();
    }

    static void methodB() throws java.io.IOException {
        throw new java.io.IOException("파일 처리 오류");
    }

    public static void main(String[] args) {

        try {
            methodA();

        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

**실행 흐름**

```text
           main()
              │
              ▼
          methodA()
              │
              ▼
          methodB()
              │
              ▼
      IOException 발생
              │
              ▼
       methodA()로 전파
              │
              ▼
        main()으로 전파
              │
              ▼
          catch 처리
```

**핵심**

- 예외는 호출 스택을 따라 상위 호출자로 전파될 수 있다.
- 현재 메서드에서 처리하지 않아도 된다.
- Checked Exception을 전파하려는 메서드는 필요한 `throws`를 선언해야 한다.
- 상위 호출자에서도 처리하지 않으면 예외가 계속 전파된다.

### 7. 사용자 정의 예외(Custom Exception)

사용자 정의 예외는 프로그램의 업무 규칙이나 특정 실패 상황을 의미 있는 예외 클래스로 표현하는 방식이다.

**사용 목적**

- 비즈니스 규칙 위반을 명확하게 표현한다.
- 예외 발생 원인을 타입으로 구분한다.
- 예외별 처리 방식을 다르게 지정할 수 있다.
- 코드의 가독성과 유지보수성을 높인다.

**사용자 정의 예외 선언**

```java
class InsufficientBalanceException
        extends RuntimeException {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
```

**계좌 클래스**

```java
class BankAccount {

    private int balance = 100000;

    public void withdraw(int amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                "출금 금액은 양수여야 합니다."
            );
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "잔액이 부족합니다."
            );
        }

        balance -= amount;
    }
}
```

**사용 예제**

```java
BankAccount account = new BankAccount();

try {
    account.withdraw(150000);

} catch (InsufficientBalanceException e) {
    System.out.println(e.getMessage());
}
```

**실행 결과**

```text
잔액이 부족합니다.
```

**핵심**

- `RuntimeException`을 상속하면 Unchecked Exception이 된다.
- `Exception`을 직접 상속하면 Checked Exception이 된다.
- `super(message)`로 부모 예외 클래스에 메시지를 전달한다.
- 의미 있는 업무 상황을 구분할 필요가 있을 때 사용자 정의 예외를 사용한다.

### 8. Spring Boot 전역 예외 처리

Spring Boot에서는 Controller에서 발생하거나 전달된 예외를 공통으로 처리하기 위해 `@RestControllerAdvice`와 `@ExceptionHandler`를 사용할 수 있다.

**예외 처리 구조**

```text
         Client
            │
            ▼
        Controller
            │
            ▼
         Service
            │
            ▼
      비즈니스 규칙 검사
            │
            ▼
    사용자 정의 예외 발생
            │
            ▼
    GlobalExceptionHandler
            │
            ▼
       HTTP 오류 응답
            │
            ▼
          Client
```

**전역 예외 처리 예제**

```java
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MemberNotFoundException.class)
    public ResponseEntity<String> handleMemberNotFound(
            MemberNotFoundException e) {

        return ResponseEntity
            .status(HttpStatus.NOT_FOUND)
            .body(e.getMessage());
    }
}
```

※ Spring Boot 의존성 및 import가 필요하며 `MemberNotFoundException`은 별도로 정의해야 한다.

**주요 구성 요소**

| 구성 요소 | 역할 |
|---|---|
| `@RestControllerAdvice` | MVC Controller 예외의 공통 처리 |
| `@ExceptionHandler` | 처리할 예외 타입 지정 |
| `ResponseEntity` | HTTP 상태 코드와 응답 본문 구성 |
| 사용자 정의 예외 | 업무 상황에 따른 오류 표현 |

**핵심**

- 서비스는 비즈니스 규칙을 검증한다.
- 잘못된 상태를 예외로 표현한다.
- 공통 예외 처리기는 적절한 HTTP 응답을 생성한다.
- 비즈니스 로직과 오류 응답 처리를 분리할 수 있다.

### 9. 예외 처리의 안티 패턴(Anti-pattern)

실무에서는 예외를 어떻게 처리하는지만큼 잘못된 예외 처리 방식을 피하는 것도 중요하다.

| 잘못된 방식 | 문제점 | 개선 방법 |
|---|---|---|
| 빈 catch 블록 | 오류 발생 사실을 숨김 | 적절한 처리 또는 전파 |
| 무조건 Exception으로 처리 | 오류 유형 구분 어려움 | 구체적인 예외 처리 |
| 원본 예외 제거 | 발생 원인 추적 어려움 | Cause 보존 |
| 자원 종료 누락 | 파일·연결 자원 누수 | try-with-resources |
| 불필요한 중복 로깅 | 동일 오류가 여러 번 기록됨 | 적절한 계층에서 기록 |

**잘못된 예외 처리**

```java
try {
    process();

} catch (Exception e) {
    // 아무것도 하지 않음
}
```

**예외 원인을 보존하는 방법**

```java
try {
    readFile();

} catch (java.io.IOException e) {
    throw new RuntimeException("파일 처리 실패", e);
}
```

**자원 관리**

```java
try (java.io.FileReader reader =
        new java.io.FileReader("test.txt")) {

    System.out.println(reader.read());

} catch (java.io.IOException e) {
    System.out.println("파일 처리 오류");
}
```

**주의사항**

- 복구가 불가능한 예외를 무조건 catch할 필요는 없다.
- 예외를 전파하거나 처리할 위치를 명확하게 정해야 한다.
- 이미 상위 계층에서 로깅하는 경우 중복 기록에 주의한다.
- 외부 자원은 사용 후 적절하게 정리해야 한다.

---

### 10. 중첩 클래스(Nested Class)의 개념

중첩 클래스는 하나의 클래스 내부에 다른 클래스를 선언하는 구조이다.

**중첩 클래스를 사용하는 이유**

- 관련된 클래스를 하나의 구조로 묶는다.
- 외부에 불필요한 타입과 구현을 숨긴다.
- 특정 클래스와 밀접한 보조 기능을 정의한다.
- 프로그램의 응집도와 유지보수성을 높일 수 있다.

**일반적인 클래스 구성**

```java
class Car {
}

class Engine {
}
```

**중첩 클래스 구성**

```java
class Car {

    class Engine {
    }
}
```

**구조 비교**

```text
[일반 클래스]

Car             Engine
 │                 │
 ▼                 ▼
독립적인 타입    독립적인 타입


[중첩 클래스]

       Car
        │
        └── Engine
             │
             └── Car 내부에 선언된 타입
```

**중첩 클래스의 주요 특징**

- 외부 클래스와 관련성이 높은 타입을 내부에 정의한다.
- 필요에 따라 외부 클래스의 private 멤버에 접근할 수 있다.
- 외부에 공개할 필요가 없는 구현을 감출 수 있다.
- 중첩 클래스도 일반 클래스처럼 필드, 메서드, 생성자 등을 가질 수 있다.

**주의 : 클래스를 내부에 선언하는 것과 외부 객체가 해당 객체를 필드로 소유하는 것은 다른 개념이다.**

### 11. 중첩 클래스의 네 가지 종류

중첩 클래스는 선언 위치와 외부 객체와의 관계에 따라 네 가지 유형으로 구분한다.

| 종류 | 선언 위치 | 특징 |
|---|---|---|
| 인스턴스 멤버 클래스 | 클래스 내부 | 외부 객체와 연결 |
| 정적 중첩 클래스 | 클래스 내부 | 외부 객체 없이 사용 가능 |
| 지역 클래스 | 메서드·블록 내부 | 선언된 범위에서 사용 |
| 익명 클래스 | 객체 생성 표현식 | 이름 없는 일회성 구현 |

**전체 구조**

```text
        Nested Class
             │
     ┌───────┴────────┐
     │                │
     ▼                ▼
  멤버 클래스       지역 클래스
     │                │
  ┌──┴──────┐         │
  │         │         ▼
  ▼         ▼      Local Class
Instance  Static
  │
  └── 외부 객체와 연결

익명 클래스
  └── 이름 없이 클래스 구현과 객체 생성
```

**주요 선택 기준**

- 외부 객체의 상태가 필요하다면 인스턴스 멤버 클래스를 고려한다.
- 외부 객체 없이 사용할 보조 타입이라면 정적 중첩 클래스를 고려한다.
- 특정 메서드에서만 필요한 타입이라면 지역 클래스를 고려한다.
- 일회성 구현이 필요하다면 익명 클래스를 고려한다.

※ Java의 엄밀한 용어에서 정적 중첩 클래스는 Nested Class이지만 Inner Class에는 포함되지 않는다.

### 12. 인스턴스 멤버 클래스(Instance Member Class)

인스턴스 멤버 클래스는 외부 클래스의 객체와 연결되어 동작하는 내부 클래스이다.

**특징**

- 외부 객체와 연결된 인스턴스를 생성한다.
- 외부 클래스의 인스턴스 필드 및 메서드에 접근할 수 있다.
- 외부 클래스의 `private` 멤버에도 접근할 수 있다.
- 일반적으로 외부 객체를 통해 생성한다.

**Java 예제**

```java
class Car {

    private String model = "Sonata";

    class Engine {

        void start() {
            System.out.println(model + " 엔진 작동");
        }
    }
}
```

**객체 생성**

```java
Car car = new Car();

Car.Engine engine = car.new Engine();

engine.start();
```

**실행 결과**

```text
Sonata 엔진 작동
```

**메모리 참조 개념**

```text
       Car 객체
    ┌──────────────┐
    │ model        │
    │ "Sonata"     │
    └──────┬───────┘
           │
     외부 객체 연결
           │
           ▼
       Engine 객체
    ┌──────────────┐
    │ start()      │
    └──────────────┘
```

**핵심**

- `car.new Engine()`으로 외부 객체와 연결된 내부 객체를 생성한다.
- 내부 클래스는 연결된 외부 객체의 상태를 사용할 수 있다.
- 외부 객체마다 다른 상태를 가진 내부 클래스 객체를 생성할 수 있다.

### 13. 정적 중첩 클래스(Static Nested Class)

정적 중첩 클래스는 외부 클래스 내부에 `static` 키워드로 선언하는 클래스이다.

**특징**

- 외부 클래스의 인스턴스 없이 생성할 수 있다.
- 외부 객체에 자동으로 연결되지 않는다.
- 외부 클래스의 정적 멤버에 직접 접근할 수 있다.
- 외부 인스턴스 멤버를 사용하려면 별도의 객체 참조가 필요하다.

**Java 예제**

```java
class Car {

    private static String manufacturer = "Hyundai";

    static class Engine {

        void start() {
            System.out.println(manufacturer + " 엔진 작동");
        }
    }
}
```

**객체 생성**

```java
Car.Engine engine = new Car.Engine();

engine.start();
```

**실행 결과**

```text
Hyundai 엔진 작동
```

**인스턴스 멤버 클래스와 비교**

| 구분 | 인스턴스 멤버 클래스 | 정적 중첩 클래스 |
|---|---|---|
| static 키워드 | 사용하지 않음 | 사용 |
| 외부 객체 | 필요 | 불필요 |
| 외부 객체와 연결 | 있음 | 없음 |
| 외부 인스턴스 필드 직접 접근 | 가능 | 불가능 |
| 주요 용도 | 외부 상태와 관련된 기능 | DTO, Builder, 보조 타입 |

**핵심**

```java
// 인스턴스 멤버 클래스
Outer.Inner a = outer.new Inner();

// 정적 중첩 클래스
Outer.Nested b = new Outer.Nested();
```

위 코드는 `Outer` 클래스에 각각 `Inner`, `Nested`가 선언되어 있다고 가정한 생성 문법이다.

### 14. 지역 클래스(Local Class)

지역 클래스는 메서드나 블록 내부에 선언하는 클래스이다.

**특징**

- 선언된 블록의 유효 범위 안에서 클래스 이름을 사용할 수 있다.
- 특정 메서드에 필요한 보조 타입을 구현할 수 있다.
- 외부 클래스의 접근 가능한 멤버를 사용할 수 있다.
- 지역 변수를 참조할 때는 `final` 또는 사실상 final이어야 한다.

**Java 예제**

```java
class Car {

    void drive() {

        String message = "주행 중";

        class Engine {

            void start() {
                System.out.println(message);
            }
        }

        Engine engine = new Engine();

        engine.start();
    }
}
```

**사용 예제**

```java
Car car = new Car();

car.drive(); // 주행 중
```

**지역 클래스의 유효 범위**

```text
      drive() 메서드
             │
             ▼
     Local Class 선언
             │
             ▼
       객체 생성 가능
             │
             ▼
       메서드 종료
             │
             ▼
   지역 클래스 이름의 범위 종료
```

**주의사항**

- 지역 클래스의 이름은 선언된 범위 밖에서 사용할 수 없다.
- 생성된 객체는 다른 곳에 참조가 남아 있다면 메서드 종료 후에도 존재할 수 있다.
- 지역 클래스를 이용해 캡처한 지역 변수는 `final` 또는 사실상 final이어야 한다.

### 15. final과 Effectively Final

지역 클래스와 익명 클래스는 외부 메서드의 지역 변수를 참조할 수 있다.

이때 참조하는 지역 변수는 `final`이거나 사실상 final(Effectively Final)이어야 한다.

**final 변수**

```java
final int number = 10;
```

**Effectively Final 변수**

```java
int number = 10;

// 이후 number에 다른 값을 대입하지 않으면
// 사실상 final로 취급할 수 있다.
```

**지역 클래스 예제**

```java
public static void execute() {

    int number = 10;

    class Local {

        void print() {
            System.out.println(number);
        }
    }

    Local local = new Local();

    local.print();
}
```

**변경할 수 없는 이유**

```java
int number = 10;

class Local {

    void print() {
        System.out.println(number);
    }
}

// number = 20;
// 위 재대입을 활성화하면 컴파일 오류 발생
```

**핵심**

- 캡처한 지역 변수는 `final` 또는 사실상 final이어야 한다.
- 내부 클래스가 사용할 수 있도록 지역 변수의 값이 캡처된다.
- 외부 클래스의 인스턴스 필드나 정적 필드는 지역 변수 캡처 규칙과 다르게 동작한다.

### 16. 익명 클래스(Anonymous Class)

익명 클래스는 별도의 클래스 이름을 선언하지 않고, 클래스 상속이나 인터페이스 구현과 객체 생성을 하나의 표현식으로 작성하는 방식이다.

**사용 목적**

- 한 번만 필요한 구현 작성
- 이벤트 처리
- 간단한 콜백 구현
- 별도 클래스 선언이 불필요한 경우

**인터페이스 선언**

```java
interface Robot {

    void action();
}
```

**익명 클래스 구현**

```java
Robot robot = new Robot() {

    @Override
    public void action() {
        System.out.println("로봇 작동");
    }
};

robot.action();
```

**실행 결과**

```text
로봇 작동
```

**일반 클래스와 비교**

```text
[일반 클래스]

인터페이스 정의
      │
      ▼
구현 클래스 선언
      │
      ▼
객체 생성
      │
      ▼
메서드 호출


[익명 클래스]

인터페이스 정의
      │
      ▼
익명 구현 클래스와
객체 생성
      │
      ▼
메서드 호출
```

**주의사항**

- 익명 클래스는 인터페이스 구현과 클래스 상속에 사용할 수 있다.
- 직접 이름을 선언하지 않는다.
- 일반적인 생성자를 직접 선언할 수 없다.
- 반복적으로 사용하거나 구현이 복잡하다면 별도 클래스를 고려하는 것이 좋다.

### 17. 익명 클래스와 람다식의 관계

익명 클래스와 람다식은 간단한 동작을 전달할 때 사용할 수 있지만 서로 동일한 개념은 아니다.

**익명 클래스**

```java
Runnable task = new Runnable() {

    @Override
    public void run() {
        System.out.println("작업 실행");
    }
};
```

**람다식**

```java
Runnable task = () -> {
    System.out.println("작업 실행");
};
```

**주요 차이점**

| 구분 | 익명 클래스 | 람다식 |
|---|---|---|
| 문법 | 클래스 본문 작성 | 람다 표현식 |
| 구현 대상 | 클래스 또는 인터페이스 | 함수형 인터페이스 |
| 코드 길이 | 상대적으로 김 | 상대적으로 간결 |
| this | 익명 클래스의 객체 | 외부 문맥의 this |
| 사용 목적 | 일회성 클래스 구현 | 간단한 동작 전달 |

**핵심**

- 람다식은 추상 메서드가 하나인 함수형 인터페이스에 사용할 수 있다.
- 모든 인터페이스에 람다식을 사용할 수 있는 것은 아니다.
- 익명 클래스는 필요에 따라 여러 메서드를 구현할 수 있다.
- 람다식은 함수형 인터페이스의 동작을 간결하게 표현한다.

### 18. 중첩 클래스의 접근 규칙

중첩 클래스의 종류에 따라 외부 클래스의 멤버에 접근하는 방법이 달라진다.

| 구분 | 외부 static 멤버 | 외부 인스턴스 멤버 |
|---|---|---|
| 인스턴스 멤버 클래스 | 가능 | 직접 접근 가능 |
| 정적 중첩 클래스 | 가능 | 객체 참조 필요 |
| 지역 클래스 | 가능 | 선언 문맥에 따라 가능 |
| 익명 클래스 | 가능 | 선언 문맥에 따라 가능 |

**정적 중첩 클래스의 접근 예제**

```java
class Outer {

    private int value = 10;
    private static int count = 20;

    static class Nested {

        void print() {

            System.out.println(count); // 가능

            // System.out.println(value);
            // 외부 인스턴스 없이 직접 접근 불가

            Outer outer = new Outer();

            System.out.println(outer.value); // 가능
        }
    }
}
```

**핵심**

- 정적 중첩 클래스에는 연결된 외부 인스턴스가 없다.
- 외부 인스턴스의 멤버를 사용하려면 객체 참조가 필요하다.
- 지역 클래스와 익명 클래스는 캡처하는 지역 변수의 재대입 여부를 확인해야 한다.

### 19. 정적 중첩 클래스와 DTO

DTO(Data Transfer Object)는 계층이나 시스템 사이에 데이터를 전달하기 위한 객체이다.

정적 중첩 클래스는 특정 데이터 구조와 관련된 DTO를 논리적으로 묶는 데 사용할 수 있다.

**Java 예제**

```java
class ApiResponse {

    private final String message;

    ApiResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public static class Data {

        private final Long id;
        private final String name;

        public Data(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}
```

**객체 생성**

```java
ApiResponse.Data data =
    new ApiResponse.Data(1L, "홍길동");
```

**정적 중첩 클래스를 사용하는 이유**

- 외부 객체 없이 내부 데이터 타입을 생성할 수 있다.
- 관련된 데이터 구조를 하나의 클래스 아래에 묶을 수 있다.
- 외부 클래스의 불필요한 인스턴스 참조를 만들지 않는다.

**주의**

- DTO가 반드시 정적 중첩 클래스여야 하는 것은 아니다.
- 독립적으로 사용할 DTO라면 일반 클래스나 record도 적합하다.
- 중첩 클래스는 논리적으로 밀접한 관계가 있을 때 선택한다.

### 20. 정적 중첩 클래스와 Builder 패턴

Builder 패턴은 객체 생성에 필요한 데이터를 단계적으로 설정하고, 마지막에 객체를 생성하는 방식이다.

**Builder를 사용하는 이유**

- 생성자 매개변수가 많을 때 가독성 향상
- 선택적인 데이터 설정 용이
- 필드의 의미를 메서드 이름으로 표현
- 생성 과정에서 유효성 검사 가능

**Java 예제**

```java
class Member {

    private final String name;
    private final int age;

    private Member(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public static class Builder {

        private String name;
        private int age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Member build() {
            if (name == null || name.isBlank()) {
                throw new IllegalStateException(
                    "이름은 필수입니다."
                );
            }

            return new Member(this);
        }
    }
}
```

**객체 생성**

```java
Member member = new Member.Builder()
    .name("홍길동")
    .age(25)
    .build();
```

**Builder 실행 구조**

```text
      Member.Builder 생성
               │
               ▼
          name() 설정
               │
               ▼
           age() 설정
               │
               ▼
            build()
               │
               ▼
          유효성 검사
               │
               ▼
         Member 객체 생성
```

**핵심**

- Builder는 외부 Member 인스턴스 없이 생성되어야 한다.
- 따라서 정적 중첩 클래스가 적합하다.
- `build()`는 설정된 값을 이용하여 최종 객체를 생성한다.
- 생성된 객체는 필요한 경우 불변 객체로 설계할 수 있다.

### 21. 중첩 클래스와 Java 모듈의 차이

중첩 클래스와 모듈(Module)은 모두 프로그램 구조화에 관련되지만 서로 다른 개념이다.

**중첩 클래스**

- 하나의 클래스 내부에 다른 클래스를 선언한다.
- 클래스와 관련된 타입을 논리적으로 묶는다.
- 코드의 응집도와 캡슐화를 높이는 데 활용한다.

**모듈(Module)**

- 여러 패키지를 하나의 논리적 단위로 구성한다.
- Java 9에서 Java Platform Module System이 도입되었다.
- `module-info.java`를 이용해 의존성과 공개 패키지 등을 선언할 수 있다.

**구조 비교**

```text
모듈 (Module)
       │
       ├── 패키지 A
       │      │
       │      └── 일반 클래스
       │               │
       │               └── 중첩 클래스
       │
       └── 패키지 B
              │
              └── 일반 클래스
```

**핵심**

- 중첩 클래스는 클래스 내부의 타입 선언 구조이다.
- 패키지는 관련 타입을 관리하는 이름 공간이다.
- 모듈은 여러 패키지의 의존성과 공개 범위를 관리하는 더 큰 단위이다.

---

### 22. java.lang 패키지의 개념

`java.lang`은 Java 프로그램에서 기본적으로 사용하는 핵심 클래스들이 포함된 패키지이다.

**주요 특징**

- 별도의 import 선언 없이 사용할 수 있다.
- 객체 관리, 문자열 처리, 숫자 변환 등의 기능을 제공한다.
- 시스템 정보, 스레드 및 예외 처리 관련 클래스가 포함되어 있다.

**대표적인 클래스**

| 클래스 | 주요 역할 |
|---|---|
| Object | 모든 클래스의 최상위 부모 |
| String | 문자열 처리 |
| StringBuilder | 변경 가능한 문자열 처리 |
| Integer | 정수 래퍼 클래스 |
| Double | 실수 래퍼 클래스 |
| Character | 문자 관련 기능 |
| Math | 수학 계산 |
| System | 표준 입출력 및 시스템 기능 |
| Runtime | JVM 실행 환경 정보 |
| Thread | 스레드 실행 |
| Throwable | 예외 및 오류의 최상위 클래스 |
| Class | 런타임 클래스 정보 |
| Comparable | 객체의 자연 정렬 순서 정의 |

### 23. Object 클래스

`Object`는 Java의 모든 클래스가 직간접적으로 상속하는 최상위 클래스이다.

**주요 메서드**

| 메서드 | 역할 |
|---|---|
| `equals()` | 객체의 동등성 비교 |
| `hashCode()` | 객체의 해시 코드 반환 |
| `toString()` | 객체의 문자열 표현 반환 |
| `getClass()` | 객체의 런타임 타입 정보 반환 |

**Java 예제**

```java
Object obj = new Object();

System.out.println(obj.toString());
System.out.println(obj.hashCode());
System.out.println(obj.getClass().getName());
```

**equals()와 ==**

```java
String a = new String("Java");
String b = new String("Java");

System.out.println(a == b);      // false
System.out.println(a.equals(b)); // true
```

**핵심**

- `==`는 참조 타입에서 두 참조값의 동일성을 비교한다.
- `equals()`는 클래스에서 정의한 동등성 기준으로 비교한다.
- Object의 기본 equals() 구현은 참조 동일성을 비교한다.
- String은 내용을 비교하도록 equals()를 재정의한다.

### 24. String과 StringBuilder

**String**

- 문자열을 표현하는 클래스이다.
- 불변(Immutable) 객체이다.
- 문자열 내용을 변경하는 연산은 새로운 문자열 결과를 만든다.

**StringBuilder**

- 변경 가능한 문자열을 관리한다.
- 문자열의 추가·수정·삭제 등의 작업에 사용한다.
- 반복적인 문자열 변경에 유리하다.

**String 예제**

```java
String text = "Hello";

text += " Java";

System.out.println(text); // Hello Java
```

**StringBuilder 예제**

```java
StringBuilder sb = new StringBuilder("Hello");

sb.append(" Java");

System.out.println(sb.toString()); // Hello Java
```

**비교**

| 구분 | String | StringBuilder |
|---|---|---|
| 객체 특성 | 불변 | 가변 |
| 문자열 변경 | 새로운 결과 문자열 | 기존 Builder의 내용 변경 |
| 주요 용도 | 일반적인 문자열 처리 | 반복적인 문자열 조합 |
| 스레드 동기화 | 불변성으로 내용 변경 없음 | 자체적으로 동기화하지 않음 |

**주의사항**

- StringBuilder는 기본적으로 스레드 안전하지 않다.
- 여러 스레드에서 동일한 Builder를 공유할 때는 동기화 등을 고려해야 한다.
- 일반적인 문자열 처리에 항상 StringBuilder를 사용할 필요는 없다.

### 25. Wrapper 클래스와 Math

Wrapper 클래스는 기본형 데이터를 객체 형태로 다룰 수 있게 하는 클래스이다.

**대표적인 Wrapper 클래스**

| 기본형 | Wrapper 클래스 |
|---|---|
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

**문자열을 정수로 변환**

```java
int number = Integer.parseInt("100");

System.out.println(number); // 100
```

**오토박싱과 언박싱**

```java
Integer boxed = 100; // 오토박싱

int number = boxed;  // 언박싱
```

**Math 클래스**

| 메서드 | 역할 |
|---|---|
| `abs()` | 절댓값 |
| `max()` | 최댓값 |
| `min()` | 최솟값 |
| `sqrt()` | 제곱근 |
| `pow()` | 거듭제곱 |
| `random()` | 난수 생성 |

```java
System.out.println(Math.abs(-10));      // 10
System.out.println(Math.max(10, 20));   // 20
System.out.println(Math.sqrt(16));      // 4.0
```

**핵심**

- Wrapper 클래스는 기본형을 객체로 다루거나 변환할 때 사용한다.
- `parseInt()` 등은 문자열을 숫자로 변환한다.
- `Math`는 객체 생성 없이 정적 메서드로 수학 기능을 제공한다.

### 26. System, Runtime, Thread와 Class

**System 클래스**

표준 입출력과 시스템 관련 기능을 제공한다.

```java
System.out.println("Hello");

long time = System.currentTimeMillis();

System.out.println(time);
```

**Runtime 클래스**

현재 JVM 실행 환경의 일부 정보를 조회할 수 있다.

```java
Runtime runtime = Runtime.getRuntime();

System.out.println(runtime.availableProcessors());

System.out.println(runtime.maxMemory());
```

**Thread 클래스**

스레드를 생성하고 실행하는 기능을 제공한다.

```java
Thread thread = new Thread(() -> {
    System.out.println("스레드 실행");
});

thread.start();
```

**Class 클래스**

객체나 타입의 런타임 정보를 확인하는 데 사용한다.

```java
String text = "Java";

Class<?> type = text.getClass();

System.out.println(type.getName());
// java.lang.String
```

**Comparable 인터페이스**

객체의 자연 정렬 순서를 정의하기 위한 인터페이스이다.

```java
class Student implements Comparable<Student> {

    private int score;

    Student(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.score, other.score);
    }
}
```

**핵심**

- System : 표준 입출력과 시스템 기능
- Runtime : JVM 실행 환경 정보
- Thread : 스레드 실행
- Class : 런타임 타입 정보
- Comparable : 객체의 기본 정렬 기준

### 27. 중첩 클래스와 표준 라이브러리 활용 시 주의사항

| 주의사항 | 설명 |
|---|---|
| 중첩 클래스 남용 | 관련성이 낮은 타입은 별도 클래스로 분리 |
| 인스턴스 멤버 클래스 | 외부 객체와의 연결 관계 확인 |
| 정적 중첩 클래스 | 외부 인스턴스 멤버 직접 접근 불가 |
| 지역 클래스 | 선언된 블록 내부에서만 이름 사용 가능 |
| 지역 변수 캡처 | final 또는 사실상 final 조건 필요 |
| 익명 클래스 | 이름이 없으며 일반적인 생성자 선언 불가 |
| 람다식 | 함수형 인터페이스에서만 사용 가능 |
| DTO 설계 | 모든 DTO가 중첩 클래스일 필요 없음 |
| Builder | 객체 생성 과정에서 필요한 데이터 검증 |
| java.lang | 별도 import 없이 타입 사용 가능 |
| Object.equals() | 기본 동작과 클래스별 재정의 구분 |
| String | 불변 객체라는 특징 이해 |
| StringBuilder | 가변 객체이며 동시 접근 주의 |
| Wrapper | null 언박싱 시 NullPointerException 가능 |
| Math.random() | 보안용 난수로 사용하지 않음 |
| Thread | start()와 run()의 차이 구분 |
| Runtime | JVM 메모리 정보와 시스템 전체 메모리 구분 |

### ✅ Day19 핵심 정리

| 학습 내용 | 핵심 개념 |
|---|---|
| Exception Handling | 비정상적인 실행 상황 처리 |
| Throwable | 예외와 오류의 최상위 타입 |
| Error | 일반적으로 복구하기 어려운 심각한 오류 |
| Exception | 프로그램의 예외적 상황 |
| Checked Exception | 컴파일러가 처리 또는 전파 선언 요구 |
| Unchecked Exception | 컴파일러가 처리 강제하지 않음 |
| try-catch-finally | 예외 처리와 정리 작업 |
| Multi-catch | 여러 예외를 공통으로 처리 |
| throw | 예외 객체 발생 |
| throws | 예외 전파 가능성 선언 |
| Exception Propagation | 호출 스택에 따른 예외 전파 |
| Custom Exception | 사용자 정의 예외 |
| GlobalExceptionHandler | 웹 애플리케이션의 공통 예외 처리 |
| Nested Class | 클래스 내부에 선언한 타입 |
| Instance Member Class | 외부 객체와 연결된 내부 클래스 |
| Static Nested Class | 외부 객체 없이 사용 가능한 중첩 클래스 |
| Local Class | 메서드·블록 내부에서 선언 |
| Anonymous Class | 이름 없는 일회성 클래스 구현 |
| Effectively Final | 재대입하지 않는 지역 변수 |
| Lambda | 함수형 인터페이스의 동작 표현 |
| DTO | 데이터 전달을 위한 객체 |
| Builder Pattern | 단계적인 객체 생성 |
| Module | 패키지들을 묶고 의존 관계를 관리하는 단위 |
| java.lang | Java의 기본 핵심 패키지 |
| Object | 모든 클래스의 최상위 부모 |
| String | 불변 문자열 객체 |
| StringBuilder | 변경 가능한 문자열 처리 |
| Wrapper | 기본형의 객체 표현 |
| Math | 정적 수학 계산 기능 |
| System | 표준 입출력 및 시스템 기능 |
| Runtime | JVM 실행 환경 관련 기능 |
| Thread | 스레드 실행 |
| Class | 런타임 타입 정보 |
| Comparable | 객체의 자연 정렬 순서 |

**최종 학습 정리**

- 예외 처리는 비정상적인 실행 상황을 처리하거나 상위 호출자에게 전달하기 위한 기능이다.
- Checked Exception과 Unchecked Exception은 컴파일러의 처리 강제 여부가 다르다.
- throw는 예외 객체를 발생시키고 throws는 예외 전파 가능성을 선언한다.
- 예외는 호출 스택을 따라 상위 메서드로 전파될 수 있다.
- 사용자 정의 예외를 이용하면 비즈니스 규칙 위반을 명확하게 표현할 수 있다.
- Spring Boot에서는 전역 예외 처리기를 이용하여 공통 HTTP 오류 응답을 구성할 수 있다.
- 중첩 클래스는 관련된 클래스를 하나의 논리적 구조로 묶는 방법이다.
- 인스턴스 멤버 클래스는 외부 객체와 연결된다.
- 정적 중첩 클래스는 외부 인스턴스 없이 생성할 수 있다.
- 지역 클래스는 메서드나 블록 내부에서 선언하고 사용한다.
- 익명 클래스는 이름 없이 클래스 구현과 객체 생성을 함께 작성한다.
- 지역 클래스와 익명 클래스가 캡처하는 지역 변수는 final 또는 사실상 final이어야 한다.
- 람다식은 함수형 인터페이스를 간결하게 구현하는 문법이다.
- 정적 중첩 클래스는 DTO와 Builder 패턴에 활용할 수 있다.
- 중첩 클래스는 객체를 자동으로 포함하거나 소유하는 관계를 의미하지 않는다.
- java.lang 패키지는 Java에서 기본적으로 사용하는 핵심 클래스들을 제공한다.
- Object는 모든 클래스의 최상위 부모이다.
- String은 불변이고 StringBuilder는 변경 가능한 문자열을 관리한다.
- Wrapper 클래스는 기본형 데이터를 객체로 다룰 수 있게 한다.
- Math, System, Runtime, Thread는 수학 계산, 시스템 기능, JVM 환경 및 스레드 실행을 지원한다.
- 객체지향 설계에서는 관련성을 높이고 불필요한 외부 노출을 줄이도록 적절한 클래스 구조를 선택하는 것이 중요하다.

</details>


## Day20. Java 1권 핵심 복습 및 표준 라이브러리
<details>

### 🎯 학습 목표
- Java 1권에서 학습한 핵심 개념을 전체적으로 복습한다.
- JDK, JRE, JVM의 역할과 Java 프로그램의 실행 과정을 이해한다.
- 기본형과 참조형, 변수의 종류 및 메모리 구조를 구분한다.
- 클래스, 객체, 생성자와 객체지향의 핵심 원리를 이해한다.
- 캡슐화, 상속, 다형성, 인터페이스의 관계를 정리한다.
- VO와 DTO의 목적 및 차이를 이해한다.
- Java 표준 라이브러리와 `java.lang` 패키지의 역할을 이해한다.
- `Object` 클래스의 주요 메서드를 이해한다.
- `String`의 불변성과 문자열 처리 메서드를 익힌다.
- `StringBuilder`와 `StringBuffer`의 차이를 구분한다.
- Wrapper 클래스와 오토박싱·언박싱을 이해한다.
- `Math`, `Character`, `System`, `Runtime`의 주요 기능을 익힌다.
- 컬렉션, 제네릭, 람다식, Stream API의 기본 구조를 이해한다.
- 멀티스레드, 입출력, JDBC의 동작 구조를 파악한다.
- 학습한 Java 개념이 Spring Boot 개발과 어떻게 연결되는지 이해한다.

---

### 1. Java 프로그램의 실행 구조

Java는 소스 코드를 바이트코드로 컴파일하고, JVM(Java Virtual Machine)을 이용하여 실행하는 언어이다.

**Java 실행 과정**

```text
       Hello.java
       (소스 코드)
            │
            ▼
          javac
       (Java 컴파일러)
            │
            ▼
       Hello.class
        (바이트코드)
            │
            ▼
           JVM
      ┌─────┴──────┐
      │            │
      ▼            ▼
  Interpreter     JIT Compiler
      │            │
      └─────┬──────┘
            │
            ▼
       프로그램 실행
```

**주요 구성 요소**

| 구성 요소 | 역할 |
|---|---|
| JDK | Java 개발 및 컴파일 도구 제공 |
| JRE | Java 애플리케이션 실행 환경 |
| JVM | 바이트코드 실행 및 메모리 관리 |
| javac | Java 소스 코드를 바이트코드로 컴파일 |
| JIT Compiler | 실행 중 자주 사용되는 코드 등을 네이티브 코드로 컴파일 |

**Java 실행의 특징**

- Java 소스 코드는 `.java` 확장자를 가진다.
- 컴파일 결과는 일반적으로 `.class` 파일에 저장된다.
- JVM은 바이트코드를 실행한다.
- 운영체제별로 적합한 JVM을 사용하면 동일한 바이트코드를 실행할 수 있다.
- JVM은 메모리 관리와 가비지 컬렉션(GC) 등의 기능을 제공한다.

**핵심**

Java의 플랫폼 독립성은 운영체제에서 직접 실행하는 기계어 대신 JVM이 이해하는 바이트코드를 사용한다는 특징에서 나온다.

### 2. 기본형(Primitive Type)과 참조형(Reference Type)

Java의 자료형은 크게 기본형과 참조형으로 나뉜다.

**기본형**

| 분류 | 자료형 | 설명 |
|---|---|---|
| 정수형 | byte, short, int, long | 정수 저장 |
| 실수형 | float, double | 실수 저장 |
| 문자형 | char | UTF-16 코드 단위 저장 |
| 논리형 | boolean | true 또는 false |

**참조형**

- 배열(Array)
- 클래스(Class)
- 인터페이스(Interface)
- 문자열(String)
- 열거 타입(Enum)

**기본형과 참조형의 차이**

```java
int number = 100;

String name = "Java";
```

```text
[기본형]

number
   │
   ▼
  100

변수에 실제 값 저장


[참조형]

name
   │
   ▼
 참조값 ──────────► String 객체
                    "Java"

변수에 객체를 참조하는 값 저장
```

**주의사항**

- 기본형은 실제 값을 저장한다.
- 참조형은 객체를 참조하는 값을 저장한다.
- 참조형 변수에는 `null`을 저장할 수 있다.
- `null` 참조로 인스턴스 멤버에 접근하면 `NullPointerException`이 발생할 수 있다.

### 3. 변수의 종류와 생명주기

Java 변수는 선언 위치와 `static` 여부에 따라 구분한다.

| 구분 | 지역 변수 | 인스턴스 변수 | 정적 변수 |
|---|---|---|---|
| 선언 위치 | 메서드·블록 내부 | 클래스 내부 | 클래스 내부 |
| static | 해당 없음 | 없음 | 있음 |
| 소속 | 실행 중인 블록 | 객체 | 클래스 |
| 초기화 | 직접 초기화 필요 | 기본값으로 자동 초기화 | 기본값으로 자동 초기화 |
| 주요 용도 | 임시 작업 데이터 | 객체별 고유 상태 | 클래스 공통 데이터 |

**Java 예제**

```java
class Student {

    static String school = "Java School";

    String name;

    void study() {
        int hours = 2;

        System.out.println(name);
        System.out.println(hours);
    }
}
```

**변수별 특징**

- 지역 변수 : 메서드나 블록이 실행되는 동안 필요한 값을 관리한다.
- 인스턴스 변수 : 객체마다 독립적인 값을 관리한다.
- 정적 변수 : 같은 클래스에서 선언한 하나의 필드를 여러 객체가 공유한다.

**주의**

- 정적 변수는 객체마다 새로 만들어지지 않는다.
- 정적 변수라고 해서 자동으로 스레드 안전성이 보장되는 것은 아니다.
- 지역 변수는 사용하기 전에 확실하게 초기화되어 있어야 한다.

### 4. 제어문과 배열

제어문은 프로그램의 실행 흐름을 변경하고, 배열은 같은 타입의 여러 데이터를 관리한다.

**주요 제어문**

| 제어문 | 역할 |
|---|---|
| if / else | 조건에 따른 실행 분기 |
| switch | 값이나 패턴 등에 따른 분기 |
| for | 반복 실행 |
| while | 조건이 참인 동안 반복 |
| do-while | 최소 한 번 실행 후 조건 검사 |
| break | 반복문 또는 switch 종료 |
| continue | 현재 반복을 건너뛰고 다음 반복 진행 |

**배열**

```java
int[] numbers = {10, 20, 30, 40, 50};

for (int number : numbers) {
    System.out.println(number);
}
```

**2차원 배열**

```java
int[][] numbers = {
    {10, 20},
    {30, 40}
};

System.out.println(numbers[0][1]); // 20
```

**배열의 주요 특징**

- 배열의 길이는 생성 후 변경할 수 없다.
- 인덱스는 0부터 시작한다.
- 동일한 배열에서 요소 타입은 같다.
- `length` 필드로 배열 길이를 확인한다.
- 향상된 for문은 배열의 모든 요소를 순회할 때 유용하다.

**핵심**

```text
배열          → 여러 데이터 관리
메서드        → 기능을 하나로 구성
클래스        → 데이터와 기능을 구조화
```

### 5. 클래스(Class)와 객체(Object)

클래스는 객체의 상태와 동작을 정의하는 설계도이며, 객체는 해당 클래스를 바탕으로 생성한 인스턴스이다.

**Java 예제**

```java
class Student {

    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void study() {
        System.out.println(name + " 공부 중");
    }
}
```

**객체 생성**

```java
Student student = new Student("홍길동", 20);

student.study();
```

**실행 과정**

```text
       Student 클래스
            │
            ▼
       new Student()
            │
            ▼
       메모리 할당
            │
            ▼
       생성자 실행
            │
            ▼
        객체 초기화
            │
            ▼
        객체 사용
```

**핵심 개념**

- `class` : 객체의 구조를 정의한다.
- `new` : 새로운 객체를 생성한다.
- 생성자 : 객체 생성 과정에서 초기화 작업을 수행한다.
- `this` : 현재 객체를 참조한다.
- 필드 : 객체의 상태를 저장한다.
- 메서드 : 객체의 기능을 정의한다.

### 6. JVM 메모리 구조

Java 프로그램은 JVM에서 실행되며, 실행 과정에서 여러 메모리 영역을 사용한다.

**주요 런타임 메모리 영역**

```text
                 JVM
                  │
     ┌────────────┼─────────────┐
     │            │             │
     ▼            ▼             ▼
 Method Area     Heap          Stack
     │            │             │
     ▼            ▼             ▼
클래스 관련    객체 및 배열    메서드 호출
메타데이터     인스턴스       프레임
```

| 영역 | 주요 역할 |
|---|---|
| Method Area | JVM이 로드한 클래스 관련 정보 저장 |
| Heap | 생성된 객체와 배열 저장 |
| JVM Stack | 메서드 호출 프레임과 지역 변수 등 관리 |

**참조 변수 예제**

```java
Student s1 = new Student("홍길동", 20);

Student s2 = s1;
```

**참조 관계**

```text
      Stack                  Heap
  ┌──────────┐        ┌────────────────┐
  │ s1       │───────►│ Student 객체   │
  │          │        │ name : 홍길동  │
  │ s2       │───────►│ age  : 20      │
  └──────────┘        └────────────────┘
```

**핵심**

- `s2 = s1`은 객체를 복사하는 것이 아니다.
- 두 참조 변수가 같은 객체를 참조하게 된다.
- 객체를 가리키는 참조가 남지 않으면 GC의 수거 대상이 될 수 있다.
- 메모리의 실제 구현 방식은 JVM에 따라 차이가 있을 수 있다.

### 7. 객체지향 프로그래밍의 3대 특성

객체지향 프로그래밍(OOP)의 핵심 특성은 캡슐화, 상속, 다형성이다.

| 개념 | 의미 | 핵심 목적 |
|---|---|---|
| Encapsulation | 데이터와 기능을 묶고 접근 제한 | 내부 상태 보호 |
| Inheritance | 부모 클래스의 기능 및 상태 상속 | 공통 코드 재사용 |
| Polymorphism | 같은 타입으로 다양한 객체 동작 처리 | 유연한 기능 확장 |

**캡슐화(Encapsulation)**

```java
class Account {

    private int balance;

    public void deposit(int amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException();
        }

        balance += amount;
    }

    public int getBalance() {
        return balance;
    }
}
```

- 필드는 `private`으로 보호한다.
- 공개 메서드를 통해 상태를 변경한다.
- 객체의 유효성 규칙을 유지할 수 있다.

**상속(Inheritance)**

```java
class Animal {

    void eat() {
        System.out.println("먹기");
    }
}

class Dog extends Animal {
}
```

- `extends`로 클래스를 상속한다.
- 자식 클래스는 접근 가능한 부모의 기능을 사용할 수 있다.

**다형성(Polymorphism)**

```java
Animal animal = new Dog();
```

- 부모 타입으로 자식 객체를 참조할 수 있다.
- 오버라이딩된 메서드는 실제 객체 타입에 맞게 실행된다.

### 8. 오버로딩과 오버라이딩

| 구분 | Overloading | Overriding |
|---|---|---|
| 의미 | 같은 이름의 메서드 여러 개 정의 | 상속받은 메서드 재정의 |
| 관계 | 매개변수 목록이 달라야 함 | 상속 관계 필요 |
| 반환 타입 | 반환 타입만으로 구분 불가 | 호환되는 반환 타입 필요 |
| 주요 목적 | 다양한 입력 처리 | 객체별 동작 변경 |

**오버로딩**

```java
void print(int value) {
    System.out.println(value);
}

void print(String value) {
    System.out.println(value);
}
```

**오버라이딩**

```java
class Animal {

    void sound() {
        System.out.println("동물 소리");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("멍멍");
    }
}
```

**업캐스팅과 다운캐스팅**

```java
Animal animal = new Dog(); // 업캐스팅

if (animal instanceof Dog dog) {
    dog.sound();
}
```

**핵심**

- 업캐스팅은 자식 타입을 부모 타입으로 다루는 것이다.
- 다운캐스팅은 부모 타입 참조를 구체적인 자식 타입으로 변환한다.
- 잘못된 다운캐스팅은 `ClassCastException`을 발생시킨다.
- `instanceof`로 실제 타입을 검사할 수 있다.

### 9. 인터페이스와 추상 클래스

추상 클래스와 인터페이스는 공통 기능이나 규약을 정의하기 위해 사용한다.

| 구분 | 추상 클래스 | 인터페이스 |
|---|---|---|
| 선언 | abstract class | interface |
| 관계 | extends | implements |
| 클래스 다중 상속 | 불가능 | 여러 인터페이스 구현 가능 |
| 인스턴스 필드 | 가능 | 불가능 |
| 생성자 | 가능 | 불가능 |
| 구현 메서드 | 가능 | default/static/private 메서드 등 가능 |

**인터페이스 예제**

```java
interface Payment {

    void pay(int amount);
}
```

**구현 클래스**

```java
class CardPayment implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println("카드 결제: " + amount);
    }
}

class AccountPayment implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println("계좌 결제: " + amount);
    }
}
```

**다형성 활용**

```java
Payment payment = new CardPayment();

payment.pay(10000);
```

**핵심**

- 인터페이스는 서로 다른 클래스가 공통으로 따를 규약을 정의한다.
- 추상 클래스는 관련 클래스의 공통 상태와 구현을 공유하는 데 사용할 수 있다.
- 인터페이스에 의존하면 구현 클래스를 교체하기 쉬워진다.
- 이러한 원리는 Spring의 의존성 주입(DI)에서도 중요하다.

### 10. VO와 DTO의 차이

VO와 DTO는 데이터를 다루는 객체이지만 설계 목적이 다르다.

| 구분 | VO | DTO |
|---|---|---|
| 전체 이름 | Value Object | Data Transfer Object |
| 목적 | 의미 있는 값 표현 | 계층 간 데이터 전달 |
| 동등성 | 값 기반 동등성 중요 | 전달 목적에 따라 설계 |
| 불변성 | 일반적으로 불변 설계 선호 | 가변 또는 불변 모두 가능 |
| 활용 예 | Money, Address | MemberRequest, MemberResponse |

**VO 예제**

```java
public record Money(int amount) {

    public Money {
        if (amount < 0) {
            throw new IllegalArgumentException(
                "금액은 음수일 수 없습니다."
            );
        }
    }
}
```

**DTO 예제**

```java
public record MemberResponse(
    Long id,
    String name
) {}
```

**핵심**

- VO는 값 자체의 의미와 동등성을 표현한다.
- DTO는 데이터를 다른 계층이나 시스템으로 전달한다.
- 두 개념은 반드시 클래스 내부 구조만으로 결정되지 않는다.
- Java의 `record`는 간단한 불변 데이터 객체를 작성할 때 유용하다.

---

### 11. Java 표준 라이브러리(Standard Library)

Java 표준 라이브러리는 Java에서 기본적으로 제공하는 클래스, 인터페이스 및 유틸리티의 집합이다.

**주요 패키지**

| 패키지 | 주요 기능 |
|---|---|
| `java.lang` | 문자열, 객체, 수학, 예외, 스레드 등 |
| `java.util` | 컬렉션, Scanner, 유틸리티 |
| `java.io` | 스트림 기반 입출력 |
| `java.nio` | 버퍼, 파일, 비동기 I/O 등 |
| `java.time` | 날짜 및 시간 |
| `java.util.regex` | 정규표현식 |
| `java.net` | 네트워크 통신 |
| `java.sql` | JDBC 데이터베이스 접근 |

**java.lang의 특징**

- Java에서 가장 기본적인 패키지이다.
- 별도의 import 선언 없이 사용할 수 있다.
- `Object`, `String`, `Integer`, `Math`, `System` 등이 포함되어 있다.
- Java 프로그램에서 자주 사용하는 공통 기능을 제공한다.

**사용 예제**

```java
String name = "Java";

int number = Integer.parseInt("100");

int max = Math.max(10, 20);

System.out.println(name);
```

위 예제의 클래스는 모두 `java.lang`에 포함되어 있으므로 별도의 import가 필요하지 않다.

**주의**

- import가 필요 없다는 것은 소스 코드에서 이름을 자동으로 사용할 수 있다는 뜻이다.
- 모든 클래스가 JVM 시작 시점에 객체로 생성된다는 의미는 아니다.
- `java.lang`은 패키지이며 `java.base`는 해당 패키지 등을 포함하는 Java 플랫폼의 기본 모듈이다.

### 12. Object 클래스

`Object`는 Java의 모든 클래스가 직간접적으로 상속하는 최상위 클래스이다.

**주요 메서드**

| 메서드 | 역할 |
|---|---|
| `toString()` | 객체를 문자열로 표현 |
| `equals()` | 객체의 동등성 비교 |
| `hashCode()` | 해시 코드 반환 |
| `getClass()` | 객체의 런타임 클래스 정보 반환 |

**toString()**

```java
class Student {

    private String name = "홍길동";

    @Override
    public String toString() {
        return "Student{name='" + name + "'}";
    }
}
```

```java
Student student = new Student();

System.out.println(student);
```

**실행 결과**

```text
Student{name='홍길동'}
```

**equals()**

```java
String a = new String("Java");
String b = new String("Java");

System.out.println(a == b);      // false
System.out.println(a.equals(b)); // true
```

**비교 기준**

- `==` : 참조 타입에서는 참조값의 동일성 비교
- `equals()` : 클래스가 정의한 동등성 기준으로 비교
- Object의 기본 `equals()` : 참조 동일성 비교
- String의 `equals()` : 문자열 내용 비교

**getClass()**

```java
String text = "Java";

System.out.println(text.getClass().getName());
```

**실행 결과**

```text
java.lang.String
```

**주의**

- equals()를 재정의하여 동등성 기준을 바꾼다면 hashCode()도 일관되게 재정의해야 한다.
- 동일하다고 판단하는 두 객체는 같은 해시 코드를 반환해야 한다.

### 13. String 클래스

`String`은 문자열을 표현하는 클래스이며 불변(Immutable) 객체이다.

**String의 특징**

- 한 번 생성된 문자열 객체의 내용은 변경되지 않는다.
- 문자열 변경 연산은 변경된 내용을 가진 결과 문자열을 반환한다.
- 문자열 비교 시 일반적으로 `equals()`를 사용한다.

**문자열 처리 메서드**

| 메서드 | 역할 |
|---|---|
| `length()` | 문자열 길이 반환 |
| `charAt()` | 지정한 위치의 문자 반환 |
| `substring()` | 문자열 일부 추출 |
| `indexOf()` | 특정 문자나 문자열의 위치 검색 |
| `contains()` | 문자열 포함 여부 확인 |
| `startsWith()` | 시작 문자열 검사 |
| `endsWith()` | 끝 문자열 검사 |
| `equals()` | 문자열 내용 비교 |
| `toUpperCase()` | 대문자 변환 |
| `toLowerCase()` | 소문자 변환 |
| `replace()` | 문자열 치환 |
| `trim()` | 앞뒤 일부 공백 문자 제거 |
| `strip()` | 앞뒤 Unicode 공백 문자 제거 |

**Java 예제**

```java
String text = "Hello Java";

System.out.println(text.length());        // 10
System.out.println(text.charAt(0));       // H
System.out.println(text.substring(6));    // Java
System.out.println(text.indexOf("Java")); // 6
System.out.println(text.contains("Java"));// true
System.out.println(text.startsWith("He"));// true
```

**문자열 변경**

```java
String text = "Java";

String result = text.replace("J", "K");

System.out.println(text);   // Java
System.out.println(result); // Kava
```

**String의 불변성**

```text
         String text
               │
               ▼
           "Java" 객체
               │
        문자열 변경 연산
               │
               ▼
        새 문자열 결과
              "Kava"

기존 String 객체의 내용은 변경되지 않음
```

**주의사항**

- String은 불변이므로 내용이 직접 수정되지 않는다.
- String 메서드의 반환값을 저장하지 않으면 변경 결과를 사용하지 못할 수 있다.
- `length()`는 UTF-16 코드 단위의 개수를 반환한다.
- 빈번한 문자열 조합에서는 StringBuilder를 고려한다.

### 14. StringBuilder와 StringBuffer

`StringBuilder`와 `StringBuffer`는 변경 가능한 문자열을 관리하는 클래스이다.

**비교**

| 구분 | String | StringBuilder | StringBuffer |
|---|---|---|---|
| 불변 여부 | 불변 | 가변 | 가변 |
| 문자열 수정 | 결과 문자열 반환 | 내부 내용 변경 | 내부 내용 변경 |
| 자체 동기화 | 해당 없음 | 없음 | 주요 메서드에 동기화 적용 |
| 주요 용도 | 일반 문자열 | 반복적인 문자열 조합 | 동기화가 필요한 문자열 조작 |

**주요 메서드**

| 메서드 | 기능 |
|---|---|
| `append()` | 문자열 끝에 추가 |
| `insert()` | 지정한 위치에 삽입 |
| `delete()` | 지정한 범위 삭제 |
| `replace()` | 지정한 범위 치환 |
| `reverse()` | 문자 순서 뒤집기 |
| `toString()` | String 결과 반환 |

**Java 예제**

```java
StringBuilder sb = new StringBuilder("Java");

sb.append(" Programming");

System.out.println(sb);
// Java Programming

sb.insert(4, " Language");

System.out.println(sb);
// Java Language Programming

sb.delete(4, 13);

System.out.println(sb);
// Java Programming
```

**반복적인 문자열 조합**

```java
StringBuilder sb = new StringBuilder();

for (int i = 0; i < 5; i++) {
    sb.append(i);
}

String result = sb.toString();

System.out.println(result); // 01234
```

**주의사항**

- StringBuilder는 여러 스레드가 동시에 수정할 때 자체적인 동기화를 제공하지 않는다.
- StringBuffer는 주요 메서드에 동기화를 제공하지만 여러 작업 전체의 원자성까지 자동 보장하지는 않는다.
- 단일 스레드에서 빈번하게 문자열을 변경할 때는 일반적으로 StringBuilder가 적합하다.

### 15. Wrapper 클래스

Wrapper 클래스는 Java 기본형 값을 객체 형태로 다룰 수 있게 하는 클래스이다.

**기본형과 Wrapper**

| 기본형 | Wrapper 클래스 |
|---|---|
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

**오토박싱(Auto-boxing)**

기본형 값을 Wrapper 객체로 자동 변환하는 기능이다.

```java
int number = 100;

Integer boxed = number;
```

**언박싱(Unboxing)**

Wrapper 객체의 값을 기본형으로 자동 변환하는 기능이다.

```java
Integer boxed = 100;

int number = boxed;
```

**문자열을 기본형으로 변환**

```java
int number = Integer.parseInt("100");

double value = Double.parseDouble("12.5");

boolean flag = Boolean.parseBoolean("true");
```

**문자열을 Wrapper 객체로 변환**

```java
Integer number = Integer.valueOf("100");

Double value = Double.valueOf("12.5");
```

**주의사항**

- `parseInt()`는 기본형 `int`를 반환한다.
- `valueOf()`는 Wrapper 객체를 반환한다.
- 잘못된 숫자 문자열을 변환하면 `NumberFormatException`이 발생한다.
- null인 Wrapper 객체를 언박싱하면 `NullPointerException`이 발생한다.
- Wrapper 객체의 값을 비교할 때는 참조 동일성과 값의 동등성을 구분해야 한다.

### 16. Math 클래스

`Math`는 수학 계산에 필요한 정적 메서드와 상수를 제공한다.

**주요 메서드**

| 메서드 | 기능 |
|---|---|
| `abs()` | 절댓값 |
| `max()` | 최댓값 |
| `min()` | 최솟값 |
| `round()` | 반올림 |
| `floor()` | 내림 |
| `ceil()` | 올림 |
| `sqrt()` | 제곱근 |
| `pow()` | 거듭제곱 |
| `random()` | 난수 생성 |

**Java 예제**

```java
System.out.println(Math.abs(-10));     // 10
System.out.println(Math.max(10, 20));  // 20
System.out.println(Math.min(10, 20));  // 10
System.out.println(Math.round(3.5));   // 4
System.out.println(Math.sqrt(16));     // 4.0
System.out.println(Math.pow(2, 3));    // 8.0
```

**난수 생성**

```java
double random = Math.random();
```

- `Math.random()`은 0.0 이상 1.0 미만의 double 값을 반환한다.

**1~10 사이의 정수 생성**

```java
int number = (int) (Math.random() * 10) + 1;
```

**주의사항**

- Math의 주요 메서드는 static이므로 객체를 생성할 필요가 없다.
- `Math.random()`은 보안 목적의 난수 생성에 적합하지 않다.
- 소수점 계산과 정수 변환에서는 형변환에 따른 정밀도 손실을 고려해야 한다.

### 17. Character 클래스

`Character`는 char 값을 객체로 다루거나 문자를 판별하는 기능을 제공한다.

**주요 메서드**

| 메서드 | 기능 |
|---|---|
| `isDigit()` | 숫자 문자 여부 |
| `isLetter()` | 문자 여부 |
| `isWhitespace()` | 공백 문자 여부 |
| `isUpperCase()` | 대문자 여부 |
| `isLowerCase()` | 소문자 여부 |
| `toUpperCase()` | 대문자 변환 |
| `toLowerCase()` | 소문자 변환 |

**Java 예제**

```java
System.out.println(Character.isDigit('5'));
// true

System.out.println(Character.isLetter('A'));
// true

System.out.println(Character.isWhitespace(' '));
// true

System.out.println(Character.toUpperCase('a'));
// A
```

**활용 목적**

- 입력된 문자의 종류를 검사한다.
- 영문 대소문자를 변환한다.
- 문자 기반 데이터 검증에 활용한다.

**핵심**

Character는 하나의 문자 또는 Unicode 코드 포인트에 대한 판별 기능을 제공한다.

### 18. System과 Runtime 클래스

`System`과 `Runtime`은 Java 프로그램의 실행 환경과 관련된 기능을 제공한다.

**System 클래스**

| 기능 | 사용 예 |
|---|---|
| 표준 출력 | System.out.println() |
| 표준 입력 | System.in |
| 표준 오류 | System.err.println() |
| 현재 시간 | System.currentTimeMillis() |
| 시간 측정 | System.nanoTime() |
| 시스템 속성 | System.getProperty() |

**Java 예제**

```java
System.out.println("일반 출력");

System.err.println("오류 출력");

long time = System.currentTimeMillis();

System.out.println(time);
```

**Runtime 클래스**

Runtime은 현재 JVM 실행 환경의 일부 정보를 제공한다.

```java
Runtime runtime = Runtime.getRuntime();

System.out.println(runtime.availableProcessors());
System.out.println(runtime.maxMemory());
System.out.println(runtime.totalMemory());
System.out.println(runtime.freeMemory());
```

**주요 메서드**

| 메서드 | 기능 |
|---|---|
| `getRuntime()` | 현재 JVM의 Runtime 객체 반환 |
| `availableProcessors()` | JVM에서 사용 가능한 프로세서 수 |
| `maxMemory()` | JVM이 사용하려는 최대 힙 메모리 크기 |
| `totalMemory()` | 현재 할당된 힙 메모리 크기 |
| `freeMemory()` | 현재 할당된 힙에서 사용 가능한 메모리 크기 |

**주의사항**

- Runtime의 메모리 정보는 시스템 전체 메모리가 아닌 JVM의 힙 메모리 관련 정보이다.
- `System.currentTimeMillis()`는 현재 시각 정보에 사용한다.
- 실행 시간의 경과를 측정할 때는 일반적으로 `System.nanoTime()`이 적합하다.

### 19. 예외 처리와 java.lang

Java의 예외는 `Throwable`을 최상위 타입으로 하는 계층 구조를 가진다.

**예외 클래스 계층**

```text
             Throwable
                 │
       ┌─────────┴─────────┐
       │                   │
       ▼                   ▼
      Error             Exception
                           │
                   ┌───────┴───────┐
                   │               │
                   ▼               ▼
            Checked Exception  RuntimeException
                                   │
                                   ▼
                            Unchecked Exception
```

**주요 문법 정리**

| 문법 | 역할 |
|---|---|
| try | 예외 발생 가능 코드 실행 |
| catch | 예외 처리 |
| finally | 정리 작업 |
| throw | 예외 직접 발생 |
| throws | 예외 전파 가능성 선언 |

**Java 예제**

```java
public static int divide(int a, int b) {

    if (b == 0) {
        throw new IllegalArgumentException(
            "0으로 나눌 수 없습니다."
        );
    }

    return a / b;
}
```

**핵심**

- 오류 발생 시 적절한 대응 방법을 결정한다.
- 예외 처리가 어려운 경우 상위 호출자에게 전파할 수 있다.
- `Exception`과 `RuntimeException`은 모두 java.lang에 속한다.
- `IOException`, `SQLException`은 각각 java.io와 java.sql에 속한다.
- 예외 처리의 자세한 내용은 Day18~19 학습 내용과 연결된다.

---

### 20. 컬렉션 프레임워크와 제네릭

컬렉션 프레임워크는 여러 데이터를 효율적으로 저장하고 관리하기 위한 인터페이스 및 클래스들의 집합이다.

**주요 컬렉션**

| 구분 | 대표 구현 | 특징 |
|---|---|---|
| List | ArrayList | 순서 유지, 중복 허용 |
| Set | HashSet | 중복 요소 허용하지 않음 |
| Map | HashMap | Key-Value 형태의 데이터 관리 |

**List**

```java
List<String> names = new ArrayList<>();

names.add("Java");
names.add("Spring");

System.out.println(names.get(0));
```

**Set**

```java
Set<String> names = new HashSet<>();

names.add("Java");
names.add("Java");

System.out.println(names.size()); // 1
```

**Map**

```java
Map<Integer, String> users = new HashMap<>();

users.put(1, "홍길동");
users.put(2, "김철수");

System.out.println(users.get(1));
```

※ 위 예제들은 `java.util`의 컬렉션 타입을 import한 환경을 가정한다.

**제네릭(Generic)**

```java
List<String> names = new ArrayList<>();
```

- `<String>`은 컬렉션에 저장할 요소 타입을 지정한다.
- 컴파일 시 타입 안정성을 높인다.
- 불필요한 타입 캐스팅을 줄일 수 있다.

**주의**

- HashSet과 HashMap은 일반적으로 요소의 순서를 보장하지 않는다.
- HashMap은 Key의 중복을 허용하지 않는다.
- 일반적인 제네릭 타입 인자로 int 같은 기본형은 직접 사용할 수 없다.
- 정수 데이터를 저장하려면 `List<Integer>`처럼 Wrapper 타입을 사용한다.

### 21. 람다식과 Stream API

람다식은 함수형 인터페이스의 구현을 간결하게 표현하는 문법이다.

**익명 클래스**

```java
Runnable task = new Runnable() {

    @Override
    public void run() {
        System.out.println("작업 실행");
    }
};
```

**람다식**

```java
Runnable task = () -> {
    System.out.println("작업 실행");
};
```

**Stream API**

Stream API는 데이터의 필터링, 변환, 집계 등의 작업을 파이프라인 방식으로 구성할 수 있도록 제공하는 API이다.

**Stream 처리 흐름**

```text
       List<Integer>
             │
             ▼
          stream()
             │
             ▼
          filter()
       조건에 맞게 필터링
             │
             ▼
           map()
          데이터 변환
             │
             ▼
          average()
          최종 집계
```

**Java 예제**

```java
List<Integer> scores = List.of(70, 85, 90, 95);

double average = scores.stream()
    .filter(score -> score >= 80)
    .mapToInt(Integer::intValue)
    .average()
    .orElse(0);

System.out.println(average); // 90.0
```

**주요 Stream 연산**

| 메서드 | 역할 |
|---|---|
| `filter()` | 조건에 맞는 데이터 선택 |
| `map()` | 데이터 변환 |
| `mapToInt()` | 정수형 Stream으로 변환 |
| `sorted()` | 정렬 |
| `distinct()` | 중복 제거 |
| `count()` | 요소 개수 |
| `average()` | 평균 계산 |
| `collect()` | 결과 수집 |

**핵심**

- 람다식은 함수를 값처럼 다루는 함수형 인터페이스 구현에 활용된다.
- Stream API는 데이터 처리 과정을 단계적으로 구성한다.
- Stream의 중간 연산은 일반적으로 지연 실행된다.
- 최종 연산이 실행되면서 파이프라인이 평가된다.
- Stream은 컬렉션 자체를 자동으로 수정하지 않는다.

### 22. 멀티스레드와 입출력(I/O)

멀티스레딩은 하나의 프로세스에서 여러 스레드를 이용하여 작업을 실행하는 기술이다.

**스레드의 기본 구조**

```text
             Process
                │
       ┌────────┼────────┐
       │        │        │
       ▼        ▼        ▼
    Thread 1 Thread 2 Thread 3
       │        │        │
       └────────┼────────┘
                │
           공유 자원 접근
```

**Thread 예제**

```java
Thread thread = new Thread(() -> {
    System.out.println("스레드 실행");
});

thread.start();
```

**동기화**

```java
class Counter {

    private int count = 0;

    public synchronized void increase() {
        count++;
    }
}
```

- `synchronized`는 지정된 모니터를 통한 상호 배제를 제공한다.
- 공유 자원에 여러 스레드가 접근할 때 경쟁 상태를 방지하는 데 사용할 수 있다.
- 모든 동시성 문제를 자동으로 해결하는 것은 아니다.

**입출력(I/O)**

| 구분 | 주요 클래스 | 처리 단위 |
|---|---|---|
| 바이트 스트림 | InputStream, OutputStream | byte |
| 문자 스트림 | Reader, Writer | char |

**바이트 스트림의 주요 용도**

- 파일 데이터
- 이미지 및 바이너리 데이터
- 네트워크 바이트 송수신

**문자 스트림의 주요 용도**

- 텍스트 파일
- 문자 데이터 읽기 및 쓰기
- 문자 인코딩을 이용한 텍스트 처리

**핵심**

- 서버 프로그램은 여러 작업을 동시에 처리해야 할 수 있다.
- 데이터 공유가 발생하면 동기화 문제를 고려해야 한다.
- I/O는 프로그램과 외부 자원 사이의 데이터 이동을 담당한다.

### 23. JDBC 데이터베이스 프로그래밍

JDBC(Java Database Connectivity)는 Java 프로그램이 관계형 데이터베이스에 접근할 수 있도록 제공하는 API이다.

**JDBC 기본 처리 과정**

```text
        Java Application
               │
               ▼
        1. Connection
          DB 연결 획득
               │
               ▼
     2. PreparedStatement
          SQL 준비
               │
               ▼
          3. Execute
          SQL 실행
               │
               ▼
          4. ResultSet
         조회 결과 처리
               │
               ▼
           5. Close
          자원 정리
```

**주요 인터페이스**

| 인터페이스 | 역할 |
|---|---|
| Connection | DB 연결 및 트랜잭션 관리 |
| PreparedStatement | 매개변수화된 SQL 실행 |
| ResultSet | 조회 결과 탐색 |

**주요 실행 메서드**

| 메서드 | 역할 |
|---|---|
| `executeQuery()` | SELECT 등의 조회 SQL 실행 |
| `executeUpdate()` | INSERT, UPDATE, DELETE 등의 변경 SQL 실행 |
| `execute()` | 다양한 형태의 SQL 실행 |

**핵심**

- JDBC는 Java에서 데이터베이스를 다루는 기본 API이다.
- PreparedStatement는 SQL과 데이터를 분리하여 처리할 수 있다.
- 조회 작업에서는 ResultSet을 이용해 결과를 읽는다.
- 사용이 끝난 Connection, Statement, ResultSet은 적절하게 종료해야 한다.
- `try-with-resources`를 사용하여 자원 정리를 자동화할 수 있다.

### 24. Java 학습 내용과 Spring Boot의 관계

Java의 기본 문법과 객체지향 원리는 Spring Boot에서도 계속 사용된다.

**학습 단계별 연결**

| Java 학습 내용 | Spring Boot 활용 |
|---|---|
| 클래스·객체 | Controller, Service 등의 객체 설계 |
| 인터페이스·다형성 | 의존성 주입(DI) |
| DTO | 요청 및 응답 데이터 전달 |
| 컬렉션 | 여러 데이터 처리 |
| 예외 처리 | 공통 오류 응답 |
| 람다·Stream | 데이터 가공 |
| JDBC | 데이터베이스 접근 |
| 네트워크·I/O | HTTP 요청 및 응답 이해 |

**전체 학습 흐름**

```text
           Java 기초
               │
               ▼
           객체지향
               │
               ▼
        Java 표준 라이브러리
               │
               ▼
       컬렉션 / 제네릭 / Stream
               │
               ▼
        Thread / I/O / JDBC
               │
               ▼
           Spring Boot
               │
       ┌───────┼────────┐
       │       │        │
       ▼       ▼        ▼
   Spring MVC  Spring DI  Data Access
       │       │        │
       └───────┼────────┘
               │
               ▼
          웹 애플리케이션
```

**핵심**

- Spring Boot는 Java와 객체지향 설계를 기반으로 한다.
- 인터페이스와 다형성은 의존성을 분리하는 데 중요하다.
- JDBC는 Spring JDBC, JPA, MyBatis 등을 이해하는 기초가 된다.
- 컬렉션과 Stream API는 서비스 계층의 데이터 처리에 활용할 수 있다.

### 25. Java 기초 및 라이브러리 사용 시 주의사항

| 주의사항 | 핵심 내용 |
|---|---|
| JVM과 JDK 혼동 | JVM은 실행, JDK는 개발 도구 제공 |
| 기본형과 참조형 혼동 | 실제 값과 객체 참조 구분 |
| 참조 변수 복사 | 객체가 아닌 참조값 복사 |
| 지역 변수 초기화 | 사용 전 반드시 초기화 |
| static 변수 | 객체별 값이 아닌 클래스 소속 값 |
| 클래스와 객체 혼동 | 설계도와 실제 인스턴스 구분 |
| 생성자와 메서드 혼동 | 생성자는 반환 타입을 선언하지 않음 |
| == 와 equals() | 참조 동일성과 동등성 구분 |
| equals() 재정의 | hashCode()와 일관성 유지 |
| 오버로딩·오버라이딩 | 매개변수 차이와 상속 재정의 구분 |
| 잘못된 다운캐스팅 | ClassCastException 발생 가능 |
| 인터페이스와 추상 클래스 | 계약과 공통 구현의 목적 구분 |
| String 불변성 | 기존 문자열 객체 내용 변경 불가 |
| StringBuilder | 여러 스레드에서 공유 시 동기화 고려 |
| StringBuffer | 동기화만으로 복합 작업 전체를 보호하지는 않음 |
| Wrapper 언박싱 | null 언박싱 시 NullPointerException |
| 숫자 변환 | NumberFormatException 주의 |
| Math.random() | 보안용 난수로 사용하지 않음 |
| HashSet | 중복 요소 저장 불가 |
| HashMap | Key 중복 불가, 순서 보장 없음 |
| 제네릭 | 기본형 대신 Wrapper 타입 사용 |
| Stream | 중간 연산과 최종 연산 구분 |
| 멀티스레드 | 공유 자원 경쟁 상태 주의 |
| I/O | 자원 종료 및 예외 처리 필요 |
| JDBC | 연결 관리, 트랜잭션, SQL Injection 방지 |
| java.lang | import가 필요 없는 기본 패키지 |

### ✅ Day20 핵심 정리

| 구분 | 핵심 내용 |
|---|---|
| JDK | Java 개발 도구 |
| JRE | Java 실행 환경 |
| JVM | 바이트코드 실행 및 메모리 관리 |
| Primitive Type | 실제 값 저장 |
| Reference Type | 객체 참조값 저장 |
| Local Variable | 메서드·블록 내부 변수 |
| Instance Variable | 객체별 고유 필드 |
| Static Variable | 클래스에 속하는 필드 |
| Array | 고정된 길이의 데이터 집합 |
| Class | 객체 설계도 |
| Object | 클래스로 생성한 인스턴스 |
| Constructor | 객체 초기화 |
| this | 현재 객체 참조 |
| Heap | 객체 및 배열 저장 |
| JVM Stack | 메서드 호출 프레임 관리 |
| Encapsulation | 내부 상태 보호 |
| Inheritance | 상속을 통한 기능 재사용 |
| Polymorphism | 하나의 타입으로 여러 구현 처리 |
| Interface | 공통 규약 정의 |
| Abstract Class | 공통 구현 및 추상 기능 제공 |
| Overloading | 같은 이름, 다른 매개변수 |
| Overriding | 상속 메서드 재정의 |
| VO | 값 중심 객체 |
| DTO | 데이터 전달 객체 |
| java.lang | Java 기본 핵심 패키지 |
| Object | 모든 클래스의 최상위 부모 |
| toString() | 객체의 문자열 표현 |
| equals() | 객체 동등성 비교 |
| hashCode() | 객체의 해시 코드 |
| getClass() | 런타임 타입 정보 |
| String | 불변 문자열 객체 |
| StringBuilder | 변경 가능한 문자열 객체 |
| StringBuffer | 주요 메서드가 동기화된 문자열 객체 |
| Wrapper | 기본형의 객체 표현 |
| Auto-boxing | 기본형을 Wrapper로 자동 변환 |
| Unboxing | Wrapper를 기본형으로 자동 변환 |
| Math | 수학 연산 유틸리티 |
| Character | 문자 판별 및 변환 |
| System | 표준 입출력 및 시스템 기능 |
| Runtime | JVM 실행 환경 정보 |
| Collection | 여러 데이터 관리 |
| Generic | 타입 안정성 및 재사용성 |
| Lambda | 함수형 인터페이스 구현 |
| Stream API | 데이터 처리 파이프라인 |
| Thread | 프로그램 내부의 실행 흐름 |
| I/O | 외부 자원과 데이터 송수신 |
| JDBC | Java 데이터베이스 접근 API |

**최종 학습 정리**

- Java는 소스 코드를 바이트코드로 컴파일하고 JVM에서 실행한다.
- 자료형은 기본형과 참조형으로 구분된다.
- 지역 변수, 인스턴스 변수, 정적 변수는 소속과 생명주기가 다르다.
- 배열은 같은 타입의 여러 데이터를 고정된 길이로 저장한다.
- 클래스는 설계도이며 객체는 클래스를 바탕으로 생성한 인스턴스이다.
- new는 객체를 생성하고 생성자는 객체 초기화를 수행한다.
- JVM의 Heap은 객체를 관리하고 Stack은 메서드 실행 정보를 관리한다.
- 참조 변수의 대입은 객체 복사가 아닌 참조값 복사이다.
- 캡슐화는 객체의 상태를 보호하고 유효성 규칙을 유지한다.
- 상속은 공통 기능을 재사용하고 다형성은 다양한 구현을 유연하게 처리한다.
- 인터페이스는 공통 기능의 규약을 정의하며 여러 클래스에서 구현할 수 있다.
- VO는 값의 의미를 표현하고 DTO는 데이터 전달을 목적으로 한다.
- java.lang은 별도의 import 없이 사용할 수 있는 Java 핵심 패키지이다.
- Object는 Java의 모든 클래스가 직간접적으로 상속하는 최상위 클래스이다.
- ==와 equals()는 참조 동일성과 객체 동등성의 차이를 이해해야 한다.
- String은 불변 객체이며 문자열 변경 메서드는 결과 문자열을 반환한다.
- StringBuilder와 StringBuffer는 변경 가능한 문자열을 관리한다.
- Wrapper 클래스는 기본형 값을 객체 형태로 다루도록 한다.
- Math는 수학 계산을 제공하고 Character는 문자 판별 및 변환을 지원한다.
- System은 표준 입출력 등을 제공하고 Runtime은 JVM 실행 환경 정보를 제공한다.
- 컬렉션은 여러 데이터를 관리하며 List, Set, Map은 서로 다른 특성을 가진다.
- 제네릭은 타입 안정성을 높이고 람다식은 함수형 인터페이스를 간결하게 구현한다.
- Stream API는 데이터를 필터링·변환·집계하는 파이프라인을 구성한다.
- 멀티스레드는 여러 실행 흐름을 제공하며 공유 자원 접근 시 동시성 문제를 고려해야 한다.
- I/O는 파일 및 네트워크 등의 외부 자원과 데이터를 주고받는 기능이다.
- JDBC는 Java 애플리케이션에서 데이터베이스를 사용하는 기본 API이다.
- Java의 객체지향, 컬렉션, 예외 처리 및 데이터 접근 개념은 Spring Boot에서도 활용된다.

</details>


## Day21. Java 코어 라이브러리 및 제네릭 심화
<details>

### 🎯 학습 목표
- Java 코어 라이브러리와 `java.base` 모듈의 구조를 이해한다.
- `Object` 클래스의 동등성 비교와 주요 메서드를 복습한다.
- `String`, `StringBuilder`, `StringBuffer`를 용도에 따라 구분한다.
- Wrapper 클래스와 정적 유틸리티 메서드의 활용법을 이해한다.
- `java.time`을 이용한 날짜·시간 처리를 이해한다.
- `DecimalFormat`, `NumberFormat`, `DateTimeFormatter`의 사용법을 익힌다.
- 정규표현식으로 문자열을 검증하고 추출하는 방법을 이해한다.
- 리플렉션을 이용하여 런타임에 클래스 정보를 조회하는 방법을 이해한다.
- 어노테이션의 역할과 사용자 정의 어노테이션을 이해한다.
- 제네릭의 도입 목적과 타입 안정성을 이해한다.
- 제네릭 클래스와 제네릭 메서드를 작성할 수 있다.
- 제네릭의 타입 제한과 와일드카드를 이해한다.
- PECS 원칙에 따라 제네릭 타입을 선택할 수 있다.
- Java 라이브러리와 Spring 프레임워크의 관계를 이해한다.

---

### 1. Java 코어 라이브러리(Core Library)

Java 코어 라이브러리는 Java 프로그램 개발에 필요한 기본 기능을 제공하는 클래스와 인터페이스의 집합이다.

개발자는 문자열, 날짜, 수학 계산, 파일 처리 등의 기능을 처음부터 직접 구현하지 않고 표준 라이브러리를 활용할 수 있다.

**Java 코어 라이브러리의 주요 역할**

- 객체의 공통 기능 제공
- 문자열 처리 및 변환
- 기본형과 객체형 간 변환
- 날짜 및 시간 관리
- 숫자 및 날짜 형식 지정
- 정규표현식 기반 데이터 검사
- 런타임 클래스 정보 조회
- 어노테이션을 이용한 메타데이터 관리
- 제네릭을 이용한 타입 안정성 확보

**주요 라이브러리 분류**

| 분류 | 주요 클래스 및 기능 |
|---|---|
| Object | 객체 동등성, 해시 코드, 문자열 표현 |
| String | 문자열 검색, 비교 및 처리 |
| StringBuilder | 변경 가능한 문자열 |
| Wrapper | 기본형 데이터의 객체 표현 |
| Math | 수학 계산 |
| System | 시스템 속성, 환경 변수, 시간 측정 |
| Date/Time | 날짜와 시간 처리 |
| Format | 숫자, 통화 및 날짜 형식 지정 |
| Regex | 문자열 패턴 검사 및 추출 |
| Reflection | 런타임 클래스 정보 분석 |
| Annotation | 메타데이터 선언 |
| Generic | 타입 안정성 및 코드 재사용 |

**핵심**

표준 라이브러리는 단순히 메서드를 암기하는 것이 아니라, **필요한 기능이 무엇이고 어떤 상황에서 사용해야 하는지** 이해하는 것이 중요하다.

### 2. java.base 모듈

`java.base`는 Java 플랫폼의 가장 기본적인 모듈이다.

Java 9부터 도입된 모듈 시스템에서 `java.base`는 모든 모듈이 기본적으로 의존하는 필수 모듈이다.

**java.base의 주요 패키지**

| 패키지 | 역할 |
|---|---|
| `java.lang` | Object, String, Math 등 기본 기능 |
| `java.util` | 컬렉션 및 공통 유틸리티 |
| `java.io` | 스트림 기반 입출력 |
| `java.nio` | 버퍼 및 파일 입출력 |
| `java.time` | 날짜 및 시간 처리 |
| `java.text` | 숫자 및 문자 형식 처리 |
| `java.util.regex` | 정규표현식 처리 |
| `java.lang.reflect` | 리플렉션 |

**구조**

```text
                   java.base
                       │
        ┌──────────────┼──────────────┐
        │              │              │
        ▼              ▼              ▼
    java.lang       java.util       java.io
        │              │              │
   Object/String     Collection     InputStream
   Math/System       Map/List       OutputStream
        │
        ├── java.lang.reflect
        │       └── Reflection
        │
        ├── java.time
        │       └── Date/Time
        │
        └── java.util.regex
                └── Pattern/Matcher
```

**java.base와 java.lang의 차이**

| 구분 | java.base | java.lang |
|---|---|---|
| 종류 | 모듈 | 패키지 |
| 역할 | Java 기본 패키지들을 포함 | 기본 클래스 제공 |
| import | 모듈 의존성이 암묵적으로 존재 | 자동 import 대상 |
| 예시 | java.util, java.time 등 포함 | String, Object, Math |

**주의사항**

- `java.base`에 포함된 모든 패키지가 자동 import되는 것은 아니다.
- `java.lang`은 별도의 import 없이 사용할 수 있다.
- `java.util`, `java.time` 등은 필요한 타입을 import해야 한다.
- `java.base`는 모듈이고 `java.lang`은 그 안에 속한 패키지이다.

### 3. Object 클래스와 객체의 동등성

`Object`는 Java의 모든 클래스가 직간접적으로 상속하는 최상위 클래스이다.

모든 객체는 Object에 정의된 기본 메서드를 사용할 수 있다.

**주요 메서드**

| 메서드 | 역할 |
|---|---|
| `toString()` | 객체의 문자열 표현 반환 |
| `equals()` | 객체의 동등성 비교 |
| `hashCode()` | 객체의 해시 코드 반환 |
| `getClass()` | 객체의 런타임 클래스 정보 반환 |

**참조 동일성과 값 동등성**

```java
String a = new String("Java");
String b = new String("Java");

System.out.println(a == b);       // false
System.out.println(a.equals(b));  // true
```

**비교 기준**

```text
       a ─────► String 객체 A
                       │
                     "Java"

       b ─────► String 객체 B
                       │
                     "Java"


==        : 두 참조가 동일 객체를 가리키는지 비교
equals()  : 클래스에서 정의한 동등성 기준으로 비교
```

**equals()와 hashCode()**

객체의 값으로 동등성을 비교하려면 `equals()`를 재정의할 수 있다.

이때 `hashCode()`도 동등성 규칙에 맞게 재정의해야 한다.

```java
import java.util.Objects;

class Member {

    private final int id;

    Member(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (!(obj instanceof Member other)) {
            return false;
        }

        return id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
```

**핵심**

- Object의 기본 `equals()`는 참조 동일성을 비교한다.
- String은 내용을 비교하도록 equals()를 재정의한다.
- 동등한 객체는 반드시 같은 hashCode()를 반환해야 한다.
- 서로 다른 객체라도 같은 hashCode()를 가질 수 있다.
- HashMap과 HashSet 등에서 객체 동등성 규칙이 중요하다.

### 4. String, StringBuilder, StringBuffer

Java에는 문자열을 처리하기 위한 여러 클래스가 존재한다.

| 구분 | String | StringBuilder | StringBuffer |
|---|---|---|---|
| 변경 가능 여부 | 불변 | 가변 | 가변 |
| 문자열 수정 | 결과 문자열 반환 | 내부 내용 수정 | 내부 내용 수정 |
| 동기화 | 불변 객체 | 자체 동기화 없음 | 주요 메서드 동기화 |
| 주요 용도 | 일반적인 문자열 | 빈번한 문자열 조합 | 동기화가 필요한 문자열 조작 |

**String**

```java
String text = "Java";

String result = text.replace("J", "K");

System.out.println(text);    // Java
System.out.println(result);  // Kava
```

String은 불변 객체이므로 기존 문자열의 내용이 직접 변경되지 않는다.

**StringBuilder**

```java
StringBuilder sb = new StringBuilder();

sb.append("Hello");
sb.append(" Java");

System.out.println(sb.toString());
// Hello Java
```

**StringBuffer**

```java
StringBuffer buffer = new StringBuffer();

buffer.append("Hello");
buffer.append(" Java");

System.out.println(buffer.toString());
```

**StringBuilder와 StringBuffer의 차이**

- StringBuilder는 자체적인 동기화를 제공하지 않는다.
- StringBuffer는 주요 메서드에 동기화를 제공한다.
- 단일 스레드에서 반복적인 문자열 조합에는 일반적으로 StringBuilder가 적합하다.
- StringBuffer도 여러 메서드로 구성된 복합 작업 전체의 안전성을 자동 보장하지는 않는다.

**선택 기준**

```text
        문자열 처리
             │
             ▼
     빈번하게 수정하는가?
          │       │
         No      Yes
          │       │
          ▼       ▼
        String   여러 스레드가
                 공유하여 수정?
                    │      │
                   No     Yes
                    │      │
                    ▼      ▼
              StringBuilder  StringBuffer
                             또는 별도 동기화 설계
```

### 5. Wrapper 클래스와 박싱(Boxing)

Wrapper 클래스는 기본형 데이터를 객체로 다루기 위한 클래스이다.

**기본형과 Wrapper**

| 기본형 | Wrapper |
|---|---|
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

**오토박싱(Auto-boxing)**

```java
int number = 100;

Integer boxed = number;
```

기본형 값이 자동으로 Wrapper 타입으로 변환된다.

**언박싱(Unboxing)**

```java
Integer boxed = 100;

int number = boxed;
```

Wrapper 객체의 값이 기본형으로 변환된다.

**문자열 숫자 변환**

```java
int number = Integer.parseInt("100");

double value = Double.parseDouble("12.5");

Integer object = Integer.valueOf("100");
```

| 메서드 | 반환 타입 |
|---|---|
| `Integer.parseInt()` | int |
| `Integer.valueOf()` | Integer |
| `Double.parseDouble()` | double |
| `Double.valueOf()` | Double |

**주의사항**

```java
Integer value = null;

// int number = value;
// null 언박싱 시 NullPointerException 발생
```

- Wrapper는 null을 가질 수 있다.
- 잘못된 숫자 문자열을 변환하면 NumberFormatException이 발생한다.
- Wrapper 객체끼리 값을 비교할 때는 `equals()` 등을 사용한다.
- 제네릭 컬렉션에는 기본형 대신 Wrapper 타입을 사용한다.

### 6. System과 Math 정적 유틸리티

System과 Math는 객체를 생성하지 않고 사용할 수 있는 다양한 정적 메서드를 제공한다.

**System 주요 메서드**

| 메서드 | 역할 |
|---|---|
| `currentTimeMillis()` | 현재 시각을 밀리초 단위로 반환 |
| `nanoTime()` | 경과 시간 측정에 사용할 값 반환 |
| `getProperty()` | Java 시스템 속성 조회 |
| `getenv()` | 환경 변수 조회 |
| `arraycopy()` | 배열 요소 복사 |
| `gc()` | GC 수행 요청 |

**실행 시간 측정**

```java
long start = System.nanoTime();

for (int i = 0; i < 100000; i++) {
    Math.sqrt(i);
}

long end = System.nanoTime();

System.out.println(end - start);
```

**환경 정보 조회**

```java
String version = System.getProperty("java.version");

String os = System.getProperty("os.name");

String dbUrl = System.getenv("DB_URL");
```

**Math 주요 메서드**

| 메서드 | 역할 |
|---|---|
| `abs()` | 절댓값 |
| `max()` | 최댓값 |
| `min()` | 최솟값 |
| `round()` | 반올림 |
| `ceil()` | 올림 |
| `floor()` | 내림 |
| `pow()` | 거듭제곱 |
| `random()` | 난수 생성 |

**Java 예제**

```java
System.out.println(Math.max(10, 20)); // 20
System.out.println(Math.abs(-10));    // 10
System.out.println(Math.ceil(3.2));   // 4.0
```

**페이지 개수 계산**

```java
int totalCount = 103;
int pageSize = 10;

int pageCount = (int) Math.ceil(
    (double) totalCount / pageSize
);

System.out.println(pageCount); // 11
```

**핵심**

- System은 실행 환경과 관련된 기능을 제공한다.
- Math는 수학 연산 기능을 제공한다.
- `nanoTime()`은 경과 시간 측정에 적합하다.
- `Math.ceil()`을 활용하면 나누기 결과의 올림 처리가 가능하다.

### 7. java.time 날짜와 시간 API

`java.time`은 날짜와 시간을 다루기 위한 Java 표준 API이다.

대부분의 주요 날짜·시간 객체는 불변(Immutable)으로 설계되어 있다.

**주요 클래스**

| 클래스 | 역할 |
|---|---|
| `LocalDate` | 날짜 |
| `LocalTime` | 시간 |
| `LocalDateTime` | 날짜와 시간 |
| `ZonedDateTime` | 시간대가 포함된 날짜와 시간 |
| `DateTimeFormatter` | 날짜·시간 형식 변환 |

**Java 예제**

```java
import java.time.*;

LocalDate date = LocalDate.now();

LocalTime time = LocalTime.now();

LocalDateTime dateTime = LocalDateTime.now();

ZonedDateTime zoned = ZonedDateTime.now();
```

**날짜 계산**

```java
import java.time.LocalDate;

LocalDate today = LocalDate.of(2026, 11, 9);

LocalDate tomorrow = today.plusDays(1);

System.out.println(tomorrow);
// 2026-11-10
```

**불변성**

```java
LocalDate date = LocalDate.of(2026, 11, 9);

date.plusDays(1);

System.out.println(date);
// 2026-11-09
```

`plusDays()`는 기존 객체를 변경하지 않고 새로운 날짜 결과를 반환한다.

**주의사항**

- LocalDateTime에는 시간대 정보가 없다.
- 시간대가 필요한 경우 ZonedDateTime 등을 고려한다.
- 여러 지역의 시간을 다루는 애플리케이션에서는 시간대와 오프셋을 구분해야 한다.

### 8. 날짜 및 숫자 형식 클래스(Format)

형식 클래스는 데이터를 사용자에게 읽기 쉬운 문자열로 변환하는 기능을 제공한다.

**주요 클래스**

| 클래스 | 역할 |
|---|---|
| `DecimalFormat` | 숫자 형식 지정 |
| `NumberFormat` | 숫자 및 통화 형식 지정 |
| `DateTimeFormatter` | 날짜·시간 형식 지정 |

**DecimalFormat**

```java
import java.text.DecimalFormat;

DecimalFormat format = new DecimalFormat("#,###");

String result = format.format(1000000);

System.out.println(result);
// 1,000,000
```

**NumberFormat**

```java
import java.text.NumberFormat;
import java.util.Locale;

NumberFormat formatter =
    NumberFormat.getCurrencyInstance(Locale.KOREA);

String result = formatter.format(350000);

System.out.println(result);
```

한국 지역 설정에 맞는 통화 형식으로 문자열을 생성한다.

**DateTimeFormatter**

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

LocalDateTime dateTime =
    LocalDateTime.of(2026, 11, 9, 15, 30);

DateTimeFormatter formatter =
    DateTimeFormatter.ofPattern(
        "yyyy-MM-dd HH:mm:ss"
    );

String result = dateTime.format(formatter);

System.out.println(result);
// 2026-11-09 15:30:00
```

**형식 패턴**

| 패턴 | 의미 |
|---|---|
| yyyy | 연도 |
| MM | 월 |
| dd | 일 |
| HH | 24시간 형식 시 |
| mm | 분 |
| ss | 초 |

**핵심**

- 형식 클래스는 데이터를 화면에 표시하기 위해 사용한다.
- 숫자와 문자열 데이터는 구분하여 관리한다.
- 날짜 데이터는 가능하면 날짜·시간 타입으로 관리한다.
- 화면에 표시할 때 필요한 형식으로 변환한다.

### 9. 정규표현식(Regular Expression)

정규표현식은 문자열이 특정 규칙에 맞는지 검사하거나 원하는 문자열을 찾기 위한 표현 방식이다.

대표적인 활용 사례는 전화번호, 이메일 형식 검사와 텍스트 데이터 검색이다.

**주요 기호**

| 기호 | 의미 |
|---|---|
| `^` | 문자열 시작 |
| `$` | 문자열 끝 |
| `.` | 임의의 문자 한 개(기본적으로 줄바꿈 제외) |
| `\d` | 숫자 |
| `\w` | 단어 문자 |
| `[0-9]` | 0~9 중 한 문자 |
| `[A-Z]` | 대문자 A~Z 중 한 문자 |
| `+` | 1개 이상 |
| `*` | 0개 이상 |
| `?` | 0개 또는 1개 |
| `{n}` | 정확히 n개 |
| `{n,m}` | n개 이상 m개 이하 |

**전화번호 검증**

```java
String phone = "010-1234-5678";

boolean valid = phone.matches(
    "^010-\\d{4}-\\d{4}$"
);

System.out.println(valid); // true
```

**주요 클래스**

| 클래스 | 역할 |
|---|---|
| `Pattern` | 정규표현식 패턴을 컴파일 |
| `Matcher` | 패턴을 이용해 문자열 검사 및 검색 |

**Pattern과 Matcher**

```java
import java.util.regex.Pattern;
import java.util.regex.Matcher;

String text = "Java 100 Spring 200";

Pattern pattern = Pattern.compile("\\d+");

Matcher matcher = pattern.matcher(text);

while (matcher.find()) {
    System.out.println(matcher.group());
}
```

**실행 결과**

```text
100
200
```

**matches()와 find()**

| 메서드 | 역할 |
|---|---|
| `matches()` | 입력 전체가 패턴에 일치하는지 검사 |
| `find()` | 입력에서 패턴과 일치하는 부분 검색 |
| `group()` | 일치한 문자열 반환 |

**핵심**

- 정규표현식은 문자열 패턴을 정의한다.
- matches()는 전체 문자열 검증에 활용한다.
- find()는 문자열 내부의 부분 검색에 활용한다.
- Pattern은 여러 번 사용할 정규표현식을 재사용할 때 유용하다.

**주의사항**

- Java 문자열에서 정규표현식의 `\`는 `\\`로 작성해야 하는 경우가 많다.
- 복잡한 정규표현식은 유지보수가 어려울 수 있다.
- 형식이 올바르다고 데이터 자체가 유효하다는 의미는 아니다.

### 10. 리플렉션(Reflection)

리플렉션은 프로그램 실행 중 클래스의 구조와 정보를 조회하거나 일부 동작을 동적으로 수행할 수 있는 기술이다.

**리플렉션을 사용하는 목적**

- 런타임 클래스 정보 조회
- 필드 및 메서드 분석
- 생성자 정보 확인
- 동적인 객체 생성
- 메서드 동적 호출
- 프레임워크의 자동화 기능 지원

**주요 클래스**

| 클래스 | 역할 |
|---|---|
| `Class` | 클래스 및 타입 정보 |
| `Field` | 필드 정보 및 접근 |
| `Method` | 메서드 정보 및 호출 |
| `Constructor` | 생성자 정보 및 객체 생성 |

**Java 예제**

```java
class Member {

    private String name;

    public void print() {
        System.out.println("Member");
    }
}
```

**클래스 정보 조회**

```java
Class<?> clazz = Member.class;

System.out.println(clazz.getName());
```

**메서드 정보 조회**

```java
import java.lang.reflect.Method;

Class<?> clazz = Member.class;

Method[] methods = clazz.getDeclaredMethods();

for (Method method : methods) {
    System.out.println(method.getName());
}
```

**메서드 동적 호출**

```java
import java.lang.reflect.Method;

Member member = new Member();

Method method =
    member.getClass().getDeclaredMethod("print");

method.invoke(member);
```

※ `getDeclaredMethod()`와 `invoke()`에서 발생 가능한 리플렉션 관련 Checked Exception은 실제 코드에서 처리하거나 전파해야 한다.

**일반 호출과 리플렉션 호출**

```text
[일반 메서드 호출]

member.print()
      │
      ▼
 컴파일 시 알려진 메서드 호출


[리플렉션]

Class 객체 조회
      │
      ▼
Method 객체 검색
      │
      ▼
invoke() 실행
```

**주의사항**

- 리플렉션은 직접 호출보다 복잡하고 성능 비용이 발생할 수 있다.
- 접근 제어와 모듈 경계를 고려해야 한다.
- private 멤버에 대한 접근이 언제나 허용되는 것은 아니다.
- 가능한 경우 일반적인 타입 기반 메서드 호출이 더 명확하다.

### 11. 어노테이션(Annotation)

어노테이션은 클래스, 메서드, 필드 등에 부가 정보를 선언하는 메타데이터이다.

컴파일러, 개발 도구, 프레임워크는 어노테이션을 읽고 정해진 작업을 수행할 수 있다.

**대표적인 어노테이션**

| 어노테이션 | 역할 |
|---|---|
| `@Override` | 메서드 재정의 검사 |
| `@Deprecated` | 사용을 권장하지 않는 요소 표시 |
| `@Target` | 어노테이션 적용 대상 제한 |
| `@Retention` | 어노테이션 유지 범위 지정 |

**Override**

```java
class Parent {

    void print() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    @Override
    void print() {
        System.out.println("Child");
    }
}
```

`@Override`는 메서드가 올바르게 재정의되는지 컴파일러가 검사하도록 한다.

### 12. 사용자 정의 어노테이션

개발자는 `@interface`를 사용하여 직접 어노테이션을 선언할 수 있다.

**어노테이션 정의**

```java
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface LogCheck {
    String value();
}
```

**사용 예제**

```java
class MemberService {

    @LogCheck("회원 가입")
    public void join() {
        System.out.println("회원 가입 처리");
    }
}
```

**Target**

어노테이션을 적용할 수 있는 위치를 지정한다.

| 값 | 적용 대상 |
|---|---|
| TYPE | 클래스, 인터페이스 등 |
| METHOD | 메서드 |
| FIELD | 필드 |
| PARAMETER | 매개변수 |
| CONSTRUCTOR | 생성자 |

**Retention**

어노테이션의 유지 시점을 지정한다.

| 값 | 의미 |
|---|---|
| SOURCE | 소스 코드 수준에서 사용 |
| CLASS | 클래스 파일까지 유지 |
| RUNTIME | 런타임에도 조회 가능 |

**어노테이션 처리 흐름**

```text
      @LogCheck 선언
             │
             ▼
      메서드에 적용
             │
             ▼
      프로그램 실행
             │
             ▼
   Reflection으로 조회
             │
             ▼
    어노테이션 정보 확인
             │
             ▼
      지정된 기능 수행
```

**핵심**

- 어노테이션 자체가 지정된 비즈니스 기능을 실행하는 것은 아니다.
- 컴파일러나 프레임워크가 어노테이션을 해석하여 기능을 수행한다.
- 런타임에서 리플렉션으로 조회하려면 적절한 Retention 설정이 필요하다.

### 13. 제네릭(Generic)의 개념

제네릭은 클래스나 메서드에서 사용할 데이터 타입을 외부에서 지정할 수 있도록 하는 기능이다.

**제네릭의 도입 목적**

- 컴파일 시 타입 검사
- 잘못된 타입 사용 방지
- 불필요한 형변환 감소
- 코드 재사용성 향상
- 타입 안정성 확보

**제네릭을 사용하지 않는 경우**

```java
class Box {

    private Object item;

    public void set(Object item) {
        this.item = item;
    }

    public Object get() {
        return item;
    }
}
```

**사용 예제**

```java
Box box = new Box();

box.set("Java");

String value = (String) box.get();
```

Object는 여러 참조 타입을 받을 수 있지만, 값을 꺼낼 때 명시적인 형변환이 필요하다.

잘못된 타입으로 형변환하면 ClassCastException이 발생할 수 있다.

**제네릭을 사용하는 경우**

```java
class Box<T> {

    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}
```

```java
Box<String> box = new Box<>();

box.set("Java");

String value = box.get();
```

**핵심**

- `<T>`는 타입 매개변수이다.
- `Box<String>`은 String 타입을 사용하는 Box이다.
- 컴파일러가 타입의 일치 여부를 검사한다.
- 값을 꺼낼 때 직접 형변환할 필요가 줄어든다.

### 14. 제네릭 클래스(Generic Class)

제네릭 클래스는 선언 시점에 타입을 고정하지 않고, 사용하는 위치에서 타입 인자를 지정하는 클래스이다.

**기본 문법**

```java
class Box<T> {

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
```

**타입 지정**

```java
Box<String> stringBox = new Box<>();

stringBox.setValue("Java");

String text = stringBox.getValue();
```

```java
Box<Integer> intBox = new Box<>();

intBox.setValue(100);

int number = intBox.getValue();
```

**타입 매개변수의 일반적인 이름**

| 문자 | 의미 |
|---|---|
| T | Type |
| E | Element |
| K | Key |
| V | Value |
| N | Number |

**여러 타입 매개변수**

```java
class Pair<K, V> {

    private K key;
    private V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
```

**사용 예제**

```java
Pair<Integer, String> pair =
    new Pair<>(1, "홍길동");

System.out.println(pair.getKey());
System.out.println(pair.getValue());
```

**핵심**

- 제네릭 클래스는 여러 타입을 처리하는 구조를 재사용할 수 있다.
- 타입 매개변수는 클래스 선언 시 지정한다.
- 객체 생성 및 타입 선언 시 구체적인 타입 인자를 지정한다.

### 15. 제네릭 메서드(Generic Method)

제네릭 메서드는 메서드 자체에서 타입 매개변수를 선언하는 방식이다.

제네릭 클래스가 아니더라도 제네릭 메서드를 선언할 수 있다.

**기본 문법**

```java
public static <T> T getValue(T value) {
    return value;
}
```

**Java 예제**

```java
public class GenericExample {

    public static <T> void print(T value) {
        System.out.println(value);
    }

    public static void main(String[] args) {

        print("Java");

        print(100);

        print(3.14);
    }
}
```

**클래스 제네릭과 메서드 제네릭**

| 구분 | 제네릭 클래스 | 제네릭 메서드 |
|---|---|---|
| 선언 위치 | 클래스 선언부 | 메서드 선언부 |
| 타입 결정 | 타입 사용 시 | 메서드 호출 시 |
| 적용 범위 | 해당 클래스의 타입 매개변수 사용 범위 | 해당 메서드 내부 |
| 예시 | `class Box<T>` | `<T> T get(T value)` |

**주의사항**

- 제네릭 메서드의 `<T>`는 반환 타입 앞에 선언한다.
- 컴파일러가 인자를 통해 타입을 추론할 수 있다.
- 제네릭 클래스와 제네릭 메서드는 서로 독립적인 타입 매개변수를 가질 수 있다.

### 16. 제한된 타입 매개변수(Bounded Type Parameter)

제네릭은 타입 매개변수에 상한을 지정할 수 있다.

이때 `extends` 키워드를 사용한다.

**Number 타입 제한**

```java
class Calculator<T extends Number> {

    public double convert(T value) {
        return value.doubleValue();
    }
}
```

**사용 예제**

```java
Calculator<Integer> calculator = new Calculator<>();

System.out.println(calculator.convert(100));
```

**타입 제한**

```text
              Number
                 │
        ┌────────┼────────┐
        │        │        │
        ▼        ▼        ▼
     Integer   Double    Float

<T extends Number>

Number와 그 하위 타입만 사용 가능
```

**제약 조건**

```java
Calculator<Integer> a = new Calculator<>();

Calculator<Double> b = new Calculator<>();

// Calculator<String> c = new Calculator<>();
// String은 Number를 상속하지 않으므로 컴파일 오류
```

**핵심**

- `extends`는 상한 경계를 지정한다.
- 타입 매개변수에서 extends는 클래스와 인터페이스 상한에 모두 사용할 수 있다.
- 타입을 제한하면 해당 상한 타입에서 사용할 수 있는 메서드에 접근할 수 있다.

### 17. 와일드카드(Wildcard)

와일드카드는 제네릭 타입 인자의 범위를 유연하게 지정하기 위한 문법이다.

와일드카드는 `?`로 표현한다.

**주요 종류**

| 문법 | 의미 |
|---|---|
| `<?>` | 타입을 특정하지 않음 |
| `<? extends T>` | T 또는 그 하위 타입 |
| `<? super T>` | T 또는 그 상위 타입 |

**와일드카드 예제**

```java
import java.util.List;

public static void printList(List<?> list) {

    for (Object value : list) {
        System.out.println(value);
    }
}
```

**사용 예제**

```java
List<String> names = List.of("Java", "Spring");

List<Integer> numbers = List.of(10, 20, 30);

printList(names);
printList(numbers);
```

**핵심**

- `<?>`는 요소 타입을 알 수 없는 제네릭 타입을 나타낸다.
- `<? extends T>`는 T를 상한으로 제한한다.
- `<? super T>`는 T를 하한으로 제한한다.
- 제네릭 타입 간의 관계를 유연하게 다룰 수 있다.

### 18. PECS 원칙

PECS는 제네릭 와일드카드를 선택할 때 사용하는 대표적인 원칙이다.

**PECS = Producer Extends, Consumer Super**

```text
          PECS
            │
      ┌─────┴─────┐
      │           │
      ▼           ▼
   Producer    Consumer
      │           │
      ▼           ▼
   extends       super
      │           │
      ▼           ▼
   읽기 중심    쓰기 중심
```

**Producer Extends**

데이터를 제공하는 쪽은 `extends`를 사용하는 것이 적합하다.

```java
import java.util.List;

public static double sum(
        List<? extends Number> numbers) {

    double total = 0;

    for (Number number : numbers) {
        total += number.doubleValue();
    }

    return total;
}
```

**사용 예제**

```java
List<Integer> ints = List.of(10, 20, 30);

List<Double> doubles = List.of(1.5, 2.5);

System.out.println(sum(ints));     // 60.0
System.out.println(sum(doubles));  // 4.0
```

**Consumer Super**

데이터를 받아들이는 쪽은 `super`를 사용하는 것이 적합하다.

```java
import java.util.List;

public static void addNumbers(
        List<? super Integer> list) {

    list.add(10);
    list.add(20);
}
```

**사용 예제**

```java
List<Number> numbers = new java.util.ArrayList<>();

addNumbers(numbers);
```

**extends와 super 비교**

| 구분 | extends | super |
|---|---|---|
| 역할 | 상한 제한 | 하한 제한 |
| 중심 동작 | 값 읽기 | 값 쓰기 |
| 읽기 타입 | 상한 타입으로 읽기 가능 | 일반적으로 Object로 읽기 |
| 쓰기 | 구체 타입을 알 수 없어 제한됨 | 하한 타입 값을 추가 가능 |
| 예시 | `<? extends Number>` | `<? super Integer>` |

**주의사항**

- extends는 일반적으로 값을 읽는 작업에 적합하다.
- super는 일반적으로 값을 추가하는 작업에 적합하다.
- `List<Integer>`는 `List<Number>`의 하위 타입이 아니다.
- `List<? extends Number>`에는 일반적으로 Integer나 Double 값을 직접 추가할 수 없다.
- `List<? super Integer>`에서 꺼낸 값의 구체적인 타입은 컴파일 시점에 알 수 없으므로 Object로 취급한다.

### 19. 제네릭 타입의 주의사항

제네릭은 컴파일 시 타입 안정성을 제공하지만 모든 타입 정보가 런타임에 그대로 유지되는 것은 아니다.

**타입 소거(Type Erasure)**

Java 제네릭은 일반적으로 컴파일 과정에서 타입 매개변수가 소거된다.

```java
Box<String> stringBox = new Box<>();

Box<Integer> intBox = new Box<>();
```

위 객체들은 서로 다른 타입 인자를 사용하지만, 런타임에는 동일한 Box 클래스가 사용된다.

**주요 제한사항**

| 제한사항 | 설명 |
|---|---|
| 기본형 사용 | `Box<int>` 직접 사용 불가 |
| 타입 매개변수 직접 생성 | 일반적으로 `new T()` 불가 |
| 제네릭 배열 생성 | 일반적으로 `new T[10]` 불가 |
| 타입 검사 | `instanceof List<String>` 불가 |
| 타입 소거 | 일부 제네릭 타입 정보가 런타임에 유지되지 않음 |

**올바른 기본형 처리**

```java
Box<Integer> box = new Box<>();

box.setValue(100);
```

**핵심**

- 제네릭은 주로 컴파일 시 타입 안정성을 제공한다.
- 구체적인 제네릭 타입 인자가 모두 런타임에 유지되는 것은 아니다.
- 제네릭 컬렉션은 Wrapper 타입과 함께 사용한다.
- Raw Type 사용은 타입 안정성을 약화시킬 수 있다.

---

### 20. Reflection과 Annotation의 관계

리플렉션과 어노테이션은 프레임워크의 자동화 기능을 이해하기 위한 중요한 개념이다.

**각 기술의 역할**

| 기술 | 역할 |
|---|---|
| Annotation | 코드에 의미 있는 메타데이터 선언 |
| Reflection | 런타임에 타입과 메타데이터 조회 |
| Generic | 코드의 타입 안정성 확보 |

**동작 구조**

```text
        Java 클래스
             │
             ▼
      어노테이션 선언
             │
             ▼
       프로그램 실행
             │
             ▼
      Reflection 검사
             │
             ▼
    어노테이션 정보 해석
             │
             ▼
       지정된 기능 처리
```

**활용 사례**

- Spring의 컴포넌트 검색
- Spring MVC의 요청 매핑
- JPA의 엔티티 메타데이터 처리
- JUnit의 테스트 메서드 탐색

**핵심**

어노테이션은 정보를 표시하고, 리플렉션은 런타임에 그 정보를 조회하여 프레임워크의 기능을 구성하는 데 활용된다.

단, 프레임워크의 모든 동작이 리플렉션만으로 구현되는 것은 아니다.

### 21. Java 코어 라이브러리와 Spring Boot

Spring Boot는 Java의 객체지향 설계와 표준 라이브러리 기능을 바탕으로 동작한다.

**주요 기술 연결**

| Java 개념 | Spring Boot 활용 |
|---|---|
| 인터페이스 | 의존성 분리 및 DI |
| 다형성 | 구현 객체 교체 |
| 제네릭 | 다양한 타입의 데이터 처리 |
| Annotation | Controller, Service 등의 선언 |
| Reflection | 클래스 및 어노테이션 정보 분석 |
| Regex | 요청 데이터 검증 |
| Date/Time | 날짜·시간 데이터 관리 |
| Wrapper | 요청 값 변환 및 nullable 데이터 처리 |
| Object | 객체 동등성 및 공통 기능 |

**Spring MVC의 요청 처리 개념**

```text
        HTTP Request
              │
              ▼
      Spring MVC 처리
              │
              ▼
      어노테이션 정보 확인
              │
              ▼
      요청 경로 및 메서드 매핑
              │
              ▼
       Controller 호출
              │
              ▼
         Service 호출
              │
              ▼
         데이터 처리
              │
              ▼
        HTTP Response
```

**Spring 어노테이션 예시**

```java
@RestController
public class MemberController {

    @GetMapping("/members/{id}")
    public String getMember(@PathVariable Long id) {
        return "Member ID: " + id;
    }
}
```

※ 위 예제는 Spring Web 의존성 및 import가 필요한 Spring Boot 코드이다.

**주요 어노테이션**

| 어노테이션 | 역할 |
|---|---|
| `@RestController` | REST 응답을 처리하는 Controller 선언 |
| `@GetMapping` | HTTP GET 요청 경로 매핑 |
| `@PathVariable` | URL 경로 변수 바인딩 |
| `@Service` | 서비스 계층의 컴포넌트 선언 |
| `@Transactional` | 트랜잭션 처리 경계 선언 |

**핵심**

- Spring은 Java의 기본 문법과 객체지향 개념을 활용한다.
- 어노테이션은 프레임워크가 처리할 메타데이터를 제공한다.
- 리플렉션은 타입과 메타데이터를 런타임에 분석하는 데 활용된다.
- 제네릭은 데이터 및 API 타입을 안전하게 다루는 데 중요하다.

### 22. JSON과 Java 객체 변환

JSON(JavaScript Object Notation)은 시스템 사이에서 구조화된 데이터를 주고받을 때 사용하는 데이터 형식이다.

**JSON 예제**

```json
{
  "name": "홍길동",
  "age": 20
}
```

Java에서는 Jackson 등의 라이브러리를 이용해 객체와 JSON 문자열을 변환할 수 있다.

**변환 흐름**

```text
       Java 객체
           │
           ▼
    JSON 직렬화
           │
           ▼
      JSON 문자열
           │
           ▼
    JSON 역직렬화
           │
           ▼
       Java 객체
```

**주요 개념**

| 용어 | 의미 |
|---|---|
| Serialization | 객체를 JSON 등의 형식으로 변환 |
| Deserialization | JSON 등의 데이터를 객체로 변환 |
| ObjectMapper | Jackson의 객체 변환 기능 |
| DTO | 계층이나 시스템 사이에서 데이터를 전달하는 객체 |

**주의사항**

- JSON은 Java 객체를 표현할 수 있는 데이터 교환 형식이다.
- Jackson은 Java 표준 `java.base` 모듈이 아닌 외부 라이브러리이다.
- Spring Boot에서는 JSON 기반 요청·응답 처리에 Jackson 등의 메시지 변환기를 활용할 수 있다.
- 입력 데이터 검증과 JSON 변환은 서로 다른 작업이다.

### 23. 실무에서 라이브러리 선택 기준

| 상황 | 적합한 기능 |
|---|---|
| 객체의 동등성 비교 | equals(), hashCode() |
| 객체의 문자열 표현 | toString() |
| 일반적인 문자열 처리 | String |
| 반복적인 문자열 조합 | StringBuilder |
| 숫자 문자열 변환 | Wrapper의 parse 메서드 |
| 수학 계산 | Math |
| 실행 시간 측정 | System.nanoTime() |
| 실행 환경 정보 조회 | System.getProperty(), getenv() |
| 날짜 및 시간 관리 | java.time |
| 통화 및 숫자 표시 | NumberFormat, DecimalFormat |
| 날짜 문자열 변환 | DateTimeFormatter |
| 문자열 형식 검증 | Pattern, Matcher |
| 런타임 클래스 분석 | Reflection |
| 클래스 및 메서드 메타데이터 | Annotation |
| 다양한 타입을 안전하게 처리 | Generic |
| 읽기 중심 제네릭 타입 | extends 와일드카드 |
| 쓰기 중심 제네릭 타입 | super 와일드카드 |
| 객체와 JSON 변환 | Jackson 등 외부 라이브러리 |

### 24. 코어 라이브러리 및 제네릭 사용 시 주의사항

| 주의사항 | 설명 |
|---|---|
| java.base와 java.lang 혼동 | 모듈과 패키지를 구분 |
| Object.equals() | 기본 구현은 참조 동일성 비교 |
| equals() 재정의 | hashCode() 규칙도 고려 |
| String 비교 | `==` 대신 내용 비교는 equals() 사용 |
| String 불변성 | 변경 메서드의 반환 결과 확인 |
| StringBuilder | 동시 수정 시 별도 동기화 고려 |
| Wrapper | null 언박싱 시 예외 발생 |
| 숫자 변환 | 잘못된 문자열로 인한 예외 주의 |
| Math 계산 | 정수 나눗셈과 실수 나눗셈 구분 |
| 시간 측정 | 경과 시간에는 nanoTime() 활용 |
| 날짜 관리 | LocalDateTime과 시간대 정보 구분 |
| 형식 클래스 | Locale과 형식 패턴 확인 |
| 정규표현식 | 전체 일치와 부분 검색 구분 |
| Reflection | 성능 비용과 접근 권한 고려 |
| Annotation | 메타데이터와 실제 처리 로직 구분 |
| Generic | 기본형은 직접 타입 인자로 사용 불가 |
| Generic 타입 소거 | 런타임 타입 정보의 한계 이해 |
| 와일드카드 | extends와 super의 용도 구분 |
| PECS | Producer Extends, Consumer Super |
| JSON | 외부 라이브러리와 표준 라이브러리 구분 |

### ✅ Day21 핵심 정리

| 학습 내용 | 핵심 개념 |
|---|---|
| Core Library | Java 기본 라이브러리 |
| java.base | Java 플랫폼의 필수 모듈 |
| java.lang | 기본 클래스 및 언어 핵심 기능 |
| Object | 모든 클래스의 최상위 부모 |
| equals() | 객체 동등성 비교 |
| hashCode() | 객체 해시 코드 |
| toString() | 객체의 문자열 표현 |
| String | 불변 문자열 |
| StringBuilder | 가변 문자열 |
| StringBuffer | 주요 메서드가 동기화된 가변 문자열 |
| Wrapper | 기본형의 객체 표현 |
| Auto-boxing | 기본형에서 Wrapper로 자동 변환 |
| Unboxing | Wrapper에서 기본형으로 자동 변환 |
| System | 시스템 속성 및 시간 측정 |
| Math | 수학 계산 |
| java.time | 날짜와 시간 API |
| LocalDate | 날짜 |
| LocalTime | 시간 |
| LocalDateTime | 날짜와 시간 |
| ZonedDateTime | 시간대가 포함된 날짜와 시간 |
| DateTimeFormatter | 날짜·시간 형식 지정 |
| DecimalFormat | 숫자 형식 지정 |
| NumberFormat | 통화 및 숫자 형식 지정 |
| Regex | 문자열 패턴 검사 |
| Pattern | 정규표현식 패턴 |
| Matcher | 패턴 일치 검사 및 검색 |
| Reflection | 런타임 클래스 정보 조회 |
| Class | 타입 정보 |
| Field | 필드 정보 |
| Method | 메서드 정보 |
| Annotation | 메타데이터 선언 |
| @Target | 어노테이션 적용 대상 |
| @Retention | 어노테이션 유지 범위 |
| Generic | 타입 안정성과 재사용성 |
| Generic Class | 타입 매개변수를 가진 클래스 |
| Generic Method | 타입 매개변수를 가진 메서드 |
| Bounded Type | 제네릭 타입의 상한 제한 |
| Wildcard | 유연한 타입 범위 지정 |
| extends | 상한 제한, 읽기 중심 |
| super | 하한 제한, 쓰기 중심 |
| PECS | Producer Extends, Consumer Super |
| Type Erasure | 컴파일 과정의 제네릭 타입 소거 |
| JSON | 구조화된 데이터 교환 형식 |
| ObjectMapper | Jackson의 객체 변환 클래스 |

**최종 학습 정리**

- Java 코어 라이브러리는 프로그램 개발에 필요한 공통 기능을 제공한다.
- java.base는 Java에서 기본적으로 의존하는 필수 모듈이다.
- java.lang은 별도의 import 없이 사용하는 기본 패키지이다.
- Object는 모든 클래스의 최상위 부모이며 객체의 공통 기능을 제공한다.
- 객체 동등성 비교 시 equals()와 hashCode()의 일관성이 중요하다.
- String은 불변 객체이며 반복적인 문자열 조합에는 StringBuilder를 고려할 수 있다.
- StringBuffer는 주요 메서드에 동기화를 제공한다.
- Wrapper는 기본형 값을 객체로 다루거나 문자열을 숫자로 변환할 때 사용한다.
- System은 실행 환경 조회 및 시간 측정 기능을 제공한다.
- Math는 수학 계산에 필요한 정적 메서드를 제공한다.
- java.time은 날짜와 시간을 처리하는 현대적인 Java API이다.
- LocalDate, LocalTime, LocalDateTime, ZonedDateTime은 서로 다른 시간 정보를 표현한다.
- DateTimeFormatter는 날짜와 시간을 원하는 문자열 형식으로 변환한다.
- NumberFormat과 DecimalFormat은 숫자 및 통화 데이터를 보기 좋은 형태로 표현한다.
- 정규표현식은 문자열이 지정한 패턴에 맞는지 검사하거나 필요한 정보를 추출한다.
- Pattern은 정규표현식을 컴파일하고 Matcher는 패턴과 입력을 비교한다.
- Reflection은 런타임에 클래스, 필드, 메서드 등의 정보를 조회한다.
- Annotation은 클래스와 메서드 등에 메타데이터를 선언하는 기능이다.
- @Target은 적용 위치를, @Retention은 유지 범위를 지정한다.
- 제네릭은 컴파일 시 타입 안정성을 확보하고 코드 재사용성을 높인다.
- 제네릭 클래스는 클래스 사용 시 타입을 지정한다.
- 제네릭 메서드는 메서드 호출 시 타입을 결정할 수 있다.
- extends는 타입의 상한을 제한한다.
- super는 타입의 하한을 제한한다.
- PECS는 읽기 중심에는 extends, 쓰기 중심에는 super를 사용하는 원칙이다.
- Java 제네릭은 일반적으로 타입 소거 방식으로 구현된다.
- Reflection과 Annotation은 Spring 등의 프레임워크 자동화 기능에 활용된다.
- JSON은 시스템 간 데이터 교환에 사용하며 Jackson 등의 라이브러리로 Java 객체와 변환할 수 있다.
- Java 라이브러리는 메서드 이름을 암기하기보다 역할과 사용 시점을 이해하는 것이 중요하다.

</details>


## Day22. Java 코어 라이브러리 실전 활용 및 자동화
<details>

### 🎯 학습 목표
- Java 코어 라이브러리의 주요 기능과 사용 목적을 복습한다.
- Object 클래스의 객체 비교와 복사 원리를 이해한다.
- Wrapper 클래스와 제네릭의 관계를 이해한다.
- String, StringBuilder, StringBuffer의 차이를 구분한다.
- Math와 System의 주요 정적 메서드를 활용한다.
- java.time의 날짜·시간 처리 방법을 이해한다.
- Period와 Duration의 차이를 구분한다.
- 숫자와 날짜 데이터를 원하는 형식으로 변환한다.
- 정규표현식의 주요 기호와 이스케이프 규칙을 이해한다.
- Pattern과 Matcher를 이용하여 데이터를 검증·추출·치환한다.
- 어노테이션과 리플렉션의 역할을 구분한다.
- 사용자 정의 어노테이션을 작성하고 실행 시점에 읽을 수 있다.
- 리플렉션을 이용하여 메서드를 동적으로 실행한다.
- 어노테이션 기반 자동화 스캐너의 동작 원리를 이해한다.
- 간단한 라우터를 구현하여 프레임워크의 기본 구조를 이해한다.

---

### 1. Java 코어 라이브러리의 전체 구조

Java 코어 라이브러리는 프로그램에서 반복적으로 필요한 기능을 미리 구현하여 제공하는 표준 API이다.

이번 학습에서는 각 라이브러리를 개별적으로 사용하는 방법뿐 아니라, 여러 기능을 조합하여 자동화 시스템을 구성하는 방법을 학습한다.

**주요 라이브러리 분류**

| 영역 | 주요 클래스 | 핵심 기능 |
|---|---|---|
| 객체 관리 | Object | 동등성 비교, 문자열 표현, 복사 |
| 데이터 변환 | Wrapper | 기본형 객체화, 숫자 변환 |
| 문자열 처리 | String | 문자열 검색 및 비교 |
| 문자열 조합 | StringBuilder, StringBuffer | 가변 문자열 처리 |
| 수학 계산 | Math | 수학 연산 및 난수 |
| 시스템 관리 | System | 환경 정보, 시간 측정 |
| 날짜 및 시간 | java.time | 날짜·시간 계산 |
| 기간 계산 | Period, Duration | 날짜 및 시간 간격 계산 |
| 형식 변환 | java.text | 숫자 및 날짜 표시 |
| 문자열 검증 | Pattern, Matcher | 정규표현식 처리 |
| 메타데이터 | Annotation | 코드에 부가 정보 선언 |
| 동적 제어 | Reflection | 런타임 타입 분석 및 호출 |

**학습 흐름**

```text
             Java Core Library
                     │
          ┌──────────┼──────────┐
          │          │          │
          ▼          ▼          ▼
      데이터 처리   데이터 검증    동적 제어
          │          │          │
          ▼          ▼          ▼
    String/Wrapper  Regex    Annotation
    Math/Time                 Reflection
          │          │          │
          └──────────┼──────────┘
                     │
                     ▼
             자동화 시스템 구현
                     │
                     ▼
             프레임워크 원리 이해
```

**핵심**

- 데이터 처리는 값의 변환 및 계산을 담당한다.
- 정규표현식은 문자열의 패턴 검증과 추출을 담당한다.
- 어노테이션은 메타데이터를 선언한다.
- 리플렉션은 런타임에 클래스 정보를 분석하고 동작을 호출할 수 있다.
- 여러 기능을 연결하면 반복 작업을 자동화할 수 있다.

### 2. Object 클래스와 객체 비교

Object는 모든 Java 클래스가 직간접적으로 상속하는 최상위 클래스이다.

**주요 메서드**

| 메서드 | 역할 |
|---|---|
| `toString()` | 객체의 문자열 표현 |
| `equals()` | 객체의 동등성 비교 |
| `hashCode()` | 객체의 해시 코드 |
| `getClass()` | 런타임 클래스 정보 |
| `clone()` | 객체 복제 기능 지원 |

**참조 비교와 내용 비교**

```java
String a = new String("Java");
String b = new String("Java");

System.out.println(a == b);      // false
System.out.println(a.equals(b)); // true
```

**비교 구조**

```text
      변수 a                 변수 b
         │                     │
         ▼                     ▼
   String 객체 A         String 객체 B
       "Java"                "Java"

==        : 서로 다른 객체이므로 false
equals()  : 문자열 내용이 같으므로 true
```

**주의사항**

- 참조 타입에 대한 `==`는 같은 객체를 참조하는지 검사한다.
- Object의 기본 `equals()`는 참조 동일성을 비교한다.
- String은 내용 기반 비교를 위해 `equals()`를 재정의한다.
- equals()를 재정의할 때는 hashCode() 규칙도 함께 고려해야 한다.

### 3. 객체 복사와 참조형 메모리

Java에서 참조형 변수를 다른 변수에 대입하면 객체 자체가 복제되는 것이 아니라 참조값이 복사된다.

**참조값 복사**

```java
class Member {
    String name;
}

Member a = new Member();
a.name = "홍길동";

Member b = a;

b.name = "김철수";

System.out.println(a.name); // 김철수
```

**메모리 구조**

```text
       Member a ──────┐
                      │
                      ▼
                 Member 객체
                 name = 김철수
                      ▲
                      │
       Member b ──────┘
```

**얕은 복사(Shallow Copy)**

객체 자체를 새로 생성하더라도 내부의 참조형 필드가 같은 객체를 가리킬 수 있는 복사 방식이다.

**깊은 복사(Deep Copy)**

내부에서 참조하는 변경 가능한 객체까지 필요에 따라 별도로 복제하는 방식이다.

| 구분 | 참조값 복사 | 얕은 복사 | 깊은 복사 |
|---|---|---|---|
| 최상위 객체 | 동일 객체 | 새 객체 | 새 객체 |
| 내부 참조형 객체 | 공유 | 공유 가능 | 필요한 객체를 복제 |
| 데이터 독립성 | 낮음 | 일부만 독립 | 복제 범위만큼 독립 |

**clone() 주의**

강의자료에서는 clone()을 깊은 복사와 연결해 설명하지만, Object의 기본 clone() 동작은 얕은 복사이다.

깊은 복사가 필요하다면 내부 참조형 객체까지 직접 복사하거나 복사 생성자 등을 구현해야 한다.

또한 Java의 메서드 인자 전달 방식은 항상 값에 의한 전달(Call by Value)이다. 참조형 인자를 전달할 때도 참조값이 복사되어 전달된다.

### 4. Wrapper 클래스와 제네릭

Wrapper 클래스는 기본형 값을 객체로 다룰 수 있도록 제공하는 클래스이다.

**기본형과 Wrapper**

| 기본형 | Wrapper |
|---|---|
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

**박싱(Boxing)**

```java
int number = 100;

Integer boxed = number;
```

**언박싱(Unboxing)**

```java
Integer boxed = 100;

int number = boxed;
```

**제네릭과의 관계**

```java
import java.util.ArrayList;
import java.util.List;

List<Integer> numbers = new ArrayList<>();

numbers.add(100);
numbers.add(200);

int value = numbers.get(0);
```

**중요한 차이**

```java
// List<int> numbers; // 컴파일 오류

List<Integer> numbers = new ArrayList<>();
```

- 제네릭 타입 인자는 참조 타입이어야 한다.
- 기본형 int 대신 Integer를 사용한다.
- 오토박싱과 언박싱으로 기본형처럼 간편하게 사용할 수 있다.
- null인 Wrapper 객체를 언박싱하면 NullPointerException이 발생한다.

**문자열 숫자 변환**

```java
int age = Integer.parseInt("25");

double score = Double.parseDouble("95.5");
```

**핵심**

Wrapper는 기본형과 객체 중심 API를 연결하는 역할을 수행한다.

### 5. String과 가변 문자열

String은 불변(Immutable) 객체이며, StringBuilder와 StringBuffer는 가변(Mutable) 객체이다.

**비교**

| 구분 | String | StringBuilder | StringBuffer |
|---|---|---|---|
| 변경 가능 여부 | 불변 | 가변 | 가변 |
| 문자열 결합 | 결과 문자열 생성 | 내부 버퍼 변경 | 내부 버퍼 변경 |
| 동기화 | 불변 객체 | 없음 | 주요 메서드 제공 |
| 사용 목적 | 일반 문자열 처리 | 반복적인 문자열 조합 | 동기화가 필요한 문자열 조작 |

**String**

```java
String text = "Java";

text.concat(" Spring");

System.out.println(text); // Java
```

**StringBuilder**

```java
StringBuilder builder = new StringBuilder();

builder.append("Java");
builder.append(" Spring");

System.out.println(builder.toString());
// Java Spring
```

**StringBuffer**

```java
StringBuffer buffer = new StringBuffer();

buffer.append("Java");
buffer.append(" Spring");
```

**선택 기준**

```text
      문자열을 다루는가?
              │
              ▼
     반복적인 변경이 필요한가?
          │            │
         No           Yes
          │            │
          ▼            ▼
        String      StringBuilder
                       │
                       ▼
                동시 수정이 필요한가?
                       │
                       ▼
                StringBuffer 또는
                별도의 동기화 설계
```

**주의사항**

- String의 불변성이 곧 모든 문자열 처리의 성능 저하를 의미하지는 않는다.
- 단순한 문자열 결합은 컴파일러와 JVM이 최적화할 수 있다.
- StringBuffer는 주요 메서드에 동기화를 적용하지만 복합 작업 전체의 안전성까지 자동으로 보장하지 않는다.

### 6. Math와 System의 활용

Math는 수학 계산에 필요한 정적 메서드를 제공한다.

**주요 Math 메서드**

| 메서드 | 역할 |
|---|---|
| `abs()` | 절댓값 |
| `max()` | 최댓값 |
| `min()` | 최솟값 |
| `ceil()` | 올림 |
| `floor()` | 내림 |
| `round()` | 반올림 |
| `sqrt()` | 제곱근 |
| `random()` | 난수 생성 |

**사용 예제**

```java
System.out.println(Math.abs(-10));   // 10
System.out.println(Math.ceil(3.2));  // 4.0
System.out.println(Math.round(3.5)); // 4
```

**페이지 수 계산**

```java
int total = 103;
int pageSize = 10;

int pages = (int) Math.ceil(
    (double) total / pageSize
);

System.out.println(pages); // 11
```

**System 주요 메서드**

| 메서드 | 역할 |
|---|---|
| `currentTimeMillis()` | 현재 시각 조회 |
| `nanoTime()` | 경과 시간 측정 |
| `getProperty()` | 시스템 속성 조회 |
| `getenv()` | 환경 변수 조회 |
| `arraycopy()` | 배열 복사 |
| `gc()` | 가비지 컬렉션 수행 요청 |

**실행 시간 측정**

```java
long start = System.nanoTime();

int sum = 0;

for (int i = 0; i < 100000; i++) {
    sum += i;
}

long end = System.nanoTime();

System.out.println(end - start);
```

**핵심**

- Math는 객체 생성 없이 정적 메서드로 호출한다.
- System은 시스템 환경 및 실행 정보를 다룬다.
- 경과 시간 측정은 일반적으로 nanoTime()을 사용한다.
- System.gc()는 GC 실행 요청이며 즉시 실행을 보장하지 않는다.

### 7. java.time 날짜와 시간 처리

java.time은 Java의 현대적인 날짜와 시간 API이다.

**주요 클래스**

| 클래스 | 역할 |
|---|---|
| LocalDate | 날짜 |
| LocalTime | 시간 |
| LocalDateTime | 날짜와 시간 |
| ZonedDateTime | 시간대 포함 |
| Instant | 시간선의 특정 시점 |
| Period | 날짜 기반 간격 |
| Duration | 시간 기반 간격 |

**기본 예제**

```java
import java.time.*;

LocalDate date = LocalDate.of(2026, 11, 9);

LocalTime time = LocalTime.of(14, 30);

LocalDateTime dateTime =
    LocalDateTime.of(date, time);

System.out.println(dateTime);
// 2026-11-09T14:30
```

**날짜 변경**

```java
LocalDate today = LocalDate.of(2026, 11, 9);

LocalDate result = today.plusDays(10);

System.out.println(result);
// 2026-11-19
```

**핵심**

- java.time의 주요 날짜·시간 타입은 불변이다.
- plusDays()는 기존 객체를 수정하지 않는다.
- 계산된 날짜를 사용하려면 반환값을 저장해야 한다.
- LocalDateTime은 시간대 정보를 포함하지 않는다.

### 8. Period와 Duration의 차이

Period와 Duration은 두 시점 사이의 간격을 표현하지만 기준 단위가 다르다.

**Period**

Period는 연, 월, 일 단위의 날짜 기반 간격을 표현한다.

```java
import java.time.LocalDate;
import java.time.Period;

LocalDate start = LocalDate.of(2026, 1, 1);
LocalDate end = LocalDate.of(2026, 11, 9);

Period period = Period.between(start, end);

System.out.println(period.getYears());  // 0
System.out.println(period.getMonths()); // 10
System.out.println(period.getDays());   // 8
```

**Duration**

Duration은 시간 기반 간격을 표현한다.

```java
import java.time.LocalTime;
import java.time.Duration;

LocalTime start = LocalTime.of(9, 0);
LocalTime end = LocalTime.of(18, 0);

Duration duration = Duration.between(start, end);

System.out.println(duration.toHours()); // 9
```

**비교**

| 구분 | Period | Duration |
|---|---|---|
| 기준 | 날짜 기반 | 시간 기반 |
| 주요 단위 | 연, 월, 일 | 초, 나노초 |
| 사용 예시 | 회원 가입 경과 기간 | 작업 소요 시간 |
| 대표 메서드 | Period.between() | Duration.between() |

**선택 기준**

```text
             시간 간격 계산
                   │
           ┌───────┴───────┐
           │               │
           ▼               ▼
       연/월/일          시간/분/초
           │               │
           ▼               ▼
         Period          Duration
```

**주의사항**

- Period는 달력 기준의 연·월·일 간격을 표현한다.
- Duration은 초와 나노초 기준의 간격을 표현한다.
- 서로 다른 시간대의 실제 경과 시간을 다룰 때는 Instant 등 적절한 시점 타입을 고려해야 한다.

### 9. 데이터 형식화(Formatting)

데이터 형식화는 값을 사용자에게 읽기 쉬운 문자열 형태로 변환하는 과정이다.

**주요 클래스**

| 클래스 | 역할 |
|---|---|
| DecimalFormat | 숫자 형식 지정 |
| NumberFormat | 숫자 및 통화 형식 지정 |
| SimpleDateFormat | 기존 Date 기반 날짜 형식 |
| DateTimeFormatter | java.time 날짜·시간 형식 |

**DecimalFormat 예제**

```java
import java.text.DecimalFormat;

DecimalFormat format =
    new DecimalFormat("#,###");

System.out.println(format.format(1000000));
// 1,000,000
```

**NumberFormat 예제**

```java
import java.text.NumberFormat;
import java.util.Locale;

NumberFormat format =
    NumberFormat.getCurrencyInstance(Locale.KOREA);

System.out.println(format.format(350000));
```

**DateTimeFormatter 예제**

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

LocalDateTime dateTime =
    LocalDateTime.of(2026, 11, 9, 15, 30);

DateTimeFormatter format =
    DateTimeFormatter.ofPattern(
        "yyyy-MM-dd HH:mm:ss"
    );

System.out.println(dateTime.format(format));
// 2026-11-09 15:30:00
```

**주의사항**

- 데이터의 실제 타입과 출력용 문자열을 구분한다.
- 새로운 java.time 코드에서는 DateTimeFormatter를 우선 고려한다.
- SimpleDateFormat은 가변 객체이며 스레드 안전하지 않다.
- 날짜 형식에서 MM은 월, mm은 분을 의미한다.
- 문자열 형식화는 SQL 매개변수 바인딩을 대신하지 않는다. 데이터베이스 입력에는 PreparedStatement 등을 사용해야 한다.

### 10. 정규표현식(Regex)의 활용 목적

정규표현식은 특정 문자열 패턴을 정의하여 데이터를 검사하거나 필요한 부분을 찾는 기술이다.

**주요 활용**

| 활용 | 설명 |
|---|---|
| Validation | 문자열 형식 검사 |
| Search | 특정 패턴 검색 |
| Extraction | 필요한 문자열 추출 |
| Replacement | 일치하는 문자열 치환 |

**기본 흐름**

```text
           입력 문자열
                │
                ▼
            정규표현식
                │
         ┌──────┼──────┐
         │      │      │
         ▼      ▼      ▼
        검증    추출    치환
         │      │      │
         ▼      ▼      ▼
       true/false  데이터  변경 문자열
```

**핵심**

정규표현식은 문자열 처리에서 반복적인 조건 검사를 간결하게 표현할 수 있다.

### 11. 정규표현식 주요 기호

**문자 클래스**

| 기호 | 의미 |
|---|---|
| `[0-9]` | 숫자 한 개 |
| `[a-z]` | 영문 소문자 |
| `[A-Z]` | 영문 대문자 |
| `[가-힣]` | 지정한 한글 음절 범위 |
| `\d` | 숫자 |
| `\w` | 단어 문자 |
| `\s` | 공백 문자 |
| `.` | 기본적으로 줄바꿈을 제외한 임의의 문자 |

**반복 및 수량**

| 기호 | 의미 |
|---|---|
| `*` | 0개 이상 |
| `+` | 1개 이상 |
| `?` | 0개 또는 1개 |
| `{n}` | 정확히 n개 |
| `{n,m}` | n개 이상 m개 이하 |

**위치 지정**

| 기호 | 의미 |
|---|---|
| `^` | 입력의 시작 |
| `$` | 입력의 끝 |
| `\b` | 단어 경계 |

**그룹화**

```regex
(\d{3})-(\d{4})-(\d{4})
```

- 첫 번째 괄호 : 첫 번째 번호
- 두 번째 괄호 : 가운데 번호
- 세 번째 괄호 : 마지막 번호

괄호를 이용하여 일치한 데이터의 특정 부분을 추출할 수 있다.

### 12. 정규표현식의 이스케이프(Escape)

Java에서는 정규표현식을 문자열 리터럴에 작성할 때 역슬래시를 주의해야 한다.

**정규표현식**

```regex
\d+
```

**Java 문자열**

```java
String regex = "\\d+";
```

**이유**

```text
   Java 소스 코드
       "\\d+"
          │
          ▼
   Java 문자열 처리
          │
          ▼
        \d+
          │
          ▼
   정규표현식 엔진
          │
          ▼
      숫자 1개 이상
```

**주요 변환**

| 정규표현식 | Java 문자열 |
|---|---|
| `\d` | `"\\d"` |
| `\s` | `"\\s"` |
| `\.` | `"\\."` |
| `\w` | `"\\w"` |

**핵심**

정규표현식의 역슬래시를 Java 문자열에서 표현하려면 일반적으로 역슬래시를 한 번 더 작성해야 한다.

### 13. Pattern과 Matcher

Pattern은 정규표현식을 컴파일한 객체이고 Matcher는 실제 문자열과 비교하는 객체이다.

**처리 흐름**

```text
        정규표현식
             │
             ▼
      Pattern.compile()
             │
             ▼
          Pattern
             │
             ▼
      pattern.matcher()
             │
             ▼
          Matcher
             │
      ┌──────┴──────┐
      │             │
      ▼             ▼
   matches()       find()
   전체 검사      부분 탐색
```

**Java 예제**

```java
import java.util.regex.Pattern;
import java.util.regex.Matcher;

String text = "Java123Spring456";

Pattern pattern = Pattern.compile("\\d+");

Matcher matcher = pattern.matcher(text);

while (matcher.find()) {
    System.out.println(matcher.group());
}
```

**실행 결과**

```text
123
456
```

**주요 메서드**

| 메서드 | 역할 |
|---|---|
| `matches()` | 전체 문자열 일치 검사 |
| `find()` | 부분 문자열 검색 |
| `group()` | 일치한 문자열 반환 |
| `group(n)` | 지정한 그룹의 문자열 반환 |
| `start()` | 일치 부분의 시작 인덱스 |
| `end()` | 일치 부분의 끝 다음 인덱스 |

### 14. matches()와 find()의 차이

**matches()**

입력 문자열 전체가 지정한 패턴과 일치해야 true를 반환한다.

```java
String text = "Java123Spring456";

System.out.println(text.matches("\\d+"));
// false
```

**find()**

입력 문자열 내부에서 패턴과 일치하는 부분을 검색한다.

```java
import java.util.regex.*;

Matcher matcher =
    Pattern.compile("\\d+")
           .matcher("Java123Spring456");

while (matcher.find()) {
    System.out.println(matcher.group());
}
```

**실행 결과**

```text
123
456
```

**비교**

| 구분 | matches() | find() |
|---|---|---|
| 검사 범위 | 전체 문자열 | 부분 문자열 |
| 주요 목적 | 유효성 검사 | 데이터 추출 |
| 반환 | boolean | boolean |
| 그룹 추출 | 일치 성공 후 가능 | 일치 성공 후 가능 |

**핵심**

- 입력값이 규칙에 정확하게 맞아야 할 때는 matches()를 사용한다.
- 긴 문자열에서 특정 데이터를 찾을 때는 find()를 사용한다.

### 15. 그룹(Group)을 이용한 데이터 추출

괄호 `()`로 정규표현식을 그룹화하면 일치한 문자열을 부분별로 추출할 수 있다.

**전화번호 추출**

```java
import java.util.regex.*;

String text = "전화번호: 010-1234-5678";

Pattern pattern = Pattern.compile(
    "(\\d{3})-(\\d{4})-(\\d{4})"
);

Matcher matcher = pattern.matcher(text);

if (matcher.find()) {

    System.out.println(matcher.group(0));
    System.out.println(matcher.group(1));
    System.out.println(matcher.group(2));
    System.out.println(matcher.group(3));
}
```

**실행 결과**

```text
010-1234-5678
010
1234
5678
```

**그룹 구조**

```text
       010 - 1234 - 5678
        │      │      │
        ▼      ▼      ▼
     group(1) group(2) group(3)

group(0) = 전체 일치 문자열
```

**주의사항**

- group(0)은 전체 일치 문자열이다.
- group(1)부터 괄호로 묶은 그룹을 반환한다.
- 일치에 성공하지 않은 상태에서 group()을 호출하면 예외가 발생한다.

### 16. 정규표현식을 이용한 문자열 치환

String의 `replaceAll()`은 정규표현식과 일치하는 부분을 지정한 문자열로 치환한다.

**숫자 제거**

```java
String text = "Java123Spring456";

String result = text.replaceAll("\\d+", "");

System.out.println(result);
// JavaSpring
```

**공백 정리**

```java
String text = "Java   Spring   Boot";

String result = text.replaceAll("\\s+", " ");

System.out.println(result);
// Java Spring Boot
```

**replace()와 replaceAll()**

| 메서드 | 의미 |
|---|---|
| `replace()` | 문자 또는 문자열을 그대로 치환 |
| `replaceAll()` | 정규표현식과 일치하는 부분 치환 |
| `replaceFirst()` | 첫 번째 일치 부분만 치환 |

**핵심**

정규표현식은 데이터 검증뿐 아니라 추출과 문자열 정리에도 활용할 수 있다.

### 17. 실무 문자열 검증 예제

**휴대전화 번호 검사**

```java
String phone = "010-1234-5678";

boolean valid = phone.matches(
    "^010-\\d{4}-\\d{4}$"
);

System.out.println(valid); // true
```

**간단한 이메일 형식 검사**

```java
String email = "test@example.com";

boolean valid = email.matches(
    "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"
);
```

**주의사항**

- 이메일 정규표현식은 흔히 사용하는 형식을 검사하는 단순 예제이다.
- 실제 이메일의 모든 유효한 형식을 완벽하게 판별하지는 못한다.
- 정규표현식 검증과 실제 데이터의 유효성 검증은 구분해야 한다.
- 사용자 입력값은 서비스의 요구사항에 맞게 추가 검증해야 한다.

---

### 18. 어노테이션(Annotation)

어노테이션은 클래스, 메서드, 필드 등에 추가 정보를 선언하는 메타데이터이다.

컴파일러와 프레임워크는 어노테이션을 읽어 적절한 처리를 수행할 수 있다.

**대표적인 어노테이션**

| 어노테이션 | 역할 |
|---|---|
| `@Override` | 메서드 재정의 확인 |
| `@Deprecated` | 사용 비권장 표시 |
| `@SuppressWarnings` | 지정한 컴파일러 경고 억제 |
| `@Target` | 어노테이션 적용 대상 설정 |
| `@Retention` | 어노테이션 유지 범위 설정 |

**어노테이션의 구조**

```text
         Java 코드
             │
             ▼
        @Annotation
             │
             ▼
        부가 정보 선언
             │
             ▼
      컴파일러 / 프레임워크
             │
             ▼
        지정된 방식으로 처리
```

**핵심**

어노테이션 자체가 메서드를 자동으로 실행하는 것은 아니다.

어노테이션을 해석하는 처리 코드가 있어야 기능이 수행된다.

### 19. @Target과 @Retention

사용자 정의 어노테이션에서는 적용 대상과 유지 범위를 지정할 수 있다.

**@Target**

| ElementType | 적용 대상 |
|---|---|
| TYPE | 클래스, 인터페이스 등 |
| METHOD | 메서드 |
| FIELD | 필드 |
| PARAMETER | 매개변수 |
| CONSTRUCTOR | 생성자 |

**@Retention**

| RetentionPolicy | 의미 |
|---|---|
| SOURCE | 소스 코드 수준에서만 사용 |
| CLASS | 클래스 파일까지 유지 |
| RUNTIME | 런타임 조회 가능 |

**사용자 정의 어노테이션 예제**

```java
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyExecute {
}
```

**메서드에 적용**

```java
class StudentService {

    @MyExecute
    public void insertStudent() {
        System.out.println("학생 등록");
    }

    public void deleteStudent() {
        System.out.println("학생 삭제");
    }
}
```

**핵심**

- MyExecute는 메서드에만 사용할 수 있다.
- RUNTIME 유지 정책을 사용하므로 실행 중 리플렉션으로 조회할 수 있다.
- 실제 자동 실행 여부는 별도의 처리 코드가 결정한다.

### 20. 리플렉션(Reflection)

리플렉션은 프로그램 실행 중 클래스의 구조와 메타데이터를 분석하거나 메서드를 동적으로 호출하는 기술이다.

**주요 클래스**

| 클래스 | 역할 |
|---|---|
| Class | 타입 정보 조회 |
| Field | 필드 정보 조회 및 접근 |
| Method | 메서드 정보 조회 및 호출 |
| Constructor | 생성자 정보 조회 및 객체 생성 |

**리플렉션 처리 흐름**

```text
         Java 클래스
              │
              ▼
         Class 객체
              │
              ▼
       내부 구조 조회
              │
      ┌───────┼─────────┐
      │       │         │
      ▼       ▼         ▼
    Field   Method   Constructor
              │
              ▼
           invoke()
              │
              ▼
         메서드 실행
```

**메서드 정보 조회**

```java
import java.lang.reflect.Method;

Class<?> clazz = StudentService.class;

Method[] methods = clazz.getDeclaredMethods();

for (Method method : methods) {
    System.out.println(method.getName());
}
```

**메서드 동적 호출**

```java
import java.lang.reflect.Method;

StudentService service = new StudentService();

Method method = StudentService.class
    .getDeclaredMethod("insertStudent");

method.invoke(service);
```

※ 위 메서드 호출은 리플렉션 관련 Checked Exception을 처리하거나 전파해야 한다.

**주의사항**

- getDeclaredMethods()는 해당 클래스에서 선언한 메서드를 조회한다.
- 반환되는 메서드의 순서는 보장되지 않는다.
- 리플렉션은 일반적인 메서드 직접 호출보다 복잡하다.
- private 멤버 접근은 접근 제어 및 모듈 제한의 영향을 받는다.

### 21. Annotation과 Reflection의 관계

Annotation과 Reflection을 결합하면 개발자가 특정 조건에 해당하는 메서드를 직접 호출하지 않아도 자동으로 실행하도록 설계할 수 있다.

**각 기술의 역할**

| 기술 | 역할 |
|---|---|
| Annotation | 실행 대상이나 규칙 선언 |
| Reflection | 실행 중 메서드 및 어노테이션 조회 |
| Method.invoke() | 선택된 메서드 호출 |

**동작 구조**

```text
        @MyExecute 선언
               │
               ▼
        메서드에 부착
               │
               ▼
        Reflection 조회
               │
               ▼
       어노테이션 존재 검사
               │
               ▼
        대상 메서드 결정
               │
               ▼
         Method.invoke()
               │
               ▼
           메서드 실행
```

**핵심**

어노테이션은 실행 대상을 표시하고, 리플렉션은 그 대상을 찾아 실행하는 역할을 수행할 수 있다.

### 22. 어노테이션 기반 자동화 스캐너

강의자료에서는 어노테이션과 리플렉션을 결합한 자동화 처리 구조를 다룬다.

**5단계 자동화 파이프라인**

```text
  1. Define
     어노테이션 정의
          │
          ▼
  2. Attach
     메서드에 적용
          │
          ▼
  3. Search
     Reflection으로 검색
          │
          ▼
  4. Check
     어노테이션 존재 확인
          │
          ▼
  5. Execute
     Method.invoke() 실행
```

**주요 메서드**

| 메서드 | 역할 |
|---|---|
| `getDeclaredMethods()` | 메서드 목록 조회 |
| `isAnnotationPresent()` | 어노테이션 존재 확인 |
| `getAnnotation()` | 어노테이션 정보 조회 |
| `invoke()` | 메서드 실행 |

**핵심**

자동화 스캐너는 코드에서 실행 대상을 탐색하고, 조건에 맞는 메서드를 선택하여 실행하는 구조이다.

### 23. 자동화 스캐너 구현 예제

다음은 사용자 정의 어노테이션이 부착된 메서드만 순서대로 실행하는 예제이다.

**전체 Java 예제**

```java
import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

// 1. 어노테이션 정의
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyExecute {

    int order();
}

// 2. 실행 대상 클래스
class StudentService {

    @MyExecute(order = 2)
    public void insertStudent() {
        System.out.println("2. 학생 등록");
    }

    @MyExecute(order = 1)
    public void initialize() {
        System.out.println("1. 초기화");
    }

    public void deleteStudent() {
        System.out.println("실행 대상 아님");
    }
}

// 3. 자동화 스캐너
public class Day22Example {

    public static void main(String[] args)
            throws ReflectiveOperationException {

        StudentService service = new StudentService();

        // 메서드 조회
        Method[] methods = StudentService.class
                .getDeclaredMethods();

        // 어노테이션이 있는 메서드만 선택 후 정렬
        Method[] targets = Arrays.stream(methods)
                .filter(method ->
                    method.isAnnotationPresent(
                        MyExecute.class
                    )
                )
                .sorted(
                    Comparator.comparingInt(method ->
                        method.getAnnotation(
                            MyExecute.class
                        ).order()
                    )
                )
                .toArray(Method[]::new);

        // 동적 메서드 실행
        for (Method method : targets) {
            method.invoke(service);
        }
    }
}
```

**실행 결과**

```text
1. 초기화
2. 학생 등록
```

**실행 원리**

1. @MyExecute 어노테이션을 선언한다.
2. 실행할 메서드에 어노테이션을 적용한다.
3. Reflection으로 클래스의 메서드 목록을 조회한다.
4. 어노테이션이 있는 메서드만 선택한다.
5. order 값을 기준으로 정렬한다.
6. Method.invoke()로 메서드를 실행한다.

**핵심**

- 실행 대상을 어노테이션으로 구분할 수 있다.
- 메서드 호출 순서를 메타데이터로 관리할 수 있다.
- 새로운 대상 메서드를 추가하더라도 스캐너의 검색 코드를 그대로 재사용할 수 있다.
- 일반적인 자바 메서드 실행이 아닌 런타임 기반 동적 제어를 경험할 수 있다.

### 24. 리플렉션을 이용한 매개변수 전달

Method.invoke()는 메서드 실행 시 매개변수도 전달할 수 있다.

**예제**

```java
class GreetingService {

    public void hello(String name) {
        System.out.println("Hello " + name);
    }
}
```

**동적 호출**

```java
import java.lang.reflect.Method;

GreetingService service = new GreetingService();

Method method = GreetingService.class
        .getDeclaredMethod("hello", String.class);

method.invoke(service, "홍길동");
```

**실행 결과**

```text
Hello 홍길동
```

**핵심**

- 메서드를 검색할 때 이름과 매개변수 타입을 지정할 수 있다.
- invoke()에는 호출 대상 객체와 실제 매개변수를 전달한다.
- 동적 호출도 메서드의 매개변수 타입과 개수를 지켜야 한다.

### 25. Annotation 기반 입력 검증

어노테이션은 데이터 검증 규칙을 표현하는 데도 활용할 수 있다.

**개념적 구조**

```text
          입력 데이터
               │
               ▼
       @RegexValidator
        정규표현식 선언
               │
               ▼
       Reflection 검사
               │
               ▼
         Regex 검증
               │
               ▼
        유효성 결과 반환
```

**개념 예제**

```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface RegexValidator {
    String regex();
}
```

**사용 예제**

```java
class MemberRequest {

    @RegexValidator(
        regex = "^010-\\d{4}-\\d{4}$"
    )
    private String phone;
}
```

**검증 엔진의 역할**

- 필드에 붙은 어노테이션을 조회한다.
- regex 속성의 문자열을 읽는다.
- 해당 필드의 값을 가져온다.
- Pattern 또는 Matcher로 형식을 검사한다.
- 검사 결과에 따라 다음 처리 여부를 결정한다.

※ 이 예제에서 어노테이션만 선언한다고 검증이 자동으로 실행되지는 않는다. Reflection을 사용하는 검증 처리 코드가 별도로 필요하다.

**Spring과의 연결**

Spring 기반 프로그램에서는 Jakarta Bean Validation의 `@Pattern` 같은 어노테이션을 활용할 수 있다.

이때 검증 기능은 Java 기본 정규표현식만으로 자동 실행되는 것이 아니라, 검증 프레임워크와 Spring의 연동을 통해 수행된다.

### 26. 미니 MVC 라우터의 동작 원리

강의자료에서는 어노테이션과 리플렉션을 응용하여 간단한 라우터를 설계하는 방법을 설명한다.

라우터는 입력된 경로와 실행할 메서드를 연결하는 역할을 수행한다.

**처리 구조**

```text
        사용자 요청
             │
             ▼
        요청 경로 확인
             │
             ▼
      어노테이션 검색
             │
             ▼
       경로 정보 비교
             │
             ▼
        대상 메서드 결정
             │
             ▼
       Method.invoke()
             │
             ▼
          결과 반환
```

**일반적인 구현과 비교**

```text
[직접 분기 처리]

if (path.equals("home")) {
    home();
} else if (path.equals("login")) {
    login();
}


[Annotation + Reflection]

@Route("home")
public void home() {}

@Route("login")
public void login() {}
```

**핵심**

- 요청 경로와 메서드의 관계를 어노테이션으로 정의할 수 있다.
- 라우터는 런타임에 메서드의 메타데이터를 조회할 수 있다.
- 일치하는 경로의 메서드를 동적으로 호출할 수 있다.

### 27. 미니 라우터 구현 예제

다음은 HTTP 서버 없이 문자열 경로를 받아 메서드를 실행하는 간단한 Java 예제이다.

**Java 예제**

```java
import java.lang.annotation.*;
import java.lang.reflect.Method;

// 경로 어노테이션
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Route {

    String value();
}

// 실행할 메서드
class PageController {

    @Route("home")
    public void home() {
        System.out.println("홈 페이지");
    }

    @Route("login")
    public void login() {
        System.out.println("로그인 페이지");
    }
}

// 라우터
public class MiniRouter {

    public static void main(String[] args)
            throws ReflectiveOperationException {

        String path = "home";

        PageController controller =
            new PageController();

        for (Method method :
                PageController.class.getDeclaredMethods()) {

            Route route = method.getAnnotation(
                Route.class
            );

            if (route != null &&
                route.value().equals(path)) {

                method.invoke(controller);
                break;
            }
        }
    }
}
```

**실행 결과**

```text
홈 페이지
```

**실행 과정**

```text
      path = "home"
            │
            ▼
   PageController 검색
            │
            ▼
     @Route 정보 조회
            │
            ▼
      "home" 일치
            │
            ▼
    home() 메서드 실행
            │
            ▼
        홈 페이지
```

**핵심**

- 메서드와 경로 정보를 분리할 수 있다.
- 새로운 메서드에 @Route를 추가하여 처리 대상을 확장할 수 있다.
- 이 예제는 라우팅 개념을 설명하기 위한 교육용 코드이다.
- 실제 Spring MVC는 HTTP 메서드, 매개변수 바인딩, 예외 처리, 요청 매핑 등 훨씬 많은 기능을 제공한다.

### 28. Java 자동화 원리와 Spring Framework

Spring은 어노테이션과 런타임 메타데이터를 활용하여 다양한 자동화 기능을 제공한다.

**Java 개념과 Spring 기능의 연결**

| Java 개념 | Spring 활용 예시 |
|---|---|
| Annotation | @Component, @Service |
| Reflection | 타입 및 메타데이터 분석 |
| Method.invoke() | 동적 호출을 구현하는 수단 중 하나 |
| 객체 생성 | Spring Bean 관리 |
| @PostConstruct | 초기화 콜백 |
| @Scheduled | 예약 작업 |
| @GetMapping | GET 요청 매핑 |
| AOP | 공통 관심사 분리 |

**개념적인 처리 흐름**

```text
         개발자가 작성한 클래스
                   │
                   ▼
           어노테이션 선언
                   │
                   ▼
           Spring 컨테이너
                   │
                   ▼
         컴포넌트 탐색 및 등록
                   │
                   ▼
           객체 생성 및 관리
                   │
                   ▼
         요청 및 이벤트 처리
                   │
                   ▼
             메서드 실행
```

**주의사항**

- Spring은 리플렉션 외에도 프록시, 메서드 핸들, 여러 내부 최적화 기술을 활용할 수 있다.
- @GetMapping은 요청 경로를 선언하지만 실제 요청 처리는 Spring MVC의 여러 구성 요소가 담당한다.
- @Scheduled는 해당 기능을 활성화하고 적절하게 설정해야 동작한다.
- 어노테이션과 리플렉션을 이해하면 프레임워크의 내부 구조를 학습하는 데 도움이 된다.

### 29. Java 라이브러리 종합 활용

강의자료의 회원 관리 예시는 여러 Java 라이브러리를 하나의 기능으로 연결하는 구조이다.

**회원 관리 시스템 예시**

| 기능 | 활용 기술 |
|---|---|
| 나이 문자열 변환 | Integer.parseInt() |
| 휴대전화 형식 검사 | Pattern.matches() |
| 가입일 생성 | LocalDate.now() |
| 가입 경과 기간 계산 | Period |
| 회원 정보 문자열 조합 | StringBuilder |
| 실행 메서드 자동 탐색 | Reflection |
| 실행 대상 선언 | Annotation |

**전체 구조**

```text
           회원 정보 입력
                 │
                 ▼
           데이터 형식 검사
              Regex
                 │
                 ▼
           데이터 타입 변환
             Wrapper
                 │
                 ▼
           가입일 생성
            java.time
                 │
                 ▼
           회원 정보 생성
                 │
                 ▼
          비즈니스 로직 처리
                 │
                 ▼
            결과 문자열
           StringBuilder
                 │
                 ▼
              결과 출력
```

**핵심**

각 라이브러리의 역할을 명확하게 구분하여 필요한 기능을 조합하는 것이 중요하다.

### 30. 학습 시 주의사항

| 주의사항 | 핵심 내용 |
|---|---|
| `==`와 equals() | 참조 동일성과 값 동등성 구분 |
| equals()와 hashCode() | 재정의 시 동등성 규칙 유지 |
| 참조값 대입 | 객체 복제가 아닌 참조값 복사 |
| clone() | 기본 동작은 얕은 복사 |
| Java 매개변수 전달 | 항상 값에 의한 전달 |
| finalize() | 예측 가능한 자원 정리에 사용하지 않음 |
| String | 불변성 및 반환값 확인 |
| StringBuilder | 동기화되지 않은 가변 객체 |
| StringBuffer | 주요 메서드 동기화, 복합 작업 별도 고려 |
| Wrapper | null 언박싱 주의 |
| Math | 정수 나눗셈과 형변환 주의 |
| System.gc() | GC 실행 보장 없음 |
| System.nanoTime() | 경과 시간 측정에 사용 |
| LocalDateTime | 시간대 정보 없음 |
| Period와 Duration | 날짜 기반과 시간 기반 구분 |
| DateTimeFormatter | MM과 mm 구분 |
| SimpleDateFormat | 가변 객체 및 스레드 안전성 주의 |
| Regex | Java 문자열의 역슬래시 이스케이프 |
| matches() | 전체 일치 검사 |
| find() | 부분 일치 탐색 |
| group() | 일치 성공 후 호출 |
| Reflection | 접근 권한, 예외 처리, 성능 고려 |
| getDeclaredMethods() | 반환 순서 보장 없음 |
| Annotation | 자체적으로 기능을 실행하지 않음 |
| @Retention | 런타임 조회에는 RUNTIME 필요 |
| Method.invoke() | 대상 객체와 매개변수 확인 |
| Spring | 실제 구현은 교육용 스캐너보다 복잡함 |

### ✅ Day22 핵심 정리

| 구분 | 핵심 개념 |
|---|---|
| Object | 최상위 클래스 |
| equals() | 객체 동등성 비교 |
| hashCode() | 객체 해시 코드 |
| clone() | 객체 복제 지원 |
| Shallow Copy | 내부 참조 객체를 공유할 수 있는 복사 |
| Deep Copy | 내부 객체까지 별도 복제 |
| Wrapper | 기본형의 객체 표현 |
| Boxing | 기본형을 Wrapper로 변환 |
| Unboxing | Wrapper를 기본형으로 변환 |
| String | 불변 문자열 |
| StringBuilder | 가변 문자열 |
| StringBuffer | 주요 메서드가 동기화된 가변 문자열 |
| Math | 수학 계산 |
| System | 시스템 정보 및 실행 환경 |
| java.time | 날짜·시간 처리 API |
| LocalDate | 날짜 |
| LocalTime | 시간 |
| LocalDateTime | 날짜와 시간 |
| Instant | 특정 시점 |
| Period | 날짜 기반 간격 |
| Duration | 시간 기반 간격 |
| DecimalFormat | 숫자 형식 지정 |
| NumberFormat | 숫자 및 통화 형식 |
| DateTimeFormatter | 날짜·시간 형식 지정 |
| Regex | 문자열 패턴 |
| Pattern | 정규표현식 컴파일 |
| Matcher | 정규표현식 검사 및 검색 |
| matches() | 전체 일치 검사 |
| find() | 부분 일치 검색 |
| group() | 일치 문자열 추출 |
| replaceAll() | 정규표현식 기반 문자열 치환 |
| Annotation | 메타데이터 선언 |
| @Target | 적용 대상 지정 |
| @Retention | 유지 범위 지정 |
| Reflection | 런타임 타입 정보 분석 |
| Method | 리플렉션 메서드 정보 |
| getDeclaredMethods() | 선언된 메서드 목록 조회 |
| isAnnotationPresent() | 어노테이션 존재 확인 |
| getAnnotation() | 어노테이션 정보 조회 |
| invoke() | 메서드 동적 호출 |
| Automation Scanner | 메타데이터 기반 실행 대상 검색 |
| Routing | 요청과 처리 메서드 연결 |

**최종 학습 정리**

- Java 코어 라이브러리는 공통적인 데이터 처리 기능을 제공한다.
- Object는 모든 클래스의 최상위 부모이다.
- equals()는 객체 동등성 비교에 사용하고 hashCode()와의 규칙을 고려해야 한다.
- 참조형 변수의 대입은 객체를 복제하지 않는다.
- clone()의 기본 복제는 얕은 복사이다.
- Wrapper는 기본형 데이터를 객체로 사용할 수 있도록 한다.
- 제네릭 컬렉션에서는 Integer와 같은 Wrapper 타입을 활용한다.
- String은 불변 객체이며 StringBuilder와 StringBuffer는 가변 객체이다.
- Math는 수학 계산을 제공하고 System은 환경 정보와 시간 측정 기능을 제공한다.
- java.time은 날짜 및 시간 데이터를 처리하기 위한 현대적인 API이다.
- Period는 연·월·일 기반의 기간을 표현한다.
- Duration은 초·나노초 기반의 시간 간격을 표현한다.
- DecimalFormat과 NumberFormat은 숫자를 원하는 형식으로 출력한다.
- DateTimeFormatter는 날짜와 시간을 원하는 문자열 형식으로 변환한다.
- 정규표현식은 검증, 검색, 추출, 치환에 활용할 수 있다.
- Pattern은 정규표현식을 컴파일하고 Matcher는 입력 문자열과 비교한다.
- matches()는 전체 문자열 일치 여부를 검사한다.
- find()는 문자열 내부에서 일치하는 부분을 탐색한다.
- group()은 일치한 부분을 추출한다.
- Java 문자열에 정규표현식을 작성할 때는 이스케이프 처리를 주의해야 한다.
- Annotation은 클래스, 메서드, 필드 등에 메타데이터를 추가한다.
- Reflection은 런타임에 클래스 구조와 어노테이션 정보를 분석할 수 있다.
- Method.invoke()를 이용하면 메서드를 동적으로 호출할 수 있다.
- Annotation과 Reflection을 결합하면 메서드 자동 검색 및 실행 시스템을 구성할 수 있다.
- 자동화 스캐너는 Define → Attach → Search → Check → Execute 단계로 이해할 수 있다.
- 메서드 실행 순서는 어노테이션 속성과 정렬 로직으로 지정할 수 있다.
- 라우터는 요청 경로에 대응하는 처리 메서드를 선택하는 역할을 한다.
- Spring Framework는 Java의 객체지향, 메타데이터, 런타임 처리 기능 등을 활용한다.
- Java 라이브러리의 핵심은 개별 메서드 암기가 아니라 기능들을 연결하여 프로그램을 설계하는 것이다.

</details>


## Day23. Java 리플렉션·어노테이션·제네릭 심화
<details>

### 🎯 학습 목표
- 리플렉션의 개념과 일반적인 메서드 호출과의 차이를 이해한다.
- Class 객체를 획득하는 세 가지 방법을 익힌다.
- Field, Constructor, Method를 이용한 동적 접근 방법을 이해한다.
- 어노테이션이 메타데이터를 제공하는 원리를 이해한다.
- @Target과 @Retention의 차이를 구분한다.
- 어노테이션과 리플렉션을 결합한 자동화 구조를 이해한다.
- 정규표현식을 이용한 문자열 검증, 검색, 추출, 치환을 익힌다.
- Pattern과 Matcher의 주요 메서드를 구분한다.
- 제네릭의 도입 목적과 타입 안정성의 의미를 이해한다.
- 제네릭 클래스, 메서드, 인터페이스를 구현할 수 있다.
- 제한된 타입 매개변수와 와일드카드를 이해한다.
- PECS 원칙을 이용하여 제네릭 타입을 설계할 수 있다.
- 타입 소거(Type Erasure)의 원리와 제네릭의 제약사항을 이해한다.
- 제네릭을 활용한 공통 API 응답 및 Repository 설계 원리를 이해한다.

---

### 1. Reflection과 Annotation의 개념

리플렉션(Reflection)과 어노테이션(Annotation)은 Java 프로그램의 구조를 분석하고 자동화 기능을 구현하는 데 활용되는 기술이다.

**핵심 개념**

| 구분 | Reflection | Annotation |
|---|---|---|
| 의미 | 실행 중 클래스의 구조를 분석·조작하는 기술 | 코드에 부착하는 메타데이터 |
| 목적 | 런타임 동적 접근 및 실행 | 추가 정보와 처리 규칙 선언 |
| 주요 요소 | Class, Field, Method, Constructor | @interface, @Target, @Retention |
| 실행 기능 | 메서드 호출 및 객체 생성 가능 | 자체 실행 기능 없음 |
| 대표 활용 | 동적 객체 생성, 메서드 탐색 | Spring 설정, 테스트 메서드 지정 |

**동작 관계**

```text id="1v57jy"
         Java 클래스
              │
              ▼
       @Annotation 선언
              │
              ▼
         프로그램 실행
              │
              ▼
       Reflection 검사
              │
              ▼
       어노테이션 조회
              │
              ▼
       해당 규칙에 따라 처리
              │
              ▼
         메서드 실행
```

**핵심**

- Annotation은 클래스나 메서드에 의미를 부여한다.
- Reflection은 실행 중 클래스 구조와 어노테이션을 조회한다.
- 두 기술을 결합하면 메타데이터 기반 자동화 시스템을 구현할 수 있다.

### 2. 정적 호출과 동적 호출

일반적인 Java 코드는 컴파일 시점에 호출 대상의 타입과 메서드가 확인된다.

리플렉션을 사용하면 실행 중 메서드 이름이나 타입 정보를 이용하여 호출 대상을 결정할 수 있다.

**일반적인 메서드 호출**

```java id="cdoewd"
class Student {

    public void study() {
        System.out.println("공부 시작");
    }
}

Student student = new Student();

student.study();
```

**리플렉션을 이용한 호출**

```java id="kj98oo"
import java.lang.reflect.Method;

Student student = new Student();

Class<?> clazz = student.getClass();

Method method = clazz.getDeclaredMethod("study");

method.invoke(student);
```

※ 두 번째 예제의 리플렉션 관련 Checked Exception은 실제 코드에서 처리하거나 전파해야 한다.

**차이점**

| 구분 | 일반적인 호출 | Reflection |
|---|---|---|
| 호출 대상 | 코드에서 직접 지정 | 실행 중 탐색 가능 |
| 메서드 확인 | 컴파일 시 검사 | 런타임 검사 가능 |
| 타입 안정성 | 높음 | 상대적으로 낮음 |
| 실행 비용 | 일반적으로 적음 | 추가 비용 발생 가능 |
| 활용 | 일반적인 비즈니스 로직 | 프레임워크 및 동적 시스템 |

**핵심**

일반적인 기능 구현에서는 직접 호출을 우선 사용하고, 실행 중 타입이나 메서드를 탐색해야 하는 경우 Reflection을 고려한다.

### 3. Class 객체

Class 객체는 Java 클래스의 런타임 타입 정보를 표현하는 객체이다.

리플렉션을 사용하려면 먼저 Class 객체를 획득해야 한다.

**Class 객체 획득 방법**

| 방법 | 사용 예 | 특징 |
|---|---|---|
| `.class` | `Student.class` | 클래스 타입을 직접 지정 |
| `getClass()` | `student.getClass()` | 객체의 실제 런타임 타입 조회 |
| `Class.forName()` | `Class.forName("Student")` | 클래스 이름으로 동적 로드 |

**Java 예제**

```java id="5ge97n"
class Student {
}
```

```java id="flpxtd"
Student student = new Student();

// 1. 클래스 리터럴
Class<?> c1 = Student.class;

// 2. 인스턴스에서 획득
Class<?> c2 = student.getClass();

// 3. 클래스 이름으로 획득
Class<?> c3 = Class.forName("Student");
```

※ Class.forName()은 ClassNotFoundException을 처리하거나 전파해야 하며, 패키지가 있는 클래스는 정규화된 클래스 이름을 사용해야 한다.

**Class에서 조회할 수 있는 정보**

- 클래스 이름
- 패키지 정보
- 상속 관계
- 구현 인터페이스
- 선언된 필드
- 선언된 메서드
- 생성자
- 어노테이션

**핵심**

Class 객체는 Reflection을 이용하여 클래스의 내부 구조를 탐색하기 위한 시작점이다.

### 4. Field를 이용한 필드 접근

Field는 클래스에 선언된 필드 정보를 나타낸다.

리플렉션을 통해 필드 이름과 타입을 조회하고 값을 읽거나 변경할 수 있다.

**Java 예제**

```java id="rggp76"
class Member {

    private String name = "홍길동";
}
```

**필드 정보 조회 및 값 변경**

```java id="j4gvtq"
import java.lang.reflect.Field;

Member member = new Member();

Class<?> clazz = Member.class;

// 필드 조회
Field field = clazz.getDeclaredField("name");

// 접근 검사 해제 시도
field.setAccessible(true);

// 필드값 변경
field.set(member, "김철수");

// 필드값 조회
String value = (String) field.get(member);

System.out.println(value);
// 김철수
```

※ Reflection 관련 Checked Exception은 처리하거나 전파해야 한다.

**주요 메서드**

| 메서드 | 역할 |
|---|---|
| `getDeclaredField()` | 해당 클래스에 선언된 필드 검색 |
| `getDeclaredFields()` | 선언된 필드 목록 조회 |
| `get()` | 필드값 읽기 |
| `set()` | 필드값 변경 |
| `setAccessible()` | 접근 검사 해제 요청 |

**주의사항**

- private 필드에 대한 접근은 캡슐화 원칙과 충돌할 수 있다.
- setAccessible(true)가 항상 접근을 허용하는 것은 아니다.
- Java 모듈 시스템과 실행 환경에 따라 접근이 제한될 수 있다.
- 일반 애플리케이션 코드에서 private 필드를 무분별하게 변경하는 것은 권장되지 않는다.

### 5. Constructor를 이용한 동적 객체 생성

Constructor는 생성자에 대한 정보를 제공한다.

리플렉션을 이용하면 실행 중 생성자를 조회하고 객체를 생성할 수 있다.

**Java 예제**

```java id="wgxuad"
class Member {

    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

**동적 객체 생성**

```java id="qu815e"
import java.lang.reflect.Constructor;

Class<Member> clazz = Member.class;

Constructor<Member> constructor =
    clazz.getDeclaredConstructor(
        String.class,
        int.class
    );

Member member =
    constructor.newInstance("홍길동", 20);
```

**동작 구조**

```text id="em91cn"
         Member.class
               │
               ▼
     getDeclaredConstructor()
               │
               ▼
       생성자 정보 획득
               │
               ▼
         newInstance()
               │
               ▼
         Member 객체 생성
```

**주요 메서드**

| 메서드 | 역할 |
|---|---|
| `getDeclaredConstructor()` | 특정 생성자 검색 |
| `getDeclaredConstructors()` | 선언된 생성자 목록 조회 |
| `newInstance()` | 해당 생성자를 이용하여 객체 생성 |

**핵심**

리플렉션은 컴파일 시점에 직접 new를 호출하는 코드 없이도 실행 중 객체를 생성할 수 있다.

### 6. Method를 이용한 동적 실행

Method는 클래스의 메서드 정보를 표현한다.

**Java 예제**

```java id="6u35af"
class MemberService {

    public void hello(String name, int age) {

        System.out.println(
            name + " : " + age
        );
    }
}
```

**메서드 검색 및 실행**

```java id="69e1bg"
import java.lang.reflect.Method;

MemberService service = new MemberService();

Class<?> clazz = MemberService.class;

Method method = clazz.getDeclaredMethod(
    "hello",
    String.class,
    int.class
);

method.invoke(service, "홍길동", 20);
```

**실행 결과**

```text id="8npl9c"
홍길동 : 20
```

**주요 메서드**

| 메서드 | 역할 |
|---|---|
| `getDeclaredMethod()` | 특정 메서드 검색 |
| `getDeclaredMethods()` | 해당 클래스가 선언한 메서드 조회 |
| `getMethods()` | 상속받은 public 메서드를 포함하여 조회 |
| `invoke()` | 메서드 동적 호출 |

**핵심**

- invoke()의 첫 번째 인자는 메서드를 호출할 대상 객체이다.
- 이후 인자는 실제 메서드에 전달할 매개변수이다.
- 메서드 이름뿐 아니라 매개변수 타입까지 일치해야 한다.
- 정적 메서드는 invoke()의 대상 객체로 null을 전달할 수 있다.

### 7. getDeclared와 get의 차이

리플렉션에서 메서드 이름에 Declared가 포함된 경우와 그렇지 않은 경우의 조회 범위를 구분해야 한다.

| 메서드 | 조회 범위 |
|---|---|
| `getDeclaredFields()` | 해당 클래스에서 선언한 모든 필드 |
| `getFields()` | 접근 가능한 public 필드 및 상속된 public 필드 |
| `getDeclaredMethods()` | 해당 클래스에서 선언한 모든 메서드 |
| `getMethods()` | public 메서드 및 상속된 public 메서드 |

**핵심**

- Declared는 해당 클래스에서 직접 선언한 멤버를 대상으로 한다.
- getMethods()는 상속된 public 메서드도 포함한다.
- 멤버 정보를 조회할 수 있다는 것과 실제로 접근할 수 있다는 것은 다르다.

### 8. 어노테이션(Annotation)의 역할

어노테이션은 코드에 부착하는 메타데이터이다.

컴파일러나 프레임워크가 특정 대상을 식별하고 처리 규칙을 결정하는 데 사용한다.

**대표적인 어노테이션**

| 어노테이션 | 목적 |
|---|---|
| `@Override` | 메서드 재정의 검사 |
| `@Deprecated` | 사용 비권장 선언 |
| `@SuppressWarnings` | 지정한 경고 억제 |
| `@FunctionalInterface` | 함수형 인터페이스 규칙 검사 |
| `@Target` | 어노테이션 적용 대상 지정 |
| `@Retention` | 어노테이션 유지 범위 지정 |

**Java 예제**

```java id="acnv5s"
class Parent {

    public void hello() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    @Override
    public void hello() {
        System.out.println("Child");
    }
}
```

**핵심**

어노테이션은 코드에 추가 정보를 부여하지만, 어노테이션 자체가 일반적인 Java 메서드를 자동으로 실행하는 것은 아니다.

### 9. 사용자 정의 어노테이션

사용자는 @interface 키워드를 이용하여 직접 어노테이션을 선언할 수 있다.

**어노테이션 정의**

```java id="5m63x5"
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Execute {

    int order() default 0;
}
```

**사용 예제**

```java id="zbpdqo"
class StudentService {

    @Execute(order = 1)
    public void initialize() {
        System.out.println("초기화");
    }

    @Execute(order = 2)
    public void insert() {
        System.out.println("데이터 등록");
    }
}
```

**구성 요소**

| 요소 | 역할 |
|---|---|
| `@interface` | 어노테이션 정의 |
| `order()` | 어노테이션의 속성 |
| `default` | 속성의 기본값 |
| `@Target` | 적용할 코드 요소 지정 |
| `@Retention` | 어노테이션 유지 범위 지정 |

**핵심**

사용자 정의 어노테이션을 통해 코드에 실행 순서나 설정값 등의 메타데이터를 저장할 수 있다.

### 10. @Target과 @Retention

@Target은 어노테이션을 적용할 위치를 제한한다.

**@Target**

| ElementType | 대상 |
|---|---|
| TYPE | 클래스, 인터페이스, enum 등 |
| FIELD | 필드 |
| METHOD | 메서드 |
| CONSTRUCTOR | 생성자 |
| PARAMETER | 매개변수 |

@Retention은 어노테이션 정보를 얼마나 오래 유지할지 지정한다.

**@Retention**

| RetentionPolicy | 유지 범위 |
|---|---|
| SOURCE | 소스 코드 수준 |
| CLASS | 클래스 파일까지 |
| RUNTIME | 실행 중 리플렉션으로 조회 가능 |

**예제**

```java id="ni3zuu"
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
}
```

**핵심**

- 런타임에서 어노테이션을 검색하려면 RUNTIME 유지 정책이 필요하다.
- @Retention을 생략하면 기본 정책은 CLASS이다.
- @Target을 생략하면 다양한 선언 위치에 사용할 수 있다.

### 11. Annotation과 Reflection 결합

어노테이션과 리플렉션을 결합하면 메서드를 자동으로 검색하고 실행하는 시스템을 만들 수 있다.

**처리 과정**

```text id="n0w4fo"
        @Execute 선언
              │
              ▼
       메서드에 적용
              │
              ▼
       클래스 정보 조회
              │
              ▼
       메서드 목록 검색
              │
              ▼
     어노테이션 존재 검사
              │
              ▼
        조건에 맞게 처리
              │
              ▼
          동적 실행
```

**어노테이션 검사**

```java id="se58jk"
import java.lang.reflect.Method;

Class<?> clazz = StudentService.class;

Method[] methods = clazz.getDeclaredMethods();

for (Method method : methods) {

    if (method.isAnnotationPresent(
            Execute.class)) {

        System.out.println(method.getName());
    }
}
```

**어노테이션 속성 조회**

```java id="t8f13d"
Execute annotation =
    method.getAnnotation(Execute.class);

int order = annotation.order();
```

**핵심**

- isAnnotationPresent()로 어노테이션의 존재를 확인한다.
- getAnnotation()으로 어노테이션 객체와 속성을 조회한다.
- 조회된 정보를 이용하여 실행 순서나 처리 조건을 결정할 수 있다.

### 12. 어노테이션 기반 자동 실행 시스템

**Java 예제**

```java id="5wn3g9"
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Execute {
    int order();
}

class TaskService {

    @Execute(order = 2)
    public void save() {
        System.out.println("데이터 저장");
    }

    @Execute(order = 1)
    public void initialize() {
        System.out.println("초기화");
    }

    public void delete() {
        System.out.println("실행 제외");
    }
}

public class AnnotationRunner {

    public static void main(String[] args)
            throws ReflectiveOperationException {

        TaskService service = new TaskService();

        Method[] methods =
            TaskService.class.getDeclaredMethods();

        Arrays.stream(methods)
            .filter(method ->
                method.isAnnotationPresent(Execute.class)
            )
            .sorted(Comparator.comparingInt(method ->
                method.getAnnotation(Execute.class).order()
            ))
            .forEach(method -> {
                try {
                    method.invoke(service);
                } catch (ReflectiveOperationException e) {
                    throw new RuntimeException(e);
                }
            });
    }
}
```

**실행 결과**

```text id="j3vu37"
초기화
데이터 저장
```

**동작 원리**

1. @Execute 어노테이션을 정의한다.
2. 실행 대상 메서드에 적용한다.
3. Reflection으로 메서드 목록을 조회한다.
4. 어노테이션이 있는 메서드만 필터링한다.
5. order 속성으로 실행 순서를 정렬한다.
6. invoke()로 실제 메서드를 호출한다.

**핵심**

이 구조는 프레임워크에서 메타데이터를 활용해 처리 대상을 찾아내는 원리를 이해하기 위한 기초 예제이다.

### 13. Reflection과 Annotation의 실무 활용

강의자료에서는 두 기술이 다양한 Java 프레임워크와 라이브러리에서 활용된다는 점을 강조한다.

| 기술 | 대표 어노테이션 | 활용 목적 |
|---|---|---|
| Spring | @Controller, @Autowired | 컴포넌트 및 의존성 관리 |
| JUnit | @Test, @BeforeEach | 테스트 메서드 탐색 및 실행 |
| JPA | @Entity, @Id | 객체와 DB 테이블의 매핑 |
| Lombok | @Getter, @Builder | 컴파일 시 코드 생성 |
| Jackson | @JsonProperty, @JsonIgnore | JSON 변환 규칙 설정 |

**주의**

위 기술들이 모두 리플렉션만으로 동작하는 것은 아니다.

예를 들어 Lombok은 주로 컴파일 단계에서 코드를 생성하며, Spring은 리플렉션 외에도 여러 메커니즘을 사용한다.

**Spring에서의 개념적 흐름**

```text id="9u60pj"
         Spring 실행
              │
              ▼
      설정 및 클래스 탐색
              │
              ▼
       어노테이션 확인
              │
              ▼
       Bean 정의 등록
              │
              ▼
       객체 생성 및 의존성 연결
              │
              ▼
        프로그램 기능 실행
```

### 14. Reflection 사용 시 주의사항

| 주의사항 | 설명 |
|---|---|
| 접근 제어 | private 접근을 무조건 허용하지 않음 |
| 실행 비용 | 동적 탐색 및 호출에 추가 비용 발생 가능 |
| 타입 안정성 | 컴파일 시 확인할 수 없는 오류 발생 가능 |
| 예외 처리 | ReflectiveOperationException 계열 고려 |
| 메서드 순서 | getDeclaredMethods()의 반환 순서 보장 없음 |
| 보안·유지보수 | 캡슐화를 불필요하게 우회하지 않도록 주의 |
| 일반적인 호출 | 가능하면 직접 호출과 타입 기반 설계를 우선 고려 |

**핵심**

리플렉션은 프레임워크와 도구 구현에 유용하지만, 일반적인 애플리케이션 코드에서 무분별하게 사용하는 것은 피해야 한다.

---

### 15. 정규표현식(Regex) 심화

정규표현식은 문자열 패턴을 정의하여 검색, 검증, 추출, 치환 작업을 수행하는 기술이다.

**주요 활용**

| 기능 | 용도 |
|---|---|
| Validation | 입력 형식 검사 |
| Search | 특정 문자열 패턴 탐색 |
| Extraction | 문자열 일부 추출 |
| Replacement | 특정 패턴의 문자열 치환 |

**주요 정규표현식 기호**

| 기호 | 의미 |
|---|---|
| `.` | 임의의 문자 한 개(기본적으로 줄바꿈 제외) |
| `\d` | 숫자 |
| `\D` | 숫자가 아닌 문자 |
| `\w` | 단어 문자 |
| `\W` | 단어 문자가 아닌 문자 |
| `\s` | 공백 문자 |
| `\S` | 공백이 아닌 문자 |
| `[a-z]` | 소문자 영문 |
| `[A-Z]` | 대문자 영문 |
| `[가-힣]` | 지정한 한글 음절 범위 |
| `^` | 입력 시작 |
| `$` | 입력 끝 |
| `*` | 0개 이상 |
| `+` | 1개 이상 |
| `?` | 0개 또는 1개 |
| `{n,m}` | n개 이상 m개 이하 |

**핵심**

정규표현식의 기본 기호를 이해하면 입력값 검증과 텍스트 분석 코드를 간결하게 작성할 수 있다.

### 16. Pattern과 Matcher

Pattern은 정규표현식을 컴파일한 객체이고 Matcher는 문자열에 패턴을 적용하는 객체이다.

**처리 구조**

```text id="prcfbk"
      정규표현식 문자열
             │
             ▼
       Pattern.compile()
             │
             ▼
          Pattern
             │
             ▼
        matcher(text)
             │
             ▼
          Matcher
             │
      ┌──────┴──────┐
      │             │
      ▼             ▼
   matches()       find()
    전체 검사      부분 탐색
```

**Java 예제**

```java id="idvnws"
import java.util.regex.*;

String text = "Java123Spring456";

Pattern pattern = Pattern.compile("\\d+");

Matcher matcher = pattern.matcher(text);

while (matcher.find()) {
    System.out.println(matcher.group());
}
```

**실행 결과**

```text id="yg36gh"
123
456
```

**주요 메서드**

| 메서드 | 역할 |
|---|---|
| `matches()` | 입력 전체가 패턴과 일치하는지 검사 |
| `find()` | 다음 일치 부분 검색 |
| `group()` | 현재 일치 문자열 반환 |
| `group(n)` | 지정한 그룹의 문자열 반환 |
| `start()` | 일치 부분의 시작 위치 |
| `end()` | 일치 부분의 끝 다음 위치 |

### 17. matches()와 find()의 차이

**matches()**

```java id="oj359y"
String text = "Java123Spring456";

System.out.println(text.matches("\\d+"));
// false
```

문자열 전체가 숫자로만 구성되어 있지 않으므로 false를 반환한다.

**find()**

```java id="rwzwyf"
import java.util.regex.*;

Matcher matcher = Pattern.compile("\\d+")
    .matcher("Java123Spring456");

while (matcher.find()) {
    System.out.println(matcher.group());
}
```

**실행 결과**

```text id="y0grrg"
123
456
```

**비교**

| 구분 | matches() | find() |
|---|---|---|
| 검사 범위 | 전체 문자열 | 부분 문자열 |
| 반환 타입 | boolean | boolean |
| 대표 사용 | 회원가입 입력 검사 | 로그 분석, 데이터 추출 |

**핵심**

- 전체 검증은 matches()를 사용한다.
- 부분 검색은 find()를 사용한다.
- find()는 반복 호출하여 여러 일치 결과를 검색할 수 있다.

### 18. Group과 문자열 추출

정규표현식의 괄호는 일치한 문자열을 그룹으로 구분하는 데 사용할 수 있다.

**Java 예제**

```java id="d3cqxg"
import java.util.regex.*;

String text = "이름:홍길동 나이:25";

Pattern pattern = Pattern.compile(
    "이름:(\\S+)\\s+나이:(\\d+)"
);

Matcher matcher = pattern.matcher(text);

if (matcher.find()) {
    System.out.println(matcher.group(1));
    System.out.println(matcher.group(2));
}
```

**실행 결과**

```text id="whml2d"
홍길동
25
```

**그룹 구조**

```text id="lszsl5"
이름:홍길동 나이:25
      │         │
      ▼         ▼
   group(1)  group(2)
```

**핵심**

- group(0)은 전체 일치 문자열이다.
- group(1)부터 괄호로 만든 그룹을 반환한다.
- 일치 성공 여부를 확인한 후 group()을 사용해야 한다.

### 19. 탐욕적 수량자와 최소 수량자

정규표현식에는 가능한 많은 문자를 소비하려는 탐욕적 수량자(Greedy Quantifier)와 가능한 적은 문자를 소비하려는 최소 수량자(Reluctant Quantifier)가 있다.

**비교**

| 구분 | 탐욕적 수량자 | 최소 수량자 |
|---|---|---|
| 대표 표현 | `.*` | `.*?` |
| 동작 | 가능한 많은 문자 소비 | 필요한 최소한의 문자 소비 |
| 활용 | 넓은 범위 일치 | 짧은 구간별 검색 |

**Java 예제**

```java id="yd0iiw"
import java.util.regex.*;

String text = "<h1>Java</h1><h2>Spring</h2>";

Matcher greedy = Pattern.compile("<.*>")
    .matcher(text);

Matcher reluctant = Pattern.compile("<.*?>")
    .matcher(text);

if (greedy.find()) {
    System.out.println(greedy.group());
}

while (reluctant.find()) {
    System.out.println(reluctant.group());
}
```

**탐욕적 결과**

```text id="ujal5n"
<h1>Java</h1><h2>Spring</h2>
```

**최소 수량자 결과**

```text id="0y76se"
<h1>
</h1>
<h2>
</h2>
```

**주의사항**

정규표현식으로 단순한 태그 패턴을 설명할 수는 있지만, 실제 복잡한 HTML이나 XML 문서 분석에는 전용 파서를 사용하는 것이 적합하다.

### 20. 전방 탐색(Lookahead)

전방 탐색은 현재 위치 이후의 문자열이 특정 조건을 만족하는지 검사하는 정규표현식 기능이다.

**주요 문법**

| 표현 | 의미 |
|---|---|
| `(?=...)` | 긍정형 전방 탐색 |
| `(?!...)` | 부정형 전방 탐색 |

**비밀번호 형식 검사 예제**

```java id="zyn55l"
String password = "Abcd1234!";

String regex =
    "^(?=.*[A-Z])" +
    "(?=.*[a-z])" +
    "(?=.*\\d)" +
    "(?=.*[!@#$%^&*])" +
    ".{8,20}$";

boolean valid = password.matches(regex);

System.out.println(valid); // true
```

**검증 조건**

- 영문 대문자가 최소 1개 포함된다.
- 영문 소문자가 최소 1개 포함된다.
- 숫자가 최소 1개 포함된다.
- 지정한 특수문자가 최소 1개 포함된다.
- 전체 길이가 8~20자이다.

**주의사항**

정규표현식이 형식 규칙을 만족한다고 해서 비밀번호가 안전하다는 의미는 아니다. 실제 인증 시스템에서는 비밀번호 저장 방식과 보안 정책도 함께 고려해야 한다.

### 21. replaceAll()을 이용한 문자열 정제

replaceAll()은 정규표현식과 일치하는 문자열을 지정한 값으로 치환한다.

**숫자만 추출**

```java id="e85pwd"
String text = "PRD-2026-001";

String result = text.replaceAll("[^0-9]", "");

System.out.println(result);
// 2026001
```

**숫자 제거**

```java id="f8c3sx"
String text = "Java123Spring456";

String result = text.replaceAll("\\d+", "");

System.out.println(result);
// JavaSpring
```

**주요 메서드 비교**

| 메서드 | 역할 |
|---|---|
| `replace()` | 문자나 문자열을 그대로 치환 |
| `replaceAll()` | 정규표현식에 일치하는 모든 부분 치환 |
| `replaceFirst()` | 첫 번째 일치 부분만 치환 |

**핵심**

정규표현식은 데이터 검증, 검색, 추출, 치환을 하나의 패턴 언어로 표현할 수 있다.

### 22. Java 정규표현식 사용 시 주의사항

Java 문자열에서 정규표현식의 역슬래시를 표현할 때는 추가적인 이스케이프가 필요하다.

**정규표현식**

```regex id="nni91l"
\d+
```

**Java 문자열**

```java id="ztmwgi"
String regex = "\\d+";
```

**주의사항**

- 정규표현식의 `\d`는 Java 문자열에서 `"\\d"`로 작성한다.
- 패턴 검사와 데이터의 실제 유효성 검사는 서로 다른 문제이다.
- 입력 데이터가 길거나 복잡하면 정규표현식 처리 성능도 고려해야 한다.
- 복잡한 정규표현식은 테스트 코드와 함께 관리하는 것이 좋다.

---

### 23. 제네릭(Generic)의 필요성

제네릭은 클래스, 인터페이스, 메서드에서 사용할 타입을 매개변수로 정의하는 기능이다.

제네릭을 사용하면 잘못된 타입의 데이터를 컴파일 시점에 발견할 수 있다.

**제네릭을 사용하지 않는 경우**

```java id="mhr5kn"
class Box {

    private Object data;

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}
```

**사용 예제**

```java id="33oxp6"
Box box = new Box();

box.setData(100);

// 실행 중 형변환 오류 가능
String value = (String) box.getData();
```

**문제점**

- Object는 여러 참조 타입을 저장할 수 있다.
- 값을 꺼낼 때 명시적인 형변환이 필요하다.
- 잘못된 형변환은 ClassCastException을 발생시킬 수 있다.

**제네릭 사용**

```java id="nwpj4v"
class Box<T> {

    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
```

```java id="xnswlu"
Box<String> box = new Box<>();

box.setData("Java");

String value = box.getData();
```

**핵심**

제네릭은 런타임의 잘못된 형변환 가능성을 컴파일 단계에서 줄여 타입 안정성과 재사용성을 높인다.

### 24. 제네릭 타입 매개변수

타입 매개변수는 제네릭 클래스나 메서드에서 사용할 타입을 나타내는 변수이다.

**자주 사용하는 타입 매개변수 이름**

| 기호 | 의미 |
|---|---|
| T | Type |
| E | Element |
| K | Key |
| V | Value |
| N | Number |
| R | Return Type |

**제네릭 클래스**

```java id="gux7vu"
class Box<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
```

**사용 예제**

```java id="qpytjo"
Box<String> textBox = new Box<>();

textBox.set("Hello");

Box<Integer> numberBox = new Box<>();

numberBox.set(100);
```

**주의사항**

- 타입 매개변수 이름은 Java 문법상 반드시 T, E, K 등이어야 하는 것은 아니다.
- 일반적으로 개발자 사이의 가독성을 위해 관례적인 이름을 사용한다.
- 제네릭은 기본형이 아닌 참조 타입을 타입 인자로 사용한다.

### 25. 멀티 타입 제네릭

제네릭 클래스는 여러 타입 매개변수를 선언할 수 있다.

**Java 예제**

```java id="5mirdz"
class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
```

**사용 예제**

```java id="6gpvzd"
Pair<String, Integer> pair =
    new Pair<>("홍길동", 100);

System.out.println(pair.getKey());
System.out.println(pair.getValue());
```

**활용 사례**

- ID와 데이터의 묶음
- Key와 Value 구조
- 요청 ID와 처리 결과
- 서로 다른 타입을 가진 두 값의 전달

### 26. 제네릭 메서드(Generic Method)

제네릭 메서드는 메서드 자체에서 타입 매개변수를 선언한다.

**Java 예제**

```java id="sovexc"
public class GenericUtil {

    public static <T> void print(T value) {

        System.out.println(value);
    }

    public static void main(String[] args) {

        print("Java");

        print(100);

        print(3.14);
    }
}
```

**제네릭 클래스와 제네릭 메서드**

| 구분 | 제네릭 클래스 | 제네릭 메서드 |
|---|---|---|
| 타입 선언 위치 | 클래스 이름 뒤 | 반환 타입 앞 |
| 타입 적용 범위 | 클래스의 타입 매개변수 사용 범위 | 메서드 내부 |
| 타입 결정 | 클래스 사용 시 | 메서드 호출 시 |
| 예시 | `class Box<T>` | `<T> void print(T value)` |

**핵심**

제네릭 메서드는 클래스 전체를 제네릭으로 만들지 않아도 특정 메서드를 다양한 타입으로 재사용할 수 있게 한다.

### 27. 제한된 타입 매개변수(Bounded Type)

제네릭은 extends를 이용하여 사용할 수 있는 타입의 상한을 제한할 수 있다.

**Java 예제**

```java id="73lo0d"
class NumberBox<T extends Number> {

    private T value;

    public NumberBox(T value) {
        this.value = value;
    }

    public double getDoubleValue() {
        return value.doubleValue();
    }
}
```

**사용 예제**

```java id="l980k7"
NumberBox<Integer> box1 =
    new NumberBox<>(100);

NumberBox<Double> box2 =
    new NumberBox<>(3.14);

// NumberBox<String> box3 =
//     new NumberBox<>("Java"); // 컴파일 오류
```

**타입 계층**

```text id="6v7yhy"
             Number
                │
       ┌────────┼─────────┐
       │        │         │
       ▼        ▼         ▼
    Integer   Double     Float

    <T extends Number>
```

**핵심**

- Number와 하위 타입만 사용할 수 있다.
- 제한된 타입의 공통 메서드를 안전하게 호출할 수 있다.
- extends는 제네릭 타입 제한에서 클래스와 인터페이스에 모두 사용할 수 있다.

### 28. 와일드카드(Wildcard)

와일드카드는 제네릭 타입 인자를 정확하게 고정하지 않고 유연하게 사용할 때 사용하는 문법이다.

**주요 문법**

| 문법 | 의미 |
|---|---|
| `<?>` | 타입이 정해지지 않은 경우 |
| `<? extends T>` | T 또는 하위 타입 |
| `<? super T>` | T 또는 상위 타입 |

**와일드카드 예제**

```java id="c8v5i5"
import java.util.List;

public static void printList(List<?> list) {

    for (Object value : list) {
        System.out.println(value);
    }
}
```

**사용 예제**

```java id="qdqi2a"
printList(List.of("Java", "Spring"));

printList(List.of(10, 20, 30));
```

**핵심**

- List<?>는 다양한 요소 타입의 리스트를 받을 수 있다.
- List<String>과 List<Integer>를 동일한 메서드에서 처리할 수 있다.
- List<?>에는 일반적으로 null 이외의 값을 추가할 수 없다.

### 29. PECS 원칙

PECS는 제네릭 와일드카드를 선택할 때 사용하는 설계 원칙이다.

**PECS = Producer Extends, Consumer Super**

**구조**

```text id="xhptzz"
               PECS
                 │
        ┌────────┴────────┐
        │                 │
        ▼                 ▼
      Producer         Consumer
        │                 │
        ▼                 ▼
      extends            super
        │                 │
        ▼                 ▼
      읽기 중심         쓰기 중심
```

**Producer Extends**

```java id="mwa2os"
import java.util.List;

public static double sum(
        List<? extends Number> numbers) {

    double total = 0;

    for (Number number : numbers) {
        total += number.doubleValue();
    }

    return total;
}
```

**사용 예제**

```java id="zerpbc"
List<Integer> numbers = List.of(10, 20, 30);

System.out.println(sum(numbers));
// 60.0
```

**Consumer Super**

```java id="278kro"
import java.util.List;

public static void addNumbers(
        List<? super Integer> list) {

    list.add(10);
    list.add(20);
}
```

**사용 예제**

```java id="f90uoh"
List<Number> numbers = new java.util.ArrayList<>();

addNumbers(numbers);
```

**비교**

| 구분 | extends | super |
|---|---|---|
| 제한 방향 | 상한 | 하한 |
| 주요 활용 | 데이터 읽기 | 데이터 추가 |
| 안전하게 읽는 타입 | 상한 타입 | 일반적으로 Object |
| 안전하게 추가 가능한 값 | 일반적으로 null만 가능 | 하한 타입 및 그 하위 타입 |

**핵심**

- 데이터를 꺼내 사용하는 쪽에서는 extends를 고려한다.
- 데이터를 받아 저장하는 쪽에서는 super를 고려한다.
- 구체적인 타입을 정확하게 알 수 없는 경우 불가능한 연산이 생긴다.

### 30. 제네릭과 컬렉션 프레임워크

제네릭은 컬렉션에서 요소 타입을 안전하게 관리하는 데 가장 많이 활용된다.

**주요 컬렉션**

| 컬렉션 | 선언 예 | 특징 |
|---|---|---|
| List | `List<String>` | 순서 유지, 중복 허용 |
| Set | `Set<Integer>` | 중복 요소 허용하지 않음 |
| Map | `Map<String, Integer>` | Key-Value 구조 |

**Java 예제**

```java id="8a2cr2"
import java.util.*;

List<String> names = new ArrayList<>();

names.add("Java");
names.add("Spring");

Set<Integer> numbers = new HashSet<>();

numbers.add(10);
numbers.add(10);

Map<String, Integer> scores = new HashMap<>();

scores.put("Java", 90);
scores.put("Spring", 95);
```

**핵심**

- 컬렉션은 다양한 데이터를 관리하는 구조이다.
- 제네릭은 저장할 요소의 타입을 명확하게 지정한다.
- 컴파일러가 잘못된 타입 사용을 검사한다.
- 타입 안정성과 코드 가독성을 높일 수 있다.

### 31. 제네릭을 활용한 공통 API 응답

제네릭을 사용하면 여러 종류의 응답 데이터를 하나의 공통 구조로 표현할 수 있다.

**Java 예제**

```java id="uem1d8"
class ApiResponse<T> {

    private boolean success;
    private String message;
    private T data;

    public ApiResponse(
            boolean success,
            String message,
            T data) {

        this.success = success;
        this.message = message;
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
```

**문자열 데이터 응답**

```java id="9vdgse"
ApiResponse<String> response =
    new ApiResponse<>(
        true,
        "조회 성공",
        "Hello Java"
    );
```

**회원 객체 응답**

```java id="36ad9a"
record Member(Long id, String name) {
}

ApiResponse<Member> response =
    new ApiResponse<>(
        true,
        "회원 조회 성공",
        new Member(1L, "홍길동")
    );
```

**핵심**

응답 데이터의 타입은 달라도 응답 구조는 재사용할 수 있다.

### 32. 제네릭을 활용한 Repository 설계

Repository는 데이터를 저장하거나 조회하는 기능을 추상화하는 구조이다.

제네릭을 사용하면 서로 다른 데이터 타입에 대해 동일한 메서드 계약을 정의할 수 있다.

**제네릭 Repository 인터페이스**

```java id="rclfik"
interface Repository<T, ID> {

    void save(T data);

    T findById(ID id);

    void delete(ID id);
}
```

**회원 Repository**

```java id="7gi1ia"
class Member {

    private Integer id;
    private String name;
}
```

```java id="itvvh4"
interface MemberRepository
        extends Repository<Member, Integer> {
}
```

**상품 Repository**

```java id="c1x21p"
class Product {

    private Long id;
    private String name;
}
```

```java id="ribda4"
interface ProductRepository
        extends Repository<Product, Long> {
}
```

**구조**

```text id="rwsccf"
           Repository<T, ID>
                  │
        ┌─────────┴─────────┐
        │                   │
        ▼                   ▼
 MemberRepository     ProductRepository
        │                   │
        ▼                   ▼
  Member, Integer       Product, Long
```

**핵심**

- Repository의 기본 기능을 제네릭 인터페이스로 정의한다.
- 데이터 타입과 ID 타입을 외부에서 지정한다.
- 여러 Repository에 공통적인 메서드 계약을 적용한다.
- Spring Data JPA 등의 Repository 구조를 이해하는 기초가 된다.

### 33. 타입 소거(Type Erasure)

Java 제네릭은 컴파일 시점에 타입 검사를 수행하고, 일반적으로 컴파일 과정에서 타입 매개변수 정보를 소거한다.

**컴파일 전**

```java id="5nx2mr"
List<String> names = new ArrayList<>();

List<Integer> numbers = new ArrayList<>();
```

**개념적 구조**

```text id="b8gapy"
           Compile Time
                 │
       ┌─────────┴─────────┐
       │                   │
       ▼                   ▼
   List<String>       List<Integer>
       │                   │
       └─────────┬─────────┘
                 │
                 ▼
            Type Erasure
                 │
                 ▼
          Runtime List 타입
```

**주요 특징**

- 제네릭 타입 검사는 주로 컴파일 시점에 수행된다.
- 대부분의 타입 매개변수 정보는 런타임에 소거된다.
- 타입 안정성은 컴파일러가 검사하는 중요한 기능이다.
- 실제 클래스의 제네릭 선언 정보 등 일부 메타데이터는 리플렉션으로 조회할 수 있다.

**주의사항**

```java id="kkr1oq"
// 다음 표현은 컴파일 오류

// if (names instanceof List<String>) {
// }
```

런타임에 List<String>의 구체적인 타입 인자를 직접 검사할 수 없기 때문이다.

### 34. 제네릭의 주요 제한사항

| 제한사항 | 잘못된 예 | 대안 |
|---|---|---|
| 기본형 직접 사용 | `List<int>` | `List<Integer>` |
| 타입 매개변수 생성 | `new T()` | 생성자 참조 또는 Class 전달 |
| 제네릭 배열 직접 생성 | `new T[10]` | 컬렉션 사용 등 |
| 타입 인자 런타임 검사 | `instanceof List<String>` | 검사 가능한 타입 사용 |
| static에서 클래스 T 사용 | `static T value` | 별도 타입 설계 |

**예제**

```java id="j0d4ry"
class Box<T> {

    private T value;

    // 다음 코드는 컴파일 오류
    // private static T sharedValue;

    // public T create() {
    //     return new T();
    // }
}
```

**핵심**

제네릭의 사용 목적과 타입 소거의 한계를 함께 이해해야 올바른 설계가 가능하다.

### 35. Java 프레임워크와 제네릭의 관계

제네릭은 Java 프레임워크에서 데이터 타입을 안전하고 유연하게 처리하는 데 활용된다.

**대표 활용**

| 기술 | 제네릭 활용 |
|---|---|
| Collection Framework | List<T>, Set<T>, Map<K,V> |
| Spring Data | Repository<T, ID> |
| API 응답 객체 | ApiResponse<T> |
| Optional | Optional<T> |
| Stream | Stream<T> |
| 비동기 처리 | CompletableFuture<T> |

**핵심**

제네릭을 이해하면 공통 컴포넌트, Repository, DTO, API 응답 구조를 보다 쉽게 설계하고 활용할 수 있다.

---

### 36. Day23 학습 내용 통합

이번 학습에서 다룬 핵심 기술은 크게 세 가지이다.

| 기술 | 핵심 목적 | 대표 기능 |
|---|---|---|
| Reflection + Annotation | 런타임 메타데이터 기반 동적 처리 | 클래스 탐색, 메서드 호출 |
| Regex | 문자열 검증 및 가공 | 검색, 추출, 치환 |
| Generic | 컴파일 시 타입 안정성 확보 | 타입 매개변수, 와일드카드 |

**전체 구조**

```text id="hqyotf"
           Java Programming
                   │
       ┌───────────┼───────────┐
       │           │           │
       ▼           ▼           ▼
  Annotation     Generic      Regex
  Reflection
       │           │           │
       ▼           ▼           ▼
    동적 실행    타입 안정성   데이터 검증
       │           │           │
       └───────────┼───────────┘
                   │
                   ▼
          Framework 기반 개발
```

### 37. 학습 시 주의사항

| 주의사항 | 핵심 내용 |
|---|---|
| Reflection | 런타임 타입과 멤버 정보 조회 |
| Class 객체 | 타입 정보의 시작점 |
| getDeclared... | 해당 클래스에서 직접 선언한 멤버 조회 |
| setAccessible(true) | 접근 제한을 항상 우회할 수 있는 것은 아님 |
| Method.invoke() | 대상 객체와 매개변수 타입 확인 |
| Annotation | 메타데이터 자체는 기능을 실행하지 않음 |
| @Retention | 런타임 조회 시 RUNTIME 필요 |
| @Target | 적용 가능한 코드 요소 지정 |
| Regex | Java 문자열의 역슬래시 이스케이프 |
| matches() | 전체 문자열 검사 |
| find() | 부분 문자열 검색 |
| group() | 일치 성공 후 추출 |
| Greedy / Reluctant | 탐욕적·최소 수량자 구분 |
| Lookahead | 추가 조건 검사 |
| Generic | 컴파일 시 타입 안정성 |
| 제네릭 클래스 | 타입 매개변수 사용 범위 이해 |
| 제네릭 메서드 | 독립적으로 타입 매개변수 선언 |
| extends | 상한 타입 제한 |
| super | 하한 타입 제한 |
| PECS | Producer Extends, Consumer Super |
| Type Erasure | 제네릭 타입 정보의 런타임 제한 |
| 기본형 타입 | Wrapper 클래스로 사용 |
| new T() | 타입 소거로 직접 생성 불가 |
| Repository | 데이터 및 ID 타입 분리 설계 |

### ✅ Day23 핵심 정리

| 학습 개념 | 핵심 내용 |
|---|---|
| Reflection | 런타임에 클래스 정보를 조회·조작하는 기술 |
| Class | 타입 정보 |
| Field | 필드 정보 및 값 접근 |
| Constructor | 생성자 정보 및 객체 생성 |
| Method | 메서드 정보 및 동적 호출 |
| getDeclaredMethods() | 선언된 메서드 목록 조회 |
| getDeclaredFields() | 선언된 필드 목록 조회 |
| newInstance() | 생성자를 통한 동적 객체 생성 |
| invoke() | 메서드 동적 호출 |
| Annotation | 코드에 부착하는 메타데이터 |
| @interface | 사용자 정의 어노테이션 선언 |
| @Target | 어노테이션 적용 대상 |
| @Retention | 어노테이션 유지 범위 |
| RUNTIME | 실행 중 어노테이션 조회 가능 |
| isAnnotationPresent() | 어노테이션 존재 확인 |
| getAnnotation() | 어노테이션 정보 획득 |
| Regex | 문자열 패턴 검사 |
| Pattern | 정규표현식 컴파일 |
| Matcher | 문자열 패턴 검색 |
| matches() | 전체 일치 검사 |
| find() | 부분 일치 검색 |
| group() | 일치한 문자열 추출 |
| replaceAll() | 패턴 기반 문자열 치환 |
| Greedy | 가능한 많은 문자 소비 |
| Reluctant | 필요한 최소한의 문자 소비 |
| Lookahead | 다음 문자열의 조건 확인 |
| Generic | 타입 안정성과 재사용성 |
| Type Parameter | 타입 매개변수 |
| Generic Class | 타입 매개변수를 가진 클래스 |
| Generic Method | 타입 매개변수를 가진 메서드 |
| Multi-Type Generic | 여러 타입 매개변수 선언 |
| Bounded Type | 제네릭 타입의 상한 제한 |
| Wildcard | 타입 인자의 유연한 범위 지정 |
| extends | 상한 제한 및 읽기 중심 활용 |
| super | 하한 제한 및 쓰기 중심 활용 |
| PECS | Producer Extends, Consumer Super |
| Repository<T,ID> | 데이터 및 ID 타입을 분리한 저장소 계약 |
| ApiResponse<T> | 공통 API 응답 구조 |
| Type Erasure | 컴파일 과정의 제네릭 타입 소거 |

**최종 학습 정리**

- Reflection은 런타임에 클래스의 구조를 분석하고 동적으로 기능을 실행할 수 있게 한다.
- Class는 런타임 타입 정보를 제공하며 Field, Method, Constructor 탐색의 시작점이다.
- Field는 필드값을 읽거나 변경하는 기능을 제공한다.
- Constructor를 이용하면 런타임에 생성자를 선택하고 객체를 생성할 수 있다.
- Method.invoke()는 메서드를 동적으로 호출하는 기능이다.
- Annotation은 코드에 부착하는 메타데이터이며 그 자체로 기능을 실행하지 않는다.
- @Target은 어노테이션 적용 대상을, @Retention은 유지 범위를 지정한다.
- RUNTIME으로 유지되는 어노테이션은 실행 중 조회할 수 있다.
- Annotation과 Reflection을 결합하면 메타데이터 기반 자동화 시스템을 구현할 수 있다.
- Reflection은 캡슐화, 타입 안정성, 성능 비용 등을 고려하여 사용해야 한다.
- 정규표현식은 문자열의 검증, 검색, 추출, 치환에 활용된다.
- Pattern은 정규표현식을 컴파일하며 Matcher는 실제 입력과 패턴을 비교한다.
- matches()는 입력 전체를 검사하고 find()는 일치하는 부분을 검색한다.
- group()은 정규표현식의 그룹을 이용하여 데이터를 추출한다.
- Greedy와 Reluctant는 문자열을 소비하는 범위가 다르다.
- Lookahead는 특정 문자열 조건을 검사할 때 활용할 수 있다.
- Java 문자열에서 정규표현식의 역슬래시를 작성할 때 이스케이프에 주의해야 한다.
- 제네릭은 타입 매개변수를 이용해 코드의 재사용성과 컴파일 시 타입 안정성을 높인다.
- 제네릭 클래스는 타입을 지정하여 동일한 구조를 다양한 데이터에 사용할 수 있다.
- 제네릭 메서드는 메서드 호출 시 타입을 추론하거나 지정할 수 있다.
- 제한된 타입 매개변수는 extends로 허용할 타입의 상한을 지정한다.
- 와일드카드는 제네릭 타입 인자의 범위를 유연하게 처리한다.
- PECS는 Producer Extends, Consumer Super를 의미한다.
- 타입 소거는 Java 제네릭의 중요한 구현 특징이며 런타임 타입 검사에 제약을 만든다.
- 제네릭을 이용하면 API 응답 구조와 Repository 인터페이스를 공통화할 수 있다.
- Reflection, Annotation, Regex, Generic은 Java 프레임워크를 이해하기 위한 중요한 기반 기술이다.

</details>
