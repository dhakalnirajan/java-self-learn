public class LogicalOperator {

  public static void main(String[] args) {
    int x = 5;
    System.out.println("x > 2 && x < 4? => " + (x > 2 && x < 4));
    System.out.println("x > 3 || x < 4? => " + (x > 3 || x < 4));
    System.out.println("x > 3 && x < 7 => " + (x > 3 && x < 7));
  }
}
