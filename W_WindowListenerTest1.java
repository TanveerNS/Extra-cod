//Java WindowListener Example





1.import java.awt.*;  
2.import java.awt.event.WindowEvent;  
3.import java.awt.event.WindowListener;  
4.public class WindowExample extends Frame implements WindowListener{  
5.    WindowExample(){  
6.        addWindowListener(this);  
7.          
8.        setSize(400,400);  
9.        setLayout(null);  
10.        setVisible(true);  
11.    }  
12.      
13.public static void main(String[] args) {  
14.    new WindowExample();  
15.}  
16.public void windowActivated(WindowEvent arg0) {  
17.    System.out.println("activated");  
18.}  
19.public void windowClosed(WindowEvent arg0) {  
20.    System.out.println("closed");  
21.}  
22.public void windowClosing(WindowEvent arg0) {  
23.    System.out.println("closing");  
24.    dispose();  
25.}  
26.public void windowDeactivated(WindowEvent arg0) {  
27.    System.out.println("deactivated");  
28.}  
29.public void windowDeiconified(WindowEvent arg0) {  
30.    System.out.println("deiconified");  
31.}  
32.public void windowIconified(WindowEvent arg0) {  
33.    System.out.println("iconified");  
34.}  
35.public void windowOpened(WindowEvent arg0) {  
36.    System.out.println("opened");  
37.}  
38.}  
