import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UpdateMain3 {
    public static final String CLOUD_URL = "jdbc:oracle:thin:@m25botbzmy1d07ff_medium?TNS_ADMIN=C:/bo/Wallet_M25BOTBZMY1D07FF";
    public static final String CLOUD_ID = "BO";
    public static final String CLOUD_PW = "Soldesk502!!";

    public static void main(String[] args) {

        // 리스트 없
        // PK를 입력하면 -> 나이를 수정할 수 있게

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Scanner sc = new Scanner(System.in);


        String selectQuery = "SELECT * FROM STUDENT_DB ORDER BY S_NO";
        String updateQuery = "UPDATE STUDENT_DB SET S_AGE = ? WHERE S_NO = ?";
        long _t = 0;
        try {
            conn = DriverManager.getConnection(CLOUD_URL, CLOUD_ID, CLOUD_PW);

            pstmt = conn.prepareStatement(selectQuery);
            rs = pstmt.executeQuery();

            Map<Integer, String> map = new HashMap<>();

            while (rs.next()) {
                int _no = rs.getInt("S_NO");
                String _name = rs.getString("S_NAME");
                int _age = rs.getInt("S_AGE");
                String _addr = rs.getString("S_ADDR");
                System.out.println(_no + "] " + _name + " " + _age + " " + _addr);

                map.put(_no, _name);
            }
            System.out.println("-".repeat(100));
            System.out.print("수정할 학생의 숫자를 입력해 주세요 : ");
            int sel =  sc.nextInt();
            System.out.print("수정하고 싶은 나이를 입력해 주세요 : ");
            int age =  sc.nextInt();

            _t = System.currentTimeMillis();
            pstmt = conn.prepareStatement(updateQuery);
            pstmt.setInt(1, age);
            pstmt.setInt(2, sel);

            if(pstmt.executeUpdate() == 1) {
                System.out.printf("%s님의 나이가 %d살로 수정되었습니다\n", map.get(sel), age);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.printf("Total execution time: %.2fs\n", (System.currentTimeMillis() - _t) / 1000.0);
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
