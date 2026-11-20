import java.sql.*;

public class DAO 
{
    private Connection connection;
    private PreparedStatement pStatement;
    private final String className = "oracle.jdbc.driver.OracleDriver";
    private final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private final String id = "hr";
    private final String password = "happy";

    public DAO()
    {
        try 
        {
            Class.forName(className);
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
            connection = DriverManager.getConnection(URL, id, password);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void disConnection()
    {
        try 
        {
            if (pStatement != null)
            {
                pStatement.close();
            }
            if (connection != null)
            {
                connection.close();
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
