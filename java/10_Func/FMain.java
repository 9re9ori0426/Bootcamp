// 함수, 기능, 메서드

// 요술상자.    관련 있는 작업을 한데 묶어놓고 필요할때마다 불러다 씀.

// 1. 함수정의
//  public static void 함수명(){
// 호출시 실행할 코드
// }

//  1) 함수의 인자(argument), 매개변수(parameter) : 함수 수행에 필요한 것들
// 	public static void 함수명22(자료형 변수명, 자료형 변수명, ...(param){
// 		호출 당하면 여기 실행
// 	}
// 
// 	2) 위에꺼 호출
// 	함수명22(5);    	여기서 숫자 5가 인자(argument) : 실제 그 값.

public class FMain {

	public static void info() {
		System.out.println("이름 : mz");
		System.out.println("나이 : 20");
	}

	public static void add(int a, int b) {
		System.out.println(a + b);
	}

	public static int add2(int x, int y) {
		return x + y;

	}

	public static void main(String[] args) {

		System.out.println(11);
		info();
		add(1,2);
		System.out.println(add2(10, 20));
		int a = add2(10, 20);
		System.out.println(a);
		pushUp(3);
		System.out.println("-----------");
		sport("농구");
		
	}
	
	public static void pushUp(int cnt) {
		
		for (int i = 0; i < cnt; i++) {
			System.out.println("팔 굽혔다");
			System.out.println("펴기");
		}
		
	}
	
	public static void sport(String what) {
		// 축구, 농구
		// 운동장   강당
		if (what.equals("축구")) {
			System.out.println("운동장으로");
		}else if (what.equals("농구")) {
			System.out.println("강당으로");
		}
		
	}
	
	
	
	
	
	
	
	
}
