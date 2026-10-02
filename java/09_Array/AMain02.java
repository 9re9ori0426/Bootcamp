import java.util.Iterator;

public class AMain02 {
	public static void main(String[] args) {
		// 학생들의 일본어 점수
		int jpScore = 90;
		
		// 학생 5명의 점수
		
		// 들어올 값을 모를때 (요소, element)
		int[] jpScore2 = new int[5];	// 5칸짜리 배열
							// 위치, 색인, index
		jpScore2[0] = 100;
		jpScore2[1] = 90;
		jpScore2[2] = 80;
		jpScore2[3] = 70;
		jpScore2[4] = 60;
		
		System.out.println("네번째 학생의 점수 : " + jpScore2[3]);
		System.out.println("마지막 학생의 점수 : " + jpScore2[4]);
		
		// 값을 이미 알고 있을 때
//		int[] engTest = {10, 20, 30, 40, 50};
		int engTest[] = {10, 20, 30, 40, 50};
		
		System.out.println(engTest[2]);
		
		System.out.println(engTest.length);
		
		int avg = (engTest[0] + engTest[1] + engTest[2] + engTest[3] + engTest[4]) / 5;
		System.out.println(avg);
		
		for (int i = 0; i < jpScore2.length; i++) {
			System.out.println(engTest[i]);
		}
		
		System.out.println("----------------");
		// 베프 (순차적으로, 증감 개념x)
		for (int asd : engTest) {
			System.out.println(asd);
		}
		
		System.out.println("---------------------");
		
		// jpScore2		2번째 학생 점수 출력
		System.out.println(jpScore2[1]);
		
		// jpScore2		몇칸짜리 배열?
		System.out.println(jpScore2.length);
		
		// for문으로 하나씩 다 출력
		for (int i = 0; i < jpScore2.length; i++) {
			System.out.println(jpScore2[i]);
		}
		// forEach로 하나씩 다 출력
		for (int e : jpScore2) {
			System.out.println(e);
		}
		
		System.out.println("---------------------");
		
		// 성배, 기영, 현근
		
		String name[] = {"성배", "기영", "현근"};
		
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		for (String e : name) {
			System.out.println(e);
		}
		
		System.out.println("------------------");
		
		int push[] = new int[5];
		
		for (int i = 0; i < push.length; i++) {
			System.out.println(push[i]);
		}
		
		double dd[] = new double[5];
		
		for (int i = 0; i < dd.length; i++) {
			System.out.println(dd[i]);
		}
		
		String ss[] = new String[5];
		
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}
		
		// int - 0
		// double - 0.0
		// String - null
		
		for (int i = 0; i < push.length; i++) {
			push[i] = i + 1;
			System.out.println(push[i]);
		}
		
		// 저장된거 다 더하기
		int total = 0;
		for (int i = 0; i < push.length; i++) {
			total += push[i];
		}
		System.out.println(total);
		
		// 위에거 foreach로. (total2 변수)
		
		int total2 = 0;
		for (int e : push) {
			total2 += e;
		}
		System.out.println(total2);
		
		// jpScore 평균값 출력.		for / foreach 둘 다
		
		total = 0;
		for (int i = 0; i < jpScore2.length; i++) {
			total += jpScore2[i];
		}
		System.out.println(total / jpScore2.length);

		total = 0;
		for (int e : jpScore2) {
			total += e;
		}
		System.out.println(total / jpScore2.length);
		
		
		
	}
}
