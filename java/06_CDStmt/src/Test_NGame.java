import java.util.Random;
import java.util.Scanner;

public class Test_NGame {

	public static void main(String[] args) {
		// Up Down 게임
		
		// 1. 입력, 랜덤
		Scanner sc = new Scanner(System.in);		
		
		Random r = new Random();
		
		// 2. 컴퓨터 숫자 뽑기
		int rnd = r.nextInt(100)+1;
//		System.out.println("[debug]컴퓨터 : " + rnd);
		
		int cnt = 7;
		while(cnt > 0) {
			// 유저 입력
			System.out.printf("숫자를 입력하세요 (1~100) 남은 기회는 %d번 입니다.\n", cnt);
			int num = sc.nextInt();
			
			//판정 & 결과
			if(rnd > num) {
				System.out.println("업");
			}
			else if(rnd < num) {
				System.out.println("다운");
			}
			else {
				System.out.println("정답입니다!!");
				break;
			}
			cnt--;
			
		}
		
		if(cnt == 0) {
			System.out.printf("아쉽습니다. 답은 %d이었습니다!!\n", rnd);
		}
	}
}
