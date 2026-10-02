import java.util.InputMismatchException;
import java.util.Scanner;

public class EHMain02 {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);

		int x = 0;

		Thread.sleep(1000);
		try {
			System.out.println("y : ");
			int y = sc.nextInt();
			System.out.println(x / y);
			int[] ar = { 10, 20 };
			System.out.println("배열 몇번 볼래? (0,1):");
			int i = sc.nextInt();
			System.out.println(ar[i]);

			
			
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("오류 발생 다시 시도해주세요.");
		}

		
		
		
		
		
		
		
		
		
		try {
			System.out.println("y : ");
			int y = sc.nextInt();
			System.out.println(x / y);
			int[] ar = { 10, 20 };
			System.out.println("배열 몇번 볼래? (0,1):");
			int i = sc.nextInt();
			System.out.println(ar[i]);

		} catch (ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("0 ㄴㄴ");
		} catch (InputMismatchException e) {
			System.out.println("숫자 입력 해주세요~");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("0이나 1중에 입력 해주세요");
		}

	}
}
