
public class Judge {
	
	public void play(Player player, Enemy enemy) {
		int comNum = enemy.getRandom();
//		System.out.println(comNum);
		
		int cnt = 6;
		while(cnt > 0 ) {
			System.out.println( cnt > 1 ? String.format("기회는 %d번 남았습니다.", cnt) : "마지막 기회입니다.");
			System.out.println("뭐 ? (1~100)");
			int playerNum = player.say();
			
			if( isOutOfRange(playerNum) ) {
				System.out.println("범위를 벗어났습니다. 다시 입력해주세요");
				continue;
			}
			
			if( result(comNum, playerNum) ) {
				break;
			}
			cnt--;
		}
		if( cnt == 0 ) {
			System.out.printf("기회를 소진했습니다.. 답은 %d이었습니다\n", comNum);			
		}
		else {
			System.out.printf("%d번 만에 맞추셨습니다!\n", 6-cnt+1);
		}
	}

	private boolean result(int comNum, int palyerNum) {
		if ( comNum > palyerNum) {
			System.out.println("up");
		} else if (comNum < palyerNum) {
			System.out.println("down");
		}
		else {
			System.out.println("정답입니다");
			return true;
		}
		return false;
	}
	
	private boolean isOutOfRange(int num) {
		return num < 1 || num > 100;
	}
}
