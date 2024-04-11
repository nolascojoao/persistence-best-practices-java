package com.nolascojoao.data.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.nolascojoao.data.Book;
import com.nolascojoao.data.db.BookSupplier;

public class BookMemoryTest {

	private BookDAO dao;

	@BeforeEach
	public void setUp() {
		this.dao = new BookMemory();
	}

	@Test
	@DisplayName("Return an exception when update without data information")
	public void shouldReturnWhenErrorWhenUpdateIsUsed() {
		Book book = BookSupplier.INSTANCE.get();
		Assertions.assertThrows(IllegalArgumentException.class, () -> dao.update(book));
	}

}
