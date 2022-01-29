import java.awt.*;
import javax.swing.*;
class FontPanel extends JPanel
{
FontPanel()
{ setBackground(Color.white);
}
public void paintComponent(Graphics g)
{
super.paintComponent(g); // clear background
g.setFont(new Font("Serif", Font.BOLD, 12));
g.drawString("Serif 12 point bold.", 20, 50 );
g.setFont(new Font("Monospaced", Font.ITALIC, 24));
g.drawString("Monospaced 24 point italic.", 20, 100);