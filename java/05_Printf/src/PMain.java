
public class PMain {

	public static void main(String[] args) {
		// %d, %f, %s
		int a = 1;
		double b = 1.23456;
		String c = "asd";

		System.out.printf("%02d\n", a);
		System.out.printf("%.2f\n", b);
		System.out.printf("%s\n", c);

		// a는 OO이고, b는 OO이고, c는 OO이다.
		System.out.println("a는 " + a + "이고, b는 " + b + "이고, c는 " + c + "이다.");
		System.out.printf("a는 %d이고, b는 %f이고, c는 %s이다.\n", a, b, c);
	}
}
