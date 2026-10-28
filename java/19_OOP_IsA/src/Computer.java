
public class Computer extends Product {

	private int cpu;
	private int ram;
	private int ssd;

	public Computer() {
		// TODO Auto-generated constructor stub
	}

	public Computer(String name, int price, int cpu, int ram, int ssd) {
		super(name, price);
		this.cpu = cpu;
		this.ram = ram;
		this.ssd = ssd;
	}

	public int getCpu() {
		return cpu;
	}

	public void setCpu(int cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getSsd() {
		return ssd;
	}

	public void setSsd(int ssd) {
		this.ssd = ssd;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println("cpu : " + cpu);
		System.out.println(String.format("ram : %dGB", ram));
		System.out.println(String.format("ssd : %dGB", ssd));
	}

}
