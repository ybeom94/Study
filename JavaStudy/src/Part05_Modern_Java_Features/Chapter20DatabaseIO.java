/**
 * Chapter 20. 데이터베이스 입출력
 * 기준 교재: 『이것이 자바다(3판)』 (Java 21)
 *
 * [핵심 이론 정리]
 * 출판사 공개 목차의 소제목 순서를 따르고, 설명은 학습용으로 새롭게 작성했습니다.
 * 책의 본문이나 공식 예제 코드를 그대로 옮긴 파일은 아닙니다.
 *
 * 20.1 JDBC 개요
 *   - JDBC는 Java에서 관계형 DB와 연결하고 SQL을 실행하는 표준 API다. 사용 DBMS에 맞는 JDBC 드라이버와 연결 URL이 필요하다.
 *
 * 20.2 DBMS 설치
 *   - DBMS는 데이터를 저장·조회·갱신하는 서버 소프트웨어다. 실습에는 설치·실행·계정·권한 설정이 필요하다.
 *
 * 20.3 Client Tool 설치
 *   - SQL 클라이언트 도구는 DB 연결, 테이블 확인, SQL 실행 등을 편리하게 한다. Java 프로그램에서 JDBC를 사용하는 것과는 별도의 도구다.
 *
 * 20.4 DB 구성
 *   - 데이터베이스·테이블·열·제약 조건을 설계한 후 필요한 데이터와 사용자 권한을 설정한다. SQL 문법과 연결 URL은 DBMS 종류에 따라 차이가 있다.
 *
 * 20.5 DB 연결
 *   - DriverManager.getConnection으로 Connection을 얻는다. 연결 객체는 작업 후 반드시 닫아야 하며 비밀번호를 소스에 하드코딩하지
 *     않는 편이 좋다.
 *
 * 20.6 데이터 저장
 *   - INSERT는 새 행을 추가한다. PreparedStatement의 ? 매개변수를 사용하면 값을 안전하게 바인딩해 SQL 인젝션 위험을 줄인다.
 *
 * 20.7 데이터 수정
 *   - UPDATE는 조건에 맞는 행을 변경한다. WHERE 조건 누락 여부와 영향받은 행 수를 확인해야 한다.
 *
 * 20.8 데이터 삭제
 *   - DELETE는 조건에 맞는 행을 삭제한다. 트랜잭션과 WHERE 조건을 신중히 사용한다.
 *
 * 20.9 데이터 읽기
 *   - SELECT 결과는 ResultSet으로 순회하며 열 값을 읽는다. 행을 가리키는 커서는 next()로 이동하며 자료형과 null 처리에 주의한다.
 *
 * 20.10 프로시저와 함수 호출
 *   - CallableStatement는 DB에 정의된 프로시저·함수를 호출할 때 사용한다. IN/OUT 매개변수 및 결과 처리 방식은 드라이버와 DBMS에 따라
 *     다르다.
 *
 * 20.11 트랜잭션 처리
 *   - 트랜잭션은 관련 작업을 하나의 논리적 단위로 처리한다. setAutoCommit(false)로 수동 트랜잭션을 시작한 후 성공 시 commit, 실패 시
 *     rollback을 수행할 수 있다.
 *
 * 20.12 게시판 구현
 *   - 게시판은 모델·SQL·입출력·예외 처리를 결합한 실습이다. 이 요약 클래스는 실제 DB 연결/게시판 구현을 포함하지 않으며 핵심 개념과 JDBC 사용 흐름만
 *     정리한다.
 *
 * [기본 문법 확인]
 * 아래 main()은 설명에 필요한 최소 코드만 포함합니다.
 *
 * [실행]
 * javac -encoding UTF-8 Chapter20DatabaseIO.java
 * java Chapter20DatabaseIO
 */
public class Chapter20DatabaseIO {
    public static void main(String[] args) throws Exception {
        // JDBC에서 사용하는 핵심 타입: Connection, PreparedStatement, ResultSet
        // Connection connection = DriverManager.getConnection(url, user, password);
        // PreparedStatement statement = connection.prepareStatement("SELECT * FROM items WHERE id = ?");
        // statement.setInt(1, 1);
        // 실제 연결에는 해당 DBMS, JDBC 드라이버, URL, 계정과 권한이 필요하다.
        System.out.println("JDBC: 연결 → SQL 실행 → 결과 처리 → 자원 반환");
    }
}
