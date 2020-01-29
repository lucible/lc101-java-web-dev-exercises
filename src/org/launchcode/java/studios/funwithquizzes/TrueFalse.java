package org.launchcode.java.studios.funwithquizzes;

import java.util.HashMap;
import java.util.List;

public class TrueFalse extends Question {

    // two possible answers
    // one correct answer
    // one submitted answer

    public TrueFalse(String aQuestion, HashMap<Integer, String> aPossibleAnswers, List<Integer> aCorrectAnswers) {
        super(aQuestion, aPossibleAnswers, aCorrectAnswers);
    }
}