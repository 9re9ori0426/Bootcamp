import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class CMain04 {
	public static void main(String[] args) {
		// Set : HashSet : 가변 사이즈 배열, 중복 자동 제거, 순서 랜덤
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		System.out.println(hs.size() + hs.toString());
		
		hs.add(30);
		hs.add(20);
		hs.add(10);
		System.out.println(hs.size() + hs.toString());
		
		List<Integer> al = new ArrayList(hs);
		System.out.println(al.get(0));
		
		Set<Student> students = new HashSet<Student>();
		students.add(new Student("병옥", 10, 90, 80, 70));
		students.add(new Student("기영", 25, 68, 80, 56));
		students.add(new Student("윤정", 26, 80, 80, 100));
		students.add(new Student("하경", 22, 65, 90, 90));
		students.add(new Student("하경", 22, 65, 90, 90));
		
		System.out.println(students.size());
		
		System.out.println("로또 5000원 어치" + "-".repeat(30));
		Set<Integer> lotto = new HashSet<Integer>();
		Random r = new Random();
		
		int cnt = 5;
		while(cnt > 0) {
			while(true) {
				lotto.add(r.nextInt(45)+1);
				if(lotto.size() == 6) {
					break;
				}
			}
			System.out.println(lotto);
			lotto.clear();
			cnt--;
		}
		
		
	}
}
