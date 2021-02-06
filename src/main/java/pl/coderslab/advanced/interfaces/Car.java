package pl.coderslab.advanced.interfaces;

public class Car implements Movable {
	@Override
	public void start() {
		System.out.println("Samochód jedzie");
	}

	@Override
	public void stop() {

	}
}
