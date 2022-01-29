//Java AWT List Example





1.import java.awt.*;  
2.public class ListExample  
3.{  
4.     ListExample(){  
5.        Frame f= new Frame();  
6.        List l1=new List(5);  
7.        l1.setBounds(100,100, 75,75);  
8.        l1.add("Item 1");  
9.        l1.add("Item 2");  
10.        l1.add("Item 3");  
11.        l1.add("Item 4");  
12.        l1.add("Item 5");  
13.        f.add(l1);  
14.        f.setSize(400,400);  
15.        f.setLayout(null);  
16.        f.setVisible(true);  
17.     }  
18.public static void main(String args[])  
19.{  
20.   new ListExample();  
21.}  
22.}  
