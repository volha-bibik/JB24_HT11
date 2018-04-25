package com.company.ht11.library.service.find;

import com.company.ht11.library.entity.PrintedEditions;

import java.util.List;

public interface Findable {
    List<PrintedEditions> find(List<PrintedEditions> units);
}