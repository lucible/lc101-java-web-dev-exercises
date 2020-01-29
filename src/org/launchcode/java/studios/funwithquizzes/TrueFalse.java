package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class TrueFalse extends Question {
    /**
     * True False class constructor
     * @param aQuestion - eg, "True or False: The earth is round."
     * @param aPossibleAnswers - eg, { 1 : "true", 2 : "false" }
     * @param aCorrectAnswer - must be an array of length 1, eg, [2]
     */
    private TrueFalse(String aQuestion, HashMap<Integer, String> aPossibleAnswers, List<Integer> aCorrectAnswer) {
        super(aQuestion, aPossibleAnswers, aCorrectAnswer);
    }

    /**
     * Accepts user input to create a TrueFalse
     * @param in : requires a Scanner object
     * @return TrueFalse object
     */
    public static TrueFalse newTrueFalse(Scanner in) {
        
        String question;
        HashMap<Integer, String> possibleAnswers = new HashMap<Integer, String>();
        List<Integer> correctAnswers = new ArrayList<Integer>();

        question = collectQuestion("Please type your true / false question: ", in);

        possibleAnswers.put(1, "True");
        possibleAnswers.put(2, "False");

        correctAnswers = collectCorrectAnswers(question
                                              , possibleAnswers
                                              , "Please choose the correct answer: "
                                              , in);

        return new TrueFalse(question, possibleAnswers, correctAnswers);
    }

    private static ArrayList<Integer> collectCorrectAnswers(String question, HashMap<Integer, String> possibilities, String message, Scanner in) {
        // Initialize user input list
        ArrayList<Integer> correctAnswers = new ArrayList<Integer>();

        // Print message & collect user input
        System.out.println("\nYour question was: " + question);
        System.out.println("\n" + message);
        int index = Question.getUserSelInt(possibilities);
        correctAnswers.add(index);

        return correctAnswers;
    }
}