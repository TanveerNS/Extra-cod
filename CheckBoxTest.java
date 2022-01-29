import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CheckBoxTest extends JFrame implements ItemListener
{
CheckBoxTest()
{
setTitle("Check Box Test");
addWindowListener(new WindowAdapter()
{ public void windowClosing(WindowEvent e)
{ System.exit(0); }
} );
Container cp = getContentPane();
cp.setBackground(Color.white);
Font font = new Font("SansSerif", Font.PLAIN, 18);
JLabel lab = new JLabel("Click the checkboxes:", JLabel.CENTER);
lab.setFont(font);
cp.add(lab, BorderLayout.NORTH);
result = new JLabel("You checked nothing.", JLabel.CENTER);
result.setFont(font);
cp.add(result, BorderLayout.SOUTH);
yes = new JCheckBox("Yes");
yes.setFont(font);
yes.setBackground(Color.white);
cp.add(yes, BorderLayout.WEST);
yes.addItemListener(this);
no = new JCheckBox ("No");
no.setFont(font);
no.setBackground(Color.white);
cp.add(no, BorderLayout.EAST);
no.addItemListener(this);
}
public void itemStateChanged(ItemEvent evt)
{
if (yes.isSelected() && no.isSelected())
result.setText("You checked both boxes.");
else if (yes.isSelected())
result.setText("You checked the Yes box.");
else if (no.isSelected())
result.setText("You checked the No box.");
else
result.setText("You checked neither box.");
}
private JLabel result;
private JCheckBox yes, no;
public static void main(String [] args)
{ JFrame jf = new CheckBoxTest();
jf.setSize(600, 400);
jf.setVisible(true);
}
}