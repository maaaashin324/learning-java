package ch02.examples;

public class EnvironmentVariable {
  public static void main(String[] args) {
    String name = System.getProperty("USERNAME");

    System.out.println("Hello, " + name + "!");
  }
}
