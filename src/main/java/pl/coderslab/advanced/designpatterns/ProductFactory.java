package pl.coderslab.advanced.designpatterns;

public class ProductFactory {

	public Product create(String type) {
		if ("virtual".equals(type)) {
			return new VirtualProduct();
		}

		if ("simple".equals(type)) {
			return new SimpleProduct();
		}

		if ("advanced".equals(type)) {
			return new AdvancedProduct();
		}

		throw new IllegalArgumentException("unknown product");
	}
}
