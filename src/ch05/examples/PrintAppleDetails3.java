package ch05.examples;

public class PrintAppleDetails3 {
  public static void main(String args[]) {
    Apple a1 = new Apple();

    System.out.println("Apple a1 is instantiated");
    a1.printDetails();

    a1.mass = 10.0f;
    a1.x = 20;
    a1.y = 42;

    System.out.println("Apple a1 is updated");
    a1.printDetails();
  }
}
