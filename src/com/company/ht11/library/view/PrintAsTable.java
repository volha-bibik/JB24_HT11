package com.company.ht11.library.view;

import com.company.ht11.library.entity.PrintedEditions;
import com.company.ht11.library.entity.Book;
import com.company.ht11.library.entity.Magazine;
import com.company.ht11.library.entity.Newspaper;
import com.company.ht11.library.entity.Periodical;
import com.company.ht11.library.entity.ProgrammingBook;
import com.company.ht11.library.entity.ScientificBook;

import java.util.List;

public class PrintAsTable implements Printable {
    @Override
    public void print(List<PrintedEditions> units) {
        System.out.println("\nPrint as Table: ");
        System.out.println(String.format("%10s %5s %10s %5s %10s %5s %10s %5s %15s %5s %10s %5s %10s %5s %10s %5s %10s %5s %15s %5s %10s %5s %10s %5s %10s",
                "Title", "|", "Price", "|", "Page count", "|", "Number", "|", "Author", "|", "Age limit", "|", "Year", "|", "Is glossy", "|",
                "Is color", "|", "Genre", "|", "Language", "|", "Level", "|", "Science section"));
        System.out.println(String.format("%s", "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"));
        for (PrintedEditions item: units){
            if (item instanceof com.company.ht11.library.entity.Magazine) {
                System.out.println(String.format("%10s %5s %10s %5s %10s %5s %10s %5s %15s %5s %10s %5s %10s %5s %10s %5s %10s %5s %15s %5s %10s %5s %10s %5s %10s",
                        item.getTitle(), "|", item.getPrice(), "|", item.getPageCount(), "|", ((Periodical) item).getNumber(), "|", "", "|", "", "|", "", "|",
                        ((Magazine) item).isGlossy(), "|", "", "|", "", "|", "", "|", "", "|", ""));
            }
            if (item instanceof com.company.ht11.library.entity.Newspaper) {
                System.out.println(String.format("%10s %5s %10s %5s %10s %5s %10s %5s %15s %5s %10s %5s %10s %5s %10s %5s %10s %5s %15s %5s %10s %5s %10s %5s %10s",
                        item.getTitle(), "|", item.getPrice(), "|", item.getPageCount(), "|", ((Periodical) item).getNumber(), "|", "", "|", "", "|", "", "|", "", "|",
                        ((Newspaper) item).isColor(), "|", "", "|", "", "|", "", "|", ""));
            }
            if (item instanceof com.company.ht11.library.entity.ProgrammingBook) {
                System.out.println(String.format("%10s %5s %10s %5s %10s %5s %10s %5s %15s %5s %10s %5s %10s %5s %10s %5s %10s %5s %15s %5s %10s %5s %10s %5s %10s",
                        item.getTitle(), "|", item.getPrice(), "|", item.getPageCount(), "|", "", "|", ((Book)item).getAuthor(), "|", ((Book)item).getAgeLimit(), "|",
                        ((Book)item).getPublishingYear(), "|", "", "|", "", "|", ((ProgrammingBook) item).getGenre(), "|", ((ProgrammingBook) item).getLanguage(),
                        "|", ((ProgrammingBook) item).getLevel(), "|", ""));
            }
            if (item instanceof com.company.ht11.library.entity.ScientificBook) {
                System.out.println(String.format("%10s %5s %10s %5s %10s %5s %10s %5s %15s %5s %10s %5s %10s %5s %10s %5s %10s %5s %15s %5s %10s %5s %10s %5s %10s",
                        item.getTitle(), "|", item.getPrice(), "|", item.getPageCount(), "|", "", "|", ((Book)item).getAuthor(), "|", ((Book)item).getAgeLimit(), "|",
                        ((Book)item).getPublishingYear(), "|", "", "|", "", "|", ((ScientificBook) item).getGenre(), "|", "",
                        "|", "", "|", ((ScientificBook) item).getScienceSection()));
            }
        }
    }
}
