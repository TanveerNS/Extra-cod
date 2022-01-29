//Java AWT PopupMenu Example





1.import java.awt.*;  
2.import java.awt.event.*;  
3.class PopupMenuExample  
4.{  
5.     PopupMenuExample(){  
6.         final Frame f= new Frame("PopupMenu Example");  
7.         final PopupMenu popupmenu = new PopupMenu("Edit");   
8.         MenuItem cut = new MenuItem("Cut");  
9.         cut.setActionCommand("Cut");  
10.         MenuItem copy = new MenuItem("Copy");  
11.         copy.setActionCommand("Copy");  
12.         MenuItem paste = new MenuItem("Paste");  
13.         paste.setActionCommand("Paste");      
14.         popupmenu.add(cut);  
15.         popupmenu.add(copy);  
16.         popupmenu.add(paste);        
17.         f.addMouseListener(new MouseAdapter() {  
18.            public void mouseClicked(MouseEvent e) {              
19.                popupmenu.show(f , e.getX(), e.getY());  
20.            }                 
21.         });  
22.         f.add(popupmenu);   
23.         f.setSize(400,400);  
24.         f.setLayout(null);  
25.         f.setVisible(true);  
26.     }  
27.public static void main(String args[])  
28.{  
29.        new PopupMenuExample();  
30.}  
31.}  
