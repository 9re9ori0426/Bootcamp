import java.util.Iterator;

public class AMain04 {
	public static void main(String[] args) {
		
//		int aa[] = {100, 200, 300, 400};
//		int[] bb = {100, 200, 300, 400};
//		
//		int[] cc;
//		cc = new int[] {100, 200};
//		
//		int[] dd = new int[1];
//		dd[0] = 100;
		
		int aa[] = {100, 200, 300, 400};
		int bb[] = {100, 200, 300};
		int cc[] = {100, 200};
		int dd[] = {100};
		
		for (int i = 0; i < aa.length; i++) {
			System.out.printf("aa[%d] = %d ", i, aa[i]);
		}
		System.out.println();
		for (int i = 0; i < bb.length; i++) {
			System.out.printf("bb[%d] = %d ", i, bb[i]);
		}
		System.out.println();
		for (int i = 0; i < cc.length; i++) {
			System.out.printf("cc[%d] = %d ", i, cc[i]);
		}
		System.out.println();
		for (int i = 0; i < dd.length; i++) {
			System.out.printf("dd[%d] = %d ", i, dd[i]);
		}
		System.out.println();
	}
}
