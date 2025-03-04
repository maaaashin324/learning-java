package ch05;

class Apple {
  float mass;
  float diameter = 1.0f;
  int x, y;

  boolean isTouching(Apple others) {
    return false;
  }

  public void printDetails() {
    System.out.println("mass of a1 is : " + mass);
    System.out.println("diameter of a1 is : " + diameter);
    System.out.println("position of a1 is : (" + x + ", " + y + ")");
  }
}
