import javax.swing.*;
import java.awt.*;
public class BorderDemo { public static void main(String[] args){JFrame f=new JFrame("BorderLayout");f.setLayout(new BorderLayout());f.add(new JButton("NORTH"),BorderLayout.NORTH);f.add(new JButton("SOUTH"),BorderLayout.SOUTH);f.add(new JButton("EAST"),BorderLayout.EAST);f.add(new JButton("WEST"),BorderLayout.WEST);f.add(new JButton("CENTER"),BorderLayout.CENTER);f.setSize(350,220);f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.setVisible(true);} }

/*
Sample Input:
No keyboard input required.

Sample Output:
A Swing window titled "BorderLayout" opens with five buttons:
NORTH at the top, SOUTH at the bottom, EAST on the right, WEST on the left, and CENTER in the middle.
Window size: 350 x 220.
*/