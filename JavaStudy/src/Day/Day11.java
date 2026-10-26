package Day;


public class Day11
{
    public static void main(String[] args)
    {
        // 메소드
        // 인스턴스 : new를 이용해서 메소드 저장 후
        // 정적 : 컴파일시에 자동으로 저장

        //LoginProcess();
    
    }


    // static void LoginProcess()
    // {
    //     String id, pwd;
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("ID 입력 : ");
    //     id = scanner.next();
    //     System.out.print("PWD 입력 : ");
    //     pwd = scanner.next();

    //     if (IsLogin(id, pwd))
    //     {
    //         System.out.println("로그인 완료");
    //     }
    //     else
    //     {
    //         System.out.println("로그인 불가");
    //         LoginProcess();
    //     }
    // }

    // static boolean IsLogin(String id, String pwd)
    // {
    //     final String MID = "Hong";
    //     final String PWD = "1234";

    //     boolean bCheck = false;
    //     if (id.equals(MID) && pwd.equals(PWD))
    //     {
    //         bCheck = true;
    //     }
    //     return bCheck;
    // }

}

class KeyArrow
{
    String keyArrow;
    int keyEvent;

    KeyArrow(String keyArrow, int keyEvent)
    {
        this.keyArrow= keyArrow;
        this.keyEvent = keyEvent;
    }
}