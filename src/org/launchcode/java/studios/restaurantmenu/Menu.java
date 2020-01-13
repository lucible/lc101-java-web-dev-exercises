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
    
}