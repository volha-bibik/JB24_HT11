package com.company.ht11.library.entity;

import java.util.Objects;

public class Newspaper extends Periodical {
    private boolean isColor;

    public Newspaper(String title, int pageCount, int price, int number, boolean isColor) {
        super(title, pageCount, price, number);
        this.isColor = isColor;
    }

    public boolean isColor() {
        return isColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Newspaper newspaper = (Newspaper) o;
        return isColor == newspaper.isColor;
    }

    @Override
    public int hashCode() {

        return Objects.hash(isColor);
    }

    @Override
    public String toString() {
        return super.toString() + "\tisColor=" + isColor;
    }
}
