package com.company.ht11.library.service.find;

import com.company.ht11.library.entity.Book;
import com.company.ht11.library.entity.PrintedEditions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FindByAuthor implements Findable {
    private String author;

    public FindByAuthor(String author) {
        this.author = author;
    }

    @Override
    public List<PrintedEditions> find(List<PrintedEditions> units) {
        List<PrintedEditions> resultUnits = new ArrayList<>();
        for (PrintedEditions item : units) {
            if (item instanceof Book) {
                if (author.equals(((Book) item).getAuthor())) {
                    resultUnits.add(item);
                }
            }
        }
        resultUnits.sort(Comparator.comparing(PrintedEditions::getPrice));
        return resultUnits;
    }
}
