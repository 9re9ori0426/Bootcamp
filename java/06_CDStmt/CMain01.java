// 조건문 (Conditional Statement)
public class CMain01 {
	public static void main(String[] args) {
		// if, else문 (둘 중 하나, 맞냐 아니냐)
		
		int age = 70;
		
		// 나이가 70이상이면 "안녕하십니까" : 아니면 "안녕하세요"
		if (age >= 70) {
			System.out.println("안녕하십니까");
		}
		else {
			System.out.println("안녕하세요");
		}
		
		String msg = age >= 70 ? "안녕하십니까" : "안녕하세요";
		System.out.println(msg);
		
		// 나이가 홀수이고, 10살 미만이면 "ㅋㅋㅋ" 아니면 "ㅎㅎㅎ" 출력
		int age2 = 3;
		
		if (age2 % 2 == 1 && age2 < 10) {
			System.out.println("ㅋㅋㅋ");
		}
		else {
			System.out.println("ㅎㅎㅎ");
		}
		
		System.out.println(age2 % 2 == 1 && age2 < 10 ? "ㅋㅋㅋ" : "ㅎㅎㅎ");
		
		// 나이가 1살 초과, 5살 미만이면 "ㅎㅅㅎ" 출력
		System.out.println(age2 > 1 && age2 < 5 ? "ㅎㅅㅎ" : "");
		
		if (age2 > 1 && age2 < 5) {
			System.out.println("ㅎㅅㅎ");
		}
		
		// 성인 & 아이 동반탑승 가능?
		
		// age, age2
		int height = 100;	// age2의 키
		
		// age가 20살 넘거나, agee2가 3살 이상이고, 키가 80 넘으면
		// "동반 탑승 가능" 출력
		// 아니면 "탑승 불가" 출력
		
		if (age > 20 || age2 >= 3 && height > 80) {
			System.out.println("동반 탑승 가능");
		}
		else {
			System.err.println("동반 탑승 불가");
		}
		
		
		
	}
}
