public class BreakExample {

  public static void main(String[] args) {
    int n = 10;
    for (int i = 0; i < n; i++) {
      if (i == 5) {
        break;
      }
      System.out.println("i = " + i);
    }
  }
}
