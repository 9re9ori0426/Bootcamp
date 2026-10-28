class Car03 {
	private static int COUNT = 0;
	private static final String MAKER = "Mz Company";
	
	private String color;
	private int speed;
	
	public Car03() {
		// 초기화, 기본 값
		COUNT++;
	}
	
	public Car03(String color, int speed) {
		super();
		this.color = color;
		this.speed = speed;
		COUNT++;
	}

	public static int getCount() {
		return COUNT;
	}
	public static String getMaker() {
		return MAKER;
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
	
	public void upSpeed(int speed) {
		this.speed = Math.min(this.speed+speed, 500);
	}
	
	public void downSpeed(int speed) {
		this.speed = Math.max(this.speed-speed, 0);
	}
}

public class OMain03 {

	public static void main(String[] args) {
		System.out.println("총 몇대 : " + Car03.getCount());
		
		Car03 myCar1 = new Car03("빨간", 100);
		myCar1.setColor("노랑");
		System.out.println(myCar1.getColor());

		myCar1.upSpeed(20);
		System.out.println(myCar1.getSpeed());
		myCar1.downSpeed(1500);
		System.out.println(myCar1.getSpeed());
		
				
		Car03 myCar2 = new Car03("노랑", 50);
		
		System.out.println(myCar1);
		System.out.println(myCar2);
		
		System.out.println("총 몇대 : " + Car03.getCount());
		System.out.println("메이커 : " + Car03.getMaker());
	}
}
