import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Doodle extends JFrame
{
private Point lineStart = new Point(0,0);
private int size = 16; // erasing width
private DrawPanel panel;
Doodle()
{
setTitle("Doodle");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
addMouseListener(new Down());
addMouseMotionListener(new Drag());
panel = new DrawPanel();
panel.setBackground(Color.cyan);
getContentPane().add(panel);
}
public static void main(String [] a)
{
JFrame jf = new Doodle();
jf.setSize(600, 400);
jf.setVisible(true);
}
class DrawPanel extends JPanel
{
public void paintComponent(Graphics g)
{
super.paintComponent(g);
g.setColor(Color.blue);
g.drawString("Left button draws", 10, 20);
g.drawString("Shift drag erases", 10, 35);
g.drawString("Double click clears", 10, 50);
}
}
class Down extends MouseAdapter
{
public void mousePressed(MouseEvent e)
{
int x = e.getX(), y = e.getY();
if (e.isShiftDown())
setForeground(panel.getBackground());
else
setForeground(Color.blue);
if (e.getClickCount() == 2) // double click
panel.repaint();
else
lineStart.move(x,y);
}
}
class Drag extends MouseMotionAdapter
{
public void mouseDragged(MouseEvent e)
{
int x = e.getX(), y = e.getY();
Graphics g = panel.getGraphics();
if (e.isShiftDown())
	g.fillOval(x-size/2, y-size/2, size, size);
else
g.drawLine(lineStart.x, lineStart.y, x, y);
lineStart.move(x,y);
}
}
}