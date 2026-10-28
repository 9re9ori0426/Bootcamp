import java.sql.*;
import java.util.Scanner;
import java.util.Map;

public class UpdateMain {
    public static final String CLOUD_URL = "jdbc:oracle:thin:@m25botbzmy1d07ff_medium?TNS_ADMIN=C:/bo/Wallet_M25BOTBZMY1D07FF";
    public static final String CLOUD_ID = "BO";
    public static final String CLOUD_PW = "Soldesk502!!";

    public static final String[] QUERYS = new String[]{
            "UPDATE COFFEE_TEST SET C_NAME = ? WHERE C_NO = ?",
            "UPDATE COFFEE_TEST SET C_PRICE = ? WHERE C_NO = ?",
            "UPDATE COFFEE_TEST SET C_ORIGIN = ? WHERE C_NO = ?"
    };

    public static final String[] MSGS = new String[]{
            "변경할 이름 : ",
            "변경할 가격 : ",
            "변경할 원산지 : "
    };

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement pstmt = null;

        Scanner sc = new Scanner(System.in);

        try {
            conn = DriverManager.getConnection(CLOUD_URL, CLOUD_ID, CLOUD_PW);

            Map<Integer, Coffee> m  = CoffeeDB.printAll(conn);

            System.out.print("변경할 커피 선택 : ");
            int _no = sc.nextInt();
            System.out.println("변경할 항목 1. 커피 이름, 2. 가격, 3. 원산지");
            int _sel = sc.nextInt();

            pstmt = conn.prepareStatement(QUERYS[_sel-1]);
            if(_sel == 1 || _sel == 3 ){
                if( _sel == 1){
                    System.out.println("변경 전 이름 : " + m.get(_no).name);
                }
                else{
                    System.out.println("변경 전 원산지 : " + m.get(_no).origin);
                }
                System.out.print(MSGS[_sel-1]);
                sc.nextLine();
                pstmt.setString(1, sc.nextLine());
            }
            else {
                System.out.println("변경전 가격 : " + m.get(_no).price);
                System.out.print(MSGS[_sel-1]);
                pstmt.setInt(1, sc.nextInt());
            }
            pstmt.setInt(2, _no);

            if (pstmt.executeUpdate() == 1) {
                System.out.println("update success");
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
