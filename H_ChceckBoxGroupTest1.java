//Java AWT CheckboxGroup Example





1.import java.awt.*;    
2.public class CheckboxGroupExample    
3.{    
4.       CheckboxGroupExample(){    
5.       Frame f= new Frame("CheckboxGroup Example");    
6.        CheckboxGroup cbg = new CheckboxGroup();  
7.        Checkbox checkBox1 = new Checkbox("C++", cbg, false);    
8.        checkBox1.setBounds(100,100, 50,50);    
9.        Checkbox checkBox2 = new Checkbox("Java", cbg, true);    
10.        checkBox2.setBounds(100,150, 50,50);    
11.        f.add(checkBox1);    
12.        f.add(checkBox2);    
13.        f.setSize(400,400);    
14.        f.setLayout(null);    
15.        f.setVisible(true);    
16.     }    
17.public static void main(String args[])    
18.{    
19.    new CheckboxGroupExample();    
20.}    
21.}  
