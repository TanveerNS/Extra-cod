//Java AWT Label Example with ActionListener


import java.awt.*;  
2.import java.awt.event.*;  
3.public class LabelExample extends Frame implements ActionListener{  
4.    TextField tf; Label l; Button b;  
5.    LabelExample(){  
6.        tf=new TextField();  
7.        tf.setBounds(50,50, 150,20);  
8.        l=new Label();  
9.        l.setBounds(50,100, 250,20);      
10.        b=new Button("Find IP");  
11.        b.setBounds(50,150,60,30);  
12.        b.addActionListener(this);    
13.        add(b);add(tf);add(l);    
14.        setSize(400,400);  
15.        setLayout(null);  
16.        setVisible(true);  
17.    }  
18.    public void actionPerformed(ActionEvent e) {  
19.        try{  
20.        String host=tf.getText();  
21.        String ip=java.net.InetAddress.getByName(host).getHostAddress();  
22.        l.setText("IP of "+host+" is: "+ip);  
23.        }catch(Exception ex){System.out.println(ex);}  
24.    }  
25.    public static void main(String[] args) {  
26.        new LabelExample();  
27.    }  
28.}  
