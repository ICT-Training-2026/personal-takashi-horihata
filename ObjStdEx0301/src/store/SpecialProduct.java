package store;

public class SpecialProduct extends Product {
	private int orgPrice;
	
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
}
