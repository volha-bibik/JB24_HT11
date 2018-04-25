package com.company.ht11.library.service.sort;

import com.company.ht11.library.entity.PrintedEditions;
import java.util.Comparator;

public class SortedByTitle implements Comparator<PrintedEditions> {
    @Override
    public int compare(PrintedEditions o1, PrintedEditions o2) {
        String title1 = o1.getTitle();
        String title2 = o2.getTitle();

        return title1.compareTo(title2);
    }
}
