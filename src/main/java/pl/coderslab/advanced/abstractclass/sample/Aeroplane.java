package pl.coderslab.advanced.abstractclass.sample;

public class Aeroplane extends Vehicle {
	@Override
	public void move() {
		System.out.println("Aeroplane is moving");
	}

	public void fly() {
		System.out.println("Aeroplane is flying");
	}
}
