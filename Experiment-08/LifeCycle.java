import java.applet.Applet;
import java.awt.Graphics;
public class LifeCycle extends Applet {
 public void init(){System.out.println("init()");}
 public void start(){System.out.println("start()");}
 public void stop(){System.out.println("stop()");}
 public void destroy(){System.out.println("destroy()");}
 public void paint(Graphics g){System.out.println("paint()");g.drawString("Minimise and restore this window",20,30);}
}

/*
Sample Input:
No keyboard input required.
Run the applet, then minimize/restore or close the applet window.

Sample Console Output:
init()
start()
paint()

Visible Applet Output:
Minimise and restore this window

Additional output when the applet is stopped or closed:
stop()
destroy()
*/