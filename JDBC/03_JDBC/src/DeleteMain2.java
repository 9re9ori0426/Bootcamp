import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteMain2 {
    public static final String CLOUD_URL = "jdbc:oracle:thin:@m25botbzmy1d07ff_medium?TNS_ADMIN=C:/bo/Wallet_M25BOTBZMY1D07FF";
    public static final String CLOUD_ID = "BO";
    public static final String CLOUD_PW = "Soldesk502!!";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("삭제할 학생의 이름을 입력해주세요 : ");
        String stName = sc.nextLine();

        String query = "Delete STUDENT_DB WHERE S_NAME = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DriverManager.getConnection(CLOUD_URL, CLOUD_ID, CLOUD_PW);

            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, stName);

            int rows = pstmt.executeUpdate();
            if(rows > 0) {
                System.out.printf("이름이 [%s]인  학생이 %d명 삭제되었습니다.\n", stName, rows );
            }

        } catch (Exception e) {
            e.printStackTrace();
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
