
public class OMain02 {
	
	public static void main(String[] args) {
		// 사람
			//속성 : 이름, 나이
			//자기소개 기능

		// 규리, 28살 만들고 자기소개
		Developer p1 = new Developer("규리", 28);
		p1.printInfo();
		p1.coding();
		// 윤정, 26살 만들고 자기소개
		Developer p2 = new Developer("윤정", 26);
		p2.printInfo();
		p2.coding();
		
		
	}
}
