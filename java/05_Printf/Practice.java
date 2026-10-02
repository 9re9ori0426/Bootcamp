import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		// ***************
		// * 이름	  : dw   *
		// * 나이  : 20   *
		// * 사는곳 : 종로  *
		// ***************
		
		// 값을 입력 받아 처리
		// 변수 3개
		
		// printf
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오 : ");
		String name = sc.next();		
		System.out.print("나이을 입력하시오 : ");
		int age = sc.nextInt();
		System.out.print("사는곳을 입력하시오 : ");
		String place = sc.next();
		
		System.out.println("*****************");
		System.out.printf("* 이름\t: %s\t*\n", name);
		System.out.printf("* 나이\t: %d\t*\n", age);
		System.out.printf("* 사는곳\t: %s\t*\n", place);
		System.out.println("*****************");
	}
}
