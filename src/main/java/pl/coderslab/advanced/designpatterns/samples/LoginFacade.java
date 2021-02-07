package pl.coderslab.advanced.designpatterns.samples;

public class LoginFacade {
	private EmailValidator emailValidator;
	private PasswordValidator passwordValidator;
	private AccountValidator accountValidator;

	public boolean login() {
		return
			emailValidator.isOk("admin") &&
			passwordValidator.isOk("admin") &&
			accountValidator.isOk("admin");
	}
}
