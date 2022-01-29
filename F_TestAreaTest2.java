//Java AWT TextArea Example with ActionListener


import java.awt.*;  
2.import java.awt.event.*;  
3.public class TextAreaExample extends Frame implements ActionListener{  
4.Label l1,l2;  
5.TextArea area;  
6.Button b;  
7.TextAreaExample(){  
8.    l1=new Label();  
9.    l1.setBounds(50,50,100,30);  
10.    l2=new Label();  
11.    l2.setBounds(160,50,100,30);  
12.    area=new TextArea();  
13.    area.setBounds(20,100,300,300);  
14.    b=new Button("Count Words");  
15.    b.setBounds(100,400,100,30);  
16.    b.addActionListener(this);  
17.    add(l1);add(l2);add(area);add(b);  
18.    setSize(400,450);  
19.    setLayout(null);  
20.    setVisible(true);  
21.}  
22.public void actionPerformed(ActionEvent e){  
23.    String text=area.getText();  
24.    String words[]=text.split("\\s");  
25.    l1.setText("Words: "+words.length);  
26.    l2.setText("Characters: "+text.length());  
27.}  
28.public static void main(String[] args) {  
29.    new TextAreaExample();  
30.}  
31.}  

