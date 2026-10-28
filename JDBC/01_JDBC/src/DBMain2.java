import java.sql.*;

public class DBMain2 {
    public static String CLOUD_URL = "jdbc:oracle:thin:@m25botbzmy1d07ff_medium?TNS_ADMIN=C:/bo/Wallet_M25BOTBZMY1D07FF";
    public static String LOCAL_URL = "jdbc:oracle:thin:@192.168.1.122:1521:XE";

    public static String CLOUD_DB_ID = "BO";
    public static String CLOUD_DB_PW = "Soldesk502!!";

    public static String LOCAL_DB_ID = "c##bo1004";
    public static String LOCAL_DB_PW = "bo1004";

    public static void main(String[] args) {
        // snack table 자료 조회, sql, select
        // java -> db 빈 껍데기 3종
        // Connection, Statement, ResultSet

        try {
            Connection conn = DriverManager.getConnection(CLOUD_URL, CLOUD_DB_ID, CLOUD_DB_PW);
            System.out.println("연결 성공");

            Statement st = conn.createStatement();

            String query = "SELECT * FROM SNACK";

            ResultSet rs = st.executeQuery(query);

//            rs.next();

            while(rs.next()){
                System.out.println(rs.getString(2) + " / " + rs.getInt(5));
//                System.out.println(rs.getString(3));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
