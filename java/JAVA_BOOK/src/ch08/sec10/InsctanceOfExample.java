package ch08.sec10;

public class InsctanceOfExample {
		
	public static void main(String[] args) {
		Bus b = new Bus();
		Taxi t = new Taxi();
		
		ride(t);
		System.out.println();
		ride(b);
	}
	
	public static void ride(Vehicle v) {
//		if(v instanceof Bus) {
//			Bus _b = (Bus) v;
//			_b.checkFare();
//		}
		
		if(v instanceof Bus _b) {
			_b.checkFare();
		}
	}
}
