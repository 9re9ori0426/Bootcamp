
public class Pen {
	
	private static DrawBox b = new DrawBox(30);
	
	private String name;
	private int price;
	private String madeIn;
	
	public Pen(String name, int price, String madeIn){
		this.name = name;
		this.price = price;
		this.madeIn = madeIn;
	}
	
	public void printInfo() {
		String[] msg = {
			String.format("품명 : %s", name),
			String.format("가격 : %d원", price),
			String.format("원산지 : %s", madeIn)
		};
		
		b.drawBox(3, 3, msg);
	}
}
