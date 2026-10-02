import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 1 : ");
		int n1 = sc.nextInt();
		System.out.print("입력 2 : ");
		int n2 = sc.nextInt();
		System.out.print("입력 3 : ");
		int n3 = sc.nextInt();
		System.out.print("입력 4 : ");
		int n4 = sc.nextInt();
		int total = n1 + n2 + n3 + n4;
		
		System.out.printf("%d + %d + %d + %d = %d\n", n1, n2, n3, n4, total);
		System.out.printf("총합 : %d", total);
	}
}
