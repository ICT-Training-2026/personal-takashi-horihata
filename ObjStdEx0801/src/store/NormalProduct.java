package store;

public class NormalProduct extends AbsProduct implements Deriverable {
	
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
	
	@Override
	public void displayDeliv() {
		System.out.print("【通常送料500円】");
		display();
//		System.out.println();
	}
}
