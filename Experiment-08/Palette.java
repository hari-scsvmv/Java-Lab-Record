import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Palette extends Applet {
 Color[] c={Color.RED,Color.GREEN,Color.BLUE,Color.YELLOW}; int sel=0;
 public void init(){addMouseListener(new MouseAdapter(){public void mouseClicked(MouseEvent e){int i=(e.getX()-20)/60;if(e.getY()<60&&i>=0&&i<4)sel=i;repaint();}});}
 public void paint(Graphics g){for(int i=0;i<c.length;i++){g.setColor(c[i]);g.fillRect(20+i*60,20,50,40);}g.setColor(c[sel]);g.fillRect(20,90,230,60);}
}

/*
Sample Input:
Mouse click on a color box.
Example: click the blue box.

Sample Output:
The applet displays four color boxes: red, green, blue, and yellow.
Initially, the large rectangle is red because sel = 0.
After clicking the blue box, the large rectangle changes to blue.
*/