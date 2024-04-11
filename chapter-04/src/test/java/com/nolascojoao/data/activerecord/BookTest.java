package com.nolascojoao.data.activerecord;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.nolascojoao.data.db.BookActiveRecordSupplier;

public class BookTest {

	@Test
	public void shouldInsert() {
		Book book = BookActiveRecordSupplier.INSTANCE.get();
		book.insist();
		Book model = Book.findById(book.getId()).orElseThrow();
		Assertions.assertNotNull(model);

		SoftAssertions.assertSoftly(softly -> {
			softly.assertThat(book.getId()).isEqualTo(model.getId());
			softly.assertThat(book.getAuthor()).isEqualTo(model.getAuthor());
			softly.assertThat(book.getGenre()).isEqualTo(model.getGenre());
			softly.assertThat(book.getPublisher()).isEqualTo(model.getPublisher());
		});
	}

}
