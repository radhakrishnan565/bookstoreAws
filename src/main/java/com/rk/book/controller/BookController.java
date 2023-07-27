package com.rk.book.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rk.book.model.BookEntity;
import com.rk.book.repository.BookRepository;

@RestController
@RequestMapping("book")
public class BookController {

	private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public @ResponseBody BookEntity getBook(@PathVariable Long id) {
        return bookRepository.findById(id).get();
    }
    @GetMapping
    public List<BookEntity> getAllBooks() {
        return (List<BookEntity>) bookRepository.findAll();
    }
    @PostMapping
    public BookEntity createBook(@RequestBody BookEntity book) {
    	System.out.println("Save Book:"+book.toString());
        return bookRepository.save(book);
    }
    @PutMapping("/{id}")
    public BookEntity updateBook(@PathVariable("id") Long id, @RequestBody BookEntity book) {
    	System.out.println("update Book:"+book.toString());
    	return bookRepository.save(book);
    }
    @DeleteMapping(value = "/{id}")
    public void removeBook(@PathVariable Long id) {
    	bookRepository.deleteById(id);
    }
}
