package Day;

import java.io.FileReader;
import java.util.Scanner;

public class Day18
{
    public static void main(String[] args)
    {
        // 예외처리 : 소스상에서 처리할 수 있는 가벼운 에러
        // - 정의 : 프로그램 실행 시에 발생할 수 있는 에러에 대비하는 코드
        // - 목적 : 비정상 종료를 방지하는 경우 사용

        // 에러 종류
        // - 에러 : 심각한 에러 / 메모리 부족, 윈도우 종료
        // - 예외 : 가벼운 에러 / URL주소, 파일명, 서버 IP PORT

        // 컴파일 시 : CheckedException / 반드시 예외처리
        // : 파일읽기(파일 경로, 파일명), 크롤링(URL주소), 오라클 연동(IP, PORT), 서버ㆍ네트워크(IP, PORT), 쓰레드(충돌 방지), 웹(사이트 주소)
        // 처리 방법 : 1.예외 복구(직접 처리)(try~catch~finally)  2.예외 회피(간접 처리)(메소드() throw 예외처리클래스)
        //          : 3.예외 발생(테스트, 임의로 발생)(throw new 예외클래스())  4.사용자 정의(class MyException extends Exception)
        // 실행 시 에러 : UnCheckedException / 필요시에만 예외처리

        // 예외처리 계층구조 : Object - Throwable - Error
        //                                  └    - Exception - CheckedException - IOException
        //                                              └    - UnCheckedException - RuntiomeException

        // Scanner scan = new Scanner(System.in);
        // System.out.print("첫번째 문자 입력 : ");
        // String input1 = scan.next();
        // System.out.print("두번째 문자 입력 : ");
        // String input2 = scan.next();

        // int[] arr = new int[2];
        // // arr[0] = Integer.parseInt(input1);
        // // arr[2] = Integer.parseInt(input2);
        // // System.out.println(arr[0] / arr[1]);
        // try
        // {
        //     arr[0] = Integer.parseInt(input1);
        //     arr[1] = Integer.parseInt(input2);
        //     System.out.println(arr[0] / arr[1]);
        // }
        // catch (NumberFormatException e)
        // {
        //     System.out.println("정수 변환에 실패하였습니다.");
        // }
        // catch (ArrayIndexOutOfBoundsException e)
        // {
        //     System.out.println("배열 범위 초과");
        // }
        // catch (Exception e)
        // {
        //     System.out.println(e.getMessage());
        // }
        // System.out.println("프로그램 종료");

        // try(FileReader reader = new FileReader("C:\\Users\\sist\\Desktop\\Study\\PathTest.txt"))
        // {
        //     int i = 0;
        //     while ((i = reader.read()) != -1)
        //     {
        //         System.out.print((char)i);
        //     }
        //     // reader.close();
        // }
        // catch (Exception ex)
        // {
        //     ex.printStackTrace();
        // }

        a(10, 0);
        b(null);
        c(" 20");
        d();
        e();
    }

    public static void a(int a, int b)
    {
        try
        {
            System.out.println(a / b);
        }
        catch (ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public static void b(String data)
    {
        try
        {
            System.out.println(data.length());
        }
        catch (NullPointerException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public static void c(String num)
    {
        try
        {
            System.out.println(Integer.parseInt(num));
        }
        catch (NumberFormatException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public static void d()
    {
        try
        {
            int[] arr = new int[2];
            System.out.println(arr[2]);
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public static void e()
    {
         try
        {
            A a = new A();
            B b = (B)a;
        }
        catch (ClassCastException ex)
        {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void f() throws Exception // Checked
    {

    }

    public static void g() throws RuntimeException // UnChecked
    {
        
    }
}

class A
{

}

class B extends A
{

}