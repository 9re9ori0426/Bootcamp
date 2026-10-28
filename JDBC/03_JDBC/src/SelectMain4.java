import java.sql.*;
import java.util.Scanner;

public class SelectMain4 {
    public static final String CLOUD_URL = "jdbc:oracle:thin:@m25botbzmy1d07ff_medium?TNS_ADMIN=C:/bo/Wallet_M25BOTBZMY1D07FF";
    public static final String CLOUD_ID = "BO";
    public static final String CLOUD_PW = "Soldesk502!!";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(CLOUD_URL, CLOUD_ID, CLOUD_PW);

            System.out.println("나이 조회 방식을 선택해주세요.");
            System.out.println("1. 이상, 2. 이하");
            int sel = sc.nextInt();
            String op = ">";
            if (sel == 2) {
                op = "<";
            }
            System.out.print("나이를 입력해주세요 : ");
            int ageCrit = sc.nextInt();

            String query = "SELECT * FROM STUDENT_DB WHERE S_AGE " + op + "= ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, ageCrit);

            rs = pstmt.executeQuery();

            int i = 0;
            while (rs.next()) {
                i++;
                String _name = rs.getString("S_NAME");
                int _age = rs.getInt("S_AGE");
                String _addr = rs.getString("S_ADDR");
                System.out.println(i + "] " + _name + " " + _age + " " + _addr);
            }
            System.out.println("-".repeat(100));
            System.out.printf("나이가 %d살 %s인 사람이 %d명 있습니다", ageCrit, sel == 1 ? "이상" : "이하", i);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
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
