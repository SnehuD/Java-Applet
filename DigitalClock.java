import java.applet.Applet;
import java.awt.*;
import java.util.*;
import java.text.*;
public class DigitalClock extends Applet implements Runnable 
{
    Thread t;
    String Time=""; 
    public void init()
    {      
    		setSize(400,200);
            setBackground(Color.cyan);
            t=new Thread(this);
            t.start();
    }
    public void run()
    {
       try
       {
           while(true)
           {
               Calendar c=Calendar.getInstance();
               SimpleDateFormat f=new SimpleDateFormat("hh:mm:ss "+" dd/MM/yyyy");
               
               Date d=c.getTime();
               Time=f.format(d);
               repaint();
               t.sleep(1000);
           }
       }
       catch(Exception e)
       {
           System.out.println("Error Occured");
       }
    }
    
    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.setFont(new Font("Dialog",Font.BOLD,50));
        g.drawString(Time, 100,100);
    }
}