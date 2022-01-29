import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class Show extends JPanel
{
private Color color;
private String [] list = { }; // initialized for first paint
void updatePanel(Color c, String [] s)
{
color = c;
list = s;
repaint();
}
public void paintComponent(Graphics g)
{
super.paintComponent(g);
Font font = new Font("SansSerif", Font.PLAIN, 18);
g.setFont(font);
g.setColor(color);
for (int k=0; k<list.length; k++)
g.drawString(list[k], 20, 30 +30*k);
}
}
