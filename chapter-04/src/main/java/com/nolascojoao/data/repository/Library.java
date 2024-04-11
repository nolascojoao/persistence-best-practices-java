package com.nolascojoao.data.repository;

import java.util.Optional;

import com.nolascojoao.data.Book;

public interface Library {

	Book register(Book book);

	Optional<Book> findByTitle(String title);

	void unregister(Book book);

}
