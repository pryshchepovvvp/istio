package com.course.servicemesh.books.courseservicemeshbooks.models;

public class Book {
    private int id;
    private String title;
    private int pages;
    private int authorId;
    private String version;
    private int published;

    public Book(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }
    
    public void setPublished(int published) {
        this.published = published;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int autorId) {
        this.authorId = autorId;
    }

    public Book withTitle(String title) {
        this.setTitle(title);
        return this;
    }

    public Book withAuthorId(int author) {
        this.setAuthorId(author);
        return this;
    }

    public Book withPages(int pages) {
        this.setPages(pages);
        return this;
    }

    public Book withVersion(String version) {
        this.setVersion(version);
        return this;
    }

    public Book withPublished(int published) {
        this.setPublished(published);
        return this;
    }

}
