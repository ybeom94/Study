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
