import java.util.*;
import java.sql.*;

public class EmpDAO 
{
    // ~VO : 데이터베이스 테이블 매칭 => 데이터형
    // ~DAO : 데이터베이스 연결
    // ~Manager : 외부 라이브러리 = Jsoup OPEN API
    // ~Service : 윈도우, 브라우저로 전송

    private Connection conn; // 오라클 연결 => Socket
    private PreparedStatement pStatement; // BufferedReader, OutputStream
    private final String URL = "jdbc:oracle:thin:@localhost:1521:XE";

    public EmpDAO()
    {
        try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void getConnection()
    {
        try 
        {
            conn = DriverManager.getConnection(URL, "hr", "happy");
        } 
        catch (Exception e) 
        {
            
        }
    }

    public void disConnection()
    {
        try 
        {
            if (pStatement != null)
            {
                pStatement.close(); // in.close(), out.close()
            }
            if (conn != null)
            {
                conn.close(); // socket.close()
            }
        } 
        catch (Exception e) 
        {
            
        }
    }

    public List<EmpVO> empListData()
    {
        List<EmpVO> list = new ArrayList<>();
        try 
        {
            // 연결
            getConnection();
            String sql = "SELECT empno,ename,job,sal " + "FROM emp";
            pStatement = conn.prepareStatement(sql); // out.write()
            ResultSet rSet = pStatement.executeQuery(); // in.readLine()
            while (rSet.next())
            {
                EmpVO vo = new EmpVO();
                vo.setEmpno(rSet.getInt(1));
                vo.setEname(rSet.getString(2));
                vo.setJob(rSet.getString(3));
                vo.setSal(rSet.getInt(4));
                list.add(vo);
            }
            rSet.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            disConnection();
        }
        return list;
    }
}
