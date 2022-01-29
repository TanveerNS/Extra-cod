import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ButtonTest extends JFrame
{
private JLabel result;
ButtonTest()
{
setTitle("ButtonTest");
JLabel lab = new JLabel("Click one of the buttons.");
getContentPane().add(lab, "North");
result = new JLabel(" ");
getContentPane().add(result, "South");
JButton yes = new JButton("Yes");
getContentPane().add(yes, "West");
yes.addActionListener(new YesHandler());
JButton no = new JButton("No");
getContentPane().add(no, "East");
no.addActionListener(new NoHandler());
}
class YesHandler implements ActionListener
{
public void actionPerformed(ActionEvent evt)
{ result.setText("You pressed the Yes button."); }
}
class NoHandler implements ActionListener
{
public void actionPerformed(ActionEvent evt)
{ result.setText("You pressed the No button."); }
}
public static void main(String [] args)
{ JFrame jf = new ButtonTest();
jf.setSize(250, 150);
jf.setVisible(true);
}
}