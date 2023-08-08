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

class Batch3 extends Batch1 {

  void display3() {
    System.out.println("Batch 3 is displayed");
  }
}

public class MainTest1c {

  public static void main(String[] args) {
    Batch2 b1 = new Batch2();
    Batch3 b2 = new Batch3();

    b1.display1();
    b1.display2();
    b2.display1();
    b2.display3(); // here b2.display2() is not supported.
  }
}
