
public class CMain {
	
	public static void action(Calculable cal) {
		int x = 0;
		int y = 4;
		cal.calculate(x, y);
	}
	
	public static void main(String[] args) {
		action( (x, y) -> {
			int result = x + y;
			System.out.println(result);
		});
		
		action( (x, y) -> {
			int result = x - y;
			System.out.println(result);
		});
	}
}
