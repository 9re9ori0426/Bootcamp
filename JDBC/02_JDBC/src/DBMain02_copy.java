import java.sql.*;
import java.util.Scanner;

public class DBMain02_copy {
    public static String CLOUD_URL = "jdbc:oracle:thin:@m25botbzmy1d07ff_medium?TNS_ADMIN=C:/bo/Wallet_M25BOTBZMY1D07FF";

    public static void main(String[] args) {
        // db -> 껍 3종
        // Select (Read) - rs
        // Insert(C) / Update (U) DELETE (D) - rs 필요 없음
            // 반환하는 결과가 없음
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("나이 : ");
        int age = sc.nextInt();

        Connection conn = null;
        Statement st = null;
        long _t = System.currentTimeMillis();
        try {
            conn = DriverManager.getConnection(CLOUD_URL, "BO", "Soldesk502!!");
            st = conn.createStatement();

//            conn.setAutoCommit(false);

//            String query = "INSERT INTO  DB_TEST VALUES(DB_TEST_SEQ.nextval, '" + name + "', " + age + ")";
            String query = String.format("INSERT INTO  DB_TEST VALUES(DB_TEST_SEQ.nextval, '%s', %d)", name, age);

            int affectedRow = st.executeUpdate(query);
            if( affectedRow == 1){
                System.out.println("user added..!");
            }

            String ret_query = "SELECT * FROM DB_TEST";

            ResultSet rs = st.executeQuery(ret_query);
            while( rs.next()){
                System.out.println(rs.getString("d_name") + " / " + rs.getString("d_age"));
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
