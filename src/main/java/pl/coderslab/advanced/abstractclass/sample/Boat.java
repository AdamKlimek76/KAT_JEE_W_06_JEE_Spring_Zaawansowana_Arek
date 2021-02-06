package pl.coderslab.advanced.abstractclass.sample;

public class Boat extends Vehicle {

	@Override
	public void move() {
		System.out.println("Boat is moving");
	}

	public void swim() {
		System.out.println("Boat is swimming");
	}
}
