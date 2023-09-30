
package Project;
import java.sql.*;
/**
 *
 * @author anuj7
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bbm","root","akatsuki10");
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
}
