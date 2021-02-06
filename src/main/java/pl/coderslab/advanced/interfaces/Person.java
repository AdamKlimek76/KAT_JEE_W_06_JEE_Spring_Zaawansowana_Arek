package pl.coderslab.advanced.interfaces;

public abstract class Person implements Movable {

	@Override
	public void stop() {
		System.out.println("Stój bezwględnie");
	}
}
