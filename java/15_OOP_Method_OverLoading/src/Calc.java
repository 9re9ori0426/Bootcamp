
public class Calc {
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void add(double a, double b) {
		System.out.println( String.format("%.2f", a + b) );
	}
	
	public static void add(double a, double b, double c) {
		System.out.println( String.format("%.2f", a + b + c) );
	}
	
	public static void add(double... args) {
		double sum = 0;
		for(int i = 0; i < args.length; i++) {
			sum += args[i];
		}

		if( sum % 1 == 0 ) {
			System.out.printf("%.0f\n", sum);
		}
		else {
			System.out.printf("%.2f\n", sum);
		}
	}
	
	public static void gob_free(double... args) {
		double result = 1;
		for(double arg : args) {
			result *= arg;
		}
		System.out.println(result%1 == 0 ? String.format("%.0f", result) : result);
	}
	
}
