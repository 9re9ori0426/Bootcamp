package template;

public abstract class Car {
	
	abstract void drive();
	abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다");
		
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// 재정의 불가 
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
	
}
