import java.util.Scanner;

public class IMain03 {
	
	public static void printCoffee(Coffee cf) {
		System.out.println("-".repeat(50));
		cf.name();
		cf.price();
		cf.hotIced();
		System.out.println("-".repeat(50));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sel;
		
		while(true) {
			System.out.println("주문하시겠습니까?");
			
			System.out.println("1. 에스프레소");
			System.out.println("2. 카페라떼");
			System.out.println("3. 바닐라라떼");
			System.out.println("4. 프라푸치노");
			System.out.println("5. 돈이모자라요..");
			System.out.println("-".repeat(50));
			System.out.print("주문 : ");
			sel = sc.nextInt();
			
			if(sel == 5) {
				System.err.println("그럼 나가!!!!!!!!!!!!!!!!!!!");
				break;
			} else if( sel < 1 || sel > 4) {
				System.err.println("메뉴에 없습니다");
				continue;
			}
			
			Coffee cf = null; 
			switch (sel) {
				case 1:
					cf = new Espresso();
					break;
				case 2:
					cf = new CaffeLatte();
					break;
				case 3:
					cf = new VanillaLatte();
					break;
				case 4:
					cf = new Frappuccino();
					break;
				default:
					break;
			}
			printCoffee(cf);
			
		}
	}
}
