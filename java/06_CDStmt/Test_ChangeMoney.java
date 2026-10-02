import java.util.Scanner;

public class Test_ChangeMoney {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 잔돈 계산하는 프로그램
		
		// 이렇게 입력하면...
		// 137894
		// 5만원 : 2장
		// 1만원 : 3장
		// 5천원 : 1장
		// 1천원 : 2장
		// 500원 : 1개
		// 100원 : 3개
		// 50원 : 1개
		// 10원 : 4개
		// 잔돈 계산 불가 금액 : 4원
		
		System.out.print("계산 금액? : ");
		int money = sc.nextInt();
		// 137894
		
		if (money >= 50000) {
			System.out.printf("5만원\t: %d장\n", money / 50000);
			money %= 50000;
		}
		if (money >= 10000) {
			System.out.printf("1만원\t: %d장\n", money / 10000);
			money %= 10000;
		}
		if (money >= 5000) {
			System.out.printf("5천원\t: %d장\n", money / 5000);
			money %= 5000;
		}
		if (money >= 1000) {
			System.out.printf("1천원\t: %d장\n", money / 1000);
			money %= 1000;
		}
		if (money >= 500) {
			System.out.printf("500원\t: %d개\n", money / 500);
			money %= 500;
		}
		if (money >= 100) {
			System.out.printf("100원\t: %d개\n", money / 100);
			money %= 100;
		}
		if (money >= 50) {
			System.out.printf("50원\t: %d개\n", money / 50);
			money %= 50;
		}
		if (money >= 10) {
			System.out.printf("10원\t: %d개\n", money / 10);
			money %= 10;
		}
		if (money > 0) {
			System.err.printf("잔돈 계산 불가 금액 : %d원", money);
		}
	}
}
