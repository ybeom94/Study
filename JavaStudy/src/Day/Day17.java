package Day;

public class Day17
{
    public static void main(String[] args)
    {
        // 추상 클래스
        // : 구현이 안된 메소드를 가지고 있다(공통으로 적용되는 기능 모아 둔다), 객체 생성이 불가능, 간접적으로 생성 가능
        // : 사용시에 상속을 받은 다음 하위 클래스에서 확장, 구현해서 사용
        // : 상속을 통해서 코드를 재사용, 강제로 메소드 구현을 하는 역할
        // 인터페이스
        // : 주로 메소드, 기능 설계
        // : 코드의 표준화, 설계만 되어있다, 다른 클래스와 연결이 편리
        // : 결합성이 낮다, 다중 상속이 가능, 독립적으로 사용 가능(Socket, ServerSocket)
        // : 유지보수 편리, 소스를 통일화, 분석이 쉽다.
        // : 형식 -> Only public / 
    }
}

interface Board
{
    public void write();
    public void list();
    public void detail();
    public void update();
    public void delete();
    public default void paging(){} // 동일하게 적용 or 새로운 기능 추가
}
