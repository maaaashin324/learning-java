package ch05.examples;

public class DecimalCalculator extends IntegerCalculator {
  double sum;

  public double add(double a, double b) {
    sum = a + b;

    return sum;
  }

  public int convertIntoInt() {
    super.sum = (int) sum;

    return super.sum;
  }
}
