package com.company.ht11.library.main;

import com.company.ht11.library.entity.*;
import com.company.ht11.library.service.find.FindByAuthor;
import com.company.ht11.library.service.find.Findable;
import com.company.ht11.library.service.sort.SortedByPublishingYear;
import com.company.ht11.library.service.sort.SortedByTitle;
import com.company.ht11.library.view.PrintAsTable;
import com.company.ht11.library.view.Printable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Library shell = new Library();
        shell.add(new Newspaper("Times", 34, 30, 4, true));
        shell.add(new Magazine("Playboy", 40, 50, 5, true));
        shell.add(new ProgrammingBook("Learn Java", 1200, 700, "Author1", "12+", 2011, "Java", "middle"));
        shell.add(new ScientificBook("New theory", 200, 300, "Author2", "12+", 2015, "math"));
        shell.add(new ProgrammingBook("Learn C++", 1400, 500, "Author1", "12+", 2014, "C++", "begin"));
        shell.add(new ProgrammingBook("Learn Java", 600, 400, "Author1", "12+", 2010, "Java", "begin"));

        Printable printer = new PrintAsTable();
        printer.print(shell.getUnits());

        Findable matcher = new FindByAuthor("Author1");
        List<PrintedEditions> lists = shell.find(matcher);
        System.out.print("\nFind Results:");
        printer.print(lists);

        System.out.print("\nSort By Publishing Year");
        Comparator<PrintedEditions> comparator = new SortedByPublishingYear();
        PrintedEditions[] array = new PrintedEditions[lists.size()];
        array = lists.toArray(array);
        Arrays.sort(array, comparator);
        printer.print(Arrays.asList(array));

        System.out.print("\nSort By Title");
        comparator = new SortedByTitle();
        Arrays.sort(array, comparator);
        printer.print(Arrays.asList(array));
    }
}
