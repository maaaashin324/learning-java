package ch05.examples;

public class Mammal extends Animal {
  int heartRate;

  void breathe() {
    
  }

  void reproduce() {

  }

  public void makeSound(int duration) {
    for (int i = 0; i < duration; i++) {
      System.out.println("Mammal makes sound");
    }
  }
}
