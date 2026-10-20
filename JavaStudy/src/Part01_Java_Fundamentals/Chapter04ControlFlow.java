package Part01_Java_Fundamentals;

/*
    Chapter 04. 조건문과 반복문
 
    4.1 코드 실행 흐름 제어
    - 코드는 기본적으로 위에서 아래로 실행된다.
    - 제어문은 조건에 따라 일부 블록을 선택하거나 같은 블록을 반복하게 한다.
 
    4.2 if 문
    - if는 boolean 조건이 참일 때 블록을 실행한다. 
    - else if를 여러 개 사용하면 위에서부터 검사하고 처음 만족한 분기의 코드만 실행한다.
 
    4.3 switch 문
    - switch는 정수·열거형·문자열 등 지원되는 선택자에 따라 case를 실행한다.
    - 전통 case의 콜론 문법에서는 break를 누락하면 다음 case로 이어질 수 있으며 화살표 문법은 이를 방지한다.
 
    4.4 for 문
    - for(초기식; 조건식; 증감식)은 초기화 후 조건 검사·본문 실행·증감을 반복한다.
    - 횟수가 정해진 반복이나 인덱스 순회에 적합하다.
 
    4.5 while 문
    - while은 시작 전에 조건을 검사하여 참인 동안 반복한다.
    - 조건이 처음부터 거짓이면 본문은 한 번도 실행되지 않는다.
 
    4.6 do-while 문
    - do-while은 본문을 먼저 실행하고 조건을 검사하므로 적어도 한 번 실행된다.
    - 닫는 괄호 뒤의 세미콜론(;)을 잊지 않는다.
 
    4.7 break 문
    - break는 가장 가까운 반복문 또는 switch를 종료한다.
    - 라벨을 지정한 break는 원하는 바깥 반복문을 종료할 수 있다.
 
    4.8 continue 문
    - continue는 현재 반복의 나머지 실행을 건너뛰고 다음 회차로 이동한다.
    - for에서는 증감식을 수행한 뒤 조건을 재검사한다.
 */

public class Chapter04ControlFlow {
    public static void main(String[] args) throws Exception {
        int score = 85;
        if (score >= 90) System.out.println("A");
        else if (score >= 80) System.out.println("B");
        else System.out.println("C 이하");

        for (int i = 1; i <= 3; i++) {
            System.out.println("반복: " + i);
        }
    }
}
