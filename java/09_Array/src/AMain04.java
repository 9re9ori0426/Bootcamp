
public class AMain04 {
	
	public static void printArray(int[] arr, String name) {
		for(int i = 0; i < arr.length; i++ ) {
			System.out.printf("%s[%d] = %d ", name, i, arr[i] );
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int aa[] = { 100, 200, 300, 400 };
		int[] bb = { 100, 200, 300};
		
		int[] cc;
		cc = new int[] {100, 200};
		
		int[] dd = new int[1];
		dd[0] = 100;
		
		for(int i = 0; i < aa.length; i++ ) {
			System.out.printf("aa[%d] = %d ", i, aa[i] );
		}
		System.out.println();

		for(int i = 0; i < bb.length; i++ ) {
			System.out.printf("bb[%d] = %d ", i, bb[i] );
		}
		System.out.println();

		for(int i = 0; i < cc.length; i++ ) {
			System.out.printf("cc[%d] = %d ", i, cc[i] );
		}
		System.out.println();

		for(int i = 0; i < dd.length; i++ ) {
			System.out.printf("dd[%d] = %d ", i, dd[i] );
		}
		System.out.println();
		
		System.out.println("-".repeat(50));
		printArray(aa, "aa");
		printArray(bb, "bb");
		printArray(cc, "cc");
		printArray(dd, "dd");
	}
}
