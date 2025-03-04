import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class HelloJava {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Hello, Java!");

    frame.add(new HelloComponent());
    frame.setSize(300, 300);
    frame.setVisible(true);
  }
}

class HelloComponent extends JComponent {
  public void paintComponent(Graphics g) {
    g.drawString("Hello, Java!", 125, 95);
  }
}