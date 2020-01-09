package org.launchcode.java.studios.countingcharacters;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.File;

public class Counting {
    public static void main(String[] args) throws IOException {
        
        // Source text from user input
        // Scanner input = new Scanner(System.in);
        // System.out.println("Please enter a text string to count: ");
        // String text = input.nextLine();
        // input.close();

        // Source text from local file
        File file = new File("src/org/launchcode/java/studios/countingcharacters/text.txt");
        String text = Files.readString(Paths.get(file.getAbsolutePath()));
        
        char[] textChars = text.toLowerCase().replaceAll("[^a-z]","").toCharArray();
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : textChars) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> letter : charCount.entrySet()) {
            System.out.println(letter.getKey() + " count: " + letter.getValue());
        }
    }
}