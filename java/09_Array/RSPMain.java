import java.util.Random;
import java.util.Scanner;

public class RSPMain {
	public static void main(String[] args) {
		// 가위바위보
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int win = 0;
		int maxWin = 0;
		String RSP[] = {"가위", "바위", "보"};
		int com;
		int user;
		int winCnt = 0;
		int gmCnt = 0;
		int result;
		
		// 게임반복
		while (true) {
			// UI
//			com = 1;
			com = r.nextInt(3) + 1;
//			System.out.println(com);	// test
			System.out.println("--------------");
			System.out.println("1. 가위");
			System.out.println("2. 바위");
			System.out.println("3. 보");
			System.out.println("4. 게임종료");
			System.out.println("--------------");
			System.out.print("뭐?(숫자입력): ");
			user = sc.nextInt();
			
			// 예외처리
			if (user > 4 || user < 1) {
				System.err.println("잘못된 입력");
				
				continue;
			}
			
			// 몇 번 이겼나? - 종료시 총 이긴 횟수 안내하기
			// @ 최다 연승 횟수 안내
			if (user == 4) {
				System.out.println("총 이긴 횟수: " + winCnt);
				System.out.println("최다 연승 횟수: " + maxWin);
				System.out.println("종료");
				break;
			}
			
			gmCnt++;
			
			// 나 : 바위
			// 컴 : 보
			System.out.println("나 : " + RSP[user-1]);
			System.out.println("컴 : " + RSP[com-1]);
			
			// 판정 & 결과
			// 승 / 패 / 무승부
			result = user - com;
			if (result == 1 || result == -2) {
				// @ 연승
				win++;
				winCnt++;
				if (win > maxWin) {
					maxWin = win;
				}
				System.out.println("승!");
				// @ x 연승중!
				System.out.println(win + " 연승중!");
			}
			else if (result == -1 || result == 2) {
				win = 0;
				System.out.println("패...");
			}
			else {
				win = 0;
				System.out.println("무승부~");
			}

			// @ 현재 나의 승률 = 이긴거 / 전체 게임수 * 100
			System.out.printf("현재 나의 승률: %.1f%%\n", (double)winCnt / gmCnt * 100);
		}
		
		// (연승과 최다 연승은 다름. 2번 이겼다가 지면 연승은 깨지는거고
		// 4번 연승한적이 있다가 지고 2번 연승하고 게임을 종료하면 최다 연승은 4)
		
		
		
		
	}
}
