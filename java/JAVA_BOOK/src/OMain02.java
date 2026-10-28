class Car02 {
	private String color;
	private int speed;
	
	public Car02() {
		// 초기화, 기본 값
		color = "회색";
		speed = 0;
	}
	
	public Car02(String color, int speed) {
		super();
		this.color = color;
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car02 [color=" + color + ", speed=" + speed + "]";
	}
}

public class OMain02 {

	public static void main(String[] args) {
		
		Car02 myCar = new Car02();
		
		Car02 myCar1 = new Car02("스포츠카", 100);
		Car02 myCar2 = new Car02("세단", 50);
		
		System.out.println(myCar1);
		System.out.println(myCar2);
		
		System.out.println(myCar);
	}
}
