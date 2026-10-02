import java.util.Scanner;

public class Test_Calendar {
	public static void main(String[] args) {
		// 각 월이 몇일까지 있는지 알려주는 프로그램
		
		// 사용자한테 월 입력받기
		// 판정
		// 결과 출력
		// "31일까지"
		// @ 1 ~ 12 벗어난 숫자는 "입력오류"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("해당 월을 입력하시오(1~12): ");
		int month = sc.nextInt();
		
		switch (month) {
		case 1, 3, 5, 7, 8, 10:
			System.out.println("31일까지");
			break;
		case 2:
			System.out.println("28일까지");
			break;
		case 4, 6, 9, 11:
			System.out.println("30일까지");
			break;
		default:
			System.out.println("입력오류");
			break;
		}
		
		
	}
}
