//Java AWT MenuItem and Menu Example





1.import java.awt.*;  
2.class MenuExample  
3.{  
4.     MenuExample(){  
5.         Frame f= new Frame("Menu and MenuItem Example");  
6.         MenuBar mb=new MenuBar();  
7.         Menu menu=new Menu("Menu");  
8.         Menu submenu=new Menu("Sub Menu");  
9.         MenuItem i1=new MenuItem("Item 1");  
10.         MenuItem i2=new MenuItem("Item 2");  
11.         MenuItem i3=new MenuItem("Item 3");  
12.         MenuItem i4=new MenuItem("Item 4");  
13.         MenuItem i5=new MenuItem("Item 5");  
14.         menu.add(i1);  
15.         menu.add(i2);  
16.         menu.add(i3);  
17.         submenu.add(i4);  
18.         submenu.add(i5);  
19.         menu.add(submenu);  
20.         mb.add(menu);  
21.         f.setMenuBar(mb);  
22.         f.setSize(400,400);  
23.         f.setLayout(null);  
24.         f.setVisible(true);  
25.}  
26.public static void main(String args[])  
27.{  
28.new MenuExample();  
29.}  
30.}  

