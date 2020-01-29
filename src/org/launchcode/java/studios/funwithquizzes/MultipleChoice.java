package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MultipleChoice extends Question {
    /**
     * Multiple Choice class constructor
     * @param aQuestion - eg, "What is the color of the sky?"
     * @param aPossibleAnswers - eg, { 1 : "green", 2 : "blue", 3 : "yellow", 4 : "purple" }
     * @param aCorrectAnswer - must be an array of length 1, eg, [2]
     */
    private MultipleChoice(String aQuestion, HashMap<Integer, String> aPossibleAnswers, List<Integer> aCorrectAnswer) {
        super(aQuestion, aPossibleAnswers, aCorrectAnswer);
    }

    /**
     * Accepts user input to create a MultipleChoice
     * @param in : requires a Scanner object
     * @return MultipleChoice object
     */
    public static MultipleChoice newMultipleChoice(Scanner in) {
        
        String question;
        HashMap<Integer, String> possibleAnswers = new HashMap<Integer, String>();
        List<Integer> correctAnswers = new ArrayList<Integer>();

        question = collectQuestion("Please type your multiple choice question: ", in);
        
        possibleAnswers = collectPossibleAnswers("Please type 'done' or a possible answer: ", in);

        correctAnswers = collectCorrectAnswers(question
                                              , possibleAnswers
                                              , "Please choose the correct answer: "
                                              , in);

        return new MultipleChoice(question, possibleAnswers, correctAnswers);
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