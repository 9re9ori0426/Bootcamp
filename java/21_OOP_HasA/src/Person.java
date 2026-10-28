
public class Person {
	private String name;
	private int age;
	private String gender;
	
	private Dog pet;
	
	public Person() {
		
	}

	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public Person(String name, int age, String gender, Dog pet ) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.pet = pet;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Dog getPet() {
		return pet;
	}

	public void setPet(Dog pet) {
		this.pet = pet;
	}

	public void info() {
		System.out.println("-".repeat(50));
		System.out.println("사람 정보");
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		
		System.out.println("-".repeat(50));
		System.out.println("펫 정보");
	
		if( pet != null ) pet.printInfo();
	}
}
