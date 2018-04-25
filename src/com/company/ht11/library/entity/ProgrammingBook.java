package com.company.ht11.library.entity;

import java.util.Objects;

public class ProgrammingBook extends Book {

    private final String genre = "programming";
    private String language;
    private String level;

    public ProgrammingBook(String title, int pageCount, int price, String author, String ageLimit, int publishingYear, String language, String level) {
        super(title, pageCount, price, author, ageLimit, publishingYear);
        this.language = language;
        this.level = level;
    }

    public String getGenre() {
        return genre;
    }

    public String getLanguage() {
        return language;
    }

    public String getLevel() {
        return level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProgrammingBook that = (ProgrammingBook) o;
        return Objects.equals(genre, that.genre) &&
                Objects.equals(language, that.language) &&
                Objects.equals(level, that.level);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), genre, language, level);
    }

    @Override
    public String toString() {
        return super.toString() + "\tgenre='" + genre + '\'' +
                "\tlanguage='" + language + '\'' +
                "\tlevel='" + level + '\'';
    }
}
