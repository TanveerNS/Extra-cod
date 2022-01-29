//Java ActionListener Example: On Button click





1.import java.awt.*;  
2.import java.awt.event.*;  
3.public class ActionListenerExample {  
4.public static void main(String[] args) {  
5.    Frame f=new Frame("ActionListener Example");  
6.    final TextField tf=new TextField();  
7.    tf.setBounds(50,50, 150,20);  
8.    Button b=new Button("Click Here");  
9.    b.setBounds(50,100,60,30);  
10.  
11.    b.addActionListener(new ActionListener(){  
12.    public void actionPerformed(ActionEvent e){  
13.            tf.setText("Welcome to Javatpoint.");  
14.    }  
15.    });  
16.    f.add(b);f.add(tf);  
17.    f.setSize(400,400);  
18.    f.setLayout(null);  
19.    f.setVisible(true);   
20.}  
21.}  
