package pl.coderslab.advanced.designpatterns;

public class Main4 {
	public static void main(String[] args) {
		Post post = new Post();
		post.setTitle("Wzorce projektowe");
		post.setContent("Fajne takie nie za łatwe nie za trudne");

		FacebookObserver facebookObserver = new FacebookObserver();
		TwitterObserver twitterObserver = new TwitterObserver();

		post.attach(facebookObserver);
		post.attach(twitterObserver);

		post.share();
	}
}
