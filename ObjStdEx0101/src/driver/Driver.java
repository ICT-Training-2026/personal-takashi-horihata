package driver;

import store.Product;

public class Driver {

	public static void main(String[] args) {
		Product.displayStoreName();
		System.out.println();
		
		Product keyboard = new Product("キーボード", 4500);
		Product mouse = new Product("マウス", 2000);
		
		keyboard.down();
		mouse.up(500);
		
		keyboard.display();
		mouse.display();

	}

}
