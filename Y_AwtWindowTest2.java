//Close AWT Window Example 2: extending WindowAdapter





1.import java.awt.*;  
2.import java.awt.event.*;  
3.public class AdapterExample extends WindowAdapter{  
4.    Frame f;  
5.    AdapterExample(){  
6.        f=new Frame();  
7.        f.addWindowListener(this);  
8.          
9.        f.setSize(400,400);  
10.        f.setLayout(null);  
11.        f.setVisible(true);  
12.    }  
13.public void windowClosing(WindowEvent e) {  
14.    f.dispose();  
15.}  
16.public static void main(String[] args) {  
17.    new AdapterExample();  
18.}  
19.}  
