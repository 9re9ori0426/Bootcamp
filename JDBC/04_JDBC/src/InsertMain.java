import java.sql.*;
import java.util.Scanner;

public class InsertMain {
    public static final String CLOUD_URL = "jdbc:oracle:thin:@m25botbzmy1d07ff_medium?TNS_ADMIN=C:/bo/Wallet_M25BOTBZMY1D07FF";
    public static final String CLOUD_ID = "BO";
    public static final String CLOUD_PW = "Soldesk502!!";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        Scanner sc = new Scanner(System.in);

        String query = "INSERT INTO COFFEE_TEST VALUES(COFFEE_TEST_SEQ.nextval, ?, ?, ?)";
        try {
            conn = DriverManager.getConnection(CLOUD_URL, CLOUD_ID, CLOUD_PW);

            System.out.print("커피 명 : ");
            String _name = sc.nextLine();
            System.out.print("가격 : ");
            int _price = sc.nextInt();
            sc.nextLine();
            System.out.print("원산지 : ");
            String _origin = sc.nextLine();

            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, _name);
            pstmt.setInt(2, _price);
            pstmt.setString(3, _origin);

            if (pstmt.executeUpdate() == 1) {
                System.out.println("insert success");
            }

        } catch (Exception e) {

        } finally {
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
