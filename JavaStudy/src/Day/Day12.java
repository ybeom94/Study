package Day;

import java.util.ArrayList;
import java.util.Arrays;

class StarRate
{
    

class Movie
{
    
}

class MovieSystem
{
    static Movie[] movies = new Movie[1938];
    static 
    {
        try
        {

        }
        catch(Exception exception)
        {

        }
    }
}

// class Card
// {
//     int number;
//     String type;
//     static int width;
//     static int height;

//     Card(int number, String type, int width, int height)
//     {
//         this.number = number;
//         this.type = type;
//         this.width = width;
//         this.height = height;
//     }
// }

public class Day12
{
    public static void main(String[] args)
    {
        //
        // int[] arr = new int[10];
        // arr = randomArr(arr);

        // System.out.println("합 : " + add(arr));
        // System.out.println("최소값 : " + min(arr));
        // System.out.println("최대값 : " + max(arr));

        
        // String[] names = {"홍길동", "이순신", "강감찬", "심청이", "춘향이"};
        // System.out.println(Arrays.toString(nameFindStrings(names, "이")));

        //
        // 클래스
        // 객체를 만들기 위한 설계도
        // 데이터만 가지고 있는 경우 => ~VO, ~DTO   / 데이터클래스, 사용자 정의 데이터형
        // 메소드만 가지고 있는 경우 => ~DAO, ~Service, ~Manager    / 액션 클래스

        //
        // Card a = new Card(2, "♥", 100, 200);
        // Card b = new Card(5, "♣", 300, 100);
        // Card c = new Card(10, "◆", 500, 300);

        // System.out.println(a.number + a.type + a.width + a.height);
        // System.out.println(b.number + b.type + b.width + b.height);
        // System.out.println(c.number + c.type + c.width + c.height);

        // Card.width = 1000;
        // Card.height = 2000;
        
        // System.out.println(a.number + a.type + a.width + a.height);
        // System.out.println(b.number + b.type + b.width + b.height);
        // System.out.println(c.number + c.type + c.width + c.height);

    }

    static String[] nameFindStrings(String[] names, String contains)
    {   
        ArrayList<String> list = new ArrayList<>();
        for (String n : names)
        {
            if (n.contains(contains))
            {
                list.add(n);
            }
        }
        return list.toArray(String[]::new);
    }

    static int min(int[] arr)
    {   
        int min = arr[0];
        for (int i : arr)
        {
            min = Math.min(min, i);
        }
        return min;
    }

    static int max(int[] arr)
    {
        int max = arr[0];
        for (int i : arr)
        {
            max = Math.max(max, i);
        }
        return max;
    }

    static void sortArr(int[] arr)
    {
        Arrays.sort(arr);
    }

    static int[] randomArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random() * 100) + 1;
        }
        return arr;
    }

    static int add(int[] arr)
    {
        int sum = 0;
        for (int i : arr)
        {
            sum += i;
        }
        return sum;
    }
}
