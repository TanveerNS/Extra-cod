//Java AWT Button Example

import java.awt.*;  
2.public class ButtonExample {  
3.public static void main(String[] args) {  
4.    Frame f=new Frame("Button Example");  
5.    Button b=new Button("Click Here");  
6.    b.setBounds(50,100,80,30);  
7.    f.add(b);  
8.    f.setSize(400,400);  
9.    f.setLayout(null);  
10.    f.setVisible(true);   
11.}  
12.}  
