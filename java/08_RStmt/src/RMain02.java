import java.util.Random;

public class RMain02 {
	
	public static void main(String[] args) throws InterruptedException {
		// 무한루프
		
		Random r = new Random();
		int rnd = r.nextInt(100);
		int cnt = 0;
		while(true) {
			System.out.print("ㅋ");
			Thread.sleep(10);
			if(cnt > rnd) {
				System.out.print("\t"+rnd);
				System.out.println();
				if(rnd == 50) {
					break;
				}
				cnt = 0;
				rnd = r.nextInt(100);
			}
			cnt++;
		}
	}
}
