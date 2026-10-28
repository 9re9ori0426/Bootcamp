package exam;

import java.util.Stack;

class Coin {
	private int value;

	public Coin() {
		// TODO Auto-generated constructor stub
	}

	public Coin(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack(); // LIFO 구조

		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
				
		while(!coinBox.isEmpty()) {
			System.out.println( coinBox.pop().getValue() );
		}
		
	}
}
