// WAP that takes two integers as input from the user and divides them. Handle the ArithmeticException in case of division by zero.
import java.util.Scanner;

public class ExceptionHandlingDivision {

  public static void main(String[] args) {
    int a, b;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter two integers: ");
    a = sc.nextInt();
    b = sc.nextInt();
    try {
      System.out.println(a + "/" + b + " = " + (a / b));
    } catch (ArithmeticException e) {
      System.out.println("Division by zero is not allowed");
    }
  }
}
