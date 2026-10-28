// 삼항 연산자

public class CMain01 {

	public static void main(String[] args) {

		int age = 70;

		if (age >= 70) {
			System.out.println("안녕하십니까");
		} else {
			System.out.println("안녕하세요");
		}

		System.out.println(age >= 70 ? "안녕하십니까" : "안녕하세요");

		int age2 = 3;
		if (age2 % 2 == 1 && age2 < 10) {
			System.out.println("ㅋㅋㅋ");
		} else {
			System.out.println("ㅎㅎㅎ");
		}

		System.out.println(age2 % 2 == 1 && age2 < 10 ? "ㅋㅋㅋ" : "ㅎㅎㅎ");
		
		
		if( age2 > 1 && age2 < 5 ) {
			System.out.println("ㅎㅅㅎ");
		}
		System.out.println(age2 > 1 && age2 < 5 ? "ㅎㅅㅎ" : "");
		
		String msg = age2 % 2 == 1 && age2 < 10 ? age2 > 1 && age2 < 5 ? "ㅎㅅㅎ" : "ㅋㅋㅋ" : "ㅎㅎㅎ";
		System.out.println(msg);
		
		
		// 성인 & 아이 동반 탑승 유무
		System.out.println("-".repeat(50));
		
		//age : 70, age2 : 3
		int height = 100;
		
		if( age > 20 || ( age2 >= 3 && height > 80 ) ) {
			System.out.println("동반 탑승 가능");
		}
		else {
			System.err.println("동반 탑승 불가");
		}
		
		
		
		
		
		
		
		
		
	}
}
