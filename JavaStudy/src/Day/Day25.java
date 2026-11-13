package Day;

import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Day25
{
    public static void main(String[] args)
    {
        // Collection
        // 데이터 묶어서 분류 후에 쉽게 관리 할 수 있게 만든 클래스의 집합
        // 자료구조 (메모리에서 관리 => CRUD)
        // Vector : 유지보수용 (예전 개발)
        // 동기적 => 네트워크 접속자 관리
        // ArrayList와 비슷한 배열 기반 구조
        // Vector 보완 => ArrayList
        // 주요 메소드가 동기화 되어있다.
        // ArrayList보다 성능이 낮다
        // LinkedList
        // 저장되는 내용이 많아서 메모리가 비대 단점
        // 수정, 삭제 많은 경우 => 속도가 빠르다
        // 인덱스를 이용해서 조회(검색) => 속도가 늦다
        // 사용처 : 큐 / 데크 / 스택

        // Vector
        // 배열기반(ArrayList와 거의 동일)
        // 메소드가 동기화되어 있다
        // 성능에 부담
        // 동시성 제어
        // Vector<String> names = new Vector<>();
        // names.addElement("홍길동");
        // names.addElement("심청이");
        // System.out.println("인원 : " + names.size());
        // for (String name : names)
        // {
        //     System.out.println(name);
        // }
        // names.removeElementAt(0);
        // for (String name : names)
        // {
        //     System.out.println(name);
        // }
        // names.setElementAt("춘향이", 0);
        // for (String name : names)
        // {
        //     System.out.println(name);
        // }
        // names.removeAllElements();
        // System.out.println("인원 : " + names.size());

        // LinkedList
        // 중간에 추가, 삭제가 많은 경우
        // 인덱스를 이용해서 검색 : ArrayList보다 속도가 느리다
        // Queue 사용 시 사용
        // LinkedList<Integer> linkedList = new LinkedList<>();
        // linkedList.add(1);
        // linkedList.add(2);
        // linkedList.add(3);
        // System.out.println("갯수 : " + linkedList.size());
        // for(int i : linkedList)
        // {
        //     System.out.println(i);
        // }
        // linkedList.add(4);
        // linkedList.add(2, 5);
        // linkedList.remove();
        // for(int i : linkedList)
        // {
        //     System.out.println(i);
        // }
        // linkedList.set(0, 100);
        // for(int i : linkedList)
        // {
        //     System.out.println(i);
        // }
        // linkedList.clear();
        // for(int i : linkedList)
        // {
        //     System.out.println(i);
        // }

        // String[] names = { "홍길동", "이순신", "박문수", "심청이", "춘향이" };
        // List<String> list = new ArrayList<>();
        // list = Arrays.asList(names);
        // for(String str : list)
        // {
        //     System.out.println(str);
        // }

        System.out.println("===== 지니 뮤직 =====");
        ArrayList<String> aList = new Day25().genieData();
        for (int i = 0 ; i < aList.size(); i++)
        {
            System.out.println((i + 1) + ". " + aList.get(i));
        }
        
        System.out.println("===== 멜론 뮤직 =====");
        aList = new Day25().melonData();
        for (int i = 0 ; i < aList.size(); i++)
        {
            System.out.println((i + 1) + ". " + aList.get(i));
        }

    }
    
    public ArrayList<String> genieData()
    {
        ArrayList<String> aList = new ArrayList<>();
        try
        {
            Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
            Elements title = doc.select("table.list-wrap a.title");
            for(int i = 0 ; i < title.size(); i++)
            {
                aList.add(title.get(i).text());
            }
        } 
        catch (Exception ex)
        {
            
        }
        return aList;
    }
    
    public ArrayList<String> melonData()
    {
        ArrayList<String> aList = new ArrayList<>();
        try
        {
            Document doc = Jsoup.connect("https://www.melon.com/chart/index.htm").get();
            Elements title = doc.select("tr#lst50 div.rank01 a");
            for(int i = 0 ; i < title.size(); i++)
            {
                aList.add(title.get(i).text());
            }
        } 
        catch (Exception ex)
        {
            
        }
        return aList;
    }
}
