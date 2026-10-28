
public class HAMain {
	
	public static void main(String[] args) {
		
		
		Person p = new Person("mz", 10, "남");
		
		p.setPet( new Dog("yomi", 2, "pome") );
		p.info();
		
		Person p2 = new Person("asdf", 20, "여", new Dog("choco", 3, "yoki") );
		p2.info();
	}
}
