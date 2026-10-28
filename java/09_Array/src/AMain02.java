
public class AMain02 {
	
	public static void main(String[] args) {
		
//		int jpScore = 90;
		
		int[] jpScore = new int[5];
		jpScore[0] = 90;
		jpScore[1] = 80;
		jpScore[2] = 70;
		jpScore[3] = 60;
		jpScore[4] = 50;
		
		System.out.println("네번째 학생의 점수 : " + jpScore[3]);
		System.out.println("마지막 학생의 점수 : " + jpScore[4]);
		
		int engTest[] = {90, 80, 70, 70, 60, 50, 80, 70, 60, 50, 80, 70, 60, 50, 80, 70, 60, 50, 80, 70, 60, 50};

		System.out.println(engTest.length);
		
		int avg = 0;
		int total = 0;
		for (int i = 0; i < engTest.length; i++) {
			total += engTest[i];
		}
		avg = total/engTest.length;
		System.out.println("평균 점수 : " + avg);
		
		System.out.println("-".repeat(100));
		
		System.out.println("2번째 값 " + engTest[1]);
		System.out.println("배열 길이 " + engTest.length);

		System.out.println("배열 출력" + "-".repeat(100));
		for (int i = 0; i < engTest.length; i++) {
			System.out.println(engTest[i]);
		}
		System.out.println("배열 출력" + "-".repeat(100));
		
		for (int v : engTest) {
			System.out.println(v);
		}
		System.out.println("배열 출력" + "-".repeat(100));

		String names[] = {"성배", "기영", "현근"};
		
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println("-".repeat(100));
		
		Student[] test = new Student[5];
		test[0] = new Student(70, "a");
		test[1] = new Student(40, "b");
		test[2] = new Student(30, "c");
		test[3] = new Student(80, "d");
		test[4] = new Student(90, "e");
		
		for (int i = 0; i < test.length; i++) {
			if( test[i].score > 60) {
				System.out.printf("%s의 성적은 %d점 입니다.\n", test[i].name, test[i].score);
			}
		}
		//String 기본 값은 참조 포인터 값
		
		System.out.println("-".repeat(100));
		
		int[] push = new int[5];
		for (int i = 0; i < push.length; i++) {
			push[i] = i+1;
		}
		
		int total_push = 0;
		for (int data : push) {
			total_push += data;
		}
		System.out.println("총합 : " + total_push);
		
		System.out.println("-".repeat(100));
		
		int total_jpScore1 = 0;
		for(int i = 0; i < jpScore.length; i++ ) {
			total_jpScore1 += jpScore[i];
		}
		System.out.println("[for] jpScore " + total_jpScore1/jpScore.length);
		
		int total_jpScore2 = 0;
		for( int value : jpScore ) {
			total_jpScore2 += value;
		}
		System.out.println("[for each] jpScore " + total_jpScore2/jpScore.length);
		
		System.out.println("-".repeat(100));
		
//		ArrayList a = new ArrayList();
//		for(int data : jpScore) {
//			a.add(data);
//		}
//		System.out.println( a.toString() );
//		
//		for (Iterator iterator = a.iterator(); iterator.hasNext();) {
//			Object object = (Object) iterator.next();
//			System.out.println(object.toString());
//		}
	}
}
