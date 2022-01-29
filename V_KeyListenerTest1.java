//Java KeyListener Example





1.import java.awt.*;  
2.import java.awt.event.*;  
3.public class KeyListenerExample extends Frame implements KeyListener{  
4.    Label l;  
5.    TextArea area;  
6.    KeyListenerExample(){  
7.          
8.        l=new Label();  
9.        l.setBounds(20,50,100,20);  
10.        area=new TextArea();  
11.        area.setBounds(20,80,300, 300);  
12.        area.addKeyListener(this);  
13.          
14.        add(l);add(area);  
15.        setSize(400,400);  
16.        setLayout(null);  
17.        setVisible(true);  
18.    }  
19.    public void keyPressed(KeyEvent e) {  
20.        l.setText("Key Pressed");  
21.    }  
22.    public void keyReleased(KeyEvent e) {  
23.        l.setText("Key Released");  
24.    }  
25.    public void keyTyped(KeyEvent e) {  
26.        l.setText("Key Typed");  
27.    }  
28.  
29.    public static void main(String[] args) {  
30.        new KeyListenerExample();  
31.    }  
32.}  
