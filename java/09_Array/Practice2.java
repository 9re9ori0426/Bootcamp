import java.util.Iterator;

public class Practice2 {
	public static void main(String[] args) {
		// 2중 for 달력 다 출력
		int dM = 0;
		for (int m = 1; m <= 12; m++) {
			switch (m) {
			case 2:
				dM = 28;
				break;
			case 4, 6, 9, 11:
				dM = 30;
			break;
			default:
				dM = 31;
				break;
			}
			for (int d = 1; d <= dM; d++) {
				System.out.printf("%02d월 %d02일\t\t", m, d);
			}
			System.out.println();
		}
		
		System.out.println("");
		System.out.println("");
		
		for (int d = 1; d <= 31; d++) {
			for (int m = 1; m <= 12; m++) {
				switch (m) {
				case 2:
					if (d > 28) {
						System.out.printf("\t\t");
						break;
					}
				case 4, 6, 9, 11:
					if (d > 30) {
						System.out.printf("\t\t");
						break;
					}
				default:
					System.out.printf("%02d월 %02d일\t\t", m, d);
					break;
				}
			}
			System.out.println();
		}
		
	}
}
