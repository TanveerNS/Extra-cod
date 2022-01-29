//Java AWT CheckboxGroup Example with ItemListener





1.import java.awt.*;    
2.import java.awt.event.*;  
3.public class CheckboxGroupExample    
4.{    
5.     CheckboxGroupExample(){    
6.       Frame f= new Frame("CheckboxGroup Example");    
7.       final Label label = new Label();          
8.       label.setAlignment(Label.CENTER);  
9.       label.setSize(400,100);  
10.        CheckboxGroup cbg = new CheckboxGroup();  
11.        Checkbox checkBox1 = new Checkbox("C++", cbg, false);    
12.        checkBox1.setBounds(100,100, 50,50);    
13.        Checkbox checkBox2 = new Checkbox("Java", cbg, false);    
14.        checkBox2.setBounds(100,150, 50,50);    
15.        f.add(checkBox1); f.add(checkBox2); f.add(label);    
16.        f.setSize(400,400);    
17.        f.setLayout(null);    
18.        f.setVisible(true);    
19.        checkBox1.addItemListener(new ItemListener() {  
20.            public void itemStateChanged(ItemEvent e) {               
21.               label.setText("C++ checkbox: Checked");  
22.            }  
23.         });  
24.        checkBox2.addItemListener(new ItemListener() {  
25.            public void itemStateChanged(ItemEvent e) {               
26.               label.setText("Java checkbox: Checked");  
27.            }  
28.         });  
29.     }    
30.public static void main(String args[])    
31.{    
32.    new CheckboxGroupExample();    
33.}    
34.}  

