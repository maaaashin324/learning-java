package ch05.examples;

class PrintAppleDetails4 {
  public static void main(String args[]) {
    Field f = new Field();

    f.setupApples();
    System.out.println("Apple a1 is : ");
    f.a1.printDetails();
    System.out.println("Apple a2 is : ");
    f.a2.printDetails();

    f.detectCollisions();
  }
}