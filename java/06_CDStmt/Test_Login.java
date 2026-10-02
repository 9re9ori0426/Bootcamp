import java.util.Scanner;

public class Test_Login {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// login_system
			// id, pw
		
		// db에 실제 존재하는 id, pw -> 임시값으로 테스트
		
		String db_id = "dw";
		String db_pw = "dw1004";		
		
		// UI
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		
		// 판정
			// 둘 다 맞으면 "로그인 성공" 출력
			// id가 틀리면 "존재하지 않는 회원입니다" 출력
			// pw가 틀리면 "비밀번호가 일치하지 않습니다" 출력
		if (db_id.equals(id) && db_pw.equals(pw)) {
			System.out.println("로그인 성공");
		}
		else if (!db_id.equals(id)) {
			System.out.println("존재하지 않는 회원입니다");
		}
		else if (!db_pw.equals(pw)) {
			System.out.println("비밀번호가 일치하지 않습니다");
		}
		
		if (db_id.equals(id)) {
			if (db_pw.equals(pw)) {
				System.out.println("로그인 성공");				
			}
			else {
				System.out.println("비밀번호가 일치하지 않습니다");				
			}
		}
		else {
			System.out.println("존재하지 않는 회원입니다");			
		}
		
	}
}
