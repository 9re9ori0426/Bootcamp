import java.util.Scanner;

public class Guest {

	private String name;
	private double height;
	private double weight;
	
	private Scanner mouth = new Scanner(System.in);
	
	public void answer() {
		System.out.print("이름 : ");
		name = mouth.next();
		System.out.print("키 : ");
		height = mouth.nextDouble();
		if( height > 3 ) {
			height /= 100;
		}
		System.out.print("체중 : ");
		weight = mouth.nextDouble();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	
}
