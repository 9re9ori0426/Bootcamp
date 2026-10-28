import com.mz.product.*;

public class PMain {
	public static void main(String[] args) {
		// 패키지 접근 제어자

		// 프린터
		// 이름, 가격
		Printer pr = new Printer("슈퍼프린터", 50);
		System.out.println(pr.toString());

		// 스캐너
		// 이름, 가격
		Scanner sc = new Scanner("슈퍼스캐너", 10);
		System.out.println(sc.toString());
		
		// 컴퓨터
		// 이름, 가격, cpu, ram, hdd
		Computer cm = new Computer("슈퍼컴", 100, 8, 16, 256);
		System.out.println(cm.toString());
		
		cm.cpu = 1; // public 이라 접근 가능
//		cm.ram // default는 같은 패키지에서만 접근가능
//		cm.hdd // protected는 같은 클래스, 같은 패키지, 하위클래스에서 접근 가능
		
	}
}
