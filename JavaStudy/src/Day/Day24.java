package Day;

import java.util.ArrayList;
import java.util.Collections;

public class Day24
{
    public static void main(String[] args)
    {
        // 기본 : CRUD / add, get, set, remove
        // 기능 : 두개 이상의 List에서 중복된 데이터 관리 => JOIN
        // UNION(containsAll()) : 1 2 3 4 5 / 1 2 6 7 8 => 1 2 3 4 5 6 7 8
        // INTERSECT(retain()) : 1 2 3 4 5 / 1 2 6 7 8 => 1 2
        // UNIONALL(addAll()) : 1 2 3 4 5 / 1 2 6 7 8 => 1 2 1 2 3 4 5 6 7 8
        // MINUS : 1 2 3 4 5 / 1 2 6 7 8 => 3 4 5
        // 부분적 복사(subList())

        // List : ArrayList(DB) / Vector(Thread) / LinkedList(File)
        // ArrayList list = new ArrayList<>();
        // list.add(3);
        // list.add(4);
        // list.add(8);
        // list.add(7);
        // list.add(5);
        // Collections.sort(list);

        // 코드 재사용 : 데이터형을 변경해서 사용이 가능, 데이터형을 안정성 있게 만드는 도구
        // 클래스<클래스> : 기본형은 사용이 불가능 => Wrapper
        // 프로그램에서는 데이터형을 고정
        // 고정화, 통일화
        // 제한된 제네릭
        // class Box<T extends Number> {}
        // Box<String> <- 오류
        // 데이터형을 모르는 경우 : 와일드카드 => ?
        // Class<?>
        // extends 제한된 제네릭 => 꺼내기 전용 (읽기 전용) 
        // 타입을 모르는 경우 => Only 읽기 => ?
        
    }
}

class Box<T>
{
    T t;

    public void setT(T t)
    {
        this.t = t;
    }

    public T getT()
    {
        return t;
    }
}