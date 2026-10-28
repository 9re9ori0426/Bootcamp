import java.util.Scanner;

public class Test_Avg {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static int getScore(String str) {
		System.out.println(str + "고사 점수를 입력하세요");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
	
		// 성적 평균 점수랑 등급을 알려주는 프로그램
		
		int mid = getScore("중간");
		int fin = getScore("기말");
		
		double avg = (mid+fin)/(double)2;
		
		String grade = "";
		switch((int)avg/10) {
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:
				grade = "F";
				break;
		}
		
		System.out.printf("평점 : %.1f\n", avg);
		System.out.println("등급 : " + grade);		
	}
}
