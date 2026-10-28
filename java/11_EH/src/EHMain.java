import java.util.InputMismatchException;
import java.util.Scanner;

public class EHMain {
	
	public static void test() {
		int a = 1;
		int b = 0;
		int c = a/b;
		
		System.out.println("/ 0 ㄴㄴ요~~~~");
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("x : ");
			int x = sc.nextInt();
			System.out.print("y : ");
			int y = sc.nextInt();
			
			System.out.printf("x : %d\n", x);
			System.out.println(x/y);	
			
			test();
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");		
		}
		catch(InputMismatchException e) {
			System.out.println("정수를 입력해 주세요");		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		test();
	}
}
