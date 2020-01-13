package org.launchcode.java.studios.restaurantmenu;

import java.util.Map;

public class Category {
    private Map<Integer, String> options = Map.ofEntries(
        Map.entry(1, "Appetizer"),
        Map.entry(2, "Main Course"),
        Map.entry(3, "Dessert")
    );
    private String name;

    public Category(int type) {
        this.name = options.get(type);
    }

}