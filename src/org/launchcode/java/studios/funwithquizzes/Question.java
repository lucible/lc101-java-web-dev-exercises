package org.launchcode.java.studios.funwithquizzes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Question {

    protected String question;
    protected Map<Integer, String> possibleAnswers;
    protected List<Integer> correctAnswers;

    public Question (String aQuestion, Map<Integer, String> possibleAnswers2, List<Integer> aCorrectAnswers) {
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
}