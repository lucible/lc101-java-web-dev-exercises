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

    // name getter
    protected String getName() { return name; }

    // category getter
    protected Category getCategory() { return category; }

    // check if menu item is new or not
    protected boolean isNew() { return isNew; }

    // custom string output for debugging
    public String toString() {
        return name + " " + df.format(price) + " " + description + " " + category.getCategory() + " " + isNew;
    }

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
    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }

        if (toBeCompared == null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        MenuItem theMenuItem = (MenuItem) toBeCompared;
        return theMenuItem.getName().toLowerCase() == getName().toLowerCase();
    }
}