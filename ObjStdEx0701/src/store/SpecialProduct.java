package store;

public class SpecialProduct extends AbsProduct {
	private int orgPrice;
	
//	constructor
	public SpecialProduct(String name, int price, int orgPrice) {
		super(name, price);
		this.orgPrice = orgPrice;
	}
	public SpecialProduct(String name) {
		this(name, 0, 0);
	}
	
//	method
	@Override
	public void display() {
		String nameAndPrice = getNameAndPrice(); 
		System.out.println(nameAndPrice + "(定価：" + orgPrice + "円)");
	}
}
