import java.util.Random;
import java.util.Scanner;

public class RMain04_Test {
	public static void main(String[] args) {
		// 내가 입력한게 컴터 숫자랑 일치할때까지 반복 (맞추면 게임 끝)
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int comNum = r.nextInt(4);	// 0 ~ 3
				
		while (true) {
			System.out.println(comNum);	// 테스트용
			System.out.print("숫자를 입력하세요 (0~3) : ");
			int answer = sc.nextInt();
			
			if (comNum == answer) {
				System.out.println("정답!");
				break;
			}
		}
		
		// Up & Down
		
		// 홀짝 게임
		
	}
}
