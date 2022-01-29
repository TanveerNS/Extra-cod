import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JPApp extends JFrame
{
private String pw = "herky";
private JPasswordField pwField;
private JLabel ans;
JPApp()
{
setTitle("Password Verification");
Font font = new Font("SanSerif", Font.PLAIN, 18);
Container cp = getContentPane();
JPanel panel = new JPanel();
JLabel jl = new JLabel("Enter Password: ");
jl.setFont(font);
panel.add(jl);
pwField = new JPasswordField(12);
pwField.setFont(font);
pwField.setEchoChar('#');
panel.add(pwField);
cp.add(panel, BorderLayout.CENTER);
ans = new JLabel();
ans.setFont(font);
cp.add(ans, BorderLayout.SOUTH);
pwField.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
String password =
new String(pwField.getPassword());
if (pw.equals(password))
ans.setText("Access Granted");
else
ans.setText("Access Denied");
}
} );
}
void getFocus()
{
pwField.requestFocus();
}
public static void main(String [] args)
{
JPApp jpa = new JPApp();
jpa.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{ System.exit(0); }
} );
jpa.setSize(500,200);
jpa.setVisible(true);
jpa.getFocus(); // give field the focus
}
}