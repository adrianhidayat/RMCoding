import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class window{
	
	public static void main(String[] args){
			JFrame window = new JFrame("Game");
			
			JPanel panel = new JPanel(new FlowLayout());
			//panel.setLayout(new FlowLayout());
			
			JLabel label = new JLabel("This is a label!");
			
			JButton button = new JButton();
			button.setText("Option 1");
			
			panel.add(label);
			panel.add(button);
			
			window.add(panel);
			window.setSize(300, 300);
	        window.setLocationRelativeTo(null);
	        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        window.setVisible(true);
		}
	
}
