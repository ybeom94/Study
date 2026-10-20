/**
 * Chapter 19. 네트워크 입출력
 * 기준 교재: 『이것이 자바다(3판)』 (Java 21)
 *
 * [핵심 이론 정리]
 * 출판사 공개 목차의 소제목 순서를 따르고, 설명은 학습용으로 새롭게 작성했습니다.
 * 책의 본문이나 공식 예제 코드를 그대로 옮긴 파일은 아닙니다.
 *
 * 19.1 네트워크 기초
 *   - 네트워크 통신은 IP 주소로 장치를 구분하고 포트 번호로 서비스 끝점을 구분한다. 클라이언트가 서버에 접속하여 데이터를 주고받는 구조를 이해한다.
 *
 * 19.2 IP 주소 얻기
 *   - InetAddress는 호스트 이름과 IP 주소 정보를 다룬다. DNS 결과와 IPv4/IPv6 주소, 루프백 주소를 구분한다.
 *
 * 19.3 TCP 네트워킹
 *   - TCP는 연결 지향적이며 순서와 신뢰성을 제공하는 바이트 스트림 프로토콜이다. ServerSocket은 연결을 수락하고 Socket은 연결된 양 끝점의
 *     입출력을 제공한다.
 *
 * 19.4 UDP 네트워킹
 *   - UDP는 연결 설정 없이 데이터그램을 주고받는다. 전달·순서·중복 방지를 보장하지 않으며 송수신에는 DatagramSocket 및 DatagramPacket을
 *     사용할 수 있다.
 *
 * 19.5 서버의 동시 요청 처리
 *   - 서버는 여러 클라이언트의 요청을 스레드·스레드풀 등으로 나누어 처리할 수 있다. 공유 자원의 동기화와 연결 종료 처리가 중요하다.
 *
 * 19.6 JSON 데이터 형식
 *   - JSON은 객체·배열·문자열·숫자·boolean·null로 데이터를 표현하는 텍스트 형식이다. Java 표준 라이브러리만으로 일반적인 JSON 전체를
 *     직렬화/역직렬화하는 전용 범용 API가 제공되는 것은 아니므로 별도 라이브러리를 사용하기도 한다.
 *
 * 19.7 TCP 채팅 프로그램
 *   - 채팅 구조는 서버의 접속 수락, 클라이언트별 수신 처리, 메시지 송신, 연결 해제를 포함한다. 실제 구현에는 서버와 클라이언트가 별도 프로세스로 실행되는
 *     구성이 필요하다.
 *
 * [기본 문법 확인]
 * 아래 main()은 설명에 필요한 최소 코드만 포함합니다.
 *
 * [실행]
 * javac -encoding UTF-8 Chapter19NetworkIO.java
 * java Chapter19NetworkIO
 */
public class Chapter19NetworkIO {
    public static void main(String[] args) throws Exception {
        System.out.println(java.net.InetAddress.getLoopbackAddress().getHostAddress());
        // TCP: ServerSocket(접속 수락) + Socket(연결된 양 끝점)
        // UDP: DatagramSocket + DatagramPacket
        // 채팅 구현은 서버와 클라이언트를 별도 프로세스로 실행해야 한다.
    }
}
