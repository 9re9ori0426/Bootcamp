
public class IAMain02 {
	public static void main(String[] args) {
		// 컴퓨터	: 품명, 가격, cpu, ram, ssd
		// 핸드폰	: 품명, 가격, 디스플레이 사이즈, 무게
		// 펜	: 품명, 가격
		
		Computer com = new Computer("슈퍼컴", 1000000, 7, 32, 256);
		com.printInfo();
		
		Phone p = new Phone("아이폰 6s", 1000000, 5.1, 80.2);
		p.printInfo();
		
		Pen pen = new Pen("모나미 펜", 1500);
		pen.printInfo();
		
		Box b = new Box();
		System.out.println(b.nextInt(10));
	}
}
