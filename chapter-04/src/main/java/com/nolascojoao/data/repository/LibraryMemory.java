package com.nolascojoao.data.repository;

import java.util.Objects;
import java.util.Optional;

import com.nolascojoao.data.Book;
import com.nolascojoao.data.dao.BookDAO;

public class LibraryMemory implements Library {

	private final BookDAO dao;

	public LibraryMemory(BookDAO dao) {
		this.dao = dao;
	}

	@Override
	public Book register(Book book) {
		Objects.requireNonNull(book, "book is required");
		if (dao.findById(book.getTitle()).isPresent()) {
			dao.update(book);
		} else {
			dao.insert(book);
		}
		return book;
	}

	@Override
	public Optional<Book> findByTitle(String title) {
		Objects.requireNonNull(title, "title is required");
		return dao.findById(title);
	}

	@Override
	public void unregister(Book book) {
		Objects.requireNonNull(book, "book is required");
		dao.deleteByTitle(book.getTitle());
	}

}
