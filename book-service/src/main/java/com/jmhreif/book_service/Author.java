package com.jmhreif.book_service;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Relationship;

public record Author(@Id String author_id,
                      String name,
                      Integer average_rating,
                      Integer ratings_count,
                      @Relationship("AUTHORED") List<Book> books) {
}
