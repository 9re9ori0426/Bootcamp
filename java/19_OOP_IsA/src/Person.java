
public class Person {
	
	private String name;
	private int age;
	
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void printInfo() {

		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
}
