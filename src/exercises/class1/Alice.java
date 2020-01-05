package exercises.class1;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        // part four
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word to search: ");
        String search = input.nextLine();
        boolean found = alice.toLowerCase().contains(search.toLowerCase());
        int index = alice.toLowerCase().indexOf(search.toLowerCase());
        System.out.println("Found '" + search + "'? " + found);
        
        // part five
        System.out.println("Index of '" + search + "': " + index);
        String missing = alice.subSequence(0, index).toString() + alice.subSequence(index + search.length(), alice.length()).toString();
        System.out.println(missing);

        // close input stream
        input.close();
    }
}