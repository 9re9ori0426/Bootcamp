import java.util.Scanner;

public class AMain01 {
	public static void main(String[] args) {
		// 배열
		// 입력 받아 처리
		Scanner sc = new Scanner(System.in);
		int[] score = new int[4];
		
		System.out.println("입력할 값1: ");
		score[0] = sc.nextInt();
		System.out.println("입력할 값2: ");
		score[1] = sc.nextInt();		
		System.out.println("입력할 값3: ");
		score[2] = sc.nextInt();
		System.out.println("입력할 값4: ");
		score[3] = sc.nextInt();
		
		int result = score[0] + score[1] + score[2] + score[3];
		System.out.println(result);
	}
}
