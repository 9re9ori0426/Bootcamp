import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBMain02 {
    public static String CLOUD_URL = "jdbc:oracle:thin:@m25botbzmy1d07ff_medium?TNS_ADMIN=C:/bo/Wallet_M25BOTBZMY1D07FF";

    public static void main(String[] args) {
        // db -> 껍 3종
        // Select (Read) - rs
        // Insert(C) / Update (U) DELETE (D) - rs 필요 없음
            // 반환하는 결과가 없음

        Connection conn = null;
        Statement st = null;
        long _t = System.currentTimeMillis();
        try {
            conn = DriverManager.getConnection(CLOUD_URL, "BO", "Soldesk502!!");
            st = conn.createStatement();

            conn.setAutoCommit(false);

//            String query =
//                    "INSERT INTO DB_TEST VALUES (" +
//                    "DB_TEST_SEQ.nextval," +
//                    "'mz5'," +
//                    "50" +
//                    ")";
            String query = "INSERT INTO  DB_TEST VALUES(DB_TEST_SEQ.nextval, 'mz5', 50)";

            int affectedRow = st.executeUpdate(query);
            if( affectedRow == 1){
                System.out.println("user added..!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.printf("걸린시간 : %.3fs\n", (System.currentTimeMillis() - _t)/1000.0);
            try {
                st.close();
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }



    }
}
