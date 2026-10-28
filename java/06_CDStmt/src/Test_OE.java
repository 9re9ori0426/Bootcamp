import java.util.Random;
import java.util.Scanner;

public class Test_OE {
	
	public static int getRnd(int num) {
		Random rnd = new Random();
		
		return rnd.nextInt(10)+1;
	}
	
	public static void main(String[] args) {
		//Odd Even 홀짝게임
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 홀\t2.짝 (0: 종료)");
			int myNum = sc.nextInt();
			
			if(myNum == 0) {
				break;
			}
			if(myNum > 2 || myNum < 0) {
				System.err.println("범위를 벗어났습니다. 다시 입력해주십시오.");
				continue;
			}
			
			int rnd = getRnd(10);
			
			
			if(rnd%2 == myNum%2) {
				System.out.println("정답");
			}
			else {
				System.err.println("땡");
			}
			
			System.out.println("컴퓨터는 : " + rnd + "개로 " + (rnd%2 == 1 ? "홀" : "짝") + "이었습니다.");
		}
		
		
	}
}
