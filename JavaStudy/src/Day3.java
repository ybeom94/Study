// DB
// 오라클 : 데이터 영구 저장

// 브라우저 실행
// HTML : 웹페이지를 만들기 위한 언어
// CSS : 웹페이지를 꾸미기 위한 언어
// JavaScript : 웹페이지에 동적인 기능을 추가하기 위한 언어
// JQuery : JavaScript를 쉽게 사용할 수 있도록 도와주는 라이브러리
// Vue3 : JavaScript 프레임워크
// React : JavaScript 프레임워크
// JSP : Java를 이용하여 웹페이지를 만들기 위한 기술

// 실무
// Spring Boot : Java를 이용하여 웹페이지를 만들기 위한 프레임워크
// Spring Security : Spring Boot에서 보안을 담당하는 프레임워크
// WebSocket : Spring Boot에서 실시간 통신을 담당하는 기술
// CI/CD : 지속적인 통합 / 지속적인 배포 (우분투, Docker, Jenkins)
// AWS : EC2(서버), S3(파일 저장)

import java.util.Arrays;

public class Day3
{
    public static void main(String[] args)
    {
        System.out.println("\"홍길동\""); // => "홍길동"
        System.out.println("c:\\Users\\sist\\Desktop"); // => c:\Users\sist\Desktop

        //배열
        int[] arr = new int[10];
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random() * 10) + 1;
            if (arr[i] == 5)
            {
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
        
        //정수 두개 받아서 사칙연산 결과 띄워주기
        // Scanner scanner = new Scanner(System.in);
        // int a = scanner.nextInt();
        // int b = scanner.nextInt();
        // System.out.println("덧셈: " + (a + b));
        // System.out.println("뺄셈: " + (a - b));
        // System.out.println("곱셈: " + (a * b));
        // System.out.println("나눗셈: " + (a / b));

        // int a = 10;
        // int b = 3;
        // //a를 b로 나눠서 소수점 두자리 수 까지 출력
        // System.out.printf("%.2f\n", (double)a / b);

        // //국어, 영어, 수학 점수를 차례대로 입력받는 코드
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("국어 점수: ");
        // int korean = scanner.nextInt();
        // System.out.print("영어 점수: ");
        // int english = scanner.nextInt();
        // System.out.print("수학 점수: ");
        // int math = scanner.nextInt();
        // System.out.println("총점: " + (korean + english + math));

        // //소수점 두자리 수까지 평균 출력
        // System.out.printf("평균: %.2f\n", (korean + english + math) / 3.0);

        int a= 10;
        int b = 0;
        System.out.println((b == 0 ? "0으로 나눌 수 없습니다" : (double)a / b));


        
        
    }    

}
