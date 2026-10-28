import java.util.Scanner;

public class Test_Avg2 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static int getScore(String str) {
		System.out.println(str + "고사 점수를 입력하세요");
		return sc.nextInt();
	}
	public static String getGradeStr(double avg) {
		if(avg >= 90) {
			return "A";
		}
		else if(avg >= 80) {
			return "B";
		}
		else if(avg >= 70) {
			return "C";
		}
		else if(avg >= 60 ) {
			return "D";
		}
		else {
			return "F";
		}
	}
	
	public static void printAvgGrade(double avg) {
		System.out.printf("평점 : %.1f\n", avg);
		System.out.println("등급 : " + getGradeStr(avg));
	}
	
	public static void main(String[] args) {
	
		// 성적 평균 점수랑 등급을 알려주는 프로그램
		
		int mid = getScore("중간");
		int fin = getScore("기말");
		
		double avg = (mid+fin)/(double)2;
		
		printAvgGrade(avg);
	}
}
