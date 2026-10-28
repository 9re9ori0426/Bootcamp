package exam;

interface Action {
	void work(); // 추메
	
}

public class ActionExample {
	public static void main(String[] args) {
		
		Action action = () -> {
			System.out.println("작업하기");
		};
		
		action.work();
		
		
		
	}
}
