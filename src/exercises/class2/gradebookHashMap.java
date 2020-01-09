package exercises.class2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class gradebookHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        int id;

        System.out.println("Enter your students (or ENTER to finish):");

        do {
        
            System.out.print("ID Number: ");
            newStudent = input.nextLine();
   
            if (!newStudent.equals("")) {
               System.out.print("Student name: ");
               String newName = input.nextLine();

               id = Integer.valueOf(newStudent);
               students.put(id, newName);
            }
        
        } while(!newStudent.equals(""));

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("ID: " + student.getKey() + " - Name: " + student.getValue());
        }

        input.close();
   }
}