import java.util.Random;

public class Box extends Random {
	
	@Override
	public int nextInt(int bound) {
		// TODO Auto-generated method stub
		int tmp = super.nextInt(bound);
		if( tmp % 2 == 0) {
			return tmp;
		}
		return super.nextInt(bound);
	}
}
