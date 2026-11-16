package Day;

import java.util.*;

public class Day26
{
    public static void main(String[] args)
    {
        // HashSet<String> set = new HashSet<>();
        // set.add("사과");
        // set.add("딸기");
        // set.add("수박");
        // set.add("사과");
        // set.add("참외");
        // set.add("사과");
        // for(String str : set)
        // {
        //     System.out.println(str);
        // }
        // set.remove("수박");
        // set.clear();

        // Set<> set = new HashSet();
        // set = new TreeSet();
        // List<> list = new ArrayList();
        // => 메소드를 통일 할 수 있다.

        // Set<Integer> set = new HashSet<>();
        // List<Integer> list = new ArrayList<>();
        // Random rand = new Random();
        // for (int i = 0; i < 10; i++)
        // {
        //     int r = rand.nextInt(10                                                        ) + 1;
        //     set.add(r);
        //     list.add(r);
        // }
        // System.out.println("Set Size : " + set.size());
        // System.out.println("List Size : " + list.size());

        // String[] names = { "홍길동", "심청이", "이순신", "강감찬", "김두한", "홍길동", "심청이" };
        // List<String> list = Arrays.asList(names);
        // System.out.println("========== 전체 회원 목록 ==========");
        // for (String name : list)
        // {
        //     System.out.println(name);
        // }
        // System.out.println("========== 중복 제거 ==========");
        // Set<String> set = new HashSet<>();
        // set.addAll(list);
        // System.out.println("========== 전체 회원 목록 ==========");
        // for (String name : set)
        // {
        //     System.out.println(name);
        // }
        // List<String> list2 = new ArrayList<>();
        // list2.addAll(set);
        // System.out.println("========== 전체 회원 목록 ==========");
        // for (String name : list2)
        // {
        //     System.out.println(name);
        // }
        // Set => 중복 제거
        // List 제어하기 좋음, index 사용

        // Set<Integer> set = new HashSet<>();
        // Random rand = new Random();
        // for (int i = 0; i < 10; i++)
        // {
        //     int r = rand.nextInt(100) + 1;
        //     set.add(r);
        // }
        // TreeSet<Integer> tSet = new TreeSet<>();
        // tSet.addAll(set);

        // System.out.println("========== 전체 데이터 ==========");
        // for (int i : tSet)
        // {
        //     System.out.print(i + " ");
        // }
        // System.out.println("\n========== 50 이상 ==========");
        // System.out.println(tSet.tailSet(50));
        // System.out.println("========== 50 이하 ==========");
        // System.out.println(tSet.headSet(50));
        // System.out.println("========== 바로 위에 값 ==========");
        // System.out.println(tSet.higher(30));
        // System.out.println("========== 바로 밑에 있는 값 ==========");
        // System.out.println(tSet.lower(30));
        // System.out.println("========== 같거나 큰 값 ==========");
        // System.out.println(tSet.ceiling(30));
        // System.out.println("========== 같거나 작은 값 ==========");
        // System.out.println(tSet.floor(30));
        // System.out.println(tSet.first());
        // System.out.println(tSet.last());

        // Map : Interface
        // => HashMap / 비동기
        // => Hashtable / 레거시 => 동기화
        // 두개를 동시에 저장 / key, value
        // key => 중복 없는 값
        // Map<String, Object>
        // key가 중복되면 저장이 안된다
        // map.put("id", "admin")
        // map.put("id", "shim") => X
        // 저장 put(키, 값) / 읽기 get(키)

        // Map<String, String> map = new HashMap<>();
        // map.put("id", "admin");
        // map.put("password", "1234");
        // map.put("name", "홍길동");
        // map.put("age", "38");
        // map.put("gender", "남자");
        // map.put("id", "hong"); // 덮어 쓰기
        // System.out.println("ID : " + map.get("id"));
        // System.out.println("Password : " + map.get("password"));
        // System.out.println("===== 키만 가져오기 =====");
        // Set<String> set = map.keySet();
        // System.out.println(set);
        // for (String key : set)
        // {
        //     System.out.println(key + " : " + map.get(key));
        // }
        // clear() : 전체 삭제
        // get(String key) : 값 읽기
        // put() : 저장
        // isEmpty() : 존재 여부
        // size() : 갯수
        // keySet() : key전체 읽기
        // values() : 실제 저장된 데이터

        // Map<String, String> map = new HashMap<>();
        // map.put("boardList", "SELECT * FROM board");
        // map.put("boardDetail", "SELECT * FROM board WHERE no=1");
        // map.put("boardInsert", "INSERT INTO board VALUES(?,?,?,?,?)");
        // map.put("boardUpdate", "Update board SET name='");
        // map.put("boardDelete", "DELETE FROM board WHERE no=1");
        // Set<String> set = map.keySet();
        // for (String key : set)
        // {
        //     System.out.println(key + " : " + map.get(key));
        // }

        // Container container = new Container();
        // I i = container.getBean("a");
        // i.execute();
        // i = container.getBean("b");
        // i.execute();
        // i = container.getBean("c");
        // i.execute();

        // Collections : Collection을 제어하는 클래스
        // Arrays : 배열을 제어하는 클래스
        // 모아서 출력 Interator / ListIterator
        // => ArrayList / HashMap / HashSet

        // List<Integer> list = new ArrayList<>();
        // for (int i = 0; i < 10; i++)
        // {
        //     int a = (int) (Math.random() * 10) + 1;
        //     list.add(a);
        // }
        // System.out.println("===== 목록 출력 =====");
        // System.out.println(list);
        // Collections.sort(list); // Arrays.sort()
        // System.out.println("===== 정렬 후 =====");
        // System.out.println(list);

        // List<String> list2 = new ArrayList<>();
        // list2.add("홍길동");
        // list2.add("심청이");
        // list2.add("강감찬");
        // list2.add("이순신");
        // Collections.sort(list2);
        // System.out.println(list2);

        // List<String> list = new ArrayList<>();
        // list.add("사과");
        // list.add("배");
        // list.add("수박");
        // list.add("바나나");
        // Iterator<String> iter = list.iterator();
        // while(iter.hasNext())
        // {
        //     String f = iter.next();
        //     if (f.equals("수박"))
        //     {
        //         iter.remove();
        //     }
        //     System.out.println(f);
        // }

        // Set<String> set = new HashSet<>();
        // set.add("사과");
        // set.add("배");
        // set.add("포도");
        // set.add("바나나");
        // Iterator<String> iter = set.iterator();
        // while(iter.hasNext())
        // {
        //     System.out.println(iter.next());
        // }

        // ListIterator
        // 앞뒤 방향에서 이동 가능
        // 반복중에 데이터 추가, 수정, 삭제가 가능
        // List에서만 사용

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // for (int i = 0; i < list.size(); i++)
        // {
        //     list.remove(4); // 오류
        // }
        // ListIterator<Integer> iter = list.listIterator();
        // while(iter.hasNext())
        // {
        //     int num = iter.next();
        //     if (num < 3)
        //     {
        //         iter.remove();
        //     }
        // }
        // System.out.println(list);
        // while(iter.hasPrevious())
        // {
        //     System.out.println(iter.previous());
        // }

        // Map<String, Integer> map = new HashMap<>();
        // map.put("사과", 100);
        // map.put("배", 200);
        // map.put("바나나", 150);
        // map.put("포도", 180);
        // System.out.println("사과 갯수 : " + map.get("사과"));
        // System.out.println("전체 데이터 : " + map);
        // if (map.containsKey("바나나"))
        // {
        //     System.out.println("바나나 있음.");
        // }
        // for (String key : map.keySet())
        // {
        //     System.out.println(key + " : " + map.get(key));
        // }
        // for (int val : map.values())
        // {
        //     System.out.println(val);
        // }
        // for (Map.Entry<String, Integer> e : map.entrySet())
        // {
        //     System.out.println(e.getKey() + " : " + e.getValue());
        // }

        // Queue
        // FIFO => LinkedList => 네트워크 / 운영체제
        // Queue<String> q = new LinkedList<>();
        // q.offer("홍길동");
        // q.offer("이순신");
        // q.offer("강감찬");
        // System.out.println(q.peek()); // 맨 앞에 있는 데이터
        // System.out.println(q.poll()); // 데이터 꺼내기 => 데이터가 없어진다.
        // System.out.println(q.poll());
        // System.out.println(q.poll());

        // Stack<String> s = new Stack<>();
        // s.push("홍길동");
        // s.push("이순신");
        // s.push("강감찬");
        // System.out.println(s.peek());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());

        // Thread => 한개의 프로그램안에 여러개의 기능이 동시에 수행
        // 사용자 정의 쓰레드
        // 1. 쓰레드 상속
        // class MyThread extends Thread
        // { 자원 공유 / 반드시 처리 / public void run(){ 쓰레드 작업 내용 => 한가지일만 수행 } }
        // 2. 인터페이스
        // class MyThread implements Runnable
        // { public void run(){ 쓰레드 작업 내용 => 한가지일만 수행 } }
        // 3. 익명의 함수
        // new Runnable() -> { }
        // 4. 쓰레드 생명 주기
        // new Thread() 쓰레드 생성 => start() 대기 쓰레드에 필요한 자원 확보
        // => run() 쓰레드 동작 => sleep(), wait 일시정지 / join(), interrupt() 쓰레드 소멸
        // 5. 동작 방식
        // => 비동기화(여러가지 일을 동시에 처리) / 동기화(한번씩 수행)
        // 6. 주요 메서드
        // start() : 대기상태 / run() : 쓰레드동작 / sleep() : 일시정지 / interrupt() : 쓰레드 종료 / 
        // currentThread() : 현재 실행중인 Thread의 이름 / getName(), setName() : 쓰레드 이름 /
        // getPriority(), setPriority() : 우선 순위 결정(1~10) / wait(), join() : 모든 쓰레드 종료
    
    
    
    }
}

class Container
{
    Map<String, I> map = new HashMap<>();
    public Container()
    {
        map.put("a", new A26());
        map.put("b", new B26());
        map.put("c", new C26());
    }

    public I getBean(String key)
    {
        return map.get(key);
    }
}

interface I
{
    public void execute();
}
class A26 implements I
{
    @Override
    public void execute()
    {
        System.out.println("A:execute() Call...");
    }
}
class B26 implements I
{
    @Override
    public void execute()
    {
        System.out.println("B:execute() Call...");
    }
}
class C26 implements I
{
    @Override
    public void execute()
    {
        System.out.println("C:execute() Call...");
    }
}