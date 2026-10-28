
public class IronMan {
	private String name;
	private int age;
	
	static final IronMan IRONMAN = new IronMan("로다주", 30);
	
	private IronMan() {
		// TODO Auto-generated constructor stub
	}

	private IronMan(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
}
