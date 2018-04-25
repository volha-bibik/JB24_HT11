package com.company.ht11.library.view;

import com.company.ht11.library.entity.PrintedEditions;

import java.util.List;

public class PrintAsList implements Printable {
    @Override
    public void print(List<PrintedEditions> units) {
        System.out.println("\nPrint as List: ");
        for (PrintedEditions item: units){
            item.print();
            System.out.println("");
        }
    }
}
