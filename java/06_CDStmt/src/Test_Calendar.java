import java.util.Scanner;

public class Test_Calendar {
	public static void main(String[] args) {
		//각 월이 몇일까지 있는지
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("월을 입력해주세요 (1~12) 0 입력시 종료");
			int month = sc.nextInt();
			
			if(month == 0 ) {
				break;
			}
			
			switch (month) {
				case 1,3,5,7,8,10,12:
					System.out.println("31일까지 있습니다.");
					break;
				case 4,6,9,11:
					System.out.println("30일까지 있습니다.");
					break;
				case 2:
					System.out.println("28일까지 있습니다.");
					break;
				default:
					System.err.println("입력 오류");
					break;
			}
		}
		
		
		double height = sc.nextDouble();
		
		switch ((int)(height/10)) {
			case 10,11,12,13:
				System.out.println("가능");
				break;
			case 14,15,16,17:
				System.out.println("불가능");
				break;
			default:
				break;
		}
	}
}
