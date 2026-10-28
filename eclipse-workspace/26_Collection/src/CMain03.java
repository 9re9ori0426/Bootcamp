import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class CMain03 {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList();

		students.add( new Student("mz1", 20, 100, 100, 5) );
		students.add( new Student("현근", 25, 98, 80, 91) );
		students.add( new Student("종민", 27, 78, 88, 100) );
		students.add( new Student("대원", 22, 99, 80, 95) );
		students.add( new Student("규리", 28, 79, 86, 99) );
		
		// 학생수
//		System.out.println(students.size() + "명");
//		
//		// 첫번쨰 학생의 국어점수
//		System.out.println(students.get(0).getKor());
//		// 두번쨰 학생의 이름
//		System.out.println(students.get(1).getName());
//		// 세번쨰 학생의 일본어 점수
//		System.out.println(students.get(2).getJp());
//		//네번쨰 학생의 이름과 나이
//		Student s4 = students.get(3);
//		System.out.println(s4.getName() + ", " + s4.getAge());
//		//다섯번쨰 학생의 국, 영, 일 평균 점수
//		Student s5 = students.get(4);
//		System.out.println( (s5.getKor() + s5.getEng() + s5.getJp())/3);
//		System.out.println(students.get(4).getAvg());
		
//		System.out.println(students);
		
		for (Student student : students) {
			System.out.println(student);
		}

		System.out.println("나이순" + "-".repeat(50));
		students.sort( (a, b) -> { return a.getAge()-b.getAge(); });
		for (Student student : students) {
			System.out.println(student);
		}
		
		System.out.println("점수순" + "-".repeat(50));
		students.sort( (o1, o2) -> {
			Double o2Sum = (o2.getEng() + o2.getKor() + o2.getJp() )/3.0;
			Double o1Sum = (o1.getEng() + o1.getKor() + o1.getJp() )/3.0;
			return o2Sum.compareTo(o1Sum);
		} );
		
//		for (Student student : students) {
//			System.out.println(student);
//		}
		System.out.println(students.getFirst());
		System.out.println(students.getLast());
		
		//
		System.out.println("-".repeat(50));
		HashSet<Integer> set1 = new HashSet();
		
		for (int i = 1; i <= 24; i++) {
			if( i % 2 == 0) set1.add(i);
			if( i % 3 == 0) set1.add(i);
		}
		
		System.out.println(set1);

		System.out.println("-".repeat(50));
		HashMap<String, String> hm = new HashMap();
		hm.put("a", "asdf1");
		hm.put("b", "asdf2");
		hm.put("c", "asdf3");
		System.out.println(hm);
		
		
	}
}
