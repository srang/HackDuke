import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game_Exec {
	public static void main(String[] args) { 
		JFrame frame = new JFrame("Deal Or No Deal");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}
}
