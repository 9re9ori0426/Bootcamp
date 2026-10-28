
public class Var03 {

	public static void main(String[] args) {		
		/*
		 	정수 : int
		 	실수 : double
		 	글자 : String
		 	논리 : boolean
		 */
		
		// 내 개인 정보
			// 이름, 나이, 키
		
		String myName = "hbo";
		int myAge = 29;
		double myHeight = 172.5;
		
		System.out.println(myName);
		System.out.println(myAge);
		System.out.println(myHeight);
		
		//Test
		//보이는 그대로 콘솔에 (변수를 사용해서) - 5개
		
		String model = "iphone6";
		String made = "Apple";
		double display = 5.6;
		int cost = 1000;
		boolean stock = true;
		
		System.out.println("핸드폰 정보 " + "*".repeat(10) );
		System.out.println("모델명\t-  " + model);
		System.out.println("제조사\t-  " + made);
		System.out.println("디스플레이\t-  " + display + "inch");
		System.out.println("가격\t-  " + cost + "$");
		System.out.println("재고유무\t-  " + stock);
		System.out.println("*".repeat(20) );

		
	}
}
