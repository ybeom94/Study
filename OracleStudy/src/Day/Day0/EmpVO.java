import java.util.*;
import lombok.*;

@Data 
public class EmpVO
{
    // NUMBER => int / double
    // VARCHAR2 => String
    // DATA => java.util.Date
    // 오라클은 대소문자 구분이 없다
    // 약속
    // : 키워드는 대문자

    // EMPNO NUMBER(4) => int / -9999~9999
    // ENAME VARCHAR2(20) => String / 영어 1바이트, 한글 3바이트
    // JOB VARCHAR2(20) => String
    // HIREDATE DATE => Date
    // COMM NUMBER(10,2) => int
    // SAL NUMBER(10,2) => int
    // DEPTNO NUMBER(2) => int

    private int empno;
    private String ename;
    private String job;
    private Date hiredate;
    private int comm;
    private int sal;
    private int deptno;

}

