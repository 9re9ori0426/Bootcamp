import java.util.Scanner;

public class RMain05 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int ans = 0;
		
		aaa : for (int i = 0; i < 3; i++) {
			
			bbb : while(true) {
				System.out.println("정답은?");
				ans = sc.nextInt();
				
				switch (ans) {
				case 1:
					System.out.println("정답");
					break;
				case 2:
					System.out.println("땡");
					break;
				case 3:
					System.out.println("종료");
//					return;
					break aaa;

				default:
					break;
				}
				
				if(ans == 3) {
					break;
				}
			}
			
			
		}
	}
}
