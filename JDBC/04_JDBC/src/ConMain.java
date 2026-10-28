import java.sql.*;

public class ConMain {
    public static final String CLOUD_URL = "jdbc:oracle:thin:@m25botbzmy1d07ff_medium?TNS_ADMIN=C:/bo/Wallet_M25BOTBZMY1D07FF";
    public static final String CLOUD_ID = "BO";
    public static final String CLOUD_PW = "Soldesk502!!";

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(CLOUD_URL, CLOUD_ID, CLOUD_PW);

        }
        catch (Exception e) {

        }
        finally {
            try {
                rs.close();
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
