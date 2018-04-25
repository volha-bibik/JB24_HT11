package com.company.ht11.library.entity;

import com.company.ht11.library.service.find.Findable;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private ArrayList<PrintedEditions> units = new ArrayList<>();

    public ArrayList<PrintedEditions> getUnits() {
        return units;
    }

    public Library() {
    }

    public void add(PrintedEditions unit) {
        units.add(unit);
    }

    public void remove(PrintedEditions unit) {
        units.remove(unit);
    }

    public List<PrintedEditions> find(Findable findMatcher){    //FindByTitle
        List<PrintedEditions> hasFind = null;
        hasFind = findMatcher.find(units);
        return hasFind;
    }


}
