package store;

public abstract class AbsProduct {
	private String name;
	private int price;	
	
//	constructor
	protected AbsProduct(String name, int price) {
		this.name = name;
		this.price = price;
	}
//	protected AbsProduct(String name) {
//		this(name, 0);
//	}
	
//	methods
	public abstract void display();
	
	protected String getNameAndPrice() {
		return name + "：" + price + "円";
	}
}
