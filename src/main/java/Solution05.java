/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Parker McLeod
 */

import java.util.Scanner;

public class Solution05 {

    public static void main(String[] args) {
        /*
        1. Prompt user for first number.
        2. Create new Scanner 'scanner'.
        3. Store user response as 'firstNumStr'.
        4. Convert firstNum String to int 'firstNum'.
        5. Prompt user for second number.
        6. Store user response as 'secondNumStr'.
        7. Convert secondNum String to int 'secondNum.
        8. Calculate 'sum', 'difference', 'product', 'quotient'.
        9. Print operation results.
         */
        System.out.print("What is the first number? ");
        Scanner scanner = new Scanner(System.in);
        String firstNumStr = scanner.nextLine();
        int firstNum = Integer.parseInt(firstNumStr);
        System.out.print("What is the second number? ");
        String secondNumStr = scanner.nextLine();
        int secondNum = Integer.parseInt(secondNumStr);
        int sum = firstNum + secondNum;
        int difference = firstNum - secondNum;
        int product = firstNum * secondNum;
        int quotient = firstNum / secondNum;
        System.out.print(
            firstNumStr + " + " + secondNumStr + " = " + sum + "\n"
            + firstNumStr + " - " + secondNumStr + " = " + difference + "\n"
            + firstNumStr + " * " + secondNumStr + " = " + product + "\n"
            + firstNumStr + " / " + secondNumStr + " = " + quotient + "\n"
        );
    }
}