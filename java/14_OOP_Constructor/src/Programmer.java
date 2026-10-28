
public class Programmer extends Person {
		
	private boolean yakin;
	
	public Programmer() {
		super();
	}
	
	public Programmer(String name, int age, boolean _yakin) {
		super(name, age);
		yakin = _yakin;
	}

	public void printInfo() {
		super.printInfo( String.format("야근 여부 : %s", yakin ? "야근" : "야근 안함"));
	}

	public void work() {
		super.getDrawBox().drawBox(3, 1, "ㅋㅋ..");
//		System.out.println("ㅋㅋ..");
	}
	
	public String work(String str) {
		if(str.equals("일")) {
			return "개발하기";
		}
		else if(str.equals("퇴근")) {
			return "ㄳㄳ";
		}
		return "";
	}
}
