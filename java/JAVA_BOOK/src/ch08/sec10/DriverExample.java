package ch08.sec10;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus b = new Bus();
		Taxi t = new Taxi();
		
		driver.drive(b);
		driver.drive(t);
	}
}
