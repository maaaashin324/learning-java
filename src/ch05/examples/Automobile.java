package ch05.examples;

public class Automobile implements Drivable {
  boolean tooCold;

  Automobile(boolean tooCold) {
    this.tooCold = tooCold;
  }

  public boolean startEngine() {
    if (tooCold) {
      return false;
    }

    System.out.println("Automobile engine started");

    return true;
  }

  public void stopEngine() {
    System.out.println("Automobile engine stopped");

    return;
  }

  public float accelerate(float acc) {
    return acc;
  }
}
