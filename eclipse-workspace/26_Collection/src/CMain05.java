import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CMain05 {
	public static void main(String[] args) {
		// Map -> HashMap
		Map<String, Integer> m = new HashMap();
		m.put("탄수화물", 10);
		m.put("단백질", 20);
		m.put("지방", 30);
		
		System.out.println(m.get("단백질"));
		
//		System.out.println(m.keySet());
//		System.out.println(m.values());
//		
//		for (Map.Entry<String, Integer> entry : m.entrySet()) {
//			String key = entry.getKey();
//			Integer val = entry.getValue();
//			System.out.println(key + "," + val);
//		}
		
		// 찾고 싶은 학생이 있을 때
			// 번호로 찾는다면 -> List
			// 이름으로 찾는다면 -> Map

		System.out.println("----학생 조회----");
		Map<String, Student> students = new HashMap();
		students.put("병옥", new Student("병옥", 10, 90, 80, 70));
		students.put("기영", new Student("기영", 25, 68, 80, 56));
		students.put("윤정", new Student("윤정", 26, 80, 80, 100));
		students.put("하경", new Student("하경", 22, 65, 90, 90));
		
		//찾을 학생의 이름을 쓰면 그 학생의 정보를 출력
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("검색할 학생의 이름을 써주세요");
			System.out.println(students.keySet());
			String str = sc.next();
			if(str.equals("0"))
				break;
			
			if( students.containsKey(str) )
				System.out.println( students.get(str) );
			else
				System.out.println(str + "이란 학생은 없습니다");
		}
	}
}
