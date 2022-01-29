import java.awt.*;
class A_AwtExample1 extends Frame{
	
	A_AwtExample1(){
		Button b1=new Button("Click Me");
		b1.setBounds(30,100,80,30);
		add(b1);
		setLayout(null);
	}
	
	public static void main(String[] args){
		A_AwtExample1 obj = new A_AwtExample1();
		obj.setVisible(true);
		obj.setSize(600,400);
		obj.setTitle("Awt Gui");
		
	}
	
}