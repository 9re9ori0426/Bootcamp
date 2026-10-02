import java.util.Scanner;

public class Test_Avg {
	public static void main(String[] args) {
		// 성적 평균점수와 등급을 알려주는 프로그램
		
		// 1. 입력 받기 (중간 / 기말) - int
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 : ");
		int mid = sc.nextInt();
		System.out.print("기말 : ");
		int fin = sc.nextInt();
		
		// 2. 평균점수 구하기
			// (중간 + 기말) / 2
		int avg = (mid + fin) / 2;

		// 3. 판정
			// 90점 이상 : A
			// 80점 이상 : B
			// 70점 이상 : C
			// 60점 이상 : D
			// 나머지 : F
		String grade = "F";
		
		if (avg >= 90) {
			grade = "A";
		}
		else if (avg >= 80) {
			grade = "B";			
		}
		else if (avg >= 70) {
			grade = "C";			
		}
		else if (avg >= 60) {
			grade = "D";			
		}
		
		// 4. 결과출력
			// 평점 : ㅇㅇ
			// 등급 : ㅇㅇ
		System.out.println("평점 : " + avg + "점");
		System.out.println("등급 : " + grade);
		
	}
}
