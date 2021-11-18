package com.course.servicemesh.authors.courseservicemeshauthors.services;

import com.course.servicemesh.authors.courseservicemeshauthors.models.Author;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;

@Component
public class AuthorService {
    private final HashMap<Integer, Author> authors;

    public AuthorService() {
        this.authors = new HashMap<>();
        this.authors.put(1, new Author(1).withVersion("v1.1").withDeveloper("Pryshchepov").withFirstName("Loreth Anne").withLastName("White").withBirthDate("01.01.1975").withNation("SouthAfrica"));
        this.authors.put(2, new Author(2).withVersion("v1.1").withDeveloper("Pryshchepov").withFirstName("Lisa").withLastName("Regan").withBirthDate("03.04.1956").withNation("American"));
        this.authors.put(3, new Author(3).withVersion("v1.1").withDeveloper("Pryshchepov").withFirstName("Ty").withLastName("Patterson").withBirthDate("08.10.1988").withNation("American"));
        this.authors.put(4, new Author(4).withVersion("v1.1").withDeveloper("Pryshchepov").withFirstName("Mikhail").withLastName("Sholokhov").withBirthDate("24.05.1905").withNation("Russian"));
        this.authors.put(5, new Author(5).withVersion("v1.1").withDeveloper("Pryshchepov").withFirstName("Mikhail").withLastName("Bulhakov").withBirthDate("03.04.1891").withNation("Russian"));
        this.authors.put(5, new Author(6).withVersion("v1.1").withDeveloper("Pryshchepov").withFirstName("Reks").withLastName("Stout").withBirthDate("01.12.1886").withNation("American"));
    }

    public Collection<Author> getAuthors() {
        return this.authors.values();
    }

    public Author findById(int id) {
        return this.authors.get(id);
    }
}
