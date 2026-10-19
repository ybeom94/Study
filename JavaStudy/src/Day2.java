import java.util.Scanner;

//자바 실행 순서
// A.java -> javac(기계어로 변환, 컴파일) -> A.class -> java(한줄씩 읽어서 출력, 인터프리터) -> 실행

// 일반 프로그램
// 프로그램 -> 운영체제(API) -> 하드웨어
// 자바 프로그램
// 프로그램 -> JVM : JDK (통신역할, 실행 속도가 느림) -> 운영체제(API) -> 하드웨어

// JVM(Java Virtual Machine) : 자바 가상머신, OS에 상관없이 실행 가능하도록 해주는 프로그램
// JDK의 구성요소 JRE(실행환경) / JVM(javac{컴파일, 컴퓨터 인식언어로 변경}, java{인터프리터, 소스를 한줄씩 읽어서 출력},
// javap{역컴파일러, .class->.java}, javaw{서버 구동, 톰캣(웹 서버)}, jar{배포, zip}) / Library(자바에서 제공하는 기능)

// class A
//{
//  A()
//{
//  System.out.println("메모리 저장");
//}

//     @Override
//     protected void finalize() throws Throwable
//     {
//         System.out.println("메모리 해제");
//     }
// }

public class Day2
{
    public static void main(String[] args)
    {
        // A a = new A();
        // a = null;
        // System.gc();

        // //람다식
        // Runnable r = new Runnable() {
        //     @Override
        //     public void run() {
        //         System.out.println("쓰레드 시작");
        //     }
        // };
        // new Thread(r).start();

        // Runnable r2 = () -> {
        //     System.out.println("쓰레드 시작2");
        // };
        // new Thread(r2).start();

        //1~100까지 난수 한개 생성
        int random = (int)(Math.random() * 100) + 1;
        System.out.println(random);
        
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.print("1~100까지 숫자를 입력하세요 : ");
            int input = sc.nextInt();

            //콘솔 화면 지우기
            System.out.print("\033[H\033[2J");
            System.out.flush();

            if(input > random)
            {
                System.out.println("다운!");
            }
            else if(input < random)
            {
                System.out.println("업!");
            }
            else
            {
                System.out.println("정답입니다! : " + random);
                break;
            }
        }
        sc.close();
    }
}