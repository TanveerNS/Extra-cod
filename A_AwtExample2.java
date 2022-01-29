import java.awt.*;
class A_AwtExample2 {
	
	A_AwtExample2(){
		Frame f = new Frame();
		Button b1=new Button("Click Me");
		b1.setBounds(30,100,80,30);
		f.add(b1);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(600,400);
		f.setTitle("Awt Gui");
	
	}
	
	public static void main(String[] args){
		A_AwtExample2 obj = new A_AwtExample2();
			
	}
	
}