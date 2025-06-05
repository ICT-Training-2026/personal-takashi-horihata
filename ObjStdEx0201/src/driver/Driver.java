package driver;

import store.Product;

public class Driver {

	public static void main(String[] args) {
		Product.displayStoreName();
		System.out.println();
		
		Product keyboard = new Product("キーボード");
		
		System.out.println("getPrice()の結果：" + keyboard.getPrice());
		
		keyboard.setPrice(2800);
		
		System.out.println("\n---再設定後---");
		keyboard.display();

	}

}
