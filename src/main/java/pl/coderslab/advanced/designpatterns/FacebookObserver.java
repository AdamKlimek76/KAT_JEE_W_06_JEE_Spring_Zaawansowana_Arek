package pl.coderslab.advanced.designpatterns;

public class FacebookObserver implements Observer {

	private void reactOnNewPost(String title) {
		System.out.println("Facebook: nowy post o tytule " + title);
	}

	@Override
	public void update(String title) {
		reactOnNewPost(title);
	}
}
