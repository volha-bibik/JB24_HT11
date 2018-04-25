package com.company.ht11.library.entity;

import java.util.Comparator;
import java.util.Objects;

public class PrintedEditions {
    private String title;
    private int pageCount;
    private double price;

    public PrintedEditions(String title, int pageCount, int price) {
        this.title = title;
        this.pageCount = pageCount;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.print(this.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrintedEditions that = (PrintedEditions) o;
        return pageCount == that.pageCount &&
                price == that.price &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, pageCount, price);
    }

    @Override
    public String toString() {
        return  "title='" + title + '\'' +
                "\tpageCount=" + pageCount +
                "\tprice=" + price;
    }

/*    @Override
    public int compareTo(PrintedEditions o) {
        return this.title.compareTo(o.title);
    }*/

    public static Comparator<PrintedEditions> PrintedEditionsComparator = new Comparator<PrintedEditions>() {
        @Override
        public int compare(PrintedEditions o1, PrintedEditions o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    };
}
