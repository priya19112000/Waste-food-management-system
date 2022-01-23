
import java.sql.*;
import javax.swing.JOptionPane;
public class Database_Connection {
    Connection conn;
    
    public static Connection ConnecrDb(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
            return conn;
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
            return null;
            
        }
    }
}
