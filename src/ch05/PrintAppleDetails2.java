package ch05;

public class PrintAppleDetails2 {
  public static void main(String args[]) {
    Apple a1 = new Apple();

    System.out.println("Apple a1 is instantiated");
    System.out.println("mass of a1 is : " + a1.mass);
    System.out.println("diameter of a1 is : " + a1.getDiameter());
    System.out.println("position of a1 is : (" + a1.x + ", " + a1.y + ")");

    a1.mass = 10.0f;
    a1.x = 20;
    a1.y = 42;

    System.out.println("Apple a1 is updated");
    System.out.println("mass of a1 is : " + a1.mass);
    System.out.println("diameter of a1 is : " + a1.getDiameter());
    System.out.println("position of a1 is : (" + a1.x + ", " + a1.y + ")");
  }
}
