
public class Teacher extends Person {
	private String subject;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println("가르치는 과목 : " + subject);
	}
	
	
}
