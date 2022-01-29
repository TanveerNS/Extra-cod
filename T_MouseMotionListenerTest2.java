//Java MouseMotionListener Example 2





1.import java.awt.*;  
2.import java.awt.event.MouseEvent;  
3.import java.awt.event.MouseMotionListener;  
4.public class Paint extends Frame implements MouseMotionListener{  
5.    Label l;  
6.    Color c=Color.BLUE;  
7.    Paint(){  
8.    l=new Label();  
9.    l.setBounds(20,40,100,20);  
10.    add(l);  
11.      
12.    addMouseMotionListener(this);  
13.      
14.    setSize(400,400);  
15.    setLayout(null);  
16.    setVisible(true);  
17.}  
18.public void mouseDragged(MouseEvent e) {  
19.    l.setText("X="+e.getX()+", Y="+e.getY());  
20.    Graphics g=getGraphics();  
21.    g.setColor(Color.RED);  
22.    g.fillOval(e.getX(),e.getY(),20,20);  
23.}  
24.public void mouseMoved(MouseEvent e) {  
25.    l.setText("X="+e.getX()+", Y="+e.getY());  
26.}  
27.public static void main(String[] args) {  
28.    new Paint();  
29.}  
30.}  

