
import java.util.Scanner;

public class RMain04 {
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i+1;
		}
		System.out.println("총 합 : " + sum);
		
		int sum2 = 0;
		int cnt = 1;
		while(sum2 < 5000) {
			sum2 += cnt;
			cnt++;
		}
		System.out.printf("%d까지의 총 합 : %d\n", cnt-1, sum2);
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		int sum3 = 0;
		while(true) {
			System.out.print("e : (0입력시 종료)");
			input = sc.nextInt();
			sum3 += input;
			
			if(input == 0) {
				System.out.println("총합은 : "+ sum3);
				break;
			}
		}
		
		System.out.println("-".repeat(50));
		
		int aaa;
		while(true) {
			System.out.println("입력 : (10입력시 종료)");
			aaa = sc.nextInt();
			if( aaa == 10 ) {
				System.out.println("종료!");
				break;
			}
		}
		
		int sum4 = 0;
		int cnt4 = 1;
		System.out.println("몇까지 더하면 500이 넘을까");
		while(true) {
			System.out.printf("%d ", cnt4);
			sum4 += cnt4;
			if(sum4 > 500) {
				System.out.printf("= %d\n", sum4);
				System.out.printf("%d까지 더하면 500이 넘습니다", cnt4);
				break;
			}
			System.out.print("+ ");
			cnt4++;
		}
	}
}
