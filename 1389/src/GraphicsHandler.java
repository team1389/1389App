/**
 * 
 */

/**
 * @author evanb
 *
 */

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class GraphicsHandler {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame("Main");
		frame.setSize(500, 780);
		frame.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setSize(500, 780);

		
		frame.add(panel); 
	
		
		JButton matches = new JButton("stuff");
		matches.setVisible(true);
		matches.addActionListener(null);
		
		panel.add(matches);
		frame.setVisible(true);

		JTextField text = new JTextField();
		text.setSize(40, 40);
		text.setVisible(true);

		panel.add(text);
		frame.setVisible(true);
		
	}
	
public class buttons extends GraphicsHandler implements ActionListener {
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	}

}
