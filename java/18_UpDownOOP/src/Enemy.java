import java.util.Random;

public class Enemy extends Random {
	
	public int getRandom() {
		return super.nextInt(100)+1;
	}
}
