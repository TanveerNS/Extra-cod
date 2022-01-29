//AWT TextField Class Declaration
//1.public class TextField extends TextComponent  
//Java AWT TextField Example


import java.awt.*;  
2.class TextFieldExample{  
3.public static void main(String args[]){  
4.    Frame f= new Frame("TextField Example");  
5.    TextField t1,t2;  
6.    t1=new TextField("Welcome to Javatpoint.");  
7.    t1.setBounds(50,100, 200,30);  
8.    t2=new TextField("AWT Tutorial");  
9.    t2.setBounds(50,150, 200,30);  
10.    f.add(t1); f.add(t2);  
11.    f.setSize(400,400);  
12.    f.setLayout(null);  
13.    f.setVisible(true);  
14.}  
15.}  
