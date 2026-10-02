import java.util.Scanner;

public class AMain03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int aa[] = new int[4];
		
		for (int i = 0; i < 4; i++) {
			System.out.printf("입력할 값 %d : ", i + 1);
			aa[i] = sc.nextInt();
		}
		
		int total = 0;
		for (int i = 0; i < aa.length; i++) {
			total += aa[i];
		}
		System.out.println(total);
		
		total = 0;
		for (int e : aa) {
			total += e;
		}
		System.out.println(total);
		
		// 결과출력
		// 1 + 2 + 3 + 4 = 10

		System.out.println("------------------------------");
		
		total = 0;
		for (int i = 0; i < 4; i++) {
			System.out.printf("입력할 값 %d : ", i + 1);
			aa[i] = sc.nextInt();
			total += aa[i];
		}
		
		for (int i = 0; i < aa.length; i++) {
			System.out.print(aa[i] + (i == aa.length - 1 ? " = " : " + "));
		}
		System.out.println(total);
		
	}
}
