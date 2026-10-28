
public class EMain03 {
	public static void main(String[] args) {
		try {
			test();
		}
		catch( Exception e) {
//			System.out.println(e);
			e.printStackTrace();
		}
	}
	
	public static void test() throws Exception {
		test2();
	}
	public static void test2() throws Exception {
		test3();
	}
	public static void test3() throws Exception {
		test4();
	}
	public static void test4() throws Exception {
		test5();
	}
	public static void test5() throws Exception {
		test6();
	}
	
	public static void test6() throws Exception {
		System.out.println("asdf");
		Thread.sleep(1000);
		System.out.println(10/0);
	}
}
