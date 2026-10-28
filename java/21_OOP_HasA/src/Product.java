
public class Product {
	private String name;
	private int price;
	
	private Company manufacture;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(String name, int price, Company manufacture) {
		super();
		this.name = name;
		this.price = price;
		this.manufacture = manufacture;
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

	public Company getManufacture() {
		return manufacture;
	}

	public void setManufacture(Company manufacture) {
		this.manufacture = manufacture;
	}

	public void printInfo() {
		System.out.println("-".repeat(50));
		System.out.println( String.format("제품명\t: %s", name));
		System.out.println( String.format("가격\t: %d", price));
		
		if( manufacture != null ) manufacture.printInfo(1);
	}
}
