// Fig. 11.5: ShowColors.java
2 // Demonstrating Colors.
3
4 // Java core packages
5 import java.awt.*;
6 import java.awt.event.*;
7
8 // Java extension packages
9 import javax.swing.*;
10
11 public class ShowColors extends JFrame {
12
13 // constructor sets window's title bar string and dimensions
14 public ShowColors()
15 {
16 super( "Using colors" );
17
18 setSize( 400, 130 );
19 setVisible( true );
20 }
21
22 // draw rectangles and Strings in different colors
23 public void paint( Graphics g )
24 {
25 // call superclass's paint method
26 super.paint( g );
27
28 // set new drawing color using integers
29 g.setColor( new Color( 255, 0, 0 ) );
30 g.fillRect( 25, 25, 100, 20 );
31 g.drawString( "Current RGB: " + g.getColor(), 130, 40 );
32
33 // set new drawing color using floats
34 g.setColor( new Color( 0.0f, 1.0f, 0.0f ) );
35 g.fillRect( 25, 50, 100, 20 );
36 g.drawString( "Current RGB: " + g.getColor(), 130, 65 );
// set new drawing color using static Color objects
39 g.setColor( Color.blue );
40 g.fillRect( 25, 75, 100, 20 );
41 g.drawString( "Current RGB: " + g.getColor(), 130, 90 );
42
43 // display individual RGB values
44 Color color = Color.magenta;
45 g.setColor( color );
46 g.fillRect( 25, 100, 100, 20 );
47 g.drawString( "RGB values: " + color.getRed() + ", " +
48 color.getGreen() + ", " + color.getBlue(), 130, 115 );
49 }
50
51 // execute application
52 public static void main( String args[] )
53 {
54 ShowColors application = new ShowColors();
55
56 application.setDefaultCloseOperation(
57 JFrame.EXIT_ON_CLOSE );
58 }
59
60 } // end class ShowColors