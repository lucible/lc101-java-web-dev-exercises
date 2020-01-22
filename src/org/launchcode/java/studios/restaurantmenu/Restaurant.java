package org.launchcode.java.studios.restaurantmenu;

public class Restaurant {
    public static void main(String[] args) {
        // make a new menu
        Menu breakfast = new Menu();
        
        // create several items ...
        MenuItem scrambledEggs = new MenuItem("Scrambled Eggs", 5.00, "Fluffy and delicious!", Category.APPETIZER, true);
        MenuItem pancakes = new MenuItem("Pancakes", 10.00, "A stack of our silver dollar pancakes with a side of your choice.", Category.MAIN, true);
        MenuItem crepe1 = new MenuItem("Strawberry Crepes", 7.00, "Delicate crepes filled with our homemade strawberry jam.", Category.DESSERT, false);
        MenuItem fruit = new MenuItem("Fresh Fruit", 4.00, "A mix of fruit including grapes, strawberries, and melon.", Category.APPETIZER, false);

        // and add them to the menu.
        breakfast.addMenuItem(scrambledEggs);
        breakfast.addMenuItem(pancakes);
        breakfast.addMenuItem(crepe1);
        breakfast.addMenuItem(fruit);
        
        // Print the entire, updated menu.
        breakfast.printMenu();

        // Print an individual menu item.
        fruit.printFormatted();

        // Delete an item from the menu ... 

        // then reprint the menu.
    }
}