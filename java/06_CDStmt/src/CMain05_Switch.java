import java.util.Scanner;

public class CMain05_Switch {
	public static void main(String[] args) {

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
			System.out.println("4번 플랫폼");
			break;
		}

		Scanner sc = new Scanner(System.in);

		System.out.println("----------");
		System.out.println("몇 번 메뉴? (1~4)");
		System.out.println("1. Americano");
		System.out.println("2. CafeLatte");
		System.out.println("3. VanillaLatte");
		System.out.println("4. MokaLatte");

		int select = sc.nextInt();

		switch (select) {
		case 1:
			System.out.println("아메리카노 주문 받았습니다");
			break;
		case 2:
			System.out.println("카페라떼 주문 받았습니다");
			break;
		case 3:
			System.out.println("바닐라라떼 주문 받았습니다");
			break;
		case 4:
			System.out.println("모카라떼 주문 받았습니다");
			break;
		default:
			System.out.println("주문 안함?");
			break;
		}

		
		if (select == 1) {
			System.out.println("아메리카노 주문 받았습니다");
		} else if (select == 2) {
			System.out.println("카페라떼 주문 받았습니다");
		} else if (select == 3) {
			System.out.println("바닐라라떼 주문 받았습니다");
		} else if (select == 4) {
			System.out.println("모카라떼 주문 받았습니다");
		} else {
			System.out.println("다시 주문해주세요~");
		}
		
		String grade = "이병";		
		
		switch (grade) {
			case "이병":
				System.out.print("눈치, ");
			case "일병":
				System.out.print("부르면 튀어가기, ");
			case "상병":
				System.out.print("훈련, ");
			case "병장":
				System.out.print("잠");
			default:
				break;
		}
		System.out.println();
	
		if (grade == "이병") {
			System.out.println("눈치, 부르면 튀어가기, 훈련, 잠");
		} else if (grade == "일병") {
			System.out.println("부르면 튀어가기, 훈련, 잠");
		} else if (grade == "상병") {
			System.out.println("훈련, 잠");
		} else if (grade == "병장") {
			System.out.println("잠");
		}
		
		// 1 ~ 9 살 업어주기
		// 20대	펍 고고
		// 30대	일 열심히
		int age = 30;
		
		switch (age/10) {
		case 0:
			System.out.println("업어주기");
			break;
		case 2:
			System.out.println("펍 고고");
			break;
		case 3:
			System.out.println("일 열심히");
			break;

		default:
			break;
		}
		
		if( age < 10 ) {
			System.out.println("업어주기");
		}
		else if( 20 <= age && age < 30 ) {
			System.out.println("펍 고고");
		}
		else if( age < 40 ) {
			System.out.println("일 열심히");
		}
		
	}
}
