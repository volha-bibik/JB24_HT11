package com.company.ht11.library.service.sort;

import com.company.ht11.library.entity.Book;
import com.company.ht11.library.entity.PrintedEditions;

import java.util.Comparator;

public class SortedByPublishingYear implements Comparator<PrintedEditions>{
    @Override
    public int compare (PrintedEditions o1, PrintedEditions o2) {

        if(o1 instanceof Book && o2 instanceof Book) {
            int year1 = ((Book) o1).getPublishingYear();
            int year2 = ((Book) o2).getPublishingYear();

            if(year1 > year2) {
                return 1;
            } else if(year1 < year2) {
                return -1;
            } else{
                return 0;
            }
        }
        return 0;
    }
}
