package com.nolascojoao.data;

import com.nolascojoao.data.db.BookSupplier;
import com.nolascojoao.data.mapper.BookMapper;

public class MapperApp {
	
	public static void main(String[] args) {
		Book book = BookSupplier.INSTANCE.get();
		BookMapper mapper = new BookMapper();
		mapper.insert(book);
		Book entity = mapper.findById(book.getTitle()).orElseThrow();
		
		System.out.println("the entity result: " + entity);
	}

}
