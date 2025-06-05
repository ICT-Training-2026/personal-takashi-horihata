package store;

public class Product {
	private static final String STORE_NAME = "速水PC販売店";
	private static final int DEFAULT_CHANGE_AMT = 1000;
//	private static int instanceCnt = 0;
	private String name;
	private int price;	
	
	
//	class method
	public static void displayStoreName() {
		System.out.println("■店舗名：" + STORE_NAME);
	}
	
//	getter, setter
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price >= 0) {
			this.price = price;
		} else {
			System.out.println("0以上の値を入力してください");
		}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
//	methods
	public int up(int upPrice) {
		return price += upPrice;
	}
	public int up() {
		return this.up(DEFAULT_CHANGE_AMT);
	}
	
	public int down(int downPrice) {
		return price -= downPrice;
	}
	public int down() {
		return this.down(DEFAULT_CHANGE_AMT);
	}
	
	public void display() {
		System.out.println(name + ":" + price + "円");
	}
}
