package com.nolascojoao.data.activerecord;

import java.util.Objects;

public class Book extends Model {

	private final String title;
	private final String author;
	private final String publisher;
	private final String genre;

	Book(String title, String author, String publisher, String genre) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.genre = genre;
	}

	@Override
	public String getId() {
		return title;
	}

	@Override
	public Book instance() {
		return this;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getGenre() {
		return genre;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Book book = (Book) o;
		return Objects.equals(title, book.title);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(title);
	}

	@Override
	public String toString() {
		return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + ", publisher='" + publisher + '\''
				+ ", genre='" + genre + '\'' + '}';
	}

	public static BookBuilder builder() {
		return new BookBuilder();
	}

}
