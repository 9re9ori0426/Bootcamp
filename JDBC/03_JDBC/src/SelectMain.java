import java.sql.*;
import java.util.Scanner;

public class SelectMain {
    public static final String CLOUD_URL = "jdbc:oracle:thin:@m25botbzmy1d07ff_medium?TNS_ADMIN=C:/bo/Wallet_M25BOTBZMY1D07FF";
    public static final String CLOUD_ID = "BO";
    public static final String CLOUD_PW = "Soldesk502!!";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 사람: ");
        String userName = sc.nextLine();

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        long _t = System.currentTimeMillis();
        try {
            conn = DriverManager.getConnection(CLOUD_URL, CLOUD_ID, CLOUD_PW);

            System.out.println("Connected to database.");

            stmt = conn.prepareStatement("SELECT * FROM STUDENT_DB WHERE s_name = ?");
            stmt.setString(1, userName);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int no = rs.getInt(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
                String address = rs.getString(4);

                System.out.printf("%d] %s %d %s\n", no, name, age, address);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.printf("Total execution time: %.2fs\n", (System.currentTimeMillis() - _t)/1000.0);
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
