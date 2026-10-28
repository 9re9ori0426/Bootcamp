
public class Person {
	
	private static DrawBox b = new DrawBox(30);
	
	private String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public DrawBox getDrawBox() {
		return b;
	}
	
	public void printInfo() {		
		b.drawBox(2, 1, String.format("이름 : %s", name), String.format("나이 : %d살", age));
	}
	
	public void printInfo(String str) {		
		b.drawBox(2, 1, String.format("이름 : %s", name), String.format("나이 : %d살", age) , str);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}	
}
