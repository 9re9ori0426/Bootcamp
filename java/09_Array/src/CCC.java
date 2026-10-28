
import java.util.Random;
import java.util.Scanner;

public class CCC {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		
		System.out.println("-".repeat(24));
		System.out.println("1. 왼쪽");
		System.out.println("2. 오른쪽");
		System.out.println("3. 위");
		System.out.println("4. 아래");
		System.out.println("5. 가만히");
		System.out.println("-".repeat(24));
		

		int sel;
		int rnd;
		String[] msg = {"왼쪽", "오른쪽", "위", "아래", "가만히"};
		String[] msg_suffix = {"으로", "으로", "로", "로", "로"};
		
		int cnt = 0;
		
		while(true) {
			System.out.print("어디 ?? (1~5) 0은 종료 : ");
			sel = sc.nextInt();
			
			if(sel < 0 || sel > 5) {
				System.err.println("입력 오류!! 다시 입력해주세요.");
				continue;
			}
			
			if(sel == 0) {
				break;
			}
				
			rnd = r.nextInt(5)+1;
			
			if(rnd == sel) {
				System.out.printf("컴퓨터는 [%s], 당신은 [%s]%s \u001B[31m걸렸습니다\u001B[0m\n", msg[rnd-1], msg[sel-1], msg_suffix[sel-1]);
				break;
			}
			else {
				System.out.printf("컴퓨터는 [%s], 당신은 [%s]%s \u001B[34m피했습니다\u001B[0m\n", msg[rnd-1], msg[sel-1], msg_suffix[sel-1]);
				cnt++;
			}
		}
		
		System.out.printf("총 %d번 피했습니다.\n", cnt);
	}
}
