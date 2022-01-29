//Java AWT Canvas Example





1.import java.awt.*;  
2.public class CanvasExample  
3.{  
4.  public CanvasExample()  
5.  {  
6.    Frame f= new Frame("Canvas Example");  
7.    f.add(new MyCanvas());  
8.    f.setLayout(null);  
9.    f.setSize(400, 400);  
10.    f.setVisible(true);  
11.  }  
12.  public static void main(String args[])  
13.  {  
14.    new CanvasExample();  
15.  }  
16.}  
17.class MyCanvas extends Canvas  
18.{  
19.        public MyCanvas() {  
20.        setBackground (Color.GRAY);  
21.        setSize(300, 200);  
22.     }  
23.  public void paint(Graphics g)  
24.  {  
25.    g.setColor(Color.red);  
26.    g.fillOval(75, 75, 150, 75);  
27.  }  
28.}    

