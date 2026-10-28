
public class Dog {
	int age;
	String name;
	double weight;
	
	public Dog() {
		
	}
	
	public Dog(int age, String name, double weight) {
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "살");
		System.out.println("체중 : " + weight + "kg");
	}
	
	public void bark() {
		System.out.println(name + "] 멍!");
	}
	
	public String getInfo() {
		return "이름 : " + this.name + "\n나이 : " + this.age + "살" + "\n체중 : " + this.weight + "kg";
	}
}
