package com.nolascojoao.data;

import java.util.Objects;

public class Book {

	private final String title;
	private final String author;
	private final String publisher;
	private final String genre;

	public Book(String title, String author, String publisher, String genre) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.genre = genre;
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
	public int hashCode() {
		return Objects.hash(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", genre=" + genre + "]";
	}

	public static BookBuilder builder() {
		return new BookBuilder();
	}

}
