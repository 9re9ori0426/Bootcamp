import java.util.Random;

public class RMain_star {
	
	public static void star(int a, int i) {
		System.out.print(" ".repeat(a-i-1)+"*".repeat(i+1)+"*".repeat(i+1)+" ".repeat(a-i-1));
	}
	public static void star2(int a, int i) {
		System.out.print(" ".repeat(i)+"*".repeat(a-i)+"*".repeat(a-i)+" ".repeat(i));
	}
	public static void blank(int a) {
		System.out.print(" ".repeat(a*2));
		
	}
	
	public static void test(int blank, int a, int loop) {
		for (int i = 0; i < a; i++) {
			for(int j = 0; j < loop; j++) {
				blank(blank);
				star(a, i);
				blank(a);
			}
			System.out.println();
		}
	}
	
	public static void test2(int blank, int a, int loop) {
		for (int i = 0; i < a; i++) {
			for(int j = 0; j < loop; j++) {
				blank(blank);
				star2(a, i);
				blank(a);
			}
			System.out.println();
		}
	}
	
	public static void sixStar(int size) {
		test(size, size, 1);
		test2(0, size, 2);
		test(0, size, 2);
		test2(size, size, 1);
	}
	
	public static void main(String[] args) throws InterruptedException {

		Random r = new Random();
		int rnd;

		while(true) {
			rnd = r.nextInt(5);
			
			sixStar(rnd);
			
			Thread.sleep(100);
		}
	}
}
