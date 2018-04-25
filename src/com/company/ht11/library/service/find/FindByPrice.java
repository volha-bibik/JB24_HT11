package com.company.ht11.library.service.find;

import com.company.ht11.library.entity.PrintedEditions;
import com.company.ht11.library.service.find.Findable;

import java.util.ArrayList;
import java.util.List;

public class FindByPrice implements Findable {
    private double price;

    public FindByPrice(double price) {
        this.price = price;
    }

    @Override
    public List<PrintedEditions> find(List<PrintedEditions> units) {
        List<PrintedEditions> resultUnits = new ArrayList<>();

        for(int i = 0; i < units.size(); i++) {
            PrintedEditions obj = units.get(i);
            if (price == obj.getPrice()) {
                resultUnits.add(obj);
            }
        }
        return resultUnits;
    }
}
