package com.nolascojoao.data;

import java.util.Optional;

import com.nolascojoao.data.dao.BookMemory;
import com.nolascojoao.data.db.BookSupplier;
import com.nolascojoao.data.repository.Library;
import com.nolascojoao.data.repository.LibraryMemory;

public class RepositoryApp {

	public static void main(String[] args) {
		Book book = BookSupplier.INSTANCE.get();
		Library library = new LibraryMemory(new BookMemory());
		library.register(book);
		Optional<Book> entity = library.findByTitle(book.getTitle());
		System.out.println("the entity result: " + entity);
	}

}
