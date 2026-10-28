import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DeleteMain3_backup {
    public static final String CLOUD_URL = "jdbc:oracle:thin:@m25botbzmy1d07ff_medium?TNS_ADMIN=C:/bo/Wallet_M25BOTBZMY1D07FF";
    public static final String CLOUD_ID = "BO";
    public static final String CLOUD_PW = "Soldesk502!!";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("삭제할 학생의 이름을 입력해주세요 : ");
        String stName = sc.nextLine();

        String countQuery = "SELECT COUNT(*) FROM STUDENT_DB WHERE S_NAME = ?";
        String selectQuery = "SELECT * FROM STUDENT_DB WHERE S_NAME = ?";
        String deleteQuery = "Delete STUDENT_DB WHERE S_NO = ?";

        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DriverManager.getConnection(CLOUD_URL, CLOUD_ID, CLOUD_PW);

            pstmt = conn.prepareStatement(countQuery);
            pstmt.setString(1, stName);

            ResultSet count = pstmt.executeQuery();
            count.next();
            if( count.getInt(1) > 0 ){
                System.out.printf("이름이 [%s]인 학생이 %d명 있습니다", stName, count.getInt(1) );

                pstmt = conn.prepareStatement(selectQuery);
                pstmt.setString(1, stName);
                ResultSet rs = pstmt.executeQuery();

                System.out.println("삭제할 학생의 숫자를 입력해주세요");
                ArrayList<Integer> arr = new ArrayList();
                int i = 0;
                while(rs.next()){
                    arr.add(rs.getInt("S_NO"));
                    String _name =  rs.getString("S_NAME");
                    int _age = rs.getInt("S_AGE");
                    String _addr = rs.getString("S_ADDR");
                    System.out.println(i + "] " + _name + " " + _age + " " + _addr);
                    i++;
                }
                int sel = sc.nextInt();

                pstmt = conn.prepareStatement(deleteQuery);
                pstmt.setInt(1, arr.get(sel) );
                int rows = pstmt.executeUpdate();

                if(rows > 0) {
                    System.out.printf("이름이 [%s]인  학생이 %d명 삭제되었습니다.\n", stName, rows );
                }
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
