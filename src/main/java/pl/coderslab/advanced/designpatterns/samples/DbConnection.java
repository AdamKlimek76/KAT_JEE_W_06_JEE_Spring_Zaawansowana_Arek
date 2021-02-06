package pl.coderslab.advanced.designpatterns.samples;

public class DbConnection {
	private static DbConnection INSTANCE;

	private DbConnection() {}

	public static DbConnection getConnection() {
		if (INSTANCE != null) {
			return INSTANCE;
		}

		INSTANCE = new DbConnection();
		return INSTANCE;
	}
}
