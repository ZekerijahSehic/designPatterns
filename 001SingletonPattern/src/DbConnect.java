import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {

    Connection conn;

    private static DbConnect instance;

    public DbConnect() throws SQLException {
        this.conn = DriverManager.getConnection("jdbc:mysql://localhost/java?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "password");
    }

    public static DbConnect getInstance() throws SQLException {
        if(instance==null||instance.conn.isClosed()){
            instance = new DbConnect();
        }
        return instance;
    }
}
