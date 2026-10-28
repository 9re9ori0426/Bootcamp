
public class IAMain {
	public static void main(String[] args) {
		
		// 사람 = 이름, 나이
			// 자기소개 기능 (print info)	
			// 종민, 25
		
		// 학생 = 이름, 나이, 일본어 점수		자기소개 기능 
			// 하경, 23, 100
		
		// 선생 = 이름, 나이, 과목 			자기소개 기능 
			// mz, 20, java
		
		Person p = new Person("종민", 25);
		p.printInfo();
		
		System.out.println("-".repeat(50));
		Student s = new Student("하경", 23, 100);
		s.printInfo();
		
		System.out.println("-".repeat(50));
		Teacher t = new Teacher("mz", 20, "java");
		t.printInfo();
		
		
	}
}
