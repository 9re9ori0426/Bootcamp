import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {
		
		for(int i = 1; i < 10; i++) {
//			System.out.printf("----%d단----\n", i);
			for(int j = 2; j < 10; j++ ) {
				System.out.printf("%d X %d = %d\t", j, i, i*j );
			}
			System.out.println();
		}
		
		//배열
		int [][] gugu = new int[9][9];
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++ ) {
				gugu[i][j] = (i+1)*(j+1);
			}
		}
		
		Scanner sc = new Scanner(System.in);
		
		int select;
		while(true) {
			System.out.print("출력을 원하는 구구단을 입력해주세요 (1~9) : ");
			select = sc.nextInt();
			if( 0 < select && select <= 9) {
				break;
			}
			System.out.println("1~9 범위의 값을 입력해주세요");
		}

		System.out.printf("----%d단----\n", select);
		for(int i = 0; i < 9; i++ ){
			System.out.printf("%d X %d = %d\n", select, i+1, gugu[select-1][i] );
		}
		
	}
}
