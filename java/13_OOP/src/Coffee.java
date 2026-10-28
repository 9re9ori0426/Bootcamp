
public class Coffee {
	private static DrawBox b = new DrawBox(30);
	
	private String name;
	private int price;
	
	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void printInfo() {
		b.drawBox(3, 1, "" + name + ", " + price + "원\n");
//		System.out.printf("이름 : %s\n", name);
//		System.out.printf("가격 : %d원\n", price);
	}
	
	
}
