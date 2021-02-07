package pl.coderslab.advanced.interfaces.sample;

import java.util.ArrayList;
import java.util.List;

public class MemoryBookRepository implements BookRepository {

	//@Override
	//public List<Book> getBooksByName(String name) {
	//	List<Book> allBooks = getAllBooks();
	//
	//	if (name == null || "".equals(name)) {
	//		return allBooks;
	//	}
	//
	//	List<Book> result = new ArrayList<>();
	//	for (Book book : allBooks) {
	//		if (book.getName().equals(name)) {
	//			result.add(book);
	//		}
	//	}
	//	return result;
	//}

	@Override
	public List<Book> getAllBooks() {
		return new ArrayList<>();
	}
}
