package ch02.examples;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class HelloJava2 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Hello, Java!");

    HelloComponent2 hc = new HelloComponent2(args[0]);
    frame.add(hc);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);
    frame.setVisible(true);
  }
}

class HelloComponent2 extends JComponent implements MouseMotionListener {
  String theMessage;
  int messageX = 125, messageY = 95;

  public HelloComponent2(String message) {
    theMessage = message;
    addMouseMotionListener(this);
  }

  public void paintComponent(Graphics g) {
    g.drawString(theMessage, messageX, messageY);
  }

  public void mouseDragged(MouseEvent event) {
    messageX = event.getX();
    messageY = event.getY();

    repaint();
  }

  public void mouseMoved(MouseEvent event) {

  }
}