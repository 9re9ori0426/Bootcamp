
// 싱글톤 패턴

public class Me {
	
	private String name;
	private int age;
	private static final Me ME = new Me("mz", 20);
	
	private Me() {
		// TODO Auto-generated constructor stub
	}

	private Me(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public static Me getMe() {
		return ME;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name +"," + age;
	}
	
}
