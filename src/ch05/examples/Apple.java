package ch05.examples;

class Apple {
  public static final int SMALL = 0;
  public static final int MEDIUM = 1;
  public static final int LARGE = 2;

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
    // System.out.println("diameter of a1 is : " + diameter);
    String[] sizes = getAppleSizes();
    if (diameter < 5.0f) {
      System.out.println(sizes[SMALL]);
    } else if (diameter < 10.0f) {
      System.out.println(sizes[MEDIUM]);
    } else {
      System.out.println(sizes[LARGE]);
    }
    
    System.out.println("position of a1 is : (" + x + ", " + y + ")");
  }

  public void moveTo(int x, int y) {
    String output = String.format("Apple is moving to (%d, %d)", x, y);
    System.out.println(output);

    this.x = x;

    if (y > diameter) {
      this.y = y;

      return;
    }

    this.y = (int)diameter;

    return;
  }

  public static Apple createApple(int size) {
    switch (size) {
      case Apple.SMALL:
        Apple a = new Apple();
        a.x = 10;
        a.y = 10;
        a.diameter = 3.0f;
        a.mass = 0.1f;
        return a;
      case Apple.MEDIUM:
        Apple b = new Apple();
        b.x = 20;
        b.y = 20;
        b.diameter = 5.0f;
        b.mass = 0.2f;
        return b;
      case Apple.LARGE:
        Apple c = new Apple();
        c.x = 30;
        c.y = 30;
        c.diameter = 7.0f;
        c.mass = 0.3f;
        return c;
      default:
        return null;
    }
  }

  public static String[] getAppleSizes() {
    return new String[] {"SMALL", "MEDIUM", "LARGE"};
  }
}
