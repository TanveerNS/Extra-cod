//Java AWT Toolkit Example





1.import java.awt.*;  
2.public class ToolkitExample {  
3.  public static void main(String[] args) {  
4.      Toolkit t = Toolkit.getDefaultToolkit();  
5.      System.out.println("Screen resolution = " + t.getScreenResolution());  
6.      Dimension d = t.getScreenSize();  
7.      System.out.println("Screen width = " + d.width);  
8.      System.out.println("Screen height = " + d.height);  
9.  }  
10.}  
