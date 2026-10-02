
public class OMain02 {
	public static void main(String[] args) {
		// 논리(비교)연산자 : 결과로 boolean 나오는거 (참/거짓)
		// >(초과), >=(이상), <(미만), <=(이하), == 같다, !=(다르다)
		
		int x = 10;
		int y = 20;
		
		boolean a = x > y;
		System.out.println(a);
		System.out.println(x > y);
		
		// 결합연산자 : 논리 연산자 여러개 묶는거
		
		// && (AND) : A && B -> A랑 B를 모두 만족하면 true
		
		// || (OR) : A || B -> A나 B를 만족하면 true
		
		// ^ (XOR) : A ^ B -> A나 A 둘 중 하나만 만족하면 true
		
		// 단항 연산자
		// ! (NOT) : !A -> A의 결과를 반대로
		
		// x가 5보다 크고, y가 10보다 작나?
		boolean b = x > 5 && y < 10;
		System.out.println(b);
		
		// x가 5보다 크거나 y가 10보다 작나?
		boolean c = x > 5 || y < 10;
		System.out.println(c);
		
	// 놀이동산
		// 놀이기구를 타도 되는지 체크하는 프로그램
			// 키, 나이
		System.out.println("-----------------------");
		
		int height = 180;
		int age = 30;
		
		// 나이가 10살 이상이고, 키다 200 넘으면 타도 됨
		boolean ok = age >=10 && height > 200;
		System.out.println(ok);
		
		// 키가 200이 넘고, 나이가 10살 이상이면 타도 됨
		// 확률이 낮은걸 앞에 배치하면 연산횟수 줄일 수 있음.
		boolean ok2 = height > 200 && age >= 10;
		System.out.println(ok2);
		
		// 나이가 10살 이상이거나, 키다 200 넘으면 타도 됨
		// 확률이 높은걸 앞에 배치하면 연산횟수 줄어듬.
		boolean ok3 = age >= 10 || height > 200;
		System.out.println(ok3);
		
		// 키가 200이 넘거나, 나이가 10살 이상이면 타도 됨
		boolean ok4 = height > 200 || age >= 10;
		System.out.println(ok4);
		
		// 키가 200이 넘으면 타면 안됨
		height = 220;
		boolean ok5 = ! (height > 200);
		System.out.println(ok5);
		
		// 삼항 연산자 (참/거짓 개념)
			// 둘 중 하나
		
		// 조건식 ? true : false
		
		// 나이가 8살이 넘으면 welcome, 안 넘으면 go home
		String msg = age > 8 ? "welcome" : "go home";
		System.out.println(msg);
		
		// 짝수, 홀수
		System.out.println(age % 2 == 0);	// 짝수
		System.out.println(age % 2 == 1);	// 홀수
		
	// Test
		height = 168;
		age = 27;
		// 입장료
			// 키가 200 넘거나 나이 20 이상이면 10000원, 아니면 5000원
		int entryFee = height > 200 || age >= 20 ? 10000 : 5000;
		// 할인
			// 나이가 짝수면 1000원, 아니면 500원 할인
		int discount = age % 2 == 0 ? 1000 : 500;
		// 총요금
			// 입장료 - 할인
		int totalFee = entryFee - discount;
		// 결과 출력
			// 입장료	: ㅇㅇ원
			// 할인	: ㅇㅇ원
			// 총요금	: ㅇㅇ원
		System.out.println("입장료\t:\t" + entryFee + "원");
		System.out.println("할인\t:\t" + discount + "원");
		System.out.println("총요금\t:\t" + totalFee + "원");
	}
}
