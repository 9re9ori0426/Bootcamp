
public class CMain04 {

	public static void main(String[] args) {
		// if, else if (여러 조건 중 하나만)

		int a = 4;

		if (a % 5 == 0) {
			System.out.println(a + "는 5의 배수");
		} 
		if (a % 4 == 0) {
			System.out.println(a + "는 4의 배수");
		} 
		if (a % 2 == 0) {
			System.out.println(a + "는 2의 배수");
		} 
//		else {
//			System.out.println("해당없음");
//		}
		
		a = 20;
		String msg = "";
		if( a % 5 == 0) {
			if( msg.length() > 0) msg += ", ";
			msg += "5배수";
		}
		if( a % 4 == 0) {
			if( msg.length() > 0) msg += ", ";
			msg += "4배수";
		}
		if( a % 2 == 0) {
			if( msg.length() > 0) msg += ", ";
			msg += "2배수";
		}
		
		System.out.println(a + " => " + msg);

	}
}
