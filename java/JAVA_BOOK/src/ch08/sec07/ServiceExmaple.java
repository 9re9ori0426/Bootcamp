package ch08.sec07;

public class ServiceExmaple {
	public static void main(String[] args) {
		Service service = new ServiceImpl();
		
		// 디폴트
		service.defaultMethod1();
		System.out.println();
		service.defaultMethod2();
		System.out.println();
		
		//정적
		Service.staticMethod1();
		System.out.println();
		Service.staticMethod2();
		System.out.println();
	}
}
