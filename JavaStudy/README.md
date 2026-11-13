
# ☕ Java Study

**학습 교재:** 이것이 자바다 3판  
**학습 환경:** Java 21 / VS Code

Java의 기본 문법부터 객체지향 프로그래밍, 표준 라이브러리, 제네릭, 컬렉션까지 학습한 내용을 정리한 README입니다.

각 Day는 핵심 개념과 주요 문법, 주의사항을 중심으로 구성합니다.

---

## 📚 Java 학습 목차

| 일차 | 학습 주제 | 핵심 키워드 |
|:---:|---|---|
| **Day 01** | Java 시작하기 | JDK, JRE, JVM, 컴파일, main |
| **Day 02** | 변수와 데이터 타입 | 기본형, 참조형, 변수, 형변환 |
| **Day 03** | 연산자 | 산술, 비교, 논리, 증감, 비트 연산 |
| **Day 04** | 제어문 | if, switch, for, while, break |
| **Day 05** | 제어문 심화 및 응용 | 중첩 반복문, Scanner, Random |
| **Day 06** | 반복문 심화 및 활용 | 향상된 for, 라벨, 반복 제어 |
| **Day 07** | 반복 제어문, String과 배열 | String, equals, 배열, Arrays |
| **Day 08** | String과 배열 심화 및 메서드 | StringBuilder, 배열 복사, ArrayList |
| **Day 09** | 메서드와 배열 활용 | 매개변수, 반환값, 오버로딩, 다차원 배열 |
| **Day 10** | Java 기초 총정리 및 알고리즘 | Enum, 탐색, 정렬, Stack, Queue |
| **Day 11** | Java 메서드 및 기초 문법 종합 | static, 인스턴스 메서드, 호출 스택 |
| **Day 12** | 메서드 심화 및 사용자 정의 클래스 | 클래스, 생성자, this, 접근 제한자, DTO |
| **Day 13** | Java 객체지향 프로그래밍 심화 | 캡슐화, 상속, 다형성, 추상화 |
| **Day 14** | 클래스·객체·JVM 메모리 구조 | Stack, Heap, Method Area, static |
| **Day 15** | 상속·다형성 및 JVM 메모리 심화 | extends, super, 오버라이딩, GC |
| **Day 16** | Java 클래스 종류와 객체지향 설계 | 추상 클래스, 인터페이스, 중첩 클래스, DI |
| **Day 17** | Java 인터페이스 심화 및 예외 처리 | default, static, 다중 구현, Exception |
| **Day 18** | Java 예외 처리 및 실무 활용 | try-catch, throw, throws, 사용자 정의 예외 |
| **Day 19** | Java 예외 처리 및 중첩 클래스 심화 | static nested, inner, local, anonymous |
| **Day 20** | Java 1권 핵심 복습 및 표준 라이브러리 | java.lang, Object, String, Wrapper, Math |
| **Day 21** | Java 코어 라이브러리 및 제네릭 심화 | java.time, Regex, Reflection, Generic |
| **Day 22** | Java 코어 라이브러리 실전 활용 및 자동화 | Annotation, Reflection, Pattern, Matcher |
| **Day 23** | Java 리플렉션·어노테이션·제네릭 심화 | Class, Method, Wildcard, PECS, Type Erasure |
| **Day 24** | Java 컬렉션 프레임워크 및 제네릭 활용 | List, Set, Queue, Map, Iterator, Comparator |
| **Day 25** | Java 컬렉션 프레임워크 실전 활용 | 컬렉션 선택, Iterator, Map 순회, Collections, 불변 컬렉션, Generic, PECS |


---

## Day1. Java 시작하기

<details>
<summary>📖 핵심 내용 보기</summary>

### 🎯 학습 목표
Java 프로그램의 실행 구조와 기본 문법을 이해한다.

### 1. Java의 특징

- **객체지향 언어:** 클래스와 객체를 중심으로 프로그램 구성
- **플랫폼 독립성:** JVM을 통해 다양한 운영체제에서 실행
- **자동 메모리 관리:** Garbage Collector(GC)를 통한 메모리 관리
- **바이트코드:** Java 소스 코드를 컴파일한 중간 코드

### 2. JDK, JRE, JVM

| 구분 | 역할 |
|---|---|
| JDK | Java 개발 도구 및 컴파일러 제공 |
| JRE | Java 프로그램 실행 환경 |
| JVM | 바이트코드 실행 및 메모리 관리 |

**Java 실행 과정**

```text
Hello.java
    │ javac
    ▼
Hello.class
    │ JVM
    ▼
프로그램 실행
```

### 3. Java 프로그램 구조

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}
```

- `class`: 클래스 선언
- `main()`: 일반적인 Java 프로그램의 시작점
- `System.out.println()`: 콘솔 출력 및 줄바꿈
- `//`, `/* */`: 주석

### ✅ Day1 핵심 정리

- Java는 소스 코드를 바이트코드로 컴파일한다.
- JVM이 바이트코드를 실행한다.
- JDK는 개발 도구, JRE는 실행 환경, JVM은 실행 엔진이다.

</details>

---

## Day2. 변수와 데이터 타입

<details>
<summary>📖 핵심 내용 보기</summary>

### 🎯 학습 목표
변수와 자료형을 이해하고 형변환을 사용할 수 있다.

### 1. 변수와 데이터 타입

**변수 선언**

```java
int age = 20;
double height = 175.5;
String name = "Java";
```

**기본형 8가지**

| 구분 | 타입 |
|---|---|
| 정수 | byte, short, int, long |
| 실수 | float, double |
| 문자 | char |
| 논리 | boolean |

- 기본형은 실제 값을 저장한다.
- 참조형은 객체를 가리키는 참조값을 저장한다.
- String은 참조형이다.

### 2. 형변환

**자동 형변환**

```java
int a = 10;
double b = a;
```

**강제 형변환**

```java
double a = 3.14;
int b = (int) a; // 3
```

### 3. 변수의 종류

| 종류 | 특징 |
|---|---|
| 지역 변수 | 메서드·블록 내부에 선언 |
| 인스턴스 변수 | 객체마다 별도로 존재 |
| static 변수 | 클래스에 속하며 공유 |

### ✅ Day2 핵심 정리

- 정수는 주로 int, 실수는 주로 double을 사용한다.
- 지역 변수는 사용하기 전에 초기화해야 한다.
- 강제 형변환에서는 데이터 손실이 발생할 수 있다.

</details>

---

## Day3. 연산자

<details>
<summary>📖 핵심 내용 보기</summary>

### 🎯 학습 목표
Java 연산자의 종류와 연산 결과를 이해한다.

### 1. 주요 연산자

| 구분 | 연산자 | 역할 |
|---|---|---|
| 산술 | +, -, *, /, % | 사칙연산 및 나머지 |
| 증감 | ++, -- | 1 증가 및 감소 |
| 비교 | ==, !=, >, <, >=, <= | 값 비교 |
| 논리 | &&, \|\|, ! | 논리 연산 |
| 대입 | =, +=, -=, *=, /= | 값 대입 |
| 삼항 | ? : | 조건에 따른 값 선택 |
| 비트 | &, \|, ^, ~ | 비트 단위 연산 |
| 시프트 | <<, >>, >>> | 비트 이동 |

### 2. 정수 나눗셈

```java
System.out.println(10 / 3);         // 3
System.out.println(10 % 3);         // 1
System.out.println(10.0 / 3);       // 3.333...
```

### 3. 증감 연산자

```java
int a = 5;

System.out.println(a++); // 5
System.out.println(++a); // 7
```

- `a++`: 현재 값을 사용한 후 증가
- `++a`: 값을 증가시킨 후 사용

### ✅ Day3 핵심 정리

- 정수 나눗셈은 소수 부분을 버린다.
- `=`는 대입, `==`는 비교이다.
- `&&`, `||`는 단축 평가를 수행한다.
- 연산자 우선순위가 불명확하면 괄호를 사용한다.

</details>

---

## Day4. 제어문

<details>
<summary>📖 핵심 내용 보기</summary>

### 🎯 학습 목표
조건문과 반복문으로 프로그램의 실행 흐름을 제어한다.

### 1. 조건문

| 문법 | 역할 |
|---|---|
| if | 조건이 참일 때 실행 |
| else | 조건이 거짓일 때 실행 |
| else if | 여러 조건을 순서대로 검사 |
| switch | 값에 따라 실행 분기 |

```java
int score = 85;

if (score >= 90) {
    System.out.println("A");
} else if (score >= 80) {
    System.out.println("B");
} else {
    System.out.println("C");
}
```

### 2. 반복문

| 문법 | 특징 |
|---|---|
| for | 반복 횟수가 명확할 때 |
| while | 조건이 참인 동안 반복 |
| do-while | 최소 한 번 실행 |
| 향상된 for | 배열이나 컬렉션 순회 |

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

### 3. 반복 제어

- `break`: 반복문 종료
- `continue`: 현재 반복의 나머지를 건너뜀

### ✅ Day4 핵심 정리

- 조건문은 실행 경로를 결정한다.
- 반복문은 같은 작업을 반복한다.
- 무한 반복이 발생하지 않도록 종료 조건을 확인한다.

</details>

---

## Day5. 제어문 심화 및 응용

<details>
<summary>📖 핵심 내용 보기</summary>

### 🎯 학습 목표
중첩 반복문과 입력 처리를 이용하여 간단한 프로그램을 구현한다.

### 1. 중첩 반복문

반복문 내부에 다른 반복문을 작성하는 구조이다.

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.println(i + ", " + j);
    }
}
```

### 2. Scanner

사용자의 콘솔 입력을 처리한다.

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);

int number = scanner.nextInt();
String text = scanner.next();
```

**주의:** `nextInt()` 다음에 `nextLine()`을 사용하면 남아 있는 줄바꿈 문자를 읽을 수 있다.

### 3. 난수 생성

```java
import java.util.Random;

Random random = new Random();

int number = random.nextInt(10); // 0~9
```

### ✅ Day5 핵심 정리

- 중첩 반복문은 2차원 데이터 처리에 활용된다.
- Scanner는 콘솔 입력을 처리한다.
- Random은 지정한 범위의 난수 생성에 사용할 수 있다.

</details>

---

## Day6. 반복문 심화 및 활용

<details>
<summary>📖 핵심 내용 보기</summary>

### 🎯 학습 목표
반복문의 실행 순서와 복잡한 반복 제어 방법을 이해한다.

### 1. 반복문 실행 구조

```text
for:
초기화 → 조건 검사 → 실행 → 증감 → 조건 검사

while:
조건 검사 → 실행 → 조건 검사

do-while:
실행 → 조건 검사 → 실행
```

### 2. 향상된 for문

```java
int[] numbers = {10, 20, 30};

for (int number : numbers) {
    System.out.println(number);
}
```

### 3. 라벨(Label)

중첩 반복문에서 특정 반복문을 종료할 수 있다.

```java
outer:
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        if (i == 1 && j == 1) {
            break outer;
        }
    }
}
```

### ✅ Day6 핵심 정리

- 반복문마다 조건을 검사하는 시점이 다르다.
- 향상된 for문은 배열과 컬렉션 순회에 유용하다.
- 라벨은 중첩 반복문을 제어하지만 과도하게 사용하면 가독성이 낮아질 수 있다.

</details>

---

## Day7. 반복 제어문, String과 배열

<details>
<summary>📖 핵심 내용 보기</summary>

### 🎯 학습 목표
문자열과 배열의 특징을 이해하고 데이터를 순회할 수 있다.

### 1. String

String은 문자열을 표현하는 불변 객체이다.

```java
String a = new String("Java");
String b = new String("Java");

System.out.println(a == b);      // false
System.out.println(a.equals(b)); // true
```

**주요 메서드**

| 메서드 | 역할 |
|---|---|
| length() | 문자열 길이 |
| charAt() | 특정 위치의 문자 |
| substring() | 문자열 일부 추출 |
| equals() | 문자열 내용 비교 |
| contains() | 문자열 포함 여부 |
| replace() | 문자열 치환 |

### 2. 배열

```java
int[] numbers = {10, 20, 30};

System.out.println(numbers[0]);  // 10
System.out.println(numbers.length); // 3
```

- 배열은 생성 후 길이를 변경할 수 없다.
- 인덱스는 0부터 시작한다.
- 잘못된 인덱스 접근은 예외를 발생시킨다.

### ✅ Day7 핵심 정리

- String은 불변 객체이다.
- 문자열 내용 비교에는 equals()를 사용한다.
- 배열은 같은 타입의 데이터를 일정한 길이로 저장한다.

</details>

---

## Day8. String과 배열 심화 및 메서드

<details>
<summary>📖 핵심 내용 보기</summary>

### 🎯 학습 목표
문자열 처리와 배열 복사, 컬렉션의 기본 사용법을 이해한다.

### 1. StringBuilder

반복적인 문자열 변경에 활용한다.

```java
StringBuilder sb = new StringBuilder();

sb.append("Java");
sb.append(" Spring");

System.out.println(sb.toString());
```

- String은 불변이다.
- StringBuilder는 가변이다.
- StringBuilder는 자체적으로 스레드 안전성을 보장하지 않는다.

### 2. 배열 복사

```java
import java.util.Arrays;

int[] a = {1, 2, 3};

int[] b = Arrays.copyOf(a, a.length);

b[0] = 100;

System.out.println(a[0]); // 1
```

**복사 시 주의사항**

- `b = a`: 참조값만 복사
- 기본형 배열의 `clone()`이나 `Arrays.copyOf()`: 독립적인 배열 생성
- 객체 배열 복사: 새 배열을 생성해도 요소가 참조하는 객체는 공유할 수 있음

### 3. ArrayList

```java
List<String> names = new ArrayList<>();

names.add("Java");
names.add("Spring");
names.remove("Java");
```

### ✅ Day8 핵심 정리

- 문자열을 반복해서 조합할 때 StringBuilder를 고려한다.
- 배열 복사와 참조값 복사의 차이를 이해해야 한다.
- ArrayList는 크기를 동적으로 관리한다.

</details>

---

## Day9. 메서드와 배열 활용

<details>
<summary>📖 핵심 내용 보기</summary>

### 🎯 학습 목표
메서드의 구성과 배열 전달 방식을 이해한다.

### 1. 메서드 구조

```java
public static int add(int a, int b) {
    return a + b;
}
```

| 구성 | 역할 |
|---|---|
| 접근 제한자 | 호출 가능 범위 지정 |
| static | 정적 메서드 선언 |
| 반환 타입 | 반환할 데이터 타입 |
| 메서드명 | 메서드 식별 |
| 매개변수 | 전달받을 값 |
| return | 실행 결과 반환 |

### 2. 메서드 오버로딩

이름은 같지만 매개변수 목록이 다른 메서드를 선언한다.

```java
int add(int a, int b) {
    return a + b;
}

double add(double a, double b) {
    return a + b;
}
```

### 3. 배열을 매개변수로 전달

```java
static void change(int[] numbers) {
    numbers[0] = 100;
}
```

- 배열을 전달하면 배열 객체의 참조값이 복사된다.
- 같은 배열 객체를 참조하므로 요소 변경이 원본에 반영될 수 있다.
- Java의 메서드 인자 전달 방식은 항상 값에 의한 전달이다.

### ✅ Day9 핵심 정리

- 메서드는 기능을 분리하여 재사용하기 위한 단위이다.
- 오버로딩은 매개변수 목록으로 구분한다.
- 참조형 전달 시 객체 자체가 복제되는 것은 아니다.

</details>

---

## Day10. Java 기초 총정리 및 알고리즘

<details>
<summary>📖 핵심 내용 보기</summary>

### 🎯 학습 목표
기본 문법을 복습하고 기초 알고리즘과 자료구조를 이해한다.

### 1. Enum

열거 타입은 정해진 상수 집합을 표현한다.

```java
enum State {
    IDLE,
    MOVE,
    ATTACK
}

State state = State.IDLE;
```

### 2. 탐색과 정렬

| 알고리즘 | 특징 |
|---|---|
| 선형 탐색 | 처음부터 순서대로 탐색 |
| 이진 탐색 | 정렬된 데이터의 탐색 범위를 절반씩 축소 |
| 버블 정렬 | 인접한 값을 비교하여 교환 |
| 선택 정렬 | 최솟값 등을 선택하여 배치 |

### 3. Stack과 Queue

```text
Stack: LIFO
마지막으로 들어온 데이터가 먼저 나옴

Queue: FIFO
먼저 들어온 데이터가 먼저 나옴
```

### 4. 시간 복잡도

| 복잡도 | 대표 작업 |
|---|---|
| O(1) | 배열 인덱스 접근 |
| O(log n) | 이진 탐색 |
| O(n) | 전체 데이터 순회 |
| O(n²) | 중첩 반복을 이용한 모든 쌍 비교 |

### ✅ Day10 핵심 정리

- Enum은 정해진 상태나 종류를 표현하는 데 사용한다.
- 자료구조는 데이터를 관리하는 방식이다.
- 알고리즘은 문제 해결 절차이며 효율성도 고려해야 한다.

</details>

---

## Day11. Java 메서드 및 기초 문법 종합

<details>
<summary>📖 핵심 내용 보기</summary>

### 🎯 학습 목표
메서드 호출 구조와 static 및 인스턴스 메서드의 차이를 이해한다.

### 1. static과 인스턴스 메서드

```java
class Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }
}
```

**호출 방법**

```java
Calculator.add(10, 20);

Calculator calculator = new Calculator();
calculator.multiply(10, 20);
```

| 구분 | static 메서드 | 인스턴스 메서드 |
|---|---|---|
| 소속 | 클래스 | 객체 |
| 호출 | 클래스명.메서드() | 객체명.메서드() |
| this 사용 | 불가능 | 가능 |

### 2. 메서드 호출 스택

```text
main()
  └── methodA()
        └── methodB()
              └── 실행 완료
        └── 복귀
  └── 복귀
```

메서드 호출 시 스택 프레임이 생성되고 실행이 끝나면 제거된다.

### ✅ Day11 핵심 정리

- static 메서드는 객체 생성 없이 호출할 수 있다.
- 인스턴스 메서드는 객체 상태와 관련된 기능에 사용한다.
- 메서드 호출과 복귀 과정에서 스택 프레임이 관리된다.

</details>

---

## Day12. 메서드 심화 및 사용자 정의 클래스

<details>
<summary>📖 핵심 내용 보기</summary>

### 🎯 학습 목표
클래스 구성 요소와 객체 초기화 및 접근 제어를 이해한다.

### 1. 클래스 구성

```java
class Member {

    private String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

| 구성 요소 | 역할 |
|---|---|
| 필드 | 객체 상태 저장 |
| 생성자 | 객체 초기화 |
| 메서드 | 객체 기능 구현 |
| this | 현재 객체 참조 |
| static | 클래스 소속 멤버 정의 |

### 2. 접근 제한자

| 제한자 | 접근 범위 |
|---|---|
| public | 모든 위치 |
| protected | 같은 패키지 및 다른 패키지의 적격 하위 클래스 |
| default | 같은 패키지 |
| private | 선언한 클래스 내부 및 Java가 허용하는 중첩 클래스 접근 |

### 3. DTO와 VO

| 구분 | 목적 |
|---|---|
| DTO | 데이터를 계층 사이에 전달 |
| VO | 값 자체의 의미와 동등성 표현 |

### ✅ Day12 핵심 정리

- 클래스는 데이터와 기능을 함께 정의한다.
- 생성자는 객체 초기화에 사용한다.
- private 필드와 공개 메서드로 상태 변경을 제어할 수 있다.
- DTO와 VO는 설계 목적이 다르다.

</details>

---

## Day13. Java 객체지향 프로그래밍 심화

<details>
<summary>📖 핵심 내용 보기</summary>

### 🎯 학습 목표
객체지향의 핵심 원리와 상속 및 다형성을 이해한다.

### 1. 객체지향 핵심 원리

| 원리 | 설명 |
|---|---|
| 캡슐화 | 데이터와 기능을 묶고 내부 상태 보호 |
| 상속 | 부모 클래스의 특성 재사용 |
| 다형성 | 공통 타입으로 다양한 구현 처리 |
| 추상화 | 필요한 공통 특징과 규약 표현 |

### 2. 상속과 오버라이딩

```java
class Animal {
    void sound() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog");
    }
}
```

### 3. 다형성

```java
Animal animal = new Dog();

animal.sound(); // Dog
```

**핵심**

- 참조 변수의 타입과 실제 객체의 타입을 구분한다.
- 오버라이딩된 인스턴스 메서드는 실제 객체에 맞게 실행된다.

### 4. 추상 클래스와 인터페이스

- 추상 클래스: 관련 객체의 공통 상태와 구현을 정의할 수 있음
- 인터페이스: 구현 클래스가 따라야 할 공통 규약 정의

### ✅ Day13 핵심 정리

- 상속은 공통 기능을 재사용하는 수단이다.
- 다형성은 구현체를 유연하게 교체할 수 있도록 한다.
- 추상화는 불필요한 세부 구현보다 공통 역할에 집중한다.

</details>

---

## Day14. 클래스·객체·JVM 메모리 구조

<details>
<summary>📖 핵심 내용 보기</summary>

### 🎯 학습 목표
객체 생성 과정과 JVM 메모리 구조를 이해한다.

### 1. JVM 메모리 영역

| 영역 | 주요 역할 |
|---|---|
| Heap | 객체와 배열 저장 |
| JVM Stack | 스레드별 메서드 호출 프레임 관리 |
| Method Area | 클래스 관련 메타데이터 관리 |

**기본 구조**

```text
JVM
 ├── Method Area
 │     └── 클래스 정보
 ├── Heap
 │     └── 객체와 배열
 └── JVM Stack
       └── 메서드 호출 프레임
```

### 2. 객체 참조

```java
Member a = new Member("홍길동");
Member b = a;
```

- a와 b는 같은 객체를 참조한다.
- 참조 변수 대입으로 새로운 객체가 생성되지 않는다.

### 3. 클래스 초기화

- 인스턴스 필드와 초기화 블록은 객체 생성 과정에 관여한다.
- 생성자는 객체 초기화를 수행한다.
- static 필드는 클래스에 속하며 객체 간에 공유된다.

### ✅ Day14 핵심 정리

- 객체는 일반적으로 Heap에서 관리된다.
- 메서드 호출 프레임은 JVM Stack에 저장된다.
- 참조 변수와 실제 객체는 구분해야 한다.

</details>

---

## Day15. 상속·다형성 및 JVM 메모리 심화

<details>
<summary>📖 핵심 내용 보기</summary>

### 🎯 학습 목표
상속 관계에서 생성자 실행과 메서드 호출 원리를 이해한다.

### 1. super

```java
class Parent {

    Parent(String name) {
        System.out.println(name);
    }
}

class Child extends Parent {

    Child() {
        super("Parent");
    }
}
```

- `super()`는 부모 생성자를 호출한다.
- 자식 객체 생성 시 부모 클래스의 초기화가 먼저 이루어진다.

### 2. 오버라이딩과 동적 바인딩

```java
Parent object = new Child();
```

- 오버라이딩된 인스턴스 메서드는 실제 객체 타입에 따라 결정된다.
- 필드는 메서드처럼 다형적으로 오버라이딩되지 않는다.
- static 메서드는 동적 디스패치 대상이 아니다.

### 3. Garbage Collection

- GC는 더 이상 도달할 수 없는 객체를 수거 대상으로 관리한다.
- 객체가 사용되지 않는다고 즉시 수거되는 것은 아니다.
- 메모리 수거 시점은 보장되지 않는다.

### ✅ Day15 핵심 정리

- 부모와 자식 생성자의 초기화 순서를 이해해야 한다.
- 오버라이딩과 필드 숨김은 다르게 동작한다.
- 생성자에서 오버라이딩 가능한 메서드를 호출하면 초기화되지 않은 자식 상태에 접근할 위험이 있다.

</details>

---

## Day16. Java 클래스 종류와 객체지향 설계

<details>
<summary>📖 핵심 내용 보기</summary>

### 🎯 학습 목표
추상 클래스, 인터페이스, 중첩 클래스를 이용한 설계 방법을 이해한다.

### 1. 추상 클래스와 인터페이스

| 구분 | 추상 클래스 | 인터페이스 |
|---|---|---|
| 선언 | abstract class | interface |
| 목적 | 공통 상태 및 구현 | 공통 규약 |
| 인스턴스 필드 | 가능 | 불가능 |
| 다중 구현 | 클래스 다중 상속 불가 | 여러 인터페이스 구현 가능 |

### 2. 중첩 클래스 종류

| 종류 | 특징 |
|---|---|
| 인스턴스 멤버 클래스 | 외부 객체와 연결 |
| static 중첩 클래스 | 외부 객체 없이 생성 가능 |
| 지역 클래스 | 메서드·블록 내부 선언 |
| 익명 클래스 | 이름 없는 일회성 구현 |

### 3. 객체지향 설계 원칙

- **낮은 결합도:** 구체적인 구현에 대한 의존성 최소화
- **높은 응집도:** 관련된 기능을 하나의 책임으로 구성
- **DI:** 필요한 의존 객체를 외부에서 전달
- **Builder:** 객체 생성 과정을 단계적으로 구성

### ✅ Day16 핵심 정리

- 추상 클래스는 공통 구현을 공유하는 데 활용한다.
- 인터페이스는 교체 가능한 구현의 규약을 정의한다.
- 중첩 클래스는 관련 타입을 논리적으로 묶는다.
- DI는 구체적인 구현에 대한 의존성을 줄이는 데 도움이 된다.

</details>

---

## Day17. Java 인터페이스 심화 및 예외 처리

<details>
<summary>📖 핵심 내용 보기</summary>

### 🎯 학습 목표
인터페이스의 다양한 메서드와 예외 처리의 기본 원리를 이해한다.

### 1. 인터페이스 메서드

| 종류 | 특징 |
|---|---|
| abstract | 구현 클래스에서 구현할 메서드 선언 |
| default | 기본 구현 제공 |
| static | 인터페이스에 속하는 정적 메서드 |
| private | 인터페이스 내부 구현 보조 메서드 |

```java
interface Payment {

    void pay();

    default void cancel() {
        System.out.println("취소");
    }

    static void info() {
        System.out.println("결제 정보");
    }
}
```

### 2. 인터페이스와 DI

```java
class PaymentService {

    private final Payment payment;

    PaymentService(Payment payment) {
        this.payment = payment;
    }
}
```

구현 클래스가 아닌 인터페이스 타입에 의존하여 구현체 교체를 쉽게 할 수 있다.

### 3. 예외 처리 기초

- Exception: 프로그램의 예외적 상황을 표현
- Error: 일반적으로 복구하기 어려운 심각한 오류
- try-catch: 예외 처리
- finally: 정리 작업

### ✅ Day17 핵심 정리

- 인터페이스는 추상 메서드 외에도 default, static, private 메서드를 선언할 수 있다.
- 여러 인터페이스를 구현할 수 있다.
- 인터페이스에 의존하면 구현 교체와 테스트가 쉬워질 수 있다.

</details>

---

## Day18. Java 예외 처리 및 실무 활용

<details>
<summary>📖 핵심 내용 보기</summary>

### 🎯 학습 목표
예외 처리, 예외 전파, 자원 정리와 사용자 정의 예외를 이해한다.

### 1. 예외 종류

| 구분 | 특징 |
|---|---|
| Checked Exception | 컴파일러가 처리 또는 전파 선언 요구 |
| Unchecked Exception | 컴파일러가 처리를 강제하지 않음 |

- Checked: IOException, SQLException 등
- Unchecked: RuntimeException 및 하위 예외

### 2. 예외 처리 문법

```java
try {
    int number = Integer.parseInt("abc");
} catch (NumberFormatException e) {
    System.out.println(e.getMessage());
} finally {
    System.out.println("종료");
}
```

### 3. throw와 throws

| 구분 | 의미 |
|---|---|
| throw | 예외 객체 발생 |
| throws | 메서드의 예외 전파 가능성 선언 |

```java
void validate(int age) {
    if (age < 0) {
        throw new IllegalArgumentException("잘못된 나이");
    }
}
```

### 4. try-with-resources

AutoCloseable 자원을 자동으로 정리한다.

```java
try (var reader = new java.io.FileReader("test.txt")) {
    System.out.println(reader.read());
} catch (java.io.IOException e) {
    System.out.println(e.getMessage());
}
```

### ✅ Day18 핵심 정리

- 처리할 수 없는 예외는 상위 호출자로 전파할 수 있다.
- 사용자 정의 예외로 비즈니스 오류를 구분할 수 있다.
- 자원 관리에는 try-with-resources를 우선 고려한다.
- 예외를 무조건 무시하거나 빈 catch로 숨기지 않는다.

</details>

---

## Day19. Java 예외 처리 및 중첩 클래스 심화

<details>
<summary>📖 핵심 내용 보기</summary>

### 🎯 학습 목표
중첩 클래스의 생성 방법과 외부 객체와의 관계를 이해한다.

### 1. 중첩 클래스 종류

| 종류 | 외부 객체 필요 여부 | 특징 |
|---|---|---|
| 인스턴스 멤버 클래스 | 필요 | 외부 객체의 상태에 접근 |
| static 중첩 클래스 | 불필요 | 독립적인 보조 타입 |
| 지역 클래스 | 선언 문맥에 따라 다름 | 메서드 내부에서 사용 |
| 익명 클래스 | 선언 문맥에 따라 다름 | 일회성 구현 |

### 2. 객체 생성 방법

```java
class Outer {

    class Inner {
    }

    static class Nested {
    }
}
```

```java
Outer outer = new Outer();

Outer.Inner inner = outer.new Inner();

Outer.Nested nested = new Outer.Nested();
```

### 3. 익명 클래스와 람다식

```java
Runnable task = () -> {
    System.out.println("작업 실행");
};
```

- 람다식은 함수형 인터페이스에 사용한다.
- 익명 클래스와 람다식의 this 의미는 다르다.
- 지역 클래스나 람다식이 캡처하는 지역 변수는 final 또는 사실상 final이어야 한다.

### 4. 실무 활용

- static 중첩 클래스: Builder 및 관련 보조 타입
- 지역 클래스: 특정 메서드 내부의 보조 구현
- 익명 클래스: 일회성 구현
- 예외 처리: Spring의 공통 오류 응답 처리

### ✅ Day19 핵심 정리

- 인스턴스 멤버 클래스는 외부 객체와 연결된다.
- static 중첩 클래스는 외부 인스턴스 없이 사용할 수 있다.
- 클래스가 중첩되어 있다고 객체를 자동으로 소유하는 것은 아니다.

</details>

---

## Day20. Java 1권 핵심 복습 및 표준 라이브러리

<details>
<summary>📖 핵심 내용 보기</summary>

### 🎯 학습 목표
Java 표준 라이브러리의 주요 클래스와 사용 목적을 이해한다.

### 1. java.lang 패키지

java.lang은 별도의 import 없이 사용할 수 있는 기본 패키지이다.

| 클래스 | 역할 |
|---|---|
| Object | 객체의 공통 기능 |
| String | 문자열 처리 |
| StringBuilder | 가변 문자열 |
| StringBuffer | 주요 메서드가 동기화된 가변 문자열 |
| Integer, Double | 기본형의 객체 표현 |
| Math | 수학 계산 |
| System | 표준 입출력 및 시스템 기능 |
| Runtime | JVM 실행 환경 정보 |
| Thread | 스레드 실행 |

### 2. Object 주요 메서드

| 메서드 | 역할 |
|---|---|
| equals() | 객체 동등성 비교 |
| hashCode() | 해시 코드 반환 |
| toString() | 문자열 표현 |
| getClass() | 런타임 타입 조회 |

**주의:** equals()를 재정의한다면 hashCode()도 같은 동등성 규칙에 맞게 재정의해야 한다.

### 3. String과 Wrapper

```java
String text = "Java";
int number = Integer.parseInt("100");

StringBuilder sb = new StringBuilder();
sb.append("Hello");
```

### 4. Math와 System

```java
Math.max(10, 20);
Math.abs(-10);

System.currentTimeMillis();
System.nanoTime();
```

### ✅ Day20 핵심 정리

- java.lang은 Java의 기본 클래스들을 제공한다.
- String은 불변이고 StringBuilder는 가변이다.
- Wrapper는 기본형과 객체형 API를 연결한다.
- nanoTime()은 경과 시간 측정에 적합하다.

</details>

---

## Day21. Java 코어 라이브러리 및 제네릭 심화

<details>
<summary>📖 핵심 내용 보기</summary>

### 🎯 학습 목표
날짜·시간 API, 정규표현식, 리플렉션, 어노테이션과 제네릭의 기본 구조를 이해한다.

### 1. java.base와 java.time

- java.base는 Java의 필수 모듈이다.
- java.lang, java.util, java.time 등 여러 패키지를 포함한다.

**날짜·시간 주요 타입**

| 타입 | 역할 |
|---|---|
| LocalDate | 날짜 |
| LocalTime | 시간 |
| LocalDateTime | 날짜와 시간 |
| ZonedDateTime | 시간대가 포함된 날짜·시간 |
| Period | 연·월·일 기반 기간 |
| Duration | 초·나노초 기반 시간 간격 |

### 2. Regex

정규표현식은 문자열 패턴을 검사하거나 검색하는 기능이다.

```java
String number = "12345";

boolean result = number.matches("\\d+");
```

- Pattern: 정규표현식 컴파일
- Matcher: 문자열 검사 및 검색

### 3. Reflection과 Annotation

- Reflection: 실행 중 클래스 정보를 조회하거나 동적 실행
- Annotation: 코드에 메타데이터 선언
- Class, Field, Method, Constructor: 주요 리플렉션 타입

### 4. Generic

```java
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

### ✅ Day21 핵심 정리

- 날짜·시간 계산에는 java.time을 활용한다.
- Regex는 패턴 기반 문자열 처리에 사용한다.
- Reflection과 Annotation은 프레임워크 자동화의 기반 기술이다.
- Generic은 컴파일 시 타입 안정성을 높인다.

</details>

---

## Day22. Java 코어 라이브러리 실전 활용 및 자동화

<details>
<summary>📖 핵심 내용 보기</summary>

### 🎯 학습 목표
정규표현식과 리플렉션·어노테이션을 실제 자동화 코드에 연결한다.

### 1. Period와 Duration

| 구분 | 기준 | 활용 |
|---|---|---|
| Period | 날짜 | 가입 기간, 연·월·일 차이 |
| Duration | 시간 | 작업 소요 시간 |

### 2. Pattern과 Matcher

```java
import java.util.regex.*;

Pattern pattern = Pattern.compile("\\d+");

Matcher matcher = pattern.matcher("Java123");

if (matcher.find()) {
    System.out.println(matcher.group()); // 123
}
```

| 메서드 | 역할 |
|---|---|
| matches() | 전체 문자열 검사 |
| find() | 일치 부분 검색 |
| group() | 일치 문자열 추출 |
| replaceAll() | 정규표현식 기반 치환 |

### 3. 어노테이션과 자동 실행

```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Execute {
}
```

**자동화 흐름**

```text
Annotation 선언
      ↓
메서드에 적용
      ↓
Reflection으로 검색
      ↓
어노테이션 확인
      ↓
Method.invoke() 실행
```

### ✅ Day22 핵심 정리

- 어노테이션 자체는 메서드를 실행하지 않는다.
- Reflection으로 메타데이터를 읽고 실행 코드를 작성할 수 있다.
- 메서드 자동 검색·실행은 프레임워크 동작을 이해하는 기초가 된다.

</details>

---

## Day23. Java 리플렉션·어노테이션·제네릭 심화

<details>
<summary>📖 핵심 내용 보기</summary>

### 🎯 학습 목표
리플렉션과 제네릭의 구체적인 사용 방법 및 제약을 이해한다.

### 1. Reflection 주요 타입

| 타입 | 역할 |
|---|---|
| Class | 클래스 정보 |
| Field | 필드 정보 및 값 접근 |
| Method | 메서드 정보 및 호출 |
| Constructor | 생성자 정보 및 객체 생성 |

**Class 객체 획득**

```java
Class<?> a = String.class;

Class<?> b = "Java".getClass();
```

**메서드 실행**

```java
Method method = String.class.getMethod("length");

int length = (int) method.invoke("Java");
```

※ 리플렉션 관련 Checked Exception은 처리하거나 전파해야 한다.

### 2. 제네릭 메서드

```java
public static <T> T getValue(T value) {
    return value;
}
```

### 3. 제한된 타입 매개변수

```java
class NumberBox<T extends Number> {
    private T value;
}
```

### 4. 와일드카드와 PECS

| 문법 | 의미 |
|---|---|
| `<?>` | 알 수 없는 타입 |
| `<? extends T>` | T 및 하위 타입 |
| `<? super T>` | T 및 상위 타입 |

**PECS**

```text
Producer Extends → 읽기 중심

Consumer Super   → 쓰기 중심
```

### 5. Type Erasure

- Java 제네릭은 주로 컴파일 단계에서 타입을 검사한다.
- 구체적인 타입 매개변수 정보는 일반적으로 소거된다.
- `new T()`나 `List<int>`는 직접 사용할 수 없다.

### ✅ Day23 핵심 정리

- Reflection은 런타임 동적 처리 기능이다.
- Annotation은 메타데이터를 제공한다.
- Generic은 타입 안정성과 코드 재사용성을 높인다.
- PECS는 제네릭 와일드카드 선택의 주요 기준이다.

</details>

---

## Day24. Java 컬렉션 프레임워크 및 제네릭 활용

<details>
<summary>📖 핵심 내용 보기</summary>

### 🎯 학습 목표
List, Set, Queue, Map의 특성을 이해하고 적절한 컬렉션을 선택한다.

### 1. 컬렉션 프레임워크

| 인터페이스 | 특징 | 대표 구현 |
|---|---|---|
| List | 순서 유지, 중복 허용 | ArrayList, LinkedList |
| Set | 중복 허용하지 않음 | HashSet, TreeSet |
| Queue | 대기열 형태로 요소 처리 | PriorityQueue |
| Deque | 양끝 삽입·삭제 | ArrayDeque |
| Map | Key-Value 관리 | HashMap, TreeMap |

**주의:** Map은 Collection 인터페이스를 상속하지 않는다.

### 2. List

**ArrayList**

- 배열 기반
- 인덱스 조회 O(1)
- 중간 삽입·삭제 시 요소 이동 가능

**LinkedList**

- 이중 연결 리스트 기반
- 인덱스 조회에 탐색 비용 발생
- 양끝 삽입·삭제에 적합

### 3. Set

| 구현체 | 특징 |
|---|---|
| HashSet | 중복 방지, 순서 보장하지 않음 |
| LinkedHashSet | 삽입 순서 유지 |
| TreeSet | 정렬된 요소 관리 |

**핵심:** HashSet은 equals()와 hashCode(), TreeSet은 정렬 기준이 중요하다.

### 4. Queue와 Deque

```java
Deque<Integer> stack = new ArrayDeque<>();

stack.push(10);
stack.push(20);

System.out.println(stack.pop()); // 20
```

- Stack: LIFO
- 일반 Queue: FIFO
- PriorityQueue: 우선순위에 따라 처리
- ArrayDeque: 스택과 일반 큐 용도로 활용 가능

### 5. Map

```java
Map<String, Integer> scores = new HashMap<>();

scores.put("Java", 90);
scores.put("Spring", 95);

System.out.println(scores.get("Java")); // 90
```

| 구현체 | 특징 |
|---|---|
| HashMap | 해시 기반 조회 |
| LinkedHashMap | 기본적으로 삽입 순서 유지 |
| TreeMap | Key 기준 정렬 |

**주요 메서드**

- put(): 저장
- get(): 조회
- containsKey(): Key 존재 여부
- getOrDefault(): 기본값 지정 조회
- keySet(): Key 집합
- entrySet(): Key-Value 항목 집합

### 6. Iterator

```java
Iterator<String> iterator = names.iterator();

while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

- Iterator: 순방향 순회
- ListIterator: List 양방향 순회
- 순회 중 요소 삭제는 지원되는 Iterator의 remove() 등을 사용한다.

### 7. Comparable과 Comparator

| 구분 | Comparable | Comparator |
|---|---|---|
| 역할 | 자연 정렬 기준 | 별도의 정렬 기준 |
| 메서드 | compareTo() | compare() |
| 기준 위치 | 객체 클래스 내부 | 외부에서도 정의 가능 |

### 8. Collections와 Arrays

| 유틸리티 | 주요 기능 |
|---|---|
| Collections | 컬렉션 정렬, 섞기, 최댓값·최솟값 |
| Arrays | 배열 정렬, 검색, 복사, 문자열 변환 |

**주의**

- Arrays.asList()는 고정 크기 List를 반환한다.
- List.of()는 변경 불가능한 List를 반환한다.
- 요소 추가·삭제가 필요하면 ArrayList 등을 사용한다.

### ✅ Day24 핵심 정리

- List: 순서가 있는 목록
- Set: 중복 없는 집합
- Queue: 대기열
- Deque: 양방향 큐
- Map: Key-Value 데이터
- Comparable: 자연 정렬
- Comparator: 외부 정렬 기준
- 컬렉션 선택은 순서, 중복, 검색, 정렬 및 변경 특성을 기준으로 한다.

</details>

---


## Day25. Java 컬렉션 프레임워크 실전 활용

<details>
<summary>📖 핵심 내용 보기</summary>

### 🎯 학습 목표

컬렉션 구현체의 차이를 이해하고, 데이터 특성에 맞는 자료구조와 제네릭을 활용하여 효율적인 데이터 관리 구조를 설계한다.

### 1. 컬렉션 선택 기준

컬렉션은 데이터의 저장 방식과 필요한 작업에 따라 선택한다.

| 요구사항 | 대표 구현체 | 선택 이유 |
|---|---|---|
| 일반적인 목록 관리 | ArrayList | 빠른 인덱스 조회 |
| 양끝 삽입·삭제 | ArrayDeque, LinkedList | 효율적인 양끝 연산 |
| 중복 제거 | HashSet | 해시 기반 중복 검사 |
| 중복 제거 및 정렬 | TreeSet | 정렬된 집합 관리 |
| Key 기반 검색 | HashMap | 빠른 Key 조회 |
| Key 정렬 및 범위 검색 | TreeMap | 정렬된 Key 관리 |
| FIFO 대기열 | ArrayDeque | 선입선출 처리 |
| 우선순위 처리 | PriorityQueue | 우선순위에 따른 처리 |

**핵심**

- List는 순서를 유지하고 중복을 허용한다.
- Set은 중복을 허용하지 않으며 구현체에 따라 순서가 다르다.
- Map은 Key-Value 구조이며 Key의 중복을 허용하지 않는다.
- 컬렉션 선택 시 조회, 삽입, 삭제, 정렬 요구사항을 고려한다.

### 2. 주요 구현 클래스 비교

| 구현체 | 내부 구조 및 특징 | 주의사항 |
|---|---|---|
| ArrayList | 배열 기반, 인덱스 조회 O(1) | 중간 삽입·삭제 시 요소 이동 |
| LinkedList | 이중 연결 리스트 | 인덱스 탐색 O(n) |
| Vector | 동기화된 주요 메서드 제공 | 레거시 구현체 |
| HashSet | 해시 기반 중복 검사 | 순서 보장하지 않음 |
| TreeSet | 정렬 트리 기반 | 정렬 기준 필요 |
| HashMap | 해시 기반 Key-Value 저장 | 순서 보장하지 않음 |
| Hashtable | 동기화된 주요 메서드 제공 | null Key·Value 불가 |

**주의**

- LinkedList의 중간 삽입·삭제가 항상 ArrayList보다 빠르지는 않다.
- HashSet의 중복 판단에는 equals()와 hashCode()의 일관성이 중요하다.
- TreeSet은 Comparable 또는 Comparator의 비교 결과로 중복을 판단한다.
- Vector와 Hashtable의 메서드 동기화만으로 모든 복합 연산의 스레드 안전성이 보장되지는 않는다.

### 3. Iterator와 ListIterator 활용

Iterator는 컬렉션을 순차적으로 탐색하는 인터페이스이다.

| 구분 | Iterator | ListIterator |
|---|---|---|
| 순방향 탐색 | 가능 | 가능 |
| 역방향 탐색 | 불가능 | 가능 |
| 요소 삭제 | 가능 | 가능 |
| 요소 추가·교체 | 불가능 | 가능 |
| 사용 대상 | Collection 계열 | List 전용 |

**Iterator를 이용한 요소 삭제**

```java
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> scores =
                new ArrayList<>(List.of(90, 45, 80, 30));

        Iterator<Integer> iterator = scores.iterator();

        while (iterator.hasNext()) {

            if (iterator.next() < 60) {
                iterator.remove();
            }
        }

        System.out.println(scores); // [90, 80]
    }
}
```

**핵심**

- hasNext(): 다음 요소 존재 여부 확인
- next(): 다음 요소 반환
- remove(): 마지막으로 반환한 요소 삭제
- ListIterator는 previous(), add(), set() 등을 추가로 제공한다.

**주의:** Iterator 순회 중 컬렉션을 직접 구조적으로 수정하면 ConcurrentModificationException이 발생할 수 있다.

### 4. Map 순회와 중복 제거

**Map 순회**

Map은 Collection 인터페이스를 상속하지 않으므로 entrySet() 등을 통해 순회한다.

```java
Map<Integer, String> members = new HashMap<>();

members.put(1001, "홍길동");
members.put(1002, "김철수");

for (Map.Entry<Integer, String> entry :
        members.entrySet()) {

    System.out.println(
        entry.getKey() + " : " + entry.getValue()
    );
}
```

**List 중복 제거**

```java
List<String> names =
        List.of("Java", "Spring", "Java");

Set<String> unique = new HashSet<>(names);

System.out.println(unique.size()); // 2
```

※ 두 예제는 `java.util.*`를 import한 메서드 내부 코드이다.

**핵심**

- keySet(): Key 순회
- values(): Value 순회
- entrySet(): Key와 Value를 함께 순회
- HashSet 생성자에 List를 전달하면 중복 요소를 제거할 수 있다.
- HashSet 변환 후에는 원래 List의 순서가 보장되지 않는다.

### 5. Collections 유틸리티

Collections는 컬렉션의 정렬, 검색, 순서 변경 등을 지원하는 유틸리티 클래스이다.

| 메서드 | 역할 |
|---|---|
| sort() | List 정렬 |
| reverse() | 순서 뒤집기 |
| shuffle() | 무작위 섞기 |
| max() | 최댓값 조회 |
| min() | 최솟값 조회 |
| binarySearch() | 정렬된 List에서 이진 탐색 |

**Java 예제**

```java
List<Integer> numbers =
        new ArrayList<>(List.of(30, 10, 20));

Collections.sort(numbers);

System.out.println(numbers); // [10, 20, 30]

Collections.reverse(numbers);

System.out.println(numbers); // [30, 20, 10]
```

※ `java.util.*`를 import한 메서드 내부 코드이다.

**주의**

- Collection은 인터페이스, Collections는 유틸리티 클래스이다.
- sort()와 reverse()는 원본 List를 변경한다.
- binarySearch()는 해당 비교 기준에 따라 정렬된 데이터에 사용한다.

### 6. 제네릭과 컬렉션의 결합

제네릭은 컬렉션에 저장할 데이터 타입을 지정하여 컴파일 시 타입 안정성을 확보한다.

**제네릭 클래스와 메서드**

| 구분 | 특징 |
|---|---|
| Generic Class | 객체 생성 시 타입 인자 지정 |
| Generic Method | 메서드 호출 시 타입 인자 결정 또는 추론 |

**주요 타입 매개변수**

| 기호 | 의미 |
|---|---|
| T | Type |
| E | Element |
| K | Key |
| V | Value |

**와일드카드와 PECS**

| 문법 | 의미 |
|---|---|
| `<?>` | 알 수 없는 타입 |
| `<? extends T>` | T 또는 하위 타입 |
| `<? super T>` | T 또는 상위 타입 |

```text
PECS (Producer Extends, Consumer Super)

Producer Extends → 읽기 중심
Consumer Super   → 쓰기 중심
```

**핵심**

- 제네릭은 잘못된 타입 저장을 컴파일 단계에서 방지한다.
- 타입 인자의 구체적인 정보는 일반적으로 타입 소거의 영향을 받는다.
- List<Integer>는 List<Number>의 하위 타입이 아니다.

### 7. 불변 컬렉션과 수정 불가능한 뷰

Java는 컬렉션의 변경을 제한하는 여러 방법을 제공한다.

| 구분 | 특징 |
|---|---|
| List.of() | 변경 불가능한 List 생성 |
| Set.of() | 변경 불가능한 Set 생성 |
| Map.of() | 변경 불가능한 Map 생성 |
| Collections.unmodifiableList() | 기존 List의 수정 불가능한 뷰 생성 |

**Java 예제**

```java
List<String> names =
        List.of("Java", "Spring");

// names.add("Oracle");
// UnsupportedOperationException 발생
```

**unmodifiableList()와의 차이**

```java
List<String> original = new ArrayList<>();

original.add("Java");

List<String> view =
        Collections.unmodifiableList(original);

original.add("Spring");

System.out.println(view); // [Java, Spring]
```

※ 두 예제는 `java.util.*`를 import한 메서드 내부 코드이다.

**주의**

- List.of()는 null 요소를 허용하지 않는다.
- unmodifiableList()는 원본이 변경되면 뷰에도 변경 내용이 반영될 수 있다.
- 수정 불가능한 컬렉션이라도 내부 요소 객체까지 불변인 것은 아니다.

### 8. 실무 데이터 관리 구조

여러 컬렉션을 조합하면 기능에 맞는 데이터 관리 구조를 설계할 수 있다.

**도서 관리 시스템 예시**

| 기능 | 자료구조 | 목적 |
|---|---|---|
| 전체 도서 목록 | ArrayList | 목록 저장 및 조회 |
| ISBN 중복 검사 | HashSet | 중복 데이터 방지 |
| 도서번호 검색 | HashMap | Key 기반 빠른 조회 |
| 도서 정렬 | Collections, Comparator | 정렬 조건 적용 |
| 대출 대기열 | ArrayDeque | FIFO 처리 |

**Spring Boot와의 연결**

| 계층 | 활용 예시 |
|---|---|
| Controller | `ApiResponse<List<Member>>` |
| Service | `List<Member>` |
| Repository | `JpaRepository<Member, Long>` |

**핵심**

- 하나의 컬렉션으로 모든 기능을 처리할 필요는 없다.
- 기능에 적합한 컬렉션을 조합하여 데이터 구조를 구성한다.
- 컬렉션과 제네릭은 Spring Boot의 데이터 처리 및 응답 구조에서도 활용된다.

### ✅ Day25 핵심 정리

- 컬렉션은 데이터의 순서, 중복, 검색, 정렬 요구사항에 따라 선택한다.
- ArrayList는 일반적인 목록 관리, HashSet은 중복 제거에 적합하다.
- TreeSet과 TreeMap은 정렬이 필요한 데이터에 활용한다.
- HashMap은 Key 기반 데이터 조회에 사용한다.
- Iterator는 컬렉션 순회와 요소 삭제에 활용한다.
- Map 순회 시 Key와 Value가 모두 필요하면 entrySet()을 사용한다.
- Collections는 정렬 및 검색 기능을 제공하는 유틸리티 클래스이다.
- 제네릭은 타입 안정성을 제공하며 PECS는 와일드카드 선택 원칙이다.
- List.of()와 unmodifiableList()는 변경을 제한하지만 동작 방식이 다르다.
- 실무에서는 여러 컬렉션을 목적에 맞게 조합하여 사용한다.

</details>






























## ✅ Java Day1~24 최종 핵심 정리

| 학습 단계 | 핵심 학습 내용 |
|---|---|
| **Day1~4** | Java 실행 구조, 변수, 자료형, 연산자, 제어문 |
| **Day5~7** | 반복문 심화, 입력 처리, String, 배열 |
| **Day8~11** | 문자열·배열 활용, 메서드, 알고리즘, 호출 구조 |
| **Day12~15** | 클래스, 생성자, 캡슐화, 상속, 다형성, JVM 메모리 |
| **Day16~19** | 추상 클래스, 인터페이스, 중첩 클래스, 예외 처리 |
| **Day20~22** | 표준 라이브러리, 날짜·시간, Regex, Reflection, Annotation |
| **Day23~24** | Generic, Wildcard, PECS, Collection Framework |

### 📌 반드시 이해해야 할 개념

- [ ] JDK, JRE, JVM의 차이
- [ ] 기본형과 참조형의 차이
- [ ] Stack과 Heap의 역할
- [ ] 참조값 복사와 객체 복사의 차이
- [ ] 클래스와 객체의 관계
- [ ] static과 인스턴스 멤버의 차이
- [ ] 오버로딩과 오버라이딩의 차이
- [ ] 캡슐화, 상속, 다형성, 추상화
- [ ] 추상 클래스와 인터페이스의 차이
- [ ] 중첩 클래스의 종류와 생성 방식
- [ ] Checked Exception과 Unchecked Exception
- [ ] throw와 throws의 차이
- [ ] Object의 equals(), hashCode(), toString()
- [ ] String과 StringBuilder의 차이
- [ ] java.time과 날짜·시간 계산
- [ ] Pattern과 Matcher의 사용법
- [ ] Annotation과 Reflection의 관계
- [ ] Generic 타입 매개변수와 와일드카드
- [ ] PECS 원칙과 타입 소거
- [ ] List, Set, Queue, Map의 차이
- [ ] ArrayList와 LinkedList의 특징
- [ ] HashMap, LinkedHashMap, TreeMap의 차이
- [ ] Comparable과 Comparator의 차이

---

