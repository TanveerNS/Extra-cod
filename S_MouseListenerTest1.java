//Java MouseListener Example





1.import java.awt.*;  
2.import java.awt.event.*;  
3.public class MouseListenerExample extends Frame implements MouseListener{  
4.    Label l;  
5.    MouseListenerExample(){  
6.        addMouseListener(this);  
7.          
8.        l=new Label();  
9.        l.setBounds(20,50,100,20);  
10.        add(l);  
11.        setSize(300,300);  
12.        setLayout(null);  
13.        setVisible(true);  
14.    }  
15.    public void mouseClicked(MouseEvent e) {  
16.        l.setText("Mouse Clicked");  
17.    }  
18.    public void mouseEntered(MouseEvent e) {  
19.        l.setText("Mouse Entered");  
20.    }  
21.    public void mouseExited(MouseEvent e) {  
22.        l.setText("Mouse Exited");  
23.    }  
24.    public void mousePressed(MouseEvent e) {  
25.        l.setText("Mouse Pressed");  
26.    }  
27.    public void mouseReleased(MouseEvent e) {  
28.        l.setText("Mouse Released");  
29.    }  
30.public static void main(String[] args) {  
31.    new MouseListenerExample();  
32.}  
33.}  
