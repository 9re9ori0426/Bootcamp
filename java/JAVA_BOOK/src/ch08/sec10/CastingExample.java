package ch08.sec10;

public class CastingExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		Bus b = (Bus)vehicle;
		b.run();
		b.checkFare();
	}
}
