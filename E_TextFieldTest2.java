//Java AWT TextField Example with ActionListener

1.import java.awt.*;  
2.import java.awt.event.*;  
3.public class TextFieldExample extends Frame implements ActionListener{  
4.    TextField tf1,tf2,tf3;  
5.    Button b1,b2;  
6.    TextFieldExample(){  
7.        tf1=new TextField();  
8.        tf1.setBounds(50,50,150,20);  
9.        tf2=new TextField();  
10.        tf2.setBounds(50,100,150,20);  
11.        tf3=new TextField();  
12.        tf3.setBounds(50,150,150,20);  
13.        tf3.setEditable(false);   
14.        b1=new Button("+");  
15.        b1.setBounds(50,200,50,50);  
16.        b2=new Button("-");  
17.        b2.setBounds(120,200,50,50);  
18.        b1.addActionListener(this);  
19.        b2.addActionListener(this);  
20.        add(tf1);add(tf2);add(tf3);add(b1);add(b2);  
21.        setSize(300,300);  
22.        setLayout(null);  
23.        setVisible(true);  
24.    }         
25.    public void actionPerformed(ActionEvent e) {  
26.        String s1=tf1.getText();  
27.        String s2=tf2.getText();  
28.        int a=Integer.parseInt(s1);  
29.        int b=Integer.parseInt(s2);  
30.        int c=0;  
31.        if(e.getSource()==b1){  
32.            c=a+b;  
33.        }else if(e.getSource()==b2){  
34.            c=a-b;  
35.        }  
36.        String result=String.valueOf(c);  
37.        tf3.setText(result);  
38.    }  
39.public static void main(String[] args) {  
40.    new TextFieldExample();  
41.}  
42.}  

