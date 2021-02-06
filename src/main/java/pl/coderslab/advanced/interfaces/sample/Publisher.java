package pl.coderslab.advanced.interfaces.sample;

public class Publisher implements Identifiable {
	private final Long id;
	private String name = "unknown";

	public Publisher(Long id) {
		this.id = id;
	}

	@Override
	public Long getId() {
		return this.id;
	}

	public String name() {
		return name;
	}
}
