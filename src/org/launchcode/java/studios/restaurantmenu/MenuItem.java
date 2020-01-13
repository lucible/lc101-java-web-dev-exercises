package org.launchcode.java.studios.restaurantmenu;

import org.launchcode.java.studios.restaurantmenu.Category;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private Category category;
    private boolean itemStatus;

    protected MenuItem(String aName, double aPrice, String aDescription, Category aCategory, boolean aItemStatus) {
        this.name = aName;
        this.price = aPrice;
        this.description = aDescription;
        this.category = aCategory;
        this.itemStatus = aItemStatus;
    }

    protected String getName() { return name; }
    protected double getPrice() { return price; }
    protected String getDescription() { return description; }
    protected Category getCategory() { return category; }
    protected boolean getItemStatus() { return itemStatus; }

    protected void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    protected void updateStatus(boolean newItemStatus) {
        this.itemStatus = newItemStatus;
    }

}