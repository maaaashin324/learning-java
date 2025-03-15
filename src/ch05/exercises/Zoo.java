package ch05.exercises;

import java.util.*;

public class Zoo {

  abstract class Animal {
    public abstract void speak();
  }

  class Lion extends Animal {
    public void speak() {
      System.out.print("roar");
    }
  }

  class Gibbon extends Animal {
    public void speak() {
      System.out.print("hoot");
    }
  }

  class Cat extends Animal {
    public void speak() {
      System.out.print("meow");
    }
  }

  public void listen() {
    Lion lion = new Lion();
    Gibbon gibbon = new Gibbon();
    Cat cat = new Cat();
    System.out.println("Let's listen to some animals!");
    System.out.print("The lion goes \"");
    lion.speak();
    System.out.println("\"");
    System.out.print("The gibbon goes \"");
    gibbon.speak();
    System.out.println("\"");
    System.out.print("The cat goes \"");
    cat.speak();
    System.out.println("\"");
  }

  public static void main(String args[]) {
    Zoo myZoo = new Zoo();
    myZoo.listen();
  }
}
