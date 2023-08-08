// Inheritance example without using constructor(Single inheritance)

class Vehicle {

  String carName = "BMW";

  void display() {
    System.out.println("I am a Vehicle.");
  }
}

class Car extends Vehicle {

  void display() {
    System.out.println(carName + "is a car");
  }
}

public class MainInheritance {

  public static void main(String[] args) {
    Vehicle vehicle = new Vehicle();
    vehicle.display();

    Car car = new Car();
    car.display();
  }
}
