package Part04_Data_IO;

/*
    Chapter 18. 데이터 입출력
 
    18.1 입출력 스트림
    - 입출력은 프로그램과 파일·네트워크 등 외부 자원 사이의 데이터 이동이다.
    - 바이트 스트림과 문자 스트림, 입력·출력 방향을 구분한다.
 
    18.2 바이트 출력 스트림
    - OutputStream은 바이트를 기록한다.
    - write, flush, close의 역할을 구분하고 리소스 누수를 방지하기 위해 try-with-resources를 권장한다.
 
    18.3 바이트 입력 스트림
    - InputStream은 바이트를 읽으며 read()는 더 읽을 데이터가 없으면 -1을 반환한다.
    - 한 번의 read가 요청한 바이트를 모두 채운다고 가정하면 안 된다.
 
    18.4 문자 입출력 스트림
    - Reader/Writer는 문자 데이터에 사용한다.
    - 인코딩에 맞는 문자셋을 지정하지 않으면 서로 다른 환경에서 문자가 깨질 수 있다.
 
    18.5 보조 스트림
    - 보조 스트림은 기본 스트림을 감싸 기능을 확장한다.
    - BufferedInputStream, DataInputStream, ObjectInputStream 등이 여기에 해당한다.
 
    18.6 문자 변환 스트림
    - InputStreamReader와 OutputStreamWriter는 바이트와 문자 사이를 변환한다.
    - UTF-8처럼 사용할 문자셋을 명시하는 것이 좋다.
 
    18.7 성능 향상 스트림
    - BufferedInputStream/BufferedReader 등은 버퍼에 데이터를 모아 입출력 호출을 줄인다.
    - 모든 상황에서 같은 크기의 성능 향상이 나타나는 것은 아니다.
 
    18.8 기본 타입 스트림
    - DataInputStream/DataOutputStream은 int, double, boolean 등의 값을 정해진 이진 형태로 읽고 쓴다.
    - 기록 순서와 읽는 순서를 일치시켜야 한다.
 
    18.9 프린트 스트림
    - PrintStream/PrintWriter는 텍스트 표현을 편리하게 출력한다.
    - print, println, printf 등의 메서드를 제공한다.
 
    18.10 객체 스트림
    - ObjectOutputStream/ObjectInputStream은 직렬화 가능한 객체를 다룬다.
    - Serializable, serialVersionUID, 보안 위험과 역직렬화의 한계를 이해해야 한다.
 
    18.11 File과 Files 클래스
    - File은 경로·파일에 대한 전통 API이며 Files/Path는 파일 생성·복사·이동·읽기·쓰기 등의 기능을 제공한다.
    - 파일 작업은 IOException 및 경로·권한 문제를 고려해야 한다.
 */

public class Chapter18DataIO {
    public static void main(String[] args) throws Exception {
        byte[] bytes = {65, 66, 67};
        try (java.io.InputStream input = new java.io.ByteArrayInputStream(bytes)) {
            System.out.println(input.read()); // 65
        }
        // 실제 파일을 다룰 때는 Path, Files 및 문자셋을 확인한다.
    }
}
