
public class Var01 {
	public static void main(String[] args) {

		// 변수 : 프로그램 진행 중 발생하는 데이터의 임시저장.

		// 데이터 담는 그릇 (변수)
		// 내용물을 데이터 타입(형)

		// 변수 만들기
		// [자료형] [변수명]

		// 내 나이를 저장

		int myAge;
		myAge = 20;

		System.out.println(myAge);

		// 내 신발 사이즈 저장 (265)

		int myShoseSize; // 변수 선언
		myShoseSize = 265; // 초기화

		int myShoseSize2 = 265; // 변수 선언 및 초기화

		System.out.println(myShoseSize2);

		myShoseSize2 = 240;
		System.out.println(myShoseSize2);

		int theMoneyInMyBankAccount = 100000000; // camelCase
		int the_money_in_my_bank_account = 100000000; // snake
		// 주의 사항.
		// 소문자 시작 권장, 카멜케이스 권장
		// $의 경우 예약어를 써야 하는 경우, _ 언더바도 물론 가능
		int $int;

		// Test
		// 변수를 사용해서 콘솔에 출력
		int price = 1000;

		System.out.println("핸드폰 가격 : " + price + "$");
//		System.out.printf("핸드폰 가격 : %d$\n", price);

	}
}
