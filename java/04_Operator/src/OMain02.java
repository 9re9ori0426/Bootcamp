
public class OMain02 {
	public static void main(String[] args) {
		// 논리 비교 연산자 : 결과로 boolean 나오는 거
		// >, >=, <, <=, ==, !=
		
		int x = 10;
		int y = 20;
		
		System.out.println(x > y);
		
		// 결합 연산자 : 논리 연산자 여러개 묶는 거
		// &&, ||, ^(XOR), !(NOT)
		
		boolean ret = x > 5 && y < 10;
		System.out.printf("x > 5 %b\n", x > 5);
		System.out.printf("y < 10 %b\n", y < 10);
		System.out.printf("x > 5 && y < 10 %b\n", ret);
		
		boolean ret2 = x > 5 || y < 10;
		System.out.printf("x > 5 || y < 10 %b\n", ret2);
		
		System.out.println("-".repeat(50));
		// 놀이동산
			// 놀이 기구를 타도 되는지 체크하는 프로그램
				//키, 나이
		int height = 180;
		int age = 30;
		
		System.out.print("나이가 10살 이상이고, 키가 200넘는가?\t\t");
		boolean ok = age >= 10 && height > 200;
		System.out.println(ok ? "예" : "아니오");		
		
		System.out.print("키가 200이 넘고, 나이가 10살 이상인가?\t\t");
		boolean ok2 = height > 200 && age >= 10;
		System.out.println(ok2 ? "예" : "아니오");		

		System.out.print("나이가 10살 이상이거나, 키가 200넘는가?\t");
		boolean ok3 = age >= 10 || height > 200;
		System.out.println(ok3 ? "예" : "아니오");		
		
		System.out.print("키가 200이 넘거나, 나이가 10살 이상인가?\t");
		boolean ok4 = height > 200 || age >= 10;
		System.out.println(ok4 ? "예" : "아니오");	
		
//		boolean test = true ^ true;
//		System.out.println("true ^ true\t" + (test ? "예" : "아니오") );		
//		test = true ^ false;
//		System.out.println("true ^ false\t" +  (test ? "예" : "아니오") );		
//		test = false ^ false;
//		System.out.println("false ^ false\t" +  (test ? "예" : "아니오") );		

		System.out.println("-".repeat(50));
		int hongmanHeight = 220;
		boolean hongmanOk = hongmanHeight <= 200;
		System.out.print("hongmanHeight <= 200\t\t\t");
		System.out.println(hongmanOk ? "탈수 있음" : "탈수 없음");
		hongmanOk = !(hongmanHeight > 200);
		System.out.print("!(hongmanHeight > 200)\t\t\t");
		System.out.println(hongmanOk ? "탈수 있음" : "탈수 없음");
		
		//삼항 연산자 (참/거짓 개념)
			// 둘 중 하나
		
		//조건식 ? true : false
		
		//나이가 8살이 넘으면 welcome, 안넘으면 go home
		String str = age > 8 ? "welcome" : "go home";
		System.out.println(str);
	
		//짝수, 홀수
		System.out.printf("age 30은 %s\n", age%2 == 0 ? "짝수" : "홀수");
		System.out.printf("age 30은 %s\n", age%2 == 1 ? "홀수" : "짝수");
		
		
		System.out.println("-".repeat(50));
		// Test
		int fee = (height > 200 || age >= 20 ) ? 10000 : 5000;
		int dscnt = age%2 == 0 ? 1000 : 500; 
		int ret3 = fee - dscnt;
		
		System.out.println("입장료\t: " + fee + "원");
		System.out.println("할인\t: " + dscnt + "원");
		System.out.println("총 요금\t: " + ret3 + "원");
		
		String fee1 = height > 200 || age >= 20 ? "10000원" : "5000원";
		String dscnt1 = age%2 == 0 ? "1000원" : "500원"; 
		String ret31 = ( Integer.valueOf( fee1.replace("원", "") ) - Integer.valueOf( dscnt1.replace("원", "") ) ) + "원";
		System.out.println(ret31);
	
	
	
	
	}
}
