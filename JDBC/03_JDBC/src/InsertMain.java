import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMain {
    public static final String CLOUD_URL = "jdbc:oracle:thin:@m25botbzmy1d07ff_medium?TNS_ADMIN=C:/bo/Wallet_M25BOTBZMY1D07FF";
    public static final String CLOUD_ID = "BO";
    public static final String CLOUD_PW = "Soldesk502!!";

    public static void main(String[] args) {
        // 등록

        Connection conn = null;
        PreparedStatement pstmt = null;

        Scanner sc = new Scanner(System.in);

        String query = "INSERT INTO STUDENT_DB VALUES(STUDENT_DB_SEQ.NEXTVAL,?,?,?)";
        try {
            conn = DriverManager.getConnection(CLOUD_URL, CLOUD_ID, CLOUD_PW);

            System.out.print("이름 : ");
            String _name = sc.nextLine();
            System.out.print("나이 : ");
            int _age = sc.nextInt();
            sc.nextLine();
            System.out.print("주소 : ");
            String _addr = sc.nextLine();

            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, _name);
            pstmt.setInt(2, _age);
            pstmt.setString(3, _addr);

            if( pstmt.executeUpdate() == 1 ){
                System.out.println("insert success");
                System.out.println(_name + " " + _age + " " + _addr);
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
