
public class Practice2 {
	
	public static int getLastDay(int month) {
		switch (month) {
			case 1,3,5,7,8,10,12:
				return 31;
			case 4,6,9,11:
				return 30;
			case 2:
				return 28;
			default:
				return 0;
		}
	}
	
	public static void printDay(int day, int weekDay) {
		if((day+weekDay)%7 == 0) {
			System.out.printf("\u001B[34m%d\t\u001B[0m", day);
		}
		else if((day+weekDay)%7 == 1) {
			System.out.printf("\u001B[31m%d\t\u001B[0m", day);		
		}
		else {
			System.out.printf("%d\t", day);					
		}
	}
	
	public static void printMonth(int month) {
		System.out.printf("%d월\n", month);
		System.out.println("-".repeat(56));
		System.out.printf("\u001B[31m일\t\u001B[0m월\t화\t수\t목\t금\t\u001B[34m토\t\u001B[0m\n", month);
	}
	
	public static void main(String[] args) {

		int dayMax = 31;
		for(int day = 1; day <= 31; day++) {
			for(int month = 1; month <= 12; month++) {
				switch (month) {
					case 1,3,5,7,8,10,12:
						dayMax = 31;
						break;
					case 4,6,9,11:
						dayMax = 30;
						break;
					case 2:
						dayMax = 28;
						break;
				}
				
				if( day > dayMax) {
					System.out.printf("\t\t", month, day);
				}
				else {
					System.out.printf("%02d월 %02d일\t", month, day);
				}
			}
			System.out.println();
		}
		
		
		int WEEK_DAY_START = 4;
		int weekDay = WEEK_DAY_START;
		for(int month = 1; month <= 12; month++) {
			printMonth(month);
			
			for(int i = 0; i < weekDay; i++) {
				System.out.printf("\t");
			}
			for(int day = 1; day <= getLastDay(month); day++) {
				printDay(day, weekDay);
				
				if((day+weekDay)%7 == 0 && day != getLastDay(month)) {
					System.out.println();
				}
			}
			weekDay = (getLastDay(month) + weekDay)%7;
			System.out.println();
		}
		
	}
}
