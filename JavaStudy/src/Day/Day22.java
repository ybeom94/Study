package Day;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Day22
{
    public static void main(String[] args)
    {
        // Math : 모든 메소드가 static
        // ceil 올림(페이지), random(0.0 ~ 0.99), round(반올림)
        
        // try
        // {
        //     // // 1.오라클 연결 => driver 설정
        //     // Class.forName("oracle.jdbc.OracleDriver"); // 자동으로 메모리 할당 => 리플렉션
        //     // // 2.연결
        //     // String url = "jdbc:oracle:thin:@xxx.xxx.xxx.xx:xxxx:XE";
        //     // Connection conn = DriverManager.getConnection(url, "hr", "happy");
        //     // // 3.오라클 명령어 전송
        //     // String sql = "SELECT COUNT(*) FROM recipe";
        //     // PreparedStatement pStatement = conn.prepareStatement(sql); // 네트워크 통신
        //     // ResultSet rSet = pStatement.executeQuery();
        //     // rSet.next();
        //     // int count = rSet.getInt(1);
        //     // rSet.close();
        //     // pStatement.close();
        //     // conn.close();

        //     // System.out.println("레시피의 갯수 : " + count);

        //     // // 10개씩 1페이지
        //     // int totalPage = (int)(Math.ceil(count / 10.0));
        //     // // ceil => 10.1 => 11
        //     // System.out.println("총 페이지 : " + totalPage);

        //     // double round = Math.round(10.4);
        //     // System.out.println(round);

        //     int a = 10;
        //     int b = 20;
        //     int c = Math.max(a, b);
        //     int d = Math.min(a, b);
        //     int e = -1;
        //     int f = Math.abs(e);
        //     System.out.println("c : " + c);
        //     System.out.println("d : " + d);
        //     System.out.println("f : " + f);
        // }
        // catch(Exception ex)
        // {
        //     ex.printStackTrace();
        // }

        // int a = 10;
        // int b = 20;
        // int c = Math.max(a, b);
        // int d = Math.min(a, b);
        // int e = -1;
        // int f = Math.abs(e);
        // System.out.println("c : " + c);
        // System.out.println("d : " + d);
        // System.out.println("f : " + f);

        // StringBuffer 문자열 비동기화
        // String과 동일 => 문자열 결합 속도가 빠르다.
        // StringBuffer sBuffer = new StringBuffer() / sBuffer.append()...

        // try
        // {
        //     URI uri = URI.create("https://www.10000recipe.com/recipe/list");
        //     URL url = uri.toURL();

        //     HttpURLConnection conn = (HttpURLConnection)url.openConnection();

        //     StringBuffer sBuffer = new StringBuffer();
        //     if (conn != null)
        //     {
        //         BufferedReader bReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        //         long start = System.currentTimeMillis();
        //         while (true)
        //         {
        //             String str = bReader.readLine();
        //             if (str == null)
        //                 break;
        //             sBuffer.append(str + "\n");
        //         }
        //         long end = System.currentTimeMillis();
        //         System.out.println("걸린 시간 : " + (end - start) + "MS");;
        //         System.out.println(sBuffer.toString());
        //     }
        // }
        // catch(Exception ex)
        // {

        // }

        // Wrapper
        // 형변환 => 기본형으로 형변환
        // 정수변환 : Integer.parseInt("10")
        // 실수변환 : Double.parseDouble("10.5")
        // 논리변환 : Boolean.paseBoolean("true")

        // String[] str = {"100", "20", "1", "5", null};
        // for (String s : str)
        // {
        //     if (s != null)
        //     {
        //         int a = Integer.parseInt(s);
        //         System.out.println(a);
        //     }
        // }

        // java.text.* 패키지
        // SimpleDataFormat : 날짜 변경 => new SimpleDataFormat("yyyy-MM-dd")
        // MessageFormat : 데이터베이스, 화면출력 => 서식
        // ChoiceFormat : switch 대신 사용 가능
        // DecimalFormat : 숫자 변경, 1,000

        // Date date = new Date();
        // System.out.println(date);
        // SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        // System.out.println(dateFormat.format(date));
        
        // DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
        // int won = 100000;
        // System.out.println(decimalFormat.format(won) + "원");

        // int no = 1;
        // String name = "홍길동";
        // String gender = "남자";
        // String address = "서울";
        // String phone = "010-1234-1234";
        // int age = 30;
        // String content = "홍길동 입니다.";

        // // 오라클에 저장
        // String sql = "INSERT INTO member VALUES(" + no + ",'" + name + "','" + gender + "','"
        //                                         + address + "','" + phone + "'," + age + ",'" + content + "')";
        // System.out.println(sql);
        // sql = "INSERT INTO member VALUES(" + "{0},''{1}'',''{2},''{3},''{4}'',{5},''{6}'')";
        // Object[] obj = {no, name, gender, address, phone, age, content};
        // System.out.println(MessageFormat.format(sql, obj));

        // double[] limits = {0, 60, 70, 80, 90};
        // String[] formats = {"F", "D", "C", "B", "A"};
        // ChoiceFormat choiceFormat = new ChoiceFormat(limits, formats);
        // System.out.println(choiceFormat.format(85));
        
        // double num = 1234567.89;
        // NumberFormat numberFormat = NumberFormat.getInstance();
        // // new를 사용하지 않는 경우 => 인터페이스/ 추상클래스
        // // 미완성 클래스 => new를 사용해서 메모리 할당이 안된다
        // System.out.println(numberFormat.format(num));

        // numberFormat = NumberFormat.getCurrencyInstance();
        // System.out.println(numberFormat.format(num));

        // numberFormat = NumberFormat.getPercentInstance();
        // System.out.println(numberFormat.format(0.25));

        // NumberFormat : 숫자 형식 변경 / 천단위 구분, 통화, 백분율
        // *DecimalFormat : 숫자 패턴 변경 / 천단위 구분
        // *SimpleDataFormat : 날짜 형식 변경 / 날짜 / 시간
        // MessageFormat : 문자열 형식 변경 / 데이터값 추가가 많은 경우
        // ChoiceFormat : 조건별 문자열 선택 / 등급, 점수별
        // 전체 : TO_CHAR()

        // 리플렉션 => 동적 제어, 현재 실행중인 프로그램을 제어
        // 1.클래스, 2.변수(멤버변수) 3.생성자 4.메소드
        // 클래스 이름으로 제어, 패키지명부터 성정
        // Class.forName(""); 등록 => 메소드 호출, 변수값 변경, private 접근이 가능(보안)
        // 객체 생성 : new를 사용하지 않고 생성이 가능
        // 객체 생성 / 멤버변수 / 메소드 호출 => 자동화 처리

        // try
        // {
        //     // 객체 생성
        //     Class className = Class.forName("Sawon");
        //     // 클래스 정보 확인
        //     Constructor<Object> cons = className.getConstructor(null);
        //     // 메모리 할당
        //     Object obj = cons.newInstance();
        //     // 메소드 정보
        //     Method method = className.getMethod("info");
        //     Method[] methods = className.getDeclaredMethods();
        //     // Field 읽기 => 인스턴스 변수
        //     Field field = className.getDeclaredField("name");
        //     field.setAccessible(true); // private 변수에 접근이 가능하게 만든다.
        //     field.set(obj, "홍길동");
        //     // 메소드 호출
        //     methods[0].invoke(obj);
        // }
        // catch(Exception ex)
        // {

        // }

        // 자바의 시점
        // 1.컴파일 시점(javac) => static 변수, 메소드 => 저장하는 시점
        // 2.실행 시점(java)
        // 리플렉션은 실행 시점에 클래스의 모든 정보를 읽어서 조작이 가능
        // Spring / SpringBoot / MyBatis / JPA
        // 변수, 메소드 많은 경우 => 구분이 안된다 => 어노테이션
        // @GetMapping("/admin")
        // 주요 클래스 / 메소드
        // Class : 클래스의 모든 정보읽기
        // Field : 변수
        // Method : 메소드
        // 클래스 객체 얻기 :
        // Class class = String.class
        // String str = ""
        // Class class = str.GetClass()
        // Class class = Class.forName("클래스명")
        // 장점
        // => 모든 프레임워크 개발 시 주로 사용
        // => 코드 재사용, 유지보수
        // 단점
        // => 직접 호출보다는 속도가 늦다
        // => 보안 문제 private에 접근이 가능
        // 코드 가독성이 떨어진다
        
        try
        {
            Class cls = Class.forName("Day.Member");
            System.out.println("=====Method=====");
            Method[] methods = cls.getDeclaredMethods();
            for (Method m : methods)
            {
                System.out.println(m.getName());
            }
            System.out.println("=====변수(멤버)=====");
            Field[] fields = cls.getDeclaredFields();
            for (Field f : fields)
            {
                System.out.println(f.getName());
            }
            System.out.println("=====생성자=====");
            Constructor[] cons = cls.getDeclaredConstructors();
            for (Constructor c : cons)
            {
                System.out.println(c.getName());
            }
            System.out.println("=====객체 메모리 할당=====");
            Object obj = cls.getDeclaredConstructor(int.class, String.class, String.class)
                            .newInstance(2, "박문수", "서울");
            System.out.println("객체 주소 " + obj);
            Member member = new Member();
            System.out.println("객체 주소 " + member);

            Field field = cls.getDeclaredField("address");
            field.setAccessible(true);
            field.set(obj, "제주");
            System.out.println(field.get(obj));

            field = cls.getDeclaredField("name");
            field.setAccessible(true);
            field.set(obj, "심청이");
            System.out.println(field.get(obj));

            System.out.println("=====메소드 제어=====");
            Scanner scan = new Scanner(System.in);
            System.out.print("검색어 입력 : ");
            String input = scan.next();
            for (Method m : methods)
            {
                if (input.equals(m.getName()))
                {
                    m.invoke(obj, null);
                }
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}

class Member
{
    private int mno;
    private String name;
    private String address;

    public Member()
    {

    }

    public Member(int mno, String name, String address)
    {
        this.mno = mno;
        this.name = name;
        this.address = address;
    }

    public void insert()
    {
        System.out.println("insert..");
    }

    public void update()
    {
        System.out.println("update..");
    }

    public void delete()
    {
        System.out.println("delete..");
    }

    public void select()
    {
        System.out.println("select..");
    }
}

// class Sawon
// {
//     private String name;
//     public Sawon()
//     {

//     }
//     public Sawon(String name)
//     {
//         this.name = name;
//     }
//     public void info()
//     {
//         System.out.println("Sawon:info() Call.." + name);
//     }
// }
