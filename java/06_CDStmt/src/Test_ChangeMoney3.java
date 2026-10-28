import java.util.Scanner;

public class Test_ChangeMoney3 {
		
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("잔돈 계산 프로그램");
		System.out.print("계산 금액 : ");

		int money = sc.nextInt();

		int[] units = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		String[] ko = { "5만원", "만원", "5천원", "천원", "오백원", "백원", "오십원", "십원" };
		
		for (int i = 0; i < units.length; i++) {
			if (money >= units[i]) {
				System.out.printf("%s\t: %d%s\n", ko[i], money / units[i], i <= 3 ? "장" : "개");
				money %= units[i];
			}
		}

		if (money > 0) {
			System.err.printf("잔돈 계산 불가 금액\t: %d원\n", money);
		}
	}
}
