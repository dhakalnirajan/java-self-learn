/* Write a program to read a string from the user and convert it to an integer. Handle the NumberFormatException in
case the input is not a valid integer. */

import java.util.Scanner;

class StringToInt {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String str = scanner.nextLine();

    try {
      int number = Integer.parseInt(str);
      System.out.println("The integer value is: " + number);
    } catch (NumberFormatException e) {
      System.out.println("The input is not a valid integer.");
    }
  }
}
/*
This code first creates a Scanner object to read input from the user. Then, it prints a prompt to the
user to enter a string. The user's input is stored in the str variable.

Next, the code tries to convert the str variable to an integer using the Integer.parseInt() method.
If the conversion is successful, the code prints the integer value to the console. Otherwise, the
code catches the NumberFormatException and prints an error message to the console.

This code is a good example of how to handle exceptions in Java. The try-catch block allows us to
handle the NumberFormatException gracefully, without crashing the program. The error message that is
printed to the console is informative and helps the user to understand what went wrong.
 */
