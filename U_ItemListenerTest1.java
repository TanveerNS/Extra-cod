Java ItemListener Example





1.import java.awt.*;    
2.import java.awt.event.*;    
3.public class ItemListenerExample implements ItemListener{    
4.    Checkbox checkBox1,checkBox2;  
5.    Label label;  
6.    ItemListenerExample(){    
7.        Frame f= new Frame("CheckBox Example");    
8.        label = new Label();            
9.        label.setAlignment(Label.CENTER);    
10.        label.setSize(400,100);    
11.        checkBox1 = new Checkbox("C++");    
12.        checkBox1.setBounds(100,100, 50,50);    
13.        checkBox2 = new Checkbox("Java");    
14.        checkBox2.setBounds(100,150, 50,50);    
15.        f.add(checkBox1); f.add(checkBox2); f.add(label);    
16.        checkBox1.addItemListener(this);    
17.        checkBox2.addItemListener(this);    
18.        f.setSize(400,400);    
19.        f.setLayout(null);    
20.        f.setVisible(true);    
21.     }    
22.    public void itemStateChanged(ItemEvent e) {      
23.        if(e.getSource()==checkBox1)  
24.            label.setText("C++ Checkbox: "     
25.            + (e.getStateChange()==1?"checked":"unchecked"));   
26.        if(e.getSource()==checkBox2)  
27.        label.setText("Java Checkbox: "     
28.        + (e.getStateChange()==1?"checked":"unchecked"));    
29.     }  
30.public static void main(String args[])    
31.{    
32.    new ItemListenerExample();    
33.}    
34.}    
