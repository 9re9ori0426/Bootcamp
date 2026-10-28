import java.util.Scanner;

import java.lang.ArrayIndexOutOfBoundsException;
import java.util.InputMismatchException;

public class EHMain02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		try {
			System.out.print("y : ");
			int y = sc.nextInt();
			
			System.out.println(x/y);
			
			int[] arr = {10, 20};
			System.out.printf("배열에 몇번째 값을 보시겠습니까? (0,1) : ");
			int idx = sc.nextInt();
			
			System.out.println(arr[idx]);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("아무튼 오류");
//			e.printStackTrace();
		}
		
		
//		int x = 0;
//		try {			
//			System.out.print("y : ");
//			int y = sc.nextInt();
//			
//			System.out.println(x/y);
//			
//			int[] arr = {10, 20};
//			System.out.printf("배열에 몇번째 값을 보시겠습니까? (0,1) : ");
//			int idx = sc.nextInt();
//			
//			System.out.println(arr[idx]);
//			
//		}
//		catch(ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열의 범위를 벗어난 값입니다.");
//		}
//		catch(InputMismatchException e) {
//			System.out.println("정수 값을 입력해주세요.");
//		}
	}
}
