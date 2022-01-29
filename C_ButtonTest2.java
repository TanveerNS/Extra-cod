//Java AWT Button Example with ActionListener


import java.awt.*;  
2.import java.awt.event.*;  
3.public class ButtonExample {  
4.public static void main(String[] args) {  
5.    Frame f=new Frame("Button Example");  
6.    final TextField tf=new TextField();  
7.    tf.setBounds(50,50, 150,20);  
8.    Button b=new Button("Click Here");  
9.    b.setBounds(50,100,60,30);  
10.    b.addActionListener(new ActionListener(){  
11.    public void actionPerformed(ActionEvent e){  
12.            tf.setText("Welcome to Javatpoint.");  
13.        }  
14.    });  
15.    f.add(b);f.add(tf);  
16.    f.setSize(400,400);  
17.    f.setLayout(null);  
18.    f.setVisible(true);   
19.}  
20.}  
