import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DrawBox {
	private int DELAY_MS = 100;
	
	private String ko_pattern = "[가-힇]+";
	
	public DrawBox() {
		
	}
	public DrawBox( int delay ) {
		this.DELAY_MS = delay;
	}
	
	private double getLength(String str) {
		Pattern patt = Pattern.compile(ko_pattern);
		
		Matcher match = patt.matcher(str);
		
		int _len = 0;
		while(match.find()) {
			_len += match.group().length();
		}
		
		return str.length() + _len*(0.5);
	}

	public void drawBox(int w, int h, String[] strArr) {
		try {
			double _t = 0;
			
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
				if( i < strArr.length ) {
					_t = (w*8-1 - getLength(strArr[i]) );
					for(int j = 0; j < strArr[i].length(); j++) {
						System.out.print(strArr[i].charAt(j));
						Thread.sleep(DELAY_MS);
					}
				}
				
				for(int j = 0; j < (i < strArr.length ? _t/8 : h); j++) {
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
		catch(Exception e) {
			
		}
	}
	
	public void drawBox(int w, int h, String str) {
		String[] _strArr = str.split("\n");
		
		drawBox(w, h, _strArr);
	}
	
	public void setDelay(int delay) {
		this.DELAY_MS = delay;
	}
}
