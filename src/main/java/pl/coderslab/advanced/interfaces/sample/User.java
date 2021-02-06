package pl.coderslab.advanced.interfaces.sample;

public interface User {
	int getId();

	default int getAdminId() {
		return getId();
	}
}
