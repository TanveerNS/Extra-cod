//Java MouseMotionAdapter Example





1.import java.awt.*;  
2.import java.awt.event.*;  
3.public class MouseMotionAdapterExample extends MouseMotionAdapter{  
4.    Frame f;  
5.    MouseMotionAdapterExample(){  
6.        f=new Frame("Mouse Motion Adapter");  
7.        f.addMouseMotionListener(this);  
8.          
9.        f.setSize(300,300);  
10.        f.setLayout(null);  
11.        f.setVisible(true);  
12.    }  
13.public void mouseDragged(MouseEvent e) {  
14.    Graphics g=f.getGraphics();  
15.    g.setColor(Color.ORANGE);  
16.    g.fillOval(e.getX(),e.getY(),20,20);  
17.}  
18.public static void main(String[] args) {  
19.    new MouseMotionAdapterExample();  
20.}  
21.}  
