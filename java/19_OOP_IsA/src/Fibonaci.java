
public class Fibonaci {
	
	public static int MAX = 10;
	
	public static int[] arr = new int[MAX];
	
	public static int f(int num) {
		if(arr[num-1] != 0) {
			return arr[num-1];
		}
		
		if(num == 1 || num == 2) {
			arr[num-1] = 1;
			return 1;
		}
		
		int ret = f(num-2) + f(num-1);
		arr[num-1] = ret;
		return ret;
	}
	
	public static void main(String[] args) {
		
		System.out.println( f(MAX) );
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
