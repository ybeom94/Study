package Day;

import javax.swing.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Day8 extends JFrame
{
    JTextField tf = new JTextField();

    public static void main(String[] args) throws IOException
    {
        // trim()**     : 좌우 공백 제거
        // valueOf()**  : 모든 데이터형을 문자열로 변환()
        // split()**    : 단어별로 나눠서 배열에 저장
        // join()       : 문자를 묶어서 한개의 문자열로 저장
        // format()     : 문자열 변환(printf())

        // 라이브러리   : 자바에서 만든 클래스
        // 메소드       : 특정 기능을 수행하는 명령문의 집합

        // String msg = " Hello Java!!  ";
        // System.out.println(msg + "의 문자 갯수 : " + msg.length());
        // msg = msg.trim();
        // System.out.println("trim() 후 " + msg + "의 문자 갯수 : " + msg.length());

        // int a = 100;
        // int b = 200;
        // System.out.println(a+b);
        // System.out.println(String.valueOf(a) + b); // 100200
        // char[] c = {'홍', '길', '동', '입', '니', '다'};
        // System.out.println(String.valueOf(c));

        // String s= String.join("-", "2026", "10", "21");
        // System.out.println(s);
        
        // s = String.format("%d %d %d %.2f %c", 90, 90, 80, 260/3.0, 'A');
        // System.out.println(s);

        
        // 배열 : 같은 유형의 데이터를 여러개 모아서 관리할 목적
        // 배열(고정) / ArrayList, LinkedList, Vecter, Map, Set(가변)
        // 특징
        // - 연속적인 메모리 할당 -> 인덱스를 이용한 접근이 가능
        // - 고정된 크기 -> 배열 크기는 선언시에 정해진다. 한번 선언하면 변경이 불가능
        // - 같은 데이터형만 모아서 관리가 가능
        // - 빠른 접근 속도 -> 인덱스 이용
        // - CPU 자주 사용시에 데이터를 cache에 저장 후 사용 가능
        // - 간단한 구현 -> 배열의 데이터 저장 구조가 단순하다.
        // - 고정된 크기 -> 메모리의 사용량을 예측, 메모리 관리가 쉽다.
        // - 데이터형[] 배열명 = new 데이터형[생성갯수]
        // - for (int i = 0; i < arr.length; i++) => 배열의 인덱스를 이용해서 값을 가지고 온다
        // - for (int a : arr) => 실제 배열에 저장된 실제 데이터를 읽어온다
        // - 배열의 데이터를 변경 => 일반 for / 데이터만 출력 => for-each
        
        //초기화
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random()*100) + 1;
        }
        //출력
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println(arr); // 주소

        int max = arr[0];
        int min = arr[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++)
        {

        }
        for (int i : arr)
        {
            if (i > max)
            {
                max = i;
                
            }
            if (i < min)
            {
                min = i;
            }
        }
        System.out.println("Max : " + max + "\nMin : " + min);

    }

}
