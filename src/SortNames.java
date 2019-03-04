/*
  Program that asks if the user wants a list sorted in ascending or descending order, then a number, then that number of names.
  Sorts the list of names by the aforementioned ascending/descending selection.
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class SortNames {
    public static void main (String [] args) {

        Scanner inputScanner = new Scanner(System.in);
        String choice;
        int number = 0;
        ArrayList <String> names = new ArrayList<String>();

        System.out.print("Enter A for Ascending Order, or D for Descending Order: ");
        choice = inputScanner.nextLine();
        choice = choice.toUpperCase();

        //Checks to make sure only A or D are entered. If not, asks again.
        while (!(choice.equals("A")) && !(choice.equals("D"))) {
            System.out.print("Invalid. Enter A for Ascending Order, or D for Descending Order: ");
            choice = inputScanner.nextLine();
            choice = choice.toUpperCase();
        }

        System.out.print("Please enter the number of names you would like to enter, between 1 and 10: ");

        //Assumes that the user has entered in an integer, makes sure it's within range.
        while (!(number > 0) && !(number <= 10)) {
            System.out.print("Invalid. Enter a number between 1 and 10: ");
            number = inputScanner.nextInt();
            inputScanner.nextInt();
        }

        System.out.printf("Enter in the %d names that you would like:\n", number);

        for(int i = 0; i < number; i++) {
            names.add(inputScanner.nextLine());
        }

        if (choice.equals("A")) {
            Collections.sort(names);
        }
        else if (choice.equals("D")) {
            Collections.sort(names, Collections.reverseOrder());
        }

        System.out.println("The names sorted in order are:");

        for (String str: names) {
            System.out.println(str);
        }
    }
}
