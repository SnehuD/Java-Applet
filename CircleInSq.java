import java.io.*;
import java.awt.*;
import java.applet.*;
//<Applet code="Cone" WIDTH="800" HEIGHT="400"></Applet>
public class CircleInSq extends Applet
{
   public void paint(Graphics g)
   {
	   setBackground(Color.CYAN);
	   g.setColor(Color.black);
	   //Circle Inside a Square
	   g.drawString("Circle Inside a Square",290,110);
	   g.drawRect(290,10,80,80);
	   g.drawOval(290,10,80,80);
   }
}