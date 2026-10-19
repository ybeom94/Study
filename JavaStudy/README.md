## Java 기초 학습 목차
<details>

| 일차 | 주제 | 학습 키워드 |
|:---:|---|---|
| **Day 01** | Java 시작하기 | Java 특징, JVM, JDK/JRE, 컴파일, `main()`, 출력, 주석 |
| **Day 02** | 변수와 데이터 타입 | 변수 선언·초기화, 식별자, 기본형 8가지, 리터럴, 형변환 |
| **Day 03** | 연산자 | 산술, 증감, 비교, 논리, 대입, 삼항, 비트·시프트 연산자 |
| **Day 04** | 제어문 | `if`, `else if`, `switch`, `for`, `while`, `do-while`, `break`, `continue` |
| **Day 05** | 제어문 심화 및 응용 | 중첩 반복문, 흐름 제어, 종합 실습 |

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

