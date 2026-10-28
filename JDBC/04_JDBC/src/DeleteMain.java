import java.sql.*;
import java.util.Scanner;

public class DeleteMain {
    public static final String CLOUD_URL = "jdbc:oracle:thin:@m25botbzmy1d07ff_medium?TNS_ADMIN=C:/bo/Wallet_M25BOTBZMY1D07FF";
    public static final String CLOUD_ID = "BO";
    public static final String CLOUD_PW = "Soldesk502!!";

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement pstmt = null;

        Scanner sc = new Scanner(System.in);

        String query = "DELETE COFFEE_TEST WHERE C_NO = ?";

        try {
            conn = DriverManager.getConnection(CLOUD_URL, CLOUD_ID, CLOUD_PW);

            CoffeeDB.printAll(conn);

            System.out.print("삭제할 커피의 pk : ");
            int _no = sc.nextInt();

            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, _no);
            if (pstmt.executeUpdate() == 1) {
                System.out.println("delete success");
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
