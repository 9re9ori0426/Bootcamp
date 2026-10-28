import java.util.Scanner;

public class Test_ChangeMoney2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("잔돈 계산 프로그램");
		System.out.print("계산 금액 : ");
		
		int money = sc.nextInt();
		
		int cnt = 0;
		
		if(money >= 50000) {
			cnt = money/50000;
			System.out.printf("5만원\t: %d장\n", cnt);
			money -= 50000*cnt;			
		}
		if(money >= 10000) {
			cnt = money/10000;
			System.out.printf("1만원\t: %d장\n", cnt);
			money -= 10000*cnt;			
		}
		if(money >= 5000) {
			cnt = money/5000;
			System.out.printf("5천원\t: %d장\n", cnt);
			money -= 5000*cnt;		
		}
		if(money >= 1000) {
			cnt = money/1000;
			System.out.printf("1천원\t: %d장\n", cnt);
			money -= 1000*cnt;		
		}
		if(money >= 500) {
			cnt = money/500;
			System.out.printf("500원\t: %d개\n", cnt);
			money -= 500*cnt;		
		}
		if(money >= 100) {
			cnt = money/100;
			System.out.printf("100원\t: %d개\n", cnt);
			money -= 100*cnt;		
		}
		if(money >= 50) {
			cnt = money/50;
			System.out.printf("50원\t: %d개\n", cnt);
			money -= 50*cnt;	
		}
		if(money >= 10) {
			cnt = money/10;
			System.out.printf("10원\t: %d개\n", cnt);
			money -= 10*cnt;	
		}
		if(money > 0) {
			System.err.printf("잔돈 계산 불가 금액\t: %d원\n", money);
		}
	}
}
