package org.launchcode.java.studios.restaurantmenu;

import java.text.DecimalFormat;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private Category category;
    private boolean isNew;

    DecimalFormat df = new DecimalFormat("$#.00");

    // good shout from studio member: save date when item is added
    // and check for it in method
    // how else are you going to know how old the item is?

    // constructor
    public MenuItem(String aName, double aPrice, String aDescription, Category aCategory, boolean aIsNew) {
        this.name = aName;
        this.price = aPrice;
        this.description = aDescription;
        this.category = aCategory;
        this.isNew = aIsNew;
    }

    // category getter
    protected Category getCategory() { return category; }

    // custom string output for debugging
    public String toString() {
        return name + " " + df.format(price) + " " + description + " " + category.getCategory() + " " + isNew;
    }

    // check if menu item is new or not?

    // print out a single menu item
    protected void printFormatted() {
        String latest = "(NEW!)";
        if (isNew == true) {
            System.out.println(df.format(price) + " - " + name + " - " + description + " " + latest);
        } else {
            System.out.println(df.format(price) + " - " + name + " - " + description);
        }
    }

    // are two menu items equal?
    public boolean equals() {
        // TO DO: insert object equality code here
        return true;
    }
}