package com.rk.book.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BookEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String bookName;

    private String author;

    public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		this.Id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public BookEntity() {
    }

    public BookEntity(Long Id, String BookName, String Author) {
        this.Id = Id;
        this.bookName = BookName;
        this.author = Author;
    }
    public BookEntity( String BookName, String Author) {
    	this.bookName = BookName;
        this.author = Author;
    }
    @Override
    public String toString() {
        return this.Id + " - " + this.bookName + "-"+ this.author;
    }
}
