//Close AWT Window Example 1: Anonymous class





1.import java.awt.*;  
2.import java.awt.event.WindowEvent;  
3.import java.awt.event.WindowListener;  
4.public class WindowExample extends Frame{  
5.    WindowExample(){  
6.        addWindowListener(new WindowAdapter(){  
7.            public void windowClosing(WindowEvent e) {  
8.                dispose();  
9.            }  
10.        });  
11.        setSize(400,400);  
12.        setLayout(null);  
13.        setVisible(true);  
14.    }  
15.public static void main(String[] args) {  
16.    new WindowExample();  
17.}  

