
public class OCMain03 {
	
	public static DrawBox b = new DrawBox(30);
	
	public static void main(String[] args) {
		// 프로그래머
			// 이름, 나이, 야근여부
			// 일하는 기능
			// 정보 출력 기능 (to string 대체 가능)
		
		Programmer p1 = new Programmer("ㅁㄴㅇㄹ", 20, false);
		p1.printInfo();
		
//		System.out.println(p1.work("일"));
		b.drawBox(3, 1, p1.work("일"));
//		System.out.println(p1.work("퇴근"));
		b.drawBox(3, 1, p1.work("퇴근"));

		p1.work();
	}
}
