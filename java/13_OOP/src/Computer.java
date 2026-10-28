
public class Computer {
	private static DrawBox b = new DrawBox(30);
	
	private double cpu;
	private int ram;
	private int ssd;
	
	public Computer(double cpu, int ram, int ssd) {
		this.cpu = cpu;
		this.ram = ram;
		this.ssd = ssd;
	}
	
	public void printInfo() {
		b.drawBox(3, 3, "cpu : " + cpu + "\n" + "ram : " + ram + "\n" + "ssd : " + ssd + "\n");
//		System.out.printf("cpu : %.1f\n", cpu);
//		System.out.printf("ram : %d\n", ram);
//		System.out.printf("ssd : %d\n", ssd);
	}
}
