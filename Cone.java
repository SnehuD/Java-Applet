import java.io.*;
import java.awt.*;
import java.applet.*;
//<Applet code="Cone" WIDTH="800" HEIGHT="400"></Applet>
public class Cone extends Applet
{
   public void paint(Graphics g)
   {
	   setBackground(Color.CYAN);
	   g.setColor(Color.black);
	   //To draw an cone
	   g.drawOval(200,80,200,50);
	   g.drawLine(200,100,300,500);
	   g.drawLine(400,100,300,500);
   }
}
