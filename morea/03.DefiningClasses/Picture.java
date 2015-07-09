import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Picture extends JPanel {
	
	public Picture() {
		// TODO
	}
	
	public void paintComponent(Graphics page) {
		// TODO
	}
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Picture using Shapes");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		JPanel panel = new Picture();
		panel.setPreferredSize(new Dimension(500,500));
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}


	
	
}
