package store;

public class LimitedProduct extends AbsProduct {
	private int dayCnt;
	
//	constructor
	public LimitedProduct(String name, int price, int dayCnt) {
		super(name, price);
		this.dayCnt = dayCnt;
	}
	public LimitedProduct(String name) {
		this(name, 0, 0);
	}
	
//	method	
	public int minusDayCnt(int minus) {
		return (dayCnt -= minus);
	}
	
	@Override
	public void display() {
		if (0 < dayCnt) {
			String nameAndPrice = getNameAndPrice(); 
			System.out.println(nameAndPrice + "(配送不可)(残り：" + dayCnt + "日)");
		}
	}
}
