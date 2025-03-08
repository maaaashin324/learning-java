package ch05;

class Apple {
  float mass;
  private float diameter = 1.0f;
  int x, y;

  public float getDiameter() {
    return diameter;
  }

  public void setDiameter(float diameter) {
    this.diameter = diameter;
  }

  boolean isTouching(Apple others) {
    double xdiff = x - others.x;
    double ydiff = y - others.y;
    double distance = Math.sqrt(xdiff * xdiff + ydiff * ydiff);

    if (distance < diameter / 2 + others.diameter / 2) {
      return true;
    }

    return false;
  }

  public void printDetails() {
    System.out.println("mass of a1 is : " + mass);
    System.out.println("diameter of a1 is : " + diameter);
    System.out.println("position of a1 is : (" + x + ", " + y + ")");
  }
}
