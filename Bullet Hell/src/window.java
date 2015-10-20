import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//import main.Window.Action1;
//import main.Window.Action2;

public class window
{
	
	public static void create(){
			JFrame window = new JFrame("Game");
			
			 JPanel panel = new JPanel();
			  window.add(panel);
			  JButton button = new JButton("hello agin1");
			  panel.add(button);
			  button.addActionListener (new Action1());

			  JButton button2 = new JButton("hello agin2");
			  panel.add(button2);
			  button2.addActionListener (new Action2()); 
			
			window.addKeyListener(null);
			window.add(panel);
			window.setSize(300, 300);
	        window.setLocationRelativeTo(null);
	        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        window.setVisible(true);
		}
}	

class Abilities implements ActionListener
{

	public void keyPressed(KeyEvent event) {
	    switch (event.getKeyCode()) {
	        case KeyEvent.VK_UP:
	            // up arrow
	            break;
	        case KeyEvent.VK_DOWN:
	            // down arrow
	            break;
	        case KeyEvent.VK_RIGHT:
	            // right arrow
	            break;
	        case KeyEvent.VK_LEFT:
	            // left arrow
	            break;
	    }
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}

class Action1 implements ActionListener 
{        
	  public void actionPerformed (ActionEvent e) 
	  {     
	    JFrame frame2 = new JFrame("Clicked");
	    frame2.setVisible(true);
	    frame2.setSize(200,200);
	    JLabel label = new JLabel("you clicked me");
	    JPanel panel = new JPanel();
	    frame2.add(panel);
	    panel.add(label);       
	  }
}   
class Action2 implements ActionListener 
{        
	  public void actionPerformed (ActionEvent e) 
	  {     
	    JFrame frame3 = new JFrame("OKNO 3");
	    frame3.setVisible(true);
	    frame3.setSize(200,200);

	    JLabel label = new JLabel("kliknales");
	    JPanel panel = new JPanel();
	    frame3.add(panel);
	    panel.add(label);
	  }
}   


