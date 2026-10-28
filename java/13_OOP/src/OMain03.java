
public class OMain03 {
	
	
	
	public static void main(String[] args) {
		
		
		// Pen / Goods / Product
		
		// 품명, 가격, 원산지
		// 상품의 정보 출력하는 기능
		
		// 1. 품명이 보드 마카, 가격 1000, 한국산
			// 정보 출력
		Pen p1 = new Pen("보드마카", 1000, "한국");
		p1.printInfo();
		
		// 2. 형광펜 500 중국산
		Pen p2 = new Pen("형광펜", 500, "중국");
		p2.printInfo();
		
	}
}
