
public class EHMain03 {
	public static void main(String[] args) {
		try {
			test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void test() throws InterruptedException {
		System.out.println("asd");
		System.out.println(10 / 0);
		Thread.sleep(1000);

	}
}
