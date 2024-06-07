package com.jmhreif.book_service;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public record Book(@Id String book_id,
                    String title,
                    Integer average_rating,
                    Integer ratings_count,
                    String url) {
}
