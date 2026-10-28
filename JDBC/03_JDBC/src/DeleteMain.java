import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteMain {
    public static final String CLOUD_URL = "jdbc:oracle:thin:@m25botbzmy1d07ff_medium?TNS_ADMIN=C:/bo/Wallet_M25BOTBZMY1D07FF";
    public static final String CLOUD_ID = "BO";
    public static final String CLOUD_PW = "Soldesk502!!";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("삭제할 학생의 숫자를 입력해주세요 : ");
        int userNum = sc.nextInt();

        String query = "Delete STUDENT_DB WHERE S_NO = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DriverManager.getConnection(CLOUD_URL, CLOUD_ID, CLOUD_PW);

            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, userNum);

            if(pstmt.executeUpdate() > 0) {
                System.out.println("선택한 학생이 삭제되었습니다.");
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
