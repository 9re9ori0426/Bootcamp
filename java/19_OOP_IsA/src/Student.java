
// Student is a human
public class Student extends Person {
	
	private int jpScore;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, int jpScore) {
		super(name, age);
		this.jpScore = jpScore;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println("일본어 점수 : " + jpScore);
	}
	
}
