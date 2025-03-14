package ch05.examples;

public class PrintCatDetails {
  public static void main(String[] args) {
    Cat simon = new Cat();
    Animal simonAnimal = simon;

    simon.sleep();
    simonAnimal.makeSound(3);
  }
}
