
public class Phone extends Product {

	private double displaySize;
	private double weight;

	public Phone() {
		// TODO Auto-generated constructor stub
	}

	public Phone(String name, int price, double displaySize, double weight) {
		super(name, price);
		this.displaySize = displaySize;
		this.weight = weight;
		// TODO Auto-generated constructor stub
	}

	public double getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(double displaySize) {
		this.displaySize = displaySize;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(String.format("디스플레이 사이즈 : %.2finch", displaySize));
		System.out.println(String.format("무게 : %.2fg", weight));
	}

}
