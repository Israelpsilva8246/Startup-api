package com.israel.startupapi.repositories;

import com.israel.startupapi.model.Book;
import com.israel.startupapi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
