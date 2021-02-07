package pl.coderslab.advanced.designpatterns.samples;

public class AccountValidator implements Validator {
	@Override
	public boolean isOk(String asset) {
		return true;
	}
}
