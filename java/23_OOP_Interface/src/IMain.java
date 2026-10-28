
interface Coffee {
	abstract void name();
	abstract void price();
	
	default void hotIced() {
//		System.out.println("test");
	}
}

class Espresso implements Coffee {
	@Override
	public void name() {
		System.out.println("에스프레소");
	}
	@Override
	public void price() {
		System.out.println("2000원");
	}
}

class CaffeLatte implements Coffee {
	@Override
	public void name() {
		System.out.println("카페라떼");
	}
	@Override
	public void price() {
		System.out.println("3000원");
	}
	
	@Override
	public void hotIced() {
		// TODO Auto-generated method stub
		Coffee.super.hotIced();
		System.out.println("hot or ice?");
	}
}

class VanillaLatte implements Coffee {
	@Override
	public void name() {
		System.out.println("바닐라라떼");
	}
	@Override
	public void price() {
		System.out.println("3000원");
	}
	
	@Override
	public void hotIced() {
		// TODO Auto-generated method stub
		Coffee.super.hotIced();
		System.out.println("hot or ice?");
	}
	
}

class Frappuccino implements Coffee {
	@Override
	public void name() {
		System.out.println("프라푸치노");
	}
	@Override
	public void price() {
		System.out.println("4500원");
	}
	
}
  
public class IMain {
	
	public static void printCoffee(Coffee cf) {
		cf.name();
		cf.price();
		cf.hotIced();
		System.out.println();
	}
	
	public static void main(String[] args) {
		Coffee cf = new Espresso();
		printCoffee(cf);
		
		cf = new CaffeLatte();
		printCoffee(cf);
		
		cf = new VanillaLatte();
		printCoffee(cf);
		
		cf = new Frappuccino();
		printCoffee(cf);
		
	}
}
