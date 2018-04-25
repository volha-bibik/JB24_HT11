package com.company.ht11.library.entity;

import java.util.Objects;

public class Book extends PrintedEditions {
    private String author;
    private String ageLimit;
    private int publishingYear;

    public Book(String title, int pageCount, int price, String author, String ageLimit, int publishingYear) {
        super(title, pageCount, price);
        this.author = author;
        this.ageLimit = ageLimit;
        this.publishingYear = publishingYear;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getAgeLimit() {
        return ageLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear &&
                Objects.equals(author, book.author) &&
                Objects.equals(ageLimit, book.ageLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, ageLimit, publishingYear);
    }

    @Override
    public String toString() {
        return super.toString() + "\tauthor='" + author + '\'' +
                "\tageLimit='" + ageLimit + '\'' +
                "\tpublishingYear=" + publishingYear;
    }
}
