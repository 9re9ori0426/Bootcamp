import java.sql.*;
import java.util.Scanner;

public class BMIMain {
    public static final String CLOUD_URL = "jdbc:oracle:thin:@m25botbzmy1d07ff_medium?TNS_ADMIN=C:/bo/Wallet_M25BOTBZMY1D07FF";
    public static final String CLOUD_ID = "BO";
    public static final String CLOUD_PW = "Soldesk502!!";

    public static void main(String[] args) {
        // 이름, 키, 체중, bmi, status

        // db 구축, CR
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        Scanner sc = new Scanner(System.in);

        String selectQuery = "SELECT * FROM BMI_TEST WHERE B_NAME = ?";
        String selectQueryAll = "SELECT * FROM BMI_TEST";
        String insertQuery = "INSERT INTO BMI_TEST VALUES (BMI_TEST_SEQ.nextval, ?, ?, ?, ?, ?)";

        // 1. (검사이력 조회) 2. 검사실시
        try {
            conn = DriverManager.getConnection(CLOUD_URL, CLOUD_ID, CLOUD_PW);

            System.out.println("연결 성공!");

            System.out.println("1. (검사이력 조회) 2. 검사실시");
            int sel = sc.nextInt();
            // 1. 필요한 값 키, 체중, 이름
            sc.nextLine();
            System.out.print("이름 : ");
            String name = sc.nextLine();

            if (sel == 1) {
                if( name.equals("") || name.equals(" ") ){
                    pstmt = conn.prepareStatement(selectQueryAll);
                }
                else{
                    pstmt = conn.prepareStatement(selectQuery);
                    pstmt.setString(1, name);
                }
                rs = pstmt.executeQuery();
                while (rs.next()) {
                    String _name = rs.getString("B_NAME");
                    double _weight = rs.getDouble("B_WEIGHT");
                    double _height = rs.getDouble("B_HEIGHT");
                    double _bmi = rs.getDouble("B_BMI");
                    String _status = rs.getString("B_STATUS");
                    System.out.println(_name + "] 체중 : " + _weight + ", 키 : " + _height + ", BMI : " + _bmi + ", " + _status);
                }
            } else if (sel == 2) {
				System.out.print("키 : ");
				double height = sc.nextDouble();
				System.out.print("체중 : ");
				double weight = sc.nextDouble();

                // 2. 계산식
                // 체중 / 키 x 키 (m)

                if (height > 3) {
                    height /= 100;
                }

                double bmi = weight / (height * height);
                // 3. 판정
                // 저 체 중 18.5미만
                // 정 상 18.5이상 ~ 22.9이하
                // 비만전단계 23이상 ~ 24.9이하
                // 1단계 비만 25이상 ~ 29.9이하
                // 2단계 비만 30이상 ~ 34.9이하
                // 3단계 비만 35이상
                String result = "3단계 비만";
                if (bmi < 18.5) {
                    result = "저체중";
                } else if (bmi <= 22.9) {
                    result = "정상";
                } else if (bmi <= 24.9) {
                    result = "비만전단계";
                } else if (bmi <= 29.9) {
                    result = "1단계 비만";
                } else if (bmi <= 34.9) {
                    result = "2단계 비만";
                }
                // 4. 결과출력 (소수점 1~2자리까지만)

                // BMI 지수 : ㅇㅇ
                // oo님, 당신은 oo 입니다.

                System.out.print("계산중.");
                Thread.sleep(300);
                System.out.print(".");
                Thread.sleep(300);
                System.out.print(".");
                Thread.sleep(300);
                System.out.print(".");
                Thread.sleep(300);
                System.out.print(".\n");

                System.out.printf("BMI지수 : %.2f\n", bmi);
                System.out.println(name + "님, 당신은 " + result + " 입니다.");

                pstmt = conn.prepareStatement(insertQuery);
                pstmt.setString(1, name);
                pstmt.setDouble(2, weight);
                pstmt.setDouble(3, height*100);
                pstmt.setDouble(4, bmi);
                pstmt.setString(5, result);

                if (pstmt.executeUpdate() == 1) {
                    System.out.println("검사 기록이 저장되었습니다.");
                }

            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if( rs != null) rs.close();
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }


    }
}
