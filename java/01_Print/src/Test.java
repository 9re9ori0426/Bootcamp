
public class Test {
	// test
	
	// 콘솔에 다음을 출력하세요.
	
	public void print(String name, String age, String address) {
		System.out.println("*".repeat(17));
		System.out.printf("* 이름\t: %s\t*\n", name);
		System.out.printf("* 나이\t: %s\t*\n", age);
		System.out.printf("* 사는곳\t: %s\t*\n", address);
		System.out.println("*".repeat(17));
	}
	
	public static void main(String[] args) {
//		System.out.print("*****************\n");
//		System.out.print("* 이름\t: mz\t*\n");
//		System.out.print("* 나이\t: 20\t*\n");
//		System.out.print("* 사는곳\t: 강남\t*\n");
//		System.out.println("*".repeat(17));
		
		System.out.println("*****************\n* 이름\t: mz\t*\n* 나이\t: 20\t*\n* 사는곳\t: 강남\t*\n*****************");

		// 표준 출력 System.out
		// 표준 입력 System.in
		
		new Test().print("mz", "20", "강남");
	}
}
