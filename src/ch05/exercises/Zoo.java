package ch05.exercises;

import java.util.*;

public class Zoo {

  abstract class Animal {
    public abstract void speak();
    public abstract String getSpecies();
  }

  class Lion extends Animal {
    public void speak() {
      System.out.print("roar");
    }

    public String getSpecies() {
      return "Lion";
    }
  }

  class Gibbon extends Animal {
    public void speak() {
      System.out.print("hoot");
    }

    public String getSpecies() {
      return "Gibbon";
    }
  }

  class Cat extends Animal {
    public void speak() {
      System.out.print("meow");
    }

    public String getSpecies() {
      return "Cat";
    }
  }

  public void listen() {
    System.out.println("Let's listen to our menagerie of animals!");

    Animal[] menagerie = { new Lion(), new Gibbon(), new Cat() };

    for (Animal animal : menagerie) {
      String beforeMessage = String.format("The %s goes \"", animal.getSpecies());
      System.out.print(beforeMessage);
      animal.speak();
      System.out.print("\"\n");
    }
  }

  public static void main(String args[]) {
    Zoo myZoo = new Zoo();
    myZoo.listen();
  }
}
