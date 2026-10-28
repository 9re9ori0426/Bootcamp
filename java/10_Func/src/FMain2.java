import java.util.Scanner;

public class FMain2 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void getSalary(int month) {
		System.out.println(month*12);
		
	}
	
	public static int getSalary2(int month) {
		return month*12;
	}
	
	public static int getVAT(int price) {
		return price/10;
	}
	
	public static void getVAT2(int price) {
		System.out.println(price/10);
	}
	
	public static double getAvg(int mid, int fin) {
		return (mid+fin)/(double)2;
	}
	
	public static void helloByAge(int age) {
		switch(age/10) {
			case 1 :
				System.out.println( "안녕" );
				break;
			case 2 :
				System.out.println( "안녕하세요" );
				break;
			case 3 :
				System.out.println( "안녕하십니까" );
				break;
		}
	}
	
	public static int getMax(int a, int b) {
		return a > b ? a : b;
	}
	
	
	public static void main(String[] args) {
//		getSalary(100);
//		System.out.println( getSalary2(200) );
//		
//		System.out.println( getVAT(1000) );
//		getVAT2(2000);

		int mid, fin;
		System.out.print("중간 : ");
		mid = sc.nextInt();
		System.out.print("기말 : ");
		fin = sc.nextInt();
		System.out.printf("평균 점수는 %.2f\n", getAvg(mid, fin));
		
		int age;
		System.out.printf("나이 : ");
		age = sc.nextInt();
		helloByAge(age);
		
		int a, b;
		System.out.println("값1 : ");
		a = sc.nextInt();
		System.out.println("값2 : ");
		b = sc.nextInt();
		System.out.printf("더 큰 값은 %d\n", getMax(a, b));
	}
}
