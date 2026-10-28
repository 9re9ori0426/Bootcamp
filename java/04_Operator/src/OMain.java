import java.util.Scanner;

public class OMain {
	// import 단축키 ctrl + shift + o
	
	public static void main(String[] args) {
		/*
		 대입 연산자 : =	<= 오른쪽에 있는 걸 왼쪽에 대입
		 비교 연산자 : ==, <=, <, >, >=
		 		 
		 */
		int x = 10;

		Scanner sc = new Scanner(System.in);
		
		//산술 연산자 : +, -, *, /, %
//		System.out.println("x : 10, y : ");
//		int y = sc.nextInt();
//		
//		System.out.println("x + y = " + (x+y));
//		System.out.println("x - y = " + (x-y));
//		System.out.println("x * y = " + x*y);
//		System.out.println("x / y = " + x/y);
//		System.out.println("x % y = " + x%y);
		
		System.out.println("-".repeat(50));
		
		// 대입 연산자 : =
		x += x + 1;
		System.out.println(x);
		x *= 12;
		System.out.println(x);
		x %= 7;
		System.out.println(x);
		
		int input; String op;
		while(true){
			try {
				System.out.print("값 : ");
				input = sc.nextInt();
				System.out.print("연산자 : ");
				op = sc.next(); 
				
				switch(op) {
					case "+" :
						x += input;
						break;
					case "-" :
						x -= input;
						break;
					case "*" :
						x *= input;
						break;
					case "/" :
						x /= input;
						break;
					case "%" :
						x %= input;
						break;
				}
				
				System.out.println(x);
			} catch (Exception e) {
				System.out.println(e);
				break;
			}
		}
 	}
}
