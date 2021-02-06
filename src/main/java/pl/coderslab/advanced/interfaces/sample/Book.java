package pl.coderslab.advanced.interfaces.sample;

//public class Book extends IdentifiableAbstractClass {}
public class Book implements Identifiable, Sizable {
	private final Long id;
	private final int size;

	public Book(Long id, int size) {
		this.id = id;
		this.size = size;
	}

	@Override
	public Long getId() {
		return this.id;
	}

	@Override
	public int size() {
		return this.size;
	}
}
