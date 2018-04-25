package com.company.ht11.library.entity;

import java.util.Objects;

public class ScientificBook extends Book {

    private final String genre = "scientific";
    private String scienceSection;

    public ScientificBook(String title, int pageCount, int price, String author, String ageLimit, int publishingYear, String scienceSection) {
        super(title, pageCount, price, author, ageLimit, publishingYear);
        this.scienceSection = scienceSection;
    }

    public String getGenre() {
        return genre;
    }

    public String getScienceSection() {
        return scienceSection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ScientificBook that = (ScientificBook) o;
        return Objects.equals(genre, that.genre) &&
                Objects.equals(scienceSection, that.scienceSection);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), genre, scienceSection);
    }

    @Override
    public String toString() {
        return super.toString() + "\tgenre='" + genre + '\'' +
                "\tscienceSection='" + scienceSection + '\'';
    }
}
