package org.launchcode.java.studios.funwithquizzes;

import java.util.HashMap;
import java.util.List;

public class MultipleChoice extends Question {
    /**
     * Multiple Choice class constructor
     * @param aQuestion - eg, "What is the color of the sky?"
     * @param aPossibleAnswers - eg, { 1 : "green", 2 : "blue", 3 : "yellow", 4 : "purple" }
     * @param aCorrectAnswer - must be an array of length 1, eg, [2]
     */
    public MultipleChoice(String aQuestion, HashMap<Integer, String> aPossibleAnswers, List<Integer> aCorrectAnswer) {
        super(aQuestion, aPossibleAnswers, aCorrectAnswer);
    }
}