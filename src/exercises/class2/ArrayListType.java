package exercises.class2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class ArrayListType {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(8);
        numbers.add(4);
        numbers.add(3);
        numbers.add(22);
        numbers.add(3);
        numbers.add(4);
        numbers.add(15);
        System.out.println(sumEvenNums(numbers));

        String s = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        List<String> listCatsHats = new ArrayList<String>(Arrays.asList(s.split("\\s+")));
        printFiveLetterWords(listCatsHats);
    }

    public static Integer sumEvenNums(ArrayList<Integer> numbers) {
        Integer acc = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                acc = acc + number;
            }
        }
        return acc;
    }

    public static void printFiveLetterWords(List<String> words) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word length to search for: ");
        int search = input.nextInt();
        for (String word : words) {
            if (word.length() == search) {
                System.out.println(word);
            }
        }
        input.close();
    }
}