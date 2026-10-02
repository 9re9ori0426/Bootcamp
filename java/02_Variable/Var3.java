
public class Var3 {
	public static void main(String[] args) {
		// 2. 문자열 (여러 자)
		// String
		
		// 이름 저장
		String myName = "dw";
		System.out.println(myName);
		
		/*
			정수 : int
			실수 : double
			글자 : String
			논리 : boolean
		 */
		
		// 내 개인정보
			// 이름, 나이, 키
		
		String name = "dw";
		int age = 27;
		double height = 168.7;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		
		// Test
		// 보이는 그대로 콘솔에 (변수를 사용해서) -5개
		
		String modelName = "iPhone6";
		String maker = "Apple";
		double display = 5.6;
		int price = 1000;
		boolean stock = true;
		
		System.out.println("핸드폰 정보 **********");
		System.out.println("모델명	- " + modelName);
		System.out.println("제조사	- " + maker);
		System.out.println("디스플레이	- " + display + "inch");
		System.out.println("가격	- " + price + "$");
		System.out.println("재고유무	- " + stock);
		System.out.println("*******************");
	}
}
