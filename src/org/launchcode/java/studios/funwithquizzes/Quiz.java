package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // Initialize quiz list
        List<Question> quizQuestions = new ArrayList<Question>();

        // Length of the quiz
        int quizLength = 0;

        boolean showMenu = true;
        boolean showQuestions = true;

        // Top-level menu choices
        HashMap<String, String> actionChoices = new HashMap<>();
        actionChoices.put("add", "Add a quiz question");
        actionChoices.put("take", "Take the quiz");
        actionChoices.put("grade", "Grade the quiz");

        // Top-level menu header
        String menu = "Your quiz currently has " + quizLength + " questions.\n"
                    + "Please select from the following options:";

        

        // Print the welcome message
        System.out.println("=== Welcome to Quiz App! ===\n");

        // Allow the user to access the program until they manually quit
        while (showMenu) {
            String actionChoice = getUserSelection(menu, actionChoices);

            if (actionChoice.equals("add")) {
                while (showQuestions) {
                    if (addQuizQuestion(quizQuestions)) {
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

    private static boolean addQuizQuestion(List<Question> questions) {
        // Possible question types
        HashMap<String, String> questionTypes = new HashMap<>();
        questionTypes.put("check", "Checkbox");
        questionTypes.put("tf", "True/False");
        questionTypes.put("mc", "Multiple Choice");
        questionTypes.put("done", "Done adding questions!");

        String questionChoice = getUserSelection("Please choose a question type: ", questionTypes);

        if (questionChoice.equals("check")) {
            // type question
            // type possible answers
            // type correct answer
            questions.add(Checkbox.newCheckBox());
            System.out.println("add checkbox question");
            return false;
        } else if (questionChoice.equals("tf")) {
            // type question
            // type possible answers
            // type correct answer
            System.out.println("add true/false question");
            return false;
        } else if (questionChoice.equals("mc")) {
            // type question
            // type possible answers
            // type correct answer
            System.out.println("add multiple choice question");
            return false;
        } else {
            return true;
        }
    }
}