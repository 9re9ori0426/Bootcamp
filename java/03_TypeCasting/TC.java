
public class TC {
	public static void main(String[] args) {
		
		// Type Casting (형 변환)
		// 그릇의 종류 바꾸는 것.
		
		// 기본 자료형
			// 정수 : int
			// 실수 : double
			
		// int랑 int 연산 : 결과 int
		// int랑 double 연산 : 결과 double
		
		double a = 10 / (double) 4;
		System.out.println(a);
		
		// int 21억~~~ long 그것보단 큰거
		int aa = 10;
		long bb = aa;		// int -> long : 묵시적 형변환
		System.out.println(bb);
		
		int cc = (int) bb;	// long -> int : 명시적 형변환
		
		double dd = 10.8;		// int -> double
		int ee = (int) dd;		// double -> int
		System.out.println(ee);
		
		// 마우스 에러줄 형변환 가능
		// 맞는 타입으로 캐스트
		
		int b = 5;
		System.out.println(ee + b);
		
		// String + ? = String
		
		String ff = ee + "";
		System.out.println(ff + b);
	}
}
