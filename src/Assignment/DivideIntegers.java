/* Write a program with a method divide(int x, int y) that takes two integers as input and returns
their division. If the second integer b is zero, throw an IllegalArgumentException. */

public class DivideIntegers {

  public static int divide(int x, int y) {
    if (y == 0) {
      throw new IllegalArgumentException("The second integer cannot be zero.");
    }

    return x / y;
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 2;

    int quotient = DivideIntegers.divide(x, y);
    System.out.println("The quotient is: " + quotient);

    y = 0;
    try {
      quotient = DivideIntegers.divide(x, y);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}
/*
This code first defines a method divide() that takes two integers as input and returns their division.
The method checks if the second integer is zero. If the second integer is zero, the method throws an
IllegalArgumentException. Otherwise, the method returns the division of the two integers.

The main method of the class calls the divide() method twice. The first time, the method succeeds and
the quotient is printed to the console. The second time, the second integer is zero and the
IllegalArgumentException is thrown. The error message is printed to the console.

This code is a good example of how to handle exceptions in Java. The if statement allows us to check
if the second integer is zero before we try to divide the two integers. If the second integer is
zero, we throw an IllegalArgumentException to prevent the program from crashing.

The error message that is printed to the console is informative and helps the user to understand
what went wrong.
 */
