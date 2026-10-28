import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 1 : ");
		int a = sc.nextInt();
		System.out.print("입력 2 : ");
		int b = sc.nextInt();
		System.out.print("입력 3 : ");
		int c = sc.nextInt();
		System.out.print("입력 4 : ");
		int d = sc.nextInt();
				
		int sum = a+b+c+d;
		System.out.printf("%d + %d + %d + %d = %d\n", a, b, c, d, sum);
		System.out.printf("총합 : %d\n", sum);
		
		/*
		if(){
			int[] arr = new int[4];
			int arrSum = 0;
			for(int i = 0; i < 4; i++) {
				System.out.printf("입력 %d : ", i+1);
				arr[i] = sc.nextInt();
				arrSum += arr[i];
			}
			System.out.printf("%d + %d + %d + %d = %d\n", arr[0], arr[1], arr[2], arr[3], arrSum);
			System.out.printf("총합 : %d\n", arrSum);
		}
		*/
	}
}
