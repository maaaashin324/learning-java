package ch02.exercises;

import javax.swing.JFrame;

public class GoodNightJava {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Good Night, Java!");

    GoodNightComponent gnc = new GoodNightComponent();

    frame.add(gnc);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);
    frame.setVisible(true);
  }
}
