import java.io.*;
import java.awt.*;
import java.applet.*;
//<Applet code="Cone" WIDTH="800" HEIGHT="400"></Applet>
public class Cube extends Applet
{
   public void paint(Graphics g)
   {
	   setBackground(Color.CYAN);
	   g.setColor(Color.black);
	   //To draw a cube
	   g.drawRect(500,400,100,100);
	   g.drawRect(550,450,100,100);
	   g.drawLine(500,400,550,450);
	   g.drawLine(500,500,550,550);
	   g.drawLine(600,400,650,450);
	   g.drawLine(650,550,600,500);
   }
}