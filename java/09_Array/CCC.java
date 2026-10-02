import java.util.Random;
import java.util.Scanner;

public class CCC {
	public static void main(String[] args) {
		// 참참참
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		String[] faceTbl = { "왼쪽", "오른쪽", "위", "아래", "가만히" };

		int comNum = 0;
		int userNum = 0;
		int cnt = 0;

		while (true) {
			comNum = r.nextInt(5) + 1; // 1~5

			// UI
			System.out.println(comNum); // 확인용
			System.out.println("-----------------");
			System.out.println("1. 왼쪽");
			System.out.println("2. 오른쪽");
			System.out.println("3. 위");
			System.out.println("4. 아래");
			System.out.println("5. 가만히");
			System.out.println("-----------------");
			System.out.print("어디?: ");

			userNum = sc.nextInt();

			if (userNum < 1 || userNum > 5) {
				System.err.println("ERROR!");
				continue;
			}
			
			System.out.println("나 : " + faceTbl[userNum-1]);
			System.out.println("컴 : " + faceTbl[comNum-1]);

			// 판정
			if (comNum == userNum) {
				System.out.println("걸림");
				System.out.println(cnt + "번 버팀");
				break;
			}
			else {
				System.out.println("피함");
				cnt++;
			}
		}

		// 결과 출력
		// 나 : 왼쪽
		// 컴 : 위

		// 예외처리 (입력오류)
		// 피하면 여러번 할 수 있게
		// @ 몇번 버텼는지 안내
	}
}
