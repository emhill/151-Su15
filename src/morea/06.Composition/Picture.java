import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Picture extends JPanel {
	
	private Circle sun;
	private Rectangle grass;
	private Rectangle sky;
	
	private static final int WIDTH = 500;
	private static final int HEIGHT = 500;
	
	public Picture() {
		sun = new Circle(50, 50, 25, Color.YELLOW);
		grass = new Rectangle(0, HEIGHT / 2, WIDTH, HEIGHT / 2, Color.GREEN.darker());
		sky = new Rectangle(0, 0, WIDTH, HEIGHT / 2, Color.CYAN);
	}
	
	public void paintComponent(Graphics page) {
		sky.draw(page);
		sun.draw(page);
		grass.draw(page);
	}
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Picture using Shapes");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		JPanel panel = new Picture();
		panel.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}


	
	
}
