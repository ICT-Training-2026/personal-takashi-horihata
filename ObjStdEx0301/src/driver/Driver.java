package driver;

import store.SpecialProduct;

public class Driver {

	public static void main(String[] args) {
		SpecialProduct keyboard = new SpecialProduct();
		
		keyboard.setName("特価キーボード");
		keyboard.setPrice(3600);
		keyboard.setOrgPrice(4500);
		
		keyboard.display();
		keyboard.displayOrgPrice();

	}

}
