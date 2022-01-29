//Java AWT List Example with ActionListener





1.import java.awt.*;  
2.import java.awt.event.*;  
3.public class ListExample  
4.{  
5.     ListExample(){  
6.        Frame f= new Frame();  
7.        final Label label = new Label();          
8.        label.setAlignment(Label.CENTER);  
9.        label.setSize(500,100);  
10.        Button b=new Button("Show");  
11.        b.setBounds(200,150,80,30);  
12.        final List l1=new List(4, false);  
13.        l1.setBounds(100,100, 70,70);  
14.        l1.add("C");  
15.        l1.add("C++");  
16.        l1.add("Java");  
17.        l1.add("PHP");  
18.        final List l2=new List(4, true);  
19.        l2.setBounds(100,200, 70,70);  
20.        l2.add("Turbo C++");  
21.        l2.add("Spring");  
22.        l2.add("Hibernate");  
23.        l2.add("CodeIgniter");  
24.        f.add(l1); f.add(l2); f.add(label); f.add(b);  
25.        f.setSize(450,450);  
26.        f.setLayout(null);  
27.        f.setVisible(true);  
28.        b.addActionListener(new ActionListener() {  
29.         public void actionPerformed(ActionEvent e) {       
30.          String data = "Programming language Selected: "+l1.getItem(l1.getSelectedIndex());  
31.          data += ", Framework Selected:";  
32.          for(String frame:l2.getSelectedItems()){  
33.                   data += frame + " ";  
34.          }  
35.          label.setText(data);  
36.          }  
37.         });          
38.}  
39.public static void main(String args[])  
40.{  
41.   new ListExample();  
42.}  
43.}  
