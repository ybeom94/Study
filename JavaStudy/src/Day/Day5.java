import java.io.IOException;
import java.util.Scanner;

public class Day5
{
    public static void main(String[] args) throws IOException
    {
        // //랜덤한 숫자 3개중 최솟값 최댓값을 출력하는 코드
        // int num1 = (int)(Math.random() * 100) + 1;
        // int num2 = (int)(Math.random() * 100) + 1;
        // int num3 = (int)(Math.random() * 100) + 1;

        // System.out.println("랜덤한 숫자 3개: " + num1 + ", " + num2 + ", " + num3);

        // int min = num1;
        // if (num2 < min)
        // {
        //     min = num2;
        // }       
        // if (num3 < min)
        // {
        //     min = num3;
        // }

        // int max = num1;
        // if (num2 > max)
        // {
        //     max = num2;
        // }
        // if (num3 > max)
        // {
        //     max = num3;
        // }

        // System.out.println("최솟값: " + min);
        // System.out.println("최댓값: " + max);



        // Scanner scanner = new Scanner(System.in);
        
        // System.out.print("원하는 사이트를 선택하세요 (1: Google, 2: Naver, 3: Daum): ");
        // int choice = scanner.nextInt();

        // String path = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe ";
        // String url = "";
        // switch (choice)
        // {
        //     case 1:
        //         url += "https://www.google.com";
        //         break;
        //     case 2:
        //         url += "https://www.naver.com";
        //         break;
        //     case 3:
        //         url += "https://www.daum.net";
        //         break;
        //     default:
        //         System.out.println("잘못된 선택입니다.");
        //         return;
        // }
        // Runtime.getRuntime().exec(new String[]{path, url});



    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("첫번째 정수를 입력하세요: ");
    //     int num = scanner.nextInt();
    //     System.out.print("두번째 정수를 입력하세요: ");
    //     int num2 = scanner.nextInt();
    //     System.out.print("사칙연산을 입력하세요 (+, -, *, /): ");
    //     String operator = scanner.next();

    //     if (operator.contains("+"))
    //     {
    //         System.out.println(num + " + " + num2 + " = " + (num + num2));
    //     }
    //     else if (operator.contains("-"))
    //     {
    //         System.out.println(num + " - " + num2 + " = " + (num - num2));
    //     }
    //     else if (operator.contains("*"))
    //     {
    //         System.out.println(num + " * " + num2 + " = " + (num * num2));
    //     }
    //     else if (operator.contains("/"))
    //     {
    //         if (num2 == 0)
    //         {
    //             System.out.println("0으로 나눌 수 없습니다.");
    //         }
    //         else
    //         {
    //             System.out.println(num + " / " + num2 + String.format(" = %.2f", (double)num / num2));
    //         }
    //     }
    //     else
    //     {
    //         System.out.println("잘못된 연산자입니다.");
    //     }

        // int month = (int)(Math.random() * 12) + 1;
        // switch (month)
        // {
        //     case 1: case 2: case 12:
        //         System.out.println(month + "월은 겨울입니다.");
        //         break;
        //     case 3: case 4: case 5:
        //         System.out.println(month + "월은 봄입니다.");
        //         break;
        //     case 6: case 7: case 8:
        //         System.out.println(month + "월은 여름입니다.");
        //         break;
        //     case 9: case 10: case 11:
        //         System.out.println(month + "월은 가을입니다.");
        //         break;
        //     default:
        //         System.out.println("잘못된 월입니다.");
        // }

        // switch (month)
        // {
        //     case 12, 1, 2 -> System.out.println(month + "월은 겨울입니다.");
        //     case 3, 4, 5 -> System.out.println(month + "월은 봄입니다.");
        //     case 6, 7, 8 -> System.out.println(month + "월은 여름입니다.");
        //     case 9, 10, 11 -> System.out.println(month + "월은 가을입니다.");
        //     default -> System.out.println("잘못된 월입니다.");
        // }


        // 1~10까지 랜덤한 숫자 1000번 뽑아내서 각 숫자가 몇번씩 나왔는지 확인하는 코드
        // int[] count = new int[10];
        // for (int i = 0; i < 1000000; i++)
        // {
        //     int num = (int)(Math.random() * 10) + 1;
        //     count[num - 1]++;
        // }

        // for (int i = 0; i < 10; i++)
        // {
        //     System.out.println((i + 1) + "이 나온 횟수: " + count[i]);
        // }

        

    }
}
