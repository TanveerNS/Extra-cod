//Java AWT Choice Example with ActionListener





1.import java.awt.*;  
2.import java.awt.event.*;  
3.public class ChoiceExample  
4.{  
5.        ChoiceExample(){  
6.        Frame f= new Frame();  
7.        final Label label = new Label();          
8.        label.setAlignment(Label.CENTER);  
9.        label.setSize(400,100);  
10.        Button b=new Button("Show");  
11.        b.setBounds(200,100,50,20);  
12.        final Choice c=new Choice();  
13.        c.setBounds(100,100, 75,75);  
14.        c.add("C");  
15.        c.add("C++");  
16.        c.add("Java");  
17.        c.add("PHP");  
18.        c.add("Android");  
19.        f.add(c);f.add(label); f.add(b);  
20.        f.setSize(400,400);  
21.        f.setLayout(null);  
22.        f.setVisible(true);  
23.        b.addActionListener(new ActionListener() {  
24.            public void actionPerformed(ActionEvent e) {       
25.         String data = "Programming language Selected: "+ c.getItem(c.getSelectedIndex());  
26.         label.setText(data);  
27.        }  
28.        });           
29.        }  
30.public static void main(String args[])  
31.{  
32.   new ChoiceExample();  
33.}  
34.}  

