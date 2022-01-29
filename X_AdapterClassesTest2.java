//Java MouseAdapter Example





1.import java.awt.*;  
2.import java.awt.event.*;  
3.public class MouseAdapterExample extends MouseAdapter{  
4.    Frame f;  
5.    MouseAdapterExample(){  
6.        f=new Frame("Mouse Adapter");  
7.        f.addMouseListener(this);  
8.          
9.        f.setSize(300,300);  
10.        f.setLayout(null);  
11.        f.setVisible(true);  
12.    }  
13.    public void mouseClicked(MouseEvent e) {  
14.        Graphics g=f.getGraphics();  
15.        g.setColor(Color.BLUE);  
16.        g.fillOval(e.getX(),e.getY(),30,30);  
17.    }  
18.      
19.public static void main(String[] args) {  
20.    new MouseAdapterExample();  
21.}  
22.}  

