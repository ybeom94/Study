package Day;

import java.io.FileInputStream;
import java.io.FileReader;
import java.security.interfaces.XECKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

public class Day6
{
    public static void main(String[] args) throws Exception
    {
        // System.out.println("---대문자---");
        // for(char c = 'A'; c <= 'Z'; c++)
        // {
        //     System.out.print(c + " ");
        // }

        // System.out.println("\n---소문자---");
        // for(char c = 'a'; c <= 'z'; c++)
        // {
        //     System.out.print(c + " ");
        // }

        // System.out.println("\n---대문자 내림차순---");
        // for(char c = 'Z'; c >= 'A'; c--)
        // {
        //     System.out.print(c + " ");
        // }

        // System.out.println("\n---소문자 내림차순---");
        // for(char c = 'z'; c >= 'a'; c--)
        // {
        //     System.out.print(c + " ");
        // }

        // System.out.println("\n---1~10까지 출력---");
        // for(int i = 1; i <= 10; i++)
        // {
        //     System.out.print(i + " ");
        // }

        // System.out.println("\n---1~10까지 출력(짝수)---");
        // for(int i = 2; i <= 10; i+=2)
        // {
        //     System.out.print(i + " ");
        // }

        // System.out.println("\n---1~10까지 출력(홀수)---");
        // for(int i = 1; i <= 10; i+=2)
        // {
        //     System.out.print(i + " ");
        // }


        //1~100까지 합
        // int sum = 0;
        // for (int i = 1; i <= 100; i++)
        // {
        //     sum += i;
        // }
        // System.out.println("1~100까지의 합: " + sum);

        // Scanner sc = new Scanner(System.in);
        // System.out.print("정수를 입력하세요(2~9) : ");
        // int num = sc.nextInt();
        // System.out.println(num + "단");
        // for (int i = 1; i <= 9; i++)
        // {
        //     System.out.println(num + " * " + i + " = " + (num * i));
        // }


        //업다운
        // Scanner sc = new Scanner(System.in);
        // int answer = (int)(Math.random() * 100) + 1;
        // for (;;)
        // {
        //     System.out.print("1~100 사이의 숫자를 입력하세요: ");
        //     int guess = sc.nextInt();
        //     if (guess < 1 || guess > 100)
        //     {
        //         System.out.println("1~100 사이의 숫자를 입력하세요.");
        //         continue;
        //     }

        //     if (guess < answer)
        //     {
        //         System.out.println("UP");
        //     }
        //     else if (guess > answer)
        //     {
        //         System.out.println("DOWN");
        //     }
        //     else
        //     {
        //         System.out.println("정답입니다!");
        //         break;
        //     }
        // }

        //Thread.sleep(1000); -> **throws Exception**

        // for (int i = 5; i <=50; i+=5)
        // {
        //     System.out.print(i + " ");
        // }


        // FileReader reader = new FileReader("C:\\Users\\sist\\git\\Study\\JavaStudy\\src\\Day\\Day6");

        // int i = 0;
        // while ((i = reader.read())!= -1)
        // {
        //     System.out.print((char)i);
        // }

        // db.properties
        // url=jdbc:oracle:thin:@211.238.142.40:1521:XE
        // user=hr
        // pwd=happy

        // Properties prop = new Properties();
        // FileInputStream fis = new FileInputStream("c:\\javaDev\\db.properties");

        // prop.load(fis);
        // System.out.println("url : "+ prop.getProperty("url"));
        // System.out.println("user : " + prop.getProperty("user"));
        // System.out.println("pwd : " + prop.getProperty("pwd"));
        // Class.forName("oracle.jdbc.driver.OracleDriver");
        // Connection conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"), prop.getProperty("pwd"));

        // String sql = "SELECT name,type,time " + "FROM member";
        // PreparedStatement ps = conn.prepareStatement(sql);
        // ResultSet rs = ps.executeQuery();
        // while(rs.next())
        // {
        //     System.out.println(rs.getString(1)+ " " + rs.getString(2) + " " + rs.getString(3));
        // }

        // char c = 'A';
        // do
        // {
        //     System.out.print(c + " ");
        //     c++;
        // } while(c <= 'Z');


        // 갯수를 아는 경우에 주로 사용
        System.out.println("=====for=====");
        for (int i = 1; i <= 10; i++)
        {
            System.out.print(i + " ");
        }
        
        // 갯수를 모르는 경우
        System.out.println("\n=====while=====");
        int i = 1;
        while (i <= 10)
        {
            System.out.print(i + " ");
            i++;
        }
        
        // 반드시 한번은 수행
        System.out.println("\n=====do~while=====");
        i = 1;
        do
        {
            System.out.print(i + " ");
            i++;
        } while(i <= 10);
    }
}
