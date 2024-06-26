package com.nolascojoao.data;

import com.nolascojoao.data.dao.BookDAO;
import com.nolascojoao.data.dao.BookMemory;
import com.nolascojoao.data.db.BookSupplier;

public class DAOApp {

	public static void main(String[] args) {
		Book book = BookSupplier.INSTANCE.get();
		BookDAO dao = new BookMemory();
		dao.insert(book);
		Book entity = dao.findById(book.getTitle()).orElseThrow();
		System.out.println("the entity result: " + entity);
	}

}
