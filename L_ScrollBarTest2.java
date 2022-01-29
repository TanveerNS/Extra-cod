//Java AWT Scrollbar Example with AdjustmentListener





1.import java.awt.*;  
2.import java.awt.event.*;  
3.class ScrollbarExample{  
4.     ScrollbarExample(){  
5.            Frame f= new Frame("Scrollbar Example");  
6.            final Label label = new Label();          
7.            label.setAlignment(Label.CENTER);  
8.            label.setSize(400,100);  
9.            final Scrollbar s=new Scrollbar();  
10.            s.setBounds(100,100, 50,100);  
11.            f.add(s);f.add(label);   
12.            f.setSize(400,400);  
13.            f.setLayout(null);  
14.            f.setVisible(true);  
15.            s.addAdjustmentListener(new AdjustmentListener() {  
16.                public void adjustmentValueChanged(AdjustmentEvent e) {  
17.                   label.setText("Vertical Scrollbar value is:"+ s.getValue());  
18.                }  
19.            });  
20.         }  
21.public static void main(String args[]){  
22.new ScrollbarExample();  
23.}  
24.}  

