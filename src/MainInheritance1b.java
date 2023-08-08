class Batch1 {

  void display1() {
    System.out.println("Batch 1 is Displayed");
  }
}

class Batch2 extends Batch1 {

  void display2() {
    System.out.println("Batch 2 is displayed");
  }
}

class Batch3 extends Batch2 {

  void display3() {
    System.out.println("Batch 3 is displayed");
  }
}

public class MainInheritance1b {

  public static void main(String[] args) {
    Batch3 b = new Batch3();
    b.display1();
    b.display2();
    b.display3();
  }
}
