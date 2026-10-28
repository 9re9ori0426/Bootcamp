import java.util.Scanner;

public class Test_Login {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// login_system
		// id, pw

		String db_id = "bo";
		String db_pw = "bo1004";

		System.out.print("ID : ");
		String id = sc.next();

		if (db_id.equals(id)) {
			System.out.print("PW : ");
			String pw = sc.next();

			if (db_pw.equals(pw)) {
				System.out.println("로그인 성공");
			} else {
				System.err.println("비밀번호가 일치하지 않습니다.");
			}
		} else {
			System.err.println("존재하지 않는 회원입니다.");
		}
		
	}
}
