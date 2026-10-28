
public class Galaxy {

	public static final String MAKER = "samsung";
	public static int COUNT = 0;
	
	private String name;
	private int price;
	
	public Galaxy() {
		// TODO Auto-generated constructor stub
	}
	
	public Galaxy(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		COUNT++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "SamsungGoods [name=" + name + ", price=" + price + ", maker=" + MAKER + "]";
	}
}
