package com.edgar.rental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edgar.rental.models.Book;

public interface BookRepository  extends JpaRepository<Book, Long>{

}
