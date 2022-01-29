//Java AWT Checkbox Example


import java.awt.*;  
2.public class CheckboxExample  
3.{  
4.     CheckboxExample(){  
5.       Frame f= new Frame("Checkbox Example");  
6.        Checkbox checkbox1 = new Checkbox("C++");  
7.        checkbox1.setBounds(100,100, 50,50);  
8.        Checkbox checkbox2 = new Checkbox("Java", true);  
9.        checkbox2.setBounds(100,150, 50,50);  
10.        f.add(checkbox1);  
11.        f.add(checkbox2);  
12.        f.setSize(400,400);  
13.        f.setLayout(null);  
14.        f.setVisible(true);  
15.     }  
16.public static void main(String args[])  
17.{  
18.    new CheckboxExample();  
19.}  
20.}  

