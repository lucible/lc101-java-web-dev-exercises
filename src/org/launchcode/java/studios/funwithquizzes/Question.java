package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public abstract class Question {

    protected String question;
    protected Map<Integer, String> possibleAnswers;
    protected List<Integer> correctAnswers;

    protected Question (String aQuestion, Map<Integer, String> possibleAnswers2, List<Integer> aCorrectAnswers) {
        question = aQuestion;
        possibleAnswers = possibleAnswers2;
        correctAnswers = aCorrectAnswers;
    }
    
    public void printQuestion() {
        System.out.println(this.question + "\n");
    }

    public void printPossibleAnswers() {
        for (Map.Entry<Integer, String> answer : possibleAnswers.entrySet()) {
            System.out.println(answer.getKey() + ": " + answer.getValue());
        }
    }

    public boolean checkSubmittedAnswer(List<Integer> submitted) {
        if (submitted.equals(this.correctAnswers)) {
            return true;
        } else {
            return false;
        }
    }

    public static String collectQuestion(String message, Scanner in) {
        System.out.println("\n" + message);
        return in.nextLine();
    }

    public static HashMap<Integer, String> collectPossibleAnswers(String message, Scanner in) {

        // Define user input map
        HashMap<Integer, String> possibleAnswers = new HashMap<Integer, String>();

        // Initialize user input map key
        Integer key = 0;

        // Print message & collect user input
        while (true) {
            // System.out.println("\nPlease type 'done' or a possible answer: ");
            System.out.println("\n" + message);
            String value = in.nextLine();
            if (value.equals("done")) {
                break;
            } else {
                possibleAnswers.put(key, value);
                key++;
            }
        }

        return possibleAnswers;
    }

    // Returns the key of the selected item from the choices Dictionary
    protected static Integer getUserSelInt(Map<Integer, String> choices) {
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