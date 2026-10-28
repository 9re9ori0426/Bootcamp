import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMain {
    public static String CLOUD_URL = "jdbc:oracle:thin:@m25botbzmy1d07ff_medium?TNS_ADMIN=C:/bo/Wallet_M25BOTBZMY1D07FF";

    public static void main(String[] args) throws SQLException {
        Connection conn = null;

        conn = DriverManager.getConnection(CLOUD_URL, "BO", "Soldesk502!!");

        System.out.println("Connected to database.");
    }
}
