import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Buttons extends JFrame {
private JButton yellow, cyan, magenta;
private JPanel jp;
Buttons()
{
setTitle("Buttons");
addWindowListener( new WindowAdapter()
{ public void windowClosing(WindowEvent e)
{ System.exit(0); }
} );
jp = new JPanel();
BH bh = new BH();
yellow = new JButton("Yellow");
yellow.setBackground(Color.yellow);
jp.add(yellow);
yellow.addActionListener(bh);
cyan = new JButton("Cyan");
cyan.setBackground(Color.cyan);
jp.add(cyan);
cyan.addActionListener(bh);
magenta = new JButton("Magenta");
magenta.setBackground(Color.magenta);
jp.add(magenta);
magenta.addActionListener(bh);
getContentPane().add(jp);
}
class BH implements ActionListener
{
// Instance method getSource for an EventObject returns
// a reference to the component that caused the event.
public void actionPerformed(ActionEvent evt)
{
Object ob = evt.getSource();
if (ob==yellow)
jp.setBackground(Color.yellow);
else if (ob==cyan)
jp.setBackground(Color.cyan);
else if (ob==magenta)
jp.setBackground(Color.magenta);
jp.repaint();
}
// To use ob as a JButton, it must be downcasted, say
// ((JButton)ob).getText().
/**************************************************************
// Instance method getActionCommand for an ActionEvent
// returns the String label of component that caused the event.
public void actionPerformed(ActionEvent evt)
{
String arg = evt.getActionCommand();
if (arg.equals("Yellow"))
jp.setBackground(Color.yellow);
else if (arg.equals("Cyan"))
jp.setBackground(Color.cyan);
else if (arg.equals("Magenta"))
jp.setBackground(Color.magenta);
jp.repaint();
} ************************************************************/
} // end of inner class
public static void main(String [] args)
{
JFrame jf = new Buttons();
jf.setSize(300,200);
jf.setVisible(true);
}
}