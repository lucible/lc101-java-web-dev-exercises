package org.launchcode.java.studios.funwithquizzes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Question {

    protected String question;
    protected HashMap<Integer, String> possibleAnswers;
    protected List<Integer> correctAnswers;

    public Question (String aQuestion, HashMap<Integer, String> aPossibleAnswers, List<Integer> aCorrectAnswers) {
        question = aQuestion;
        possibleAnswers = aPossibleAnswers;
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
}