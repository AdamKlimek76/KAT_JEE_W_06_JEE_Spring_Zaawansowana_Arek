package pl.coderslab.advanced.designpatterns.samples;

import java.util.ArrayList;
import java.util.List;

public class Temperature implements Observable {
	private final List<Observer> observers = new ArrayList<>();

	public void inc() {
		for (Observer observer : observers) {
			observer.notifyInc();
		}
	}

	public void dec() {
		for (Observer observer : observers) {
			observer.notifyDec();
		}
	}

	@Override
	public void subscribe(Observer observer) {
		observers.add(observer);
	}
}
