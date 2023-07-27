package com.rk.book.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rk.book.model.BookEntity;

@Repository
public interface BookRepository extends CrudRepository<BookEntity, Long> {

}
