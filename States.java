import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class States extends JFrame implements ActionListener, ListSelectionListener
{
States()
{
setTitle("States");
setSize(600, 400);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JComboBox choice = new JComboBox();
choice.addItem("Red"); choice.addItem("Orange");
choice.addItem("Green"); choice.addItem("Black");
choice.addItem("Blue"); choice.addItem("Cyan");
choice.addActionListener(this);
String [] items = { "Illinois", "Indiana", "Iowa", "Michigan", 
		"Minnesota", "Ohio", "Pennsylvania", "Wisconsin" };
JList words = new JList(items);
JScrollPane sPane = new JScrollPane(words);
words.addListSelectionListener(this);
JPanel jp = new JPanel();
jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
jp.add(sPane); jp.add(choice);
getContentPane().add(jp, "East");
show = new Show();
show.setBackground(Color.white);
getContentPane().add(show, "Center");
}
private Color color = Color.red;
private String [] states = { }; // initialized if color chosen first
private Show show;
public void actionPerformed(ActionEvent e)
{
JComboBox source = (JComboBox)e.getSource();
Object item = source.getSelectedItem();
if (item.equals("Red")) color = Color.red;
else if (item.equals("Green")) color = Color.green;
else if (item.equals("Blue")) color = Color.blue;
else if (item.equals("Orange")) color = Color.orange;
else if (item.equals("Black")) color = Color.black;
else if (item.equals("Cyan")) color = Color.cyan;
show.updatePanel(color, states);
}
public void valueChanged(ListSelectionEvent e)
{
JList source = (JList)e.getSource();
Object [] values = source.getSelectedValues();
states = new String [values.length];
for (int k=0; k<values.length; k++)
states[k] = (String)values[k];
show.updatePanel(color, states);
}
public static void main(String [] args)
{
JFrame jf = new States();
jf.setVisible(true);
}
}