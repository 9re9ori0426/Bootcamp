import java.sql.*;
import java.util.Scanner;

public class SelectMain3 {
    public static final String CLOUD_URL = "jdbc:oracle:thin:@m25botbzmy1d07ff_medium?TNS_ADMIN=C:/bo/Wallet_M25BOTBZMY1D07FF";
    public static final String CLOUD_ID = "BO";
    public static final String CLOUD_PW = "Soldesk502!!";

    public static void main(String[] args) {

        // 실행하면     1. 이름 조회, 2. 나이(이상) 조회

        Scanner sc = new Scanner(System.in);

        String selectNameQuery = "SELECT * FROM STUDENT_DB WHERE S_NAME = ?";
        String selectAgeOverQuery = "SELECT * FROM STUDENT_DB WHERE S_AGE >= ?";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        long _t = System.currentTimeMillis();
        try {
            conn = DriverManager.getConnection(CLOUD_URL, CLOUD_ID, CLOUD_PW);

            System.out.println("Connected to database.");

            while (true){
                System.out.println("선택 : 1. 이름 조회\t 2. 나이(이상) 조회");
                System.out.print("선택 : ");
                int sel = sc.nextInt();

                if( sel == 1 ){
                    sc.nextLine();
                    System.out.print("이름을 입력하세요 : ");
                    String stName = sc.nextLine();
                    pstmt = conn.prepareStatement(selectNameQuery);
                    pstmt.setString(1, stName);
                    break;
                }
                else if ( sel == 2 ){
                    System.out.print("나이를 입력하세요 : ");
                    int stAge = sc.nextInt();
                    pstmt = conn.prepareStatement(selectAgeOverQuery);
                    pstmt.setInt(1, stAge);
                    break;
                }
                else{
                    System.out.println("1이나 2를 입력해 주세요.");
                }
            }

            if( pstmt != null ){
                rs = pstmt.executeQuery();

                while (rs.next()) {
                    int no = rs.getInt(1);
                    String name = rs.getString(2);
                    int age = rs.getInt(3);
                    String address = rs.getString(4);

                    System.out.printf("%d] %s %d %s\n", no, name, age, address);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
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
