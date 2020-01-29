package org.launchcode.java.studios.funwithquizzes;

import java.util.HashMap;
import java.util.List;

public class Checkbox extends Question {
    // checkbox
    // fixed set of answers
    // multiple correct answers
    // one correct combination

    public Checkbox(String aQuestion, HashMap<Integer, String> aPossibleAnswers, List<Integer> aCorrectAnswers) {
        super(aQuestion, aPossibleAnswers, aCorrectAnswers);
    }
}