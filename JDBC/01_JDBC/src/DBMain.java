import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBMain {

    public static String cloud_url = "jdbc:oracle:thin:@m25botbzmy1d07ff_medium?=TNS_ADMIN";
    public static String local_url = "jdbc:oracle:thin:@192.168.1.122:1521:XE";

    public static String cloud_db_id = "BO";
    public static String cloud_db_pw = "Soldesk502!!";

    public static String local_db_id = "c##bo1004";
    public static String local_db_pw = "bo1004";

    public static void main(String[] args) {

        // jdbc:oracle:thin:@m25botbzmy1d07ff_medium
        System.setProperty("oracle.net.tns_admin", "C:/bo/Wallet_M25BOTBZMY1D07FF");

        // ojdbc.jar 필요 - 자바로 db연결할 떄

        try {
            Connection conn = DriverManager.getConnection(cloud_url, cloud_db_id, cloud_db_pw);
            System.out.println("연결 성공");

            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("select * from snack");
            rs.next();
            System.out.println(rs.getString("s_name"));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

