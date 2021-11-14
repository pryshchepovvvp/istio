package com.course.servicemesh.books.courseservicemeshbooks.services;

import com.course.servicemesh.books.courseservicemeshbooks.models.Book;
import org.springframework.stereotype.Component;
import java.util.Collection;
import java.util.HashMap;

@Component
public class BookService {
    private final HashMap<Integer, Book> books;

    public BookService() {
        books = new HashMap<Integer, Book>();
        books.put(1, new Book(1).withVersion("v2.0").withTitle("Semiosis: A Novel").withPages(326).withAuthorId(1).withPublished(2018));
        books.put(2, new Book(2).withVersion("v2.0").withTitle("The Loosening Skin").withPages(132).withAuthorId(1).withPublished(2018));
        books.put(3, new Book(3).withVersion("v2.0").withTitle("Ninefox Gambit").withPages(384).withAuthorId(2).withPublished(2016));
        books.put(4, new Book(4).withVersion("v2.0").withTitle("Raven Stratagem").withPages(400).withAuthorId(3).withPublished(2017));
        books.put(5, new Book(5).withVersion("v2.0").withTitle("Revenant Gun").withPages(466).withAuthorId(3).withPublished(2018));
        books.put(6, new Book(6).withVersion("v2.0").withTitle("Master and Margarita").withPages(504).withAuthorId(5).withPublished(1939));
        books.put(7, new Book(7).withVersion("v2.0").withTitle("Three doors to death").withPages(240).withAuthorId(6).withPublished(1950));
        books.put(8, new Book(8).withVersion("v2.0").withTitle("The golden spiders").withPages(224).withAuthorId(6).withPublished(1953));
    }

    public Collection<Book> getBooks() {
        return this.books.values();
    }

    public Book findById(int id) {
        return this.books.get(id);
    }
}
