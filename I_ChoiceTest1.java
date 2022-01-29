//Java AWT Choice Example





1.import java.awt.*;  
2.public class ChoiceExample  
3.{  
4.        ChoiceExample(){  
5.        Frame f= new Frame();  
6.        Choice c=new Choice();  
7.        c.setBounds(100,100, 75,75);  
8.        c.add("Item 1");  
9.        c.add("Item 2");  
10.        c.add("Item 3");  
11.        c.add("Item 4");  
12.        c.add("Item 5");  
13.        f.add(c);  
14.        f.setSize(400,400);  
15.        f.setLayout(null);  
16.        f.setVisible(true);  
17.     }  
18.public static void main(String args[])  
19.{  
20.   new ChoiceExample();  
21.}  
22.}  

