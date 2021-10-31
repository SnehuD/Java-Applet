import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class ControlLoopApplet2 extends Applet
{
	public void paint(Graphics g)
	{
		for(int i=1;i<=4;i++)
		{
			if(i%2==0)
			{
				g.fillOval(90,i*50+10,50,50);
				g.setColor(Color.BLACK);
			}
			else
			{
				g.fillOval(90,i*50+10,50,50);
				g.setColor(Color.RED);
			}
		}
	}
}
