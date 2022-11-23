package programacaofuncional.interfacefuncional.function.util;

import java.util.function.Function;

import programacaofuncional.interfacefuncional.function.entities.Product;

public class UpperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
