import java.awt.*;
import javax.swing.*;
public class JavaCollectGraph extends Graphs {
	
	public static void main(String[] args){
		JavaCollectGraph obj = new JavaCollectGraph();
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class CollectPanel extends JPanel{
		CollectPanel(){
		setBackground(Color.WHITE);
	}
	public void paintComponent(Graphics g){
		g.setColor(Color.white);
		g.setColor(getBackground());
		g.fillRect(200, 10, 120, 30);
		
		g.fillRect(50, 120, 120, 30);
		g.fillRect(200, 120, 120, 30);
		g.fillRect(350, 120, 120, 30);
		g.fillRect(500, 120, 120, 30);
		
		g.fillRect(50, 200, 120, 30);
		g.fillRect(200, 200, 120, 30);
		g.fillRect(350, 200, 120, 30);
		g.fillRect(500, 200, 120, 30);
		
		g.fillRect(50, 280, 120, 30);
		g.fillRect(200, 280, 120, 30);
		g.fillRect(350, 280, 120, 30);
		g.fillRect(500, 280, 120, 30);
		
		g.fillRect(50, 380, 120, 30);
		g.fillRect(200, 380, 120, 30);
		g.fillRect(350, 380, 120, 30);
		g.fillRect(500, 380, 120, 30);
		
		
		g.setColor(Color.BLACK);
		
		g.drawRect(200, 10, 120, 30);
		 
		g.drawRect(50, 120, 120, 30);
		g.drawRect(200, 120, 120, 30);
		g.drawRect(350, 120, 120, 30);
		g.drawRect(500, 120, 120, 30);
		
		g.drawRect(50, 200, 120, 30);
		g.drawRect(200, 200, 120, 30);
		g.drawRect(350, 200, 120, 30);
		g.drawRect(500, 200, 120, 30);
		
		g.drawRect(50, 280, 120, 30);
		g.drawRect(200, 280, 120, 30);
		g.drawRect(350, 280, 120, 30);
		g.drawRect(500, 280, 120, 30);
		
		g.drawRect(50, 380, 120, 30);
		g.drawRect(200, 380, 120, 30);
		g.drawRect(350, 380, 120, 30);
		g.drawRect(500, 380, 120, 30);
		 
		g.setColor(Color.BLACK);
		g.drawString("Collection", 230, 30);
		
		g.drawString("List", 70, 140);
		g.drawString("Set", 220, 140);
		g.drawString("Queue",370, 140);
		g.drawString("Map", 520, 140);
		
		g.drawString("Array", 70, 220);
		g.drawString("HashSet", 220, 220);
		g.drawString("LinkedList", 370, 220);
		g.drawString("HashMap", 520, 220);
		
		g.drawString("LinkedList", 70, 300);
		g.drawString("LinkedHashSet", 220, 300);
		g.drawString("PriorityQueue", 370, 300);
		g.drawString("Hashtable", 520, 300);
		
		g.drawString("Vector", 50, 400);
		g.drawString("TreeSet", 220, 400);
		g.drawString("Dequeue", 370, 400);
		g.drawString("TreeMap", 520, 400);
	}
}
class Graphs extends JFrame{
	Graphs(){
		setTitle("AWT Components Class");
		setSize(800,600);
		setLocation(10,10);
		
		Container contentPane = getContentPane();
		contentPane.add(new CollectPanel());
	}
}