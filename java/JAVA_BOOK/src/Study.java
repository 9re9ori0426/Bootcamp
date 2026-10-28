
class Calculator {
	String brand;
	
	boolean initialized = false;
	int mem;
	
	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	
	void _print() {
		System.out.println("현재 값 : " + mem);
	}
	
	void add(int a) {
		mem = initialized ? mem + a : a;
		initialized = true;
		_print();
	}
	
	void subtract(int a) {
		mem = initialized ? mem - a : a;
		initialized = true;
		_print();
	}
	
	void multiply(int a) {
		mem = initialized ? mem * a : a;
		initialized = true;
		_print();
	}
	
	void divide(int a) {
		if( a == 0 ) {
			System.out.println("0으로는 나눌 수 없습니다.");
			return;
		}
		mem = initialized ? mem / a : a;
		initialized = true;
		_print();
	}
}


public class Study {

	public static void main(String[] args) {
		add(1, 2);
		System.out.println(add2(10, 20));
		
		Calculator cal = new Calculator();
		cal.brand = "카시오";
		
		cal.add(20);
		cal.multiply(10);
		cal.subtract(10);
		cal.divide(0);
		cal.divide(10);
	}
	
	public static void add(int a, int b) {
		System.out.println(a+b);;
	}
	
	public static int add2(int a, int b) {
		return a +b;
	}
}
