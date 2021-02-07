package pl.coderslab.advanced.interfaces.sample;

public class Rectangle implements Shape {
	private int a;

	public Rectangle(int a) {
		this.a = a;
	}

	@Override
	public int size() {
		return a * a;
	}

	@Override
	public int circuit() {
		return 4 * a;
	}
}
