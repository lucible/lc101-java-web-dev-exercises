package org.launchcode.java.studios.restaurantmenu;

import org.launchcode.java.studios.restaurantmenu.Category;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private Category category;
    private boolean itemStatus;

    // good shout from studio member: save date when item is added
    // and check for it in method
    // how else are you going to know how old the item is?

    // constructor
    protected MenuItem(String aName, double aPrice, String aDescription, Category aCategory, boolean aItemStatus) {
        this.name = aName;
        this.price = aPrice;
        this.description = aDescription;
        this.category = aCategory;
        this.itemStatus = aItemStatus;
    }

    // getters
    protected String getName() { return name; }
    protected double getPrice() { return price; }
    protected String getDescription() { return description; }
    protected Category getCategory() { return category; }
    protected boolean getItemStatus() { return itemStatus; }

    // setters
    protected void updatePrice(double newPrice) {
        this.price = newPrice;
    }
    protected void updateStatus(boolean newItemStatus) {
        this.itemStatus = newItemStatus;
    }

    // print menu item
    public void printMenuItem() {

    }

    // equals function
    public boolean equals() {
        // insert object equality code here
        return true;
    }

    // new item
    public boolean isNewItem() {
        return this.itemStatus;
    }
}