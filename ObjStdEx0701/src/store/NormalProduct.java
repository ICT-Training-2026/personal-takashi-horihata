package store;

public class NormalProduct extends AbsProduct {
	
//	constructor
	public NormalProduct(String name, int price) {
		super(name, price);
	}
	public NormalProduct(String name) {
		this(name, 0);
	}
	
//	method
	@Override
	public void display() {
		String nameAndPrice = getNameAndPrice(); 
		System.out.println(nameAndPrice);
	}
}
