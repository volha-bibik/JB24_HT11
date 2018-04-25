package com.company.ht11.library.entity;

import java.util.Objects;

public class Periodical extends PrintedEditions {

    private int number;

    public Periodical(String title, int pageCount, int price, int number) {
        super(title, pageCount, price);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Periodical that = (Periodical) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {

        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return super.toString() + "\tnumber=" + number;
    }
}
