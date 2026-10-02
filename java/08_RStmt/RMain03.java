import java.util.Iterator;

public class RMain03 {
	public static void main(String[] args) {
		// 2중 for문
		
//		for (int dan = 2; dan < 10; dan++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d x %d = %d\n", dan, j, dan * j);
//			}
//			System.out.println();
//		}
		
		// 1.
		// z
		// zz
		// zzz
		// zzzz
		// zzzzz
		System.out.println("1.");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("z");
			}
			System.out.println();
		}
		
		// 2.
		// zzzz
		// zzz
		// zz
		// z
		
		System.out.println("2.");
		for (int i = 4; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("z");
			}
			System.out.println();
		}
		
		// 3.
		// z
		// z
		// z z
		// z z
		// z z z

		System.out.println("3.");
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("z ");
			}
			if (i != 0) {
				System.out.println();				
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("z ");
			}
			System.out.println();
		}
		
//		System.out.println("3.");
//		for (int i = 1; i < 6; i++) {
//			for (int j = 0; j < i; j+=2) {
//				System.out.print("z ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("3.");
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j <= i/2; j++) {
//				System.out.print("z ");
//			}
//			System.out.println();
//		}
		
		// 줄 수가 2배니까 i를 2배해서 원래 줄 수의 배로 실행해주고,
		// 문자 수가 그대로니까 j를 i의 절반으로 해서 원래 문자 수로 출력. 
		
		// 4.
		// z
		//  z
		//   z
		//    z
		//     z
		
		System.out.println("4.");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i ; j++) {
				System.out.print(" ");
			}
			System.out.println("z");
		}
		
		// 5.
		// z
		
		//  z
		
		//   z
		
		//    z
		
		//     z
		
		System.out.println("5.");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println("z");
			System.out.println();
		}
		
	}
}
