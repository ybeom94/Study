package Day;

import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day10
{
    public static void main(String[] args) throws Exception
    {
        // String str = "홍길동, 이순신, 심청이, 박문수, 강감찬";
        // String[] strArr = str.split(", ");
        // for(String s : strArr)
        // {
        //     System.out.println(s);
        // }


        // 파일 읽어 오기
        // FileReader reader = new FileReader("C:\\Users\\sist\\Desktop\\Study\\movie.txt");
        // StringBuffer buffer = new StringBuffer();
        // int i = 0;
        // while ((i = reader.read()) != -1) // -1 = 파일의 끝 EOF
        // {
        //     buffer.append((char)i);
        // }
        // reader.close();
        // // System.out.println(buffer.toString());
        // String[] movieArr = buffer.toString().split("\n");

        // ArrayList<Movie> movieList = new ArrayList<>();
        // for (String movieStr : movieArr)
        // {   
        //     String[] str = movieStr.split("\\|");

        //     Movie movie = new Movie(Integer.parseInt(str[0]), str[1], str[2], str[4], str[6], str[7]);
        //     movieList.add(movie);
        // }

        // Scanner scanner = new Scanner(System.in, "MS949");
        // System.out.print("등급 선택 : ");
        // String inputStr = scanner.next();
        // for (Movie movie : movieList)
        // {
        //     if (movie.grade.contains(inputStr))
        //     {
        //         System.out.println(movie.title);
        //     }
        // }


        //                        
        // int[] arr = new int[5];
        // for (int i = 0; i < arr.length; i++)
        // {
        //     arr[i] = (int)(Math.random() * 100) + 1;
        // }
        // System.out.println("정렬 전 : " + Arrays.toString(arr));

        // // 선택 정렬
        // for (int i = 0; i < arr.length - 1; i++)
        // {
        //     for (int j = i + 1; j < arr.length; j++)
        //     {
        //         if (arr[i] > arr[j])
        //         {
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        //     System.out.println(i + 1 + "Round : " + Arrays.toString(arr));
        // }
        // System.out.println("정렬 후 : " + Arrays.toString(arr));

        // // 버블 정렬, 인접한 수끼리 비교, 마지막부터 고정
        // for (int i = 0; i < arr.length - 1; i++)
        // {
        //     for (int j = 0; j < arr.length - 1 - i; j++)
        //     {
        //         if (arr[j] > arr[j + 1])
        //         {
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }
        // }
        // System.out.println("정렬 후 : " + Arrays.toString(arr));


        // 열거형, 상수를 쉽게 관리하는 클래스 일종
        // eum 전화번호
        // {서울("02"), ....}
        // Scanner scanner = new Scanner(System.in, "MS949");
        // System.out.print("지역 입력 : ");
        // String input = scanner.next();

        // for(전화국번 n : 전화국번.values())
        // {
        //     if (n.name().contains(input))
        //     {
        //         System.out.println(input + "의 국번은 " + n.getCode());
        //     }
        // }

        Day today = Day.금요일;
        System.out.println(today);

    }
}

class Movie
{
    int rank;
    String title;
    String genre;
    String actor;
    String grade;
    String director;

    Movie(int rank, String title, String genre, String actor, String grade, String director)
    {
        this.rank = rank;
        this.title = title;
        this.genre = genre;
        this.actor = actor;
        this.grade = grade;
        this.director = director;
    }
}

enum Day
{
    월요일,
    화요일,
    수요일,
    목요일,
    금요일,
    토요일,
    일요일
}

enum 전화국번
{
    서울("02"),
    경기도("031"),
    인천("032"),
    강원도("033"),
    충청남도("041"),
    대전("042"),
    충청북도("043"),
    세종("044"),
    부산("051"),
    울산("052"),
    대구("053"),
    경상북도("054"),
    경상남도("055"),
    전라남도("061"),
    광주("062"),
    전라북도("063"),
    제주("064");

    String code;
    전화국번(String code)
    {
        this.code = code;
    }
    String getCode()
    {
        return code;
    }
}