package pl.coderslab.advanced.interfaces.sample;

public interface Identifiable {
	Long getId();

	default String getStringId() {
		return getId().toString();
	}
}
