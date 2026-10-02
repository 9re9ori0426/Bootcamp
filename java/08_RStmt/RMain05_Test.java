import java.util.Scanner;

public class RMain05_Test {
	public static void main(String[] args) {
		// label x
		
		/*
			1. 상품등록 2. 상품검색 3. 상품삭제 4. 종료
			
			몇번? (사용자가 입력)
			
			1번 입력하면 '등록합니다' 출력
			2번 입력하면 '검색합니다' 출력
			3번 입력하면 '삭제합니다' 출력
			4번 입력하면 -> 프로그램 종료
			그 외 번호 입력하면 '입력오류' 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		
		while (true) {
			System.out.println("1. 상품등록 2. 상품검색 3. 상품삭제 4. 종료");
			System.out.print("몇번?: ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println("등록합니다");
				break;
			case 2:
				System.out.println("검색합니다");
				break;
			case 3:
				System.out.println("삭제합니다");
				break;
			case 4:
				System.out.println("종료");
				break;
			default:
				System.err.println("입력오류");
				break;
			}
			if (num == 4)
				break;
			
			System.out.println();
		}
		
		while (true) {
			System.out.println("1. 상품등록 2. 상품검색 3. 상품삭제 4. 종료");
			System.out.print("몇번?: ");
			int num = sc.nextInt();

			if (num == 1) {
				System.out.println("등록합니다");				
			}
			else if (num == 2) {
				System.out.println("검색합니다");				
			}
			else if (num == 3) {
				System.out.println("삭제합니다");				
			}
			else if (num == 4) {				
				System.out.println("종료");
				break;
			}
			else {
				System.err.println("입력오류");				
			}
		}
	}
}
