import java.util.Scanner;

public class EHMain {
	public static void main(String[] args) {

		/*
		 * 
		 * 에러(ERROR) : 자바 문법 안맞는거. 컴파일 못함. 프로그램 완성 안됨.
		 * 
		 * 경고(Warning) : 뒷정리 덜했거나, 사용하지 않는 자원.. 프로그램 동작 정상
		 * 
		 * 예외(Exception) : 프로그램 정상 동작. 예기치 않은 상황이 발생해서 실행 안되는거. 예외처리. 우리의 잘못x, 대비는 해야됨.
		 * 
		 */

		Scanner sc = new Scanner(System.in);


			System.out.println("x : ");
			int x = sc.nextInt();
			System.out.println("y : ");
			int y = sc.nextInt();

			System.out.println(x);

			try {
				System.out.println(x / y);
				test();
			} catch (Exception e) {
				System.out.println("0으로 나눌 수 없어요");
//				e.printStackTrace();
			}

	}
	
	public static void test() {
		int a = 1;
		int b = 0;
		int c = a / b;
		System.out.println("/ 0 ㄴㄴ요~~~~~~~");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
