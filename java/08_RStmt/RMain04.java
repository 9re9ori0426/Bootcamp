import java.util.Scanner;

public class RMain04 {
	public static void main(String[] args) {
		
		// 1+2+3+4+ ... +10 = 55
		
		int a = 0;
		for (int i = 1; i <= 10; i++) {
			a += i;
		}
		System.out.println("총합 : " + a);
		
		// for (반복횟수)
		// while (반복조건)
		
		// 1+2+3+4+ ... 몇까지 더하면 5000이 넘나요?
		
		int b = 0;
		int i = 0;
		while (b < 5000) {
			b += ++i;
		}
		System.out.println(b);
		System.out.println(i + "까지 더하면 5000이 넘어요");
		
		// 입력 받을건데
		// 0 넣으면 stop
		Scanner sc = new Scanner(System.in);
		
		int d = 10;
		while (d != 0) {
			System.out.print("d : ");
			d = sc.nextInt();
		}
		
		int e = 0;
		while (true) {
			System.out.print("e : ");
			e = sc.nextInt();
			if (e == 0) {
				break;
			}
		}
		
		System.out.println("-----------------");
		
		// 변수 aaa에 10이 들어가면 stop (10은 종료 기능임을 가정)
		
		int aaa = 0;
		
		while (true) {
			System.out.print("aaa : ");
			aaa = sc.nextInt();
			if (aaa == 10) {
				break;
			}
		}
		
		// 몇까지 더하면 500이 넘나?
			// 1+2+...
		
		i = 0;
		int total = 0;
		while (true) {
			total += ++i;
			if (total > 500) {
				break;
			}
		}
		System.out.println(total);
		System.out.println(i);
		
		System.out.println("------------------");
		
		int kk = 0;
		int ll = 0;
		
		do {
			kk++;
			ll+=2;
		} while (kk < -100);
		
		System.out.println(kk);
		System.out.println(ll);
		
	}
}
