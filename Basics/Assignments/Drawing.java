package assignmentsByAnirban;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;

public class Drawing extends JPanel
{
  @Override
  public void paint(Graphics g) 
  {   
  Graphics2D g2 = (Graphics2D) g;
  Graphics2D g3 = (Graphics2D) g;
  Graphics2D g4 = (Graphics2D) g;
  //custom color
  String hexColor1 = new String("0x000000");
  String hexColor2 = new String("0xff00ff");
  String hexColor3 = new String("0xff0000");
  String hexColor4 = new String("0x00fff0");
  g.setColor(Color.decode(hexColor1));
  ////poinnt
  g.drawLine(10, 10, 11, 10);
  //draw a line (starting x,y; ending x,y)
  g.drawLine(10, 20, 100, 20);
  ///rectangle
  g2.drawRect(10, 25, 150, 40);
  g2.setColor(Color.decode(hexColor4)); 
  g2.fillRect(10, 25, 150, 40);
  ////square
  g3.drawRect(10, 70, 50, 50);
  g3.setColor(Color.decode(hexColor2)); 
  g3.fillRect(10, 70, 50, 50);
  /////circle
  g4.drawOval(8, 135, 60, 60);
  g4.setColor(Color.decode(hexColor3)); 
  g4.fillOval(8, 135, 60, 60);
  
}
   
}
