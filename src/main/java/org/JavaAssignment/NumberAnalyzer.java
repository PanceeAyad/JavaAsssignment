package org.JavaAssignment;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class NumberAnalyzer {

    //Method 1

    /**
     * Prints the numbers from 10 down to 1, each number on its own line.
     * It uses a for loop that starts at 10 and decreases by one every round.
     */
    public static void printNumbersDescending(){
        for(int i =10;i>=1;i--){
            System.out.println(i);
        }
    }
    //Method 2
    /**
     * Goes through the numbers from 1 to 10 and prints each one
     * together with a label saying if it is Even or Odd.
     * A number is even when dividing it by 2 leaves no remainder.
     */
    public static void   printEvenOrOdd(){
        for (int i=1;i<=10;i++){
            if(i%2==0){
                System.out.println(i+"-> Even");
            }else {
                System.out.println(i+"-> Odd");
            }
        }
    }
    //Method 3
    /**
     * Checks the sign of a number and tells us what kind it is.
     *
     * @param number the integer entered by the user
     * @return "Positive" if the number is greater than 0,
     * "Negative" if it is less than 0, or "Zero" if it equals 0
     */
    public static String checkNumberType(int number){
        if(number>0){
            return "Positive";
        } else if (number<0) {
            return "Negative";
        }else{
            return "Zero";
        }
    }
    //Method 4
    /**
     * Adds two integers together and gives back the total.
     *
     * @param number1 the first integer to add
     * @param number2 the second integer to add
     * @return the sum of number1 and number2
     */
    public static int calculateSum(int number1 , int number2){
        return number1+number2;
    }

    /**
     * Starting point of the program. It shows the menu again and again
     * using a do-while loop until the user chooses option 5 (Exit).
     *
     *@param args command line arguments (not used in this version 27)
     */
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    Scanner sc = new Scanner(System.in);
    int choice;


        do {
            System.out.println("=========================");
            System.out.println("Number Analyzer Menu");
            System.out.println("=========================");
            System.out.println("1 - Print Numbers 10 to 1");
            System.out.println("2 - Print Even/Odd Report");
            System.out.println("3 - Check Number Type");
            System.out.println("4 - Calculate Sum Between Two Numbers");
            System.out.println("5 - Exit");
            System.out.println("=========================");
            System.out.print("Enter your choice: ");

            // If the user types text instead of a number, treat it as an invalid choice
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
            } else {
                sc.next(); // throw away the wrong input
                choice = -1;
            }

            switch (choice) {
                case 1:
                    printNumbersDescending();
                    break;

                case 2:
                    printEvenOrOdd();
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    int number = sc.nextInt();
                    String result = checkNumberType(number);
                    System.out.println(result);
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    int number1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int number2 = sc.nextInt();
                    int sum = calculateSum(number1, number2);
                    System.out.println("Sum = " + sum);
                    break;

                case 5:
                    System.out.println("Thank you for using Number Analyzer.");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

            System.out.println();

        } while (choice != 5);

        sc.close();









    }
}
