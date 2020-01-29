package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Checkbox extends Question {
    /**
     * Checkbox class constructor
     * 
     * @param aQuestion       - eg, "Which two languages are statically typed?"
     * @param possibleAnswers - eg, { 1 : "JavaScript", 2 : "Typescript", 3 :
     *                        "Python", 4 : "Java" }
     * @param aCorrectAnswer  - eg, [2, 4]
     */
    private Checkbox(String aQuestion, Map<Integer, String> possibleAnswers, List<Integer> aCorrectAnswers) {
        super(aQuestion, possibleAnswers, aCorrectAnswers);
    }

    /**
     * Accepts user input to create a Checkbox
     * @param in : requires a Scanner object
     * @return Checkbox object
     */
    public static Checkbox newCheckBox(Scanner in) {
        
        String question;
        HashMap<Integer, String> possibleAnswers = new HashMap<Integer, String>();
        List<Integer> correctAnswers = new ArrayList<Integer>();

        question = collectQuestion("Please type your checkbox question: ", in);
        
        possibleAnswers = collectPossibleAnswers("Please type 'done' or a possible answer: ", in);

        correctAnswers = collectCorrectAnswers(question
                                              , possibleAnswers
                                              , "Please choose a correct answer, or type 'done' when finished: "
                                              , in);

        return new Checkbox(question, possibleAnswers, correctAnswers);
    }

    private static ArrayList<Integer> collectCorrectAnswers(String question, HashMap<Integer, String> possibilities, String message, Scanner in) {
        
        // Define loop condition boolean
        boolean possibleDone = false;
        
        // Initialize & define clone of answer possibilities
        Map<Integer, String> cloned = new HashMap<Integer, String>();
        cloned.putAll(possibilities);

        // Initialize user input list
        ArrayList<Integer> correctAnswers = new ArrayList<Integer>();

        // Print message & collect user input
        while (!possibleDone) {
            try {
                System.out.println("\nYour question was: " + question);
                System.out.println("\n" + message);
                int index = getUserSelInt(cloned);
                correctAnswers.add(index);
                cloned.remove(index);
            } catch (Exception e) {
                possibleDone = true;
            }
        }

        return correctAnswers;
    }
}