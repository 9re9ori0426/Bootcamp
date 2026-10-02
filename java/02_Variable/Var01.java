
public class Var01 {
	public static void main(String[] args) {
		// 변수 : 프로그램 진행 중 발생하는 데이터의 임시저장.

		// 데이터 담는 그릇(변수)
		// 내용물을 데이터 타입(형)

		// 데이터는 수정 가능

		// 변수 만들기
		// 자료형(그릇) 변수명(그릇 이름)

		int a = 0;

		System.out.println(a);
		System.out.println(0);
		System.out.println("a");

		// 내 나이를 저장

		int myAge; // myAge라는 그릇 생성
		myAge = 27; // 거기에 27을 담음

		System.out.println(myAge);
		System.out.println("myAge");
		System.out.println(27);

		// 내 신발 사이즈 저장 (255)

		int shoeSize; // 변수 선언
		shoeSize = 255; // 초기화

		int shoeSize2 = 250; // 29,30 한번에. 선언 및 초기화

		System.out.println(shoeSize);
		System.out.println(shoeSize2);

		shoeSize2 = 260;
		System.out.println(shoeSize2);

		int theMoneyInMyBankAccount = 1000000000; // camel case
		int the_money_in_my_bank_account = 1000000000;

		// 변수명 잘 쓰자.
		// 주의사항.
		// 숫자 시작 x, 자바문법(예약어) x, 소문자로 시작 -> 약속
		// 띄어쓰기 대신 낙타체 또는 _
		// 특수문자는 _($도 가능) -> 예약어의 경우.

		// Test

		// 변수를 사용해서 콘솔에 출력
		// 핸드폰 가격 : 1000$

		int price = 1000;
		System.out.print("핸드폰 가격 : ");
		System.out.print(price);
		System.out.println("$");
		
		// syso 한줄만.
		System.out.println("핸드폰 가격 : " + price + "$");
	}
}
