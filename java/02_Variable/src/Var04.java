import java.util.Scanner;

public class Var04 {
	
	public static void main(String[] args) {
		
		// 키보드 입력 받을 준비
		Scanner sca = new Scanner(System.in);
		
		// 이름 입력 받기
		System.out.print("이름 : ");
		String name = sca.next();
		
		//나이 입력 받기
		System.out.print("나이 : ");
		int age = sca.nextInt();
		
		System.out.println(name + "님, 당신은 " + age + "살 입니다.");
//		System.out.printf("%s님, 당신은 %d살 입니다.\n", name, age);
	}
}
