package exam;

interface Soundable {
	abstract String sound();
}

class Cat implements Soundable {
	@Override
	public String sound() {
		return "냐옹";
	}
}

class Dog implements Soundable {
	@Override
	public String sound() {
		return "멍멍";
	}
}

class Bird implements Soundable {
	@Override
	public String sound() {
		return "쨱짹";
	}
}

public class SoundableExample {
	
	public static void printSound(Soundable ss) {
		System.out.println(ss.sound());
	}
	
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
		printSound(new Bird());
	}
}
