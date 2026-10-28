import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("사는 곳을 입력하세요 : ");
		String address = sc.next();
		
		System.out.println("*".repeat(17));
		System.out.printf("* 이름\t: %s\t*\n", name);
		System.out.printf("* 나이\t: %s\t*\n", age);
		System.out.printf("* 사는곳\t: %s\t*\n", address);
		System.out.println("*".repeat(17));
	}
}
