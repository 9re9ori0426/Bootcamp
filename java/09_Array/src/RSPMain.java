import java.util.Random;
import java.util.Scanner;

public class RSPMain {
	
	public static String redText(String str) {
		return "\u001B[31m" + str +"\u001B[0m";
	}
	
	public static String blueText(String str) {
		return "\u001B[34m" + str +"\u001B[0m";
	}
	
	public static void print_dot(int num) throws InterruptedException {
		for (int i = 0; i < num; i++) {
			System.out.print("-");
			Thread.sleep(50);
		}
		System.out.println();
	}
	
	public static void gawi_bawi_bo() throws InterruptedException {
		System.out.print("가위");
		Thread.sleep(100);
		System.out.print(".");
		Thread.sleep(100);
		System.out.print(".");
		Thread.sleep(100);
		System.out.print("바위");
		Thread.sleep(100);
		System.out.print(".");
		Thread.sleep(100);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print("보");
		Thread.sleep(100);
		System.out.print("!");
		Thread.sleep(100);
		System.out.println("!");
		Thread.sleep(300);
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		//가위 바위 보
		String[] msg = {"가위", "바위", "보"};
		
		//@옃 연승 중
		//@최다 연승 횟수
		//@현재 나의 승률 이긴거 / 전체 게임수 100%
		
		int sel;
		int rnd;
		
		int gameCnt = 0;
		int winCnt = 0;
		int drawCnt = 0;
		int winStreak = 0; //현재 연승
		int maxWinStreak = 0; //최다연승
		while(true) {
			System.out.println("-------------------------");
			System.out.println("| 1. 가위 \t\t|");
			System.out.println("| 2. 바위 \t\t|");
			System.out.println("| 3. 보 \t\t\t|");
			System.out.println("| 4. 게임종료 \t\t|");
			System.out.println("-------------------------");
			sel = sc.nextInt();
			
			if( sel == 4 ) {
				System.out.println("게임 종료");
				break;
			}
			if(sel < 1 || 3 < sel) {
				System.err.println("입력 오류 1~3사이의 숫자를 입력하세요");
				continue;
			}

			gawi_bawi_bo();
			rnd = r.nextInt(3)+1;

			System.out.println("-------------------------");
			System.out.printf("| 나 : %s\t\t|\n", msg[sel-1]);
			System.out.printf("| 컴 : %s\t\t|\n", msg[rnd-1]);
			
			if( rnd - sel == 1 || rnd - sel == -2 ) {
				//짐
				System.out.println("|\t" + redText("졌습니다..") + "\t\t|");
				winStreak = 0;
			}
			else if( sel == rnd ) {
				//무승부
				System.out.println("|\t무승부\t\t|");
				
				drawCnt++;
				//연승은 유지
			}
			else {
				//이김
				System.out.println("|\t" + blueText("이겼습니다!!") + "\t\t|");
				winCnt++;
				winStreak++;
				System.out.printf("| 현재 " + redText("%d연승중!!") + "\t\t\t|\n", winStreak);
				
				if(winStreak > maxWinStreak ) maxWinStreak = winStreak;
			}
			System.out.println("-------------------------");

			gameCnt++;
			System.out.printf("현재까지 승률 : \t%.2f\n", gameCnt-drawCnt > 0 ? winCnt/(double)(gameCnt-drawCnt)*100 : 0.0);
			
		}

		System.out.print("결과 ");
		print_dot(21);
		System.out.printf("최종 승률 \t: ");
		Thread.sleep(300);
		System.out.printf("%.2f%%\n", gameCnt-drawCnt > 0 ? winCnt/(double)(gameCnt-drawCnt)*100 : 0.0);
		Thread.sleep(300);
		System.out.printf("총 이긴 횟수 \t: ");
		Thread.sleep(300);
		System.out.printf("%d회\n", winCnt);
		Thread.sleep(300);
		System.out.printf("최다연승 \t\t: ");
		Thread.sleep(300);
		System.out.printf("%d회\n", maxWinStreak);
		Thread.sleep(300);
		System.out.printf("총 게임 횟수 \t: ");
		Thread.sleep(300);
		System.out.printf("%d회\n", gameCnt);
		Thread.sleep(300);
		System.out.printf("총 무승부 횟수 \t: ");
		Thread.sleep(300);
		System.out.printf("%d회\n", drawCnt);
		Thread.sleep(300);
		System.out.println("-------------------------");
	}
}
