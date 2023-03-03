package com.edgar.rental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edgar.rental.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
