package ch02.exercises;

import java.awt.Graphics;
import javax.swing.JComponent;

public class GoodNightComponent extends JComponent {
  public void paintComponent(Graphics g) {
    g.drawString("Good Night, Java!", 125, 95);
  }
}