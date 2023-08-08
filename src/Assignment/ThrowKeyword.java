/*
Write a Java program making the use of throw keyword for manually throwing an exception.
*/

class ThrowKeyword {

  public static void main(String[] args) {
    try {
      throw new ArithmeticException("This is an exception");
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    }
  }
}
/*
In this program, the throw keyword is used to manually throw an ArithmeticException exception.
The ArithmeticException exception is thrown with the message "This is an exception".

The catch block is used to handle the exception. The catch block prints the message of the exception
to the console.

This program demonstrates how you can use the throw keyword to manually throw an exception. The throw
keyword can be used to throw any type of exception. This allows you to control when and where an
exception is thrown.
*/
