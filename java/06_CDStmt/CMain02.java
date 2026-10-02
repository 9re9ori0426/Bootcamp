
public class CMain02 {
	public static void main(String[] args) {
		
		if (true) {
			System.out.println("ok");
		}
		
		System.out.println("ok2");
		
		if (false) {
			System.out.println("ok3");
		}
		
		int a = 12;
		
		if (a % 2 == 0) {
			System.out.println(a + "는 짝수");
			System.out.println(a + "는 2배수");			
		}
		if (a % 3 == 0) {
			System.out.println(a + "는 3배수");
		}
		if (a % 4 == 0) {
			System.out.println(a + "는 4배수");
		}
	}
}
