package com.nolascojoao.data.dao;

import java.util.Optional;

import com.nolascojoao.data.Book;
import com.nolascojoao.data.mapper.BookMapper;

public class BookMemory implements BookDAO {

	private final BookMapper mapper;

	public BookMemory() {
		this.mapper = new BookMapper();
	}

	@Override
	public Optional<Book> findById(String id) {
		return mapper.findById(id);
	}

	@Override
	public void insert(Book book) {
		this.mapper.insert(book);

	}

	@Override
	public void update(Book book) {
		mapper.update(book);

	}

	@Override
	public void deleteByTitle(String title) {
		this.mapper.delete(title);

	}

}
