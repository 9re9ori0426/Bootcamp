import java.util.Iterator;

public class RMain01 {
	public static void main(String[] args) {
		// 반복문 Repeat Stmt
		
		// for(초기화; 조건; 증감) {반복될 코드}
		
		// 반복할 횟수가 명확하면 for
		for (int i = 0; i < 3; i++) {
			System.out.println("ㅋㅋㅋ");
		}
		
		// 반복 횟수가 명확하지 않으면 while
		int z = 0;
		while (z < 3) {
			System.out.println(11);
			z++;
		}
		
		// zzz를 콘솔에 3번 출력하시오.
		for (int i = 0; i < 3; i++) {
			System.out.println("zzz");
		}
		
		for (int i = 0; i < 6; i+=2) {
			System.out.println(1);
		}
		
		for (int i = 0; i < -1; i++) {
			System.out.println("ttt");
		}
		System.out.println("------------------");
		
		// 0 2 4 6
		
		for (int i = 0; i < 7; i+=2) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n====================");
		
		for (int i = 0; i < 7; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n-------------------");
		
		int total = 0;
		for (int i = 1; i <= 392; i++) {
			total += i;
		}
		System.out.println("총합 : " + total);
		
		// 1 ~ 20 다 곱하면 몇?
		
		long total3 = 1;
		for (int i = 1; i <= 20; i++) {
			total3 *= i;
		}
		System.out.println("총곱 : " + total3);
		
		// 구구단 2단 출력
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("2 x %d = %d\n", i, 2 * i);
		}
		
		// 1. 3단인데 홀수 곱한것만
		
		for (int i = 1; i <= 9; i+=2) {
			System.out.printf("3 x %d = %d\n", i , 3 * i);
		}
		
		// 2. 아래 딱 3개만 나오게
			// 4 x 9 = 36
			// 4 x 6 = 24
			// 4 x 3 = 12
		
		for (int i = 9; i > 0; i-=3) {
			System.out.printf("4 x %d = %d\n", i , 4 * i);
		}
		
	}
}
