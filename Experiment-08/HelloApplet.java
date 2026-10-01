import java.applet.Applet;
import java.awt.*;
public class HelloApplet extends Applet {
 public void init(){setBackground(Color.WHITE);}
 public void paint(Graphics g){g.setColor(Color.BLUE);g.drawString("Welcome to SCSVMV",30,25);g.setColor(Color.RED);g.fillOval(30,45,60,60);g.setColor(Color.GREEN);g.fillRect(110,45,80,60);}
}

/*
Sample Input:
No keyboard input required.
Run the applet using HelloApplet.html or an applet viewer.

Sample Output:
The applet window displays:
Welcome to SCSVMV
A red oval at position (30,45) with size 60x60.
A green rectangle at position (110,45) with size 80x60.
*/