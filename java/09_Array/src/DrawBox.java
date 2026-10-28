import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DrawBox {
	public static int DELAY_MS = 100;
	
	public static String ko_pattern = "[가-힇]+";
	
	public static double getLength(String str) {
		Pattern patt = Pattern.compile(ko_pattern);
		
		Matcher match = patt.matcher(str);
		
		int _len = 0;
		while(match.find()) {
			_len += match.group().length();
		}
		
		return str.length() + _len*(0.5);
	}

	public static void drawBox(int w, int h, String str) throws InterruptedException {
		
		double _t = (w*8-1 - getLength(str) );
		System.out.println("유사 길이 " + _t);
		
		System.out.print("\u250f");
		for(int i = 0; i < w*8-1; i++) {
			System.out.print("\u2501");
			Thread.sleep(DELAY_MS);
		}
		System.out.print("\u2513");
		System.out.println();

		for(int i = 0; i < h; i++) {
			System.out.print("\u2503");
			Thread.sleep(DELAY_MS);
			if( i == 0) {
				for(int j = 0; j < str.length(); j++) {
					System.out.print(str.charAt(j));
					Thread.sleep(DELAY_MS);
				}
			}
			
			for(int j = 0; j < (i == 0 ? _t/8 : h); j++) {
				System.out.print("\t");
			}
			System.out.print("\u2503");
			System.out.println();
		}

		System.out.print("\u2517");
		for(int i = 0; i < w*8-1; i++) {
			System.out.print("\u2501");
			Thread.sleep(DELAY_MS);
		}
		System.out.print("\u251B");
		System.out.println();
	}
	
	public static void main(String[] args) {
		
	}
}
