//Java AWT Toolkit Example: beep()





1.import java.awt.event.*;  
2.public class ToolkitExample {  
3.public static void main(String[] args) {  
4.    Frame f=new Frame("ToolkitExample");  
5.    Button b=new Button("beep");  
6.    b.setBounds(50,100,60,30);  
7.    f.add(b);     
8.    f.setSize(300,300);  
9.    f.setLayout(null);  
10.    f.setVisible(true);  
11.    b.addActionListener(new ActionListener(){  
12.        public void actionPerformed(ActionEvent e){  
13.            Toolkit.getDefaultToolkit().beep();  
14.        }  
15.    });       
16.}  
17.}  
