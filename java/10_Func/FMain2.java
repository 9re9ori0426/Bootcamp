import java.util.Scanner;

public class FMain2 {
	
	// 월급을 넣으면 연봉을 구해서 "출력" 해주는 함수
	public static void getSalary(int month) {
		System.out.println(month * 12);
	}

	// 월급을 넣으면 연봉을 구해주는 함수
	public static int getSalary2(int month) {
		return month * 12;
	}
	
	// 상품의 가격을 넣으면 부가세를 구해주는 메서드
	public static int getVAT(int price) {
		return price / 10;
	}
	// 상품의 가격을 넣으면 부가세를 "출력" 해주는 메서드
	public static void getVAT2(int price) {
		System.out.println(price * 0.1);
	}
	
	// TEST
	// 메서드(기능) 만들고 main에서 호출 사용까지.
	
	// 1. 중간, 기말 점수를 입력하면 평균 점수를 구해주는 함수
	// (scanner로 중간, 기말 입력받아 처리)
	public static int getAvg(int mid, int last) {
		return (mid + last) / 2;
	}
	// 2. 나이를 넣으면 인사말을 "출력" 해주는 함수 (sca로 입력받아 처리)
	// 10대 : 안녕
	// 20대 : 안녕하세요
	// 30대 : 안녕하십니까
	public static void sayHi(int age) {
		if (age >= 10 && age < 20) {
			System.out.println("안녕");
		}else if (age < 30) {
			System.out.println("안녕하세요");
		}else if (age < 40) {
			System.out.println("안녕하십니까");
		}
	}
	
	
	// 3. 숫자 2개를 넣으면 더 큰 수를 구해주는 함수
	// (비교할 숫자 1,2를 각각 입력받아 처리)
	public static int getBigger(int a, int b) {
		if (a > b) {
			return a;
		} 
		return b;
		// return 특징때문에 else 필요 없음.
		// 어차피 return 맞으면 돌아가니까 (함수 즉시 종료되니까)
		
	}
	
	
	
	public static void main(String[] args) {
		getSalary(200);
		System.out.println(getSalary2(200));
		int a = getSalary2(200);
		System.out.println(a);
		System.out.println(getVAT(1000));
		getVAT2(2000);
		Scanner sc = new Scanner(System.in);
		
		// 1.
		System.out.println("중간 : ");
		int m = sc.nextInt();
		System.out.println("기말 : ");
		int l = sc.nextInt();
		System.out.println(getAvg(m, l));
		// 2.
		System.out.println("나이를 입력 하세요");
		int age = sc.nextInt();
		sayHi(age);
		
		// 3. 
		System.out.println("비교할 숫자 1 :");
		int x = sc.nextInt();
		System.out.println("비교할 숫자 2 :");
		int y = sc.nextInt();
		System.out.println(getBigger(x, y));
	}
}
