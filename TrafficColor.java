import java.awt.*;
import java.applet.*; 
public class TrafficColor extends Applet
{
	public void paint(Graphics g)
	{  
		/*for(int i=1;i<=3;i++)
		{
			if(i%2==0)
			{
				g.fillOval(90,i*50+10,50,50);
				g.setColor(Color.black);
			}*/
			{
				g.fillOval(90,70+10,60,60);
				g.drawOval(90,70+10,50,50);
				g.setColor(Color.yellow);
			}
			{
				g.fillOval(90,50+10,50,50);
				g.drawOval(90,50+10,50,50);
				g.setColor(Color.red);
			}
			{
				g.fillOval(90,50+10,50,50);
				g.drawOval(90,50+10,50,50);
				g.setColor(Color.blue);
			}
		//}
	}
}