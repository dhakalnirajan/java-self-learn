/*
Write a Java program illustrating try, catch and finally blocks for exception handling.
 */

class TryCatchFinally {

  public static void main(String[] args) {
    try {
      int[] numbers = new int[5];
      numbers[5] = 10;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Index out of bounds exception: " + e.getMessage());
    } finally {
      System.out.println("This code is always executed.");
    }
  }
}
