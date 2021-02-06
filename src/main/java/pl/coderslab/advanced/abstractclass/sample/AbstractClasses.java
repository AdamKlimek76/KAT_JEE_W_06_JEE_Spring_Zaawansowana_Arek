package pl.coderslab.advanced.abstractclass.sample;

import java.util.Arrays;
import java.util.List;

public class AbstractClasses {

	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle boat = new Boat();

		car.move();
		boat.move();

		Car anotherCar = new Car();
		anotherCar.drive();

		Boat anotherBoat = new Boat();
		anotherBoat.swim();

		List<Vehicle> vehicles = Arrays.asList(
				new Car(),
				new Boat(),
				new Aeroplane()
		);

		for(Vehicle vehicle : vehicles) {
			vehicle.move();
		}
	}
}
