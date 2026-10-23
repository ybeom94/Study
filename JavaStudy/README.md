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
