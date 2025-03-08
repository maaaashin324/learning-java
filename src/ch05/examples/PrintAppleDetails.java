package ch05.examples;

public class PrintAppleDetails {
  public static void main(String args[]) {
    Apple a1 = new Apple();

    System.out.println("Apple a1 is instantiated");
    System.out.println("mass of a1 is :" + a1.mass);
    System.out.println("diameter of a1 is :" + a1.getDiameter());
    System.out.println("position of a1 is : (" + a1.x + ", " + a1.y + ")");

    String[] sizes = Apple.getAppleSizes();

    if (a1.getDiameter() < 5.0f) {
      String output = String.format("This Apple is a %s apple", sizes[Apple.SMALL]);
      System.out.println(output);
    } else if (a1.getDiameter() < 10.0f) {
      String output = String.format("This Apple is a %s apple", sizes[Apple.MEDIUM]);
      System.out.println(output);
    } else {
      String output = String.format("This Apple is a %s apple", sizes[Apple.LARGE]);
      System.out.println(output);
    }
  }
}
