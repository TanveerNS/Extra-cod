//Java AWT Checkbox Example with ItemListener


import java.awt.*;  
2.import java.awt.event.*;  
3.public class CheckboxExample  
4.{  
5.     CheckboxExample(){  
6.        Frame f= new Frame("CheckBox Example");  
7.        final Label label = new Label();          
8.        label.setAlignment(Label.CENTER);  
9.        label.setSize(400,100);  
10.        Checkbox checkbox1 = new Checkbox("C++");  
11.        checkbox1.setBounds(100,100, 50,50);  
12.        Checkbox checkbox2 = new Checkbox("Java");  
13.        checkbox2.setBounds(100,150, 50,50);  
14.        f.add(checkbox1); f.add(checkbox2); f.add(label);  
15.        checkbox1.addItemListener(new ItemListener() {  
16.             public void itemStateChanged(ItemEvent e) {               
17.                label.setText("C++ Checkbox: "   
18.                + (e.getStateChange()==1?"checked":"unchecked"));  
19.             }  
20.          });  
21.        checkbox2.addItemListener(new ItemListener() {  
22.             public void itemStateChanged(ItemEvent e) {               
23.                label.setText("Java Checkbox: "   
24.                + (e.getStateChange()==1?"checked":"unchecked"));  
25.             }  
26.          });  
27.        f.setSize(400,400);  
28.        f.setLayout(null);  
29.        f.setVisible(true);  
30.     }  
31.public static void main(String args[])  
32.{  
33.    new CheckboxExample();  
34.}  
35.}  

