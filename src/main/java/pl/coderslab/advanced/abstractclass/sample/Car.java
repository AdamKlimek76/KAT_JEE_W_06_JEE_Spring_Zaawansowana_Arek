package pl.coderslab.advanced.abstractclass.sample;

public class Car extends Vehicle {

	@Override
	public void move() {
		System.out.println("Car is moving");
	}

	public void drive() {
		System.out.println("Car is driving");
	}
}
