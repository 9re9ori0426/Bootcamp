import java.util.Scanner;

public class Test_ChangeMoney2 {
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
		
		int cnt = 0;
		
		if (money >= 50000) {
			cnt = money / 50000;
			System.out.printf("5만원\t: %d장\n", cnt);
			money -= 50000 * cnt;
		}
		if (money >= 10000) {
			cnt = money / 10000;
			System.out.printf("1만원\t: %d장\n", cnt);
			money -= 10000 * cnt;
		}
		if (money >= 5000) {
			cnt = money / 5000;
			System.out.printf("5천원\t: %d장\n", cnt);
			money -= 5000 * cnt;
		}
		if (money >= 1000) {
			cnt = money / 1000;
			System.out.printf("1천원\t: %d장\n", cnt);
			money -= 1000 * cnt;
		}
		if (money >= 500) {
			cnt = money / 500;
			System.out.printf("500원\t: %d개\n", cnt);
			money -= 500 * cnt;
		}
		if (money >= 100) {
			cnt = money / 100;
			System.out.printf("100원\t: %d개\n", cnt);
			money -= 100 * cnt;
		}
		if (money >= 50) {
			cnt = money / 50;
			System.out.printf("50원\t: %d개\n", cnt);
			money -= 50 * cnt;
		}
		if (money >= 10) {
			cnt = money / 10;
			System.out.printf("10원\t: %d개\n", cnt);
			money -= 10 * cnt;
		}
		System.out.printf("잔돈 계산 불가 금액 : %d", money);
	}
}
