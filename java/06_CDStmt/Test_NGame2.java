import java.util.Random;
import java.util.Scanner;

public class Test_NGame2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int comNum = r.nextInt(100) + 1;	// 1 ~ 100
		System.out.println(comNum);
		
		// @ 몇번만에 맞췄는지? (맞추면 안내하기)
		// @ 횟수제한 5회 (남은 기회 : 10...9...8)
		// @ 예외처리 - ex) 1 ~ 100 아닌 숫자는 입력 오류
		
		int chance = 5;
		while (true) {			
			System.out.println("Num(1~100) : ");
			int userNum = sc.nextInt();
			
			if (userNum > 100 || userNum < 1) {
				System.err.println("입력 오류!");
				continue;
			}
			
			chance--;

			if (chance == 0) {
				System.out.println("제한 횟수 소진!");
				System.out.println("정답은 " + comNum + "이었습니다~");
				break;
			}
			
			if (userNum < comNum) {
				System.out.println("업!");
			}
			else if (userNum > comNum) {
				System.out.println("다운!");
			}
			else {
				System.out.println((5 - chance) + "번만에 정답!");
				break;
			}
			System.out.println("제한횟수 : " + chance);
			
		}
	}
}
