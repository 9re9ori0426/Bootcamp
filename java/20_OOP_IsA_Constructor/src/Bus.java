
public class Bus extends Car {

	private int lineNumber;
	
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bus(String name, String number, int lineNumber) {
		super(name, number);
		this.lineNumber = lineNumber;
	}
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println("노선번호 : " + lineNumber);
	}
	
}
