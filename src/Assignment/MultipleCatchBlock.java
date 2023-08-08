/*
Write a Java program illustrating the use of multiple catch blocks for handling different types
of exception.
 */
class MultipleCatchBlocks {

  public static void main(String[] args) {
    try {
      int[] numbers = new int[5];
      numbers[5] = 10;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Index out of bounds exception: " + e.getMessage());
    } catch (ArithmeticException e) {
      System.out.println("Arithmetic exception: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("General exception: " + e.getMessage());
    }
  }
}
