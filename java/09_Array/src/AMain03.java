import java.util.Scanner;

public class AMain03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇개 : ");
		int size = sc.nextInt();
		
		int[] score = new int[size];

		int result = 0;
		for(int i = 0; i < score.length; i++) {
			System.out.printf("입력할 값 %d\t/ %d : ", i+1, size);
			score[i] = sc.nextInt();
			result += score[i];
		}
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + (i == score.length-1 ? " = " : " + ") );
		}
		System.out.println(result);
		
		System.out.printf("총합 : %d\n", result);
		System.out.printf("평균 : %.2f\n", (double)result/score.length);
		
		Student[] students = new Student[3];
		int result2 = 0;
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();
			System.out.printf("(%d\t/ %d) 이름 : ", i+1, students.length);
			students[i].name = sc.next();
			System.out.printf("(%d\t/ %d) 점수 : ", i+1, students.length);
			students[i].score = sc.nextInt();
			result2 += students[i].score;
		}
		System.out.printf("%s, %s, %s\n", students[0].name, students[1].name, students[2].name);
		System.out.println("총합 : " + result2);
		System.out.printf("평균 : %.2f\n", (double)result2/students.length);
	}
}
