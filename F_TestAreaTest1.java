//Java AWT TextArea Example


import java.awt.*;  
2.public class TextAreaExample  
3.{  
4.     TextAreaExample(){  
5.        Frame f= new Frame();  
6.            TextArea area=new TextArea("Welcome to javatpoint");  
7.        area.setBounds(10,30, 300,300);  
8.        f.add(area);  
9.        f.setSize(400,400);  
10.        f.setLayout(null);  
11.        f.setVisible(true);  
12.     }  
13.public static void main(String args[])  
14.{  
15.   new TextAreaExample();  
16.}  
17.}  

