
public class RMain03 {
	public static void main(String[] args) {
		
		for (int dan = 2; dan < 10; dan++) {
			System.out.printf("%s %d단 %s\n", "-".repeat(5), dan, "-".repeat(5));
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d X %d\t= %d\n", dan, i, dan*i);
			}
			System.out.println();
		}
		
		// z
		// zz
		// zzz
		// zzzz
		// zzzzz

		System.out.println("1." + "-".repeat(20));
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("z");
			}
			System.out.println();
		}
		
//		for (int i = 1; i <= 5; i++) {
//			System.out.println("z".repeat(i));
//		}

		System.out.print("2.");
		for (int i = 0; i < 4; i++) {
			System.out.print("\t");
			for (int j = 0; j < 4-i; j++) {
				System.out.print("z");
			}
			System.out.println();
		}
		System.out.println();		

		System.out.println("3.");
		for (int i = 0; i < 5; i++) {
//			System.out.print("\t");
			for (int j = 0; j <= i/2; j++) {
				System.out.print("z ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("3asdf.");
		for (int i = 1; i < 6; i++) {
			System.out.print("\t");
			for (int j = 1; j <= i; j++) {
				System.out.print(j%2 == 1 ? "z" : " ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.print("4.");
		for (int i = 0; i < 5; i++) {
			System.out.print("\t");
			for (int j = 0; j <= i; j++) {
				System.out.print(i==j ? "z" : " ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.print("5.");
		for (int i = 0; i < 5; i++) {
			System.out.println();
			System.out.print("\t");
			for (int j = 0; j <= i; j++) {
				System.out.print(i==j ? "z" : " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
