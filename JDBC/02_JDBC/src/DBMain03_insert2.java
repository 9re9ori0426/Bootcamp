import java.sql.*;
import java.util.Scanner;

public class DBMain03_insert2 {
    public static String CLOUD_URL = "jdbc:oracle:thin:@m25botbzmy1d07ff_medium?TNS_ADMIN=C:/bo/Wallet_M25BOTBZMY1D07FF";

    public static void main(String[] args) {
        // snack 과자 추가
        // db -> 껍 3종
        Scanner sc = new Scanner(System.in);

        System.out.print("과자 이름 : ");
        String name = sc.next();
        System.out.print("과자 회사 : ");
        String comp = sc.next();
        System.out.print("무게 : ");
        double weight = sc.nextDouble();
        System.out.print("가격 : ");
        int price = sc.nextInt();

        Connection conn = null;
        PreparedStatement pstmt = null;

        String query = "INSERT INTO SNACK VALUES(SNACK_SEQ.nextval, ?, ?, ?, ?, SYSDATE)";

        long _t = System.currentTimeMillis();
        try {
            conn = DriverManager.getConnection(CLOUD_URL, "BO", "Soldesk502!!");
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, name);
            pstmt.setString(2, comp);
            pstmt.setDouble(3, weight);
            pstmt.setInt(4, price);

            int affectedRow = pstmt.executeUpdate();
            if (affectedRow == 1) {
                System.out.println("과자 added..!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.printf("걸린시간 : %.3fs\n", (System.currentTimeMillis() - _t) / 1000.0);
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
