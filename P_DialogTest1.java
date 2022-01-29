//

Java AWT Dialog Example





1.import java.awt.*;  
2.import java.awt.event.*;  
3.public class DialogExample {  
4.    private static Dialog d;  
5.    DialogExample() {  
6.        Frame f= new Frame();  
7.        d = new Dialog(f , "Dialog Example", true);  
8.        d.setLayout( new FlowLayout() );  
9.        Button b = new Button ("OK");  
10.        b.addActionListener ( new ActionListener()  
11.        {  
12.            public void actionPerformed( ActionEvent e )  
13.            {  
14.                DialogExample.d.setVisible(false);  
15.            }  
16.        });  
17.        d.add( new Label ("Click button to continue."));  
18.        d.add(b);   
19.        d.setSize(300,300);    
20.        d.setVisible(true);  
21.    }  
22.    public static void main(String args[])  
23.    {  
24.        new DialogExample();  
25.    }  
26.}  
