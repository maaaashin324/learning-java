package ch05.examples;

public class PrintCalculatorDetails {
  public static void main(String[] args) {
    DecimalCalculator dc = new DecimalCalculator();
    IntegerCalculator ic = dc;

    int sum = ic.sum;
    System.out.println("Sum of IntegerCalculator: " + sum);
  }
}
