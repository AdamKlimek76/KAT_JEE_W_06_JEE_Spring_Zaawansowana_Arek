package pl.coderslab.advanced.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class Post implements Subject {
	private String content;
	private String title;

	private final List<Observer> observers = new ArrayList<>();

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this.title);
		}
	}

	public void share() {
		notifyObservers();
	}



	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
