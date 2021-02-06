package pl.coderslab.advanced.interfaces;

public class UrlMain {
	public static void main(String[] args) {
		Url url = new StandardUrl();
		String result = url.getParam("param1", "url_example?param1=99&param2=string");
		System.out.println(result);

		String result2 = url.getParam("param2", "url_example?param1=99&param2=string");
		System.out.println(result2);

		Url extendedUrl = new ExtendedUrl();
		String result3 = extendedUrl.getParam("param1", "url_example/param1.55/param2.byte");
		System.out.println(result3);

		String result4 = extendedUrl.getParam("param2", "url_example/param1.55/param2.byte");
		System.out.println(result4);
	}
}
