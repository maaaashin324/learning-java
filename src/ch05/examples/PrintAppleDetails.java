package ch05.examples;

public class PrintAppleDetails {
  public static void main(String args[]) {
    Apple a1 = new Apple();

    System.out.println("Apple a1 is instantiated");
    System.out.println("mass of a1 is :" + a1.mass);
    System.out.println("diameter of a1 is :" + a1.getDiameter());
    System.out.println("position of a1 is : (" + a1.x + ", " + a1.y + ")");
  }
}
