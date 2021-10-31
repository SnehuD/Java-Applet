import java.io.*;
import java.awt.*;
import java.applet.*;
//<Applet code="Cone" WIDTH="800" HEIGHT="400"></Applet>
public class Cylinder extends Applet
{
   public void paint(Graphics g)
   {
	   setBackground(Color.CYAN);
	   g.setColor(Color.black);
	   //To draw a cyclinder
	   g.drawOval(500,60,200,50);
	   g.drawLine(500,80,500,300);
	   g.drawLine(700,80,700,300);
	   g.drawOval(500,280,200,50);
   }
}