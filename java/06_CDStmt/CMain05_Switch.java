import java.util.Scanner;

public class CMain05_Switch {
	public static void main(String[] args) {
		// if, else <--> 삼항연산자
		// if <--> switch case
		
		String line = "야마노테센";
		
		switch (line) {
		case "jr":
			System.out.println("1번 플랫폼");
			break;
		case "야마노테센":
			System.out.println("2번 플랫폼");
			break;
		case "한큐":
			System.out.println("3번 플랫폼");
			break;

		default:
			break;
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------");
		System.out.println("몇 번 메뉴? (1~4)");
		System.out.println("1. Americano");
		System.out.println("2. CafeLatte");
		System.out.println("3. VanillaLatte");
		System.out.println("4. MokaLatte");
		
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("아메리카노 주문 받았습니다.");
			break;
		case 2:
			System.out.println("카페라떼 주문 받았습니다.");
			break;
		case 3:
			System.out.println("바닐라라떼 주문 받았습니다.");
			break;
		case 4:
			System.out.println("모카라떼 주문 받았습니다.");
			break;

		default:
			System.out.println("다시 주문해주세요~");
			break;
		}
		
		if (num == 1) {
			System.out.println("아메리카노 주문 받았습니다.");
		}
		else if (num == 2) {
			System.out.println("카페라떼 주문 받았습니다.");
		}
		else if (num == 3) {
			System.out.println("바닐라라떼 주문 받았습니다.");
		}
		else if (num == 4) {
			System.out.println("모카라떼 주문 받았습니다.");
		}
		else {
			System.out.println("다시 주문해주세요~");
		}
		
		// 이병(1), 일변(2), 상병(3), 병장(4)
		
		// 이변 : 눈치, 부르면 튀어가기, 훈련, 잠
		// 일병 : 부르면 튀어가기, 훈련, 잠
		// 상병 : 훈련, 잠
		// 병장 : 잠
		
		String grade = "상병";
		
		switch (grade) {
		case "이병":
			System.out.println("눈치");
		case "일병":
			System.out.println("부르면 튀어가가기");
		case "상병":
			System.out.println("훈련");
		case "병장":
			System.out.println("잠");
			break;

		default:
			break;
		}
		
		if (grade == "이병") {
			System.out.println("눈치");
			System.out.println("부르면 튀어가기");
			System.out.println("훈련");
			System.out.println("잠");
		}
		else if (grade == "일병") {
			System.out.println("부르면 튀어가기");
			System.out.println("훈련");
			System.out.println("잠");
		}
		else if (grade == "상병") {
			System.out.println("훈련");
			System.out.println("잠");
		}
		else if (grade == "병장") {
			System.out.println("잠");
		}
		
		// 1 ~ 9살 업어주기
		// 20대 펍 고고
		// 30대 일 열심히
		
		int age = 27;
		
		switch (age) {
		case 1, 2, 3, 4, 5, 6, 7, 8, 9:
			System.out.println("업어주기");
			break;
		case 20, 21, 22, 23, 24, 25, 26, 27, 28, 29:
			System.out.println("펍 고고");
		break;
		case 30, 31, 32, 33, 34, 35, 36, 37, 38, 39:
			System.out.println("일 열심히");
		break;

		default:
			break;
		}
		
		if (age < 10) {
			System.out.println("업어주기");
		}
		else if (age >= 20 && age < 30) {
			System.out.println("펍 고고");
		}
		else if (age < 40) {
			System.out.println("일 열심히");
		}
		
	}
}
