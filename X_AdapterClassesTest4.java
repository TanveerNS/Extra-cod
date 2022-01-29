//Java KeyAdapter Example





1.import java.awt.*;  
2.import java.awt.event.*;  
3.public class KeyAdapterExample extends KeyAdapter{  
4.    Label l;  
5.    TextArea area;  
6.    Frame f;  
7.    KeyAdapterExample(){  
8.        f=new Frame("Key Adapter");  
9.        l=new Label();  
10.        l.setBounds(20,50,200,20);  
11.        area=new TextArea();  
12.        area.setBounds(20,80,300, 300);  
13.        area.addKeyListener(this);  
14.          
15.        f.add(l);f.add(area);  
16.        f.setSize(400,400);  
17.        f.setLayout(null);  
18.        f.setVisible(true);  
19.    }  
20.    public void keyReleased(KeyEvent e) {  
21.        String text=area.getText();  
22.        String words[]=text.split("\\s");  
23.        l.setText("Words: "+words.length+" Characters:"+text.length());  
24.    }  
25.  
26.    public static void main(String[] args) {  
27.        new KeyAdapterExample();  
28.    }  
29.}  

