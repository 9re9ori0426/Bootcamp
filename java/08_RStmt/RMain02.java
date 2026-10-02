
public class RMain02 {
	public static void main(String[] args) {
		// 무한루프
		
//		for (int i = 0; true; i++) {
//			System.out.println(i);
//		}
		
//		for (;;) {
//			System.out.println(111);
//		}
		
		for (int i = 0; i < 3;) {
			System.out.println(i);
			i++;
		}
		
//		while (true) {
//			System.out.println("test");
//		}
		
		int x = 0;
		while (true) {
			System.out.println("x");
			x++;
			if (x == 3) {
				break;
			}
		}
		
		int z = 0;
		for(;;) {
			System.out.println(z);
			z++;
			if (z == 3) {
				break;
			}
		}
	}
}
