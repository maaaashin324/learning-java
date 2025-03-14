package ch05.examples;

public class Cat extends Mammal {
  boolean longHair;

  void sleep() {
    System.out.println("Cat sleeps");
  }

  void huntMice() {

  }

  void purr() {
    
  }

  public void makeSound(int duration) {
    for (int i = 0; i < duration; i++) {
      System.out.println("Meow");
    }
  }
}
