package pl.coderslab.advanced.interfaces.sample;

public class LibraryUser implements User {
	@Override
	public int getId() {
		return 1;
	}

	@Override
	public int getAdminId() {
		return 0;
	}
}
