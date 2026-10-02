import java.util.Random;
import java.util.Scanner;

public class Test_OE2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Random r = new Random();
		
		while (true) {
			int comNum = r.nextInt(10);	// 0 ~ 9
			System.out.println(comNum);
			System.out.println("1. 홀\t2. 짝\t3. 종료");
			int ans = sc.nextInt();
			
			if (ans == 3) {
				System.out.println("종료합니다.");
				break;
			}
			else if (ans != 1 && ans != 2) {
				System.err.println("입력오류");
				continue;
			}
			
			if (ans % 2 == comNum % 2) {
				System.out.println("정답~");
			}
			else {
				System.out.println("땡!");
			}			
		}

	}
}
