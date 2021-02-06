package pl.coderslab.advanced.designpatterns;

public class Main2 {
	public static void main(String[] args) {
		ProductFactory productFactory = new ProductFactory();

		Product virtualProduct =
				productFactory.create("virtual");
		System.out.println(virtualProduct.getClass().getSimpleName());

		Product simpleProduct =
				productFactory.create("simple");
		System.out.println(simpleProduct.getClass().getSimpleName());

		Product advancedProduct =
				productFactory.create("advanced");
		System.out.println(advancedProduct.getClass().getSimpleName());
	}
}
