import java.util.Random;
import java.util.Scanner;

public class Test_OE {
	public static void main(String[] args) {
		// Odd Even 홀짝 게임.

		// 입력
		Scanner sc = new Scanner(System.in);

		// 랜덤숫자 뽑을 준비
		Random r = new Random();
		int comNum = r.nextInt(10);	// 0 ~ 9
//		System.out.println(comNum);	// 개발자 확인용

		// 사용자 숫자 입력창
		System.out.println("1. 홀\t2. 짝");
		int ans = sc.nextInt();

		// 판정
			// 내가 홀인데 컴터도 홀이면 -> 정답
			// 내가 홀인데 컴터가 짝이면 -> 땡
			// 내가 짝인데 컴터도 짝이면 -> 정답
			// 내가 짝인데 컴터가 홀이면 -> 땡
		
		if (ans % 2 == comNum % 2) {
			System.out.println("정답~");
		}
		else {
			System.out.println("땡!");
		}
		
		// 결과 출력

	}
}
