import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        Person p = Person.getInstance();
        Person p1 = Person.getInstance();

        System.out.println(p);
        System.out.println(p1);

        for(int i=0; i<100000; i++) {
            DbConnect db = DbConnect.getInstance();
            //System.out.println(db.conn.isClosed());
        }
    }
}
