//Java WindowAdapter Example





1.import java.awt.*;  
2.import java.awt.event.*;  
3.public class AdapterExample{  
4.    Frame f;  
5.    AdapterExample(){  
6.        f=new Frame("Window Adapter");  
7.        f.addWindowListener(new WindowAdapter(){  
8.            public void windowClosing(WindowEvent e) {  
9.                f.dispose();  
10.            }  
11.        });  
12.          
13.        f.setSize(400,400);  
14.        f.setLayout(null);  
15.        f.setVisible(true);  
16.    }  
17.public static void main(String[] args) {  
18.    new AdapterExample();  
19.}  
20.}  
 