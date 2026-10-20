package Day;

import java.io.IOException;

import javax.swing.*;
import javax.swing.text.html.parser.Element;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Day7
{
    public static void main(String[] args) throws IOException
    {
        // String s = "Hello java";
        // System.out.println(s.replace('a', 'b'));
        // System.out.println(s);
        // s값은 바뀌지 않는다 => 불변
        
        // String 'Class' -> char[]을 제어
        // 변경해서 사용 불가능, 제공한 내용을 사용, 표준화, final class
        // 같은 문자열은 주소가 동일하다.
        // 새로운 메모리 공간 => new String
        // String s(변수, 스택) = "Hello"(리터럴, 힙);
        // 기능 : 메소드(리턴형, 매개변수)
        // charAt(int) => int index의 문자(char)를 추출
        // length() => 문자의 갯수(int)
        // equals(String) 동일 / contains(String) 포함된 문자열 / startsWith(String) 시작하는 문자열 같은 경우 / endsWith(String) 끝 문자열 같은 경우 => boolean
        // equalsIgnoreCase(String) 대소문자 구분없이 동일
        
        // String msg = "Hello Java!!";
        // System.out.println("문자 갯수 : " + msg.length());;

        // int count = 0;
        // for (int i = 0; i < msg.length(); i++)
        // {
        //     //System.out.println(i + ". " + msg.charAt(i));
        //     char c = msg.charAt(i);
        //     if (c == 'a' || c == 'A')
        //     {
        //         count++;
        //     }
        // }
        // System.out.println("a, A의 갯수 : " + count);

        // String myId = "hong";
        // String myPwd = "1234";

        // String id = JOptionPane.showInputDialog("아이디 입력 : ");
        // String pwd = JOptionPane.showInputDialog("비밀번호 입력 : ");
        
        // if (id.equalsIgnoreCase(myId) && pwd.equals(myPwd))
        // {
        //     JOptionPane.showMessageDialog(null, "로그인 되었습니다.");
        // }
        // else
        // {
        //     JOptionPane.showMessageDialog(null, "아이디나 비밀번호가 일치하지 않습니다.");
        // }

        // java.lang 컴파일 시 자동 실행 생략 가능

        // https://www.genie.co.kr/chart/top200?ditc=D&ymd=20261020&hh=14&rtm=Y&pg=1
        // 웹 연결
        // String fd = JOptionPane.showInputDialog("검색어 입력 : ");
        // for (int i = 0; i < 5; i++)
        // {
        //     Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20261020&hh=14&rtm=Y&pg="+i).get();
        //     // 제목
        //     Elements title = doc.select("table.list-wrap a.title");
        //     // 가수명
        //     Elements artist = doc.select("table.list-wrap a.artist");

        //     for (int j = 0; j < title.size(); j++)
        //     {   
        //         // if (title.get(j).text().contains(fd))
        //         // {
        //         //     System.out.println(
        //         //         title.get(j).text() + "(" + artist.get(j).text() + ")");
        //         // }

        //         if (title.get(j).text().startsWith(fd))
        //         {
        //             System.out.println(
        //                 title.get(j).text() + "(" + artist.get(j).text() + ")");
        //         }
        //     }
        // }

        // toUpperCase() 대문자 변환 / toLowerCase() 소문자 변환
        // replace() 문자, 문자열 변경 / relaceAll() 문자, 문자열 변경
        
        // String s = "ABCD가나다라1234";
        // System.out.println(s.replaceAll("[가-힣]", ""));
        // System.out.println(s.replaceAll("[A-Z]", ""));
        // System.out.println(s.replaceAll("[0-9]", ""));
        // System.out.println(s.replaceAll("[^가-힣]", ""));

        // substring(int) / substring(int, int)
        // indexof(찾는 문자 String) => 앞에서부터 찾기(int) / lastIndexOf(찾는 문자 String) => 뒤에서부터 찾기(int)
        String msg = "Hello Java!!";
        System.out.println(msg.substring(6));
        System.out.println(msg.substring(0, 5));

        String s = "자바.java";
        System.out.println(s.substring(s.indexOf(".") + 1));

        String path = "c:\\javaDev\\MainClass.java";
        System.out.println(path.substring(path.lastIndexOf("\\") + 1));
        

    }

}
