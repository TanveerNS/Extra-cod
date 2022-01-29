//Java AWT Scrollbar Example





1.import java.awt.*;  
2.class ScrollbarExample{  
3.ScrollbarExample(){  
4.            Frame f= new Frame("Scrollbar Example");  
5.            Scrollbar s=new Scrollbar();  
6.            s.setBounds(100,100, 50,100);  
7.            f.add(s);  
8.            f.setSize(400,400);  
9.            f.setLayout(null);  
10.            f.setVisible(true);  
11.}  
12.public static void main(String args[]){  
13.       new ScrollbarExample();  
14.}  
15.}  

