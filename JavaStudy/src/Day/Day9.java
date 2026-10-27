package Day;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Day9
{
    public static void main(String[] args)
    {
        // 얕은 복사
        // Student student1 = new Student("홍길동", 19, 170.5, 59.9);
        // Student student2 = new Student("김득수", 29, 180.5, 76.2);

        // Student[] student = new Student[2];
        // student[0] = student1;
        // student[1] = student2;

        // Student[] tempStudent = student.clone();
        // tempStudent[0].name = "김점분";
        // tempStudent[0].age = 52;

        // System.out.println(student[0].name + " " + student[0].age);


        // int[] a = {10, 20, 30, 45, 60};
        // System.out.println("a의 주소 : " + a);
        // int[] b = a;
        // System.out.println("b의 주소 : " + b);
        // b[0] = 100;
        // System.out.println(b[0]);
        // System.out.println(a[0]);

        // int[] c = a.clone();
        // // a => 데이터 포함 복사, 새로운 메모리 생성
        // System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(c));
        // c[0] = 200;
        // System.out.println("a의 주소 : " + a);
        // System.out.println("c의 주소 : " + c);
        // System.out.println(a[0]);
        // System.out.println(c[0]);


        // Arrays.copyOf()
        // 기존의 배열의 내용을 복사해서 새로운 배열을 만드는 메소드
        // 배열의 크기 Up, Down
        // Arrays.copyOf(기존배열, length)

        // int[] arr = {100, 200, 300};
        // int[] tempArr = Arrays.copyOf(arr, 5);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(tempArr));
        

        // System.arraycopy(원본, 시작index, 저장위치, target index, length)
        // 배열의 데이터를 다른 배열로 복사하는 메소드

        // int[] arr = {10, 20, 30, 40, 50};
        // int[] targetArr = new int[5];
        // System.arraycopy(arr, 0, targetArr, 0, 5);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(targetArr));

        // System.arraycopy() / 기존의 배열 데이터 복사, 배열크기 자동 변경 안됨, 시작위치->갯수지정, 부분복사*배열통합
        // Arrays.copyOf() / 새로운 배열 생성(복사), 원하는 크기로 변경 가능, 처음부터 지정된 길이만큼, 배열크기변경*전체복사


        // int[] binary = new int[16];
        // // 뒤에서부터
        // int index = binary.length - 1;
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("정수 입력 : ");
        // int input = scanner.nextInt();
        // while (true)
        // {
        //     binary[index] = input % 2;
        //     input /= 2;
        //     if (input == 0)
        //     {
        //         break;
        //     }
        //     index--;
        // }
        // for (int i = 0; i < binary.length; i++)
        // {
        //     if (i % 4 == 0 && i != 0)
        //     {
        //         System.out.print(" ");
        //     }
        //     System.out.print(binary[i]);
        // }


        // Scanner scanner = new Scanner(System.in);
        // System.out.print("년도 입력 : ");
        // int year = scanner.nextInt();
        // System.out.print("월 입력 : ");
        // int month = scanner.nextInt();
        // System.out.print("일 입력 : ");
        // int day = scanner.nextInt();
        // System.out.println(year + "년 " + month + "월 " + day + "일");

        // int total = (year - 1) * 365 + (year - 1) % 4 - (year - 1) % 100 + (year - 1) % 400;
        // int[] lastDay = {31, 28, 31, 30, 31, 30,
        //                  31, 31, 30, 31, 30, 31};

        // if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        // {
        //     lastDay[1] = 29;
        // }
        // else
        // {
        //     lastDay[1] = 28;
        // }
        // for (int i = 0; i < month - 1; i++)
        // {
        //     total += lastDay[i];
        // }
        // // total += day;
        // total++;
        // int week = total % 7;
        // String[] strWeek = {"일", "월", "화", "수", "목", "금", "토"};
        // //System.out.println(year + "년 " + month + "월 " + day + "일은 " + strWeek[week] + "요일 입니다.");
        // // 달력 출력
        // for (String w : strWeek)
        // {
        //     System.out.print(w + "\t");
        // }
        // System.out.println();
        // for (int i = 1; i <= lastDay[month - 1]; i++)
        // {
        //     if (i == 1)
        //     {
        //         for (int j = 0; j < week; j++)
        //         {
        //             System.out.print("\t");
        //         }
        //     }
        //     if (i == day)
        //     {
        //         System.out.printf("\u001B[31m%2d\t\u001B[0m", i);
        //     }
        //     else
        //     {
        //         System.out.printf("%2d\t", i);
        //     }
        //     week++;
        //     if (week > 6)
        //     {
        //         week = 0;
        //         System.out.println();
        //     }
        // }
        
        final int level = 3;
        
        Scanner scanner = new Scanner(System.in);
        int[] inputNumber = new int[level];
        int[] randomNumber = new int[level];

        // 중복 없는 랜덤 숫자 생성
        while (true)
        {
            int random = (int)(Math.random() * 900) + 100;
            randomNumber = Decomposition(random);

            if (!CheckDuplicate(randomNumber))
            {
                break;
            }
        }

        int correctCount = randomNumber.length;
        // 실행
        while(true)
        {
            System.out.print("숫자 세개를 입력하세요 : ");
            int input = scanner.nextInt();
            // 3자리 확인
            if (NumberCount(input) != 3)
            {
                System.out.println("세자리 숫자를 입력하세요.");
                continue;
            }

            // 자리 수 쪼개기
            inputNumber = Decomposition(input);

            // 중복 확인
            if (CheckDuplicate(inputNumber))
            {
                System.out.println("중복된 숫자가 있습니다.");
                continue;
            }

            // 정답 검사
            int strike = 0;
            int ball = 0;
            for (int i = 0; i < inputNumber.length; i++)
            {
                for (int j = 0; j < randomNumber.length; j++)
                {
                    if (inputNumber[i] == randomNumber[j])
                    {
                        if (i == j)
                        {
                            strike++;
                        }
                        else
                        {
                            ball++;
                        }
                        break;
                    }
                }
            }

            System.out.println(ColorConsole.GREEN + strike + " STRIKE! " +
                                ColorConsole.YELLOW + ball + " BALL!" + ColorConsole.RESET);

            if (strike == correctCount)
            {
                System.out.println(ColorConsole.RED + "GAME CLEAR!!" + ColorConsole.RESET);
                break;
            }
        }
    }

    // arr배열의 중복 숫자 확인
    public static boolean CheckDuplicate(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    return true;
                }
            }
        }
        return false;
    }

    // num을 각 자리수 마다 배열로 변환
    public static int[] Decomposition(int num)
    {
        int count = NumberCount(num);
        int[] arr = new int[count];
        for (int i = num; i > 0; i /= 10)
        {
            arr[count - 1] = i % 10;
            count--;
        }
        return arr;
    }

    // number의 자리수를 return
    public static int NumberCount(int number)
    {
        return String.valueOf(number).length();
    }

}

class ColorConsole
{
    static final String RESET = "\u001B[0m";
    static final String RED = "\u001B[31m";
    static final String GREEN = "\u001B[32m";
    static final String YELLOW = "\u001B[33m";
    static final String BLUE = "\u001B[34m";
}

// class Student
// {
//     String name;
//     int age;
//     double tall;
//     double weight;

//     Student(String name, int age, double tall, double weight)
//     {
//         this.name = name;
//         this.age = age;
//         this.tall = tall;
//         this.weight = weight;
//     }
// }