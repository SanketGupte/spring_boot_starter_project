package com.sanket.app.ws.repositories;

import com.sanket.app.ws.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
