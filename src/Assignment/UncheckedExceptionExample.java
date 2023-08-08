public class UncheckedExceptionExample {

  public static void main(String[] args) {
    int[] numbers = new int[5];
    try {
      numbers[5] = 10;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    }
  }
}
/*
In this program, the main() method tries to access the element at index 5 of an array that has
only 5 elements. This will cause an ArrayIndexOutOfBoundsException exception to be thrown.
The ArrayIndexOutOfBoundsException exception is an unchecked exception, so it does not need to
be declared in the throws clause of the main() method. The main() method will simply catch the
exception and print a message to the console.
*/
