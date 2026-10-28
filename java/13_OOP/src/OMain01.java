
public class OMain01 {
	
	public static void main(String[] args) {
		// OOP
		
		// 객체 - 존재하는 모든 것
		
		// dog
		// 나이가 3살
		// 이름이 초코
		// 체중 3.5kg
		Dog dog1 = new Dog();
		dog1.name = "초코";
		dog1.age = 3;
		dog1.weight = 3.3;
		System.out.println(dog1.name + ", " + dog1.age + ", " + dog1.weight);
		
		Dog dog2 = new Dog(2, "요미", 2.2); 
		
		dog2.printInfo();
		
//		db.drawBox(3, 3, dog2.getInfo() );
		dog1.bark();
		
		System.out.println("-".repeat(50));
		//컴퓨터를 객체로

		// cpu 2.5
		// ram 8
		// ssd 256
		// 제품 정보 출력 기능.
		
		// 컴 -> 객체 : class 정의
		Computer com1 = new Computer(2.5, 8, 256);
		com1.printInfo();

		System.out.println("-".repeat(50));
		Coffee cf1 = new Coffee("아메리카노", 2000);
		cf1.printInfo();
		Coffee cf2 = new Coffee("카페라떼", 3000);
		cf2.printInfo();
		
	}
}
