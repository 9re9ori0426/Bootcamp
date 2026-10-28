
public class Developer extends Person {

	public Developer() {
		super();
	}
	
	public Developer(String name, int age) {
		super(name, age);
	}
	
	public void coding() {
		try {
			System.out.printf("코딩중");
			for(int i = 0; i < 10; i++) {
				Thread.sleep(100);
				System.out.printf(".");
			}
			System.out.println();
		}
		catch( Exception e ) {
			
		}
		
	}
}
