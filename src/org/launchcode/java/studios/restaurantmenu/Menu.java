package org.launchcode.java.studios.restaurantmenu;

import org.launchcode.java.studios.restaurantmenu.MenuItem;
import java.util.Date;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;

    // constructor
    public Menu(ArrayList<MenuItem> aMenuItems, Date aLastUpdated) {
        this.menuItems = aMenuItems;
        this.lastUpdated = aLastUpdated;
    }

    // getters
    public ArrayList<MenuItem> getMenuItems() { return menuItems; }
    public Date getLastUpdated() { return lastUpdated; }

    // setters
    public void updateMenuItems(ArrayList<MenuItem> aMenuItems) {
        this.menuItems = aMenuItems;
    }
    public void updateLastUpdated(Date aLastUpdated) {
        this.lastUpdated = aLastUpdated;
    }

    // add menu item
    public void addMenuItem(MenuItem item) {
        this.menuItems.add(item);
        this.lastUpdated = new Date();
    }

    // remove menu item
    public void removeMenuItem(MenuItem item) {
        int index = this.menuItems.indexOf(item);
        if (index != -1) {
            this.menuItems.remove(index);
        }
        // int id = 0
        // for (MenuItem i : this.menuItems) {
        //     id++;
        //     if i.equals(item) {
        //         this.menuItems.remove(i);
        //     }
        // }
    }

    // last updated
    public Date lastUpdated() {
        return this.lastUpdated;
    }

    // print menu
    public void printMenu() {

    }
}