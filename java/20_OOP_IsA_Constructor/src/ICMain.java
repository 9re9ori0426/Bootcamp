
public class ICMain {
	public static void main(String[] args) {
		
		SportsCar sc = new SportsCar("람보르기니", "123가567");
		sc.printInfo();
		
		Taxi t = new Taxi("소나타", "11나123", 4500);
		t.printInfo();
		
		Bus b = new Bus("파란버스", "33다1111", 120);
		b.printInfo();
	}
}
