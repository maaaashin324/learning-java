package ch04.exercises;

public class Euclid {
  public static void main(String[] args) {
    int originalA = 2701;
    int originalB = 222;
    int a = originalA;
    int b = originalB;

    while (b != 0) {
      int mod = a % b;
      a = b;
      b = mod;
    }

    String result = String.format("The GCD of %d and %d is %d", originalA, originalB, a);
    System.out.println(result);
  }
}
