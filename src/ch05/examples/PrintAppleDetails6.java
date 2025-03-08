package ch05.examples;

public class PrintAppleDetails6 {
  public static void main(String[] args) {
    Apple a1 = Apple.createApple(Apple.SMALL);
    Apple a2 = Apple.createApple(Apple.MEDIUM);
    Apple a3 = Apple.createApple(Apple.LARGE);
    
    a1.printDetails();
    a2.printDetails();
    a3.printDetails();
  }
}
