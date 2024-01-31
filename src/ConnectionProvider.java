import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
    static Connection getCon() {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/bms";
        String username = "root";
        String password = "Navu@06";

        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database.");
        } catch (SQLException ex) {
            System.out.println("An error occurred while connecting to the database.");
            ex.printStackTrace();
        }

        return con;
    }
}
