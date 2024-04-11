package com.nolascojoao.data;

import com.nolascojoao.data.db.BookActiveRecordSupplier;

public class ActiveRecordApp {

	public static void main(String[] args) {
		com.nolascojoao.data.activerecord.Book book = BookActiveRecordSupplier.INSTANCE.get();
		book.insist();
		com.nolascojoao.data.activerecord.Book entity = book.findById(book.getTitle()).orElseThrow();
		System.out.println("the entity result: " + entity);
	}

}
