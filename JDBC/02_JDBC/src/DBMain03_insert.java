import java.sql.*;
import java.util.Scanner;

public class DBMain03_insert {
    public static String CLOUD_URL = "jdbc:oracle:thin:@m25botbzmy1d07ff_medium?TNS_ADMIN=C:/bo/Wallet_M25BOTBZMY1D07FF";

    public static void main(String[] args) {
        // snack 과자 추가
        // db -> 껍 3종
        Scanner sc = new Scanner(System.in);

        System.out.print("과자 이름 : ");
        String name = sc.next();
        System.out.print("과자 회사 : ");
        String comp = sc.next();
        System.out.print("무게 : ");
        double weight = sc.nextDouble();
        System.out.print("가격 : ");
        int price = sc.nextInt();

        Connection conn = null;
        Statement st = null;
        long _t = System.currentTimeMillis();
        try {
            conn = DriverManager.getConnection(CLOUD_URL, "BO", "Soldesk502!!");
            st = conn.createStatement();

//            conn.setAutoCommit(false);

//            String query = "INSERT INTO  DB_TEST VALUES(DB_TEST_SEQ.nextval, '" + name + "', " + age + ")";
            String query = String.format("INSERT INTO SNACK VALUES(SNACK_SEQ.nextval, '%s', '%s', %f, %d, SYSDATE)", name, comp, weight, price);

            int affectedRow = st.executeUpdate(query);
            if( affectedRow == 1){
                System.out.println("과자 added..!");
            }

            String ret_query = "SELECT * FROM SNACK ORDER BY S_EXP asc";

            ResultSet rs = st.executeQuery(ret_query);
            while( rs.next() ){
                System.out.println(rs.getString("s_name") + " / " + rs.getString("s_price") + " / " + rs.getDate("s_exp") );
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
