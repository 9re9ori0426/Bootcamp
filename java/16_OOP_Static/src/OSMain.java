
public class OSMain {
	
	public static void main(String[] args) {
		System.out.println(Calc.test);
		Calc.test += 1;
		
		Calc a = new Calc();
		System.out.println(a.test);
		
		a.test += 1;
		System.out.println(Calc.test);
	
	
	
	}
}
