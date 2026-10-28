
import java.util.Scanner;

public class RMain05_test {
	
	public static int list_length = 100;
	public static String[] list = new String[list_length];
	public static int last = 0;
	
	private static int _search_index(String product) {
		for(int i = 0; i < last; i++ ) {
			if( list[i].equals(product) ) {
				return i;
			}
		}
		return -1;
	}
	
	public static void search(String product) {
		int idx = _search_index(product);
		if(idx != -1) {
			System.out.printf("%s 상품을 찾았습니다.\n", list[idx]);
		}
		else {
			System.out.printf("%s 상품을 찾지 못했습니다.\n", product);
		}
	}
	
	public static void add(String product) {
		if(last < list_length) {
			list[last] = product;
			last++;
		}
		else {
			System.out.println("더이상 등록할 수 없습니다.");
		}
	}
	
	public static void delete(String product) {
		int _idx = _search_index(product);
		if( _idx  != -1 ) {
			System.out.printf("%s 상품을 삭제합니다\n", list[_idx]);
			for(int i = _idx; i < last; i++) {
				list[i] = list[i+1];
			}
			list[last] = null;
			last--;
		}
		else {
			System.out.println("삭제할 상품을 찾을 수 없습니다.");
		}
	}
	
	public static void main(String[] args) {
		// 희열
		
		Scanner sc = new Scanner(System.in);
		
		int select;
		
		System.out.println("1. 상품등록\t2. 상품검색\t3. 상품삭제\t4. 종료");
		while(true) {
			select = sc.nextInt();
			
			if( select == 4 ) {
				System.out.println("프로그램 종료");
				break;
			}
			
			String str = sc.next();
			switch (select) {
			case 1:
				System.out.println("등록합니다.");
				add(str);
				break;
			case 2:
				System.out.println("검색합니다.");
				search(str);
				break;
			case 3:
				System.out.println("삭제합니다.");
				delete(str);
				break;

			default:
				System.out.println("입력오류");
				break;
			}
		}
	}
}
