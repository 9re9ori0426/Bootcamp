import java.util.Scanner;

public class Test_Q {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("어려워요??");
//		System.out.println("가. 그렇다, 나. 아니다");
//		String ans = sc.next();

		System.out.println("재밌나요??");
		System.out.println("1. 네, 2. 별로..");
		int ans2 = sc.nextInt();
		
		if(ans2 == 1) {
			System.out.println("good ^^");
		}
		else if(ans2 == 2) {
			System.out.println("ㅠㅠ");
		}
		else {
			System.err.println("???");
		}
		
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
		
		
		
		/*
		if(ans == "가") {
			System.out.println("ans == 가");
		}
		if(ans.equals("가")) {
			System.out.println("ans equals 가");
		}
		String test = "가";
		if(ans == test) {
			System.out.println("ans == test");
		}
		if(ans.equals(test)) {
			System.out.println("ans equals test");
		}
		
		if("가" != new String("가") ) {
			System.out.println("\"가\" != new String(\"가\")");
		}
		if("가".equals(new String("가")) ) {
			System.out.println("\"가\" equals new String(\"가\")");
		}
		*/
	}
}
