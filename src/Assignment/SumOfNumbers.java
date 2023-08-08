/* Write a program that reads a list of numbers from the user and calculates their sum.
Handle the NumberFormatException and ArithmeticException in case of invalid input or
division by zero.*/

import java.util.Scanner;

public class SumOfNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a list of numbers, separated by spaces: ");
    String input = scanner.nextLine();

    String[] numbers = input.split(" ");
    int sum = 0;

    for (String number : numbers) {
      try {
        int num = Integer.parseInt(number);
        sum += num;
      } catch (NumberFormatException e) {
        System.out.println("The input is not a valid number: " + number);
      } catch (ArithmeticException e) {
        System.out.println("Division by zero.");
      }
    }

    System.out.println("The sum of the numbers is: " + sum);
  }
}
/*
This code first creates a Scanner object to read input from the user. Then, it prints a prompt to
the user to enter a list of numbers, separated by spaces. The user's input is stored in the input
variable.

Next, the code splits the input variable into an array of strings, where each string is a number.
The code then iterates through the array of strings, trying to convert each string to an integer.
If the conversion is successful, the code adds the integer to the sum variable. Otherwise, the code
catches the NumberFormatException and prints an error message to the console.

If the code encounters an ArithmeticException, it means that the user entered a number that caused
a division by zero. In this case, the code prints an error message to the console.

Finally, the code prints the sum of the numbers to the console.

This code is a good example of how to handle multiple exceptions in Java. The try-catch blocks allow
us to handle the NumberFormatException and ArithmeticException gracefully, without crashing the
program. The error messages that are printed to the console are informative and help the user to
understand what went wrong.
 */
