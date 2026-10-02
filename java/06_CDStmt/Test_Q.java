import java.util.Scanner;

public class Test_Q {
	public static void main(String[] args) {
		// 문제 만들기
		Scanner sc = new Scanner(System.in);
		
		// if
		System.out.println("어려워요??");
		System.out.println("가. 그렇다\t나. 아니다");
		String ans = sc.next();
		
		// 가 - 조금 더 힘내세요 ^^
		// 나 - 굿~
		if (ans.equals("가")) {
			System.out.println("조금 더 힘내세요 ^^");
		}
		else if (ans.equals("나")) {
			System.out.println("굿~");
		}
		
		// switch
		System.out.println("재밋나요??");
		System.out.println("1. 네\t2. 별로...");
		int ans2 = sc.nextInt();
		
		// 1 -> good ^^
		// 2 -> ㅠㅠ
		// 나머지 -> ???
		switch (ans2) {
		case 1:
			System.out.println("good ^^");
			break;
		case 2:
			System.out.println("ㅠㅠ");
			break;

		default:
			System.err.println("???");
			break;
		}
	}
}
