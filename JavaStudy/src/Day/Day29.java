package Day;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.file.*;

public class Day29
{
    private static final String baseUrl = "https://kobis.or.kr/kobis/business/";
    private static String[] strUrl =
    { "", "serchMainDailyBoxOffice.do", "serchMainRealTicket.do", "serchMainDailySeatTicket.do" };

    public static void main(String[] args)
    {
        try
        {
            // File file = new File("c:\\java_data\\student.txt");
            // if (!file.exists())
            // {
            //     file.createNewFile();
            // }
            // FileWriter fWriter = new FileWriter(file);
            // String msg = "Hello IOStream\r\n";
            // fWriter.write(msg);
            // msg = "Hello Oracle!!";
            // BufferedWriter bWriter = new BufferedWriter(fWriter);
            // bWriter.write(msg);
            // System.out.println("저장 완료!");
            // bWriter.close();
            // fWriter.close();

            // int menu = 1;
            // URI uri = new URI(baseUrl + strUrl[menu]);
            // URL url = uri.toURL();
            // HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            // String movie = "";
            // if (connection != null)
            // {
            //     BufferedReader bReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            //     while (true)
            //     {
            //         String json = bReader.readLine();
            //         if (json == null)
            //         {
            //             break;
            //         }
            //         movie += json + "\n";
            //     }
            //     bReader.close();
            // }
            // System.out.println(movie.trim());

            // Files
            // Path : 파일 경로 지정 => Files : 파일 생성 / 읽기 / 쓰기 => 파일 시스템 : 설치

            // 파일 생성
            // Path path = Paths.get("test.txt");
            // Files.createFile(path);
            // System.out.println("파일 생성 완료");

            // 파일에 문자열 저장
            // Path path = Paths.get("test.txt");
            // Files.writeString(path, "Hello Files!");
            // System.out.println("파일 저장 완료!");

            // 파일 읽기
            // Path path = Paths.get("c:\\java_data\\genie.txt");
            // String data = Files.readString(path);
            // System.out.println(data);

            // 존재 여부
            // Path path = Paths.get("c:\\java_data\\melon.txt");
            // if (Files.exists(path))
            // {
            //     System.out.println("파일이 존재합니다");
            // }
            // else
            // {
            //     System.out.println("파일이 없습니다");
            // }

            // 파일 복사
            // Path source = Paths.get("test.txt");
            // Path target = Paths.get("copy.txt");
            // Files.copy(source, target);
            // System.out.println("복사 완료");

            // 파일 이동
            // Path source = Paths.get("copy.txt");
            // Path target = Paths.get("new.txt");
            // Files.move(source, target);
            // System.out.println("이동 완료 / 이름 변경");

            // 파일 삭제
            // Path path = Paths.get("new.txt");
            // if (Files.deleteIfExists(path))
            // {
            //     System.out.println("삭제 완료!");
            // }

            // 서버 실행
            // ServerSocket server = new ServerSocket(Port);
            // bind() => 개통 => 유심(ip, port)
            // listen() => 접근 대기 상태
            // 클라이언트 접근
            // Socket socket = new Socket(서버IP, 서버PORT)
            // 서버가 연결 수락
            // server.accpet() => 접속이 된 경우에만 호출
            // 발신자 => Socket
            // Socket socket = server.accept() => 클라이언트의 IP, PORT 저장
            // 데이터 송수신
            // socket.getInputStream() : 클라이언트 메세지 읽기
            // socket.getOutputStream() : 클라이언트로 전송
            // 통신 종료
            // socket.close()

            // Socket => 다른 컴퓨터와 연결하는 기기
            // ServerSocket => 서버에서 클라이언트 접속 담당, 접속을 기다린다, 특정 포트를 사용, accept() 연결 수락
            // Socket => 실제 통신 담당, 서버와 클라이언트 연결, 읽기(요청받기), 쓰기(요청하기), 연결 종료

            // 서버 역할
            // => 접속 대기, 연결 수락, 데이터 전달
            // 클라이언트 역할
            // => 서버 접속, 데이터 전송, 응답 출력
        
            // TCP : 신뢰성 좋다, 속도가 늦다
            // 서버 Socket => 클라이언트 정보(ip, port)
            // 클라이언트 Socket => 서버 정보(ip, port)
        
            // TCP => 전화 => 채팅, 이메일 / UDP => 우편, 손실 => 동영상, 스트림 서버
            // RTCP
        
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        
    }
}
