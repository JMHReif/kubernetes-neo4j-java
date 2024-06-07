package com.jmhreif.book_service;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

public interface AuthorRepository extends Neo4jRepository<Author, String>{
    @Query("MATCH (a:Author {name: $author})-[r:AUTHORED]->(b:Book) RETURN a, collect(r), collect(b);")
    List<Author> findBooksByAuthor(String author);
}
