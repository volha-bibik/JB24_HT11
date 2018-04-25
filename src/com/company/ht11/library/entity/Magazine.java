package com.company.ht11.library.entity;

import java.util.Objects;

public class Magazine extends Periodical {

    private boolean isGlossy;

    public Magazine(String title, int pageCount, int price, int number, boolean isGlossy) {
        super(title, pageCount, price, number);
        this.isGlossy = isGlossy;
    }

    public boolean isGlossy() {
        return isGlossy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return isGlossy == magazine.isGlossy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isGlossy);
    }

    @Override
    public String toString() {
        return super.toString() + "\tisGlossy=" + isGlossy;
    }
}
