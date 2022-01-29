//Java AWT Panel Example





1.import java.awt.*;  
2.public class PanelExample {  
3.     PanelExample()  
4.        {  
5.        Frame f= new Frame("Panel Example");    
6.        Panel panel=new Panel();  
7.        panel.setBounds(40,80,200,200);    
8.        panel.setBackground(Color.gray);  
9.        Button b1=new Button("Button 1");     
10.        b1.setBounds(50,100,80,30);    
11.        b1.setBackground(Color.yellow);   
12.        Button b2=new Button("Button 2");   
13.        b2.setBounds(100,100,80,30);    
14.        b2.setBackground(Color.green);   
15.        panel.add(b1); panel.add(b2);  
16.        f.add(panel);  
17.        f.setSize(400,400);    
18.        f.setLayout(null);    
19.        f.setVisible(true);    
20.        }  
21.        public static void main(String args[])  
22.        {  
23.        new PanelExample();  
24.        }  
25.}  
