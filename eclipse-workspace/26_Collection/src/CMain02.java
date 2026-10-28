import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class CMain02 {
	public static void main(String[] args) {
		// List 계열 : 가변 사이즈 배열 
		
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(1.5);
		al.add("zzz");
		al.add(100);
		
		// 예측 할 수 없는 타입
		
//		System.out.println(al.size());
//		for (int i = 0; i < 50; i++) {
//			al.add(i);
//		}
//		for (Iterator iterator = al.iterator(); iterator.hasNext();) {
//			Object object = (Object) iterator.next();
//			System.out.println(object);
//		}
//		
		ArrayList<String> al2 = new ArrayList<String>();
//		al2.add(1); //불가능
		al2.add("asdf");
		al2.add("ㅎㅅㅎ");
		al2.add("ㅋㅅㅋ");
		
		System.out.println("get" + al2.get(1));

		System.out.println(al2.size());
		
		System.out.println("-".repeat(50));
		for (String string : al2) {
			System.out.println(string);
		}
		
		
//		for (Iterator iterator = al2.iterator(); iterator.hasNext();) {
//			String string = (String) iterator.next();
//			System.out.println(string);
//		}
		
		System.out.println("-".repeat(50));
		
		al2.add("ㅎ"); // 언제든 추가 가능
		al2.add(0, "gggg");
		al2.set(1, "zzzzz");
		al2.remove(3); // 삭제
		
		for (String string : al2) {
			System.out.println(string);
		}
		
		System.out.println("-".repeat(50));
		
		// <클래스명> : generic
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(15);
		arr.add(90);
		arr.add(60);
		arr.add(40);

		arr.sort(Comparator.reverseOrder());
		for (Integer i : arr) {
			System.out.println(i);
		}
		
	}
}
