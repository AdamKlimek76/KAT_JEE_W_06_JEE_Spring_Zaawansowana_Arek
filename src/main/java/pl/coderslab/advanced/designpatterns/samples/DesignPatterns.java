package pl.coderslab.advanced.designpatterns.samples;

public class DesignPatterns {
	public static void main(String[] args) {
		DbConnection connection = DbConnection.getConnection();

		boolean sameObjects = connection == DbConnection.getConnection();

		System.out.println(sameObjects);

		Temperature temperature = new Temperature();

		// bez obserwowania
		temperature.inc();
		temperature.inc();
		temperature.inc();
		temperature.dec();

		HighTemperatureAlertSystem alert = new HighTemperatureAlertSystem();
		temperature.subscribe(alert);

		temperature.inc();
		temperature.inc();
		temperature.inc();
		temperature.dec();
	}
}
