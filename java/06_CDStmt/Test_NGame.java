import java.util.Random;
import java.util.Scanner;

public class Test_NGame {
	public static void main(String[] args) {
		// Up Down
		
		// 1. 입력, 랜덤
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		// 2. 컴터 숫자뽑기
		int comNum = r.nextInt(100) + 1;	// 1 ~ 100
//		System.out.println(comNum);	// 개발자 테스트용
		
		// 3. 유저 입력
		System.out.println("Num(1~100) : ");
		int userNum = sc.nextInt();
		
		// 4. 판정 & 결과 (업, 다운, 정답)
		if (userNum < comNum) {
			System.out.println("업!");
		}
		else if (userNum > comNum) {
			System.out.println("다운!");
		}
		else {
			System.out.println("정답!");
		}
		
	}
}
