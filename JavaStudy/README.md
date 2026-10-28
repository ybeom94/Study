## Java 기초 학습 목차
<details>

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



</details>

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
