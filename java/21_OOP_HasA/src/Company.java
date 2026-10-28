
public class Company {
	
	private String name;
	private int year;
	private String location;

	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(String name, int year, String location) {
		super();
		this.name = name;
		this.year = year;
		this.location = location;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void printInfo() {
		System.out.println("-".repeat(50));
		System.out.println( String.format("이름\t: %s", name));
		System.out.println( String.format("설립년도\t: %s", year));
		System.out.println( String.format("위치\t: %s", location));
	}
	
	public void printInfo(int indent) {
		String t = "\t".repeat(indent);
		System.out.println("-".repeat(50));
		System.out.println( String.format(t+"이름\t: %s", name));
		System.out.println( String.format(t+"설립년도\t: %s", year));
		System.out.println( String.format(t+"위치\t: %s", location));
	}
	
}
