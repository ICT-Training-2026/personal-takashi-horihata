package store;

public class SpecialProduct extends Product {
	private int orgPrice;
	
//	constructor
	public SpecialProduct(String name, int price, int orgPrice) {
		super(name, price);
		this.orgPrice = orgPrice;
	}
	public SpecialProduct(String name) {
		this(name, 0, 0);
	}
	
//	getter, setter
	public int getOrgPrice() {
		return orgPrice;
	}
	public void setOrgPrice(int orgPrice) {
		this.orgPrice = orgPrice;
	}
	
//	method
	public void displayOrgPrice() {
		System.out.println("定価：" + orgPrice + "円");
	}
	
	@Override
	public void display() {
		System.out.print(super.getName() + "：" + super.getPrice() + "円");
		System.out.println("(定価：" + orgPrice + "円)");
	}
}
