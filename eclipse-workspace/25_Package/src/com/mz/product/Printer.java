package com.mz.product;

public class Printer extends Product {
	public Printer() {
		// TODO Auto-generated constructor stub
	}
	
	public Printer(String name, int price) {
		super(name, price);
	}

	@Override
	public String toString() {
		return "Printer [name=" + name + ", price=" + price + "]";
	}

	
}
