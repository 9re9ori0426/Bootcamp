import java.util.Scanner;

public class RMain05 {
	public static void main(String[] args) {

		// break; : 현재 위치에서 가장 가까운 switch 또는 반복문 탈출
		// continue : 현재 반복을 건너뛰고 증감식으로 넘어감

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}

		Scanner sc = new Scanner(System.in);
		int ans = 0;

		// 라벨 or 레이블 
		aaa : for (int i = 0; i < 3; i++) {
			bbb : while (true) {
				System.out.println("정답은?");
				ans = sc.nextInt();
				switch (ans) {
				case 1:
					System.out.println("정답");
					break;
				case 2:
					System.out.println("땡");
					break;
				case 3:
					System.out.println("종료");
//					break aaa;	// for문 탈출
//					break bbb; // while 탈출

				default:
					break;
				}
			}
//			if (ans == 3) {
//				break;
//			}				
		}
	}
}
