//

Java MouseListener Example 2





1.import java.awt.*;  
2.import java.awt.event.*;  
3.public class MouseListenerExample2 extends Frame implements MouseListener{  
4.    MouseListenerExample2(){  
5.        addMouseListener(this);  
6.          
7.        setSize(300,300);  
8.        setLayout(null);  
9.        setVisible(true);  
10.    }  
11.    public void mouseClicked(MouseEvent e) {  
12.        Graphics g=getGraphics();  
13.        g.setColor(Color.BLUE);  
14.        g.fillOval(e.getX(),e.getY(),30,30);  
15.    }  
16.    public void mouseEntered(MouseEvent e) {}  
17.    public void mouseExited(MouseEvent e) {}  
18.    public void mousePressed(MouseEvent e) {}  
19.    public void mouseReleased(MouseEvent e) {}  
20.      
21.public static void main(String[] args) {  
22.    new MouseListenerExample2();  
23.}  
24.}  
