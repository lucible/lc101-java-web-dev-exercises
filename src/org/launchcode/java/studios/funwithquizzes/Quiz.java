package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // Top-level menu choices
        HashMap<String, String> actionChoices = new HashMap<>();
        actionChoices.put("add", "Add a quiz question");
        actionChoices.put("take", "Take the quiz");
        actionChoices.put("grade", "Grade the quiz");

        // Question type choices
        HashMap<String, String> questionChoices = new HashMap<>();
        questionChoices.put("check", "Checkbox");
        questionChoices.put("tf", "True/False");
        questionChoices.put("mc", "Multiple Choice");
        questionChoices.put("done", "Done adding questions!");

        // Define quiz question list
        List<Question> quizQuestions = new ArrayList<Question>();
        
        // Print the welcome message
        System.out.println("=== Welcome to Quiz App! ===\n");

        // Show the user the top-level menu options until they manually quit
        while (true) {
            String actionChoice = getUserSelection("Your quiz currently has " + quizQuestions.size() + " question(s). Please select from the following options:", actionChoices);

            if (actionChoice.equals("add")) { 
                // Show the question type sub-menu
                while (true) {
                    String questionChoice = getUserSelection("Please choose a question type: ", questionChoices);

                    if (questionChoice.equals("check")) {
                        // add a new checkbox question
                        quizQuestions.add(Checkbox.newCheckBox());
                    } else if (questionChoice.equals("tf")) {
                        // add a new true/false question
                        System.out.println("add true/false question");
                    } else if (questionChoice.equals("mc")) {
                        // add a new multiple choice question
                        System.out.println("add multiple choice question");
                    } else {
                        // done adding questions
                        break;
                    }
                }
            } else if (actionChoice.equals("take")) {
                // implement taking the quiz
            } else {
                // implement grading the quiz
            }
        }
    }

    // Returns the key of the selected item from the choices Dictionary
    private static String getUserSelection(String menuHeader, HashMap<String, String> choices) {

        Integer choiceIdx;
        Boolean validChoice = false;
        String[] choiceKeys = new String[choices.size()];

        // Put the choices in an ordered structure so we can
        // associate an integer with each one
        Integer i = 0;
        for (String choiceKey : choices.keySet()) {
            choiceKeys[i] = choiceKey;
            i++;
        }

        do {

            System.out.println("\n" + menuHeader);

            // Print available choices
            for (Integer j = 0; j < choiceKeys.length; j++) {
                System.out.println("" + j + " - " + choices.get(choiceKeys[j]));
            }

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