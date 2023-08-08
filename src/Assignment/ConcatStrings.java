/*Write a program that reads two strings from the user and concatenates them. If either of the strings
is null, throw a NullPointerException. */

import java.util.Scanner;

public class ConcatStrings {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first string: ");
    String str1 = scanner.nextLine();

    System.out.print("Enter the second string: ");
    String str2 = scanner.nextLine();

    if (str1 == null || str2 == null) {
      throw new NullPointerException("One of the strings is null.");
    }

    String concatStr = str1 + str2;
    System.out.println("The concatenated string is: " + concatStr);
  }
}
/*
This code first creates a Scanner object to read input from the user. Then, it prints two prompts
to the user to enter two strings. The user's input is stored in the str1 and str2 variables.

Next, the code checks if either of the strings is null. If either of the strings is null, the code
throws a NullPointerException.

If neither of the strings is null, the code concatenates the two strings and prints the concatenated
string to the console.

This code is a good example of how to handle null pointer exceptions in Java. The if statement allows
us to check if either of the strings is null before we try to concatenate them. If either of the
strings is null, we throw a NullPointerException to prevent the program from crashing.

The error message that is printed to the console is informative and helps the user to understand
what went wrong.
 */
