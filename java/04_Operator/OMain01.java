import java.util.Scanner;

public class OMain01 {
	// import 단축키 : ctrl + shift + o
	public static void main(String[] args) {
		
		// 대입 연산자 : = 		<- 같다는 뜻x, 오른쪽에 있는걸 담았다.
		// 같다 : ==
		int x = 10;
		
		// 키보드 입력 받을 준비
		Scanner sc = new Scanner(System.in);
		
		// 산술 연산자 : +, -, *, /, %
//		System.out.println("y값 : ");
//		int y = sc.nextInt();
//		
//		int hap = x + y;
//		System.out.println(hap);
//		
//		int p = x % y;
//		System.out.println(p);
		
		System.out.println("------------------------");
		
		// 대입 연산자 : +=, -=, *=, /=, %=
		
		System.out.println(x);
		
		x = x + 1;	// x에 x + 1을 담았다.
		System.out.println(x);
		
		x += 1;	// 줄여쓴거
		System.out.println(x);
		
		x -= 2; // x = x - 2
		System.out.println(x);
		
		x *= 2;	// x = x * 2
		System.out.println(x);
		
		x /= 3; // x = x / 3
		System.out.println(x);
		
		x %= 4;	// x = x % 4
		System.out.println(x);
		
		// 증감 연산자
		x++;	// 1 증가
		System.out.println(x);
		x--;	// 1 감소
		System.out.println(x);
	}
}
