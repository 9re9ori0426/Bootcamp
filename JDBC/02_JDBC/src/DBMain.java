import java.sql.*;

public class DBMain {
    public static String CLOUD_URL = "jdbc:oracle:thin:@m25botbzmy1d07ff_medium?TNS_ADMIN=C:/bo/Wallet_M25BOTBZMY1D07FF";

    // Conn, St, rs

    public static void main(String[] args) {
        System.out.println(11);

        Connection conn = null;
        ResultSet rs = null;
        Statement st = null;
        long _t = System.currentTimeMillis();
        try {
            conn = DriverManager.getConnection(CLOUD_URL, "BO", "Soldesk502!!");
            st = conn.createStatement();

            String query = "SELECT * FROM DB_TEST";

            rs = st.executeQuery(query);

            while(rs.next()){
                int no = rs.getInt("d_no");
                String name = rs.getString("d_name");
                int age = rs.getInt("d_age");

                System.out.printf("%02d] %s | %d\n", no, name, age);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.printf("걸린시간 : %.3fs\n", (System.currentTimeMillis() - _t)/1000.0);
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
