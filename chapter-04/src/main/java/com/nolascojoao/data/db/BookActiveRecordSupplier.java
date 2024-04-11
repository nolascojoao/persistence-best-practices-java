package com.nolascojoao.data.db;

import java.util.function.Supplier;

import com.github.javafaker.Faker;
import com.nolascojoao.data.activerecord.Book;

public enum BookActiveRecordSupplier implements Supplier<Book> {
	INSTANCE;

	private final Faker faker = new Faker();
	
	@Override
	public Book get() {
		com.github.javafaker.Book book = faker.book();
		
		return Book.builder()
				.title(book.title())
				.author(book.author())
				.genre(book.genre())
				.publisher(book.publisher())
				.build();
	}

}
