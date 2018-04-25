package com.company.ht11.library.service.find;

import com.company.ht11.library.entity.PrintedEditions;
import com.company.ht11.library.service.find.Findable;

import java.util.ArrayList;
import java.util.List;

public class FindByTitle implements Findable {
    private String title;

    public FindByTitle(String title) {
        this.title = title;
    }

    @Override
    public List<PrintedEditions> find(List<PrintedEditions> units) {
        List<PrintedEditions> resultUnits = new ArrayList<>();

        for(int i = 0; i < units.size(); i++) {
            PrintedEditions obj = units.get(i);
            if (title.equals(obj.getTitle())) {
                resultUnits.add(obj);
            }
        }
        return resultUnits;
    }
}
