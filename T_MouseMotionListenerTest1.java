//Java MouseMotionListener Example





1.import java.awt.*;  
2.import java.awt.event.*;  
3.public class MouseMotionListenerExample extends Frame implements MouseMotionListener{  
4.    MouseMotionListenerExample(){  
5.        addMouseMotionListener(this);  
6.          
7.        setSize(300,300);  
8.        setLayout(null);  
9.        setVisible(true);  
10.    }  
11.public void mouseDragged(MouseEvent e) {  
12.    Graphics g=getGraphics();  
13.    g.setColor(Color.BLUE);  
14.    g.fillOval(e.getX(),e.getY(),20,20);  
15.}  
16.public void mouseMoved(MouseEvent e) {}  
17.  
18.public static void main(String[] args) {  
19.    new MouseMotionListenerExample();  
20.}  
21.}  

