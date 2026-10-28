
public class Car {
	private String name;
	private String number;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	public void printInfo() {
		System.out.println("-".repeat(50));
		System.out.println("모델명 : " + name);
		System.out.println("차량번호 : " + number);
	}
}
