import java.sql.*;
import java.util.Scanner;

public class DeleteMain3 {
    public static final String CLOUD_URL = "jdbc:oracle:thin:@m25botbzmy1d07ff_medium?TNS_ADMIN=C:/bo/Wallet_M25BOTBZMY1D07FF";
    public static final String CLOUD_ID = "BO";
    public static final String CLOUD_PW = "Soldesk502!!";

    public static void main(String[] args) {
        // 누구를 지울수 있는지 보여주기

        Scanner sc = new Scanner(System.in);

        String selectQuery = "SELECT * FROM STUDENT_DB";
        String deleteQuery = "Delete STUDENT_DB WHERE S_NO = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(CLOUD_URL, CLOUD_ID, CLOUD_PW);

            pstmt = conn.prepareStatement(selectQuery);

            rs = pstmt.executeQuery();

            while(rs.next()){
                int _no = rs.getInt("S_NO");
                String _name =  rs.getString("S_NAME");
                int _age = rs.getInt("S_AGE");
                String _addr = rs.getString("S_ADDR");
                System.out.println(_no + "] " + _name + " " + _age + " " + _addr);
            }

            System.out.println("-".repeat(100));
            System.out.print("삭제할 학생의 숫자를 입력해주세요 : ");
            int sel = sc.nextInt();

            pstmt = conn.prepareStatement(deleteQuery);
            pstmt.setInt(1, sel);

            if(pstmt.executeUpdate() == 1) {
                System.out.println("선택한 학생이 삭제되었습니다.");
            }

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
