package org.launchcode.java.studios.restaurantmenu;

import org.launchcode.java.studios.restaurantmenu.MenuItem;
import java.util.Date;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;

    // basic constructor
    public Menu(ArrayList<MenuItem> aMenuItems, Date aLastUpdated) {
        this.menuItems = aMenuItems;
        this.lastUpdated = aLastUpdated;
    }

    // constructor overload for default initialization
    public Menu() {
        this.menuItems = new ArrayList<MenuItem>();
        this.lastUpdated = new Date();
    }

    // add menu item
    public void addMenuItem(MenuItem newItem) {
        boolean dup = false;
        for (MenuItem item : this.menuItems) {
            if (item.equals(newItem)) {
                dup = true;
            }
        }
        if (dup) {
            System.out.println("\nERROR: menu item already in menu!\n");
        } else {
            this.menuItems.add(newItem);
            this.lastUpdated = new Date();
        }
    }

    // remove menu item
    public void removeMenuItem(MenuItem item) {
        int index = this.menuItems.indexOf(item);
        if (index != -1) {
            this.menuItems.remove(index);
        }
        this.lastUpdated = new Date();
    }

    // print out the entire menu
    public void printMenu() {
        System.out.println("==== MENU (Updated " + lastUpdated + ") ====");
        for (Category c : Category.values()) {
            System.out.println("\n=== " + c.getCategory() + " ===\n");
            for (MenuItem item : this.menuItems) {
                if (item.getCategory() == c) {
                    item.printFormatted();
                }
            }
        }
    }
}