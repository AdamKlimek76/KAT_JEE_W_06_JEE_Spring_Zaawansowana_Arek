package pl.coderslab.advanced.interfaces.sample;

import java.util.Arrays;
import java.util.List;

public class Interfaces {
	public static void main(String[] args) {
		List<Identifiable> objects = Arrays.asList(
				new Book(1L, 40),
				new Book(2L, 500),
				new Publisher(1L)
		);

		for (Identifiable object : objects) {
			Long id = object.getId();
			System.out.println(object.getClass().getSimpleName() + " id: " + id);
		}

		List<Sizable> sizableElements = Arrays.asList(
			new Book(3L, 50),
			new Rectangle(4)
		);

		for (Sizable element: sizableElements) {
			int size = element.size();
			System.out.println("Rozmiar: " + element.getClass().getSimpleName()
					+ " to: " + size);
		}

		Shape rectangle = new Rectangle(5);
		System.out.println(rectangle.size());
		System.out.println(rectangle.circuit());
	}
}
