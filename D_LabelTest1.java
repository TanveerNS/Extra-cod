//AWT Label Class Declaration
//1.public class Label extends Component implements Accessible  
//Java Label Button Example


import java.awt.*;  
2.class LabelExample{  
3.public static void main(String args[]){  
4.    Frame f= new Frame("Label Example");  
5.    Label l1,l2;  
6.    l1=new Label("First Label.");  
7.    l1.setBounds(50,100, 100,30);  
8.    l2=new Label("Second Label.");  
9.    l2.setBounds(50,150, 100,30);  
10.    f.add(l1); f.add(l2);  
11.    f.setSize(400,400);  
12.    f.setLayout(null);  
13.    f.setVisible(true);  
14.}  
15.}  
