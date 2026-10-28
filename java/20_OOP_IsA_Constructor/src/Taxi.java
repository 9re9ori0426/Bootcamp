
public class Taxi extends Car {
	private int fee;
	
	public Taxi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Taxi(String name, String number, int fee) {
		super(name, number);
		this.fee = fee;
	}
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println("기본료 : " + fee + "원");
	}
}
