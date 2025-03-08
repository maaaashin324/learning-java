package ch05.examples;

public class Bird {
  int posX, posY;

  double fly(int x, int y) {
    double distance = Math.sqrt(x * x + y * y);
    // flap(distance);
    posX = x;
    posY = y;

    return distance;
  }
}
