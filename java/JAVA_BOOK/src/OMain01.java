
class Car {
	public static int COUNT = 0;
	
	private String color;
	private int velocity;

	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(String color, int velocity) {
		super();
		this.color = color;
		this.velocity = velocity;
		COUNT++;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getVelocity() {
		return velocity;
	}
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	
	public void speedUp() {
		velocity++;
	}
	
	public void speedDown() {
		velocity--;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", velocity=" + velocity + "]";
	}	
}

public class OMain01 {
	
	public static void main(String[] args) {
		
		Car myCar1 = new Car("빨간", 10);
		Car myCar2 = new Car("노랑", 20);
		
		System.out.println(myCar1);
		myCar1.speedUp();
		System.out.println(myCar1);
		myCar1.speedDown();
		System.out.println(myCar1);
		
		System.out.println(myCar2);
		
		System.out.println(Car.COUNT);
	}
}
