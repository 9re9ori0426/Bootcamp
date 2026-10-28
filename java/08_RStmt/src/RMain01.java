
public class RMain01 {
	
	public static void main(String[] args) {
		// 반복문 Repeat statement
		
		for (int i = 0; i < 3; i++) {
			System.out.println("zzz");
		}
		
		for (int i = 0; i < -1; i++) {
			System.out.println("ttt");
		}
		System.out.println("----------------------------------------------------");
		
		for (int i = 0; i <= 6; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		for (int i = 0; i <= 3; i++) {
			System.out.print(i*2 + " ");
		}
		
		System.out.println("");
		System.out.println("----------------------------------------------------");
		
		for (int i = 0; i <= 6; i+=2) {
			if( i % 2 == 1 ) continue;
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 0; i < 7; i++) {
			if( i % 2 == 0 ) System.out.print(i + " ");
		}
		
		System.out.println("");
		System.out.println("----------------------------------------------------");
		
		int total = 0;
		for (int i = 1; i <= 392; i++) {
//			System.out.printf("%d = %d + %d\n", total + i, total, i);
			total += i;
		}
		System.out.printf("1부터 392까지의 합은 %d\n", total);
		
		// 1~20 곱하면
		long total2 = 1;
		for (int i = 1; i <= 20; i++) {
//			System.out.printf("%d = %d * %d\n", total2*i, total2, i);
			total2 *= i;
		}
		System.out.printf("1부터 20까지의 곱은 %d\n", total2);
		
		// 구구단 2단 출력
//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("구구단 %d단\n", i);
//			for (int j = 1; j <= 9; j++) {
//				System.out.printf("%d * %d = %d\n", i, j, i*j);
//			}
//		}
		for (int i = 1; i <= 9; i++) {
			System.out.printf("2 * %d = %d\n", i, 2*i);
		}
		
		System.out.println("----------------------------------------------------");
		//구구단 3단 출력
		for (int i = 1; i <= 5; i++) {
			System.out.printf("3 * %d = %d\n", i*2-1, 3*(i*2-1) );
		}
		
		System.out.println("----------------------------------------------------");
		//구구단 3단 출력
		for (int i = 3; i >= 1; i--) {
			System.out.printf("4 * %d = %d\n", i*3, 4*(i*3) );
		}
		
		
	}
}
