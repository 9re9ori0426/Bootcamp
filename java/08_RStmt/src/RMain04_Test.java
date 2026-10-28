import java.util.Scanner;
import java.util.Random;

public class RMain04_Test {
	public static Random rnd = new Random();

	public static int getRnd(int num) {

		return rnd.nextInt(num) + 1;
	}

	public static void gameOE(Scanner sc) {
		while (true) {
			System.out.println("1. 홀\t2.짝 (0: 종료)");
			int myNum = sc.nextInt();

			if (myNum == 0) {
				break;
			}
			if (myNum > 2 || myNum < 0) {
				System.err.println("범위를 벗어났습니다. 다시 입력해주십시오.");
				continue;
			}

			int rnd = getRnd(10);

			if (rnd % 2 == myNum % 2) {
				System.out.println("정답");
			} else {
				System.err.println("땡");
			}

			System.out.println("컴퓨터는 : " + rnd + "개로 " + (rnd % 2 == 1 ? "홀" : "짝") + "이었습니다.");
		}
	}

	public static void gameUD(Scanner sc) {
		int rnd = getRnd(100);

		int cnt = 5;
		while (cnt > 0) {
			// 유저 입력
			System.out.printf("숫자를 입력하세요 (1~100) 남은 기회는 %d번 입니다.\n", cnt);
			int num = sc.nextInt();
			
			if( num < 1 || num > 100) {
				System.err.println("범위를 벗어났습니다. 다시 입력해주세요.");
				continue;
			}

			// 판정 & 결과
			if (rnd > num) {
				System.out.println("업");
			} else if (rnd < num) {
				System.out.println("다운");
			} else {
				System.out.printf("정답입니다!! %d번 만에 맞추셨습니다.\n", 7-cnt+1);
				break;
			}
			cnt--;
		}

		if (cnt == 0) {
			System.out.printf("아쉽습니다. 답은 %d이었습니다!!\n", rnd);
		}
	}

	public static void gameTest(Scanner sc) {
		int rnd = getRnd(10);
		int myNum;

		while (true) {
			System.out.printf("숫자를 입력하세요 (1~%d) : ", 10);
			myNum = sc.nextInt();

			if (rnd == myNum) {
				System.out.printf("정답입니다! 컴퓨터도 %d이었습니다\n", rnd);
				break;
			} else {
				System.err.println("틀렸습니다 다시 시도하세요");
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean skip = false;
		int select = 0;
		while (true) {
			if( skip == false ) {
				System.out.println("할 게임을 선택하세요 (1~3)");
				System.out.println("1. 홀짝");
				System.out.println("2. 업다운");
				System.out.println("3. 숫자 맞추기");
	
				select = sc.nextInt();
			}

			switch (select) {
			case 1:
				System.out.println("홀짝 게임을 선택하셨습니다.");
				gameOE(sc);
				break;
			case 2:
				System.out.println("업다운 게임을 선택하셨습니다.");
				gameUD(sc);
				break;
			case 3:
				System.out.println("숫자맞추기 게임을 선택하셨습니다.");
				gameTest(sc);
				break;
			default:
				break;
			}
			
			System.out.println("같은 게임을 다시 하겠습니까? Y : N");
			String re = sc.next();
			if(re.equals("Y") || re.equals("y")) {
				skip = true;
			}
			else {
				skip = false;
				System.out.println("게임을 종료하시겠습니까? Y : N");
				re = sc.next();
				if(re.equals("Y") || re.equals("y")) {
					System.out.println("게임을 종료합니다.");
					break;
				}
			}
			
			
		}

	}
}
