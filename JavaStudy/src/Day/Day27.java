package Day;

import java.io.*;

public class Day27
{
    public static void main(String[] args)
    {
        // Thread thread1 = new MyThread();
        // Thread thread2 = new MyThread();
        // Thread thread3 = new MyThread();
        // System.out.println("thread1 정보 : " + thread1.getName() + ", " + thread1.getPriority());
        // System.out.println("thread2 정보 : " + thread2.getName() + ", " + thread2.getPriority());
        // System.out.println("thread3 정보 : " + thread3.getName() + ", " + thread3.getPriority());
        // thread1.setName("T1");
        // thread2.setName("T2");
        // thread3.setName("T3");
        // thread1.setPriority(10);
        // thread2.setPriority(3);
        // thread3.setPriority(1);
        // thread1.start();
        // thread2.start();
        // thread3.start();
        
        // Thread
        // => 하나의 프로그램 안에서 여러개 작업을 동시에 수행할 때 사용되는 작은 단위 프로그램
        // 여러 작업을 동시에 처리
        // CPU 활용도 증가
        // 작업 대기 시간 단축
        // 충돌 가능성이 많다

        // IO
        // 메모리 
        // 파일 => 한글이 있는 경우 char(2) 단위 (fileReader, FileWriter) / zip, Image : byte 단위(1) (FileInputSteam, FileOutputStream)
        // 네트워크

        try
        {
            //FileInputStream fis = new FileInputStream("C:\\Users\\sist\\git\\Study\\JavaStudy\\src\\Day\\Day27.java");
            FileReader fr = new FileReader(
                    "C:\\\\Users\\\\sist\\\\git\\\\Study\\\\JavaStudy\\\\src\\\\Day\\\\Day27.java");
            int i = 0;
            while ((i = fr.read()) != -1)
            {
                System.out.print((char)i);
            }
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }

        // Input => 외부 데이터를 프록램으로 가져오기 / 키보드, 파일, 클라이언트가 보낸 값
        // Output => 프로그램 데이터를 외부로 보내기 / 브라우저, 도스창, 파일

        // Stream => 단방향 => 데이터 이동 통로 => 절대 손실 할 염려가 없다
        



    }
}

class MyThread extends Thread
{
    public void run()
    {
        for (int i = 0; i <= 10000; i++)
        {
            System.out.println(getName() + " : " + i);
            try
            {
                //Thread.sleep(100);
            } catch (Exception e) { }
        }
    }
}