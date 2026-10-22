package Day;

import java.util.Arrays;

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
        int[] arr = {10, 20, 30, 40, 50};
        int[] targetArr = new int[5];
        System.arraycopy(arr, 0, targetArr, 0, 5);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(targetArr));

    }

}

class Student
{
    String name;
    int age;
    double tall;
    double weight;

    Student(String name, int age, double tall, double weight)
    {
        this.name = name;
        this.age = age;
        this.tall = tall;
        this.weight = weight;
    }
}