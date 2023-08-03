/* WAP that reads a name from the user and greets including "Welcome First Semester Students".
Handle the IOException in case of an error while reading the input.
*/

import java.io.*;

public class GreetIOException {

  public static void main(String[] args) {
    String name = null;
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter your name: ");
      name = br.readLine();
    } catch (IOException e) {
      System.out.println("Error: " + e);
    } finally {
      System.out.println("Welcome " + name + " First Semester Students");
    }
  }
}
