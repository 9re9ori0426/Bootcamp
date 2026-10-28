
public class TCMain {

	public static void main(String[] args) {

		// Type Casting (형 변환)
		// 그릇의 종류를 바꾸는 것

		// default
		// 정수 int
		// 실수 double
		// int 연산 int : 결과 int
		// int 연산 double : 결과 double
		int a, b;
		double c;
		a = 1;
		b = 2;
		c = 10 / 2.2;
//		c = 10/(double)4;

		System.out.println(c);

		int aa = 21;
		long bb = aa * (long) 1000000000;
		System.out.println(bb);

		int cc = (int) bb; // 명시적 형변환
		System.out.println(cc);

		double dd = cc;
		System.out.println(bb);

		int ee = (int) c;
		System.out.println(ee);

		System.out.println(Math.ceil(c) + ", " + Math.floor(c));
		// 마우스 에러를 형변환 가능, 명시적 형변환 (강제 캐스팅)

		System.out.println(ee + b); // int int

		// String
		String ff = ee + "";
		System.out.println(ff + b + 2);
	}
}
