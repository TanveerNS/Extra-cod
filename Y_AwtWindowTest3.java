//Close AWT Window Example 3: implementing WindowListener





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
16.public void windowActivated(WindowEvent e) {}  
17.public void windowClosed(WindowEvent e) {}  
18.public void windowClosing(WindowEvent e) {  
19.    dispose();  
20.}  
21.public void windowDeactivated(WindowEvent e) {}  
22.public void windowDeiconified(WindowEvent e) {}  
23.public void windowIconified(WindowEvent e) {}  
24.public void windowOpened(WindowEvent arg0) {}  
25.}  