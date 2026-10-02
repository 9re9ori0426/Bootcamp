
public class CMain04 {
	public static void main(String[] args) {
		// if, else if (여러 조건 중 하나만)
		
		// 1. 5배수 조건 "ㅇㅇ"은 5의 배수 출력
		// 2. 2배수 조건 "ㅇㅇ"은 2의 배수 출력
		// 3. 4배수 조건 "ㅇㅇ"은 4의 배수 출력
		// "해당없음" 출력
		
		int a = 4;
		
		if (a % 5 == 0) {
			System.out.println(a + "는 5의 배수");
		}
		else if (a % 2 == 0) {
			System.out.println(a + "는 2의 배수");
		}
		else if (a % 4 == 0) {
			System.out.println(a + "는 4의 배수");
		}
		else {
			System.out.println("해당 없음");
		}
		
		// 위에서 인지한 이슈
		
		// ex) 4 -> 2배수, 4배수
		//     6 -> 2배수
		
		if (a % 5 == 0) {
			System.out.println(a + "5배수");
		}
		else if (a % 2 == 0) {
			System.out.println(a + "2배수");
			if (a % 4 == 0) {
				System.out.println(", 4배수");
			}
		}
		else {
			System.out.println("해당 없음");
		}
		
		
	}
}
