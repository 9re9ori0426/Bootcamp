
public class AppleGoods {
	
	private String name;
	private int price;
	static final String MAKER = "애플";
	
	public AppleGoods() {
		// TODO Auto-generated constructor stub
	}
	
	public AppleGoods(String name, int price) {
		this.name = name;
		this.price = price;
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
		return "AppleGoods [name=" + name + ", price=" + price + ", maker=" + MAKER + "]";
	}
	
}

