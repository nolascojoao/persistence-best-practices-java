package com.nolascojoao.data.dao;

import java.util.Optional;

import com.nolascojoao.data.Book;

public interface BookDAO {

	Optional<Book> findById(String id);

	void insert(Book book);

	void update(Book book);

	void deleteByTitle(String title);

}
