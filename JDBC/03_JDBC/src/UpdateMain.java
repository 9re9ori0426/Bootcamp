import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateMain {
    public static final String CLOUD_URL = "jdbc:oracle:thin:@m25botbzmy1d07ff_medium?TNS_ADMIN=C:/bo/Wallet_M25BOTBZMY1D07FF";
    public static final String CLOUD_ID = "BO";
    public static final String CLOUD_PW = "Soldesk502!!";

    public static void main(String[] args) {
        // 사람 이름을 입력하면 나이를 수정
        // db
        Connection conn = null;
        PreparedStatement pstmt = null;

        Scanner sc = new Scanner(System.in);

        System.out.printf("이름을 입력해 주세요 : ");
        String stName = sc.nextLine();
        System.out.printf("수정하고 싶은 나이를 입력해 주세요 : ");
        int stAge = sc.nextInt();

        String query = "UPDATE STUDENT_DB SET S_AGE = ? WHERE S_NAME = ?";

        try{
            conn = DriverManager.getConnection(CLOUD_URL, CLOUD_ID, CLOUD_PW);
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, stAge);
            pstmt.setString(2, stName);

            int rows = pstmt.executeUpdate();
            if(rows > 0){
                System.out.printf("이름이 [%s]인 %d명의 학생이 %d살로 수정되었습니다\n", stName, rows, stAge);
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
