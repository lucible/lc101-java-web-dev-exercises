package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.launchcode.java.studios.funwithquizzes.*;

public class Checkbox extends Question {
    /**
     * Checkbox class constructor
     * 
     * @param aQuestion       - eg, "Which two languages are statically typed?"
     * @param possibleAnswers - eg, { 1 : "JavaScript", 2 : "Typescript", 3 :
     *                        "Python", 4 : "Java" }
     * @param aCorrectAnswer  - eg, [2, 4]
     */
    public Checkbox(String aQuestion, Map<Integer, String> possibleAnswers, List<Integer> aCorrectAnswers) {
        super(aQuestion, possibleAnswers, aCorrectAnswers);
    }

    public static Question newCheckBox() {
        final Scanner in = new Scanner(System.in);

        boolean possibleDone = false;
        Integer possibleID = 0;
        HashMap<Integer, String> possibleAnswers = new HashMap<Integer, String>();
        Map<Integer, String> cloned = new HashMap<Integer, String>();
        List<Integer> correctAnswers = new ArrayList<Integer>();

        System.out.println("\nPlease type your checkbox question: ");
        String question = in.nextLine();
        
        while (true) {
            System.out.println("\nPlease type 'done' or a possible answer: ");
            String next = in.nextLine();
            if (next.equals("done")) {
                break;
            } else {
                possibleAnswers.put(possibleID, next);
                possibleID++;
            }
        }

        cloned.putAll(possibleAnswers);

        while (!possibleDone) {
            try {
                System.out.println("\nYour question was: " + question);
                System.out.println("Please choose a correct answer, or type 'done' when finished: ");
                int index = getUserSelection(cloned);
                correctAnswers.add(index);
                cloned.remove(index);
            } catch (Exception e) {
                possibleDone = true;
            }
        }
        

        Question test = new Checkbox(question, possibleAnswers, correctAnswers);

        return test;
    }

        // Returns the key of the selected item from the choices Dictionary
        private static Integer getUserSelection(Map<Integer, String> choices) {
            final Scanner in = new Scanner(System.in);

            Integer choiceIdx;
            Boolean validChoice = false;
            Integer[] choiceKeys = new Integer[choices.size()];
    
            // Put the choices in an ordered structure so we can
            // associate an integer with each one
            Integer i = 0;
            for (Integer choiceKey : choices.keySet()) {
                choiceKeys[i] = choiceKey;
                i++;
            }
    
            // Print available choices
            for (Integer j = 0; j < choiceKeys.length; j++) {
                System.out.println("" + j + " - " + choices.get(choiceKeys[j]));
            }
    
            do {
    
                choiceIdx = in.nextInt();
                in.nextLine();
    
                // Validate user's input
                if (choiceIdx < 0 || choiceIdx >= choiceKeys.length) {
                    System.out.println("Invalid choice. Try again.");
                } else {
                    validChoice = true;
                }
    
            } while(!validChoice);
    
            return choiceKeys[choiceIdx];
        }
}