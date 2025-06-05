package driver;

import store.AbsProduct;
import store.Deriverable;
import store.LimitedProduct;
import store.NormalProduct;
import store.SpecialProduct;

public class Driver {

	public static void main(String[] args) {
		AbsProduct[] prods = makeProductList();
		
		System.out.println("---商品リスト---");
		displayProductList(prods);
		System.out.println();
		
		Deriverable[] derivProds = getDeliverable(prods);
		
		System.out.println("---配送可能商品---");
		displayDelivList(derivProds);

	}
	
	public static AbsProduct[] makeProductList() {
		AbsProduct[] prods = {
				new LimitedProduct("マウス", 2000, 10),
				new SpecialProduct("特化キーボード", 3600, 4500),
				new LimitedProduct("Webカメラ", 3900, 7),
				new NormalProduct("マイク",2800),
				new SpecialProduct("ディスプレイ", 15000, 20000),
				new NormalProduct("LED照明", 4200)
		};
		return prods;
	}
	
	public static void displayProductList(AbsProduct[] absProd) {
		for (int i=0; i<absProd.length; i++) {
			absProd[i].display();
		}
	}
	
	public static Deriverable[] getDeliverable(AbsProduct[] prods) {
		Deriverable[] derivProds = new Deriverable[prods.length];
		int casCnt = 0;
		for (int i=0; i<prods.length; i++) {
			if (prods[i] instanceof Deriverable) {
				derivProds[casCnt] = (Deriverable) prods[i];
				casCnt++;
			}
		}
		return derivProds;
	}
	
	public static void displayDelivList(Deriverable[] derivProds) {
		for (int i=0; i<derivProds.length; i++) {
			if (derivProds[i] == null) {
				break;
			}
			derivProds[i].displayDeliv();
		}
	}

}
