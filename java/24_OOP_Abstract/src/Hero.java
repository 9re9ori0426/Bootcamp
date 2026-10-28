
public abstract class Hero {
	//1. 추상 클래스는 인스턴스화 할 수 없다. 
	String name;

	// 강제성 규격화
	abstract void attack();

	void fly() {
		System.out.println("날다");
	}
}

class SuperMan extends Hero {
	@Override
	void attack() {
		System.out.println("눈알 레이저빔");
	}
}

class IronMan extends Hero {
	@Override
	void attack() {
		System.out.println("나노어택");
	}
}

class Hulk extends Hero {
	@Override
	void attack() {
		System.out.println("다 때려 부시기");
	}
}