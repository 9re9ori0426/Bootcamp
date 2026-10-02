import java.util.Scanner;

public class Var04 {
	public static void main(String[] args) {
		
		// 키보드 입력 받을 준비
		Scanner sc = new Scanner(System.in);
		
		// 이름 입력 받기
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		
		// 나이 입력 받기
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		System.out.println(name + "님, 당신은 " + age + "살입니다.");
		
	}
}
