package programacaofuncional.interfacefuncional.predicate.util;

import java.util.function.Predicate;

import programacaofuncional.interfacefuncional.predicate.entities.Product;

public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product t) {
		return t.getPrice() >= 100.0;
	}

}
