package Day;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Day13
{
    public static void main(String[] args)
    {   
        // 객체지향 3대 특성
        // 캡슐화 : 데이터 보호, private, protected, Getter, Setter
        // 상속 : 확장, 재사용, extends
        // 다형성 : 새로운 기능 추가, 기존의 기능 변경, 오버로딩, 오버라이딩
        // 다른 클래스와 연동 : 추상 클래스, 인터페이스, 내부 클래스

        // Sawon sawon = new Sawon();
        // sawon.setGender("Male");
        // System.out.println(sawon.getGender());


    }
}

class Student
{
    private int hakbeon;
    private String name;
    private static String schoolName;

    Student()
    {

    }

    public Student(int hakbeon, String name) {
        this.hakbeon = hakbeon;
        this.name = name;
    }
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor 
class Sawon
{
    private int sabun;
    private String name;
    private String gender;
    private String dept;
    private String job;
    private int pay;
    private String phone;
    private String address;
}