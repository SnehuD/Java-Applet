import java.io.*;
import java.awt.*;
import java.applet.*;
//<Applet code="Cone" WIDTH="800" HEIGHT="400"></Applet>
public class SqInCircle extends Applet
{
   public void paint(Graphics g)
   {
	   setBackground(Color.CYAN);
	   g.setColor(Color.black);
	   //Squar Inside A Circle
	   g.drawString("Square Inside A Circle",150,110);
	   g.drawOval(180,10,80,80);
	   g.drawRect(192,22,55,55);
   }
}