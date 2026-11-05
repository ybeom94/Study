package Day;

import java.util.ArrayList;
import java.util.List;

public class Day19
{
    public static void main(String[] args)
    {
        // try
        // {
        //     System.out.println("try 수행");
        //     throw new MyException("Hello");
        // }
        // catch(ArrayIndexOutOfBoundsException ex)
        // {

        // }
        // catch(MyException ex)
        // {
        //     System.out.println(ex.getMessage());
        // }

        // 예외처리 : 직접처리(try ~ catch ~ finally) / 간접처리 / 임의발생(사용자 정의)
        // catch 여러개 사용 가능 -> 반드시 크기가 작은 순으로
        // IOException : 파일 관련 / InterruptedException : 쓰레드 / MalformedURLException : 네트워크(JSoup) / ClassNot

        // 공통으로 사용하는 변수 / 메소드가 있는 경우
        // => 네트워크 / 쓰레드 / 윈도우
        // 다른 클래스와 연결해서 사용하기 쉽다, 코드의 복잡성을 줄일 수 있다

        // // 인스턴스 멤버
        // Outer outer = new Outer();
        // Outer.Inner inner = outer.new Inner();
        // inner.print();

        // // 정적 멤버
        // Outer1.Inner inner1 = new Outer1.Inner();
        // inner1.print();

        // // 지역 클래스
        // Outer2 outer2 = new Outer2();
        // outer2.print();

        // // 익명의 클래스
        // Inner inner2 = new Inner();
        // inner2.print();

        // Outer3 outer3 = new Outer3();
        // outer3.inner.print();

        // Outer4 outer4 = new Outer4();
        // outer4.display();

        

    }
}

class Outer
{
    private String name = "홍길동";
    class Inner
    {
        int a = 10;
        public void print()
        {
            System.out.println(a + " : " + name);
        }
    }
}

class Outer1
{
    static class Inner
    {
        public void print()
        {
            System.out.println("static Inner : print() Call...");
        }
    }
}

class Outer2
{
    public void print()
    {
        class Inner
        {
            public void print()
            {
                System.out.println("지역 클래스 : Inner:print() Call...");
            }
        }
        Inner inner = new Inner();
        inner.print();
    }
}

class Outer3
{
    Inner inner = new Inner();
    public void print()
    {
        System.out.println("Outer3에서 print() 오버라이딩 됨");
    }
}

class Inner
{
    public void print()
    {
        System.out.println("Inner:print() Call...");
    }
}

class Outer4
{
    int value = 10;
    public void display()
    {

    }
    class Inner
    {
        int value = 20;
        public void method()
        {
            int value = 30;
            System.out.println("value = " + value);
            System.out.println("value = " + this.value);
            System.out.println("value = " + Outer4.this.value);
        }
    }
}

class Server
{
    int port;
    List<Client> clientList = new ArrayList<Client>();

    public void CreateClient()
    {
        Client client = new Client(port);
        clientList.add(client);
    }

    class TempClient
    {
        
    }
}

class Client extends Thread
{
    public Client(int port)
    {

    }
}

// class MyException extends Exception
// {
//     public MyException(String msg)
//     {
//         super(msg);
//     }
// }