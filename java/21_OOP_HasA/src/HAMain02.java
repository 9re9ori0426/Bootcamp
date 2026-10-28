
public class HAMain02 {

	public static void main(String[] args) {
		
		
		Company c = new Company("mzC", 2026, "신논현");
		c.printInfo();
		
		Product p = new Product("굿굿제품", 1000, c);
		p.printInfo();
		
	}
}
