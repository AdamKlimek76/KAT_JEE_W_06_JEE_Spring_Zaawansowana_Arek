package pl.coderslab.advanced.designpatterns.samples;

public class HighTemperatureAlertSystem implements Observer {
	@Override
	public void notifyInc() {
		System.out.println("Na termomentrze zwiększono temperature");
	}

	@Override
	public void notifyDec() {
		// nie obchodzi nas to
	}
}
