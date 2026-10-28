
public class Factorial {
	
	public static int f(int num) {
		if( num == 1 ) {
			System.out.println(num);
			 return 1;
		}
		
		System.out.print(num + " X ");
		return f(num-1)*num;
	}
	
	public static void main(String[] args) {
		System.out.println(f(5));
	}
}
