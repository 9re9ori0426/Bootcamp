
public class OSMain02 {
	
	
	
	public static void main(String[] args) {
		
		// 애플 쇼핑몰
		
		// 품명 : 아이폰6s, 가격 120, 제조사 : 애플
		// 품명 : 아이패드, 가격 150, 제조사 : 애플
		// 품명 : 에어팟, 가격 30, 제조사 : 애플
		
		AppleGoods ap1 = new AppleGoods("아이폰 6s", 120);
		AppleGoods ap2 = new AppleGoods("아이패드", 150);
		AppleGoods ap3 = new AppleGoods("에어팟", 30);

		System.out.println(ap1.getPrice());
		System.out.println(ap1.getName());
		
		System.out.println(ap1);
		System.out.println(ap2.toString());
		System.out.println(ap3.toString());
		
		System.out.println(AppleGoods.MAKER);
		
		//
	}
}
