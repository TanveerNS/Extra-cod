import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class RadioButtonFrame extends JFrame
implements ActionListener
{
RadioButtonFrame()
{
setTitle("Radio Buttons");
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{ System.exit(0);
}
} );
topPanel = new JPanel();
ButtonGroup g = new ButtonGroup();
cyanButton = addRadioButton(topPanel, g, "Cyan", false);
yellowButton = addRadioButton(topPanel, g, "Yellow", false);
magentaButton =
addRadioButton(topPanel, g, "Magenta", false);
getContentPane().add(topPanel, "North");
panel = new JPanel();
getContentPane().add(panel, "Center");
JMenuBar mb = new JMenuBar();
JMenu file = new JMenu("MyFile");
JMenuItem quit = new JMenuItem("Quit");
file.add(quit);
quit.addActionListener(this);
mb.add(file);
JMenu color = new JMenu("Color");
JMenuItem cyanItem = new JMenuItem("Cyan");
color.add(cyanItem);
cyanItem.addActionListener(this);
JMenuItem yellowItem = new JMenuItem("Yellow");
color.add(yellowItem);
yellowItem.addActionListener(this);
JMenuItem magentaItem = new JMenuItem("Magenta");
color.add(magentaItem);
magentaItem.addActionListener(this);
mb.add(color);
setJMenuBar(mb);
}
JRadioButton addRadioButton(JPanel jp,
ButtonGroup g, String name, boolean v)
{
JRadioButton b = new JRadioButton(name, v);
b.addActionListener(this);
g.add(b);
jp.add(b);
return b;
}
public void actionPerformed(ActionEvent e)
{
Object source = e.getSource();
if (source == cyanButton)
setColor(Color.cyan);
else if (source == yellowButton)
setColor(Color.yellow);
else if (source == magentaButton)
setColor(Color.magenta);
else
{
JMenuItem selection = (JMenuItem)source;
String cmd = selection.getText();
if (cmd.equals("Quit"))
System.exit(0);
else if (cmd.equals("Cyan"))
{
setColor(Color.cyan);
cyanButton.setSelected(true);
}
else if (cmd.equals("Yellow"))
{
setColor(Color.yellow);
yellowButton.setSelected(true);
}
else if (cmd.equals("Magenta"))
{
setColor(Color.magenta);
magentaButton.setSelected(true);
}
}
}
private void setColor(Color c)
{
panel.setBackground(c);
panel.repaint();
topPanel.setBackground(c);
topPanel.repaint();
}
private JPanel panel, topPanel;
private JRadioButton cyanButton, yellowButton, magentaButton;
}
public class RadioButtons
{
public static void main(String[] args)
{
JFrame jf = new RadioButtonFrame();
jf.setSize(500, 300);
jf.setVisible(true);
}
}