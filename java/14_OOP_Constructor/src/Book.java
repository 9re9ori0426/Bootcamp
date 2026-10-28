
public class Book {
	private static DrawBox b = new DrawBox(30);
	
	private String name;
	private int price;
	private String publisher;
	private boolean soldOut;
	
	public Book() {
		soldOut = false;
	}
	
	public Book(String _name, int _price, String _publisher){
		name = _name;
		price = _price;
		publisher = _publisher;
		soldOut = false;
	}
	
	public Book(String _name, int _price, String _publisher, boolean _soldOut){
		name = _name;
		price = _price;
		publisher = _publisher;
		soldOut = _soldOut;
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", publisher=" + publisher + ", soldOut=" + soldOut + "]";
	}

	public void printInfo() {
		b.drawBox(3, 4, 
			String.format("책 제목 : %s", name), 
			String.format("가격 : %d", price), 
			String.format("출판사 : %s", publisher), 
			String.format("품절 여부 : %s", soldOut ? "품절" : "재고 있음") 
		);
	}
}
