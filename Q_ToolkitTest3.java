//Java AWT Toolkit Example: Change TitleBar Icon





1.import java.awt.*;   
2.class ToolkitExample {   
3.ToolkitExample(){   
4.Frame f=new Frame();   
5.Image icon = Toolkit.getDefaultToolkit().getImage("D:\\icon.png");  
6.f.setIconImage(icon);  
7.f.setLayout(null);   
8.f.setSize(400,400);   
9.f.setVisible(true);   
10.}   
11.public static void main(String args[]){   
12.new ToolkitExample();   
13.}   
14.}  

