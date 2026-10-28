import java.util.Scanner;

public class AMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[4];

		int result = 0;
		for(int i = 0; i < score.length; i++) {
			System.out.printf("입력할 값 %d : ", i+1);
			score[i] = sc.nextInt();
			result += score[i];
		}
		
//		for (int i = 0; i < score.length; i++) {
//			result += score[i];
//		}
		System.out.println("총합 : " + result);
		System.out.println("평균 : " + result/score.length);
		
	}
}
