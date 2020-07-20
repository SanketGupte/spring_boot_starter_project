package com.sanket.app.ws.repositories;

import com.sanket.app.ws.domain.Author;
import org.springframework.data.repository.CrudRepository;


public interface AuthorRepository extends CrudRepository<Author, Long> {
}
